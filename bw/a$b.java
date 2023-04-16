package bw.a$b;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.System;

public final class a$b extends MessageNano	// class@0002c6
{
    public String A;
    public String B;
    public String[] C;
    public long a;
    public long b;
    public long c;
    public String d;
    public String e;
    public long f;
    public String g;
    public String h;
    public int i;
    public String j;
    public String k;
    public double l;
    public double m;
    public int n;
    public int o;
    public String p;
    public int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;
    public static a$b[] D;

    public void a$b(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = "";
       this.e = "";
       this.f = 0;
       this.g = "";
       this.h = "";
       this.i = 0;
       this.j = "";
       this.k = "";
       this.l = 0;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = "";
       this.q = 0;
       this.r = "";
       this.s = "";
       this.t = "";
       this.u = "";
       this.v = "";
       this.w = "";
       this.x = "";
       this.y = "";
       this.z = "";
       this.A = "";
       this.B = "";
       this.C = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$b ta = this.a;
       a$b uob = null;
       if (ta - uob) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ta);
       }
       ta = this.b;
       if (ta - uob) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ta);
       }
       ta = this.c;
       if (ta - uob) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ta);
       }
       String str = "";
       if (!(this.d).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.d);
       }
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       a$b tf = this.f;
       if (tf - uob) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tf);
       }
       if (!(this.g).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.g);
       }
       if (!(this.h).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.h);
       }
       ta = this.i;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, ta);
       }
       if (!(this.j).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.j);
       }
       if (!(this.k).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.k);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.l) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(12, this.l);
       }
       if (Double.doubleToLongBits(this.m) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(13, this.m);
       }
       ta = this.n;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, ta);
       }
       ta = this.o;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, ta);
       }
       if (!(this.p).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.p);
       }
       ta = this.q;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(17, ta);
       }
       if (!(this.r).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.r);
       }
       if (!(this.s).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.s);
       }
       if (!(this.t).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.t);
       }
       if (!(this.u).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.u);
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
       if (!(this.y).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(25, this.y);
       }
       if (!(this.z).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.z);
       }
       if (!(this.A).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.A);
       }
       if (!(this.B).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.B);
       }
       ta = this.C;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          a$b tC = this.C;
          while (i1 < tC.length) {
             object oobject = tC[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 2);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.a = p0.readUInt64();
                break;
              case 16:
                this.b = p0.readUInt64();
                break;
              case 24:
                this.c = p0.readUInt64();
                break;
              case '"':
                this.d = p0.readString();
                break;
              case '*':
                this.e = p0.readString();
                break;
              case '0':
                this.f = p0.readUInt64();
                break;
              case ':':
                this.g = p0.readString();
                break;
              case 'B':
                this.h = p0.readString();
                break;
              case 'H':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 1:
                      break;
                    default:
                }
                this.i = i;
                break;
              case 'R':
                this.j = p0.readString();
                break;
              case 'Z':
                this.k = p0.readString();
                break;
              case 'a':
                this.l = p0.readDouble();
                break;
              case 'i':
                this.m = p0.readDouble();
                break;
              case 'p':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case 1:
                      break;
                    default:
                }
                this.n = i;
                break;
              case 'x':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 1:
                      break;
                    default:
                }
                this.o = i;
                break;
              case 130:
                this.p = p0.readString();
                break;
              case 136:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.q = i;
                }
                break;
              case 146:
                this.r = p0.readString();
                break;
              case 154:
                this.s = p0.readString();
                break;
              case 162:
                this.t = p0.readString();
                break;
              case 170:
                this.u = p0.readString();
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
              case 202:
                this.y = p0.readString();
                break;
              case 210:
                this.z = p0.readString();
                break;
              case 218:
                this.A = p0.readString();
                break;
              case 226:
                this.B = p0.readString();
                break;
              case 234:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 234);
                a$b tC = this.C;
                int i1 = (tC == null)? 0: tC.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(tC, 0, stringArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.C = stringArray;
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_0131 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$b ta = this.a;
       a$b uob = null;
       if (ta - uob) {
          p0.writeUInt64(1, ta);
       }
       ta = this.b;
       if (ta - uob) {
          p0.writeUInt64(2, ta);
       }
       ta = this.c;
       if (ta - uob) {
          p0.writeUInt64(3, ta);
       }
       String str = "";
       if (!(this.d).equals(str)) {
          p0.writeString(4, this.d);
       }
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       a$b tf = this.f;
       if (tf - uob) {
          p0.writeUInt64(6, tf);
       }
       if (!(this.g).equals(str)) {
          p0.writeString(7, this.g);
       }
       if (!(this.h).equals(str)) {
          p0.writeString(8, this.h);
       }
       ta = this.i;
       if (ta != null) {
          p0.writeInt32(9, ta);
       }
       if (!(this.j).equals(str)) {
          p0.writeString(10, this.j);
       }
       if (!(this.k).equals(str)) {
          p0.writeString(11, this.k);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.l) - Double.doubleToLongBits(d)) {
          p0.writeDouble(12, this.l);
       }
       if (Double.doubleToLongBits(this.m) - Double.doubleToLongBits(d)) {
          p0.writeDouble(13, this.m);
       }
       ta = this.n;
       if (ta != null) {
          p0.writeInt32(14, ta);
       }
       ta = this.o;
       if (ta != null) {
          p0.writeInt32(15, ta);
       }
       if (!(this.p).equals(str)) {
          p0.writeString(16, this.p);
       }
       ta = this.q;
       if (ta != null) {
          p0.writeInt32(17, ta);
       }
       if (!(this.r).equals(str)) {
          p0.writeString(18, this.r);
       }
       if (!(this.s).equals(str)) {
          p0.writeString(19, this.s);
       }
       if (!(this.t).equals(str)) {
          p0.writeString(20, this.t);
       }
       if (!(this.u).equals(str)) {
          p0.writeString(21, this.u);
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
       if (!(this.y).equals(str)) {
          p0.writeString(25, this.y);
       }
       if (!(this.z).equals(str)) {
          p0.writeString(26, this.z);
       }
       if (!(this.A).equals(str)) {
          p0.writeString(27, this.A);
       }
       if (!(this.B).equals(str)) {
          p0.writeString(28, this.B);
       }
       ta = this.C;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$b tC = this.C;
          while (i < tC.length) {
             object oobject = tC[i];
             if (oobject != null) {
                p0.writeString(29, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
