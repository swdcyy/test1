package ih0.a$d;
import com.google.protobuf.nano.MessageNano;
import java.lang.Double;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$d extends MessageNano	// class@0028cb
{
    public double a;
    public double b;
    public int c;
    public int d;
    public static a$d[] e;

    public void a$d(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       double d = 0;
       if (Double.doubleToLongBits(this.a) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(1, this.a);
       }
       if (Double.doubleToLongBits(this.b) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.b);
       }
       a$d tc = this.c;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tc);
       }
       tc = this.d;
       if (tc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 9) {
             if (i != 17) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.d = p0.readInt32();
                   }
                }else {
                   this.c = p0.readInt32();
                }
             }else {
                this.b = p0.readDouble();
             }
          }else {
             this.a = p0.readDouble();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       double d = 0;
       if (Double.doubleToLongBits(this.a) - Double.doubleToLongBits(d)) {
          p0.writeDouble(1, this.a);
       }
       if (Double.doubleToLongBits(this.b) - Double.doubleToLongBits(d)) {
          p0.writeDouble(2, this.b);
       }
       a$d tc = this.c;
       if (tc != null) {
          p0.writeInt32(3, tc);
       }
       tc = this.d;
       if (tc != null) {
          p0.writeInt32(4, tc);
       }
       super.writeTo(p0);
       return;
    }
}
