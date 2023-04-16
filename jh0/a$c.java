package jh0.a$c;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;

public final class a$c extends MessageNano	// class@002b99
{
    public int a;
    public byte[] b;
    public long c;
    public static a$c[] d;

    public void a$c(){
       super();
       this.a = 0;
       this.b = WireFormatNano.EMPTY_BYTES;
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$c ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.b);
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
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readInt64();
                }
             }else {
                this.b = p0.readBytes();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                 case 10:
                 case 11:
                 case 12:
                 case 13:
                 case 14:
                 case 1:
                   break;
                 default:
             }
             this.a = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$c ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       if (!Arrays.equals(this.b, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.b);
       }
       ta = this.c;
       if (ta) {
          p0.writeInt64(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
