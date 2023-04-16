package bw.a$a;
import com.google.protobuf.nano.MessageNano;
import bw.a$b;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$a extends MessageNano	// class@0002c5
{
    public a$b[] a;
    public static a$a[] b;

    public void a$a(){
       super();
       if (a$b.D == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$b.D == null) {
             a$b[] uobArray = new a$b[0];
             a$b.D = uobArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = a$b.D;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$a ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$a ta1 = this.a;
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
             a$a ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$b[] uobArray = new a$b[i];
             if (i2) {
                System.arraycopy(ta, 0, uobArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uobArray[i2] = new a$b();
                p0.readMessage(uobArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uobArray[i2] = new a$b();
             p0.readMessage(uobArray[i2]);
             this.a = uobArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$a ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$a ta1 = this.a;
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
