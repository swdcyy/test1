package lh0.d$a;
import com.google.protobuf.nano.MessageNano;
import lh0.d$e;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.System;

public final class d$a extends MessageNano	// class@002f62
{
    public String a;
    public d$e[] b;
    public int c;
    public byte[] d;
    public int e;
    public static d$a[] f;

    public void d$a(){
       super();
       this.a = "";
       if (d$e.d == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (d$e.d == null) {
             d$e[] uoeArray = new d$e[0];
             d$e.d = uoeArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.b = d$e.d;
       this.c = 0;
       this.d = WireFormatNano.EMPTY_BYTES;
       this.e = 0;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       d$a tb = this.b;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          d$a tb1 = this.b;
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
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tb);
       }
       if (!Arrays.equals(this.d, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(4, this.d);
       }
       tb = this.e;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tb);
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
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.e = p0.readInt32();
                      }
                   }else {
                      this.d = p0.readBytes();
                   }
                }else {
                   this.c = p0.readInt32();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                d$a tb = this.b;
                int i2 = (tb == null)? 0: tb.length;
                i = i + i2;
                d$e[] uoeArray = new d$e[i];
                if (i2) {
                   System.arraycopy(tb, 0, uoeArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uoeArray[i2] = new d$e();
                   p0.readMessage(uoeArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uoeArray[i2] = new d$e();
                p0.readMessage(uoeArray[i2]);
                this.b = uoeArray;
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
       d$a tb = this.b;
       if (tb != null && tb.length > 0) {
          int i = 0;
          d$a tb1 = this.b;
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
          p0.writeInt32(3, tb);
       }
       if (!Arrays.equals(this.d, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(4, this.d);
       }
       tb = this.e;
       if (tb != null) {
          p0.writeInt32(5, tb);
       }
       super.writeTo(p0);
       return;
    }
}
