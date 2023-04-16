package com.kuaishou.livestream.message.nano.SCLiveGiftAchievementUpdateNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveGiftAchievement;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveGiftAchievementUpdateNotice extends MessageNano	// class@00141f
{
    public String achievementWallUrl;
    public LiveGiftAchievement[] achievements;
    public long authorId;
    public String liveStreamId;
    public long weekNo;
    public static SCLiveGiftAchievementUpdateNotice[] _emptyArray;

    public void SCLiveGiftAchievementUpdateNotice(){
       super();
       this.clear();
    }
    public static SCLiveGiftAchievementUpdateNotice[] emptyArray(){
       if (SCLiveGiftAchievementUpdateNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGiftAchievementUpdateNotice._emptyArray == null) {
             SCLiveGiftAchievementUpdateNotice[] sCLiveGiftAc = new SCLiveGiftAchievementUpdateNotice[0];
             SCLiveGiftAchievementUpdateNotice._emptyArray = sCLiveGiftAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGiftAchievementUpdateNotice._emptyArray;
    }
    public static SCLiveGiftAchievementUpdateNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGiftAchievementUpdateNotice().mergeFrom(p0);
    }
    public static SCLiveGiftAchievementUpdateNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGiftAchievementUpdateNotice(), p0);
    }
    public SCLiveGiftAchievementUpdateNotice clear(){
       this.achievementWallUrl = "";
       this.weekNo = 0;
       this.achievements = LiveGiftAchievement.emptyArray();
       this.authorId = 0;
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.achievementWallUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.achievementWallUrl);
       }
       SCLiveGiftAchievementUpdateNotice tweekNo = this.weekNo;
       if (tweekNo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tweekNo);
       }
       SCLiveGiftAchievementUpdateNotice tachievement = this.achievements;
       if (tachievement != null && tachievement.length > 0) {
          int i1 = 0;
          tweekNo = this.achievements;
          while (i1 < tweekNo.length) {
             object oobject = tweekNo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tweekNo = this.authorId;
       if (tweekNo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tweekNo);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGiftAchievementUpdateNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.liveStreamId = p0.readString();
                      }
                   }else {
                      this.authorId = p0.readUInt64();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCLiveGiftAchievementUpdateNotice tachievement = this.achievements;
                   int i2 = (tachievement == null)? 0: tachievement.length;
                   i = i + i2;
                   LiveGiftAchievement[] liveGiftAchi = new LiveGiftAchievement[i];
                   if (i2) {
                      System.arraycopy(tachievement, 0, liveGiftAchi, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveGiftAchi[i2] = new LiveGiftAchievement();
                      p0.readMessage(liveGiftAchi[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveGiftAchi[i2] = new LiveGiftAchievement();
                   p0.readMessage(liveGiftAchi[i2]);
                   this.achievements = liveGiftAchi;
                }
             }else {
                this.weekNo = p0.readUInt64();
             }
          }else {
             this.achievementWallUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.achievementWallUrl).equals(str)) {
          p0.writeString(1, this.achievementWallUrl);
       }
       SCLiveGiftAchievementUpdateNotice tweekNo = this.weekNo;
       if (tweekNo) {
          p0.writeUInt64(2, tweekNo);
       }
       SCLiveGiftAchievementUpdateNotice tachievement = this.achievements;
       if (tachievement != null && tachievement.length > 0) {
          int i = 0;
          tweekNo = this.achievements;
          while (i < tweekNo.length) {
             object oobject = tweekNo[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tweekNo = this.authorId;
       if (tweekNo) {
          p0.writeUInt64(4, tweekNo);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(5, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
