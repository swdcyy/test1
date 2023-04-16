package lh0.a$c;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import lh0.a$g0;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import lh0.a$r1;

public final class a$c extends MessageNano	// class@002f0d
{
    public a$c[] a;
    public String b;
    public String c;
    public a$r1 d;
    public String e;
    public int f;
    public String g;
    public String h;
    public a$g0[] i;
    public static a$c[] j;

    public void a$c(){
       super();
       this.a = a$c.a();
       this.b = "";
       this.c = "";
       this.d = null;
       this.e = "";
       this.f = 0;
       this.g = "";
       this.h = "";
       this.i = a$g0.a();
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$c ta = this.a;
       int i1 = 0;
       if (ta != null && ta.length > 0) {
          int i2 = 0;
          a$c ta1 = this.a;
          while (i2 < ta1.length) {
             object oobject = ta1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       String str = "";
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       if (!(this.c).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, ta);
       }
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       ta = this.f;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, ta);
       }
       if (!(this.g).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.g);
       }
       if (!(this.h).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.h);
       }
       ta = this.i;
       if (ta != null && ta.length > 0) {
          ta = this.i;
          while (i1 < ta.length) {
             object oobject1 = ta[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       a$c ti;
       int i2;
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  i1 = 74;
                                  if (i != i1) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                     ti = this.i;
                                     i2 = (ti == null)? 0: ti.length;
                                     i = i + i2;
                                     a$g0[] og0Array = new a$g0[i];
                                     if (i2) {
                                        System.arraycopy(ti, 0, og0Array, 0, i2);
                                     }
                                     i1 = i - 1;
                                     while (i2 < i1) {
                                        og0Array[i2] = new a$g0();
                                        p0.readMessage(og0Array[i2]);
                                        p0.readTag();
                                        i2 = i2 + 1;
                                     }
                                     og0Array[i2] = new a$g0();
                                     p0.readMessage(og0Array[i2]);
                                     this.i = og0Array;
                                  }
                               }else {
                                  this.h = p0.readString();
                               }
                            }else {
                               this.g = p0.readString();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 3 && i != 4)) {
                               continue ;
                            }else {
                               this.f = i;
                            }
                         }
                      }else {
                         this.e = p0.readString();
                      }
                   }else if(this.d == null){
                      this.d = new a$r1();
                   }
                   p0.readMessage(this.d);
                }else {
                   this.c = p0.readString();
                }
             }else {
                this.b = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ti = this.a;
             i2 = (ti == null)? 0: ti.length;
             i = i + i2;
             a$c[] uocArray = new a$c[i];
             if (i2) {
                System.arraycopy(ti, 0, uocArray, 0, i2);
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
             this.a = uocArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$c ta = this.a;
       int i = 0;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$c ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       if (!(this.c).equals(str)) {
          p0.writeString(3, this.c);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeMessage(4, ta);
       }
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       ta = this.f;
       if (ta != null) {
          p0.writeInt32(6, ta);
       }
       if (!(this.g).equals(str)) {
          p0.writeString(7, this.g);
       }
       if (!(this.h).equals(str)) {
          p0.writeString(8, this.h);
       }
       ta = this.i;
       if (ta != null && ta.length > 0) {
          ta = this.i;
          while (i < ta.length) {
             object oobject1 = ta[i];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
