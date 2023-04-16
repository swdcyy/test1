package com.google.protobuf.AllocatedBuffer;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.AllocatedBuffer$1;
import java.lang.IndexOutOfBoundsException;
import java.lang.Integer;
import com.google.protobuf.AllocatedBuffer$2;

public abstract class AllocatedBuffer	// class@0003a9
{

    public void AllocatedBuffer(){
       super();
    }
    public static AllocatedBuffer wrap(ByteBuffer p0){
       Internal.checkNotNull(p0, "buffer");
       return new AllocatedBuffer$1(p0);
    }
    public static AllocatedBuffer wrap(byte[] p0){
       return AllocatedBuffer.wrapNoCheck(p0, 0, p0.length);
    }
    public static AllocatedBuffer wrap(byte[] p0,int p1,int p2){
       if (p1 >= 0 && (p2 >= 0 && (p1 + p2) <= p0.length)) {
          return AllocatedBuffer.wrapNoCheck(p0, p1, p2);
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0.length),Integer.valueOf(p1),Integer.valueOf(p2)};
       throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", objArray));
    }
    public static AllocatedBuffer wrapNoCheck(byte[] p0,int p1,int p2){
       return new AllocatedBuffer$2(p0, p1, p2);
    }
    public abstract byte[] array();
    public abstract int arrayOffset();
    public abstract boolean hasArray();
    public abstract boolean hasNioBuffer();
    public abstract int limit();
    public abstract ByteBuffer nioBuffer();
    public abstract int position();
    public abstract AllocatedBuffer position(int p0);
    public abstract int remaining();
}
