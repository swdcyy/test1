package as4.z;
import com.google.protobuf.nano.MessageNano;
import as4.m;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.System;
import as4.e;

public final class z extends MessageNano	// class@0002fb
{
    public m[] a;
    public e b;
    public int[] c;
    public static z[] d;

    public void z(){
       super();
       this.a = m.a();
       this.b = null;
       this.c = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i2;
       z ta1;
       int i = super.computeSerializedSize();
       z ta = this.a;
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
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ta);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          i2 = 0;
          ta1 = this.c;
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
       z tc;
       int i = p0.readTag();
       while (i) {
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                i1 = 24;
                if (i != i1) {
                   if (i != 26) {
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
                      tc = this.c;
                      int i3 = (tc == null)? 0: tc.length;
                      i2 = i2 + i3;
                      int[] ointArray = new int[i2];
                      if (i3) {
                         System.arraycopy(tc, 0, ointArray, 0, i3);
                      }
                      while (i3 < i2) {
                         ointArray[i3] = p0.readUInt32();
                         i3 = i3 + 1;
                      }
                      this.c = ointArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tc = this.c;
                   i2 = (tc == null)? 0: tc.length;
                   i = i + i2;
                   int[] ointArray1 = new int[i];
                   if (i2) {
                      System.arraycopy(tc, 0, ointArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      ointArray1[i2] = p0.readUInt32();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   ointArray1[i2] = p0.readUInt32();
                   this.c = ointArray1;
                }
             }else if(this.b == null){
                this.b = new e();
             }
             p0.readMessage(this.b);
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tc = this.a;
             i2 = (tc == null)? 0: tc.length;
             i = i + i2;
             m[] omArray = new m[i];
             if (i2) {
                System.arraycopy(tc, 0, omArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                omArray[i2] = new m();
                p0.readMessage(omArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             omArray[i2] = new m();
             p0.readMessage(omArray[i2]);
             this.a = omArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       z ta = this.a;
       int i = 0;
       if (ta != null && ta.length > 0) {
          int i1 = 0;
          z ta1 = this.a;
          while (i1 < ta1.length) {
             object oobject = ta1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ta = this.b;
       if (ta != null) {
          p0.writeMessage(2, ta);
       }
       ta = this.c;
       if (ta != null && ta.length > 0) {
          ta = this.c;
          while (i < ta.length) {
             p0.writeUInt32(3, ta[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
