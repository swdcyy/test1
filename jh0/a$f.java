package jh0.a$f;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$f extends MessageNano	// class@002b9c
{
    public String a;
    public long b;
    public int c;
    public static a$f[] d;

    public void a$f(){
       super();
       this.a = "";
       this.b = 0;
       this.c = 0;
       this.cachedSize = -1;
    }
    public static a$f a(byte[] p0){
       return MessageNano.mergeFrom(new a$f(), p0);
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.a).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$f tb = this.b;
       if (tb) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tb);
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
                   i = p0.readInt32();
                   if (i) {
                      switch (i){
                          case 2:
                          case 4:
                          case 5:
                          case 6:
                          case 7:
                          case 8:
                          case 3:
                            break;
                          default:
                      }
                   }
                   this.c = i;
                }
             }else {
                this.b = p0.readInt64();
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
       a$f tb = this.b;
       if (tb) {
          p0.writeInt64(2, tb);
       }
       tb = this.c;
       if (tb != null) {
          p0.writeInt32(3, tb);
       }
       super.writeTo(p0);
       return;
    }
}
