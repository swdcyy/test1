package com.kuaishou.protobuf.livestream.sei.nano.LiveStreamSEI$MetaDataContainer$StateData;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class LiveStreamSEI$MetaDataContainer$StateData extends MessageNano	// class@000d80
{
    public Map state;
    public static LiveStreamSEI$MetaDataContainer$StateData[] a;

    public void LiveStreamSEI$MetaDataContainer$StateData(){
       super();
       this.state = null;
       this.cachedSize = -1;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamSEI$MetaDataContainer$StateData tstate = this.state;
       if (tstate != null) {
          i = i + InternalNano.computeMapFieldSize(tstate, 1, 13, 12);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       int i = p0.readTag();
       while (i) {
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.state = InternalNano.mergeMapEntry(p0, this.state, mapFactory, 13, 12, null, 8, 18);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamSEI$MetaDataContainer$StateData tstate = this.state;
       if (tstate != null) {
          InternalNano.serializeMapField(p0, tstate, 1, 13, 12);
       }
       super.writeTo(p0);
       return;
    }
}
