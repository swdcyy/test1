package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LiveMusicPackage extends MessageNano	// class@001324
{
    public int liveMode;
    public int lyricsState;
    public String musicChannelId;
    public long musicDuration;
    public String musicId;
    public int musicIndex;
    public String musicName;
    public String musicQosInfo;
    public String musicType;
    public long playDuration;
    public static ClientContentWrapper$LiveMusicPackage[] _emptyArray;

    public void ClientContentWrapper$LiveMusicPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveMusicPackage[] emptyArray(){
       if (ClientContentWrapper$LiveMusicPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveMusicPackage._emptyArray == null) {
             ClientContentWrapper$LiveMusicPackage[] liveMusicPac = new ClientContentWrapper$LiveMusicPackage[0];
             ClientContentWrapper$LiveMusicPackage._emptyArray = liveMusicPac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveMusicPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveMusicPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveMusicPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveMusicPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveMusicPackage(), p0);
    }
    public ClientContentWrapper$LiveMusicPackage clear(){
       this.liveMode = 0;
       this.musicId = "";
       this.musicName = "";
       this.musicType = "";
       this.playDuration = 0;
       this.musicDuration = 0;
       this.musicIndex = 0;
       this.lyricsState = 0;
       this.musicQosInfo = "";
       this.musicChannelId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$LiveMusicPackage tliveMode = this.liveMode;
       if (tliveMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tliveMode);
       }
       String str = "";
       if (!(this.musicId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.musicId);
       }
       if (!(this.musicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.musicName);
       }
       if (!(this.musicType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.musicType);
       }
       ClientContentWrapper$LiveMusicPackage tplayDuratio = this.playDuration;
       if (tplayDuratio) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tplayDuratio);
       }
       tplayDuratio = this.musicDuration;
       if (tplayDuratio) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tplayDuratio);
       }
       tliveMode = this.musicIndex;
       if (tliveMode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tliveMode);
       }
       tliveMode = this.lyricsState;
       if (tliveMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tliveMode);
       }
       if (!(this.musicQosInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.musicQosInfo);
       }
       if (!(this.musicChannelId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.musicChannelId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LiveMusicPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveMode = i;
                }
                break;
              case 18:
                this.musicId = p0.readString();
                break;
              case 26:
                this.musicName = p0.readString();
                break;
              case '"':
                this.musicType = p0.readString();
                break;
              case '(':
                this.playDuration = p0.readUInt64();
                break;
              case '0':
                this.musicDuration = p0.readUInt64();
                break;
              case '8':
                this.musicIndex = p0.readUInt32();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.lyricsState = i;
                }
                break;
              case 'J':
                this.musicQosInfo = p0.readString();
                break;
              case 'R':
                this.musicChannelId = p0.readString();
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
       ClientContentWrapper$LiveMusicPackage tliveMode = this.liveMode;
       if (tliveMode != null) {
          p0.writeInt32(1, tliveMode);
       }
       String str = "";
       if (!(this.musicId).equals(str)) {
          p0.writeString(2, this.musicId);
       }
       if (!(this.musicName).equals(str)) {
          p0.writeString(3, this.musicName);
       }
       if (!(this.musicType).equals(str)) {
          p0.writeString(4, this.musicType);
       }
       ClientContentWrapper$LiveMusicPackage tplayDuratio = this.playDuration;
       if (tplayDuratio) {
          p0.writeUInt64(5, tplayDuratio);
       }
       tplayDuratio = this.musicDuration;
       if (tplayDuratio) {
          p0.writeUInt64(6, tplayDuratio);
       }
       tliveMode = this.musicIndex;
       if (tliveMode != null) {
          p0.writeUInt32(7, tliveMode);
       }
       tliveMode = this.lyricsState;
       if (tliveMode != null) {
          p0.writeInt32(8, tliveMode);
       }
       if (!(this.musicQosInfo).equals(str)) {
          p0.writeString(9, this.musicQosInfo);
       }
       if (!(this.musicChannelId).equals(str)) {
          p0.writeString(10, this.musicChannelId);
       }
       super.writeTo(p0);
       return;
    }
}
