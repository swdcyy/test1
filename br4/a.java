package br4.a;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a extends MessageNano	// class@0003bb
{
    public String a;
    public String b;
    public String c;
    public static a[] d;

    public void a(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.cachedSize = -1;
    }
    public static a a(byte[] p0){
       return MessageNano.mergeFrom(new a(), p0);
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
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
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.c = p0.readString();
                }
             }else {
                this.b = p0.readString();
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
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       if (!(this.c).equals(str)) {
          p0.writeString(3, this.c);
       }
       super.writeTo(p0);
       return;
    }
}
