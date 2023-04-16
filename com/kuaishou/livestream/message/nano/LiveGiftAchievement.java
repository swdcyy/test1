package com.kuaishou.livestream.message.nano.LiveGiftAchievement;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.kuaishou.livestream.message.nano.LiveGiftAchievementGift;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveGiftAchievement extends MessageNano	// class@0011b8
{
    public long achievementId;
    public String desc;
    public String displayText;
    public LiveGiftAchievementGift[] gifts;
    public LiveCdnNodeView[] icon;
    public boolean lightOn;
    public String name;
    public int order;
    public static LiveGiftAchievement[] _emptyArray;

    public void LiveGiftAchievement(){
       super();
       this.clear();
    }
    public static LiveGiftAchievement[] emptyArray(){
       if (LiveGiftAchievement._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGiftAchievement._emptyArray == null) {
             LiveGiftAchievement[] liveGiftAchi = new LiveGiftAchievement[0];
             LiveGiftAchievement._emptyArray = liveGiftAchi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGiftAchievement._emptyArray;
    }
    public static LiveGiftAchievement parseFrom(CodedInputByteBufferNano p0){
       return new LiveGiftAchievement().mergeFrom(p0);
    }
    public static LiveGiftAchievement parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGiftAchievement(), p0);
    }
    public LiveGiftAchievement clear(){
       this.achievementId = 0;
       this.order = 0;
       this.name = "";
       this.displayText = "";
       this.lightOn = false;
       this.icon = LiveCdnNodeView.emptyArray();
       this.desc = "";
       this.gifts = LiveGiftAchievementGift.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGiftAchievement tachievement = this.achievementId;
       if (tachievement - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tachievement);
       }
       tachievement = this.order;
       if (tachievement != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tachievement);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.name);
       }
       if (!(this.displayText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayText);
       }
       tachievement = this.lightOn;
       if (tachievement != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tachievement);
       }
       tachievement = this.icon;
       int i1 = 0;
       if (tachievement != null && tachievement.length > 0) {
          int i2 = 0;
          LiveGiftAchievement ticon = this.icon;
          while (i2 < ticon.length) {
             object oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.desc);
       }
       tachievement = this.gifts;
       if (tachievement != null && tachievement.length > 0) {
          tachievement = this.gifts;
          while (i1 < tachievement.length) {
             object oobject1 = tachievement[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGiftAchievement mergeFrom(CodedInputByteBufferNano p0){
       LiveGiftAchievement tgifts;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         int i1 = 50;
                         if (i != i1) {
                            if (i != 58) {
                               i1 = 66;
                               if (i != i1) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                  tgifts = this.gifts;
                                  i2 = (tgifts == null)? 0: tgifts.length;
                                  i = i + i2;
                                  LiveGiftAchievementGift[] liveGiftAchi = new LiveGiftAchievementGift[i];
                                  if (i2) {
                                     System.arraycopy(tgifts, 0, liveGiftAchi, 0, i2);
                                  }
                                  i1 = i - 1;
                                  while (i2 < i1) {
                                     liveGiftAchi[i2] = new LiveGiftAchievementGift();
                                     p0.readMessage(liveGiftAchi[i2]);
                                     p0.readTag();
                                     i2 = i2 + 1;
                                  }
                                  liveGiftAchi[i2] = new LiveGiftAchievementGift();
                                  p0.readMessage(liveGiftAchi[i2]);
                                  this.gifts = liveGiftAchi;
                               }
                            }else {
                               this.desc = p0.readString();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tgifts = this.icon;
                            i2 = (tgifts == null)? 0: tgifts.length;
                            i = i + i2;
                            LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                            if (i2) {
                               System.arraycopy(tgifts, 0, liveCdnNodeV, 0, i2);
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
                            this.icon = liveCdnNodeV;
                         }
                      }else {
                         this.lightOn = p0.readBool();
                      }
                   }else {
                      this.displayText = p0.readString();
                   }
                }else {
                   this.name = p0.readString();
                }
             }else {
                this.order = p0.readUInt32();
             }
          }else {
             this.achievementId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveGiftAchievement tachievement = this.achievementId;
       if (tachievement - null) {
          p0.writeUInt64(1, tachievement);
       }
       tachievement = this.order;
       if (tachievement != null) {
          p0.writeUInt32(2, tachievement);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(3, this.name);
       }
       if (!(this.displayText).equals(str)) {
          p0.writeString(4, this.displayText);
       }
       tachievement = this.lightOn;
       if (tachievement != null) {
          p0.writeBool(5, tachievement);
       }
       tachievement = this.icon;
       int i = 0;
       if (tachievement != null && tachievement.length > 0) {
          int i1 = 0;
          LiveGiftAchievement ticon = this.icon;
          while (i1 < ticon.length) {
             object oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(7, this.desc);
       }
       tachievement = this.gifts;
       if (tachievement != null && tachievement.length > 0) {
          tachievement = this.gifts;
          while (i < tachievement.length) {
             object oobject1 = tachievement[i];
             if (oobject1 != null) {
                p0.writeMessage(8, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
