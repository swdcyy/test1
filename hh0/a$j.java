package hh0.a$j;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import rh0.a$c;

public final class a$j extends MessageNano	// class@0026a6
{
    public a$c a;
    public int b;
    public long c;
    public static a$j[] d;

    public void a$j(){
       super();
       this.a = null;
       this.b = 0;
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$j ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ta);
       }
       ta = this.c;
       if (ta) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, ta);
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
                   this.c = p0.readInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.b = i;
                }
             }
          }else if(this.a == null){
             this.a = new a$c();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$j ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeInt32(2, ta);
       }
       ta = this.c;
       if (ta) {
          p0.writeInt64(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
