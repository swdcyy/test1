package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCRedPackRainReady;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$RedPackRainInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$RedPackRainGroupInfo;

public final class LiveStreamMessages$SCRedPackRainReady extends MessageNano	// class@001361
{
    public long grabMaxRetryInterval;
    public int grabMaxRetryTime;
    public LiveStreamMessages$RedPackRainGroupInfo groupInfo;
    public boolean isHidden;
    public long maxAdvanceRequestTokenMillis;
    public LiveStreamMessages$RedPackRainInfo redPackRainInfo;
    public boolean skipAnimation;
    public long time;
    public long tokenMaxRetryInterval;
    public int tokenMaxRetryTime;
    public static LiveStreamMessages$SCRedPackRainReady[] _emptyArray;

    public void LiveStreamMessages$SCRedPackRainReady(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCRedPackRainReady[] emptyArray(){
       if (LiveStreamMessages$SCRedPackRainReady._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCRedPackRainReady._emptyArray == null) {
             LiveStreamMessages$SCRedPackRainReady[] sCRedPackRai = new LiveStreamMessages$SCRedPackRainReady[0];
             LiveStreamMessages$SCRedPackRainReady._emptyArray = sCRedPackRai;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCRedPackRainReady._emptyArray;
    }
    public static LiveStreamMessages$SCRedPackRainReady parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCRedPackRainReady().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCRedPackRainReady parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCRedPackRainReady(), p0);
    }
    public LiveStreamMessages$SCRedPackRainReady clear(){
       this.time = 0;
       this.groupInfo = null;
       this.redPackRainInfo = null;
       this.isHidden = false;
       this.maxAdvanceRequestTokenMillis = 0;
       this.skipAnimation = false;
       this.tokenMaxRetryTime = 0;
       this.grabMaxRetryTime = 0;
       this.tokenMaxRetryInterval = 0;
       this.grabMaxRetryInterval = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCRedPackRainReady ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttime);
       }
       ttime = this.groupInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, ttime);
       }
       ttime = this.redPackRainInfo;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttime);
       }
       ttime = this.isHidden;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttime);
       }
       ttime = this.maxAdvanceRequestTokenMillis;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       ttime = this.skipAnimation;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttime);
       }
       ttime = this.tokenMaxRetryTime;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, ttime);
       }
       ttime = this.grabMaxRetryTime;
       if (ttime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, ttime);
       }
       ttime = this.tokenMaxRetryInterval;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttime);
       }
       ttime = this.grabMaxRetryInterval;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCRedPackRainReady mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.time = p0.readUInt64();
                break;
              case 18:
                if (this.groupInfo == null) {
                   this.groupInfo = new LiveStreamMessages$RedPackRainGroupInfo();
                }
                p0.readMessage(this.groupInfo);
                break;
              case 26:
                if (this.redPackRainInfo == null) {
                   this.redPackRainInfo = new LiveStreamMessages$RedPackRainInfo();
                }
                p0.readMessage(this.redPackRainInfo);
                break;
              case 32:
                this.isHidden = p0.readBool();
                break;
              case '(':
                this.maxAdvanceRequestTokenMillis = p0.readUInt64();
                break;
              case '0':
                this.skipAnimation = p0.readBool();
                break;
              case '8':
                this.tokenMaxRetryTime = p0.readUInt32();
                break;
              case '@':
                this.grabMaxRetryTime = p0.readUInt32();
                break;
              case 'H':
                this.tokenMaxRetryInterval = p0.readUInt64();
                break;
              case 'P':
                this.grabMaxRetryInterval = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCRedPackRainReady ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(1, ttime);
       }
       ttime = this.groupInfo;
       if (ttime != null) {
          p0.writeMessage(2, ttime);
       }
       ttime = this.redPackRainInfo;
       if (ttime != null) {
          p0.writeMessage(3, ttime);
       }
       ttime = this.isHidden;
       if (ttime != null) {
          p0.writeBool(4, ttime);
       }
       ttime = this.maxAdvanceRequestTokenMillis;
       if (ttime - i) {
          p0.writeUInt64(5, ttime);
       }
       ttime = this.skipAnimation;
       if (ttime != null) {
          p0.writeBool(6, ttime);
       }
       ttime = this.tokenMaxRetryTime;
       if (ttime != null) {
          p0.writeUInt32(7, ttime);
       }
       ttime = this.grabMaxRetryTime;
       if (ttime != null) {
          p0.writeUInt32(8, ttime);
       }
       ttime = this.tokenMaxRetryInterval;
       if (ttime - i) {
          p0.writeUInt64(9, ttime);
       }
       ttime = this.grabMaxRetryInterval;
       if (ttime - i) {
          p0.writeUInt64(10, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
