package lh0.a$v;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$c;

public final class a$v extends MessageNano	// class@002f4a
{
    public String a;
    public a$c b;
    public String c;
    public int d;
    public static a$v[] e;

    public void a$v(){
       super();
       this.a = "";
       this.b = null;
       this.c = "";
       this.d = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$v tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tb);
       }
       if (!(this.c).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       tb = this.d;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.d = p0.readInt32();
                   }
                }else {
                   this.c = p0.readString();
                }
             }else if(this.b == null){
                this.b = new a$c();
             }
             p0.readMessage(this.b);
          }else {
             this.a = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.a).equals(str)) {
          p0.writeString(1, this.a);
       }
       a$v tb = this.b;
       if (tb != null) {
          p0.writeMessage(2, tb);
       }
       if (!(this.c).equals(str)) {
          p0.writeString(3, this.c);
       }
       tb = this.d;
       if (tb != null) {
          p0.writeInt32(4, tb);
       }
       super.writeTo(p0);
       return;
    }
}
