package ar4.b;
import com.google.protobuf.nano.MessageNano;
import ar4.b$a;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class b extends MessageNano	// class@0002dd
{
    public b$a[] a;
    public static b[] b;

    public void b(){
       super();
       if (b$a.c == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (b$a.c == null) {
             b$a[] uoaArray = new b$a[0];
             b$a.c = uoaArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = b$a.c;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       b ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          b ta1 = this.a;
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
             b ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             b$a[] uoaArray = new b$a[i];
             if (i2) {
                System.arraycopy(ta, 0, uoaArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uoaArray[i2] = new b$a();
                p0.readMessage(uoaArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uoaArray[i2] = new b$a();
             p0.readMessage(uoaArray[i2]);
             this.a = uoaArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       b ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          b ta1 = this.a;
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
