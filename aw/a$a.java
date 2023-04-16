package aw.a$a;
import com.google.protobuf.nano.MessageNano;
import aw.a$e;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class a$a extends MessageNano	// class@000215
{
    public a$e[] a;
    public long[] b;
    public static a$a[] c;

    public void a$a(){
       super();
       if (a$e.c == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$e.c == null) {
             a$e[] uoeArray = new a$e[0];
             a$e.c = uoeArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.a = a$e.c;
       this.b = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i2;
       a$a ta1;
       int i = super.computeSerializedSize();
       a$a ta = this.a;
       int i1 = 0;
       if (ta != null && ta.length > 0) {
          i2 = 0;
          ta1 = this.a;
          while (i2 < ta1.length) {
             object oobject = ta1[i2];
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
          while (i1 < ta1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(ta1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (ta1.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       a$a tb;
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             i1 = 16;
             if (i != i1) {
                if (i != 18) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.pushLimit(p0.readRawVarint32());
                   i1 = p0.getPosition();
                   i2 = 0;
                   while (p0.getBytesUntilLimit() > 0) {
                      p0.readUInt64();
                      i2 = i2 + 1;
                   }
                   p0.rewindToPosition(i1);
                   tb = this.b;
                   int i3 = (tb == null)? 0: tb.length;
                   i2 = i2 + i3;
                   long[] olongArray = new long[i2];
                   if (i3) {
                      System.arraycopy(tb, 0, olongArray, 0, i3);
                   }
                   while (i3 < i2) {
                      olongArray[i3] = p0.readUInt64();
                      i3 = i3 + 1;
                   }
                   this.b = olongArray;
                   p0.popLimit(i);
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tb = this.b;
                i2 = (tb == null)? 0: tb.length;
                i = i + i2;
                long[] olongArray1 = new long[i];
                if (i2) {
                   System.arraycopy(tb, 0, olongArray1, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   olongArray1[i2] = p0.readUInt64();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                olongArray1[i2] = p0.readUInt64();
                this.b = olongArray1;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tb = this.a;
             i2 = (tb == null)? 0: tb.length;
             i = i + i2;
             a$e[] uoeArray = new a$e[i];
             if (i2) {
                System.arraycopy(tb, 0, uoeArray, 0, i2);
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
             this.a = uoeArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$a ta = this.a;
       int i = 0;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$a ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          ta = this.b;
          while (i < ta.length) {
             p0.writeUInt64(2, ta[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
