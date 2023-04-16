package com.google.protobuf.AllocatedBuffer$2;
import com.google.protobuf.AllocatedBuffer;
import java.nio.ByteBuffer;
import java.lang.UnsupportedOperationException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class AllocatedBuffer$2 extends AllocatedBuffer	// class@0003a8
{
    public int position;
    public final byte[] val$bytes;
    public final int val$length;
    public final int val$offset;

    public void AllocatedBuffer$2(byte[] p0,int p1,int p2){
       this.val$bytes = p0;
       this.val$offset = p1;
       this.val$length = p2;
       super();
    }
    public byte[] array(){
       return this.val$bytes;
    }
    public int arrayOffset(){
       return this.val$offset;
    }
    public boolean hasArray(){
       return true;
    }
    public boolean hasNioBuffer(){
       return false;
    }
    public int limit(){
       return this.val$length;
    }
    public ByteBuffer nioBuffer(){
       throw new UnsupportedOperationException();
    }
    public int position(){
       return this.position;
    }
    public AllocatedBuffer position(int p0){
       if (p0 < 0 || p0 > this.val$length) {
          throw new IllegalArgumentException("Invalid position: "+p0);
       }
       this.position = p0;
       return this;
    }
    public int remaining(){
       return (this.val$length - this.position);
    }
}
