package as4.x;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import as4.l;
import java.lang.System;

public final class x extends MessageNano	// class@0002f9
{
    public int a;
    public int b;
    public String c;
    public int[] d;
    public boolean e;
    public l f;
    public static x[] g;

    public void x(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = "";
       this.d = WireFormatNano.EMPTY_INT_ARRAY;
       this.e = false;
       this.f = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       x ta = this.a;
       int i1 = 1;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, ta);
       }
       ta = this.b;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ta);
       }
       if (!(this.c).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.c);
       }
       ta = this.d;
       if (ta != null && ta.length > 0) {
          int i2 = 0;
          int i3 = 0;
          x td = this.d;
          while (i2 < td.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(td[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (td.length * 1);
       }
       ta = this.e;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, ta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       x td;
       int i = p0.readTag();
       while (i) {
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   int i1 = 32;
                   if (i != i1) {
                      if (i != 34) {
                         if (i != 40) {
                            if (i != 50) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.f == null){
                               this.f = new l();
                            }
                            p0.readMessage(this.f);
                         }else {
                            this.e = p0.readBool();
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
                         td = this.d;
                         int i3 = (td == null)? 0: td.length;
                         i2 = i2 + i3;
                         int[] ointArray = new int[i2];
                         if (i3) {
                            System.arraycopy(td, 0, ointArray, 0, i3);
                         }
                         while (i3 < i2) {
                            ointArray[i3] = p0.readUInt32();
                            i3 = i3 + 1;
                         }
                         this.d = ointArray;
                         p0.popLimit(i);
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      td = this.d;
                      i2 = (td == null)? 0: td.length;
                      i = i + i2;
                      int[] ointArray1 = new int[i];
                      if (i2) {
                         System.arraycopy(td, 0, ointArray1, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         ointArray1[i2] = p0.readUInt32();
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      ointArray1[i2] = p0.readUInt32();
                      this.d = ointArray1;
                   }
                }else {
                   this.c = p0.readString();
                }
             }else {
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
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 1:
                      break;
                    default:
                }
                this.b = i;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.a = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       x ta = this.a;
       if (ta != null) {
          p0.writeInt32(1, ta);
       }
       ta = this.b;
       if (ta != null) {
          p0.writeInt32(2, ta);
       }
       if (!(this.c).equals("")) {
          p0.writeString(3, this.c);
       }
       ta = this.d;
       if (ta != null && ta.length > 0) {
          int i = 0;
          x td = this.d;
          while (i < td.length) {
             p0.writeUInt32(4, td[i]);
             i = i + 1;
          }
       }
       ta = this.e;
       if (ta != null) {
          p0.writeBool(5, ta);
       }
       ta = this.f;
       if (ta != null) {
          p0.writeMessage(6, ta);
       }
       super.writeTo(p0);
       return;
    }
}
