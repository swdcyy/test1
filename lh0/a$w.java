package lh0.a$w;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$w extends MessageNano	// class@002f4e
{
    public long a;
    public String b;
    public int c;
    public String d;
    public boolean e;
    public static a$w[] f;

    public void a$w(){
       super();
       this.a = 0;
       this.b = "";
       this.c = 0;
       this.d = "";
       this.e = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$w ta = this.a;
       if (ta - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, ta);
       }
       String str = "";
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ta);
       }
       if (!(this.d).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.e = p0.readBool();
                      }
                   }else {
                      this.d = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
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
       a$w ta = this.a;
       if (ta - null) {
          p0.writeInt64(1, ta);
       }
       String str = "";
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       if (!(this.d).equals(str)) {
          p0.writeString(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeBool(5, ta);
       }
       super.writeTo(p0);
       return;
    }
}
