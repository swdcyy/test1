package oh0.a$c;
import com.google.protobuf.nano.MessageNano;
import oh0.a$a;
import oh0.a$e;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import rh0.a$b;

public final class a$c extends MessageNano	// class@0034ec
{
    public a$b a;
    public a$a[] b;
    public a$e[] c;
    public a$e[] d;
    public boolean e;
    public boolean f;
    public static a$c[] g;

    public void a$c(){
       super();
       this.a = null;
       this.b = a$a.a();
       this.c = a$e.a();
       this.d = a$e.a();
       this.e = false;
       this.f = false;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i2;
       a$c tb;
       object oobject;
       int i = super.computeSerializedSize();
       a$c ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ta);
       }
       ta = this.b;
       int i1 = 0;
       if (ta != null && ta.length > 0) {
          i2 = 0;
          tb = this.b;
          while (i2 < tb.length) {
             oobject = tb[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          i2 = 0;
          tb = this.c;
          while (i2 < tb.length) {
             oobject = tb[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ta = this.d;
       if (ta != null && ta.length > 0) {
          ta = this.d;
          while (i1 < ta.length) {
             object oobject1 = ta[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       a$c td;
       int i2;
       a$e[] uoeArray;
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.f = p0.readBool();
                         }
                      }else {
                         this.e = p0.readBool();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      td = this.d;
                      i2 = (td == null)? 0: td.length;
                      i = i + i2;
                      uoeArray = new a$e[i];
                      if (i2) {
                         System.arraycopy(td, 0, uoeArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         uoeArray[i2] = new a$e();
                         p0.readMessage(uoeArray[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      uoeArray[i2] = new a$e();
                      p0.readMessage(uoeArray[i2]);
                      this.d = uoeArray;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   td = this.c;
                   i2 = (td == null)? 0: td.length;
                   i = i + i2;
                   uoeArray = new a$e[i];
                   if (i2) {
                      System.arraycopy(td, 0, uoeArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      uoeArray[i2] = new a$e();
                      p0.readMessage(uoeArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   uoeArray[i2] = new a$e();
                   p0.readMessage(uoeArray[i2]);
                   this.c = uoeArray;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                td = this.b;
                i2 = (td == null)? 0: td.length;
                i = i + i2;
                a$a[] uoaArray = new a$a[i];
                if (i2) {
                   System.arraycopy(td, 0, uoaArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uoaArray[i2] = new a$a();
                   p0.readMessage(uoaArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uoaArray[i2] = new a$a();
                p0.readMessage(uoaArray[i2]);
                this.b = uoaArray;
             }
          }else if(this.a == null){
             this.a = new a$b();
          }
          p0.readMessage(this.a);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       a$c tb;
       object oobject;
       a$c ta = this.a;
       if (ta != null) {
          p0.writeMessage(1, ta);
       }
       ta = this.b;
       int i = 0;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          tb = this.b;
          while (i1 < tb.length) {
             oobject = tb[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          tb = this.c;
          while (i1 < tb.length) {
             oobject = tb[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.d;
       if (ta != null && ta.length > 0) {
          ta = this.d;
          while (i < ta.length) {
             object oobject1 = ta[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       ta = this.e;
       if (ta != null) {
          p0.writeBool(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          p0.writeBool(6, ta);
       }
       super.writeTo(p0);
       return;
    }
}
