package lh0.a$u0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$t0;

public final class a$u0 extends MessageNano	// class@002f45
{
    public a$t0 a;
    public static a$u0[] b;

    public void a$u0(){
       super();
       this.a = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$u0 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.a == null){
             this.a = new a$t0();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$u0 ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       super.writeTo(p0);
       return;
    }
}
