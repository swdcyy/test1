package lh0.a$p0;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$p0 extends MessageNano	// class@002f34
{
    public int a;
    public a$c[] b;
    public long c;
    public static a$p0[] d;

    public void a$p0(){
       super();
       this.a = 0;
       this.b = a$c.a();
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$p0 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$p0 tb = this.b;
          while (i1 < tb.length) {
             object oobject = tb[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.c;
       if (ta) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                a$p0 tb = this.b;
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
             this.a = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$p0 ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$p0 tb = this.b;
          while (i < tb.length) {
             object oobject = tb[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       ta = this.c;
       if (ta) {
          p0.writeInt64(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
