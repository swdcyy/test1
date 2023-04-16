package lh0.b$d;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class b$d extends MessageNano	// class@002f5c
{
    public int a;
    public int b;
    public static b$d[] c;

    public void b$d(){
       super();
       this.a = 0;
       this.b = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       b$d ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.b = p0.readInt32();
             }
          }else {
             this.a = p0.readInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       b$d ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeInt32(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
