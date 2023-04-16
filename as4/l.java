package as4.l;
import com.google.protobuf.nano.MessageNano;
import as4.v;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class l extends MessageNano	// class@0002ed
{
    public boolean a;
    public v[] b;
    public int c;
    public static l[] d;

    public void l(){
       super();
       boolean b = false;
       this.a = b;
       if (v.b == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (v.b == null) {
             v[] ovArray = new v[b];
             v.b = ovArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       this.b = v.b;
       this.c = b;
       this.cachedSize = -1;
       return;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       l ta = this.a;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, ta);
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          l tb = this.b;
          while (i1 < tb.length) {
             object oobject = tb[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.c;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.c = i;
                   }
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                l tb = this.b;
                int i2 = (tb == null)? 0: tb.length;
                i = i + i2;
                v[] ovArray = new v[i];
                if (i2) {
                   System.arraycopy(tb, 0, ovArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ovArray[i2] = new v();
                   p0.readMessage(ovArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ovArray[i2] = new v();
                p0.readMessage(ovArray[i2]);
                this.b = ovArray;
             }
          }else {
             this.a = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       l ta = this.a;
       if (ta != null) {
          p0.writeBool(1, ta);
       }
       ta = this.b;
       if (ta != null && ta.length > 0) {
          int i = 0;
          l tb = this.b;
          while (i < tb.length) {
             object oobject = tb[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       ta = this.c;
       if (ta != null) {
          p0.writeInt32(3, ta);
       }
       super.writeTo(p0);
       return;
    }
}
