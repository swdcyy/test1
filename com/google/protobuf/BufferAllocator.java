package com.google.protobuf.BufferAllocator;
import com.google.protobuf.BufferAllocator$1;
import java.lang.Object;
import com.google.protobuf.AllocatedBuffer;

public abstract class BufferAllocator	// class@0003c7
{
    public static final BufferAllocator UNPOOLED;

    static {
       BufferAllocator.UNPOOLED = new BufferAllocator$1();
    }
    public void BufferAllocator(){
       super();
    }
    public static BufferAllocator unpooled(){
       return BufferAllocator.UNPOOLED;
    }
    public abstract AllocatedBuffer allocateDirectBuffer(int p0);
    public abstract AllocatedBuffer allocateHeapBuffer(int p0);
}
