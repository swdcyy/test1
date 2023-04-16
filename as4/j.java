package as4.j;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class j extends MessageNano	// class@0002eb
{
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public static j[] i;

    public void j(){
       super();
       this.a = false;
       this.b = 0;
       this.c = false;
       this.d = false;
       this.e = false;
       this.f = false;
       this.g = 0;
       this.h = 0;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       j ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ta);
       }
       ta = this.g;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, ta);
       }
       ta = this.h;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, ta);
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
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.h = p0.readUInt32();
                               }
                            }else {
                               this.g = p0.readUInt32();
                            }
                         }else {
                            this.f = p0.readBool();
                         }
                      }else {
                         this.e = p0.readBool();
                      }
                   }else {
                      this.d = p0.readBool();
                   }
                }else {
                   this.c = p0.readBool();
                }
             }else {
                this.b = p0.readUInt32();
             }
          }else {
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       j ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeUInt32(2, ta);
       }
       ta = this.c;
       if (ta != null) {
          p0.writeBool(3, ta);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeBool(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeBool(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          p0.writeBool(6, ta);
       }
       ta = this.g;
       if (ta != null) {
          p0.writeUInt32(7, ta);
       }
       ta = this.h;
       if (ta != null) {
          p0.writeUInt32(8, ta);
       }
       super.writeTo(p0);
       return;
    }
}
