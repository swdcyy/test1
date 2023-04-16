package com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveRevenueDeliverySellingChatInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatLastPkInfo;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatUserExtraInfo;

public final class LiveMultiLineChatExtraInfo extends MessageNano	// class@000cb1
{
    public int chatMode;
    public boolean disableInviteOtherUser;
    public String disableInviteOtherUserToastText;
    public boolean enableWishList;
    public LiveMultiLineChatLastPkInfo lastPkInfo;
    public String multiLineChatId;
    public SCLiveMultiLineChatOpened multiLineChatOpened;
    public LiveRevenueDeliverySellingChatInfo sellingChatInfo;
    public String subModeExtraInfo;
    public Map userExtraInfo;
    public static LiveMultiLineChatExtraInfo[] _emptyArray;

    public void LiveMultiLineChatExtraInfo(){
       super();
       this.clear();
    }
    public static LiveMultiLineChatExtraInfo[] emptyArray(){
       if (LiveMultiLineChatExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiLineChatExtraInfo._emptyArray == null) {
             LiveMultiLineChatExtraInfo[] liveMultiLin = new LiveMultiLineChatExtraInfo[0];
             LiveMultiLineChatExtraInfo._emptyArray = liveMultiLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiLineChatExtraInfo._emptyArray;
    }
    public static LiveMultiLineChatExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiLineChatExtraInfo().mergeFrom(p0);
    }
    public static LiveMultiLineChatExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiLineChatExtraInfo(), p0);
    }
    public LiveMultiLineChatExtraInfo clear(){
       this.userExtraInfo = null;
       this.disableInviteOtherUser = false;
       this.disableInviteOtherUserToastText = "";
       this.enableWishList = false;
       this.chatMode = 0;
       this.subModeExtraInfo = "";
       this.multiLineChatOpened = null;
       this.lastPkInfo = null;
       this.multiLineChatId = "";
       this.sellingChatInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiLineChatExtraInfo tuserExtraIn = this.userExtraInfo;
       int i1 = 4;
       if (tuserExtraIn != null) {
          i = i + InternalNano.computeMapFieldSize(tuserExtraIn, 1, i1, 11);
       }
       tuserExtraIn = this.disableInviteOtherUser;
       if (tuserExtraIn != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuserExtraIn);
       }
       if (!(this.disableInviteOtherUserToastText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.disableInviteOtherUserToastText);
       }
       tuserExtraIn = this.enableWishList;
       if (tuserExtraIn != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, tuserExtraIn);
       }
       tuserExtraIn = this.chatMode;
       if (tuserExtraIn != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuserExtraIn);
       }
       if (!(this.subModeExtraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.subModeExtraInfo);
       }
       tuserExtraIn = this.multiLineChatOpened;
       if (tuserExtraIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuserExtraIn);
       }
       tuserExtraIn = this.lastPkInfo;
       if (tuserExtraIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tuserExtraIn);
       }
       if (!(this.multiLineChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.multiLineChatId);
       }
       tuserExtraIn = this.sellingChatInfo;
       if (tuserExtraIn != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tuserExtraIn);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiLineChatExtraInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.userExtraInfo = InternalNano.mergeMapEntry(p0, this.userExtraInfo, mapFactory, 4, 11, new LiveMultiLineChatUserExtraInfo(), 8, 18);
                break;
              case 16:
                this.disableInviteOtherUser = p0.readBool();
                break;
              case 26:
                this.disableInviteOtherUserToastText = p0.readString();
                break;
              case 32:
                this.enableWishList = p0.readBool();
                break;
              case '(':
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
              case '2':
                this.subModeExtraInfo = p0.readString();
                break;
              case ':':
                if (this.multiLineChatOpened == null) {
                   this.multiLineChatOpened = new SCLiveMultiLineChatOpened();
                }
                p0.readMessage(this.multiLineChatOpened);
                break;
              case 'B':
                if (this.lastPkInfo == null) {
                   this.lastPkInfo = new LiveMultiLineChatLastPkInfo();
                }
                p0.readMessage(this.lastPkInfo);
                break;
              case 'J':
                this.multiLineChatId = p0.readString();
                break;
              case 'R':
                if (this.sellingChatInfo == null) {
                   this.sellingChatInfo = new LiveRevenueDeliverySellingChatInfo();
                }
                p0.readMessage(this.sellingChatInfo);
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
       LiveMultiLineChatExtraInfo tuserExtraIn = this.userExtraInfo;
       int i = 4;
       if (tuserExtraIn != null) {
          InternalNano.serializeMapField(p0, tuserExtraIn, 1, i, 11);
       }
       tuserExtraIn = this.disableInviteOtherUser;
       if (tuserExtraIn != null) {
          p0.writeBool(2, tuserExtraIn);
       }
       if (!(this.disableInviteOtherUserToastText).equals("")) {
          p0.writeString(3, this.disableInviteOtherUserToastText);
       }
       tuserExtraIn = this.enableWishList;
       if (tuserExtraIn != null) {
          p0.writeBool(i, tuserExtraIn);
       }
       tuserExtraIn = this.chatMode;
       if (tuserExtraIn != null) {
          p0.writeInt32(5, tuserExtraIn);
       }
       if (!(this.subModeExtraInfo).equals("")) {
          p0.writeString(6, this.subModeExtraInfo);
       }
       tuserExtraIn = this.multiLineChatOpened;
       if (tuserExtraIn != null) {
          p0.writeMessage(7, tuserExtraIn);
       }
       tuserExtraIn = this.lastPkInfo;
       if (tuserExtraIn != null) {
          p0.writeMessage(8, tuserExtraIn);
       }
       if (!(this.multiLineChatId).equals("")) {
          p0.writeString(9, this.multiLineChatId);
       }
       tuserExtraIn = this.sellingChatInfo;
       if (tuserExtraIn != null) {
          p0.writeMessage(10, tuserExtraIn);
       }
       super.writeTo(p0);
       return;
    }
}
