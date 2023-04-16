package lh0.a$j;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$q0;
import lh0.a$p0;
import lh0.a$b;

public final class a$j extends MessageNano	// class@002f24
{
    public a$b a;
    public a$p0 b;
    public a$q0 c;
    public static a$j[] d;

    public void a$j(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$j ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.c == null){
                   this.c = new a$q0();
                }
                p0.readMessage(this.c);
             }else if(this.b == null){
                this.b = new a$p0();
             }
             p0.readMessage(this.b);
          }else if(this.a == null){
             this.a = new a$b();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$j ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeMessage(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
