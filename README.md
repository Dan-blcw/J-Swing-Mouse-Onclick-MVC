# Java Swing Gui Mouse Onclick MVC
## The purpose
- this is a microcosm of the MVC pattern and for this demo I simply describe how to configure and handle tasks using ActionListener
- By implementing two interfaces MouseListener and MouseMotionListener through Controller_mouse we will receive mouse events from the user side and go through the Controller_mouse flow to the View and return the user feedback.
## Note  (｡◝‿◜｡)ノ
#### That the mouse not shown here because I use computer screen capture so it is not displayed, but basically this test is just to describe the flow of the MVC model, how we handle conflicts and actionlistener like just how. It is quite simple for beginners to learn about the MVC pattern. If you are new, read it
## Function
- Display the position of the mouse on the bounded area(X,Y)
- Count number of Onclicks and display
- check if the mouse is inside the component and return the response as text
## Prerequisites
- JDK 19
## Summary chart
```
- src
      - AreaView.java
      - Controller_mouse.java
      - MouseArea.java
      - mouseExampleModel.java
      - mouseExampleView.java
      - test.java   -> Run
```
## Demo
#### initial
![image](https://user-images.githubusercontent.com/127305381/229908708-d9e44c30-2a47-47a5-971e-c440dff29f85.png)
#### Mouse is in coverage
![image](https://user-images.githubusercontent.com/127305381/229909397-edcb7e86-dee8-41bf-9334-65f169ac35af.png)
#### It's not in the coverage area
![image](https://user-images.githubusercontent.com/127305381/229909640-b10b6938-0c8d-4191-82c1-0dd94c6b25e7.png)
## Final
Okay,that is all and i'm Dan
