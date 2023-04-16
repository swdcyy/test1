package lh0.a$s;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$s extends MessageNano	// class@002f41
{
    public long a;
    public a$c b;
    public a$c[] c;
    public int d;
    public String e;
    public int f;
    public long g;
    public int h;
    public a$c i;
    public static a$s[] j;

    public void a$s(){
       super();
       this.a = 0;
       this.b = null;
       this.c = a$c.a();
       this.d = 0;
       this.e = "";
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$s ta = this.a;
       int i1 = 0;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          int i2 = 0;
          a$s tc = this.c;
          while (i2 < tc.length) {
             object oobject = tc[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ta);
       }
       if (!(this.e).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       ta = this.f;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, ta);
       }
       ta = this.g;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, ta);
       }
       ta = this.h;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, ta);
       }
       ta = this.i;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       int i3;
       a$c[] uocArray;
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
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
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else if(this.i == null){
                                     this.i = new a$c();
                                  }
                                  p0.readMessage(this.i);
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != 1 && (i != uocArray && (i != i3 && i != i2)))) {
                                     continue ;
                                  }else {
                                     this.h = i;
                                  }
                               }
                            }else {
                               this.g = p0.readInt64();
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
                   a$s tc = this.c;
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
             this.a = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$s ta = this.a;
       int i = 0;
       if (ta - i) {
          p0.writeInt64(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$s tc = this.c;
          while (i1 < tc.length) {
             object oobject = tc[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.d;
       if (ta != null) {
          p0.writeInt32(4, ta);
       }
       if (!(this.e).equals("")) {
          p0.writeString(5, this.e);
       }
       ta = this.f;
       if (ta != null) {
          p0.writeInt32(6, ta);
       }
       ta = this.g;
       if (ta - i) {
          p0.writeInt64(7, ta);
       }
       ta = this.h;
       if (ta != null) {
          p0.writeInt32(8, ta);
       }
       ta = this.i;
       if (ta != null) {
          p0.writeMessage(9, ta);
       }
       super.writeTo(p0);
       return;
    }
}
