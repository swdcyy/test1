package com.kuaishou.livestream.message.nano.LiveStreamMessages$CohesionGameInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import java.lang.System;

public final class LiveStreamMessages$CohesionGameInfo extends MessageNano	// class@0012c9
{
    public String attachGiftToken;
    public String buttonText;
    public String contributionRankRoute;
    public Map enableStrongGuide;
    public int[] giftId;
    public String inviteRoute;
    public String noticeGiftToken;
    public int noticeSecond;
    public static LiveStreamMessages$CohesionGameInfo[] _emptyArray;

    public void LiveStreamMessages$CohesionGameInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$CohesionGameInfo[] emptyArray(){
       if (LiveStreamMessages$CohesionGameInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$CohesionGameInfo._emptyArray == null) {
             LiveStreamMessages$CohesionGameInfo[] uCohesionGam = new LiveStreamMessages$CohesionGameInfo[0];
             LiveStreamMessages$CohesionGameInfo._emptyArray = uCohesionGam;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$CohesionGameInfo._emptyArray;
    }
    public static LiveStreamMessages$CohesionGameInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$CohesionGameInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$CohesionGameInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$CohesionGameInfo(), p0);
    }
    public LiveStreamMessages$CohesionGameInfo clear(){
       this.giftId = WireFormatNano.EMPTY_INT_ARRAY;
       this.attachGiftToken = "";
       this.noticeGiftToken = "";
       this.noticeSecond = 0;
       this.contributionRankRoute = "";
       this.enableStrongGuide = null;
       this.buttonText = "";
       this.inviteRoute = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$CohesionGameInfo tgiftId = this.giftId;
       if (tgiftId != null && tgiftId.length > 0) {
          int i1 = 0;
          int i2 = 0;
          LiveStreamMessages$CohesionGameInfo tgiftId1 = this.giftId;
          while (i1 < tgiftId1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tgiftId1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tgiftId1.length * 1);
       }
       if (!(this.attachGiftToken).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.attachGiftToken);
       }
       if (!(this.noticeGiftToken).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.noticeGiftToken);
       }
       tgiftId = this.noticeSecond;
       int i3 = 4;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i3, tgiftId);
       }
       if (!(this.contributionRankRoute).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.contributionRankRoute);
       }
       tgiftId = this.enableStrongGuide;
       if (tgiftId != null) {
          i = i + InternalNano.computeMapFieldSize(tgiftId, 6, i3, 8);
       }
       if (!(this.buttonText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.buttonText);
       }
       if (!(this.inviteRoute).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.inviteRoute);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$CohesionGameInfo mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveStreamMessages$CohesionGameInfo tgiftId;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          MapFactories$MapFactory mapFactory1 = null;
          if (i != i1) {
             if (i != 10) {
                if (i != 18) {
                   if (i != 26) {
                      if (i != 32) {
                         if (i != 42) {
                            if (i != 50) {
                               if (i != 58) {
                                  if (i != 66) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.inviteRoute = p0.readString();
                                  }
                               }else {
                                  this.buttonText = p0.readString();
                               }
                            }else {
                               this.enableStrongGuide = InternalNano.mergeMapEntry(p0, this.enableStrongGuide, mapFactory, 4, 8, null, 8, 16);
                            }
                         }else {
                            this.contributionRankRoute = p0.readString();
                         }
                      }else {
                         this.noticeSecond = p0.readUInt32();
                      }
                   }else {
                      this.noticeGiftToken = p0.readString();
                   }
                }else {
                   this.attachGiftToken = p0.readString();
                }
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(i1);
                tgiftId = this.giftId;
                int i3 = (tgiftId == null)? 0: tgiftId.length;
                i2 = i2 + i3;
                int[] ointArray = new int[i2];
                if (i3) {
                   System.arraycopy(tgiftId, mapFactory1, ointArray, mapFactory1, i3);
                }
                while (i3 < i2) {
                   ointArray[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.giftId = ointArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tgiftId = this.giftId;
             i2 = (tgiftId == null)? 0: tgiftId.length;
             i = i + i2;
             int[] ointArray1 = new int[i];
             if (i2) {
                System.arraycopy(tgiftId, mapFactory1, ointArray1, mapFactory1, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                ointArray1[i2] = p0.readUInt32();
                p0.readTag();
                i2 = i2 + 1;
             }
             ointArray1[i2] = p0.readUInt32();
             this.giftId = ointArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$CohesionGameInfo tgiftId = this.giftId;
       if (tgiftId != null && tgiftId.length > 0) {
          int i = 0;
          LiveStreamMessages$CohesionGameInfo tgiftId1 = this.giftId;
          while (i < tgiftId1.length) {
             p0.writeUInt32(1, tgiftId1[i]);
             i = i + 1;
          }
       }
       if (!(this.attachGiftToken).equals("")) {
          p0.writeString(2, this.attachGiftToken);
       }
       if (!(this.noticeGiftToken).equals("")) {
          p0.writeString(3, this.noticeGiftToken);
       }
       tgiftId = this.noticeSecond;
       int i1 = 4;
       if (tgiftId != null) {
          p0.writeUInt32(i1, tgiftId);
       }
       if (!(this.contributionRankRoute).equals("")) {
          p0.writeString(5, this.contributionRankRoute);
       }
       tgiftId = this.enableStrongGuide;
       if (tgiftId != null) {
          InternalNano.serializeMapField(p0, tgiftId, 6, i1, 8);
       }
       if (!(this.buttonText).equals("")) {
          p0.writeString(7, this.buttonText);
       }
       if (!(this.inviteRoute).equals("")) {
          p0.writeString(8, this.inviteRoute);
       }
       super.writeTo(p0);
       return;
    }
}
