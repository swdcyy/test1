package com.kuaishou.client.log.content.packages.nano.ClientContent$MusicPlayStatPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MusicPlayStatPackageV2 extends MessageNano	// class@0012ba
{
    public long musicDuration;
    public String musicId;
    public int musicIndex;
    public String musicName;
    public int musicPlayMode;
    public String musicType;
    public long playedDuration;
    public String singerUserId;
    public static ClientContent$MusicPlayStatPackageV2[] _emptyArray;

    public void ClientContent$MusicPlayStatPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$MusicPlayStatPackageV2[] emptyArray(){
       if (ClientContent$MusicPlayStatPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MusicPlayStatPackageV2._emptyArray == null) {
             ClientContent$MusicPlayStatPackageV2[] musicPlaySta = new ClientContent$MusicPlayStatPackageV2[0];
             ClientContent$MusicPlayStatPackageV2._emptyArray = musicPlaySta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MusicPlayStatPackageV2._emptyArray;
    }
    public static ClientContent$MusicPlayStatPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MusicPlayStatPackageV2().mergeFrom(p0);
    }
    public static ClientContent$MusicPlayStatPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MusicPlayStatPackageV2(), p0);
    }
    public ClientContent$MusicPlayStatPackageV2 clear(){
       this.musicPlayMode = 0;
       this.musicId = "";
       this.musicName = "";
       this.musicType = "";
       this.musicIndex = 0;
       this.singerUserId = "";
       this.musicDuration = 0;
       this.playedDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$MusicPlayStatPackageV2 tmusicPlayMo = this.musicPlayMode;
       if (tmusicPlayMo != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmusicPlayMo);
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
       tmusicPlayMo = this.musicIndex;
       if (tmusicPlayMo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tmusicPlayMo);
       }
       if (!(this.singerUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.singerUserId);
       }
       tmusicPlayMo = this.musicDuration;
       int i1 = 0;
       if (tmusicPlayMo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tmusicPlayMo);
       }
       tmusicPlayMo = this.playedDuration;
       if (tmusicPlayMo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tmusicPlayMo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MusicPlayStatPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.playedDuration = p0.readUInt64();
                               }
                            }else {
                               this.musicDuration = p0.readUInt64();
                            }
                         }else {
                            this.singerUserId = p0.readString();
                         }
                      }else {
                         this.musicIndex = p0.readUInt32();
                      }
                   }else {
                      this.musicType = p0.readString();
                   }
                }else {
                   this.musicName = p0.readString();
                }
             }else {
                this.musicId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.musicPlayMode = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$MusicPlayStatPackageV2 tmusicPlayMo = this.musicPlayMode;
       if (tmusicPlayMo != null) {
          p0.writeInt32(1, tmusicPlayMo);
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
       tmusicPlayMo = this.musicIndex;
       if (tmusicPlayMo != null) {
          p0.writeUInt32(5, tmusicPlayMo);
       }
       if (!(this.singerUserId).equals(str)) {
          p0.writeString(6, this.singerUserId);
       }
       tmusicPlayMo = this.musicDuration;
       int i = 0;
       if (tmusicPlayMo - i) {
          p0.writeUInt64(7, tmusicPlayMo);
       }
       tmusicPlayMo = this.playedDuration;
       if (tmusicPlayMo - i) {
          p0.writeUInt64(8, tmusicPlayMo);
       }
       super.writeTo(p0);
       return;
    }
}
