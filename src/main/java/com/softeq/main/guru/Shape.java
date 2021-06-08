package com.softeq.main.guru;

public interface Shape {
    public void draw();
    public void move(int x, int y);
    String access(Visitor visitor);

}
