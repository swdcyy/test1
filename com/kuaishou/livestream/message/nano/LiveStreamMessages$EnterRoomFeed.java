package com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomShareInfo;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$EnterRoomFeed extends MessageNano	// class@0012d2
{
    public String audienceDisplayMessage;
    public String authorDisplayMessage;
    public String deviceHash;
    public String displayUserName;
    public String enterAudienceDisplayMessage;
    public String id;
    public boolean isAnonymous;
    public boolean isKoi;
    public int liveAssistantType;
    public LiveAudienceState senderState;
    public LiveStreamMessages$EnterRoomShareInfo shareInfo;
    public long sortRank;
    public int source;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$EnterRoomFeed[] _emptyArray;

    public void LiveStreamMessages$EnterRoomFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$EnterRoomFeed[] emptyArray(){
       if (LiveStreamMessages$EnterRoomFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$EnterRoomFeed._emptyArray == null) {
             LiveStreamMessages$EnterRoomFeed[] uEnterRoomFe = new LiveStreamMessages$EnterRoomFeed[0];
             LiveStreamMessages$EnterRoomFeed._emptyArray = uEnterRoomFe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$EnterRoomFeed._emptyArray;
    }
    public static LiveStreamMessages$EnterRoomFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$EnterRoomFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$EnterRoomFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$EnterRoomFeed(), p0);
    }
    public LiveStreamMessages$EnterRoomFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.source = 0;
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.isKoi = false;
       this.senderState = null;
       this.isAnonymous = false;
       this.shareInfo = null;
       this.audienceDisplayMessage = "";
       this.authorDisplayMessage = "";
       this.enterAudienceDisplayMessage = "";
       this.displayUserName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$EnterRoomFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$EnterRoomFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       tuser = this.source;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tuser);
       }
       ttime = this.sortRank;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.deviceHash);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tuser);
       }
       tuser = this.shareInfo;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tuser);
       }
       if (!(this.audienceDisplayMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.audienceDisplayMessage);
       }
       if (!(this.authorDisplayMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.authorDisplayMessage);
       }
       if (!(this.enterAudienceDisplayMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.enterAudienceDisplayMessage);
       }
       if (!(this.displayUserName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.displayUserName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$EnterRoomFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 24:
                this.time = p0.readUInt64();
                break;
              case 32:
                this.source = p0.readUInt32();
                break;
              case '(':
                this.sortRank = p0.readUInt64();
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case ':':
                this.deviceHash = p0.readString();
                break;
              case '@':
                this.isKoi = p0.readBool();
                break;
              case 'J':
                if (this.senderState == null) {
                   this.senderState = new LiveAudienceState();
                }
                p0.readMessage(this.senderState);
                break;
              case 'P':
                this.isAnonymous = p0.readBool();
                break;
              case 'Z':
                if (this.shareInfo == null) {
                   this.shareInfo = new LiveStreamMessages$EnterRoomShareInfo();
                }
                p0.readMessage(this.shareInfo);
                break;
              case 'b':
                this.audienceDisplayMessage = p0.readString();
                break;
              case 'j':
                this.authorDisplayMessage = p0.readString();
                break;
              case 'r':
                this.enterAudienceDisplayMessage = p0.readString();
                break;
              case 'z':
                this.displayUserName = p0.readString();
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
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$EnterRoomFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$EnterRoomFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       tuser = this.source;
       if (tuser != null) {
          p0.writeUInt32(4, tuser);
       }
       ttime = this.sortRank;
       if (ttime) {
          p0.writeUInt64(5, ttime);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(6, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(7, this.deviceHash);
       }
       tuser = this.isKoi;
       if (tuser != null) {
          p0.writeBool(8, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(9, tuser);
       }
       tuser = this.isAnonymous;
       if (tuser != null) {
          p0.writeBool(10, tuser);
       }
       tuser = this.shareInfo;
       if (tuser != null) {
          p0.writeMessage(11, tuser);
       }
       if (!(this.audienceDisplayMessage).equals(str)) {
          p0.writeString(12, this.audienceDisplayMessage);
       }
       if (!(this.authorDisplayMessage).equals(str)) {
          p0.writeString(13, this.authorDisplayMessage);
       }
       if (!(this.enterAudienceDisplayMessage).equals(str)) {
          p0.writeString(14, this.enterAudienceDisplayMessage);
       }
       if (!(this.displayUserName).equals(str)) {
          p0.writeString(15, this.displayUserName);
       }
       super.writeTo(p0);
       return;
    }
}
