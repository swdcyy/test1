package lh0.a$b;
import com.google.protobuf.nano.MessageNano;
import rh0.a$c;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$g0;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import lh0.a$w0;
import java.lang.System;
import lh0.a$r1;

public final class a$b extends MessageNano	// class@002f08
{
    public int A;
    public a$g0[] B;
    public long C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public a$w0 I;
    public long J;
    public byte[] K;
    public String a;
    public String b;
    public a$c c;
    public int d;
    public String e;
    public int f;
    public long g;
    public long h;
    public int i;
    public int j;
    public int k;
    public int l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public a$c[] r;
    public a$c[] s;
    public String t;
    public a$r1 u;
    public String v;
    public String w;
    public String x;
    public int y;
    public int[] z;
    public static a$b[] L;

    public void a$b(){
       super();
       this.a = "";
       this.b = "";
       this.c = null;
       this.d = 0;
       this.e = "";
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = 0;
       this.m = "";
       this.n = "";
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = a$c.a();
       this.s = a$c.a();
       this.t = "";
       this.u = null;
       this.v = "";
       this.w = "";
       this.x = "";
       this.y = 0;
       this.z = WireFormatNano.EMPTY_INT_ARRAY;
       this.A = 0;
       this.B = a$g0.a();
       this.C = 0;
       this.D = false;
       this.E = false;
       this.F = false;
       this.G = false;
       this.H = "";
       this.I = null;
       this.J = 0;
       this.K = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i3;
       a$b tr;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       int i1 = 2;
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.b);
       }
       a$b tc = this.c;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tc);
       }
       tc = this.d;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tc);
       }
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       tc = this.f;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tc);
       }
       a$b tg = this.g;
       if (tg) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, tg);
       }
       tg = this.h;
       if (tg) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, tg);
       }
       tc = this.i;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tc);
       }
       tc = this.j;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tc);
       }
       tc = this.k;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tc);
       }
       tc = this.l;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tc);
       }
       if (!(this.m).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.m);
       }
       if (!(this.n).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.n);
       }
       tc = this.o;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tc);
       }
       tc = this.p;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tc);
       }
       tc = this.q;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tc);
       }
       tc = this.r;
       int i2 = 0;
       if (tc != null && tc.length > 0) {
          i3 = 0;
          tr = this.r;
          while (i3 < tr.length) {
             oobject = tr[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(18, oobject);
             }
             i3 = i3 + 1;
          }
       }
       tc = this.s;
       if (tc != null && tc.length > 0) {
          i3 = 0;
          tr = this.s;
          while (i3 < tr.length) {
             oobject = tr[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(19, oobject);
             }
             i3 = i3 + 1;
          }
       }
       if (!(this.t).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.t);
       }
       tc = this.u;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tc);
       }
       if (!(this.v).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.v);
       }
       if (!(this.w).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.w);
       }
       if (!(this.x).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.x);
       }
       tc = this.y;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(25, tc);
       }
       tc = this.z;
       if (tc != null && tc.length > 0) {
          i3 = 0;
          int i4 = 0;
          a$b tz = this.z;
          while (i3 < tz.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tz[i3]);
             i3 = i3 + 1;
          }
          i = (i + i4) + (tz.length * 2);
       }
       tc = this.A;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(27, tc);
       }
       tc = this.B;
       if (tc != null && tc.length > 0) {
          tc = this.B;
          while (i2 < tc.length) {
             object oobject1 = tc[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(28, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       a$b tC = this.C;
       if (tC) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(29, tC);
       }
       tc = this.D;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(30, tc);
       }
       tc = this.E;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(31, tc);
       }
       tc = this.F;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(32, tc);
       }
       tc = this.G;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(33, tc);
       }
       if (!(this.H).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(34, this.H);
       }
       tc = this.I;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(35, tc);
       }
       tc = this.J;
       if (tc) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(36, tc);
       }
       if (!Arrays.equals(this.K, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(37, this.K);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i3;
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          a$b uob = 5;
          int i1 = 4;
          a$c[] uocArray = 3;
          int i2 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.a = p0.readString();
                break;
              case 18:
                this.b = p0.readString();
                break;
              case 26:
                if (this.c == null) {
                   this.c = new a$c();
                }
                p0.readMessage(this.c);
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.d = i;
                }
                break;
              case '*':
                this.e = p0.readString();
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.f = i;
                }
                break;
              case '8':
                this.g = p0.readInt64();
                break;
              case '@':
                this.h = p0.readInt64();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != uocArray && i != i1)) {
                   continue ;
                }else {
                   this.i = i;
                }
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.j = i;
                }
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.k = i;
                }
                break;
              case '`':
                this.l = p0.readInt32();
                break;
              case 'j':
                this.m = p0.readString();
                break;
              case 'r':
                this.n = p0.readString();
                break;
              case 'x':
                this.o = p0.readBool();
                break;
              case 128:
                this.p = p0.readBool();
                break;
              case 136:
                this.q = p0.readBool();
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                uob = this.r;
                i1 = (uob == null)? 0: uob.length;
                i = i + i1;
                uocArray = new a$c[i];
                if (i1) {
                   System.arraycopy(uob, i2, uocArray, i2, i1);
                }
                i3 = i - 1;
                while (i1 < i3) {
                   uocArray[i1] = new a$c();
                   p0.readMessage(uocArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uocArray[i1] = new a$c();
                p0.readMessage(uocArray[i1]);
                this.r = uocArray;
                break;
              case 154:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 154);
                uob = this.s;
                i1 = (uob == null)? 0: uob.length;
                i = i + i1;
                uocArray = new a$c[i];
                if (i1) {
                   System.arraycopy(uob, i2, uocArray, i2, i1);
                }
                i3 = i - 1;
                while (i1 < i3) {
                   uocArray[i1] = new a$c();
                   p0.readMessage(uocArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uocArray[i1] = new a$c();
                p0.readMessage(uocArray[i1]);
                this.s = uocArray;
                break;
              case 162:
                this.t = p0.readString();
                break;
              case 170:
                if (this.u == null) {
                   this.u = new a$r1();
                }
                p0.readMessage(this.u);
                break;
              case 178:
                this.v = p0.readString();
                break;
              case 186:
                this.w = p0.readString();
                break;
              case 194:
                this.x = p0.readString();
                break;
              case 200:
                this.y = p0.readInt32();
                break;
              case 208:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 208);
                int[] ointArray = new int[i];
                i4 = 0;
                i5 = 0;
                while (i4 < i) {
                   if (i4) {
                      p0.readTag();
                   }
                   int i6 = p0.readInt32();
                   if (!i6 || (i6 == 1 || (i6 == 2 || (i6 == uocArray || (i6 == i1 || i6 == uob))))) {
                      int i7 = i5 + 1;
                      ointArray[i5] = i6;
                      i5 = i7;
                   }
                   i4 = i4 + 1;
                }
                if (i5) {
                   uob = this.z;
                   i1 = (uob == null)? 0: uob.length;
                   if (!i1 && i5 == i) {
                      this.z = ointArray;
                   }else {
                      i = i1 + i5;
                      int[] ointArray1 = new int[i];
                      if (i1) {
                         System.arraycopy(uob, i2, ointArray1, i2, i1);
                      }
                      System.arraycopy(ointArray, i2, ointArray1, i1, i5);
                      this.z = ointArray1;
                   }
                }
                break;
              case 210:
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i4 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   i5 = p0.readInt32();
                   if (i5 && (i5 != 1 && (i5 != 2 && (i5 != uocArray && (i5 != i1 && i5 != uob))))) {
                      continue ;
                   }
                   i4 = i4 + 1;
                }
                if (i4) {
                   p0.rewindToPosition(position);
                   a$b tz = this.z;
                   i5 = (tz == null)? 0: tz.length;
                   i4 = i4 + i5;
                   int[] ointArray2 = new int[i4];
                   if (i5) {
                      System.arraycopy(tz, i2, ointArray2, i2, i5);
                   }
                   while (p0.getBytesUntilLimit() > 0) {
                      i2 = p0.readInt32();
                      if (i2 && (i2 != 1 && (i2 != 2 && (i2 != uocArray && (i2 != i1 && i2 != uob))))) {
                         continue ;
                      }
                      position = i5 + 1;
                      ointArray2[i5] = i2;
                      i5 = position;
                   }
                   this.z = ointArray2;
                }
                p0.popLimit(i);
                break;
              case 216:
                this.A = p0.readInt32();
                break;
              case 226:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 226);
                uob = this.B;
                i1 = (uob == null)? 0: uob.length;
                i = i + i1;
                a$g0[] og0Array = new a$g0[i];
                if (i1) {
                   System.arraycopy(uob, i2, og0Array, i2, i1);
                }
                i3 = i - 1;
                while (i1 < i3) {
                   og0Array[i1] = new a$g0();
                   p0.readMessage(og0Array[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                og0Array[i1] = new a$g0();
                p0.readMessage(og0Array[i1]);
                this.B = og0Array;
                break;
              case 232:
                this.C = p0.readInt64();
                break;
              case 240:
                this.D = p0.readBool();
                break;
              case 248:
                this.E = p0.readBool();
                break;
              case 256:
                this.F = p0.readBool();
                break;
              case 264:
                this.G = p0.readBool();
                break;
              case 274:
                this.H = p0.readString();
                break;
              case 282:
                if (this.I == null) {
                   this.I = new a$w0();
                }
                p0.readMessage(this.I);
                break;
              case 288:
                this.J = p0.readInt64();
                break;
              case 298:
                this.K = p0.readBytes();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_02b5 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       a$b tr;
       object oobject;
       String str = "";
       if (!(this.a).equals(str)) {
          p0.writeString(1, this.a);
       }
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       a$b tc = this.c;
       if (tc != null) {
          p0.writeMessage(3, tc);
       }
       tc = this.d;
       if (tc != null) {
          p0.writeInt32(4, tc);
       }
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       tc = this.f;
       if (tc != null) {
          p0.writeInt32(6, tc);
       }
       a$b tg = this.g;
       if (tg) {
          p0.writeInt64(7, tg);
       }
       tg = this.h;
       if (tg) {
          p0.writeInt64(8, tg);
       }
       tc = this.i;
       if (tc != null) {
          p0.writeInt32(9, tc);
       }
       tc = this.j;
       if (tc != null) {
          p0.writeInt32(10, tc);
       }
       tc = this.k;
       if (tc != null) {
          p0.writeInt32(11, tc);
       }
       tc = this.l;
       if (tc != null) {
          p0.writeInt32(12, tc);
       }
       if (!(this.m).equals(str)) {
          p0.writeString(13, this.m);
       }
       if (!(this.n).equals(str)) {
          p0.writeString(14, this.n);
       }
       tc = this.o;
       if (tc != null) {
          p0.writeBool(15, tc);
       }
       tc = this.p;
       if (tc != null) {
          p0.writeBool(16, tc);
       }
       tc = this.q;
       if (tc != null) {
          p0.writeBool(17, tc);
       }
       tc = this.r;
       int i = 0;
       if (tc != null && tc.length > 0) {
          i1 = 0;
          tr = this.r;
          while (i1 < tr.length) {
             oobject = tr[i1];
             if (oobject != null) {
                p0.writeMessage(18, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tc = this.s;
       if (tc != null && tc.length > 0) {
          i1 = 0;
          tr = this.s;
          while (i1 < tr.length) {
             oobject = tr[i1];
             if (oobject != null) {
                p0.writeMessage(19, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.t).equals(str)) {
          p0.writeString(20, this.t);
       }
       tc = this.u;
       if (tc != null) {
          p0.writeMessage(21, tc);
       }
       if (!(this.v).equals(str)) {
          p0.writeString(22, this.v);
       }
       if (!(this.w).equals(str)) {
          p0.writeString(23, this.w);
       }
       if (!(this.x).equals(str)) {
          p0.writeString(24, this.x);
       }
       tc = this.y;
       if (tc != null) {
          p0.writeInt32(25, tc);
       }
       tc = this.z;
       if (tc != null && tc.length > 0) {
          i1 = 0;
          tr = this.z;
          while (i1 < tr.length) {
             p0.writeInt32(26, tr[i1]);
             i1 = i1 + 1;
          }
       }
       tc = this.A;
       if (tc != null) {
          p0.writeInt32(27, tc);
       }
       tc = this.B;
       if (tc != null && tc.length > 0) {
          tc = this.B;
          while (i < tc.length) {
             object oobject1 = tc[i];
             if (oobject1 != null) {
                p0.writeMessage(28, oobject1);
             }
             i = i + 1;
          }
       }
       tg = this.C;
       if (tg) {
          p0.writeInt64(29, tg);
       }
       tc = this.D;
       if (tc != null) {
          p0.writeBool(30, tc);
       }
       tc = this.E;
       if (tc != null) {
          p0.writeBool(31, tc);
       }
       tc = this.F;
       if (tc != null) {
          p0.writeBool(32, tc);
       }
       tc = this.G;
       if (tc != null) {
          p0.writeBool(33, tc);
       }
       if (!(this.H).equals(str)) {
          p0.writeString(34, this.H);
       }
       tc = this.I;
       if (tc != null) {
          p0.writeMessage(35, tc);
       }
       tc = this.J;
       if (tc) {
          p0.writeInt64(36, tc);
       }
       if (!Arrays.equals(this.K, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(37, this.K);
       }
       super.writeTo(p0);
       return;
    }
}
