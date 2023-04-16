package ih0.a$c;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import ih0.a$a;

public final class a$c extends MessageNano	// class@0028ca
{
    public int a;
    public a$a b;
    public static a$c[] c;

    public void a$c(){
       super();
       this.a = 0;
       this.b = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$c ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ta);
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
                this.b = new a$a();
             }
             p0.readMessage(this.b);
          }else {
             this.a = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$c ta = this.a;
       if (ta != null) {
          p0.writeUInt32(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
