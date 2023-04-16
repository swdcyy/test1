package com.google.protobuf.BinaryReader;
import com.google.protobuf.Reader;
import java.lang.Object;
import com.google.protobuf.BinaryReader$1;
import java.nio.ByteBuffer;
import com.google.protobuf.BinaryReader$SafeHeapReader;
import java.lang.IllegalArgumentException;
import java.lang.String;

public abstract class BinaryReader implements Reader	// class@0003ba
{

    public void BinaryReader(){
       super();
    }
    public void BinaryReader(BinaryReader$1 p0){
       super();
    }
    public static BinaryReader newInstance(ByteBuffer p0,boolean p1){
       if (p0.hasArray()) {
          return new BinaryReader$SafeHeapReader(p0, p1);
       }
       throw new IllegalArgumentException("Direct buffers not yet supported");
    }
    public abstract int getTotalBytesRead();
    public boolean shouldDiscardUnknownFields(){
       return false;
    }
}
