package lh0.a$o0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$c;

public final class a$o0 extends MessageNano	// class@002f31
{
    public a$c a;
    public static a$o0[] b;

    public void a$o0(){
       super();
       this.a = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$o0 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 18) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.a == null){
             this.a = new a$c();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$o0 ta = this.a;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
