package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxTokenReady;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxGrabPage;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo;

public final class LiveTreasureBoxMessage$LiveTreasureBoxTokenReady extends MessageNano	// class@0013b1
{
    public int bizType;
    public int boxType;
    public LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo effectInfo;
    public Map extraMessage;
    public LiveTreasureBoxMessage$LiveTreasureBoxGrabPage grabPage;
    public long maxRequestTokenTime;
    public int maxRetryCount;
    public long maxRetryIntervalMills;
    public long minRequestTokenTime;
    public String treasureBoxId;
    public static LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[] _emptyArray;

    public void LiveTreasureBoxMessage$LiveTreasureBoxTokenReady(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[] emptyArray(){
       if (LiveTreasureBoxMessage$LiveTreasureBoxTokenReady._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$LiveTreasureBoxTokenReady._emptyArray == null) {
             LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxTokenReady[0];
             LiveTreasureBoxMessage$LiveTreasureBoxTokenReady._emptyArray = liveTreasure;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$LiveTreasureBoxTokenReady._emptyArray;
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxTokenReady parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$LiveTreasureBoxTokenReady().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxTokenReady parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$LiveTreasureBoxTokenReady(), p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxTokenReady clear(){
       this.treasureBoxId = "";
       this.bizType = 0;
       this.boxType = 0;
       this.minRequestTokenTime = 0;
       this.maxRequestTokenTime = 0;
       this.maxRetryCount = 0;
       this.maxRetryIntervalMills = 0;
       this.effectInfo = null;
       this.grabPage = null;
       this.extraMessage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.treasureBoxId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.treasureBoxId);
       }
       LiveTreasureBoxMessage$LiveTreasureBoxTokenReady tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tbizType);
       }
       tbizType = this.boxType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tbizType);
       }
       tbizType = this.minRequestTokenTime;
       int i1 = 0;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tbizType);
       }
       tbizType = this.maxRequestTokenTime;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbizType);
       }
       tbizType = this.maxRetryCount;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tbizType);
       }
       tbizType = this.maxRetryIntervalMills;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tbizType);
       }
       tbizType = this.effectInfo;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tbizType);
       }
       tbizType = this.grabPage;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tbizType);
       }
       tbizType = this.extraMessage;
       if (tbizType != null) {
          i = i + InternalNano.computeMapFieldSize(tbizType, 10, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxTokenReady mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.treasureBoxId = p0.readString();
                break;
              case 16:
                this.bizType = p0.readUInt32();
                break;
              case 24:
                this.boxType = p0.readUInt32();
                break;
              case 32:
                this.minRequestTokenTime = p0.readUInt64();
                break;
              case '(':
                this.maxRequestTokenTime = p0.readUInt64();
                break;
              case '0':
                this.maxRetryCount = p0.readUInt32();
                break;
              case '8':
                this.maxRetryIntervalMills = p0.readUInt64();
                break;
              case 'B':
                if (this.effectInfo == null) {
                   this.effectInfo = new LiveTreasureBoxMessage$LiveTreasureBoxEffectInfo();
                }
                p0.readMessage(this.effectInfo);
                break;
              case 'J':
                if (this.grabPage == null) {
                   this.grabPage = new LiveTreasureBoxMessage$LiveTreasureBoxGrabPage();
                }
                p0.readMessage(this.grabPage);
                break;
              case 'R':
                this.extraMessage = InternalNano.mergeMapEntry(p0, this.extraMessage, mapFactory, 9, 9, null, 10, 18);
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
       if (!(this.treasureBoxId).equals("")) {
          p0.writeString(1, this.treasureBoxId);
       }
       LiveTreasureBoxMessage$LiveTreasureBoxTokenReady tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeUInt32(2, tbizType);
       }
       tbizType = this.boxType;
       if (tbizType != null) {
          p0.writeUInt32(3, tbizType);
       }
       tbizType = this.minRequestTokenTime;
       int i = 0;
       if (tbizType - i) {
          p0.writeUInt64(4, tbizType);
       }
       tbizType = this.maxRequestTokenTime;
       if (tbizType - i) {
          p0.writeUInt64(5, tbizType);
       }
       tbizType = this.maxRetryCount;
       if (tbizType != null) {
          p0.writeUInt32(6, tbizType);
       }
       tbizType = this.maxRetryIntervalMills;
       if (tbizType - i) {
          p0.writeUInt64(7, tbizType);
       }
       tbizType = this.effectInfo;
       if (tbizType != null) {
          p0.writeMessage(8, tbizType);
       }
       tbizType = this.grabPage;
       if (tbizType != null) {
          p0.writeMessage(9, tbizType);
       }
       tbizType = this.extraMessage;
       if (tbizType != null) {
          InternalNano.serializeMapField(p0, tbizType, 10, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
