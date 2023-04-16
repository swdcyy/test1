package lh0.a$f1;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$c;

public final class a$f1 extends MessageNano	// class@002f15
{
    public boolean a;
    public a$c b;
    public int c;
    public static a$f1[] d;

    public void a$f1(){
       super();
       this.a = false;
       this.b = null;
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$f1 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
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
             }else if(this.b == null){
                this.b = new a$c();
             }
             p0.readMessage(this.b);
          }else {
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$f1 ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
