package mh0.a$d;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$d extends MessageNano	// class@003167
{
    public int a;
    public static a$d[] b;

    public void a$d(){
       super();
       this.a = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$d ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.a = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$d ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       super.writeTo(p0);
       return;
    }
}
