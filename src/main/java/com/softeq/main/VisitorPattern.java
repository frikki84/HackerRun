package com.softeq.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {
    //значение, расположенное в узле
    private int value;
    //цвет узла
    private Color color;
    //глубина - это количство ребер между узлом и корнем дерева (глубина корня = 0, глубина каждого потомка узла
    // равна глубина узла + 1
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    //Реализуйте логику, отвечающую за посещение нелистовых узлов дерева,
    // чтобы метод getResult возвращал правильный результат для посетителя реализующего класса.
    public abstract void visitNode(TreeNode node);

    //Реализуйте логику, отвечающую за посещение листовых узлов дерева,
    // так чтобы метод getResult возвращал правильный результат для посетителя реализующего класса.
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    //вернуть сумму, находящуюся на листьях
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    //произведение значений, хранящихся во всех красных узлах, включая листья, вычисленное по модулю 10^9 +7.
    // Обратите внимание, что произведение нулевых значений равно 1.
    public int getResult() {
        //implement this
        return 1;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class FancyVisitor extends TreeVis {
    //должна возвращать абсолютную разницу между суммой значений, хранящихся в нелистовых узлах дерева на одинаковой глубине,
    // и суммой значений, хранящихся в зеленых листовых узлах дерева. Напомним, что ноль - четное число.
    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

public class VisitorPattern {

    public static Tree solve() {
        Scanner scanner = new Scanner(System.in);
        int nodeNumber = scanner.nextInt();
        List<Integer> nodeValues = new ArrayList<>();
        for (int i = 0; i < nodeNumber; i++) {
            nodeValues.add(scanner.nextInt());
        }
        List<Integer> colorValues = new ArrayList<>();
        for (int i = 0; i < nodeNumber; i++) {
            colorValues.add(scanner.nextInt());
        }

        List<Color> colors = new ArrayList<>();
        for (Integer color : colorValues) {
            if (color == 1) {
                colors.add(Color.GREEN);
            } else {
                colors.add(Color.RED);
            }
        }

        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        HashMap<Integer, HashMap<Integer, Integer>> edgeMap = new HashMap<>();
        TreeNode root = new TreeNode(nodeValues.get(0), colors.get(0), 0);

        for (int i = 1; i < nodeNumber; i++) {
            int depthCount = 1;

        }


        return null;
    }

    public static List<Integer> createValuesArray(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        return list;

    }

    public static Integer findNodeNumber(List<Integer>list) {
        return list.get(0);
    }

    public static List<Integer> findValues(List<Integer>list) {
        Integer nodeNumber = findNodeNumber(list);
        List<Integer> values = new ArrayList<>();
        for(int i = 1; i <= nodeNumber; i ++) {
            values.add(list.get(i));
        }
        return values;
    }

    public static List<Color> findColorList(List<Integer> list) {
        Integer nodeNumber = findNodeNumber(list);
        List<Integer> colorNumbers = new ArrayList<>();
        for (int i = nodeNumber + 1; i <= nodeNumber*2; i ++) {
            colorNumbers.add(list.get(i));
        }
        List<Color> colors = new ArrayList<>();

        for (Integer color : colorNumbers) {
            if (color == 1) {
                colors.add(Color.GREEN);
            } else {
                colors.add(Color.RED);
            }
        }

        return colors;
    }

    public static HashMap<Integer, List<Integer>> findEdgesMap(List<Integer> list) {
        Integer nodeNumber = findNodeNumber(list);
        List<Integer> edgeIntegerList = new ArrayList<>();
        for(int i = nodeNumber*2+1; i < list.size(); i ++) {
            edgeIntegerList.add(list.get(i));
        }

        System.out.println("edgeIntegerList " + edgeIntegerList);

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> value = new ArrayList<>();
        value.add(edgeIntegerList.get(1));
        map.put(edgeIntegerList.get(0), value);

        for (int i = 2; i < edgeIntegerList.size(); i += 2) {
            System.out.println(i + "--- " + edgeIntegerList.get(i));

            if (map.containsKey(edgeIntegerList.get(i))) {
                map.get(edgeIntegerList.get(i)).add(edgeIntegerList.get(i+1));
            } else {
                List<Integer> val= new ArrayList<>();
                value.add(edgeIntegerList.get(i+1));
                map.put(edgeIntegerList.get(i), val);
            }
        }
        return map;
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

