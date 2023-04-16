package mh0.a$c;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import mh0.a$d;

public final class a$c extends MessageNano	// class@003166
{
    public String a;
    public a$d b;
    public boolean c;
    public static a$c[] d;

    public void a$c(){
       super();
       this.a = "";
       this.b = null;
       this.c = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$c tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readBool();
                }
             }else if(this.b == null){
                this.b = new a$d();
             }
             p0.readMessage(this.b);
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
       a$c tb = this.b;
       if (tb != null) {
          p0.writeMessage(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          p0.writeBool(3, tb);
       }
       super.writeTo(p0);
       return;
    }
}
