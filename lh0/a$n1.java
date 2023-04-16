package lh0.a$n1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$v1;

public final class a$n1 extends MessageNano	// class@002f2f
{
    public int a;
    public a$v1 b;
    public static a$n1[] c;

    public void a$n1(){
       super();
       this.a = 0;
       this.b = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$n1 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
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
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.b == null){
                this.b = new a$v1();
             }
             p0.readMessage(this.b);
          }else {
             i = p0.readInt32();
             if (i && (i != 3 && i != 4)) {
                continue ;
             }else {
                this.a = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$n1 ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
