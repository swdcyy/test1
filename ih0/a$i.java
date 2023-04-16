package ih0.a$i;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$i extends MessageNano	// class@0028d0
{
    public boolean a;
    public String b;
    public int c;
    public static a$i[] d;

    public void a$i(){
       super();
       this.a = false;
       this.b = "";
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$i ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
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
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$i ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
