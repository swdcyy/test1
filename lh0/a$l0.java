package lh0.a$l0;
import com.google.protobuf.nano.MessageNano;
import lh0.a$h0;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$b;
import java.lang.Object;
import java.lang.System;

public final class a$l0 extends MessageNano	// class@002f28
{
    public a$h0[] a;
    public a$b b;
    public boolean c;
    public static a$l0[] d;

    public void a$l0(){
       super();
       this.a = a$h0.a();
       this.b = null;
       this.c = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$l0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$l0 ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readBool();
                }
             }else if(this.b == null){
                this.b = new a$b();
             }
             p0.readMessage(this.b);
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             a$l0 ta = this.a;
             int i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             a$h0[] oh0Array = new a$h0[i];
             if (i2) {
                System.arraycopy(ta, 0, oh0Array, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                oh0Array[i2] = new a$h0();
                p0.readMessage(oh0Array[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             oh0Array[i2] = new a$h0();
             p0.readMessage(oh0Array[i2]);
             this.a = oh0Array;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$l0 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$l0 ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeBool(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
