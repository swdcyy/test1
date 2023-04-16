package as4.v;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class v extends MessageNano	// class@0002f7
{
    public int[] a;
    public static v[] b;

    public void v(){
       super();
       this.a = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       v ta = this.a;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          int i2 = 0;
          v ta1 = this.a;
          while (i1 < ta1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(ta1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (ta1.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       v ta;
       int i = p0.readTag();
       while (i) {
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(i1);
                ta = this.a;
                int i3 = (ta == null)? 0: ta.length;
                i2 = i2 + i3;
                int[] ointArray = new int[i2];
                if (i3) {
                   System.arraycopy(ta, 0, ointArray, 0, i3);
                }
                while (i3 < i2) {
                   ointArray[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.a = ointArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ta = this.a;
             i2 = (ta == null)? 0: ta.length;
             i = i + i2;
             int[] ointArray1 = new int[i];
             if (i2) {
                System.arraycopy(ta, 0, ointArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ointArray1[i2] = p0.readUInt32();
                p0.readTag();
                i2 = i2 + 1;
             }
             ointArray1[i2] = p0.readUInt32();
             this.a = ointArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       v ta = this.a;
       if (ta != null && ta.length > 0) {
          int i = 0;
          v ta1 = this.a;
          while (i < ta1.length) {
             p0.writeUInt32(1, ta1[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
