package lh0.a$e0;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$e0 extends MessageNano	// class@002f11
{
    public String a;
    public a$c[] b;
    public boolean c;
    public static a$e0[] d;

    public void a$e0(){
       super();
       this.a = "";
       this.b = a$c.a();
       this.c = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$e0 tb = this.b;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          a$e0 tb1 = this.b;
          while (i1 < tb1.length) {
             object oobject = tb1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tb = this.c;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readBool();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                a$e0 tb = this.b;
                int i2 = (tb == null)? 0: tb.length;
                i = i + i2;
                a$c[] uocArray = new a$c[i];
                if (i2) {
                   System.arraycopy(tb, 0, uocArray, 0, i2);
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
                this.b = uocArray;
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
       a$e0 tb = this.b;
       if (tb != null && tb.length > 0) {
          int i = 0;
          a$e0 tb1 = this.b;
          while (i < tb1.length) {
             object oobject = tb1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tb = this.c;
       if (tb != null) {
          p0.writeBool(3, tb);
       }
       super.writeTo(p0);
       return;
    }
}
