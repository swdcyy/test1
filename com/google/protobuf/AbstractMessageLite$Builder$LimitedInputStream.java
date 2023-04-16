package com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.lang.Math;

public final class AbstractMessageLite$Builder$LimitedInputStream extends FilterInputStream	// class@0003a1
{
    public int limit;

    public void AbstractMessageLite$Builder$LimitedInputStream(InputStream p0,int p1){
       super(p0);
       this.limit = p1;
    }
    public int available(){
       return Math.min(super.available(), this.limit);
    }
    public int read(){
       if (this.limit <= null) {
          return -1;
       }
       int i = super.read();
       if (i >= 0) {
          this.limit = this.limit - 1;
       }
       return i;
    }
    public int read(byte[] p0,int p1,int p2){
       AbstractMessageLite$Builder$LimitedInputStream tlimit = this.limit;
       if (tlimit <= null) {
          return -1;
       }
       int i = super.read(p0, p1, Math.min(p2, tlimit));
       if (i >= 0) {
          this.limit = this.limit - i;
       }
       return i;
    }
    public long skip(long p0){
       p0 = super.skip(Math.min(p0, (long)this.limit));
       if (p0 - null >= 0) {
          this.limit = (int)((long)this.limit - p0);
       }
       return p0;
    }
}
