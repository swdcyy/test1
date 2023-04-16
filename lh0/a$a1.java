package lh0.a$a1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import lh0.a$r1;
import java.lang.System;

public final class a$a1 extends MessageNano	// class@002f02
{
    public int[] a;
    public String b;
    public String c;
    public a$r1 d;
    public String e;
    public String f;
    public static a$a1[] g;

    public void a$a1(){
       super();
       this.a = WireFormatNano.EMPTY_INT_ARRAY;
       this.b = "";
       this.c = "";
       this.d = null;
       this.e = "";
       this.f = "";
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$a1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          int i2 = 0;
          a$a1 ta1 = this.a;
          while (i1 < ta1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt32SizeNoTag(ta1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (ta1.length * 1);
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
       if (!(this.f).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.f);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i4;
       int i5;
       int i = p0.readTag();
       while (i) {
          int i1 = 8;
          a$a1 uoa1 = 5;
          int i2 = 4;
          int i3 = 0;
          if (i != i1) {
             if (i != 10) {
                if (i != 18) {
                   if (i != 26) {
                      if (i != 34) {
                         if (i != 42) {
                            if (i != 50) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.f = p0.readString();
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
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i4 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   i5 = p0.readInt32();
                   if (i5 && (i5 != 1 && (i5 != 2 && (i5 != 3 && (i5 != i2 && i5 != uoa1))))) {
                      continue ;
                   }
                   i4 = i4 + 1;
                }
                if (i4) {
                   p0.rewindToPosition(i1);
                   a$a1 ta = this.a;
                   i5 = (ta == null)? 0: ta.length;
                   i4 = i4 + i5;
                   int[] ointArray = new int[i4];
                   if (i5) {
                      System.arraycopy(ta, i3, ointArray, i3, i5);
                   }
                   while (p0.getBytesUntilLimit() > 0) {
                      i1 = p0.readInt32();
                      if (i1 && (i1 != 1 && (i1 != 2 && (i1 != 3 && (i1 != i2 && i1 != uoa1))))) {
                         continue ;
                      }
                      i3 = i5 + 1;
                      ointArray[i5] = i1;
                      i5 = i3;
                   }
                   this.a = ointArray;
                }
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             int[] ointArray1 = new int[i];
             i4 = 0;
             i5 = 0;
             while (i4 < i) {
                if (i4) {
                   p0.readTag();
                }
                int i6 = p0.readInt32();
                if (!i6 || (i6 == 1 || (i6 == 2 || (i6 == 3 || (i6 == i2 || i6 == uoa1))))) {
                   int i7 = i5 + 1;
                   ointArray1[i5] = i6;
                   i5 = i7;
                }
                i4 = i4 + 1;
             }
             if (i5) {
                uoa1 = this.a;
                i2 = (uoa1 == null)? 0: uoa1.length;
                if (!i2 && i5 == i) {
                   this.a = ointArray1;
                }else {
                   i = i2 + i5;
                   int[] ointArray2 = new int[i];
                   if (i2) {
                      System.arraycopy(uoa1, i3, ointArray2, i3, i2);
                   }
                   System.arraycopy(ointArray1, i3, ointArray2, i2, i5);
                   this.a = ointArray2;
                }
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$a1 ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$a1 ta1 = this.a;
          while (i < ta1.length) {
             p0.writeInt32(1, ta1[i]);
             i = i + 1;
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
       if (!(this.f).equals(str)) {
          p0.writeString(6, this.f);
       }
       super.writeTo(p0);
       return;
    }
}
