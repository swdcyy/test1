package mh0.a$l;
import com.google.protobuf.nano.MessageNano;
import mh0.a$m;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$l extends MessageNano	// class@00316f
{
    public a$m[] a;
    public static a$l[] b;

    public void a$l(){
       super();
       if (a$m.f == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$m.f == null) {
             a$m[] omArray = new a$m[0];
             a$m.f = omArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = a$m.f;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$l ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$l ta1 = this.a;
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
             a$l ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$m[] omArray = new a$m[i];
             if (i2) {
                System.arraycopy(ta, 0, omArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                omArray[i2] = new a$m();
                p0.readMessage(omArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             omArray[i2] = new a$m();
             p0.readMessage(omArray[i2]);
             this.a = omArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$l ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$l ta1 = this.a;
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
