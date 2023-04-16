package lh0.a$a0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$a0 extends MessageNano	// class@002f00
{
    public long a;
    public String b;
    public static a$a0[] c;

    public void a$a0(){
       super();
       this.a = 0;
       this.b = "";
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$a0 ta = this.a;
       if (ta) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, ta);
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
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
                this.b = p0.readString();
             }
          }else {
             this.a = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$a0 ta = this.a;
       if (ta) {
          p0.writeInt64(1, ta);
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
