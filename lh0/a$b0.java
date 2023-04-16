package lh0.a$b0;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$b0 extends MessageNano	// class@002f05
{
    public String a;
    public a$c b;
    public a$c[] c;
    public int d;
    public String e;
    public int f;
    public int g;
    public a$c h;
    public static a$b0[] i;

    public void a$b0(){
       super();
       this.a = "";
       this.b = null;
       this.c = a$c.a();
       this.d = 0;
       this.e = "";
       this.f = 0;
       this.g = 0;
       this.h = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$b0 tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          a$b0 tc = this.c;
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
       tb = this.g;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tb);
       }
       tb = this.h;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       int i3;
       a$c[] uocArray;
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 42) {
                         i2 = 4;
                         i3 = 3;
                         uocArray = 2;
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.h == null){
                                  this.h = new a$c();
                               }
                               p0.readMessage(this.h);
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && (i != uocArray && (i != i3 && i != i2)))) {
                                  continue ;
                               }else {
                                  this.g = i;
                               }
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && (i != uocArray && (i != i3 && i != i2)))) {
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
                   a$b0 tc = this.c;
                   i2 = 0;
                   i3 = (tc == null)? 0: tc.length;
                   i = i + i3;
                   uocArray = new a$c[i];
                   if (i3) {
                      System.arraycopy(tc, i2, uocArray, i2, i3);
                   }
                   i1 = i - 1;
                   while (i3 < i1) {
                      uocArray[i3] = new a$c();
                      p0.readMessage(uocArray[i3]);
                      p0.readTag();
                      i3 = i3 + 1;
                   }
                   uocArray[i3] = new a$c();
                   p0.readMessage(uocArray[i3]);
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
       a$b0 tb = this.b;
       if (tb != null) {
          p0.writeMessage(2, tb);
       }
       tb = this.c;
       if (tb != null && tb.length > 0) {
          int i = 0;
          a$b0 tc = this.c;
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
       tb = this.g;
       if (tb != null) {
          p0.writeInt32(7, tb);
       }
       tb = this.h;
       if (tb != null) {
          p0.writeMessage(8, tb);
       }
       super.writeTo(p0);
       return;
    }
}
