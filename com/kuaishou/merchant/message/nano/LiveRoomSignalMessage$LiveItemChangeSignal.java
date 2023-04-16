package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveItemChangeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemBubbleTitle;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$RetrievePriceDTO;
import java.lang.Object;
import java.lang.System;

public final class LiveRoomSignalMessage$LiveItemChangeSignal extends MessageNano	// class@001c55
{
    public int changeType;
    public long dispersionTime;
    public int displayIntervalMillis;
    public LiveRoomSignalMessage$ItemBubbleTitle itemBubbleTitle;
    public LiveRoomSignalMessage$ItemInfo[] itemInfo;
    public int onSalesNum;
    public LiveRoomSignalMessage$RetrievePriceDTO retrievePriceDto;
    public boolean shouldRequest;
    public long timeStamp;
    public int upperShelfNum;
    public static LiveRoomSignalMessage$LiveItemChangeSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveItemChangeSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveItemChangeSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveItemChangeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveItemChangeSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveItemChangeSignal[] liveItemChan = new LiveRoomSignalMessage$LiveItemChangeSignal[0];
             LiveRoomSignalMessage$LiveItemChangeSignal._emptyArray = liveItemChan;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveItemChangeSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveItemChangeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveItemChangeSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveItemChangeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveItemChangeSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveItemChangeSignal clear(){
       this.itemInfo = LiveRoomSignalMessage$ItemInfo.emptyArray();
       this.onSalesNum = 0;
       this.changeType = 0;
       this.displayIntervalMillis = 0;
       this.upperShelfNum = 0;
       this.timeStamp = 0;
       this.dispersionTime = 0;
       this.shouldRequest = false;
       this.retrievePriceDto = null;
       this.itemBubbleTitle = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$LiveItemChangeSignal titemInfo = this.itemInfo;
       if (titemInfo != null && titemInfo.length > 0) {
          int i1 = 0;
          LiveRoomSignalMessage$LiveItemChangeSignal titemInfo1 = this.itemInfo;
          while (i1 < titemInfo1.length) {
             object oobject = titemInfo1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       titemInfo = this.onSalesNum;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, titemInfo);
       }
       titemInfo = this.changeType;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, titemInfo);
       }
       titemInfo = this.displayIntervalMillis;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, titemInfo);
       }
       titemInfo = this.upperShelfNum;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, titemInfo);
       }
       titemInfo = this.timeStamp;
       int i2 = 0;
       if (titemInfo - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, titemInfo);
       }
       titemInfo = this.dispersionTime;
       if (titemInfo - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, titemInfo);
       }
       titemInfo = this.shouldRequest;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, titemInfo);
       }
       titemInfo = this.retrievePriceDto;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, titemInfo);
       }
       titemInfo = this.itemBubbleTitle;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, titemInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveItemChangeSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                LiveRoomSignalMessage$LiveItemChangeSignal titemInfo = this.itemInfo;
                int i1 = (titemInfo == null)? 0: titemInfo.length;
                i = i + i1;
                LiveRoomSignalMessage$ItemInfo[] itemInfoArra = new LiveRoomSignalMessage$ItemInfo[i];
                if (i1) {
                   System.arraycopy(titemInfo, 0, itemInfoArra, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   itemInfoArra[i1] = new LiveRoomSignalMessage$ItemInfo();
                   p0.readMessage(itemInfoArra[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                itemInfoArra[i1] = new LiveRoomSignalMessage$ItemInfo();
                p0.readMessage(itemInfoArra[i1]);
                this.itemInfo = itemInfoArra;
                break;
              case 16:
                this.onSalesNum = p0.readUInt32();
                break;
              case 24:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.changeType = i;
                break;
              case 32:
                this.displayIntervalMillis = p0.readUInt32();
                break;
              case '(':
                this.upperShelfNum = p0.readUInt32();
                break;
              case '0':
                this.timeStamp = p0.readUInt64();
                break;
              case '8':
                this.dispersionTime = p0.readUInt64();
                break;
              case '@':
                this.shouldRequest = p0.readBool();
                break;
              case 'J':
                if (this.retrievePriceDto == null) {
                   this.retrievePriceDto = new LiveRoomSignalMessage$RetrievePriceDTO();
                }
                p0.readMessage(this.retrievePriceDto);
                break;
              case 'R':
                if (this.itemBubbleTitle == null) {
                   this.itemBubbleTitle = new LiveRoomSignalMessage$ItemBubbleTitle();
                }
                p0.readMessage(this.itemBubbleTitle);
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
       LiveRoomSignalMessage$LiveItemChangeSignal titemInfo = this.itemInfo;
       if (titemInfo != null && titemInfo.length > 0) {
          int i = 0;
          LiveRoomSignalMessage$LiveItemChangeSignal titemInfo1 = this.itemInfo;
          while (i < titemInfo1.length) {
             object oobject = titemInfo1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       titemInfo = this.onSalesNum;
       if (titemInfo != null) {
          p0.writeUInt32(2, titemInfo);
       }
       titemInfo = this.changeType;
       if (titemInfo != null) {
          p0.writeInt32(3, titemInfo);
       }
       titemInfo = this.displayIntervalMillis;
       if (titemInfo != null) {
          p0.writeUInt32(4, titemInfo);
       }
       titemInfo = this.upperShelfNum;
       if (titemInfo != null) {
          p0.writeUInt32(5, titemInfo);
       }
       titemInfo = this.timeStamp;
       int i1 = 0;
       if (titemInfo - i1) {
          p0.writeUInt64(6, titemInfo);
       }
       titemInfo = this.dispersionTime;
       if (titemInfo - i1) {
          p0.writeUInt64(7, titemInfo);
       }
       titemInfo = this.shouldRequest;
       if (titemInfo != null) {
          p0.writeBool(8, titemInfo);
       }
       titemInfo = this.retrievePriceDto;
       if (titemInfo != null) {
          p0.writeMessage(9, titemInfo);
       }
       titemInfo = this.itemBubbleTitle;
       if (titemInfo != null) {
          p0.writeMessage(10, titemInfo);
       }
       super.writeTo(p0);
       return;
    }
}
