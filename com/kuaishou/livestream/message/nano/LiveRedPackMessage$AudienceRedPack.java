package com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPack;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPackGift;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveRedPackMessage$AudienceRedPack extends MessageNano	// class@00126b
{
    public LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme customRedPackSkinTheme;
    public LiveRedPackMessage$AudienceRedPackGift[] gift;
    public String globalRedPackIdentity;
    public long grabTime;
    public String redPackId;
    public UserInfos$UserInfo sendUser;
    public long showDeadline;
    public long showTime;
    public long totalKsCoin;
    public int type;
    public static LiveRedPackMessage$AudienceRedPack[] _emptyArray;

    public void LiveRedPackMessage$AudienceRedPack(){
       super();
       this.clear();
    }
    public static LiveRedPackMessage$AudienceRedPack[] emptyArray(){
       if (LiveRedPackMessage$AudienceRedPack._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackMessage$AudienceRedPack._emptyArray == null) {
             LiveRedPackMessage$AudienceRedPack[] uAudienceRed = new LiveRedPackMessage$AudienceRedPack[0];
             LiveRedPackMessage$AudienceRedPack._emptyArray = uAudienceRed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackMessage$AudienceRedPack._emptyArray;
    }
    public static LiveRedPackMessage$AudienceRedPack parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackMessage$AudienceRedPack().mergeFrom(p0);
    }
    public static LiveRedPackMessage$AudienceRedPack parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackMessage$AudienceRedPack(), p0);
    }
    public LiveRedPackMessage$AudienceRedPack clear(){
       this.redPackId = "";
       this.sendUser = null;
       this.grabTime = 0;
       this.type = 0;
       this.gift = LiveRedPackMessage$AudienceRedPackGift.emptyArray();
       this.showTime = 0;
       this.totalKsCoin = 0;
       this.showDeadline = 0;
       this.globalRedPackIdentity = "";
       this.customRedPackSkinTheme = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redPackId);
       }
       LiveRedPackMessage$AudienceRedPack tsendUser = this.sendUser;
       if (tsendUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tsendUser);
       }
       LiveRedPackMessage$AudienceRedPack tgrabTime = this.grabTime;
       if (tgrabTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tgrabTime);
       }
       tsendUser = this.type;
       if (tsendUser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tsendUser);
       }
       tsendUser = this.gift;
       if (tsendUser != null && tsendUser.length > 0) {
          int i1 = 0;
          tgrabTime = this.gift;
          while (i1 < tgrabTime.length) {
             object oobject = tgrabTime[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tgrabTime = this.showTime;
       if (tgrabTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tgrabTime);
       }
       tgrabTime = this.totalKsCoin;
       if (tgrabTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tgrabTime);
       }
       tgrabTime = this.showDeadline;
       if (tgrabTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tgrabTime);
       }
       if (!(this.globalRedPackIdentity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.globalRedPackIdentity);
       }
       tsendUser = this.customRedPackSkinTheme;
       if (tsendUser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tsendUser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackMessage$AudienceRedPack mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.redPackId = p0.readString();
                break;
              case 18:
                if (this.sendUser == null) {
                   this.sendUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.sendUser);
                break;
              case 24:
                this.grabTime = p0.readUInt64();
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.type = i;
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                LiveRedPackMessage$AudienceRedPack tgift = this.gift;
                int i1 = (tgift == null)? 0: tgift.length;
                i = i + i1;
                LiveRedPackMessage$AudienceRedPackGift[] uAudienceRed = new LiveRedPackMessage$AudienceRedPackGift[i];
                if (i1) {
                   System.arraycopy(tgift, 0, uAudienceRed, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   uAudienceRed[i1] = new LiveRedPackMessage$AudienceRedPackGift();
                   p0.readMessage(uAudienceRed[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uAudienceRed[i1] = new LiveRedPackMessage$AudienceRedPackGift();
                p0.readMessage(uAudienceRed[i1]);
                this.gift = uAudienceRed;
                break;
              case '0':
                this.showTime = p0.readUInt64();
                break;
              case '8':
                this.totalKsCoin = p0.readUInt64();
                break;
              case '@':
                this.showDeadline = p0.readUInt64();
                break;
              case 'J':
                this.globalRedPackIdentity = p0.readString();
                break;
              case 'R':
                if (this.customRedPackSkinTheme == null) {
                   this.customRedPackSkinTheme = new LiveCustomRedPackSkinMessage$CustomRedPackSkinTheme();
                }
                p0.readMessage(this.customRedPackSkinTheme);
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
       if (!(this.redPackId).equals(str)) {
          p0.writeString(1, this.redPackId);
       }
       LiveRedPackMessage$AudienceRedPack tsendUser = this.sendUser;
       if (tsendUser != null) {
          p0.writeMessage(2, tsendUser);
       }
       LiveRedPackMessage$AudienceRedPack tgrabTime = this.grabTime;
       if (tgrabTime) {
          p0.writeUInt64(3, tgrabTime);
       }
       tsendUser = this.type;
       if (tsendUser != null) {
          p0.writeInt32(4, tsendUser);
       }
       tsendUser = this.gift;
       if (tsendUser != null && tsendUser.length > 0) {
          int i = 0;
          tgrabTime = this.gift;
          while (i < tgrabTime.length) {
             object oobject = tgrabTime[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       tgrabTime = this.showTime;
       if (tgrabTime) {
          p0.writeUInt64(6, tgrabTime);
       }
       tgrabTime = this.totalKsCoin;
       if (tgrabTime) {
          p0.writeUInt64(7, tgrabTime);
       }
       tgrabTime = this.showDeadline;
       if (tgrabTime) {
          p0.writeUInt64(8, tgrabTime);
       }
       if (!(this.globalRedPackIdentity).equals(str)) {
          p0.writeString(9, this.globalRedPackIdentity);
       }
       tsendUser = this.customRedPackSkinTheme;
       if (tsendUser != null) {
          p0.writeMessage(10, tsendUser);
       }
       super.writeTo(p0);
       return;
    }
}
