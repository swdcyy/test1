package com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer$StateData;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamSEI$MetaDataContainer extends MessageNano	// class@000d81
{
    public int a;
    public Object b;
    public static LiveStreamSEI$MetaDataContainer[] c;

    public void LiveStreamSEI$MetaDataContainer(){
       super();
       this.a = 0;
       this.a = 0;
       this.b = null;
       this.cachedSize = -1;
    }
    public LiveStreamSEI$MetaDataContainer$StateData a(){
       if (this.a == 1) {
          return this.b;
       }
       return null;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (this.a == 1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, this.b);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             int i1 = 1;
             if (this.a != i1) {
                this.b = new LiveStreamSEI$MetaDataContainer$StateData();
             }
             p0.readMessage(this.b);
             this.a = i1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (this.a == 1) {
          p0.writeMessage(1, this.b);
       }
       super.writeTo(p0);
       return;
    }
}
