package as4.q;
import com.google.protobuf.nano.MessageNano;
import as4.m;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class q extends MessageNano	// class@0002f2
{
    public m[] a;
    public static q[] b;

    public void q(){
       super();
       this.a = m.a();
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       q ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          q ta1 = this.a;
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
             q ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             m[] omArray = new m[i];
             if (i2) {
                System.arraycopy(ta, 0, omArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                omArray[i2] = new m();
                p0.readMessage(omArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             omArray[i2] = new m();
             p0.readMessage(omArray[i2]);
             this.a = omArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       q ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          q ta1 = this.a;
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
