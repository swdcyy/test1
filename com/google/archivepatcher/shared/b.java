package com.google.archivepatcher.shared.b;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public class b extends FilterOutputStream	// class@001703
{
    public long b;

    public void b(OutputStream p0){
       super(p0);
       this.b = 0;
    }
    public long a(){
       return this.b;
    }
    public void write(int p0){
       this.b = this.b + 1;
       this.out.write(p0);
    }
    public void write(byte[] p0){
       this.b = this.b + (long)p0.length;
       this.out.write(p0);
    }
    public void write(byte[] p0,int p1,int p2){
       this.b = this.b + (long)p2;
       this.out.write(p0, p1, p2);
    }
}
