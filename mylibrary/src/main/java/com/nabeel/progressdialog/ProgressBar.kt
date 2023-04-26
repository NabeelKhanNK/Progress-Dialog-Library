package com.nabeel.progressdialog

import android.app.ProgressDialog
import android.content.Context

class ProgressBar {

    lateinit var progressDialog: ProgressDialog

    fun showDialog(context: Context){
        progressDialog = ProgressDialog(context)
        progressDialog.show()
        progressDialog.setContentView(R.layout.show_dialog)
        progressDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        progressDialog.setCancelable(false)
    }

    fun hideDialog(){
        progressDialog.dismiss()
    }
}