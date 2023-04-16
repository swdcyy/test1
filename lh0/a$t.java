package lh0.a$t;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$t extends MessageNano	// class@002f44
{
    public String a;
    public String b;
    public int c;
    public static a$t[] d;

    public void a$t(){
       super();
       this.a = "";
       this.b = "";
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       a$t tc = this.c;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tc);
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
                   this.c = p0.readInt32();
                }
             }else {
                this.b = p0.readString();
             }
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
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       a$t tc = this.c;
       if (tc != null) {
          p0.writeInt32(3, tc);
       }
       super.writeTo(p0);
       return;
    }
}
