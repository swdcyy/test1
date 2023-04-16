package lh0.a$l;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$l extends MessageNano	// class@002f2a
{
    public static a$l[] a;

    public void a$l(){
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
