package com.google.archivepatcher.applier.c;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Math;

public class c extends FilterInputStream	// class@0016fa
{
    public long b;
    public byte[] c;

    public void c(InputStream p0,long p1){
       super(p0);
       byte[] uobyteArray = new byte[1];
       this.c = uobyteArray;
       if (p1 - null < 0) {
          throw new IllegalArgumentException("numToRead must be >= 0: "+p1);
       }
       this.b = p1;
       return;
    }
    public int read(){
       if (this.read(this.c, 0, 1) == 1) {
          return this.c[0];
       }
       return -1;
    }
    public int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public int read(byte[] p0,int p1,int p2){
       c tb = this.b;
       if (!tb) {
          return -1;
       }
       int i = this.in.read(p0, p1, (int)Math.min((long)p2, tb));
       if (i > 0) {
          this.b = this.b - (long)i;
       }
       return i;
    }
}
