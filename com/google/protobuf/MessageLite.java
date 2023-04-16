package com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.ByteString;
import java.io.OutputStream;
import com.google.protobuf.CodedOutputStream;

public interface abstract MessageLite implements MessageLiteOrBuilder	// class@00047b
{

    Parser getParserForType();
    int getSerializedSize();
    MessageLite$Builder newBuilderForType();
    MessageLite$Builder toBuilder();
    byte[] toByteArray();
    ByteString toByteString();
    void writeDelimitedTo(OutputStream p0);
    void writeTo(CodedOutputStream p0);
    void writeTo(OutputStream p0);
}
