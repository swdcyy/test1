package lh0.a$k;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$k extends MessageNano	// class@002f27
{
    public long a;
    public String b;
    public int c;
    public static a$k[] d;

    public void a$k(){
       super();
       this.a = 0;
       this.b = "";
       this.c = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$k ta = this.a;
       if (ta) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, ta);
       }
       if (!(this.b).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ta);
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
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                      continue ;
                   }else {
                      this.c = i;
                   }
                }
             }else {
                this.b = p0.readString();
             }
          }else {
             this.a = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$k ta = this.a;
       if (ta) {
          p0.writeInt64(1, ta);
       }
       if (!(this.b).equals("")) {
          p0.writeString(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
