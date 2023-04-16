package lh0.a$i1;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$n1;
import lh0.a$u0;
import lh0.a$m;
import lh0.a$i;
import lh0.a$g;
import lh0.a$f1;
import lh0.a$a1;
import lh0.a$g1;
import lh0.a$k1;
import lh0.a$z0;
import lh0.a$e1;
import lh0.a$c1;
import lh0.a$d1;
import lh0.a$b1;
import lh0.a$h1;

public final class a$i1 extends MessageNano	// class@002f20
{
    public int a;
    public Object b;
    public String c;
    public static a$i1[] d;

    public void a$i1(){
       super();
       this.a = 0;
       this.c = "";
       this.a = 0;
       this.b = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.c).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.c);
       }
       int i1 = 2;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 3;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 4;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 5;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 6;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 7;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 8;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 9;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 10;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 11;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 12;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 13;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 14;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       i1 = 15;
       if (this.a == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.b);
       }
       if (this.a == 16) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, this.b);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.c = p0.readString();
                break;
              case 18:
                i1 = 2;
                if (this.a != i1) {
                   this.b = new a$h1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 26:
                i1 = 3;
                if (this.a != i1) {
                   this.b = new a$b1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case '"':
                i1 = 4;
                if (this.a != i1) {
                   this.b = new a$d1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case '*':
                i1 = 5;
                if (this.a != i1) {
                   this.b = new a$c1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case '2':
                i1 = 6;
                if (this.a != i1) {
                   this.b = new a$e1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case ':':
                i1 = 7;
                if (this.a != i1) {
                   this.b = new a$z0();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'B':
                i1 = 8;
                if (this.a != i1) {
                   this.b = new a$k1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'J':
                i1 = 9;
                if (this.a != i1) {
                   this.b = new a$g1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'R':
                i1 = 10;
                if (this.a != i1) {
                   this.b = new a$a1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'Z':
                i1 = 11;
                if (this.a != i1) {
                   this.b = new a$f1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'b':
                i1 = 12;
                if (this.a != i1) {
                   this.b = new a$g();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'j':
                i1 = 13;
                if (this.a != i1) {
                   this.b = new a$i();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'r':
                i1 = 14;
                if (this.a != i1) {
                   this.b = new a$m();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 'z':
                i1 = 15;
                if (this.a != i1) {
                   this.b = new a$u0();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              case 130:
                i1 = 16;
                if (this.a != i1) {
                   this.b = new a$n1();
                }
                p0.readMessage(this.b);
                this.a = i1;
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_0175 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.c).equals("")) {
          p0.writeString(1, this.c);
       }
       int i = 2;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 3;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 4;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 5;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 6;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 7;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 8;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 9;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 10;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 11;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 12;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 13;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 14;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       i = 15;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       if (this.a == 16) {
          p0.writeMessage(16, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
