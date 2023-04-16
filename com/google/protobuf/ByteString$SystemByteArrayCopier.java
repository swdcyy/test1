package com.google.protobuf.ByteString$SystemByteArrayCopier;
import com.google.protobuf.ByteString$ByteArrayCopier;
import java.lang.Object;
import com.google.protobuf.ByteString$1;
import java.lang.System;

public final class ByteString$SystemByteArrayCopier implements ByteString$ByteArrayCopier	// class@0003d5
{

    public void ByteString$SystemByteArrayCopier(){
       super();
    }
    public void ByteString$SystemByteArrayCopier(ByteString$1 p0){
       super();
    }
    public byte[] copyFrom(byte[] p0,int p1,int p2){
       byte[] uobyteArray = new byte[p2];
       System.arraycopy(p0, p1, uobyteArray, 0, p2);
       return uobyteArray;
    }
}
