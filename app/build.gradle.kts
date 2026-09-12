plugins {
    id("com.android.application")
}

android {
    namespace = "com.sanssimulator.sansfight"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sanssimulator.sansfight"
        minSdk = 23
        targetSdk = 35

        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }

    sourceSets {
        getByName("main") {
            assets.srcDirs("src/main/assets")
        }
    }
}
