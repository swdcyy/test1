package jh0.a$i;
import com.google.protobuf.nano.MessageNano;
import oh0.a$a;
import oh0.a$e;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$i extends MessageNano	// class@002ba0
{
    public a$a[] a;
    public a$e[] b;
    public a$e[] c;
    public static a$i[] d;

    public void a$i(){
       super();
       this.a = a$a.a();
       this.b = a$e.a();
       this.c = a$e.a();
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i2;
       a$i ta1;
       object oobject;
       int i = super.computeSerializedSize();
       a$i ta = this.a;
       int i1 = 0;
       if (ta != null && ta.length > 0) {
          i2 = 0;
          ta1 = this.a;
          while (i2 < ta1.length) {
             oobject = ta1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          i2 = 0;
          ta1 = this.b;
          while (i2 < ta1.length) {
             oobject = ta1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          ta = this.c;
          while (i1 < ta.length) {
             object oobject1 = ta[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       a$i tc;
       int i2;
       a$e[] uoeArray;
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tc = this.c;
                   i2 = (tc == null)? 0: tc.length;
                   i = i + i2;
                   uoeArray = new a$e[i];
                   if (i2) {
                      System.arraycopy(tc, 0, uoeArray, 0, i2);
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
                tc = this.b;
                i2 = (tc == null)? 0: tc.length;
                i = i + i2;
                uoeArray = new a$e[i];
                if (i2) {
                   System.arraycopy(tc, 0, uoeArray, 0, i2);
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
                this.b = uoeArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tc = this.a;
             i2 = (tc == null)? 0: tc.length;
             i = i + i2;
             a$a[] uoaArray = new a$a[i];
             if (i2) {
                System.arraycopy(tc, 0, uoaArray, 0, i2);
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
             this.a = uoaArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       a$i ta1;
       object oobject;
       a$i ta = this.a;
       int i = 0;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          ta1 = this.a;
          while (i1 < ta1.length) {
             oobject = ta1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          i1 = 0;
          ta1 = this.b;
          while (i1 < ta1.length) {
             oobject = ta1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          ta = this.c;
          while (i < ta.length) {
             object oobject1 = ta[i];
             if (oobject1 != null) {
                p0.writeMessage(3, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
