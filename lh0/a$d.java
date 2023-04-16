package lh0.a$d;
import com.google.protobuf.nano.MessageNano;
import lh0.a$h0;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$b;
import java.lang.System;
import lh0.a$j;

public final class a$d extends MessageNano	// class@002f10
{
    public String a;
    public a$j b;
    public a$h0[] c;
    public a$b d;
    public static a$d[] e;

    public void a$d(){
       super();
       this.a = "";
       this.b = null;
       this.c = a$h0.a();
       this.d = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$d tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          a$d tc = this.c;
          while (i1 < tc.length) {
             object oobject = tc[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tb = this.d;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.d == null){
                      this.d = new a$b();
                   }
                   p0.readMessage(this.d);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   a$d tc = this.c;
                   int i2 = (tc == null)? 0: tc.length;
                   i = i + i2;
                   a$h0[] oh0Array = new a$h0[i];
                   if (i2) {
                      System.arraycopy(tc, 0, oh0Array, 0, i2);
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
                   this.c = oh0Array;
                }
             }else if(this.b == null){
                this.b = new a$j();
             }
             p0.readMessage(this.b);
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
       a$d tb = this.b;
       if (tb != null) {
          p0.writeMessage(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i = 0;
          a$d tc = this.c;
          while (i < tc.length) {
             object oobject = tc[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tb = this.d;
       if (tb != null) {
          p0.writeMessage(4, tb);
       }
       super.writeTo(p0);
       return;
    }
}
