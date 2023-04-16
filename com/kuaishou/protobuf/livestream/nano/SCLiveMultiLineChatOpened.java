package com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig;
import com.kuaishou.protobuf.livestream.nano.LiveRevenueDeliverySellingChatInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatLastPkInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatUserExtraInfo;

public final class SCLiveMultiLineChatOpened extends MessageNano	// class@000d5c
{
    public int chatMode;
    public String chatModeStartExtra;
    public boolean disableInviteOtherUser;
    public String disableInviteOtherUserToastText;
    public LiveMultiLineChatLastPkInfo lastPkInfo;
    public String multiLineChatId;
    public SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig scoreLineChatEntranceConfig;
    public LiveRevenueDeliverySellingChatInfo sellingChatInfo;
    public String subModeId;
    public Map userExtraInfo;
    public long version;
    public String wishGiftPanelUrl;
    public static SCLiveMultiLineChatOpened[] _emptyArray;

    public void SCLiveMultiLineChatOpened(){
       super();
       this.clear();
    }
    public static SCLiveMultiLineChatOpened[] emptyArray(){
       if (SCLiveMultiLineChatOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiLineChatOpened._emptyArray == null) {
             SCLiveMultiLineChatOpened[] sCLiveMultiL = new SCLiveMultiLineChatOpened[0];
             SCLiveMultiLineChatOpened._emptyArray = sCLiveMultiL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiLineChatOpened._emptyArray;
    }
    public static SCLiveMultiLineChatOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiLineChatOpened().mergeFrom(p0);
    }
    public static SCLiveMultiLineChatOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiLineChatOpened(), p0);
    }
    public SCLiveMultiLineChatOpened clear(){
       this.multiLineChatId = "";
       this.chatMode = 0;
       this.chatModeStartExtra = "";
       this.userExtraInfo = null;
       this.disableInviteOtherUser = false;
       this.disableInviteOtherUserToastText = "";
       this.version = 0;
       this.wishGiftPanelUrl = "";
       this.lastPkInfo = null;
       this.sellingChatInfo = null;
       this.subModeId = "";
       this.scoreLineChatEntranceConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.multiLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.multiLineChatId);
       }
       SCLiveMultiLineChatOpened tchatMode = this.chatMode;
       if (tchatMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tchatMode);
       }
       if (!(this.chatModeStartExtra).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.chatModeStartExtra);
       }
       tchatMode = this.userExtraInfo;
       if (tchatMode != null) {
          i = i + InternalNano.computeMapFieldSize(tchatMode, 4, 4, 11);
       }
       tchatMode = this.disableInviteOtherUser;
       if (tchatMode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tchatMode);
       }
       if (!(this.disableInviteOtherUserToastText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.disableInviteOtherUserToastText);
       }
       SCLiveMultiLineChatOpened tversion = this.version;
       if (tversion) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tversion);
       }
       if (!(this.wishGiftPanelUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.wishGiftPanelUrl);
       }
       tchatMode = this.lastPkInfo;
       if (tchatMode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tchatMode);
       }
       tchatMode = this.sellingChatInfo;
       if (tchatMode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tchatMode);
       }
       if (!(this.subModeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.subModeId);
       }
       tchatMode = this.scoreLineChatEntranceConfig;
       if (tchatMode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tchatMode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiLineChatOpened mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.multiLineChatId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.chatMode = i;
                break;
              case 26:
                this.chatModeStartExtra = p0.readString();
                break;
              case '"':
                this.userExtraInfo = InternalNano.mergeMapEntry(p0, this.userExtraInfo, mapFactory, 4, 11, new LiveMultiLineChatUserExtraInfo(), 8, 18);
                break;
              case '(':
                this.disableInviteOtherUser = p0.readBool();
                break;
              case '2':
                this.disableInviteOtherUserToastText = p0.readString();
                break;
              case '8':
                this.version = p0.readUInt64();
                break;
              case 'B':
                this.wishGiftPanelUrl = p0.readString();
                break;
              case 'J':
                if (this.lastPkInfo == null) {
                   this.lastPkInfo = new LiveMultiLineChatLastPkInfo();
                }
                p0.readMessage(this.lastPkInfo);
                break;
              case 'R':
                if (this.sellingChatInfo == null) {
                   this.sellingChatInfo = new LiveRevenueDeliverySellingChatInfo();
                }
                p0.readMessage(this.sellingChatInfo);
                break;
              case 'Z':
                this.subModeId = p0.readString();
                break;
              case 'b':
                if (this.scoreLineChatEntranceConfig == null) {
                   this.scoreLineChatEntranceConfig = new SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig();
                }
                p0.readMessage(this.scoreLineChatEntranceConfig);
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
       if (!(this.multiLineChatId).equals(str)) {
          p0.writeString(1, this.multiLineChatId);
       }
       SCLiveMultiLineChatOpened tchatMode = this.chatMode;
       if (tchatMode != null) {
          p0.writeInt32(2, tchatMode);
       }
       if (!(this.chatModeStartExtra).equals(str)) {
          p0.writeString(3, this.chatModeStartExtra);
       }
       tchatMode = this.userExtraInfo;
       if (tchatMode != null) {
          InternalNano.serializeMapField(p0, tchatMode, 4, 4, 11);
       }
       tchatMode = this.disableInviteOtherUser;
       if (tchatMode != null) {
          p0.writeBool(5, tchatMode);
       }
       if (!(this.disableInviteOtherUserToastText).equals(str)) {
          p0.writeString(6, this.disableInviteOtherUserToastText);
       }
       SCLiveMultiLineChatOpened tversion = this.version;
       if (tversion) {
          p0.writeUInt64(7, tversion);
       }
       if (!(this.wishGiftPanelUrl).equals(str)) {
          p0.writeString(8, this.wishGiftPanelUrl);
       }
       tchatMode = this.lastPkInfo;
       if (tchatMode != null) {
          p0.writeMessage(9, tchatMode);
       }
       tchatMode = this.sellingChatInfo;
       if (tchatMode != null) {
          p0.writeMessage(10, tchatMode);
       }
       if (!(this.subModeId).equals(str)) {
          p0.writeString(11, this.subModeId);
       }
       tchatMode = this.scoreLineChatEntranceConfig;
       if (tchatMode != null) {
          p0.writeMessage(12, tchatMode);
       }
       super.writeTo(p0);
       return;
    }
}
