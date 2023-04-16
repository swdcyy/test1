package as4.c0;
import com.google.protobuf.nano.MessageNano;
import as4.n;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class c0 extends MessageNano	// class@0002e2
{
    public n[] a;
    public String b;
    public static c0[] c;

    public void c0(){
       super();
       this.a = n.a();
       this.b = "";
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       c0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          c0 ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.b = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             c0 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             n[] onArray = new n[i];
             if (i2) {
                System.arraycopy(ta, 0, onArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                onArray[i2] = new n();
                p0.readMessage(onArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             onArray[i2] = new n();
             p0.readMessage(onArray[i2]);
             this.a = onArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       c0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          c0 ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
