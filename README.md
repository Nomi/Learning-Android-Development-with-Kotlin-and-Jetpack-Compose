# Learning Android development using Kotlin and Jetpack Compose in various projects.
 At least for the intial period, this course will follow **Google's *[Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course)* course**.

**Some additional resources for learning:**
- https://developer.android.com
- [Google's "Material Design" Resources](https://material.io/) --- ***\[IMPORTANT\] Useful for all kinds of design (web, mobile, etc.). Contains all kinds of resources (docs, tutorials, etc).***
- [Jetpack Compose Docs](https://developer.android.com/develop/ui/compose/documentation) --- ***\[IMPORTANT\] Docs are always important..***
- [Android API Reference / Docs](https://developer.android.com/reference) --- ***\[IMPORTANT\] Docs are always important..***
- [Kotlin Docs](https://kotlinlang.org/docs/home.html) --- ***\[IMPORTANT\] Contains various useful things like tutorials and sample projects for various usecases of Kotlin (make sure to read through the "Kotlin Overview" section at least once) and more.***
- [Google's documentation for developing Android apps with Kotlin](https://developer.android.com/kotlin/get-started) --- ***\[IMPORTANT\] Courses and such for getting started. Check them out at least once.***
- [Developing cross-platform mobile applications, see Get started with Kotlin Multiplatform for Android and iOS](https://www.jetbrains.com/help/kotlin-multiplatform-dev/multiplatform-getting-started.html) --- Might want to check it out at least once.
- [KotlinAndroid.com - a website that covers topics related to Kotlin programming, and building Android applications using Kotlin.](https://kotlinandroid.org/)

### ★ Note: particularly noteworthy, important, or impresssive project titles will be prefixed with a "★" in this README.md file.
e.g. **" 117. MasterChief"** with the markdown looking somewhat like `#### ★ 117. MasterChief`.

Just by the way, I'm leaving alternative versions of the star here that might be useful for future or perhaps one of these might replace the current one (though that is also included in the list):

`★, ☆, ✬, ✫, ✭, ✯, ✰, ✵, ⯪, ⯫, ⯩, ⯨, ⚝, ⭐, 🌟, ✨, 🌠, 𓇻`

Here's how they look outside of the code block (witih bold font style):

**★, ☆, ✬, ✫, ✭, ✯, ✰, ✵, ⯪, ⯫, ⯩, ⯨, ⚝, ⭐, 🌟, ✨, 🌠, 𓇻**.

# Course: Android Basics with Compose
Projects ordered from newest to oldest.

## Unit 1: Your first Android app

### Build a Basic Layout
#### 6. BusinessCard
Create an app that serves as a business card.
<details>
  <summary>Important Learnings/Notes:</summary>

 This is a comment from the code of this program.
  ```Kotlin
 /*
 // This also made me finally FULLY understand why we only give modifier to the FIRST element (/container)
 // because we provide what's inside the component as a pre-built and styled unit, and
 // the modifier provided to it is only used to set things like how our component should interact
 // or displayed with the outside. E.g. padding, transparency (alpha), etc.
 // So, I checked, and I was right:
 // https://stackoverflow.com/questions/75653402/jetpack-compose-should-modifier-parameter-be-applied-to-the-outer-top-most-v
 // Relevant answers from the above link;
         //https://stackoverflow.com/a/75653813
         //https://stackoverflow.com/a/75658660
 // https://developer.android.com/develop/ui/compose/modifiers#extracting_and_reusing_scoped_modifiers
  */
 ```
</details>

<img src="https://github.com/Nomi/Learning-Android-Development-with-Kotlin-and-Jetpack-Compose/blob/main/.screenshots_AppPreviews/.screenshots.Course--Android-Basic-with-Compose/6-BusinessCard/thumbnail_businesscard.jpg" height="480">

#### 5. ComposeQuadrant
<img src="https://github.com/Nomi/Learning-Android-Development-with-Kotlin-and-Jetpack-Compose/blob/main/.screenshots_AppPreviews/.screenshots.Course--Android-Basic-with-Compose/5-ComposeQuadrant/thumbnail_composequadrant.jpg" height="480">

#### 4. TaskManager
#### 3. ComposeArticle
#### 2. Happy Birthday (Birthday Card app)

Create a Birthday Card app. (based on Google's Android Basics with Compose course with a lot of my own modifications)

| Minimal | Fancy |
|:---:|:---:|
| <img src="https://github.com/Nomi/Learning-Android-Development-with-Kotlin-and-Jetpack-Compose/blob/main/.screenshots_AppPreviews/.screenshots.Course--Android-Basic-with-Compose/2-HappyBirthday/HappyBirthdayPlain_DarkMode.jpg" height="480"> | <img src="https://github.com/Nomi/Learning-Android-Development-with-Kotlin-and-Jetpack-Compose/blob/main/.screenshots_AppPreviews/.screenshots.Course--Android-Basic-with-Compose/2-HappyBirthday/thumbnail_HappyBirthdayImage_DarkMode.jpg" height="480"> |

### Setup Android Studio
#### 1. GreetingCard

Extremely simple app (from Google's Android Basics with Compose course) that displays text alongside some minor changes (like containers and colors). 
