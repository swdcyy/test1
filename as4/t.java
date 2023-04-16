package as4.t;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class t extends MessageNano	// class@0002f5
{
    public static t[] a;

    public void t(){
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
