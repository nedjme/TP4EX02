package com.example.tp4exo2
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView




class Bookshelf : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.activity_bookshelf, container, false)
        var bool = arguments?.getBoolean("tablet")
        var c = R.id.contaner
        if (bool == false){
             c = R.id.contaner
        }else if (bool == true ){
             c = R.id.c2
        }
        val book1 = v.findViewById<View>(R.id.book1) as ImageView
        val book2 = v.findViewById<View>(R.id.book2) as ImageView
        val book3 = v.findViewById<View>(R.id.book3) as ImageView
        val book4 = v.findViewById<View>(R.id.book4) as ImageView

        book1.setOnClickListener {
            val fragment = Details.newInstance(
                "Algorithms to Live By: The Computer Science of Human Decisions",
                "Brian Christian",
                R.drawable.writer1,
                "A fascinating exploration of how computer algorithms can be applied to our everyday lives." +
                        "In this dazzlingly interdisciplinary work, acclaimed author Brian Christian and cognitive scientist Tom Griffiths show us how the simple" +
                        ", precise algorithms used by computers can also untangle very human questions."
            )

            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }


        book2.setOnClickListener {
            val fragment = Details.newInstance(
                "Reclaiming Conversation: The Power of Talk in a Digital Age",
                "Sherry Turkle",
                R.drawable.writer2,
                "Renowned media scholar Sherry Turkle investigates how a flight from conversation undermines our relationships, " +
                        "creativity, and productivity--and why reclaiming face-to-face conversation can help us regain lost ground.We live in a technological universe in which we are always communicating. "   )
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        book3.setOnClickListener {
            val fragment = Details.newInstance(
                "The Most Human Human: What Talking with Computers Teaches Us About What It Means to Be Alive",
                "Brian Christian",
                R.drawable.writer1,
                "The Most Human Human is a provocative, exuberant, and profound exploration of the ways in which computers are reshaping our ideas of what it means to be human. " +
                        " Its starting point is the annual Turing Test, which pits artificial intelligence programs against people to determine if computers can “think.”"       )
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        book4.setOnClickListener {
            val fragment = Details.newInstance(
                "Alone Together",
                "Sherry Turkle",
                R.drawable.writer2,
                "In Alone Together, MIT technology and society professor Sherry Turkle explores the power of our new tools and toys to. " +
                        " Developing technology promises closeness. Sometimes it delivers, but much of our modern life leaves us less connected with people and more connected to simulations of them. "
            )
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(c, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        return v
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //you can set the title for your toolbar here for different fragments different titles
        activity!!.title = "Bookshelf"
    }

    companion object {

        @JvmStatic
        fun newInstance(isTablet:Boolean) = Bookshelf().apply {
            arguments = Bundle().apply {
                putBoolean("tablet",isTablet)
            }
        }
    }


}
