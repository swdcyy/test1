package as4.f;
import com.google.protobuf.nano.MessageNano;
import as4.n;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class f extends MessageNano	// class@0002e7
{
    public int a;
    public String b;
    public n[] c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public static f[] k;

    public void f(){
       super();
       this.a = 0;
       this.b = "";
       this.c = n.a();
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = "";
       this.h = "";
       this.i = "";
       this.j = "";
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       f ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ta);
       }
       String str = "";
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          f tc = this.c;
          while (i1 < tc.length) {
             object oobject = tc[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, ta);
       }
       if (!(this.g).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.g);
       }
       if (!(this.h).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.h);
       }
       if (!(this.i).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.i);
       }
       if (!(this.j).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.j);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          f uof = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != i1 && i != uof)) {
                   continue ;
                }else {
                   this.a = i;
                }
                break;
              case 18:
                this.b = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                uof = this.c;
                i1 = 0;
                int i2 = (uof == null)? 0: uof.length;
                i = i + i2;
                n[] onArray = new n[i];
                if (i2) {
                   System.arraycopy(uof, i1, onArray, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   onArray[i2] = new n();
                   p0.readMessage(onArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                onArray[i2] = new n();
                p0.readMessage(onArray[i2]);
                this.c = onArray;
                break;
              case 32:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 1:
                      break;
                    default:
                }
                this.d = i;
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != i1 && i != uof)) {
                   continue ;
                }else {
                   this.e = i;
                }
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != i1 && i != uof)) {
                   continue ;
                }else {
                   this.f = i;
                }
                break;
              case ':':
                this.g = p0.readString();
                break;
              case 'B':
                this.h = p0.readString();
                break;
              case 'J':
                this.i = p0.readString();
                break;
              case 'R':
                this.j = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   goto label_00a8 ;
                }
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       f ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       String str = "";
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          int i = 0;
          f tc = this.c;
          while (i < tc.length) {
             object oobject = tc[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       ta = this.d;
       if (ta != null) {
          p0.writeInt32(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeInt32(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          p0.writeInt32(6, ta);
       }
       if (!(this.g).equals(str)) {
          p0.writeString(7, this.g);
       }
       if (!(this.h).equals(str)) {
          p0.writeString(8, this.h);
       }
       if (!(this.i).equals(str)) {
          p0.writeString(9, this.i);
       }
       if (!(this.j).equals(str)) {
          p0.writeString(10, this.j);
       }
       super.writeTo(p0);
       return;
    }
}
