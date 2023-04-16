package lh0.a$c1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$c1 extends MessageNano	// class@002f0b
{
    public int a;
    public static a$c1[] b;

    public void a$c1(){
       super();
       this.a = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$c1 ta = this.a;
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
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.a = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$c1 ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       super.writeTo(p0);
       return;
    }
}
