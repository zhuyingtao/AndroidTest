package com.example.zyt.androidtest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author mi
 * @date 18-6-13
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private static final String STRING_TO_BE_TYPED = "Boy";

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void sayHello() {
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());
        onView(withText("Button")).perform(click());
        String expectedString = "Hello," + STRING_TO_BE_TYPED + "!";
        onView(withId(R.id.textView)).check(ViewAssertions.matches(withText(expectedString)));
    }
}