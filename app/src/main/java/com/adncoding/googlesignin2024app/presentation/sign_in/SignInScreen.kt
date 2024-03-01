package com.adncoding.googlesignin2024app.presentation.sign_in

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by AidenChang 2024/03/01
 */
@Composable
fun SignInScreen(
    state: SignInState,
    onSignInClick: () -> Unit
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let { error ->
            Toast.makeText(context, error, Toast.LENGTH_LONG).show()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onSignInClick
        ) {
            Text(text = "Sign in")
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    SignInScreen(
        state = SignInState(
            isSignInSuccessful = false,
            signInError = null
        ),
        onSignInClick = {}
    )
}