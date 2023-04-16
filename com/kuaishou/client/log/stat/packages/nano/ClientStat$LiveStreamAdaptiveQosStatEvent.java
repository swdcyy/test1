package com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveStreamAdaptiveQosStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$LiveStreamAdaptiveQosStatEvent extends MessageNano	// class@0007e8
{
    public String liveAdaptiveQosInfo;
    public static ClientStat$LiveStreamAdaptiveQosStatEvent[] _emptyArray;

    public void ClientStat$LiveStreamAdaptiveQosStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$LiveStreamAdaptiveQosStatEvent[] emptyArray(){
       if (ClientStat$LiveStreamAdaptiveQosStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$LiveStreamAdaptiveQosStatEvent._emptyArray == null) {
             ClientStat$LiveStreamAdaptiveQosStatEvent[] liveStreamAd = new ClientStat$LiveStreamAdaptiveQosStatEvent[0];
             ClientStat$LiveStreamAdaptiveQosStatEvent._emptyArray = liveStreamAd;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$LiveStreamAdaptiveQosStatEvent._emptyArray;
    }
    public static ClientStat$LiveStreamAdaptiveQosStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$LiveStreamAdaptiveQosStatEvent().mergeFrom(p0);
    }
    public static ClientStat$LiveStreamAdaptiveQosStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$LiveStreamAdaptiveQosStatEvent(), p0);
    }
    public ClientStat$LiveStreamAdaptiveQosStatEvent clear(){
       this.liveAdaptiveQosInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveAdaptiveQosInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveAdaptiveQosInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$LiveStreamAdaptiveQosStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.liveAdaptiveQosInfo = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveAdaptiveQosInfo).equals("")) {
          p0.writeString(1, this.liveAdaptiveQosInfo);
       }
       super.writeTo(p0);
       return;
    }
}
