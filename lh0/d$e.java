package lh0.d$e;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class d$e extends MessageNano	// class@002f67
{
    public String a;
    public int b;
    public int c;
    public static d$e[] d;

    public void d$e(){
       super();
       this.a = "";
       this.b = 0;
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       d$e tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readInt32();
                }
             }else {
                this.b = p0.readInt32();
             }
          }else {
             this.a = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.a).equals("")) {
          p0.writeString(1, this.a);
       }
       d$e tb = this.b;
       if (tb != null) {
          p0.writeInt32(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          p0.writeInt32(3, tb);
       }
       super.writeTo(p0);
       return;
    }
}
