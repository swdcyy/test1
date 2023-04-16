package com.kuaishou.protobuf.livestream.nano.SCMultiPkReopenInvite;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinueInviteUserInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCMultiPkReopenInvite extends MessageNano	// class@000d76
{
    public String acceptButtonText;
    public String chatId;
    public String noticeSubtitle;
    public String noticeTitle;
    public String pkId;
    public int reopenSource;
    public int reopenType;
    public long timeoutMillis;
    public LiveMultiPkContinueInviteUserInfo[] userInfo;
    public long waitSwitchBizTimeoutMillis;
    public static SCMultiPkReopenInvite[] _emptyArray;

    public void SCMultiPkReopenInvite(){
       super();
       this.clear();
    }
    public static SCMultiPkReopenInvite[] emptyArray(){
       if (SCMultiPkReopenInvite._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMultiPkReopenInvite._emptyArray == null) {
             SCMultiPkReopenInvite[] sCMultiPkReo = new SCMultiPkReopenInvite[0];
             SCMultiPkReopenInvite._emptyArray = sCMultiPkReo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMultiPkReopenInvite._emptyArray;
    }
    public static SCMultiPkReopenInvite parseFrom(CodedInputByteBufferNano p0){
       return new SCMultiPkReopenInvite().mergeFrom(p0);
    }
    public static SCMultiPkReopenInvite parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMultiPkReopenInvite(), p0);
    }
    public SCMultiPkReopenInvite clear(){
       this.pkId = "";
       this.reopenSource = 0;
       this.timeoutMillis = 0;
       this.chatId = "";
       this.noticeTitle = "";
       this.noticeSubtitle = "";
       this.acceptButtonText = "";
       this.reopenType = 0;
       this.waitSwitchBizTimeoutMillis = 0;
       this.userInfo = LiveMultiPkContinueInviteUserInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCMultiPkReopenInvite treopenSourc = this.reopenSource;
       if (treopenSourc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, treopenSourc);
       }
       SCMultiPkReopenInvite ttimeoutMill = this.timeoutMillis;
       if (ttimeoutMill) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttimeoutMill);
       }
       if (!(this.chatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.chatId);
       }
       if (!(this.noticeTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.noticeTitle);
       }
       if (!(this.noticeSubtitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.noticeSubtitle);
       }
       if (!(this.acceptButtonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.acceptButtonText);
       }
       treopenSourc = this.reopenType;
       if (treopenSourc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, treopenSourc);
       }
       treopenSourc = this.waitSwitchBizTimeoutMillis;
       if (treopenSourc) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, treopenSourc);
       }
       treopenSourc = this.userInfo;
       if (treopenSourc != null && treopenSourc.length > 0) {
          int i1 = 0;
          SCMultiPkReopenInvite tuserInfo = this.userInfo;
          while (i1 < tuserInfo.length) {
             object oobject = tuserInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMultiPkReopenInvite mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.pkId = p0.readString();
                break;
              case 16:
                this.reopenSource = p0.readInt32();
                break;
              case 24:
                this.timeoutMillis = p0.readUInt64();
                break;
              case '"':
                this.chatId = p0.readString();
                break;
              case '*':
                this.noticeTitle = p0.readString();
                break;
              case '2':
                this.noticeSubtitle = p0.readString();
                break;
              case ':':
                this.acceptButtonText = p0.readString();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.reopenType = i;
                }
                break;
              case 'H':
                this.waitSwitchBizTimeoutMillis = p0.readUInt64();
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                SCMultiPkReopenInvite tuserInfo = this.userInfo;
                int i1 = (tuserInfo == null)? 0: tuserInfo.length;
                i = i + i1;
                LiveMultiPkContinueInviteUserInfo[] liveMultiPkC = new LiveMultiPkContinueInviteUserInfo[i];
                if (i1) {
                   System.arraycopy(tuserInfo, 0, liveMultiPkC, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveMultiPkC[i1] = new LiveMultiPkContinueInviteUserInfo();
                   p0.readMessage(liveMultiPkC[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveMultiPkC[i1] = new LiveMultiPkContinueInviteUserInfo();
                p0.readMessage(liveMultiPkC[i1]);
                this.userInfo = liveMultiPkC;
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
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       SCMultiPkReopenInvite treopenSourc = this.reopenSource;
       if (treopenSourc != null) {
          p0.writeInt32(2, treopenSourc);
       }
       SCMultiPkReopenInvite ttimeoutMill = this.timeoutMillis;
       if (ttimeoutMill) {
          p0.writeUInt64(3, ttimeoutMill);
       }
       if (!(this.chatId).equals(str)) {
          p0.writeString(4, this.chatId);
       }
       if (!(this.noticeTitle).equals(str)) {
          p0.writeString(5, this.noticeTitle);
       }
       if (!(this.noticeSubtitle).equals(str)) {
          p0.writeString(6, this.noticeSubtitle);
       }
       if (!(this.acceptButtonText).equals(str)) {
          p0.writeString(7, this.acceptButtonText);
       }
       treopenSourc = this.reopenType;
       if (treopenSourc != null) {
          p0.writeInt32(8, treopenSourc);
       }
       treopenSourc = this.waitSwitchBizTimeoutMillis;
       if (treopenSourc) {
          p0.writeUInt64(9, treopenSourc);
       }
       treopenSourc = this.userInfo;
       if (treopenSourc != null && treopenSourc.length > 0) {
          int i = 0;
          SCMultiPkReopenInvite tuserInfo = this.userInfo;
          while (i < tuserInfo.length) {
             object oobject = tuserInfo[i];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
