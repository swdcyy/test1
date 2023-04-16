package com.kuaishou.livestream.message.nano.SCLiveAttachCapsuleGiftMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class SCLiveAttachCapsuleGiftMessage extends MessageNano	// class@00140a
{
    public long authorId;
    public int bizType;
    public String capsuleBackgroundColor;
    public long capsuleTipShowMs;
    public String capsuleTipSubTitle;
    public String capsuleTipTitle;
    public boolean enableDefaultSelectNotNotify;
    public long expireTime;
    public String giftDescription;
    public int giftId;
    public long giftShowMs;
    public String giftToken;
    public String liveStreamId;
    public String notNotifyText;
    public boolean openPhoneAnimationDegrade;
    public String[] sendGiftMsgKeys;
    public long userId;
    public static SCLiveAttachCapsuleGiftMessage[] _emptyArray;

    public void SCLiveAttachCapsuleGiftMessage(){
       super();
       this.clear();
    }
    public static SCLiveAttachCapsuleGiftMessage[] emptyArray(){
       if (SCLiveAttachCapsuleGiftMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAttachCapsuleGiftMessage._emptyArray == null) {
             SCLiveAttachCapsuleGiftMessage[] sCLiveAttach = new SCLiveAttachCapsuleGiftMessage[0];
             SCLiveAttachCapsuleGiftMessage._emptyArray = sCLiveAttach;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAttachCapsuleGiftMessage._emptyArray;
    }
    public static SCLiveAttachCapsuleGiftMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAttachCapsuleGiftMessage().mergeFrom(p0);
    }
    public static SCLiveAttachCapsuleGiftMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAttachCapsuleGiftMessage(), p0);
    }
    public SCLiveAttachCapsuleGiftMessage clear(){
       this.userId = 0;
       this.liveStreamId = "";
       this.authorId = 0;
       this.capsuleTipShowMs = 0;
       this.capsuleTipTitle = "";
       this.capsuleTipSubTitle = "";
       this.capsuleBackgroundColor = "";
       this.giftId = 0;
       this.giftDescription = "";
       this.giftToken = "";
       this.giftShowMs = 0;
       this.expireTime = 0;
       this.bizType = 0;
       this.openPhoneAnimationDegrade = false;
       this.sendGiftMsgKeys = WireFormatNano.EMPTY_STRING_ARRAY;
       this.notNotifyText = "";
       this.enableDefaultSelectNotNotify = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveAttachCapsuleGiftMessage tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       SCLiveAttachCapsuleGiftMessage tauthorId = this.authorId;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       tauthorId = this.capsuleTipShowMs;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       if (!(this.capsuleTipTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.capsuleTipTitle);
       }
       if (!(this.capsuleTipSubTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.capsuleTipSubTitle);
       }
       if (!(this.capsuleBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.capsuleBackgroundColor);
       }
       tuserId = this.giftId;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tuserId);
       }
       if (!(this.giftDescription).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.giftDescription);
       }
       if (!(this.giftToken).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.giftToken);
       }
       tauthorId = this.giftShowMs;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tauthorId);
       }
       tauthorId = this.expireTime;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(12, tauthorId);
       }
       tuserId = this.bizType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tuserId);
       }
       tuserId = this.openPhoneAnimationDegrade;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tuserId);
       }
       tuserId = this.sendGiftMsgKeys;
       if (tuserId != null && tuserId.length > 0) {
          int i2 = 0;
          i1 = 0;
          int i3 = 0;
          tauthorId = this.sendGiftMsgKeys;
          while (i2 < tauthorId.length) {
             object oobject = tauthorId[i2];
             if (oobject != null) {
                i3 = i3 + 1;
                i1 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i1) + (i3 * 1);
       }
       if (!(this.notNotifyText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.notNotifyText);
       }
       tuserId = this.enableDefaultSelectNotNotify;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAttachCapsuleGiftMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.userId = p0.readUInt64();
                break;
              case 18:
                this.liveStreamId = p0.readString();
                break;
              case 24:
                this.authorId = p0.readUInt64();
                break;
              case 32:
                this.capsuleTipShowMs = p0.readUInt64();
                break;
              case '*':
                this.capsuleTipTitle = p0.readString();
                break;
              case '2':
                this.capsuleTipSubTitle = p0.readString();
                break;
              case ':':
                this.capsuleBackgroundColor = p0.readString();
                break;
              case '@':
                this.giftId = p0.readUInt32();
                break;
              case 'J':
                this.giftDescription = p0.readString();
                break;
              case 'R':
                this.giftToken = p0.readString();
                break;
              case 'X':
                this.giftShowMs = p0.readUInt64();
                break;
              case '`':
                this.expireTime = p0.readUInt64();
                break;
              case 'h':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.bizType = i;
                }
                break;
              case 'p':
                this.openPhoneAnimationDegrade = p0.readBool();
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                SCLiveAttachCapsuleGiftMessage tsendGiftMsg = this.sendGiftMsgKeys;
                int i1 = (tsendGiftMsg == null)? 0: tsendGiftMsg.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(tsendGiftMsg, 0, stringArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.sendGiftMsgKeys = stringArray;
                break;
              case 130:
                this.notNotifyText = p0.readString();
                break;
              case 136:
                this.enableDefaultSelectNotNotify = p0.readBool();
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
       SCLiveAttachCapsuleGiftMessage tuserId = this.userId;
       SCLiveAttachCapsuleGiftMessage sCLiveAttach = null;
       if (tuserId - sCLiveAttach) {
          p0.writeUInt64(1, tuserId);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       SCLiveAttachCapsuleGiftMessage tauthorId = this.authorId;
       if (tauthorId - sCLiveAttach) {
          p0.writeUInt64(3, tauthorId);
       }
       tauthorId = this.capsuleTipShowMs;
       if (tauthorId - sCLiveAttach) {
          p0.writeUInt64(4, tauthorId);
       }
       if (!(this.capsuleTipTitle).equals(str)) {
          p0.writeString(5, this.capsuleTipTitle);
       }
       if (!(this.capsuleTipSubTitle).equals(str)) {
          p0.writeString(6, this.capsuleTipSubTitle);
       }
       if (!(this.capsuleBackgroundColor).equals(str)) {
          p0.writeString(7, this.capsuleBackgroundColor);
       }
       tuserId = this.giftId;
       if (tuserId != null) {
          p0.writeUInt32(8, tuserId);
       }
       if (!(this.giftDescription).equals(str)) {
          p0.writeString(9, this.giftDescription);
       }
       if (!(this.giftToken).equals(str)) {
          p0.writeString(10, this.giftToken);
       }
       tauthorId = this.giftShowMs;
       if (tauthorId - sCLiveAttach) {
          p0.writeUInt64(11, tauthorId);
       }
       tauthorId = this.expireTime;
       if (tauthorId - sCLiveAttach) {
          p0.writeUInt64(12, tauthorId);
       }
       tuserId = this.bizType;
       if (tuserId != null) {
          p0.writeInt32(13, tuserId);
       }
       tuserId = this.openPhoneAnimationDegrade;
       if (tuserId != null) {
          p0.writeBool(14, tuserId);
       }
       tuserId = this.sendGiftMsgKeys;
       if (tuserId != null && tuserId.length > 0) {
          int i = 0;
          sCLiveAttach = this.sendGiftMsgKeys;
          while (i < sCLiveAttach.length) {
             object oobject = sCLiveAttach[i];
             if (oobject != null) {
                p0.writeString(15, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.notNotifyText).equals(str)) {
          p0.writeString(16, this.notNotifyText);
       }
       tuserId = this.enableDefaultSelectNotNotify;
       if (tuserId != null) {
          p0.writeBool(17, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
