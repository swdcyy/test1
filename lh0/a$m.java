package lh0.a$m;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$m extends MessageNano	// class@002f2d
{
    public boolean a;
    public static a$m[] b;

    public void a$m(){
       super();
       this.a = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$m ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
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
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$m ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       super.writeTo(p0);
       return;
    }
}
