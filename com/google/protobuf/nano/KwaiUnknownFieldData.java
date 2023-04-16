package com.google.protobuf.nano.KwaiUnknownFieldData;
import java.lang.Object;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

public final class KwaiUnknownFieldData	// class@000514
{
    public final byte[] bytes;
    public final int tag;

    public void KwaiUnknownFieldData(int p0,byte[] p1){
       super();
       this.tag = p0;
       this.bytes = p1;
    }
    public int computeSerializedSize(){
       return ((CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + 0) + this.bytes.length);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof KwaiUnknownFieldData) {
          return false;
       }
       if (this.tag != p0.tag || !Arrays.equals(this.bytes, p0.bytes)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((527 + this.tag) * 31) + Arrays.hashCode(this.bytes));
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       p0.writeRawVarint32(this.tag);
       p0.writeRawBytes(this.bytes);
    }
}
