package oh0.a$e;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import oh0.a$d;

public final class a$e extends MessageNano	// class@0034ee
{
    public a$d a;
    public String b;
    public static a$e[] c;

    public void a$e(){
       super();
       this.a = null;
       this.b = "";
       this.cachedSize = -1;
    }
    public static a$e[] a(){
       if (a$e.c == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$e.c == null) {
             a$e[] uoeArray = new a$e[0];
             a$e.c = uoeArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return a$e.c;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$e ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
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
             }else {
                this.b = p0.readString();
             }
          }else if(this.a == null){
             this.a = new a$d();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$e ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
