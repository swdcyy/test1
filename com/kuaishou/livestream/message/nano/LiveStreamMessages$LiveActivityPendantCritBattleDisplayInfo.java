package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantTextInfo;

public final class LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo extends MessageNano	// class@0012e7
{
    public String[] countDownBgColor;
    public String[] countDownProgressColor;
    public LiveStreamMessages$LiveActivityPendantTextInfo critContent;
    public long critEndTime;
    public long critStartTime;
    public LiveStreamMessages$LiveActivityPendantTextInfo preCritContent;
    public LiveStreamMessages$LiveActivityPendantTextInfo showContent;
    public static LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo[] liveActivity = new LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo[0];
             LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo clear(){
       this.critStartTime = 0;
       this.critEndTime = 0;
       this.preCritContent = null;
       this.critContent = null;
       this.showContent = null;
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.countDownBgColor = eMPTY_STRING;
       this.countDownProgressColor = eMPTY_STRING;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i = super.computeSerializedSize();
       LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo tcritStartTi = this.critStartTime;
       int i1 = 0;
       if (tcritStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcritStartTi);
       }
       tcritStartTi = this.critEndTime;
       if (tcritStartTi - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcritStartTi);
       }
       tcritStartTi = this.preCritContent;
       if (tcritStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tcritStartTi);
       }
       tcritStartTi = this.critContent;
       if (tcritStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tcritStartTi);
       }
       tcritStartTi = this.showContent;
       if (tcritStartTi != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tcritStartTi);
       }
       tcritStartTi = this.countDownBgColor;
       int i2 = 0;
       if (tcritStartTi != null && tcritStartTi.length > 0) {
          i3 = 0;
          i1 = 0;
          int i4 = 0;
          LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo tcountDownBg = this.countDownBgColor;
          while (i3 < tcountDownBg.length) {
             object oobject = tcountDownBg[i3];
             if (oobject != null) {
                i4 = i4 + 1;
                i1 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i1) + (i4 * 1);
       }
       tcritStartTi = this.countDownProgressColor;
       if (tcritStartTi != null && tcritStartTi.length > 0) {
          i3 = 0;
          i1 = 0;
          LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo tcountDownPr = this.countDownProgressColor;
          while (i2 < tcountDownPr.length) {
             object oobject1 = tcountDownPr[i2];
             if (oobject1 != null) {
                i1 = i1 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i1 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo tcountDownPr;
       int i2;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            i1 = 58;
                            if (i != i1) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tcountDownPr = this.countDownProgressColor;
                               i2 = (tcountDownPr == null)? 0: tcountDownPr.length;
                               i = i + i2;
                               stringArray = new String[i];
                               if (i2) {
                                  System.arraycopy(tcountDownPr, 0, stringArray, 0, i2);
                               }
                               i1 = i - 1;
                               while (i2 < i1) {
                                  stringArray[i2] = p0.readString();
                                  p0.readTag();
                                  i2 = i2 + 1;
                               }
                               stringArray[i2] = p0.readString();
                               this.countDownProgressColor = stringArray;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tcountDownPr = this.countDownBgColor;
                            i2 = (tcountDownPr == null)? 0: tcountDownPr.length;
                            i = i + i2;
                            stringArray = new String[i];
                            if (i2) {
                               System.arraycopy(tcountDownPr, 0, stringArray, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               stringArray[i2] = p0.readString();
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            stringArray[i2] = p0.readString();
                            this.countDownBgColor = stringArray;
                         }
                      }else if(this.showContent == null){
                         this.showContent = new LiveStreamMessages$LiveActivityPendantTextInfo();
                      }
                      p0.readMessage(this.showContent);
                   }else if(this.critContent == null){
                      this.critContent = new LiveStreamMessages$LiveActivityPendantTextInfo();
                   }
                   p0.readMessage(this.critContent);
                }else if(this.preCritContent == null){
                   this.preCritContent = new LiveStreamMessages$LiveActivityPendantTextInfo();
                }
                p0.readMessage(this.preCritContent);
             }else {
                this.critEndTime = p0.readUInt64();
             }
          }else {
             this.critStartTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo tcritStartTi = this.critStartTime;
       LiveStreamMessages$LiveActivityPendantCritBattleDisplayInfo liveActivity = null;
       if (tcritStartTi - liveActivity) {
          p0.writeUInt64(1, tcritStartTi);
       }
       tcritStartTi = this.critEndTime;
       if (tcritStartTi - liveActivity) {
          p0.writeUInt64(2, tcritStartTi);
       }
       tcritStartTi = this.preCritContent;
       if (tcritStartTi != null) {
          p0.writeMessage(3, tcritStartTi);
       }
       tcritStartTi = this.critContent;
       if (tcritStartTi != null) {
          p0.writeMessage(4, tcritStartTi);
       }
       tcritStartTi = this.showContent;
       if (tcritStartTi != null) {
          p0.writeMessage(5, tcritStartTi);
       }
       tcritStartTi = this.countDownBgColor;
       int i = 0;
       if (tcritStartTi != null && tcritStartTi.length > 0) {
          int i1 = 0;
          liveActivity = this.countDownBgColor;
          while (i1 < liveActivity.length) {
             object oobject = liveActivity[i1];
             if (oobject != null) {
                p0.writeString(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcritStartTi = this.countDownProgressColor;
       if (tcritStartTi != null && tcritStartTi.length > 0) {
          tcritStartTi = this.countDownProgressColor;
          while (i < tcritStartTi.length) {
             object oobject1 = tcritStartTi[i];
             if (oobject1 != null) {
                p0.writeString(7, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
