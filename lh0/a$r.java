package lh0.a$r;
import com.google.protobuf.nano.MessageNano;
import lh0.a$h0;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$r extends MessageNano	// class@002f3d
{
    public String a;
    public int b;
    public a$h0[] c;
    public static a$r[] d;

    public void a$r(){
       super();
       this.a = "";
       this.b = 0;
       this.c = a$h0.a();
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$r tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          a$r tc = this.c;
          while (i1 < tc.length) {
             object oobject = tc[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   a$r tc = this.c;
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
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.b = i;
                }
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
       a$r tb = this.b;
       if (tb != null) {
          p0.writeInt32(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i = 0;
          a$r tc = this.c;
          while (i < tc.length) {
             object oobject = tc[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
