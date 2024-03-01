package com.adncoding.googlesignin2024app.presentation.sign_in

/**
 * Created by AidenChang 2024/02/29
 */
data class SignInState(
    val isSignInSuccessful: Boolean = false,
    val signInError: String? = null
)
