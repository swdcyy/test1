package lh0.a$h0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import rh0.a$c;

public final class a$h0 extends MessageNano	// class@002f1c
{
    public a$c a;
    public String b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long k;
    public byte[] l;
    public static a$h0[] m;

    public void a$h0(){
       super();
       this.a = null;
       this.b = "";
       this.c = false;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0;
       this.k = 0;
       this.l = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
    }
    public static a$h0[] a(){
       if (a$h0.m == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$h0.m == null) {
             a$h0[] oh0Array = new a$h0[0];
             a$h0.m = oh0Array;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return a$h0.m;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$h0 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ta);
       }
       ta = this.e;
       int i1 = 0;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(5, ta);
       }
       ta = this.f;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, ta);
       }
       ta = this.g;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, ta);
       }
       ta = this.h;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, ta);
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
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(11, ta);
       }
       if (!Arrays.equals(this.l, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(12, this.l);
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
                if (this.a == null) {
                   this.a = new a$c();
                }
                p0.readMessage(this.a);
                break;
              case 18:
                this.b = p0.readString();
                break;
              case 24:
                this.c = p0.readBool();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.d = i;
                }
                break;
              case '(':
                this.e = p0.readInt64();
                break;
              case '0':
                this.f = p0.readInt64();
                break;
              case '8':
                this.g = p0.readInt64();
                break;
              case '@':
                this.h = p0.readInt64();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.i = i;
                }
                break;
              case 'P':
                this.j = p0.readInt32();
                break;
              case 'X':
                this.k = p0.readInt64();
                break;
              case 'b':
                this.l = p0.readBytes();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_0088 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$h0 ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeBool(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeInt32(4, ta);
       }
       ta = this.e;
       int i = 0;
       if (ta - i) {
          p0.writeInt64(5, ta);
       }
       ta = this.f;
       if (ta - i) {
          p0.writeInt64(6, ta);
       }
       ta = this.g;
       if (ta - i) {
          p0.writeInt64(7, ta);
       }
       ta = this.h;
       if (ta - i) {
          p0.writeInt64(8, ta);
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
       if (ta - i) {
          p0.writeInt64(11, ta);
       }
       if (!Arrays.equals(this.l, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(12, this.l);
       }
       super.writeTo(p0);
       return;
    }
}
