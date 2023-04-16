package as4.b0;
import com.google.protobuf.nano.MessageNano;
import as4.u;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class b0 extends MessageNano	// class@0002e0
{
    public u[] a;
    public static b0[] b;

    public void b0(){
       super();
       if (u.c == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (u.c == null) {
             u[] ouArray = new u[0];
             u.c = ouArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = u.c;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       b0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          b0 ta1 = this.a;
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
             b0 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             u[] ouArray = new u[i];
             if (i2) {
                System.arraycopy(ta, 0, ouArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ouArray[i2] = new u();
                p0.readMessage(ouArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             ouArray[i2] = new u();
             p0.readMessage(ouArray[i2]);
             this.a = ouArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       b0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          b0 ta1 = this.a;
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
