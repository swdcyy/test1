package as4.d;
import com.google.protobuf.nano.MessageNano;
import as4.e;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class d extends MessageNano	// class@0002e5
{
    public e[] a;
    public String b;
    public String c;
    public int d;
    public int e;
    public static d[] f;

    public void d(){
       super();
       if (e.d == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (e.d == null) {
             e[] uoeArray = new e[0];
             e.d = uoeArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = e.d;
       this.b = "";
       this.c = "";
       this.d = 0;
       this.e = 0;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       d ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          d ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.b).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.b);
       }
       if (!(this.c).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       ta = this.d;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       int i3;
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   i2 = 2;
                   i3 = 1;
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != i3 && i != i2)) {
                            continue ;
                         }else {
                            this.e = i;
                         }
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != i3 && i != i2)) {
                         continue ;
                      }else {
                         this.d = i;
                      }
                   }
                }else {
                   this.c = p0.readString();
                }
             }else {
                this.b = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             d ta = this.a;
             i2 = 0;
             i3 = (ta == null)? 0: ta.length;
             i = i + i3;
             e[] uoeArray = new e[i];
             if (i3) {
                System.arraycopy(ta, i2, uoeArray, i2, i3);
             }
             i1 = i - 1;
             while (i3 < i1) {
                uoeArray[i3] = new e();
                p0.readMessage(uoeArray[i3]);
                p0.readTag();
                i3 = i3 + 1;
             }
             uoeArray[i3] = new e();
             p0.readMessage(uoeArray[i3]);
             this.a = uoeArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       d ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          d ta1 = this.a;
          while (i < ta1.length) {
             object oobject = ta1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.b).equals(str)) {
          p0.writeString(2, this.b);
       }
       if (!(this.c).equals(str)) {
          p0.writeString(3, this.c);
       }
       ta = this.d;
       if (ta != null) {
          p0.writeInt32(4, ta);
       }
       ta = this.e;
       if (ta != null) {
          p0.writeInt32(5, ta);
       }
       super.writeTo(p0);
       return;
    }
}
