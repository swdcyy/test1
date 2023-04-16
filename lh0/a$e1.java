package lh0.a$e1;
import com.google.protobuf.nano.MessageNano;
import lh0.a$o0;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$e1 extends MessageNano	// class@002f12
{
    public boolean a;
    public a$o0[] b;
    public static a$e1[] c;

    public void a$e1(){
       super();
       boolean b = false;
       this.a = b;
       if (a$o0.b == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$o0.b == null) {
             a$o0[] oo0Array = new a$o0[b];
             a$o0.b = oo0Array;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.b = a$o0.b;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$e1 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$e1 tb = this.b;
          while (i1 < tb.length) {
             object oobject = tb[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                a$e1 tb = this.b;
                int i2 = (tb == null)? 0: tb.length;
                i = i + i2;
                a$o0[] oo0Array = new a$o0[i];
                if (i2) {
                   System.arraycopy(tb, 0, oo0Array, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   oo0Array[i2] = new a$o0();
                   p0.readMessage(oo0Array[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                oo0Array[i2] = new a$o0();
                p0.readMessage(oo0Array[i2]);
                this.b = oo0Array;
             }
          }else {
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$e1 ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$e1 tb = this.b;
          while (i < tb.length) {
             object oobject = tb[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
