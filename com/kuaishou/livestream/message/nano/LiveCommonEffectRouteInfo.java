package com.kuaishou.livestream.message.nano.LiveCommonEffectRouteInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;

public final class LiveCommonEffectRouteInfo extends MessageNano	// class@00114e
{
    public String actionUrl;
    public LiveCommonEffectInfo effectInfo;
    public long maxDelayMillis;
    public static LiveCommonEffectRouteInfo[] _emptyArray;

    public void LiveCommonEffectRouteInfo(){
       super();
       this.clear();
    }
    public static LiveCommonEffectRouteInfo[] emptyArray(){
       if (LiveCommonEffectRouteInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonEffectRouteInfo._emptyArray == null) {
             LiveCommonEffectRouteInfo[] liveCommonEf = new LiveCommonEffectRouteInfo[0];
             LiveCommonEffectRouteInfo._emptyArray = liveCommonEf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonEffectRouteInfo._emptyArray;
    }
    public static LiveCommonEffectRouteInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonEffectRouteInfo().mergeFrom(p0);
    }
    public static LiveCommonEffectRouteInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonEffectRouteInfo(), p0);
    }
    public LiveCommonEffectRouteInfo clear(){
       this.effectInfo = null;
       this.actionUrl = "";
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonEffectRouteInfo teffectInfo = this.effectInfo;
       if (teffectInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, teffectInfo);
       }
       if (!(this.actionUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.actionUrl);
       }
       teffectInfo = this.maxDelayMillis;
       if (teffectInfo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, teffectInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonEffectRouteInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.maxDelayMillis = p0.readUInt64();
                }
             }else {
                this.actionUrl = p0.readString();
             }
          }else if(this.effectInfo == null){
             this.effectInfo = new LiveCommonEffectInfo();
          }
          p0.readMessage(this.effectInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonEffectRouteInfo teffectInfo = this.effectInfo;
       if (teffectInfo != null) {
          p0.writeMessage(1, teffectInfo);
       }
       if (!(this.actionUrl).equals("")) {
          p0.writeString(2, this.actionUrl);
       }
       teffectInfo = this.maxDelayMillis;
       if (teffectInfo) {
          p0.writeUInt64(3, teffectInfo);
       }
       super.writeTo(p0);
       return;
    }
}
