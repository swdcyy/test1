package com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInvite;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo;
import com.kuaishou.livestream.message.nano.LiveLineChatMessages$LiveLineChatPayInfo;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveLineChatMessages$SCLiveLineChatInvite extends MessageNano	// class@0011e0
{
    public String acceptButtonText;
    public long acceptDeadlineTimestamp;
    public long commentNoticeDeadlineTimestamp;
    public UserInfos$UserInfo inviter;
    public String inviterDetailUrl;
    public String inviterLiveStreamId;
    public LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo inviterLiveStreamInfo;
    public boolean isPaidChatInvite;
    public String lineChatId;
    public String liveStreamId;
    public String paidChatInviteCommentButtonDesc;
    public String paidChatInviteCommentDesc;
    public String paidChatInviteCommentTitle;
    public LiveLineChatMessages$LiveLineChatPayInfo payInfo;
    public String[] tag;
    public static LiveLineChatMessages$SCLiveLineChatInvite[] _emptyArray;

    public void LiveLineChatMessages$SCLiveLineChatInvite(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$SCLiveLineChatInvite[] emptyArray(){
       if (LiveLineChatMessages$SCLiveLineChatInvite._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$SCLiveLineChatInvite._emptyArray == null) {
             LiveLineChatMessages$SCLiveLineChatInvite[] sCLiveLineCh = new LiveLineChatMessages$SCLiveLineChatInvite[0];
             LiveLineChatMessages$SCLiveLineChatInvite._emptyArray = sCLiveLineCh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$SCLiveLineChatInvite._emptyArray;
    }
    public static LiveLineChatMessages$SCLiveLineChatInvite parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$SCLiveLineChatInvite().mergeFrom(p0);
    }
    public static LiveLineChatMessages$SCLiveLineChatInvite parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$SCLiveLineChatInvite(), p0);
    }
    public LiveLineChatMessages$SCLiveLineChatInvite clear(){
       this.inviter = null;
       this.acceptDeadlineTimestamp = 0;
       this.liveStreamId = "";
       this.lineChatId = "";
       this.tag = WireFormatNano.EMPTY_STRING_ARRAY;
       this.payInfo = null;
       this.inviterLiveStreamInfo = null;
       this.acceptButtonText = "";
       this.inviterLiveStreamId = "";
       this.isPaidChatInvite = false;
       this.commentNoticeDeadlineTimestamp = 0;
       this.paidChatInviteCommentTitle = "";
       this.paidChatInviteCommentDesc = "";
       this.inviterDetailUrl = "";
       this.paidChatInviteCommentButtonDesc = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveLineChatMessages$SCLiveLineChatInvite tinviter = this.inviter;
       int i1 = 1;
       if (tinviter != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tinviter);
       }
       LiveLineChatMessages$SCLiveLineChatInvite tacceptDeadl = this.acceptDeadlineTimestamp;
       if (tacceptDeadl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tacceptDeadl);
       }
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       if (!(this.lineChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.lineChatId);
       }
       tinviter = this.tag;
       if (tinviter != null && tinviter.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          LiveLineChatMessages$SCLiveLineChatInvite ttag = this.tag;
          while (i2 < ttag.length) {
             object oobject = ttag[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tinviter = this.payInfo;
       if (tinviter != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tinviter);
       }
       tinviter = this.inviterLiveStreamInfo;
       if (tinviter != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tinviter);
       }
       if (!(this.acceptButtonText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.acceptButtonText);
       }
       if (!(this.inviterLiveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.inviterLiveStreamId);
       }
       tinviter = this.isPaidChatInvite;
       if (tinviter != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tinviter);
       }
       tinviter = this.commentNoticeDeadlineTimestamp;
       if (tinviter) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tinviter);
       }
       if (!(this.paidChatInviteCommentTitle).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.paidChatInviteCommentTitle);
       }
       if (!(this.paidChatInviteCommentDesc).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.paidChatInviteCommentDesc);
       }
       if (!(this.inviterDetailUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.inviterDetailUrl);
       }
       if (!(this.paidChatInviteCommentButtonDesc).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.paidChatInviteCommentButtonDesc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$SCLiveLineChatInvite mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.inviter == null) {
                   this.inviter = new UserInfos$UserInfo();
                }
                p0.readMessage(this.inviter);
                break;
              case 16:
                this.acceptDeadlineTimestamp = p0.readUInt64();
                break;
              case 26:
                this.liveStreamId = p0.readString();
                break;
              case '"':
                this.lineChatId = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                LiveLineChatMessages$SCLiveLineChatInvite ttag = this.tag;
                int i1 = (ttag == null)? 0: ttag.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(ttag, 0, stringArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.tag = stringArray;
                break;
              case '2':
                if (this.payInfo == null) {
                   this.payInfo = new LiveLineChatMessages$LiveLineChatPayInfo();
                }
                p0.readMessage(this.payInfo);
                break;
              case ':':
                if (this.inviterLiveStreamInfo == null) {
                   this.inviterLiveStreamInfo = new LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo();
                }
                p0.readMessage(this.inviterLiveStreamInfo);
                break;
              case 'B':
                this.acceptButtonText = p0.readString();
                break;
              case 'J':
                this.inviterLiveStreamId = p0.readString();
                break;
              case 'P':
                this.isPaidChatInvite = p0.readBool();
                break;
              case 'X':
                this.commentNoticeDeadlineTimestamp = p0.readUInt64();
                break;
              case 'b':
                this.paidChatInviteCommentTitle = p0.readString();
                break;
              case 'j':
                this.paidChatInviteCommentDesc = p0.readString();
                break;
              case 'r':
                this.inviterDetailUrl = p0.readString();
                break;
              case 'z':
                this.paidChatInviteCommentButtonDesc = p0.readString();
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
       LiveLineChatMessages$SCLiveLineChatInvite ttag;
       LiveLineChatMessages$SCLiveLineChatInvite tinviter = this.inviter;
       if (tinviter != null) {
          p0.writeMessage(1, tinviter);
       }
       tinviter = this.acceptDeadlineTimestamp;
       LiveLineChatMessages$SCLiveLineChatInvite sCLiveLineCh = null;
       if (tinviter - sCLiveLineCh) {
          p0.writeUInt64(2, tinviter);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       if (!(this.lineChatId).equals(str)) {
          p0.writeString(4, this.lineChatId);
       }
       tinviter = this.tag;
       if (tinviter != null && tinviter.length > 0) {
          int i = 0;
          ttag = this.tag;
          while (i < ttag.length) {
             object oobject = ttag[i];
             if (oobject != null) {
                p0.writeString(5, oobject);
             }
             i = i + 1;
          }
       }
       tinviter = this.payInfo;
       if (tinviter != null) {
          p0.writeMessage(6, tinviter);
       }
       tinviter = this.inviterLiveStreamInfo;
       if (tinviter != null) {
          p0.writeMessage(7, tinviter);
       }
       if (!(this.acceptButtonText).equals(str)) {
          p0.writeString(8, this.acceptButtonText);
       }
       if (!(this.inviterLiveStreamId).equals(str)) {
          p0.writeString(9, this.inviterLiveStreamId);
       }
       tinviter = this.isPaidChatInvite;
       if (tinviter != null) {
          p0.writeBool(10, tinviter);
       }
       ttag = this.commentNoticeDeadlineTimestamp;
       if (ttag - sCLiveLineCh) {
          p0.writeUInt64(11, ttag);
       }
       if (!(this.paidChatInviteCommentTitle).equals(str)) {
          p0.writeString(12, this.paidChatInviteCommentTitle);
       }
       if (!(this.paidChatInviteCommentDesc).equals(str)) {
          p0.writeString(13, this.paidChatInviteCommentDesc);
       }
       if (!(this.inviterDetailUrl).equals(str)) {
          p0.writeString(14, this.inviterDetailUrl);
       }
       if (!(this.paidChatInviteCommentButtonDesc).equals(str)) {
          p0.writeString(15, this.paidChatInviteCommentButtonDesc);
       }
       super.writeTo(p0);
       return;
    }
}
