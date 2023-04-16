package lh0.a$b1;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$b1 extends MessageNano	// class@002f06
{
    public String a;
    public boolean b;
    public boolean c;
    public static a$b1[] d;

    public void a$b1(){
       super();
       this.a = "";
       this.b = false;
       this.c = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$b1 tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tb);
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
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readBool();
                }
             }else {
                this.b = p0.readBool();
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
       a$b1 tb = this.b;
       if (tb != null) {
          p0.writeBool(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          p0.writeBool(3, tb);
       }
       super.writeTo(p0);
       return;
    }
}
