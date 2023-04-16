package lh0.b$a;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import rh0.a$c;
import rh0.c$d;

public final class b$a extends MessageNano	// class@002f59
{
    public c$d a;
    public a$c b;
    public byte[] c;
    public int d;
    public static b$a[] e;

    public void b$a(){
       super();
       this.a = null;
       this.b = null;
       this.c = WireFormatNano.EMPTY_BYTES;
       this.d = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       b$a ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       if (!Arrays.equals(this.c, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.c);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.d = p0.readInt32();
                   }
                }else {
                   this.c = p0.readBytes();
                }
             }else if(this.b == null){
                this.b = new a$c();
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
       b$a ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       if (!Arrays.equals(this.c, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(3, this.c);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeInt32(4, ta);
       }
       super.writeTo(p0);
       return;
    }
}
