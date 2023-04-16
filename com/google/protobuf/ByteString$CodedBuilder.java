package com.google.protobuf.ByteString$CodedBuilder;
import java.lang.Object;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$LiteralByteString;

public final class ByteString$CodedBuilder	// class@0003d1
{
    public final byte[] buffer;
    public final CodedOutputStream output;

    public void ByteString$CodedBuilder(int p0){
       super();
       byte[] uobyteArray = new byte[p0];
       this.buffer = uobyteArray;
       this.output = CodedOutputStream.newInstance(uobyteArray);
    }
    public void ByteString$CodedBuilder(int p0,ByteString$1 p1){
       super(p0);
    }
    public ByteString build(){
       this.output.checkNoSpaceLeft();
       return new ByteString$LiteralByteString(this.buffer);
    }
    public CodedOutputStream getCodedOutput(){
       return this.output;
    }
}
