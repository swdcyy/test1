package com.kuaishou.livestream.message.nano.LiveGiftAchievementGift;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class LiveGiftAchievementGift extends MessageNano	// class@0011b9
{
    public LiveCdnNodeView[] giftIcon;
    public int giftId;
    public String giftName;
    public boolean lightOn;
    public int[] relationGiftIds;
    public int requiredCount;
    public String requiredCountDisplay;
    public int sentCount;
    public String sentCountDisplay;
    public static LiveGiftAchievementGift[] _emptyArray;

    public void LiveGiftAchievementGift(){
       super();
       this.clear();
    }
    public static LiveGiftAchievementGift[] emptyArray(){
       if (LiveGiftAchievementGift._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGiftAchievementGift._emptyArray == null) {
             LiveGiftAchievementGift[] liveGiftAchi = new LiveGiftAchievementGift[0];
             LiveGiftAchievementGift._emptyArray = liveGiftAchi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGiftAchievementGift._emptyArray;
    }
    public static LiveGiftAchievementGift parseFrom(CodedInputByteBufferNano p0){
       return new LiveGiftAchievementGift().mergeFrom(p0);
    }
    public static LiveGiftAchievementGift parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGiftAchievementGift(), p0);
    }
    public LiveGiftAchievementGift clear(){
       this.giftId = 0;
       this.giftName = "";
       this.giftIcon = LiveCdnNodeView.emptyArray();
       this.lightOn = false;
       this.requiredCount = 0;
       this.requiredCountDisplay = "";
       this.sentCount = 0;
       this.sentCountDisplay = "";
       this.relationGiftIds = WireFormatNano.EMPTY_INT_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       LiveGiftAchievementGift tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       String str = "";
       if (!(this.giftName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.giftName);
       }
       tgiftId = this.giftIcon;
       int i1 = 0;
       if (tgiftId != null && tgiftId.length > 0) {
          i2 = 0;
          LiveGiftAchievementGift tgiftIcon = this.giftIcon;
          while (i2 < tgiftIcon.length) {
             object oobject = tgiftIcon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tgiftId = this.lightOn;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tgiftId);
       }
       tgiftId = this.requiredCount;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tgiftId);
       }
       if (!(this.requiredCountDisplay).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.requiredCountDisplay);
       }
       tgiftId = this.sentCount;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tgiftId);
       }
       if (!(this.sentCountDisplay).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.sentCountDisplay);
       }
       tgiftId = this.relationGiftIds;
       if (tgiftId != null && tgiftId.length > 0) {
          i2 = 0;
          LiveGiftAchievementGift trelationGif = this.relationGiftIds;
          while (i1 < trelationGif.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(trelationGif[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (trelationGif.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGiftAchievementGift mergeFrom(CodedInputByteBufferNano p0){
       LiveGiftAchievementGift tgiftIcon;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.giftId = p0.readUInt32();
                break;
              case 18:
                this.giftName = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tgiftIcon = this.giftIcon;
                i2 = (tgiftIcon == null)? 0: tgiftIcon.length;
                i = i + i2;
                LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tgiftIcon, i1, liveCdnNodeV, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCdnNodeV[i2] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                this.giftIcon = liveCdnNodeV;
                break;
              case 32:
                this.lightOn = p0.readBool();
                break;
              case '(':
                this.requiredCount = p0.readUInt32();
                break;
              case '2':
                this.requiredCountDisplay = p0.readString();
                break;
              case '8':
                this.sentCount = p0.readUInt32();
                break;
              case 'B':
                this.sentCountDisplay = p0.readString();
                break;
              case 'H':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 72);
                tgiftIcon = this.relationGiftIds;
                i2 = (tgiftIcon == null)? 0: tgiftIcon.length;
                i = i + i2;
                int[] ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tgiftIcon, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readUInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readUInt32();
                this.relationGiftIds = ointArray;
                break;
              case 'J':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tgiftIcon = this.relationGiftIds;
                int i3 = (tgiftIcon == null)? 0: tgiftIcon.length;
                i2 = i2 + i3;
                int[] ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tgiftIcon, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.relationGiftIds = ointArray1;
                p0.popLimit(i);
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
       LiveGiftAchievementGift tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       String str = "";
       if (!(this.giftName).equals(str)) {
          p0.writeString(2, this.giftName);
       }
       tgiftId = this.giftIcon;
       int i = 0;
       if (tgiftId != null && tgiftId.length > 0) {
          int i1 = 0;
          LiveGiftAchievementGift tgiftIcon = this.giftIcon;
          while (i1 < tgiftIcon.length) {
             object oobject = tgiftIcon[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tgiftId = this.lightOn;
       if (tgiftId != null) {
          p0.writeBool(4, tgiftId);
       }
       tgiftId = this.requiredCount;
       if (tgiftId != null) {
          p0.writeUInt32(5, tgiftId);
       }
       if (!(this.requiredCountDisplay).equals(str)) {
          p0.writeString(6, this.requiredCountDisplay);
       }
       tgiftId = this.sentCount;
       if (tgiftId != null) {
          p0.writeUInt32(7, tgiftId);
       }
       if (!(this.sentCountDisplay).equals(str)) {
          p0.writeString(8, this.sentCountDisplay);
       }
       tgiftId = this.relationGiftIds;
       if (tgiftId != null && tgiftId.length > 0) {
          tgiftId = this.relationGiftIds;
          while (i < tgiftId.length) {
             p0.writeUInt32(9, tgiftId[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
