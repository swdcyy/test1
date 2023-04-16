package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$PkPlayerInfo extends MessageNano	// class@001317
{
    public String avatarFrameUrl;
    public String liveStreamId;
    public UserInfos$UserInfo player;
    public String watchingCount;
    public static LiveStreamMessages$PkPlayerInfo[] _emptyArray;

    public void LiveStreamMessages$PkPlayerInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkPlayerInfo[] emptyArray(){
       if (LiveStreamMessages$PkPlayerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkPlayerInfo._emptyArray == null) {
             LiveStreamMessages$PkPlayerInfo[] pkPlayerInfo = new LiveStreamMessages$PkPlayerInfo[0];
             LiveStreamMessages$PkPlayerInfo._emptyArray = pkPlayerInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkPlayerInfo._emptyArray;
    }
    public static LiveStreamMessages$PkPlayerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkPlayerInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkPlayerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkPlayerInfo(), p0);
    }
    public LiveStreamMessages$PkPlayerInfo clear(){
       this.player = null;
       this.liveStreamId = "";
       this.watchingCount = "";
       this.avatarFrameUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkPlayerInfo tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.watchingCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.watchingCount);
       }
       if (!(this.avatarFrameUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.avatarFrameUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkPlayerInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.avatarFrameUrl = p0.readString();
                   }
                }else {
                   this.watchingCount = p0.readString();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else if(this.player == null){
             this.player = new UserInfos$UserInfo();
          }
          p0.readMessage(this.player);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PkPlayerInfo tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.watchingCount).equals(str)) {
          p0.writeString(3, this.watchingCount);
       }
       if (!(this.avatarFrameUrl).equals(str)) {
          p0.writeString(4, this.avatarFrameUrl);
       }
       super.writeTo(p0);
       return;
    }
}
