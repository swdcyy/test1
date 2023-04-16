package lh0.a$q0;
import com.google.protobuf.nano.MessageNano;
import lh0.a$r0;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class a$q0 extends MessageNano	// class@002f37
{
    public boolean a;
    public int b;
    public a$r0[] c;
    public static a$q0[] d;

    public void a$q0(){
       super();
       boolean b = false;
       this.a = b;
       this.b = b;
       if (a$r0.d == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$r0.d == null) {
             a$r0[] or0Array = new a$r0[b];
             a$r0.d = or0Array;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.c = a$r0.d;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       a$q0 ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ta);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          a$q0 tc = this.c;
          while (i1 < tc.length) {
             object oobject = tc[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   a$q0 tc = this.c;
                   int i2 = (tc == null)? 0: tc.length;
                   i = i + i2;
                   a$r0[] or0Array = new a$r0[i];
                   if (i2) {
                      System.arraycopy(tc, 0, or0Array, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      or0Array[i2] = new a$r0();
                      p0.readMessage(or0Array[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   or0Array[i2] = new a$r0();
                   p0.readMessage(or0Array[i2]);
                   this.c = or0Array;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.b = i;
                }
             }
          }else {
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       a$q0 ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeInt32(2, ta);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          int i = 0;
          a$q0 tc = this.c;
          while (i < tc.length) {
             object oobject = tc[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
