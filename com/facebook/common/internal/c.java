package com.facebook.common.internal.c;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public class c extends FilterOutputStream	// class@00105c
{
    public long b;

    public void c(OutputStream p0){
       super(p0);
       this.b = 0;
    }
    public void close(){
       this.out.close();
    }
    public void write(int p0){
       this.out.write(p0);
       this.b = this.b + 1;
    }
    public void write(byte[] p0,int p1,int p2){
       this.out.write(p0, p1, p2);
       this.b = this.b + (long)p2;
    }
}
