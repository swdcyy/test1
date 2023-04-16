package com.google.protobuf.BufferAllocator$1;
import com.google.protobuf.BufferAllocator;
import com.google.protobuf.AllocatedBuffer;
import java.nio.ByteBuffer;

public final class BufferAllocator$1 extends BufferAllocator	// class@0003c6
{

    public void BufferAllocator$1(){
       super();
    }
    public AllocatedBuffer allocateDirectBuffer(int p0){
       return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(p0));
    }
    public AllocatedBuffer allocateHeapBuffer(int p0){
       byte[] uobyteArray = new byte[p0];
       return AllocatedBuffer.wrap(uobyteArray);
    }
}
