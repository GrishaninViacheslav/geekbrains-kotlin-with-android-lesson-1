package GeekBrians.Slava_5655380

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var isShowingOriginDataClass = true
        var dataClass: DataClass? = null
        // 4. Добавить кнопку в разметку и повесить на неё clickListener в Activity.
        findViewById<Button>(R.id.button).setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                Log.d("[CONSOLE LOG]", "click")
                if(isShowingOriginDataClass){
                    // 5.a cоздайте data class с двумя свойствами, выведите их на экран приложения;
                    dataClass = DataClass("hello", "world!")
                    Toast.makeText(applicationContext, "${dataClass!!.greetings} ${dataClass!!.name}", Toast.LENGTH_LONG).show()
                    isShowingOriginDataClass = false
                }
                else{
                    // 5.b создайте Object, в Object вызывайте copy и выводите значения скопированного класса на экран;
                    val anotherDataClass = dataClass!!.copy(name = "John!")
                    Toast.makeText(applicationContext, "${anotherDataClass.greetings} ${anotherDataClass.name}", Toast.LENGTH_LONG).show()
                    isShowingOriginDataClass = true
                }
                // 5.c выводите значения из разных циклов в консоль, используя примеры из методических материалов.
                for(i in 10 downTo 1 step 2){
                    Log.d("[CONSOLE LOG]", i.toString())
                }
                val array =  arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                for(el in array){
                    Log.d("[CONSOLE LOG]", el.toString())
                }
                for(i in 0 until array.size){
                    Log.d("[CONSOLE LOG]", array[i].toString())
                }
            }
        })
    }
}