package com.kuaishou.livestream.message.nano.LiveCommonRoute;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonRoutePopupStrategy;

public final class LiveCommonRoute extends MessageNano	// class@001167
{
    public long executeDeadlineTime;
    public long executeTime;
    public String liveStreamId;
    public LiveCommonRoutePopupStrategy popupStrategy;
    public long randomDelayTime;
    public String routeUrl;
    public static LiveCommonRoute[] _emptyArray;

    public void LiveCommonRoute(){
       super();
       this.clear();
    }
    public static LiveCommonRoute[] emptyArray(){
       if (LiveCommonRoute._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonRoute._emptyArray == null) {
             LiveCommonRoute[] liveCommonRo = new LiveCommonRoute[0];
             LiveCommonRoute._emptyArray = liveCommonRo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonRoute._emptyArray;
    }
    public static LiveCommonRoute parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonRoute().mergeFrom(p0);
    }
    public static LiveCommonRoute parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonRoute(), p0);
    }
    public LiveCommonRoute clear(){
       this.routeUrl = "";
       this.executeTime = 0;
       this.executeDeadlineTime = 0;
       this.randomDelayTime = 0;
       this.liveStreamId = "";
       this.popupStrategy = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.routeUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.routeUrl);
       }
       LiveCommonRoute texecuteTime = this.executeTime;
       if (texecuteTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, texecuteTime);
       }
       texecuteTime = this.executeDeadlineTime;
       if (texecuteTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, texecuteTime);
       }
       texecuteTime = this.randomDelayTime;
       if (texecuteTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, texecuteTime);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.liveStreamId);
       }
       LiveCommonRoute tpopupStrate = this.popupStrategy;
       if (tpopupStrate != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tpopupStrate);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonRoute mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else if(this.popupStrategy == null){
                            this.popupStrategy = new LiveCommonRoutePopupStrategy();
                         }
                         p0.readMessage(this.popupStrategy);
                      }else {
                         this.liveStreamId = p0.readString();
                      }
                   }else {
                      this.randomDelayTime = p0.readUInt64();
                   }
                }else {
                   this.executeDeadlineTime = p0.readUInt64();
                }
             }else {
                this.executeTime = p0.readUInt64();
             }
          }else {
             this.routeUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.routeUrl).equals(str)) {
          p0.writeString(1, this.routeUrl);
       }
       LiveCommonRoute texecuteTime = this.executeTime;
       if (texecuteTime) {
          p0.writeUInt64(2, texecuteTime);
       }
       texecuteTime = this.executeDeadlineTime;
       if (texecuteTime) {
          p0.writeUInt64(3, texecuteTime);
       }
       texecuteTime = this.randomDelayTime;
       if (texecuteTime) {
          p0.writeUInt64(4, texecuteTime);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(5, this.liveStreamId);
       }
       LiveCommonRoute tpopupStrate = this.popupStrategy;
       if (tpopupStrate != null) {
          p0.writeMessage(6, tpopupStrate);
       }
       super.writeTo(p0);
       return;
    }
}
