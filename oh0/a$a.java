package oh0.a$a;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.InternalNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedInputByteBufferNano;

public final class a$a extends MessageNano	// class@0034ea
{
    public String a;
    public String b;
    public byte[] c;
    public boolean d;
    public String e;
    public int f;
    public boolean g;
    public boolean h;
    public static a$a[] i;

    public void a$a(){
       super();
       this.a = "";
       this.b = "";
       this.c = WireFormatNano.EMPTY_BYTES;
       this.d = false;
       this.e = "";
       this.f = 0;
       this.g = false;
       this.h = false;
       this.cachedSize = -1;
    }
    public static a$a[] a(){
       if (a$a.i == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$a.i == null) {
             a$a[] uoaArray = new a$a[0];
             a$a.i = uoaArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return a$a.i;
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
       if (!Arrays.equals(this.c, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.c);
       }
       a$a td = this.d;
       if (td != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, td);
       }
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       td = this.f;
       if (td != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, td);
       }
       td = this.g;
       if (td != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, td);
       }
       td = this.h;
       if (td != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, td);
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
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.h = p0.readBool();
                               }
                            }else {
                               this.g = p0.readBool();
                            }
                         }else {
                            this.f = p0.readInt32();
                         }
                      }else {
                         this.e = p0.readString();
                      }
                   }else {
                      this.d = p0.readBool();
                   }
                }else {
                   this.c = p0.readBytes();
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
       if (!Arrays.equals(this.c, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(3, this.c);
       }
       a$a td = this.d;
       if (td != null) {
          p0.writeBool(4, td);
       }
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       td = this.f;
       if (td != null) {
          p0.writeInt32(6, td);
       }
       td = this.g;
       if (td != null) {
          p0.writeBool(7, td);
       }
       td = this.h;
       if (td != null) {
          p0.writeBool(8, td);
       }
       super.writeTo(p0);
       return;
    }
}
