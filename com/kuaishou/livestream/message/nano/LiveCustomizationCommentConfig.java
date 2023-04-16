package com.kuaishou.livestream.message.nano.LiveCustomizationCommentConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomizationCommentSpeedConfig;

public final class LiveCustomizationCommentConfig extends MessageNano	// class@00117e
{
    public LiveCustomizationCommentSpeedConfig audienceSpeed;
    public static LiveCustomizationCommentConfig[] _emptyArray;

    public void LiveCustomizationCommentConfig(){
       super();
       this.clear();
    }
    public static LiveCustomizationCommentConfig[] emptyArray(){
       if (LiveCustomizationCommentConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomizationCommentConfig._emptyArray == null) {
             LiveCustomizationCommentConfig[] liveCustomiz = new LiveCustomizationCommentConfig[0];
             LiveCustomizationCommentConfig._emptyArray = liveCustomiz;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomizationCommentConfig._emptyArray;
    }
    public static LiveCustomizationCommentConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomizationCommentConfig().mergeFrom(p0);
    }
    public static LiveCustomizationCommentConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomizationCommentConfig(), p0);
    }
    public LiveCustomizationCommentConfig clear(){
       this.audienceSpeed = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomizationCommentConfig taudienceSpe = this.audienceSpeed;
       if (taudienceSpe != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, taudienceSpe);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomizationCommentConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.audienceSpeed == null){
             this.audienceSpeed = new LiveCustomizationCommentSpeedConfig();
          }
          p0.readMessage(this.audienceSpeed);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomizationCommentConfig taudienceSpe = this.audienceSpeed;
       if (taudienceSpe != null) {
          p0.writeMessage(1, taudienceSpe);
       }
       super.writeTo(p0);
       return;
    }
}
