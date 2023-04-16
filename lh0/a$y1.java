package lh0.a$y1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class a$y1 extends MessageNano	// class@002f53
{
    public String[] a;
    public static a$y1[] b;

    public void a$y1(){
       super();
       this.a = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$y1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          a$y1 ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
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
             a$y1 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(ta, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.a = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$y1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$y1 ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
