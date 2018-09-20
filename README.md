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

