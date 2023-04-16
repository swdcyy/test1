package com.facebook.imagepipeline.memory.NativeMemoryChunkPool;
import com.facebook.imagepipeline.memory.c;
import eb.c;
import ed.w;
import ed.x;
import com.facebook.imagepipeline.memory.b;
import com.facebook.imagepipeline.memory.NativeMemoryChunk;
import java.lang.Object;

public class NativeMemoryChunkPool extends c	// class@000487
{

    public void NativeMemoryChunkPool(c p0,w p1,x p2){
       super(p0, p1, p2);
    }
    public b F(int p0){
       return this.G(p0);
    }
    public NativeMemoryChunk G(int p0){
       return new NativeMemoryChunk(p0);
    }
    public Object d(int p0){
       return this.G(p0);
    }
}
