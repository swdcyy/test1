package com.google.protobuf.WireFormat$Utf8Validation$3;
import com.google.protobuf.WireFormat$Utf8Validation;
import java.lang.String;
import com.google.protobuf.WireFormat$1;
import com.google.protobuf.CodedInputStream;
import java.lang.Object;
import com.google.protobuf.ByteString;

public final class WireFormat$Utf8Validation$3 extends WireFormat$Utf8Validation	// class@0004fe
{

    public void WireFormat$Utf8Validation$3(String p0,int p1){
       super(p0, p1, null);
    }
    public Object readString(CodedInputStream p0){
       return p0.readBytes();
    }
}
