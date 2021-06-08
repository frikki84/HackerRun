package com.softeq.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagAnalyes {
    public static void main(String[] args) {
        final String str = "<tag>apple</tag><b>hello</b><tag>orange</tag><tag><h1>pear</h1></tag>";
        System.out.println(Arrays.toString(getTagValues(str).toArray())); // Prints [apple, orange, pear]
    }

    //private static final Pattern TAG_REGEX = Pattern.compile("<\\b(\\w+)(?:\\W+\\1\\b)+>(.+?)</\\b(\\w+)(?:\\W+\\1\\b)+>", Pattern.DOTALL);
    private static final Pattern TAG_REGEX = Pattern.compile("<(.+)>([^<]+)</\\1>", Pattern.DOTALL);

    private static List<String> getTagValues(final String str) {
        final List<String> tagValues = new ArrayList<String>();
        final Matcher matcher = TAG_REGEX.matcher(str);
        while (matcher.find()) {
            tagValues.add(matcher.group(1));
        }
        return tagValues;
    }
}
