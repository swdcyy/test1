package jh0.a$j;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;

public final class a$j extends MessageNano	// class@002ba1
{
    public int a;
    public byte[] b;
    public static a$j[] c;

    public void a$j(){
       super();
       this.a = 0;
       this.b = WireFormatNano.EMPTY_BYTES;
       this.cachedSize = -1;
    }
    public static a$j a(byte[] p0){
       return MessageNano.mergeFrom(new a$j(), p0);
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$j ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
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
             }else {
                this.b = p0.readBytes();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.a = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$j ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
