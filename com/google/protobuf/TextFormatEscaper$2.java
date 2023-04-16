package com.google.protobuf.TextFormatEscaper$2;
import com.google.protobuf.TextFormatEscaper$ByteSequence;
import java.lang.Object;

public final class TextFormatEscaper$2 implements TextFormatEscaper$ByteSequence	// class@0004c8
{
    public final byte[] val$input;

    public void TextFormatEscaper$2(byte[] p0){
       this.val$input = p0;
       super();
    }
    public byte byteAt(int p0){
       return this.val$input[p0];
    }
    public int size(){
       return this.val$input.length;
    }
}
