package com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$ConditionRedPackSkin;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo;

public final class LiveCustomRedPackSkinMessage$ConditionRedPackSkin extends MessageNano	// class@001175
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo badgeInfo;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo innerInfo;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo joinButton;
    public String[] resultRefreshButtonBgColor;
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo sendGiftButton;
    public String themeTextColor;
    public static LiveCustomRedPackSkinMessage$ConditionRedPackSkin[] _emptyArray;

    public void LiveCustomRedPackSkinMessage$ConditionRedPackSkin(){
       super();
       this.clear();
    }
    public static LiveCustomRedPackSkinMessage$ConditionRedPackSkin[] emptyArray(){
       if (LiveCustomRedPackSkinMessage$ConditionRedPackSkin._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomRedPackSkinMessage$ConditionRedPackSkin._emptyArray == null) {
             LiveCustomRedPackSkinMessage$ConditionRedPackSkin[] uConditionRe = new LiveCustomRedPackSkinMessage$ConditionRedPackSkin[0];
             LiveCustomRedPackSkinMessage$ConditionRedPackSkin._emptyArray = uConditionRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomRedPackSkinMessage$ConditionRedPackSkin._emptyArray;
    }
    public static LiveCustomRedPackSkinMessage$ConditionRedPackSkin parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomRedPackSkinMessage$ConditionRedPackSkin().mergeFrom(p0);
    }
    public static LiveCustomRedPackSkinMessage$ConditionRedPackSkin parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomRedPackSkinMessage$ConditionRedPackSkin(), p0);
    }
    public LiveCustomRedPackSkinMessage$ConditionRedPackSkin clear(){
       this.joinButton = null;
       this.innerInfo = null;
       this.badgeInfo = null;
       this.sendGiftButton = null;
       this.themeTextColor = "";
       this.resultRefreshButtonBgColor = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomRedPackSkinMessage$ConditionRedPackSkin tjoinButton = this.joinButton;
       if (tjoinButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tjoinButton);
       }
       tjoinButton = this.innerInfo;
       if (tjoinButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tjoinButton);
       }
       tjoinButton = this.badgeInfo;
       if (tjoinButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tjoinButton);
       }
       tjoinButton = this.sendGiftButton;
       if (tjoinButton != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tjoinButton);
       }
       if (!(this.themeTextColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.themeTextColor);
       }
       tjoinButton = this.resultRefreshButtonBgColor;
       if (tjoinButton != null && tjoinButton.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveCustomRedPackSkinMessage$ConditionRedPackSkin tresultRefre = this.resultRefreshButtonBgColor;
          while (i1 < tresultRefre.length) {
             object oobject = tresultRefre[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomRedPackSkinMessage$ConditionRedPackSkin mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            LiveCustomRedPackSkinMessage$ConditionRedPackSkin tresultRefre = this.resultRefreshButtonBgColor;
                            int i2 = (tresultRefre == null)? 0: tresultRefre.length;
                            i = i + i2;
                            String[] stringArray = new String[i];
                            if (i2) {
                               System.arraycopy(tresultRefre, 0, stringArray, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               stringArray[i2] = p0.readString();
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            stringArray[i2] = p0.readString();
                            this.resultRefreshButtonBgColor = stringArray;
                         }
                      }else {
                         this.themeTextColor = p0.readString();
                      }
                   }else if(this.sendGiftButton == null){
                      this.sendGiftButton = new LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo();
                   }
                   p0.readMessage(this.sendGiftButton);
                }else if(this.badgeInfo == null){
                   this.badgeInfo = new LiveCustomRedPackSkinMessage$CustomRedPackSkinBadgeInfo();
                }
                p0.readMessage(this.badgeInfo);
             }else if(this.innerInfo == null){
                this.innerInfo = new LiveCustomRedPackSkinMessage$CustomRedPackSkinBasicInnerInfo();
             }
             p0.readMessage(this.innerInfo);
          }else if(this.joinButton == null){
             this.joinButton = new LiveCustomRedPackSkinMessage$CustomRedPackSkinButtonInfo();
          }
          p0.readMessage(this.joinButton);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomRedPackSkinMessage$ConditionRedPackSkin tjoinButton = this.joinButton;
       if (tjoinButton != null) {
          p0.writeMessage(1, tjoinButton);
       }
       tjoinButton = this.innerInfo;
       if (tjoinButton != null) {
          p0.writeMessage(2, tjoinButton);
       }
       tjoinButton = this.badgeInfo;
       if (tjoinButton != null) {
          p0.writeMessage(3, tjoinButton);
       }
       tjoinButton = this.sendGiftButton;
       if (tjoinButton != null) {
          p0.writeMessage(4, tjoinButton);
       }
       if (!(this.themeTextColor).equals("")) {
          p0.writeString(5, this.themeTextColor);
       }
       tjoinButton = this.resultRefreshButtonBgColor;
       if (tjoinButton != null && tjoinButton.length > 0) {
          int i = 0;
          LiveCustomRedPackSkinMessage$ConditionRedPackSkin tresultRefre = this.resultRefreshButtonBgColor;
          while (i < tresultRefre.length) {
             object oobject = tresultRefre[i];
             if (oobject != null) {
                p0.writeString(6, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
