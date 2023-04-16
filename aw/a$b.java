package aw.a$b;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$b extends MessageNano	// class@000216
{
    public int a;
    public long b;
    public long c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public long i;
    public String j;
    public static a$b[] k;

    public void a$b(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = "";
       this.e = 0;
       this.f = "";
       this.g = "";
       this.h = 0;
       this.i = 0;
       this.j = "";
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$b ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ta);
       }
       ta = this.b;
       if (ta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ta);
       }
       ta = this.c;
       if (ta) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ta);
       }
       String str = "";
       if (!(this.d).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, ta);
       }
       if (!(this.f).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.f);
       }
       if (!(this.g).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.g);
       }
       a$b th = this.h;
       if (th) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, th);
       }
       th = this.i;
       if (th) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, th);
       }
       if (!(this.j).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.j);
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
                this.a = p0.readUInt32();
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
              case '(':
                this.e = p0.readUInt32();
                break;
              case '2':
                this.f = p0.readString();
                break;
              case ':':
                this.g = p0.readString();
                break;
              case '@':
                this.h = p0.readUInt64();
                break;
              case 'H':
                this.i = p0.readUInt64();
                break;
              case 'R':
                this.j = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_0054 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$b ta = this.a;
       if (ta != null) {
          p0.writeUInt32(1, ta);
       }
       ta = this.b;
       if (ta) {
          p0.writeUInt64(2, ta);
       }
       ta = this.c;
       if (ta) {
          p0.writeUInt64(3, ta);
       }
       String str = "";
       if (!(this.d).equals(str)) {
          p0.writeString(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeUInt32(5, ta);
       }
       if (!(this.f).equals(str)) {
          p0.writeString(6, this.f);
       }
       if (!(this.g).equals(str)) {
          p0.writeString(7, this.g);
       }
       a$b th = this.h;
       if (th) {
          p0.writeUInt64(8, th);
       }
       th = this.i;
       if (th) {
          p0.writeUInt64(9, th);
       }
       if (!(this.j).equals(str)) {
          p0.writeString(10, this.j);
       }
       super.writeTo(p0);
       return;
    }
}
