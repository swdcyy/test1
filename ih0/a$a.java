package ih0.a$a;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import ih0.a$f;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.System;
import ih0.a$j;
import ih0.a$i;
import ih0.a$d;
import ih0.a$g;

public final class a$a extends MessageNano	// class@0028c8
{
    public a$j A;
    public String[] B;
    public long C;
    public int D;
    public a$f[] E;
    public int F;
    public int[] G;
    public int H;
    public int I;
    public double J;
    public int a;
    public int b;
    public a$g c;
    public int d;
    public int e;
    public String f;
    public int g;
    public String h;
    public int i;
    public int j;
    public a$d k;
    public int l;
    public boolean m;
    public a$i n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public String s;
    public int t;
    public int u;
    public int[] v;
    public int w;
    public int x;
    public String[] y;
    public int z;
    public static a$a[] K;

    public void a$a(){
       super();
       int i = 0;
       this.a = i;
       this.b = i;
       this.c = null;
       this.d = i;
       this.e = i;
       this.f = "";
       this.g = i;
       this.h = "";
       this.i = i;
       this.j = i;
       this.k = null;
       this.l = i;
       this.m = i;
       this.n = null;
       this.o = i;
       this.p = i;
       this.q = i;
       this.r = i;
       this.s = "";
       this.t = i;
       this.u = i;
       int[] eMPTY_INT_AR = WireFormatNano.EMPTY_INT_ARRAY;
       this.v = eMPTY_INT_AR;
       this.w = i;
       this.x = i;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.y = eMPTY_STRING;
       this.z = i;
       this.A = null;
       this.B = eMPTY_STRING;
       this.C = 0;
       this.D = i;
       if (a$f.d == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$f.d == null) {
             a$f[] uofArray = new a$f[i];
             a$f.d = uofArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.E = a$f.d;
       this.F = i;
       this.G = eMPTY_INT_AR;
       this.H = i;
       this.I = i;
       this.J = 0;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i3;
       int i4;
       int i5;
       a$a ty;
       object oobject;
       int i = super.computeSerializedSize();
       a$a ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       ta = this.b;
       int i1 = 2;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, ta);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ta);
       }
       String str = "";
       if (!(this.f).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.f);
       }
       ta = this.g;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, ta);
       }
       if (!(this.h).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.h);
       }
       ta = this.i;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, ta);
       }
       ta = this.j;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, ta);
       }
       ta = this.k;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, ta);
       }
       ta = this.l;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, ta);
       }
       ta = this.m;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, ta);
       }
       ta = this.n;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, ta);
       }
       ta = this.o;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, ta);
       }
       ta = this.p;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, ta);
       }
       ta = this.q;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, ta);
       }
       ta = this.r;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, ta);
       }
       if (!(this.s).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.s);
       }
       ta = this.t;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(20, ta);
       }
       ta = this.u;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(21, ta);
       }
       ta = this.v;
       int i2 = 0;
       if (ta != null && ta.length > 0) {
          i3 = 0;
          i4 = 0;
          a$a tv = this.v;
          while (i3 < tv.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tv[i3]);
             i3 = i3 + 1;
          }
          i = (i + i4) + (tv.length * 2);
       }
       ta = this.w;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(23, ta);
       }
       ta = this.x;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(24, ta);
       }
       ta = this.y;
       if (ta != null && ta.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          ty = this.y;
          while (i3 < ty.length) {
             oobject = ty[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       ta = this.z;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(26, ta);
       }
       ta = this.A;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(27, ta);
       }
       ta = this.B;
       if (ta != null && ta.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          ty = this.B;
          while (i3 < ty.length) {
             oobject = ty[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       a$a tC = this.C;
       if (tC) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(29, tC);
       }
       ta = this.D;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(30, ta);
       }
       ta = this.E;
       if (ta != null && ta.length > 0) {
          i3 = 0;
          tC = this.E;
          while (i3 < tC.length) {
             object oobject1 = tC[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(31, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       ta = this.F;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(32, ta);
       }
       ta = this.G;
       if (ta != null && ta.length > 0) {
          i3 = 0;
          tC = this.G;
          while (i2 < tC.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tC[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tC.length * 2);
       }
       ta = this.H;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(34, ta);
       }
       ta = this.I;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(35, ta);
       }
       if (Double.doubleToLongBits(this.J) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(36, this.J);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       a$a tv;
       int i2;
       int position;
       int i3;
       int[] ointArray1;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.a = p0.readInt32();
                break;
              case 16:
                this.b = p0.readInt32();
                break;
              case 26:
                if (this.c == null) {
                   this.c = new a$g();
                }
                p0.readMessage(this.c);
                break;
              case 32:
                this.d = p0.readInt32();
                break;
              case '(':
                this.e = p0.readInt32();
                break;
              case '2':
                this.f = p0.readString();
                break;
              case '8':
                this.g = p0.readInt32();
                break;
              case 'B':
                this.h = p0.readString();
                break;
              case 'H':
                this.i = p0.readInt32();
                break;
              case 'P':
                this.j = p0.readInt32();
                break;
              case 'Z':
                if (this.k == null) {
                   this.k = new a$d();
                }
                p0.readMessage(this.k);
                break;
              case '`':
                this.l = p0.readInt32();
                break;
              case 'h':
                this.m = p0.readBool();
                break;
              case 'r':
                if (this.n == null) {
                   this.n = new a$i();
                }
                p0.readMessage(this.n);
                break;
              case 'x':
                this.o = p0.readInt32();
                break;
              case 128:
                this.p = p0.readBool();
                break;
              case 136:
                this.q = p0.readInt32();
                break;
              case 144:
                this.r = p0.readInt32();
                break;
              case 154:
                this.s = p0.readString();
                break;
              case 160:
                this.t = p0.readInt32();
                break;
              case 168:
                this.u = p0.readInt32();
                break;
              case 176:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 176);
                tv = this.v;
                i2 = (tv == null)? 0: tv.length;
                i = i + i2;
                int[] ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tv, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readInt32();
                this.v = ointArray;
                break;
              case 178:
                i = p0.pushLimit(p0.readRawVarint32());
                position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tv = this.v;
                i3 = (tv == null)? 0: tv.length;
                i2 = i2 + i3;
                ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tv, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readInt32();
                   i3 = i3 + 1;
                }
                this.v = ointArray1;
                p0.popLimit(i);
                break;
              case 184:
                this.w = p0.readInt32();
                break;
              case 192:
                this.x = p0.readInt32();
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                tv = this.y;
                i2 = (tv == null)? 0: tv.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tv, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.y = stringArray;
                break;
              case 208:
                this.z = p0.readInt32();
                break;
              case 218:
                if (this.A == null) {
                   this.A = new a$j();
                }
                p0.readMessage(this.A);
                break;
              case 226:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 226);
                tv = this.B;
                i2 = (tv == null)? 0: tv.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tv, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.B = stringArray;
                break;
              case 232:
                this.C = p0.readInt64();
                break;
              case 240:
                this.D = p0.readInt32();
                break;
              case 250:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 250);
                tv = this.E;
                i2 = (tv == null)? 0: tv.length;
                i = i + i2;
                a$f[] uofArray = new a$f[i];
                if (i2) {
                   System.arraycopy(tv, i1, uofArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uofArray[i2] = new a$f();
                   p0.readMessage(uofArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uofArray[i2] = new a$f();
                p0.readMessage(uofArray[i2]);
                this.E = uofArray;
                break;
              case 256:
                this.F = p0.readInt32();
                break;
              case 264:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 264);
                int[] ointArray2 = new int[i];
                i2 = 0;
                i3 = 0;
                while (i2 < i) {
                   if (i2) {
                      p0.readTag();
                   }
                   int i4 = p0.readInt32();
                   switch (i4){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 1:
                         int i5 = i3 + 1;
                         ointArray2[i3] = i4;
                         i3 = i5;
                         break;
                       default:
                   }
                   i2 = i2 + 1;
                }
                if (i3) {
                   a$a tG = this.G;
                   ointArray1 = (tG == null)? null: tG.length;
                   if (!ointArray1 && i3 == i) {
                      this.G = ointArray2;
                   }else {
                      i = ointArray1 + i3;
                      int[] ointArray3 = new int[i];
                      if (ointArray1) {
                         System.arraycopy(tG, i1, ointArray3, i1, ointArray1);
                      }
                      System.arraycopy(ointArray2, i1, ointArray3, ointArray1, i3);
                      this.G = ointArray3;
                   }
                }
                break;
              case 266:
                i = p0.pushLimit(p0.readRawVarint32());
                position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   switch (p0.readInt32()){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 1:
                         break;
                       default:
                         continue ;
                   }
                   i2 = i2 + 1;
                }
                if (i2) {
                   p0.rewindToPosition(position);
                   tv = this.G;
                   i3 = (tv == null)? 0: tv.length;
                   i2 = i2 + i3;
                   int[] ointArray4 = new int[i2];
                   if (i3) {
                      System.arraycopy(tv, i1, ointArray4, i1, i3);
                   }
                   while (p0.getBytesUntilLimit() > 0) {
                      i1 = p0.readInt32();
                      switch (i1){
                          case 0:
                          case 2:
                          case 3:
                          case 4:
                          case 5:
                          case 6:
                          case 7:
                          case 1:
                            break;
                          default:
                            continue ;
                      }
                      position = i3 + 1;
                      ointArray4[i3] = i1;
                      i3 = position;
                   }
                   this.G = ointArray4;
                }
                p0.popLimit(i);
                break;
              case 272:
                this.H = p0.readInt32();
                break;
              case 280:
                this.I = p0.readInt32();
                break;
              case 289:
                this.J = p0.readDouble();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_02c0 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       a$a tv;
       object oobject;
       a$a ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeInt32(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeMessage(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeInt32(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeInt32(5, ta);
       }
       String str = "";
       if (!(this.f).equals(str)) {
          p0.writeString(6, this.f);
       }
       ta = this.g;
       if (ta != null) {
          p0.writeInt32(7, ta);
       }
       if (!(this.h).equals(str)) {
          p0.writeString(8, this.h);
       }
       ta = this.i;
       if (ta != null) {
          p0.writeInt32(9, ta);
       }
       ta = this.j;
       if (ta != null) {
          p0.writeInt32(10, ta);
       }
       ta = this.k;
       if (ta != null) {
          p0.writeMessage(11, ta);
       }
       ta = this.l;
       if (ta != null) {
          p0.writeInt32(12, ta);
       }
       ta = this.m;
       if (ta != null) {
          p0.writeBool(13, ta);
       }
       ta = this.n;
       if (ta != null) {
          p0.writeMessage(14, ta);
       }
       ta = this.o;
       if (ta != null) {
          p0.writeInt32(15, ta);
       }
       ta = this.p;
       if (ta != null) {
          p0.writeBool(16, ta);
       }
       ta = this.q;
       if (ta != null) {
          p0.writeInt32(17, ta);
       }
       ta = this.r;
       if (ta != null) {
          p0.writeInt32(18, ta);
       }
       if (!(this.s).equals(str)) {
          p0.writeString(19, this.s);
       }
       ta = this.t;
       if (ta != null) {
          p0.writeInt32(20, ta);
       }
       ta = this.u;
       if (ta != null) {
          p0.writeInt32(21, ta);
       }
       ta = this.v;
       int i = 0;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          tv = this.v;
          while (i1 < tv.length) {
             p0.writeInt32(22, tv[i1]);
             i1 = i1 + 1;
          }
       }
       ta = this.w;
       if (ta != null) {
          p0.writeInt32(23, ta);
       }
       ta = this.x;
       if (ta != null) {
          p0.writeInt32(24, ta);
       }
       ta = this.y;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          tv = this.y;
          while (i1 < tv.length) {
             oobject = tv[i1];
             if (oobject != null) {
                p0.writeString(25, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.z;
       if (ta != null) {
          p0.writeInt32(26, ta);
       }
       ta = this.A;
       if (ta != null) {
          p0.writeMessage(27, ta);
       }
       ta = this.B;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          tv = this.B;
          while (i1 < tv.length) {
             oobject = tv[i1];
             if (oobject != null) {
                p0.writeString(28, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tv = this.C;
       if (tv) {
          p0.writeInt64(29, tv);
       }
       ta = this.D;
       if (ta != null) {
          p0.writeInt32(30, ta);
       }
       ta = this.E;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          tv = this.E;
          while (i1 < tv.length) {
             oobject = tv[i1];
             if (oobject != null) {
                p0.writeMessage(31, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.F;
       if (ta != null) {
          p0.writeInt32(32, ta);
       }
       ta = this.G;
       if (ta != null && ta.length > 0) {
          ta = this.G;
          while (i < ta.length) {
             p0.writeInt32(33, ta[i]);
             i = i + 1;
          }
       }
       ta = this.H;
       if (ta != null) {
          p0.writeInt32(34, ta);
       }
       ta = this.I;
       if (ta != null) {
          p0.writeInt32(35, ta);
       }
       if (Double.doubleToLongBits(this.J) - Double.doubleToLongBits(0)) {
          p0.writeDouble(36, this.J);
       }
       super.writeTo(p0);
       return;
    }
}
