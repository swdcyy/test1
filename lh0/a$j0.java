package lh0.a$j0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$h0;

public final class a$j0 extends MessageNano	// class@002f22
{
    public a$h0 a;
    public static a$j0[] b;

    public void a$j0(){
       super();
       this.a = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$j0 ta = this.a;
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
             this.a = new a$h0();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$j0 ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       super.writeTo(p0);
       return;
    }
}
