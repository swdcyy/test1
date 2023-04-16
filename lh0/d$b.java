package lh0.d$b;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.d$c;
import rh0.a$c;

public final class d$b extends MessageNano	// class@002f63
{
    public long a;
    public String b;
    public a$c c;
    public String d;
    public int e;
    public String f;
    public String g;
    public int h;
    public d$c i;
    public String j;
    public String k;
    public static d$b[] l;

    public void d$b(){
       super();
       this.a = 0;
       this.b = "";
       this.c = null;
       this.d = "";
       this.e = 0;
       this.f = "";
       this.g = "";
       this.h = 0;
       this.i = null;
       this.j = "";
       this.k = "";
       this.cachedSize = -1;
    }
    public static d$b a(byte[] p0){
       return MessageNano.mergeFrom(new d$b(), p0);
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       d$b ta = this.a;
       if (ta - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, ta);
       }
       String str = "";
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ta);
       }
       if (!(this.d).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ta);
       }
       if (!(this.f).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.f);
       }
       if (!(this.g).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.g);
       }
       ta = this.h;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, ta);
       }
       ta = this.i;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, ta);
       }
       if (!(this.j).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.j);
       }
       if (!(this.k).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.k);
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
                this.a = p0.readInt64();
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
              case '"':
                this.d = p0.readString();
                break;
              case '(':
                this.e = p0.readInt32();
                break;
              case '2':
                this.f = p0.readString();
                break;
              case ':':
                this.g = p0.readString();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.h = i;
                }
                break;
              case 'J':
                if (this.i == null) {
                   this.i = new d$c();
                }
                p0.readMessage(this.i);
                break;
              case 'R':
                this.j = p0.readString();
                break;
              case 'Z':
                this.k = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_007f ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       d$b ta = this.a;
       if (ta - null) {
          p0.writeInt64(1, ta);
       }
       String str = "";
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeMessage(3, ta);
       }
       if (!(this.d).equals(str)) {
          p0.writeString(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeInt32(5, ta);
       }
       if (!(this.f).equals(str)) {
          p0.writeString(6, this.f);
       }
       if (!(this.g).equals(str)) {
          p0.writeString(7, this.g);
       }
       ta = this.h;
       if (ta != null) {
          p0.writeInt32(8, ta);
       }
       ta = this.i;
       if (ta != null) {
          p0.writeMessage(9, ta);
       }
       if (!(this.j).equals(str)) {
          p0.writeString(10, this.j);
       }
       if (!(this.k).equals(str)) {
          p0.writeString(11, this.k);
       }
       super.writeTo(p0);
       return;
    }
}
