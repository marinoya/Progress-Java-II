package edu.progress.files.and.folders;

public class Main {

    public static void main(String[] args) {

        Folder abc = new Folder("abc");
        File newFile = new File("newFile", 4);
        abc.add(newFile);
        Folder def = new Folder("def");
        abc.add(def);
        def.add(newFile);
        def.add(newFile);


    }
}
