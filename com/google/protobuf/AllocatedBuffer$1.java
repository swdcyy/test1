package com.google.protobuf.AllocatedBuffer$1;
import com.google.protobuf.AllocatedBuffer;
import java.nio.ByteBuffer;
import java.nio.Buffer;

public final class AllocatedBuffer$1 extends AllocatedBuffer	// class@0003a7
{
    public final ByteBuffer val$buffer;

    public void AllocatedBuffer$1(ByteBuffer p0){
       this.val$buffer = p0;
       super();
    }
    public byte[] array(){
       return this.val$buffer.array();
    }
    public int arrayOffset(){
       return this.val$buffer.arrayOffset();
    }
    public boolean hasArray(){
       return this.val$buffer.hasArray();
    }
    public boolean hasNioBuffer(){
       return true;
    }
    public int limit(){
       return this.val$buffer.limit();
    }
    public ByteBuffer nioBuffer(){
       return this.val$buffer;
    }
    public int position(){
       return this.val$buffer.position();
    }
    public AllocatedBuffer position(int p0){
       this.val$buffer.position(p0);
       return this;
    }
    public int remaining(){
       return this.val$buffer.remaining();
    }
}
