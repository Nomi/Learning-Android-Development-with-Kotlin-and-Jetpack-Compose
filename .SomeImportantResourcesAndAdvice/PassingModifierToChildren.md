### Moral of the story? (stating in advance)
Pass the modifier only to the highest level composable/component that makes sense/is possible inside a Composable function.

### Context
This is a comment from 6-BusinessCard. 
The exact file where this comment was made and originally exists is:
Course--Android-Basic-with-Compose\6-BusinessCard\app\src\main\java\com\example\businesscard\MainActivity.kt


### Here is the actual comment itself:
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