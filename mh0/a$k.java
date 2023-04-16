package mh0.a$k;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$k extends MessageNano	// class@00316e
{
    public static a$k[] a;

    public void a$k(){
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
