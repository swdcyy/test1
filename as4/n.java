package as4.n;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.InternalNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import as4.a;
import as4.j;
import as4.l;
import java.lang.System;

public final class n extends MessageNano	// class@0002ef
{
    public String a;
    public int[] b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public l h;
    public j i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public long o;
    public boolean p;
    public a q;
    public long r;
    public static n[] s;

    public void n(){
       super();
       this.a = "";
       this.b = WireFormatNano.EMPTY_INT_ARRAY;
       this.c = false;
       this.d = false;
       this.e = 0;
       this.f = false;
       this.g = false;
       this.h = null;
       this.i = null;
       this.j = "";
       this.k = false;
       this.l = "";
       this.m = "";
       this.n = "";
       this.o = 0;
       this.p = false;
       this.q = null;
       this.r = 0;
       this.cachedSize = -1;
    }
    public static n[] a(){
       if (n.s == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (n.s == null) {
             n[] onArray = new n[0];
             n.s = onArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return n.s;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.a);
       }
       n tb = this.b;
       if (tb != null && tb.length > 0) {
          int i2 = 0;
          int i3 = 0;
          n tb1 = this.b;
          while (i2 < tb1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tb1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tb1.length * 1);
       }
       tb = this.c;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tb);
       }
       tb = this.d;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tb);
       }
       tb = this.e;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tb);
       }
       tb = this.f;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tb);
       }
       tb = this.g;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tb);
       }
       tb = this.h;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tb);
       }
       tb = this.i;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tb);
       }
       if (!(this.j).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.j);
       }
       tb = this.k;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tb);
       }
       if (!(this.l).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.l);
       }
       if (!(this.m).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.m);
       }
       if (!(this.n).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.n);
       }
       tb = this.o;
       i1 = 0;
       if (tb - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(15, tb);
       }
       tb = this.p;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tb);
       }
       tb = this.q;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tb);
       }
       tb = this.r;
       if (tb - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       n tb;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.a = p0.readString();
                break;
              case 16:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 16);
                tb = this.b;
                i2 = (tb == null)? 0: tb.length;
                i = i + i2;
                int[] ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tb, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readUInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readUInt32();
                this.b = ointArray;
                break;
              case 18:
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tb = this.b;
                int i3 = (tb == null)? 0: tb.length;
                i2 = i2 + i3;
                int[] ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tb, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.b = ointArray1;
                p0.popLimit(i);
                break;
              case 24:
                this.c = p0.readBool();
                break;
              case 32:
                this.d = p0.readBool();
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.e = i;
                }
                break;
              case '0':
                this.f = p0.readBool();
                break;
              case '8':
                this.g = p0.readBool();
                break;
              case 'B':
                if (this.h == null) {
                   this.h = new l();
                }
                p0.readMessage(this.h);
                break;
              case 'J':
                if (this.i == null) {
                   this.i = new j();
                }
                p0.readMessage(this.i);
                break;
              case 'R':
                this.j = p0.readString();
                break;
              case 'X':
                this.k = p0.readBool();
                break;
              case 'b':
                this.l = p0.readString();
                break;
              case 'j':
                this.m = p0.readString();
                break;
              case 'r':
                this.n = p0.readString();
                break;
              case 'x':
                this.o = p0.readUInt64();
                break;
              case 128:
                this.p = p0.readBool();
                break;
              case 138:
                if (this.q == null) {
                   this.q = new a();
                }
                p0.readMessage(this.q);
                break;
              case 144:
                this.r = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_0121 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       n tb1;
       String str = "";
       if (!(this.a).equals(str)) {
          p0.writeString(1, this.a);
       }
       n tb = this.b;
       if (tb != null && tb.length > 0) {
          int i = 0;
          tb1 = this.b;
          while (i < tb1.length) {
             p0.writeUInt32(2, tb1[i]);
             i = i + 1;
          }
       }
       tb = this.c;
       if (tb != null) {
          p0.writeBool(3, tb);
       }
       tb = this.d;
       if (tb != null) {
          p0.writeBool(4, tb);
       }
       tb = this.e;
       if (tb != null) {
          p0.writeInt32(5, tb);
       }
       tb = this.f;
       if (tb != null) {
          p0.writeBool(6, tb);
       }
       tb = this.g;
       if (tb != null) {
          p0.writeBool(7, tb);
       }
       tb = this.h;
       if (tb != null) {
          p0.writeMessage(8, tb);
       }
       tb = this.i;
       if (tb != null) {
          p0.writeMessage(9, tb);
       }
       if (!(this.j).equals(str)) {
          p0.writeString(10, this.j);
       }
       tb = this.k;
       if (tb != null) {
          p0.writeBool(11, tb);
       }
       if (!(this.l).equals(str)) {
          p0.writeString(12, this.l);
       }
       if (!(this.m).equals(str)) {
          p0.writeString(13, this.m);
       }
       if (!(this.n).equals(str)) {
          p0.writeString(14, this.n);
       }
       tb = this.o;
       tb1 = 0;
       if (tb - tb1) {
          p0.writeUInt64(15, tb);
       }
       tb = this.p;
       if (tb != null) {
          p0.writeBool(16, tb);
       }
       tb = this.q;
       if (tb != null) {
          p0.writeMessage(17, tb);
       }
       tb = this.r;
       if (tb - tb1) {
          p0.writeUInt64(18, tb);
       }
       super.writeTo(p0);
       return;
    }
}
