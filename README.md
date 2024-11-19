Purpose of the App

The purpose of this App is to encourage running/ jogging and what better way than to do that with the use of technology. This app will work as a motivator to those who are keen on starting a healthier fitness lifestyle, think of it as a “gym buddy”, users of the app will be able to access their weekly distance ran (in KM’s) by the end of week you can use the calculate average function to see how you performed each week. As time goes by you will be able to see the progress you made as a runner from those weekly average runs which can be stored on your app for later access. 
![Screenshot (1)](https://github.com/user-attachments/assets/ec6a2f86-ee9a-488a-9667-b9ea67fe664f)


Pseudocode:

package com.example.myrunapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    companion object {
        val dateList= mutableListOf<Runner>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_data)

        val tdate=findViewById<EditText>(R.id.dateOfRun)
        val tmorning=findViewById<EditText>(R.id.morningRun)
        val tafternoon=findViewById<EditText>(R.id.afternoonRun)
        val tnotes=findViewById<EditText>(R.id.enterNotes)

        val btnsave=findViewById<Button>(R.id.submitbtn)
        val btnclear=findViewById<Button>(R.id.clearbtn)
        val btnshow=findViewById<Button>(R.id.showData)

        val date=tdate.text.toString()
        val morning=tmorning.text.toString()
        val afternoon=tafternoon.text.toString()
        val notes=tnotes.text.toString()

        if (date.isNotBlank() && morning.isNotBlank() && afternoon.isNotBlank() && notes.isNotBlank())
            dateList.add(Runner(date,morning,afternoon,notes))

        tdate.text.clear()
        tmorning.text.clear()
        tafternoon.text.clear()
        tnotes.text.clear()

        btnshow.setOnClickListener {
            //calling the second screen to show data

            startActivity(Intent(this, DislpayActivity::class.java))


        }


    }
}

InputData.xml

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="14dp">

    <EditText
        android:id="@+id/dateOfRun"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        android:hint="Enter the date here"
        />

    <EditText
        android:id="@+id/morningRun"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Morning Run(km's)"
        android:textSize="22sp"
        />

    <EditText
        android:id="@+id/afternoonRun"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter AfternoonRun(km's)"
        android:textSize="22sp"
        />

    <EditText
        android:id="@+id/enterNotes"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Notes for Run"
        android:textSize="22sp"
        />


    <Button
        android:id="@+id/submitbtn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Save Data"
        android:backgroundTint="@color/orange"
        />

    <Button android:id="@+id/clearbtn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Clear Data"
        android:backgroundTint="@color/orange"
        />
    <Button
        android:id="@+id/showData"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Display Data"
        android:backgroundTint="@color/orange"
        />

</LinearLayout>

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp"
    >

    <TextView
        android:id="@+id/textviewmorningRun"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        />

    <TextView
        android:id="@+id/textviewafternoonRun"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        />

    <TextView
        android:id="@+id/textviewNotes"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Notes for Run"
        android:textSize="22sp"
        />

    <TextView
        android:id="@+id/textviewdateOfRun"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="22sp"
        android:hint="Enter the date here"
        />


</LinearLayout>
