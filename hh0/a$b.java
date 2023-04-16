package hh0.a$b;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import hh0.a$a;
import hh0.a$j;

public final class a$b extends MessageNano	// class@00269e
{
    public a$j a;
    public a$a b;
    public static a$b[] c;

    public void a$b(){
       super();
       this.a = null;
       this.b = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$b ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.b == null){
                this.b = new a$a();
             }
             p0.readMessage(this.b);
          }else if(this.a == null){
             this.a = new a$j();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$b ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
