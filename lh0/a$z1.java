package lh0.a$z1;
import com.google.protobuf.nano.MessageNano;
import lh0.a$a2;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$z1 extends MessageNano	// class@002f56
{
    public a$a2[] a;
    public static a$z1[] b;

    public void a$z1(){
       super();
       this.a = a$a2.a();
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$z1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$z1 ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             a$z1 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$a2[] uoa2Array = new a$a2[i];
             if (i2) {
                System.arraycopy(ta, 0, uoa2Array, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uoa2Array[i2] = new a$a2();
                p0.readMessage(uoa2Array[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uoa2Array[i2] = new a$a2();
             p0.readMessage(uoa2Array[i2]);
             this.a = uoa2Array;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$z1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$z1 ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
