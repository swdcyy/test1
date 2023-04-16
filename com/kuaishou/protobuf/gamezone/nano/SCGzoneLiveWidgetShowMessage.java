package com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveWidgetShowMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneLiveWidgetBubble;
import com.kuaishou.protobuf.gamezone.nano.GzoneLiveWidgetJumpAction;
import com.kuaishou.protobuf.gamezone.nano.GzoneLiveWidgetBottom;
import java.lang.System;

public final class SCGzoneLiveWidgetShowMessage extends MessageNano	// class@000bdc
{
    public GzoneLiveWidgetJumpAction action;
    public GzoneLiveWidgetBottom bottom;
    public SCGzoneLiveWidgetBubble bubble;
    public boolean forcePortrait;
    public boolean hasUserStatus;
    public UserInfos$PicUrl[] iconUrl;
    public String jumpUrl;
    public int maxDelayMillis;
    public long showEndTime;
    public int widgetId;
    public static SCGzoneLiveWidgetShowMessage[] _emptyArray;

    public void SCGzoneLiveWidgetShowMessage(){
       super();
       this.clear();
    }
    public static SCGzoneLiveWidgetShowMessage[] emptyArray(){
       if (SCGzoneLiveWidgetShowMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneLiveWidgetShowMessage._emptyArray == null) {
             SCGzoneLiveWidgetShowMessage[] sCGzoneLiveW = new SCGzoneLiveWidgetShowMessage[0];
             SCGzoneLiveWidgetShowMessage._emptyArray = sCGzoneLiveW;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneLiveWidgetShowMessage._emptyArray;
    }
    public static SCGzoneLiveWidgetShowMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneLiveWidgetShowMessage().mergeFrom(p0);
    }
    public static SCGzoneLiveWidgetShowMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneLiveWidgetShowMessage(), p0);
    }
    public SCGzoneLiveWidgetShowMessage clear(){
       this.widgetId = 0;
       this.showEndTime = 0;
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.jumpUrl = "";
       this.maxDelayMillis = 0;
       this.forcePortrait = false;
       this.hasUserStatus = false;
       this.bottom = null;
       this.action = null;
       this.bubble = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneLiveWidgetShowMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidgetId);
       }
       twidgetId = this.showEndTime;
       if (twidgetId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, twidgetId);
       }
       twidgetId = this.iconUrl;
       if (twidgetId != null && twidgetId.length > 0) {
          int i1 = 0;
          SCGzoneLiveWidgetShowMessage ticonUrl = this.iconUrl;
          while (i1 < ticonUrl.length) {
             object oobject = ticonUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.jumpUrl);
       }
       twidgetId = this.maxDelayMillis;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, twidgetId);
       }
       twidgetId = this.forcePortrait;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, twidgetId);
       }
       twidgetId = this.hasUserStatus;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, twidgetId);
       }
       twidgetId = this.bottom;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, twidgetId);
       }
       twidgetId = this.action;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, twidgetId);
       }
       twidgetId = this.bubble;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, twidgetId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneLiveWidgetShowMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.widgetId = p0.readUInt32();
                break;
              case 16:
                this.showEndTime = p0.readUInt64();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                SCGzoneLiveWidgetShowMessage ticonUrl = this.iconUrl;
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
              case '"':
                this.jumpUrl = p0.readString();
                break;
              case '(':
                this.maxDelayMillis = p0.readUInt32();
                break;
              case '0':
                this.forcePortrait = p0.readBool();
                break;
              case '8':
                this.hasUserStatus = p0.readBool();
                break;
              case 'B':
                if (this.bottom == null) {
                   this.bottom = new GzoneLiveWidgetBottom();
                }
                p0.readMessage(this.bottom);
                break;
              case 'J':
                if (this.action == null) {
                   this.action = new GzoneLiveWidgetJumpAction();
                }
                p0.readMessage(this.action);
                break;
              case 'R':
                if (this.bubble == null) {
                   this.bubble = new SCGzoneLiveWidgetBubble();
                }
                p0.readMessage(this.bubble);
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
       SCGzoneLiveWidgetShowMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          p0.writeUInt32(1, twidgetId);
       }
       twidgetId = this.showEndTime;
       if (twidgetId) {
          p0.writeUInt64(2, twidgetId);
       }
       twidgetId = this.iconUrl;
       if (twidgetId != null && twidgetId.length > 0) {
          int i = 0;
          SCGzoneLiveWidgetShowMessage ticonUrl = this.iconUrl;
          while (i < ticonUrl.length) {
             object oobject = ticonUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.jumpUrl).equals("")) {
          p0.writeString(4, this.jumpUrl);
       }
       twidgetId = this.maxDelayMillis;
       if (twidgetId != null) {
          p0.writeUInt32(5, twidgetId);
       }
       twidgetId = this.forcePortrait;
       if (twidgetId != null) {
          p0.writeBool(6, twidgetId);
       }
       twidgetId = this.hasUserStatus;
       if (twidgetId != null) {
          p0.writeBool(7, twidgetId);
       }
       twidgetId = this.bottom;
       if (twidgetId != null) {
          p0.writeMessage(8, twidgetId);
       }
       twidgetId = this.action;
       if (twidgetId != null) {
          p0.writeMessage(9, twidgetId);
       }
       twidgetId = this.bubble;
       if (twidgetId != null) {
          p0.writeMessage(10, twidgetId);
       }
       super.writeTo(p0);
       return;
    }
}
