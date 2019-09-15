package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu?.findItem(R.id.menu_item2)?.setEnabled(false)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.menu_item1 -> {Toast.makeText(this, "menu_item1", Toast.LENGTH_SHORT).show()}
            R.id.menu_item2 -> {Toast.makeText(this, "menu_item2", Toast.LENGTH_SHORT).show()}
            R.id.menu_item3 -> {Toast.makeText(this, "menu_item3", Toast.LENGTH_SHORT).show()}
        }
        return super.onOptionsItemSelected(item)
    }
}
