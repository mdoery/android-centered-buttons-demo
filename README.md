## Centered Button Demo ##

A client is looking for a custom row of circular buttons. The right-most button has text embedded below it, within the graphic image. The left-most button is similar, but has some text embedded below it.

The client wants the row of buttons to show up in a row in the Android app, all lined up nicely, so that the centers of each button image are aligned. The text of the left and right buttons will be offset above or below the row of buttons.

The best way to do this is by creating the button images so that they all have the same height. This project demonstrates how that's done, and what the finished product looks like.

### wrong view ###

This is what the "wrong" view looks like. Buttons are outlined, so you can see that they don't have the exact same height. Notice that the outer buttons are not lined up with the inner two buttons along a line through their centers.

![buttons not centered](https://raw.githubusercontent.com/mdoery/android-centered-buttons-demo/master/wrong-buttons-not-centered.png)


### right view ###

Again the buttons are outlined below. You can see they have the same height. The buttons were created by adding each of the four flower images to a single canvas with a transparent background in Gimp (a graphics tool), making sure they were lined up along their center points. Then, a rectangle was sliced around the entire set of buttons, cropping as tightly as possible so to avoid excessive space being taken up by any individual button. Then, each image was sliced out from rectangle - keeping their heights all the same.

![buttons are centered](https://raw.githubusercontent.com/mdoery/android-centered-buttons-demo/master/right-buttons-centered.png)

You can [read about this project at my blog](http://mdoery.com/blog/2018/09/20/centered-radio-buttons-android/), too.

### new! constraint view ###

It's often the case that there is more than one way to do something in Android.

It turns out that you can also solve the problem of misaligned buttons by using [Android's ConstraintLayout](https://developer.android.com/training/constraint-layout/). In this case, the buttons did not have to be updated in anyway. Instead, the layout handles this. However, it's a trickier layout, which is a drawback. It takes longer to set up correctly, and it may be more of a maintenance headache.

The code to produce this type of layout has been incorporated into the demo app, as well.

### screenshots ###

I took screenshots from the app on a Samsung Galaxy S7 device, so that they can be easily compared. I touched up the screenshots by drawing a thing white rectangle around the row of buttons, making it easier to see the misalignment.

Here, the buttons are misaligned. This shows the problem that we are trying to correct:
![buttons are wrong](https://raw.githubusercontent.com/mdoery/android-centered-buttons-demo/master/wrong-layout-screenshot.jpg)

Here, the buttons are centered correctly by adding padding to some of the buttons:
![buttons are centered](https://raw.githubusercontent.com/mdoery/android-centered-buttons-demo/master/right-layout-screenshot.jpg)

In this screenshot, the buttons are centered correctly by using a ``ConstraintLayout``:
![buttons are centered using ConstraintLayout](https://raw.githubusercontent.com/mdoery/android-centered-buttons-demo/master/constraint-layout-screenshot.jpg)

Thanks to [inky2010](https://openclipart.org/user-cliparts/inky2010?page=7) for making the flower images available in the public domain!