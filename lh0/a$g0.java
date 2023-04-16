package lh0.a$g0;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$g0 extends MessageNano	// class@002f17
{
    public String a;
    public static a$g0[] b;

    public void a$g0(){
       super();
       this.a = "";
       this.cachedSize = -1;
    }
    public static a$g0[] a(){
       if (a$g0.b == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$g0.b == null) {
             a$g0[] og0Array = new a$g0[0];
             a$g0.b = og0Array;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return a$g0.b;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
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
       super.writeTo(p0);
       return;
    }
}
