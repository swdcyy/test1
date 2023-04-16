package a35.a;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a extends MessageNano	// class@000021
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public long o;
    public static a[] p;

    public void a(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = "";
       this.f = "";
       this.g = "";
       this.h = "";
       this.i = "";
       this.j = "";
       this.k = "";
       this.l = "";
       this.m = "";
       this.n = "";
       this.o = 0;
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
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       if (!(this.f).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.f);
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
       if (!(this.k).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.k);
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
       a to = this.o;
       if (to) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(15, to);
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
              case 18:
                this.b = p0.readString();
                break;
              case 26:
                this.c = p0.readString();
                break;
              case '"':
                this.d = p0.readString();
                break;
              case '*':
                this.e = p0.readString();
                break;
              case '2':
                this.f = p0.readString();
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
              case 'Z':
                this.k = p0.readString();
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
                this.o = p0.readInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_0078 ;
                }
          }
       }
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
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       if (!(this.f).equals(str)) {
          p0.writeString(6, this.f);
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
       if (!(this.k).equals(str)) {
          p0.writeString(11, this.k);
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
       a to = this.o;
       if (to) {
          p0.writeInt64(15, to);
       }
       super.writeTo(p0);
       return;
    }
}
