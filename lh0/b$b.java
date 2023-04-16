package lh0.b$b;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import rh0.c$d;

public final class b$b extends MessageNano	// class@002f5a
{
    public c$d a;
    public byte[] b;
    public int c;
    public static b$b[] d;

    public void b$b(){
       super();
       this.a = null;
       this.b = WireFormatNano.EMPTY_BYTES;
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       b$b ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readInt32();
                }
             }else {
                this.b = p0.readBytes();
             }
          }else if(this.a == null){
             this.a = new c$d();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       b$b ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
