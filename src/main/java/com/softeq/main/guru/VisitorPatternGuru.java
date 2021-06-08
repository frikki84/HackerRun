package com.softeq.main.guru;

public class VisitorPatternGuru {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Dot dot2 = new Dot(2, 25, 112);

        CompoundSyhape compoundShape = new CompoundSyhape(2);
        compoundShape.addElements(dot);
        compoundShape.addElements(dot2);
        export(dot, compoundShape);

    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}