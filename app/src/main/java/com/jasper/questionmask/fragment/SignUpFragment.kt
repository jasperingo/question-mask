package com.jasper.questionmask.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout
import com.jasper.questionmask.R


class SignUpFragment : Fragment(), View.OnClickListener {

    private lateinit var firstNameTextInput: TextInputLayout

    private lateinit var lastNameTextInput: TextInputLayout

    private lateinit var emailTextInput: TextInputLayout

    private lateinit var pinTextInput: TextInputLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        firstNameTextInput = view.findViewById(R.id.first_name_input)

        lastNameTextInput = view.findViewById(R.id.last_name_input)

        emailTextInput = view.findViewById(R.id.email_input)

        pinTextInput = view.findViewById(R.id.pin_input)

        val submitButton = view.findViewById<MaterialButton>(R.id.submit_button)

        submitButton.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        val firstName = firstNameTextInput.editText?.text.toString()

        val lastName = lastNameTextInput.editText?.text.toString()

        val email = emailTextInput.editText?.text.toString()

        val pin = pinTextInput.editText?.text.toString()

        Log.i("DATA: ", "$firstName, $lastName, $email, $pin")

    }


}
