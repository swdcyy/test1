package lh0.a$t1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$t1 extends MessageNano	// class@002f43
{
    public static a$t1[] a;

    public void a$t1(){
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
