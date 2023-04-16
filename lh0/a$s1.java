package lh0.a$s1;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$s1 extends MessageNano	// class@002f40
{
    public a$c[] a;
    public int b;
    public String c;
    public static a$s1[] d;

    public void a$s1(){
       super();
       this.a = a$c.a();
       this.b = 0;
       this.c = "";
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$s1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$s1 ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ta);
       }
       if (!(this.c).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.b = i;
                }
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             a$s1 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$c[] uocArray = new a$c[i];
             if (i2) {
                System.arraycopy(ta, 0, uocArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uocArray[i2] = new a$c();
                p0.readMessage(uocArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uocArray[i2] = new a$c();
             p0.readMessage(uocArray[i2]);
             this.a = uocArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$s1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$s1 ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       ta = this.b;
       if (ta != null) {
          p0.writeInt32(2, ta);
       }
       if (!(this.c).equals("")) {
          p0.writeString(3, this.c);
       }
       super.writeTo(p0);
       return;
    }
}
