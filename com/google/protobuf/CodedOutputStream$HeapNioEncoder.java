package com.google.protobuf.CodedOutputStream$HeapNioEncoder;
import com.google.protobuf.CodedOutputStream$ArrayEncoder;
import java.nio.ByteBuffer;
import java.nio.Buffer;

public final class CodedOutputStream$HeapNioEncoder extends CodedOutputStream$ArrayEncoder	// class@0003e9
{
    public final ByteBuffer byteBuffer;
    public int initialPosition;

    public void CodedOutputStream$HeapNioEncoder(ByteBuffer p0){
       super(p0.array(), (p0.arrayOffset() + p0.position()), p0.remaining());
       this.byteBuffer = p0;
       this.initialPosition = p0.position();
    }
    public void flush(){
       this.byteBuffer.position((this.initialPosition + this.getTotalBytesWritten()));
    }
}
