package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo extends MessageNano	// class@0010ca
{
    public String activityId;
    public String activityType;
    public boolean autoExpandEnterRoom;
    public Map extraMessage;
    public String liveStreamId;
    public String moreUrl;
    public String payScene;
    public int showCount;
    public LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[] specialAudienceRankInfo;
    public static LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo[] liveActivity = new LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo[0];
             LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo clear(){
       this.liveStreamId = "";
       this.activityId = "";
       this.activityType = "";
       this.moreUrl = "";
       this.specialAudienceRankInfo = LiveActivitySignalMessage$LiveSpecialAudienceRankInfo.emptyArray();
       this.payScene = "";
       this.extraMessage = null;
       this.autoExpandEnterRoom = false;
       this.showCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.activityId);
       }
       if (!(this.activityType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.activityType);
       }
       if (!(this.moreUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.moreUrl);
       }
       LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo tspecialAudi = this.specialAudienceRankInfo;
       if (tspecialAudi != null && tspecialAudi.length > 0) {
          int i1 = 0;
          LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo tspecialAudi1 = this.specialAudienceRankInfo;
          while (i1 < tspecialAudi1.length) {
             object oobject = tspecialAudi1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.payScene).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.payScene);
       }
       tspecialAudi = this.extraMessage;
       if (tspecialAudi != null) {
          i = i + InternalNano.computeMapFieldSize(tspecialAudi, 7, 9, 9);
       }
       tspecialAudi = this.autoExpandEnterRoom;
       if (tspecialAudi != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tspecialAudi);
       }
       tspecialAudi = this.showCount;
       if (tspecialAudi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tspecialAudi);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.showCount = p0.readUInt32();
                                  }
                               }else {
                                  this.autoExpandEnterRoom = p0.readBool();
                               }
                            }else {
                               this.extraMessage = InternalNano.mergeMapEntry(p0, this.extraMessage, mapFactory, 9, 9, null, 10, 18);
                            }
                         }else {
                            this.payScene = p0.readString();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo tspecialAudi = this.specialAudienceRankInfo;
                         int i2 = 0;
                         int i3 = (tspecialAudi == null)? 0: tspecialAudi.length;
                         i = i + i3;
                         LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[] liveSpecialA = new LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[i];
                         if (i3) {
                            System.arraycopy(tspecialAudi, i2, liveSpecialA, i2, i3);
                         }
                         i1 = i - 1;
                         while (i3 < i1) {
                            liveSpecialA[i3] = new LiveActivitySignalMessage$LiveSpecialAudienceRankInfo();
                            p0.readMessage(liveSpecialA[i3]);
                            p0.readTag();
                            i3 = i3 + 1;
                         }
                         liveSpecialA[i3] = new LiveActivitySignalMessage$LiveSpecialAudienceRankInfo();
                         p0.readMessage(liveSpecialA[i3]);
                         this.specialAudienceRankInfo = liveSpecialA;
                      }
                   }else {
                      this.moreUrl = p0.readString();
                   }
                }else {
                   this.activityType = p0.readString();
                }
             }else {
                this.activityId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.activityId).equals(str)) {
          p0.writeString(2, this.activityId);
       }
       if (!(this.activityType).equals(str)) {
          p0.writeString(3, this.activityType);
       }
       if (!(this.moreUrl).equals(str)) {
          p0.writeString(4, this.moreUrl);
       }
       LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo tspecialAudi = this.specialAudienceRankInfo;
       if (tspecialAudi != null && tspecialAudi.length > 0) {
          int i = 0;
          LiveActivitySignalMessage$LiveActivitySpecialAudienceRankInfo tspecialAudi1 = this.specialAudienceRankInfo;
          while (i < tspecialAudi1.length) {
             object oobject = tspecialAudi1[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.payScene).equals(str)) {
          p0.writeString(6, this.payScene);
       }
       tspecialAudi = this.extraMessage;
       if (tspecialAudi != null) {
          InternalNano.serializeMapField(p0, tspecialAudi, 7, 9, 9);
       }
       tspecialAudi = this.autoExpandEnterRoom;
       if (tspecialAudi != null) {
          p0.writeBool(8, tspecialAudi);
       }
       tspecialAudi = this.showCount;
       if (tspecialAudi != null) {
          p0.writeUInt32(9, tspecialAudi);
       }
       super.writeTo(p0);
       return;
    }
}
