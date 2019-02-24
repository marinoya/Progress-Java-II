package edu.progress.files.and.folders;

public abstract class FileSystemObject {
    String name;

    public FileSystemObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract int getSize();
    public abstract FileSystemObject copy();
}
