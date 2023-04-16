package com.kuaishou.livestream.message.nano.LiveStreamMessages$WatchingListUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$WatchingListUserInfo extends MessageNano	// class@00138d
{
    public String displayKsCoin;
    public String displayScore;
    public String displayWatchDuration;
    public int liveAssistantType;
    public boolean offline;
    public long receivedZuan;
    public long score;
    public boolean tuhao;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public static LiveStreamMessages$WatchingListUserInfo[] _emptyArray;

    public void LiveStreamMessages$WatchingListUserInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$WatchingListUserInfo[] emptyArray(){
       if (LiveStreamMessages$WatchingListUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$WatchingListUserInfo._emptyArray == null) {
             LiveStreamMessages$WatchingListUserInfo[] watchingList = new LiveStreamMessages$WatchingListUserInfo[0];
             LiveStreamMessages$WatchingListUserInfo._emptyArray = watchingList;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$WatchingListUserInfo._emptyArray;
    }
    public static LiveStreamMessages$WatchingListUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$WatchingListUserInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$WatchingListUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$WatchingListUserInfo(), p0);
    }
    public LiveStreamMessages$WatchingListUserInfo clear(){
       this.user = null;
       this.offline = false;
       this.tuhao = false;
       this.receivedZuan = 0;
       this.liveAssistantType = 0;
       this.displayKsCoin = "";
       this.userState = null;
       this.displayScore = "";
       this.score = 0;
       this.displayWatchDuration = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$WatchingListUserInfo tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       tuser = this.offline;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuser);
       }
       tuser = this.tuhao;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tuser);
       }
       tuser = this.receivedZuan;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuser);
       }
       String str = "";
       if (!(this.displayKsCoin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayKsCoin);
       }
       tuser = this.userState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuser);
       }
       if (!(this.displayScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.displayScore);
       }
       LiveStreamMessages$WatchingListUserInfo tscore = this.score;
       if (tscore) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tscore);
       }
       if (!(this.displayWatchDuration).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.displayWatchDuration);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$WatchingListUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 16:
                this.offline = p0.readBool();
                break;
              case 24:
                this.tuhao = p0.readBool();
                break;
              case 32:
                this.receivedZuan = p0.readUInt64();
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case '2':
                this.displayKsCoin = p0.readString();
                break;
              case ':':
                if (this.userState == null) {
                   this.userState = new LiveAudienceState();
                }
                p0.readMessage(this.userState);
                break;
              case 'B':
                this.displayScore = p0.readString();
                break;
              case 'H':
                this.score = p0.readUInt64();
                break;
              case 'R':
                this.displayWatchDuration = p0.readString();
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
       LiveStreamMessages$WatchingListUserInfo tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.offline;
       if (tuser != null) {
          p0.writeBool(2, tuser);
       }
       tuser = this.tuhao;
       if (tuser != null) {
          p0.writeBool(3, tuser);
       }
       tuser = this.receivedZuan;
       if (tuser) {
          p0.writeUInt64(4, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(5, tuser);
       }
       String str = "";
       if (!(this.displayKsCoin).equals(str)) {
          p0.writeString(6, this.displayKsCoin);
       }
       tuser = this.userState;
       if (tuser != null) {
          p0.writeMessage(7, tuser);
       }
       if (!(this.displayScore).equals(str)) {
          p0.writeString(8, this.displayScore);
       }
       LiveStreamMessages$WatchingListUserInfo tscore = this.score;
       if (tscore) {
          p0.writeUInt64(9, tscore);
       }
       if (!(this.displayWatchDuration).equals(str)) {
          p0.writeString(10, this.displayWatchDuration);
       }
       super.writeTo(p0);
       return;
    }
}
