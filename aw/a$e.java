package aw.a$e;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$e extends MessageNano	// class@000219
{
    public long a;
    public long b;
    public static a$e[] c;

    public void a$e(){
       super();
       this.a = 0;
       this.b = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$e ta = this.a;
       int i1 = 0;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ta);
       }
       ta = this.b;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.b = p0.readUInt64();
             }
          }else {
             this.a = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$e ta = this.a;
       int i = 0;
       if (ta - i) {
          p0.writeUInt64(1, ta);
       }
       ta = this.b;
       if (ta - i) {
          p0.writeUInt64(2, ta);
       }
       super.writeTo(p0);
       return;
    }
}
