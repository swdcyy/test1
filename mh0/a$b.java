package mh0.a$b;
import com.google.protobuf.nano.MessageNano;
import mh0.a$c;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$b extends MessageNano	// class@003165
{
    public a$c[] a;
    public static a$b[] b;

    public void a$b(){
       super();
       if (a$c.d == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$c.d == null) {
             a$c[] uocArray = new a$c[0];
             a$c.d = uocArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = a$c.d;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$b ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$b ta1 = this.a;
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
             a$b ta = this.a;
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
       a$b ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$b ta1 = this.a;
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
