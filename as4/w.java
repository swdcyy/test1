package as4.w;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import as4.h;
import as4.k;
import as4.r;
import as4.d0;
import as4.b0;
import as4.z;
import as4.q;
import as4.c;
import as4.o;
import as4.c0;
import as4.f;
import as4.y;
import as4.d;
import as4.p;
import as4.s;
import as4.t;
import as4.g;
import as4.a0;
import as4.x;
import as4.b;
import as4.i;

public final class w extends MessageNano	// class@0002f8
{
    public b0 A;
    public d0 B;
    public r C;
    public k D;
    public h E;
    public String a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public i k;
    public b l;
    public x m;
    public a0 n;
    public g o;
    public t p;
    public s q;
    public p r;
    public d s;
    public y t;
    public f u;
    public c0 v;
    public o w;
    public c x;
    public q y;
    public z z;
    public static w[] F;

    public void w(){
       super();
       this.a = "";
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = "";
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = null;
       this.l = null;
       this.m = null;
       this.n = null;
       this.o = null;
       this.p = null;
       this.q = null;
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = null;
       this.x = null;
       this.y = null;
       this.z = null;
       this.A = null;
       this.B = null;
       this.C = null;
       this.D = null;
       this.E = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       w tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tb);
       }
       tb = this.d;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tb);
       }
       w te = this.e;
       if (te) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, te);
       }
       tb = this.f;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tb);
       }
       if (!(this.g).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.g);
       }
       if (!(this.h).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.h);
       }
       if (!(this.i).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.i);
       }
       if (!(this.j).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.j);
       }
       tb = this.k;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tb);
       }
       tb = this.l;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tb);
       }
       tb = this.m;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, tb);
       }
       tb = this.n;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, tb);
       }
       tb = this.o;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tb);
       }
       tb = this.p;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tb);
       }
       tb = this.q;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, tb);
       }
       tb = this.r;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, tb);
       }
       tb = this.s;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tb);
       }
       tb = this.t;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, tb);
       }
       tb = this.u;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(26, tb);
       }
       tb = this.v;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(27, tb);
       }
       tb = this.w;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, tb);
       }
       tb = this.x;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(29, tb);
       }
       tb = this.y;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, tb);
       }
       tb = this.z;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(31, tb);
       }
       tb = this.A;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(32, tb);
       }
       tb = this.B;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(33, tb);
       }
       tb = this.C;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(34, tb);
       }
       tb = this.D;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(35, tb);
       }
       tb = this.E;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(36, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.a = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.b = i;
                }
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.c = i;
                }
                break;
              case 32:
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
                    case 1:
                      break;
                    default:
                }
                this.d = i;
                break;
              case '(':
                this.e = p0.readUInt64();
                break;
              case '0':
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
                    case 1:
                      break;
                    default:
                }
                this.f = i;
                break;
              case ':':
                this.g = p0.readString();
                break;
              case 'B':
                this.h = p0.readString();
                break;
              case 'J':
                this.i = p0.readString();
                break;
              case 'R':
                this.j = p0.readString();
                break;
              case 130:
                if (this.k == null) {
                   this.k = new i();
                }
                p0.readMessage(this.k);
                break;
              case 138:
                if (this.l == null) {
                   this.l = new b();
                }
                p0.readMessage(this.l);
                break;
              case 146:
                if (this.m == null) {
                   this.m = new x();
                }
                p0.readMessage(this.m);
                break;
              case 154:
                if (this.n == null) {
                   this.n = new a0();
                }
                p0.readMessage(this.n);
                break;
              case 162:
                if (this.o == null) {
                   this.o = new g();
                }
                p0.readMessage(this.o);
                break;
              case 170:
                if (this.p == null) {
                   this.p = new t();
                }
                p0.readMessage(this.p);
                break;
              case 178:
                if (this.q == null) {
                   this.q = new s();
                }
                p0.readMessage(this.q);
                break;
              case 186:
                if (this.r == null) {
                   this.r = new p();
                }
                p0.readMessage(this.r);
                break;
              case 194:
                if (this.s == null) {
                   this.s = new d();
                }
                p0.readMessage(this.s);
                break;
              case 202:
                if (this.t == null) {
                   this.t = new y();
                }
                p0.readMessage(this.t);
                break;
              case 210:
                if (this.u == null) {
                   this.u = new f();
                }
                p0.readMessage(this.u);
                break;
              case 218:
                if (this.v == null) {
                   this.v = new c0();
                }
                p0.readMessage(this.v);
                break;
              case 226:
                if (this.w == null) {
                   this.w = new o();
                }
                p0.readMessage(this.w);
                break;
              case 234:
                if (this.x == null) {
                   this.x = new c();
                }
                p0.readMessage(this.x);
                break;
              case 242:
                if (this.y == null) {
                   this.y = new q();
                }
                p0.readMessage(this.y);
                break;
              case 250:
                if (this.z == null) {
                   this.z = new z();
                }
                p0.readMessage(this.z);
                break;
              case 258:
                if (this.A == null) {
                   this.A = new b0();
                }
                p0.readMessage(this.A);
                break;
              case 266:
                if (this.B == null) {
                   this.B = new d0();
                }
                p0.readMessage(this.B);
                break;
              case 274:
                if (this.C == null) {
                   this.C = new r();
                }
                p0.readMessage(this.C);
                break;
              case 282:
                if (this.D == null) {
                   this.D = new k();
                }
                p0.readMessage(this.D);
                break;
              case 290:
                if (this.E == null) {
                   this.E = new h();
                }
                p0.readMessage(this.E);
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_01ef ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.a).equals(str)) {
          p0.writeString(1, this.a);
       }
       w tb = this.b;
       if (tb != null) {
          p0.writeInt32(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          p0.writeInt32(3, tb);
       }
       tb = this.d;
       if (tb != null) {
          p0.writeInt32(4, tb);
       }
       w te = this.e;
       if (te) {
          p0.writeUInt64(5, te);
       }
       tb = this.f;
       if (tb != null) {
          p0.writeInt32(6, tb);
       }
       if (!(this.g).equals(str)) {
          p0.writeString(7, this.g);
       }
       if (!(this.h).equals(str)) {
          p0.writeString(8, this.h);
       }
       if (!(this.i).equals(str)) {
          p0.writeString(9, this.i);
       }
       if (!(this.j).equals(str)) {
          p0.writeString(10, this.j);
       }
       tb = this.k;
       if (tb != null) {
          p0.writeMessage(16, tb);
       }
       tb = this.l;
       if (tb != null) {
          p0.writeMessage(17, tb);
       }
       tb = this.m;
       if (tb != null) {
          p0.writeMessage(18, tb);
       }
       tb = this.n;
       if (tb != null) {
          p0.writeMessage(19, tb);
       }
       tb = this.o;
       if (tb != null) {
          p0.writeMessage(20, tb);
       }
       tb = this.p;
       if (tb != null) {
          p0.writeMessage(21, tb);
       }
       tb = this.q;
       if (tb != null) {
          p0.writeMessage(22, tb);
       }
       tb = this.r;
       if (tb != null) {
          p0.writeMessage(23, tb);
       }
       tb = this.s;
       if (tb != null) {
          p0.writeMessage(24, tb);
       }
       tb = this.t;
       if (tb != null) {
          p0.writeMessage(25, tb);
       }
       tb = this.u;
       if (tb != null) {
          p0.writeMessage(26, tb);
       }
       tb = this.v;
       if (tb != null) {
          p0.writeMessage(27, tb);
       }
       tb = this.w;
       if (tb != null) {
          p0.writeMessage(28, tb);
       }
       tb = this.x;
       if (tb != null) {
          p0.writeMessage(29, tb);
       }
       tb = this.y;
       if (tb != null) {
          p0.writeMessage(30, tb);
       }
       tb = this.z;
       if (tb != null) {
          p0.writeMessage(31, tb);
       }
       tb = this.A;
       if (tb != null) {
          p0.writeMessage(32, tb);
       }
       tb = this.B;
       if (tb != null) {
          p0.writeMessage(33, tb);
       }
       tb = this.C;
       if (tb != null) {
          p0.writeMessage(34, tb);
       }
       tb = this.D;
       if (tb != null) {
          p0.writeMessage(35, tb);
       }
       tb = this.E;
       if (tb != null) {
          p0.writeMessage(36, tb);
       }
       super.writeTo(p0);
       return;
    }
}
