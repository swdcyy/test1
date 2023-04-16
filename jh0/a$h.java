package jh0.a$h;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$h extends MessageNano	// class@002b9f
{
    public int a;
    public long b;
    public long c;
    public static a$h[] d;

    public void a$h(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.cachedSize = -1;
    }
    public static a$h a(byte[] p0){
       return MessageNano.mergeFrom(new a$h(), p0);
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$h ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       ta = this.b;
       int i1 = 0;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, ta);
       }
       ta = this.c;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readInt64();
                }
             }else {
                this.b = p0.readInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.a = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$h ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       ta = this.b;
       int i = 0;
       if (ta - i) {
          p0.writeInt64(2, ta);
       }
       ta = this.c;
       if (ta - i) {
          p0.writeInt64(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
