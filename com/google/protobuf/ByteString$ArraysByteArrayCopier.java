package com.google.protobuf.ByteString$ArraysByteArrayCopier;
import com.google.protobuf.ByteString$ByteArrayCopier;
import java.lang.Object;
import com.google.protobuf.ByteString$1;
import java.util.Arrays;

public final class ByteString$ArraysByteArrayCopier implements ByteString$ByteArrayCopier	// class@0003cd
{

    public void ByteString$ArraysByteArrayCopier(){
       super();
    }
    public void ByteString$ArraysByteArrayCopier(ByteString$1 p0){
       super();
    }
    public byte[] copyFrom(byte[] p0,int p1,int p2){
       return Arrays.copyOfRange(p0, p1, (p2 + p1));
    }
}
