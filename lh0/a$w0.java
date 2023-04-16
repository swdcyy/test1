package lh0.a$w0;
import com.google.protobuf.nano.MessageNano;
import lh0.a$t0;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$w0 extends MessageNano	// class@002f4c
{
    public a$t0[] a;
    public static a$w0[] b;

    public void a$w0(){
       super();
       if (a$t0.c == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$t0.c == null) {
             a$t0[] ot0Array = new a$t0[0];
             a$t0.c = ot0Array;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = a$t0.c;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$w0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$w0 ta1 = this.a;
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
             a$w0 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$t0[] ot0Array = new a$t0[i];
             if (i2) {
                System.arraycopy(ta, 0, ot0Array, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ot0Array[i2] = new a$t0();
                p0.readMessage(ot0Array[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             ot0Array[i2] = new a$t0();
             p0.readMessage(ot0Array[i2]);
             this.a = ot0Array;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$w0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$w0 ta1 = this.a;
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
