package edu.progress.files.and.folders;

public class File extends FileSystemObject{
    int size;

    public File(String name, int size){
        super(name);
        this.size = size;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public File copy() {
        return new File(this.getName(), this.getSize());
    }
}
