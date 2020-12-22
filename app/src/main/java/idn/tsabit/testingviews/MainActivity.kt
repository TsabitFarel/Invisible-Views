package idn.tsabit.testingviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var button: Button
    private lateinit var buttonUndo: Button
    private lateinit var textView: TextView
    private lateinit var textViewWhy: TextView
    private lateinit var textViewIdk: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.btnChange)
        buttonUndo = findViewById(R.id.btnUndo)
        textView = findViewById(R.id.txtTroll)
        textViewWhy = findViewById(R.id.txtWhy)
        textViewIdk = findViewById(R.id.txtIdk)

        button.setOnClickListener {
            changeImage()
        }

        buttonUndo.setOnClickListener {
            undo()
        }
    }

    private fun changeImage() {
        imageView.setImageResource(R.drawable.troll)
        textView.visibility = View.VISIBLE
        button.visibility = View.INVISIBLE
        buttonUndo.visibility = View.VISIBLE
    }

    private fun undo() {
        imageView.setImageResource(R.drawable.flask)
        textViewWhy.visibility = View.VISIBLE
        textView.visibility = View.INVISIBLE
        button.visibility = View.INVISIBLE
        buttonUndo.visibility = View.INVISIBLE
        textViewIdk.visibility = View.VISIBLE
    }
}