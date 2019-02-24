package edu.progress.files.and.folders;

import java.util.ArrayList;

public class Folder extends FileSystemObject{

    ArrayList<FileSystemObject> fileSysObjects = new ArrayList<FileSystemObject>();

    //FileSystemObject [] fileSystemObjects;
    public Folder(String name){
        super(name);
    }

    public Folder(Folder f){
        // f.name = this.name;
        super(f.getName());

        //ArrayList<FileSystemObject> list = new ArrayList<FileSystemObject>();
        for (FileSystemObject fi : f.fileSysObjects) {
            fileSysObjects.add(fi.copy());
        }
       // this.fileSysObjects=list;


    }


    @Override
    int getSize() {
        int totalSize = 0;
        for(FileSystemObject fso : fileSysObjects){
            totalSize+=fso.getSize();
        }
        return totalSize;
    }

    @Override
    public Folder copy() {
        Folder f = new Folder(this.getName());
        for (FileSystemObject fi : fileSysObjects) {
            f.add(fi.copy());
        }
        return f;
    }



    void add(FileSystemObject fso){
//        if(fso.getName().equals(fileSysObjects.contains(FileSystemObject)))fileSysObjects.add(fso);

//        if(fileSysObjects.contains(fso.getName())){
        for (FileSystemObject f : fileSysObjects){
            if (f.getName().equals(fso.getName())) {
                System.out.println("Name already exists");
                return;
            }
        }
        fileSysObjects.add(fso);
    }



}




