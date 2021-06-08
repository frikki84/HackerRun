package com.softeq.main.guru;

public class XMLExportVisitor implements Visitor{
   public String export(Shape ... shapes) {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
       for (Shape shape : shapes) {
           stringBuilder.append(shape.access(this)).append("\n");
       }

       return stringBuilder.toString();
   }

    @Override
    public String visitDot(Dot d) {
        return "<dot>" + "\n" +
            "    <id>" + d.getId() + "</id>" + "\n" +
            "    <x>" + d.getX() + "</x>" + "\n" +
            "    <y>" + d.getY() + "</y>" + "\n" +
            "</dot>";
    }

    @Override
    public String visitComponeShape(CompoundSyhape cg) {
        return "<compound_graphic>" + "\n" +
            "   <id>" + cg.getId() + "</id>" + "\n" +
            visitCompoundGraphic(cg) +
            "</compound_graphic>";
    }

    private String visitCompoundGraphic(CompoundSyhape cg) {
       StringBuilder stringBuilder = new StringBuilder();
       for (Shape shape : cg.getList()) {
           String obj = shape.access(this);
           obj = "    " + obj.replace("\n", "\n    ") + "\n";
           stringBuilder.append(obj);
       }
       return stringBuilder.toString();
    }
}
