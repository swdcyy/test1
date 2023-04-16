package ih0.a$j;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$j extends MessageNano	// class@0028d1
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public static a$j[] e;

    public void a$j(){
       super();
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$j ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.d = p0.readBool();
                   }
                }else {
                   this.c = p0.readBool();
                }
             }else {
                this.b = p0.readBool();
             }
          }else {
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$j ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeBool(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeBool(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeBool(4, ta);
       }
       super.writeTo(p0);
       return;
    }
}
