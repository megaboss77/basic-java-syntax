package com.ibm;

public class Main {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        String s3 = s1.substring(4);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }

    public void someShit() {
        // write your code here
        String text = "aabbc";
        for (int i = 0; i < text.length() - 1; i++) {
            String thePreviousOne = "";
            if (i > 0) {
                thePreviousOne = text.substring(i - 1, i);
            }
            String theOne = text.substring(i, i + 1);
            String theNextOne = text.substring(i + 1, i + 2);
            if (i == 0 && !theOne.equals(theNextOne)) {
                System.out.println(theOne);
                break;
            }
            if (!thePreviousOne.equals(theOne) && !theOne.equals(theNextOne)) {
                System.out.println(theOne);
                break;
            }
            if (i == text.length() - 2)
                System.out.println(theNextOne);
        }
    }
}
