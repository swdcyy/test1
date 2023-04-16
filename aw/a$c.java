package aw.a$c;
import com.google.protobuf.nano.MessageNano;
import aw.a$b;
import com.google.protobuf.nano.InternalNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class a$c extends MessageNano	// class@000217
{
    public String a;
    public int b;
    public long c;
    public a$b[] d;
    public String e;
    public int f;
    public static a$c[] g;

    public void a$c(){
       super();
       this.a = "";
       int i = 0;
       this.b = i;
       this.c = 0;
       if (a$b.k == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (a$b.k == null) {
             a$b[] uobArray = new a$b[i];
             a$b.k = uobArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.d = a$b.k;
       this.e = "";
       this.f = i;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.a).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.a);
       }
       a$c tb = this.b;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tb);
       }
       a$c tc = this.c;
       if (tc) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tc);
       }
       tb = this.d;
       if (tb != null && tb.length > 0) {
          int i1 = 0;
          tc = this.d;
          while (i1 < tc.length) {
             object oobject = tc[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.e).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.e);
       }
       tb = this.f;
       if (tb != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tb);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.f = i;
                            }
                         }
                      }else {
                         this.e = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      a$c td = this.d;
                      int i2 = (td == null)? 0: td.length;
                      i = i + i2;
                      a$b[] uobArray = new a$b[i];
                      if (i2) {
                         System.arraycopy(td, 0, uobArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         uobArray[i2] = new a$b();
                         p0.readMessage(uobArray[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      uobArray[i2] = new a$b();
                      p0.readMessage(uobArray[i2]);
                      this.d = uobArray;
                   }
                }else {
                   this.c = p0.readUInt64();
                }
             }else {
                this.b = p0.readUInt32();
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
       a$c tb = this.b;
       if (tb != null) {
          p0.writeUInt32(2, tb);
       }
       a$c tc = this.c;
       if (tc) {
          p0.writeUInt64(3, tc);
       }
       tb = this.d;
       if (tb != null && tb.length > 0) {
          int i = 0;
          tc = this.d;
          while (i < tc.length) {
             object oobject = tc[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.e).equals(str)) {
          p0.writeString(5, this.e);
       }
       tb = this.f;
       if (tb != null) {
          p0.writeInt32(6, tb);
       }
       super.writeTo(p0);
       return;
    }
}
