package com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveTopLittlePedantMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneLiveTopLittlePedantMessage extends MessageNano	// class@000bd8
{
    public String bizId;
    public boolean checkUserStatus;
    public boolean forcePortrait;
    public UserInfos$PicUrl[] iconUrl;
    public boolean ignoreLandscape;
    public String jumpUrl;
    public int maxCheckDelayMillis;
    public String payloadData;
    public long showExpiredTime;
    public int widgetId;
    public static SCGzoneLiveTopLittlePedantMessage[] _emptyArray;

    public void SCGzoneLiveTopLittlePedantMessage(){
       super();
       this.clear();
    }
    public static SCGzoneLiveTopLittlePedantMessage[] emptyArray(){
       if (SCGzoneLiveTopLittlePedantMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveTopLittlePedantMessage._emptyArray == null) {
             SCGzoneLiveTopLittlePedantMessage[] sCGzoneLiveT = new SCGzoneLiveTopLittlePedantMessage[0];
             SCGzoneLiveTopLittlePedantMessage._emptyArray = sCGzoneLiveT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveTopLittlePedantMessage._emptyArray;
    }
    public static SCGzoneLiveTopLittlePedantMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveTopLittlePedantMessage().mergeFrom(p0);
    }
    public static SCGzoneLiveTopLittlePedantMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveTopLittlePedantMessage(), p0);
    }
    public SCGzoneLiveTopLittlePedantMessage clear(){
       this.widgetId = 0;
       this.bizId = "";
       this.checkUserStatus = false;
       this.maxCheckDelayMillis = 0;
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.showExpiredTime = 0;
       this.jumpUrl = "";
       this.payloadData = "";
       this.ignoreLandscape = false;
       this.forcePortrait = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCGzoneLiveTopLittlePedantMessage ticonUrl;
       int i = super.computeSerializedSize();
       SCGzoneLiveTopLittlePedantMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidgetId);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       twidgetId = this.checkUserStatus;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, twidgetId);
       }
       twidgetId = this.maxCheckDelayMillis;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, twidgetId);
       }
       twidgetId = this.iconUrl;
       if (twidgetId != null && twidgetId.length > 0) {
          int i1 = 0;
          ticonUrl = this.iconUrl;
          while (i1 < ticonUrl.length) {
             object oobject = ticonUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ticonUrl = this.showExpiredTime;
       if (ticonUrl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ticonUrl);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jumpUrl);
       }
       if (!(this.payloadData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.payloadData);
       }
       twidgetId = this.ignoreLandscape;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, twidgetId);
       }
       twidgetId = this.forcePortrait;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, twidgetId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveTopLittlePedantMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.widgetId = p0.readUInt32();
                break;
              case 18:
                this.bizId = p0.readString();
                break;
              case 24:
                this.checkUserStatus = p0.readBool();
                break;
              case 32:
                this.maxCheckDelayMillis = p0.readUInt32();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                SCGzoneLiveTopLittlePedantMessage ticonUrl = this.iconUrl;
                int i1 = (ticonUrl == null)? 0: ticonUrl.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(ticonUrl, 0, picUrlArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.iconUrl = picUrlArray;
                break;
              case '0':
                this.showExpiredTime = p0.readUInt64();
                break;
              case ':':
                this.jumpUrl = p0.readString();
                break;
              case 'B':
                this.payloadData = p0.readString();
                break;
              case 'H':
                this.ignoreLandscape = p0.readBool();
                break;
              case 'P':
                this.forcePortrait = p0.readBool();
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
       SCGzoneLiveTopLittlePedantMessage ticonUrl;
       SCGzoneLiveTopLittlePedantMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          p0.writeUInt32(1, twidgetId);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(2, this.bizId);
       }
       twidgetId = this.checkUserStatus;
       if (twidgetId != null) {
          p0.writeBool(3, twidgetId);
       }
       twidgetId = this.maxCheckDelayMillis;
       if (twidgetId != null) {
          p0.writeUInt32(4, twidgetId);
       }
       twidgetId = this.iconUrl;
       if (twidgetId != null && twidgetId.length > 0) {
          int i = 0;
          ticonUrl = this.iconUrl;
          while (i < ticonUrl.length) {
             object oobject = ticonUrl[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       ticonUrl = this.showExpiredTime;
       if (ticonUrl) {
          p0.writeUInt64(6, ticonUrl);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(7, this.jumpUrl);
       }
       if (!(this.payloadData).equals(str)) {
          p0.writeString(8, this.payloadData);
       }
       twidgetId = this.ignoreLandscape;
       if (twidgetId != null) {
          p0.writeBool(9, twidgetId);
       }
       twidgetId = this.forcePortrait;
       if (twidgetId != null) {
          p0.writeBool(10, twidgetId);
       }
       super.writeTo(p0);
       return;
    }
}
