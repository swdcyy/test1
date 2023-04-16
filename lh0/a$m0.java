package lh0.a$m0;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$w1;
import lh0.a$x1;

public final class a$m0 extends MessageNano	// class@002f2b
{
    public int a;
    public Object b;
    public String c;
    public static a$m0[] d;

    public void a$m0(){
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
       if (this.a == 3) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, this.b);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i1 = 3;
                   if (this.a != i1) {
                      this.b = new a$w1();
                   }
                   p0.readMessage(this.b);
                   this.a = i1;
                }
             }else {
                i1 = 2;
                if (this.a != i1) {
                   this.b = new a$x1();
                }
                p0.readMessage(this.b);
                this.a = i1;
             }
          }else {
             this.c = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.c).equals("")) {
          p0.writeString(1, this.c);
       }
       int i = 2;
       if (this.a == i) {
          p0.writeMessage(i, this.b);
       }
       if (this.a == 3) {
          p0.writeMessage(3, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
