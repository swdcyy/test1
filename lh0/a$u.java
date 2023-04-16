package lh0.a$u;
import com.google.protobuf.nano.MessageNano;
import lh0.a$s;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$u extends MessageNano	// class@002f47
{
    public a$s[] a;
    public String b;
    public static a$u[] c;

    public void a$u(){
       super();
       if (a$s.j == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$s.j == null) {
             a$s[] osArray = new a$s[0];
             a$s.j = osArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = a$s.j;
       this.b = "";
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$u ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$u ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.b = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             a$u ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$s[] osArray = new a$s[i];
             if (i2) {
                System.arraycopy(ta, 0, osArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                osArray[i2] = new a$s();
                p0.readMessage(osArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             osArray[i2] = new a$s();
             p0.readMessage(osArray[i2]);
             this.a = osArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$u ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$u ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
