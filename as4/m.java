package as4.m;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class m extends MessageNano	// class@0002ee
{
    public String a;
    public int b;
    public String c;
    public static m[] d;

    public void m(){
       super();
       this.a = "";
       this.b = 0;
       this.c = "";
       this.cachedSize = -1;
    }
    public static m[] a(){
       if (m.d == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (m.d == null) {
             m[] omArray = new m[0];
             m.d = omArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return m.d;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       m tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tb);
       }
       if (!(this.c).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readString();
                }
             }else {
                this.b = p0.readUInt32();
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
       m tb = this.b;
       if (tb != null) {
          p0.writeUInt32(2, tb);
       }
       if (!(this.c).equals(str)) {
          p0.writeString(3, this.c);
       }
       super.writeTo(p0);
       return;
    }
}
