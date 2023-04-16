package com.google.protobuf.ByteString$AbstractByteIterator;
import com.google.protobuf.ByteString$ByteIterator;
import java.lang.Object;
import java.lang.Byte;
import java.lang.UnsupportedOperationException;

public abstract class ByteString$AbstractByteIterator implements ByteString$ByteIterator	// class@0003cc
{

    public void ByteString$AbstractByteIterator(){
       super();
    }
    public final Byte next(){
       return Byte.valueOf(this.nextByte());
    }
    public Object next(){
       return this.next();
    }
    public final void remove(){
       throw new UnsupportedOperationException();
    }
}
