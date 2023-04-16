package com.google.protobuf.TextFormatEscaper$1;
import com.google.protobuf.TextFormatEscaper$ByteSequence;
import com.google.protobuf.ByteString;
import java.lang.Object;

public final class TextFormatEscaper$1 implements TextFormatEscaper$ByteSequence	// class@0004c7
{
    public final ByteString val$input;

    public void TextFormatEscaper$1(ByteString p0){
       this.val$input = p0;
       super();
    }
    public byte byteAt(int p0){
       return this.val$input.byteAt(p0);
    }
    public int size(){
       return this.val$input.size();
    }
}
