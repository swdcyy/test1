package lh0.a$a2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import lh0.a$h0;
import lh0.a$j;

public final class a$a2 extends MessageNano	// class@002f03
{
    public a$j a;
    public a$h0 b;
    public static a$a2[] c;

    public void a$a2(){
       super();
       this.a = null;
       this.b = null;
       this.cachedSize = -1;
    }
    public static a$a2[] a(){
       if (a$a2.c == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$a2.c == null) {
             a$a2[] uoa2Array = new a$a2[0];
             a$a2.c = uoa2Array;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return a$a2.c;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$a2 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.b == null){
                this.b = new a$h0();
             }
             p0.readMessage(this.b);
          }else if(this.a == null){
             this.a = new a$j();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$a2 ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
