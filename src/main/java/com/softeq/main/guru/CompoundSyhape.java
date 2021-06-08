package com.softeq.main.guru;

import java.util.ArrayList;
import java.util.List;

public class CompoundSyhape implements Shape{
    private int  id;
    public List<Shape> list = new ArrayList<>();

    public CompoundSyhape() {
    }

    public CompoundSyhape(int id) {
        this.id = id;
    }

    public CompoundSyhape(int id, List<Shape> list) {
        this.id = id;
        this.list = list;
    }


    @Override
    public void draw() {

    }

    @Override
    public void move(int x, int y) {
    }

    @Override
    public String access(Visitor visitor) {
        return visitor.visitComponeShape(this);
    }

    public void addElements(Shape shape) {
        this.list.add(shape);
    }


    public int getId() {
        return id;
    }

    public List<Shape> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "CompoundSyhape{" +
            "id=" + id +
            ", list=" + list +
            '}';
    }
}
