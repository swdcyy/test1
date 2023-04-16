package lh0.a$v1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import lh0.a$r1;
import java.lang.System;

public final class a$v1 extends MessageNano	// class@002f49
{
    public String a;
    public String b;
    public String c;
    public String d;
    public int[] e;
    public int f;
    public a$r1 g;
    public static a$v1[] h;

    public void a$v1(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = WireFormatNano.EMPTY_INT_ARRAY;
       this.f = 0;
       this.g = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       if (!(this.c).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       if (!(this.d).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.d);
       }
       a$v1 te = this.e;
       if (te != null && te.length > 0) {
          int i1 = 0;
          int i2 = 0;
          a$v1 te1 = this.e;
          while (i1 < te1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt32SizeNoTag(te1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (te1.length * 1);
       }
       te = this.f;
       if (te != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, te);
       }
       te = this.g;
       if (te != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, te);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i4;
       int i5;
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 40;
                      a$v1 ov1 = 5;
                      int i2 = 4;
                      int i3 = 0;
                      if (i != i1) {
                         if (i != 42) {
                            if (i != 48) {
                               if (i != 58) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.g == null){
                                  this.g = new a$r1();
                               }
                               p0.readMessage(this.g);
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && i != 2)) {
                                  continue ;
                               }else {
                                  this.f = i;
                               }
                            }
                         }else {
                            i = p0.pushLimit(p0.readRawVarint32());
                            i1 = p0.getPosition();
                            i4 = 0;
                            while (p0.getBytesUntilLimit() > 0) {
                               i5 = p0.readInt32();
                               if (i5 && (i5 != 1 && (i5 != 2 && (i5 != 3 && (i5 != i2 && i5 != ov1))))) {
                                  continue ;
                               }
                               i4 = i4 + 1;
                            }
                            if (i4) {
                               p0.rewindToPosition(i1);
                               a$v1 te = this.e;
                               i5 = (te == null)? 0: te.length;
                               i4 = i4 + i5;
                               int[] ointArray = new int[i4];
                               if (i5) {
                                  System.arraycopy(te, i3, ointArray, i3, i5);
                               }
                               while (p0.getBytesUntilLimit() > 0) {
                                  i1 = p0.readInt32();
                                  if (i1 && (i1 != 1 && (i1 != 2 && (i1 != 3 && (i1 != i2 && i1 != ov1))))) {
                                     continue ;
                                  }
                                  i3 = i5 + 1;
                                  ointArray[i5] = i1;
                                  i5 = i3;
                               }
                               this.e = ointArray;
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
                            if (!i6 || (i6 == 1 || (i6 == 2 || (i6 == 3 || (i6 == i2 || i6 == ov1))))) {
                               int i7 = i5 + 1;
                               ointArray1[i5] = i6;
                               i5 = i7;
                            }
                            i4 = i4 + 1;
                         }
                         if (i5) {
                            ov1 = this.e;
                            i2 = (ov1 == null)? 0: ov1.length;
                            if (!i2 && i5 == i) {
                               this.e = ointArray1;
                            }else {
                               i = i2 + i5;
                               int[] ointArray2 = new int[i];
                               if (i2) {
                                  System.arraycopy(ov1, i3, ointArray2, i3, i2);
                               }
                               System.arraycopy(ointArray1, i3, ointArray2, i2, i5);
                               this.e = ointArray2;
                            }
                         }
                      }
                   }else {
                      this.d = p0.readString();
                   }
                }else {
                   this.c = p0.readString();
                }
             }else {
                this.b = p0.readString();
             }
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
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       if (!(this.c).equals(str)) {
          p0.writeString(3, this.c);
       }
       if (!(this.d).equals(str)) {
          p0.writeString(4, this.d);
       }
       a$v1 te = this.e;
       if (te != null && te.length > 0) {
          int i = 0;
          a$v1 te1 = this.e;
          while (i < te1.length) {
             p0.writeInt32(5, te1[i]);
             i = i + 1;
          }
       }
       te = this.f;
       if (te != null) {
          p0.writeInt32(6, te);
       }
       te = this.g;
       if (te != null) {
          p0.writeMessage(7, te);
       }
       super.writeTo(p0);
       return;
    }
}
