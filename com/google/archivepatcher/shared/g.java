package com.google.archivepatcher.shared.g;
import java.io.InputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Math;
import java.io.IOException;

public class g extends InputStream	// class@001708
{
    public final RandomAccessFile b;
    public long c;
    public long d;
    public long e;
    public final long f;

    public void g(File p0){
       super();
       this.c = -1;
       this.b = new RandomAccessFile(p0, "r");
       this.f = p0.length();
       this.a(0, p0.length());
    }
    public void a(long p0,long p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("rangeOffset must be >= 0");
       }
       if (p1 < 0) {
          throw new IllegalArgumentException("rangeLength must be >= 0");
       }
       long l = p0 + p1;
       if (l - this.f > 0) {
          throw new IllegalArgumentException("Read range exceeds file length");
       }
       if (l < 0) {
          throw new IllegalArgumentException("Insane input size not supported");
       }
       this.d = p0;
       this.e = p1;
       this.c = p0;
       this.reset();
       this.c = -1;
       return;
    }
    public int available(){
       long l = this.e - (this.b.getFilePointer() - this.d);
       if (l - 0x7fffffff > 0) {
          return Integer.MAX_VALUE;
       }
       return (int)l;
    }
    public void close(){
       this.b.close();
    }
    public void mark(int p0){
       try{
          this.c = this.b.getFilePointer();
          return;
       }catch(java.io.IOException e3){
          throw new RuntimeException(e3);
       }
    }
    public boolean markSupported(){
       return true;
    }
    public int read(){
       if (this.available() <= 0) {
          return -1;
       }
       return this.b.read();
    }
    public int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public int read(byte[] p0,int p1,int p2){
       if (p2 <= 0) {
          return 0;
       }
       int i = this.available();
       if (i <= 0) {
          return -1;
       }
       return this.b.read(p0, p1, Math.min(p2, i));
    }
    public void reset(){
       g tc = this.c;
       if (tc - null < 0) {
          throw new IOException("mark not set");
       }
       this.b.seek(tc);
       return;
    }
    public long skip(long p0){
       long l = 0;
       if (p0 - l <= 0) {
          return l;
       }
       int i = this.available();
       if (i <= 0) {
          return l;
       }
       g tb = this.b;
       long l1 = (long)(int)Math.min((long)i, p0);
       tb.seek((tb.getFilePointer() + l1));
       return l1;
    }
}
