package lh0.a$z;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$z extends MessageNano	// class@002f57
{
    public String a;
    public a$c b;
    public a$c[] c;
    public int d;
    public String e;
    public int f;
    public static a$z[] g;

    public void a$z(){
       super();
       this.a = "";
       this.b = null;
       this.c = a$c.a();
       this.d = 0;
       this.e = "";
       this.f = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$z tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          a$z tc = this.c;
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
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tb);
       }
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       tb = this.f;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tb);
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
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                               continue ;
                            }else {
                               this.f = i;
                            }
                         }
                      }else {
                         this.e = p0.readString();
                      }
                   }else {
                      this.d = p0.readInt32();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   a$z tc = this.c;
                   int i2 = (tc == null)? 0: tc.length;
                   i = i + i2;
                   a$c[] uocArray = new a$c[i];
                   if (i2) {
                      System.arraycopy(tc, 0, uocArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uocArray[i2] = new a$c();
                      p0.readMessage(uocArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uocArray[i2] = new a$c();
                   p0.readMessage(uocArray[i2]);
                   this.c = uocArray;
                }
             }else if(this.b == null){
                this.b = new a$c();
             }
             p0.readMessage(this.b);
          }else {
             this.a = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.a).equals(str)) {
          p0.writeString(1, this.a);
       }
       a$z tb = this.b;
       if (tb != null) {
          p0.writeMessage(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i = 0;
          a$z tc = this.c;
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
          p0.writeInt32(4, tb);
       }
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       tb = this.f;
       if (tb != null) {
          p0.writeInt32(6, tb);
       }
       super.writeTo(p0);
       return;
    }
}
