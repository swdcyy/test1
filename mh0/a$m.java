package mh0.a$m;
import com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$m extends MessageNano	// class@003170
{
    public String a;
    public String b;
    public String c;
    public long d;
    public int e;
    public static a$m[] f;

    public void a$m(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = 0;
       this.e = 0;
       this.cachedSize = -1;
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
       a$m td = this.d;
       if (td) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, td);
       }
       td = this.e;
       if (td != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, td);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.e = p0.readInt32();
                      }
                   }else {
                      this.d = p0.readInt64();
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
       a$m td = this.d;
       if (td) {
          p0.writeInt64(4, td);
       }
       td = this.e;
       if (td != null) {
          p0.writeInt32(5, td);
       }
       super.writeTo(p0);
       return;
    }
}
