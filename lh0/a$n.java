package lh0.a$n;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class a$n extends MessageNano	// class@002f30
{
    public long a;
    public long b;
    public int c;
    public String d;
    public int e;
    public static a$n[] f;

    public void a$n(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = "";
       this.e = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$n ta = this.a;
       int i1 = 0;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, ta);
       }
       ta = this.b;
       if (ta - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ta);
       }
       if (!(this.d).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                            continue ;
                         }else {
                            this.e = i;
                         }
                      }
                   }else {
                      this.d = p0.readString();
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
                this.b = p0.readInt64();
             }
          }else {
             this.a = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$n ta = this.a;
       int i = 0;
       if (ta - i) {
          p0.writeInt64(1, ta);
       }
       ta = this.b;
       if (ta - i) {
          p0.writeInt64(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       if (!(this.d).equals("")) {
          p0.writeString(4, this.d);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeInt32(5, ta);
       }
       super.writeTo(p0);
       return;
    }
}
