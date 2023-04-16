package jh0.a$g;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$c;
import rh0.c$j0;
import rh0.c$d;

public final class a$g extends MessageNano	// class@002b9d
{
    public c$d a;
    public c$j0 b;
    public a$c c;
    public static a$g[] d;

    public void a$g(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$g ta = this.a;
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
                   this.c = new a$c();
                }
                p0.readMessage(this.c);
             }else if(this.b == null){
                this.b = new c$j0();
             }
             p0.readMessage(this.b);
          }else if(this.a == null){
             this.a = new c$d();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$g ta = this.a;
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
