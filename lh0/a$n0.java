package lh0.a$n0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$n0 extends MessageNano	// class@002f2e
{
    public static a$n0[] a;

    public void a$n0(){
       super();
       this.cachedSize = -1;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
