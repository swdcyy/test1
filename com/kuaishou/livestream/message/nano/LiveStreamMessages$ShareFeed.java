package com.kuaishou.livestream.message.nano.LiveStreamMessages$ShareFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$ShareFeed extends MessageNano	// class@00137b
{
    public String deviceHash;
    public int fansGroupContinueShareCurrentDay;
    public int fansGroupShareIntimacy;
    public String id;
    public boolean isKoi;
    public int liveAssistantType;
    public LiveAudienceState senderState;
    public int shareCount;
    public long sortRank;
    public int thirdPartyPlatform;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$ShareFeed[] _emptyArray;

    public void LiveStreamMessages$ShareFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$ShareFeed[] emptyArray(){
       if (LiveStreamMessages$ShareFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$ShareFeed._emptyArray == null) {
             LiveStreamMessages$ShareFeed[] shareFeedArr = new LiveStreamMessages$ShareFeed[0];
             LiveStreamMessages$ShareFeed._emptyArray = shareFeedArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$ShareFeed._emptyArray;
    }
    public static LiveStreamMessages$ShareFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$ShareFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$ShareFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$ShareFeed(), p0);
    }
    public LiveStreamMessages$ShareFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.thirdPartyPlatform = 0;
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.deviceHash = "";
       this.isKoi = false;
       this.senderState = null;
       this.shareCount = 0;
       this.fansGroupShareIntimacy = 0;
       this.fansGroupContinueShareCurrentDay = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$ShareFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$ShareFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       tuser = this.thirdPartyPlatform;
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
       tuser = this.shareCount;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tuser);
       }
       tuser = this.fansGroupShareIntimacy;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tuser);
       }
       tuser = this.fansGroupContinueShareCurrentDay;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$ShareFeed mergeFrom(CodedInputByteBufferNano p0){
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
                this.thirdPartyPlatform = p0.readUInt32();
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
                this.shareCount = p0.readUInt32();
                break;
              case 'X':
                this.fansGroupShareIntimacy = p0.readUInt32();
                break;
              case '`':
                this.fansGroupContinueShareCurrentDay = p0.readUInt32();
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
       LiveStreamMessages$ShareFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$ShareFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       tuser = this.thirdPartyPlatform;
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
       tuser = this.shareCount;
       if (tuser != null) {
          p0.writeUInt32(10, tuser);
       }
       tuser = this.fansGroupShareIntimacy;
       if (tuser != null) {
          p0.writeUInt32(11, tuser);
       }
       tuser = this.fansGroupContinueShareCurrentDay;
       if (tuser != null) {
          p0.writeUInt32(12, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
