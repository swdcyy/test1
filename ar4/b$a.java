package ar4.b$a;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.System;

public final class b$a extends MessageNano	// class@0002dc
{
    public String a;
    public float[] b;
    public static b$a[] c;

    public void b$a(){
       super();
       this.a = "";
       this.b = WireFormatNano.EMPTY_FLOAT_ARRAY;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       b$a tb = this.b;
       if (tb != null && tb.length > 0) {
          i = (i + (tb.length * 4)) + (tb.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             int i1 = 0;
             if (i != 18) {
                i2 = 21;
                if (i != i2) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i2);
                   b$a tb = this.b;
                   int i3 = (tb == null)? 0: tb.length;
                   i = i + i3;
                   float[] uofloatArray = new float[i];
                   if (i3) {
                      System.arraycopy(tb, i1, uofloatArray, i1, i3);
                   }
                   i2 = i - 1;
                   while (i3 < i2) {
                      uofloatArray[i3] = p0.readFloat();
                      p0.readTag();
                      i3 = i3 + 1;
                   }
                   uofloatArray[i3] = p0.readFloat();
                   this.b = uofloatArray;
                }
             }else {
                i = p0.readRawVarint32();
                i2 = p0.pushLimit(i);
                i = i / 4;
                b$a tb1 = this.b;
                int i4 = (tb1 == null)? 0: tb1.length;
                i = i + i4;
                float[] uofloatArray1 = new float[i];
                if (i4) {
                   System.arraycopy(tb1, i1, uofloatArray1, i1, i4);
                }
                while (i4 < i) {
                   uofloatArray1[i4] = p0.readFloat();
                   i4 = i4 + 1;
                }
                this.b = uofloatArray1;
                p0.popLimit(i2);
             }
          }else {
             this.a = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.a).equals("")) {
          p0.writeString(1, this.a);
       }
       b$a tb = this.b;
       if (tb != null && tb.length > 0) {
          int i = 0;
          b$a tb1 = this.b;
          while (i < tb1.length) {
             p0.writeFloat(2, tb1[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
