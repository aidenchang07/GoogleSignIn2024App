package com.adncoding.googlesignin2024app.presentation.sign_in

/**
 * Created by AidenChang 2024/02/29
 */
data class SignInResult(
    val data: UserData?,
    val errorMessage: String?
)

data class UserData(
    val userId: String,
    val username: String?,
    val profilePictureUrl: String?
)