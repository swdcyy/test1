package com.google.archivepatcher.shared.h;
import java.io.OutputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.String;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class h extends OutputStream	// class@001709
{
    public final RandomAccessFile b;

    public void h(File p0,long p1){
       super();
       RandomAccessFile randomAccess = new RandomAccessFile(p0, "rw");
       this.b = randomAccess;
       if (p1 >= 0) {
          randomAccess.setLength(p1);
          if (randomAccess.length() - p1) {
             throw new IOException("Unable to set the file size");
          }
       }
       return;
    }
    public void close(){
       this.flush();
       this.b.close();
    }
    public void flush(){
       this.b.getChannel().force(true);
    }
    public void write(int p0){
       this.b.write(p0);
    }
    public void write(byte[] p0){
       this.write(p0, 0, p0.length);
    }
    public void write(byte[] p0,int p1,int p2){
       this.b.write(p0, p1, p2);
    }
}
