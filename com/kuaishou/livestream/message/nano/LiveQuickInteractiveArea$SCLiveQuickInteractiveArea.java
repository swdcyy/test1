package com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$SCLiveQuickInteractiveArea;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveQuickInteractiveArea$SCLiveQuickInteractiveArea extends MessageNano	// class@00125e
{
    public String bizId;
    public int bizType;
    public long delayDisplayMs;
    public long displayDurationMs;
    public long displayExpireTimestamp;
    public int displayScope;
    public String extraInfo;
    public String liteCommonGuideSubBiz;
    public boolean needCheckTriggerByClient;
    public long priority;
    public LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] tabItem;
    public String targetLiveStreamId;
    public static LiveQuickInteractiveArea$SCLiveQuickInteractiveArea[] _emptyArray;

    public void LiveQuickInteractiveArea$SCLiveQuickInteractiveArea(){
       super();
       this.clear();
    }
    public static LiveQuickInteractiveArea$SCLiveQuickInteractiveArea[] emptyArray(){
       if (LiveQuickInteractiveArea$SCLiveQuickInteractiveArea._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickInteractiveArea$SCLiveQuickInteractiveArea._emptyArray == null) {
             LiveQuickInteractiveArea$SCLiveQuickInteractiveArea[] sCLiveQuickI = new LiveQuickInteractiveArea$SCLiveQuickInteractiveArea[0];
             LiveQuickInteractiveArea$SCLiveQuickInteractiveArea._emptyArray = sCLiveQuickI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickInteractiveArea$SCLiveQuickInteractiveArea._emptyArray;
    }
    public static LiveQuickInteractiveArea$SCLiveQuickInteractiveArea parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickInteractiveArea$SCLiveQuickInteractiveArea().mergeFrom(p0);
    }
    public static LiveQuickInteractiveArea$SCLiveQuickInteractiveArea parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickInteractiveArea$SCLiveQuickInteractiveArea(), p0);
    }
    public LiveQuickInteractiveArea$SCLiveQuickInteractiveArea clear(){
       this.bizId = "";
       this.bizType = 0;
       this.priority = 0;
       this.targetLiveStreamId = "";
       this.tabItem = LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem.emptyArray();
       this.displayDurationMs = 0;
       this.displayExpireTimestamp = 0;
       this.delayDisplayMs = 0;
       this.extraInfo = "";
       this.displayScope = 0;
       this.liteCommonGuideSubBiz = "";
       this.needCheckTriggerByClient = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bizId);
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tbizType);
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea tpriority = this.priority;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tpriority);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.targetLiveStreamId);
       }
       tbizType = this.tabItem;
       if (tbizType != null && tbizType.length > 0) {
          int i1 = 0;
          tpriority = this.tabItem;
          while (i1 < tpriority.length) {
             object oobject = tpriority[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpriority = this.displayDurationMs;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tpriority);
       }
       tpriority = this.displayExpireTimestamp;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tpriority);
       }
       tpriority = this.delayDisplayMs;
       if (tpriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tpriority);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.extraInfo);
       }
       tbizType = this.displayScope;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tbizType);
       }
       if (!(this.liteCommonGuideSubBiz).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.liteCommonGuideSubBiz);
       }
       tbizType = this.needCheckTriggerByClient;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tbizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickInteractiveArea$SCLiveQuickInteractiveArea mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          LiveQuickInteractiveArea$SCLiveQuickInteractiveArea sCLiveQuickI = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.bizId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != i1 && (i != sCLiveQuickI && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.bizType = i;
                }
                break;
              case 24:
                this.priority = p0.readUInt64();
                break;
              case '"':
                this.targetLiveStreamId = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                sCLiveQuickI = this.tabItem;
                i1 = 0;
                int i2 = (sCLiveQuickI == null)? 0: sCLiveQuickI.length;
                i = i + i2;
                LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[] liveQuickInt = new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem[i];
                if (i2) {
                   System.arraycopy(sCLiveQuickI, i1, liveQuickInt, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   liveQuickInt[i2] = new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem();
                   p0.readMessage(liveQuickInt[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveQuickInt[i2] = new LiveQuickInteractiveArea$LiveQuickInteractiveAreaTabItem();
                p0.readMessage(liveQuickInt[i2]);
                this.tabItem = liveQuickInt;
                break;
              case '0':
                this.displayDurationMs = p0.readUInt64();
                break;
              case '8':
                this.displayExpireTimestamp = p0.readUInt64();
                break;
              case '@':
                this.delayDisplayMs = p0.readUInt64();
                break;
              case 'J':
                this.extraInfo = p0.readString();
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != i1 && i != sCLiveQuickI)) {
                   continue ;
                }else {
                   this.displayScope = i;
                }
                break;
              case 'Z':
                this.liteCommonGuideSubBiz = p0.readString();
                break;
              case '`':
                this.needCheckTriggerByClient = p0.readBool();
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
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(1, this.bizId);
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(2, tbizType);
       }
       LiveQuickInteractiveArea$SCLiveQuickInteractiveArea tpriority = this.priority;
       if (tpriority) {
          p0.writeUInt64(3, tpriority);
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          p0.writeString(4, this.targetLiveStreamId);
       }
       tbizType = this.tabItem;
       if (tbizType != null && tbizType.length > 0) {
          int i = 0;
          tpriority = this.tabItem;
          while (i < tpriority.length) {
             object oobject = tpriority[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       tpriority = this.displayDurationMs;
       if (tpriority) {
          p0.writeUInt64(6, tpriority);
       }
       tpriority = this.displayExpireTimestamp;
       if (tpriority) {
          p0.writeUInt64(7, tpriority);
       }
       tpriority = this.delayDisplayMs;
       if (tpriority) {
          p0.writeUInt64(8, tpriority);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(9, this.extraInfo);
       }
       tbizType = this.displayScope;
       if (tbizType != null) {
          p0.writeInt32(10, tbizType);
       }
       if (!(this.liteCommonGuideSubBiz).equals(str)) {
          p0.writeString(11, this.liteCommonGuideSubBiz);
       }
       tbizType = this.needCheckTriggerByClient;
       if (tbizType != null) {
          p0.writeBool(12, tbizType);
       }
       super.writeTo(p0);
       return;
    }
}
