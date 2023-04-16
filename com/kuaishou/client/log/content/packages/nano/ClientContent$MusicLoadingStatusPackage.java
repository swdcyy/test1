package com.kuaishou.client.log.content.packages.nano.ClientContent$MusicLoadingStatusPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MusicLoadingStatusPackage extends MessageNano	// class@0012b8
{
    public String downloadUrl;
    public long loadingDuration;
    public long musicDuration;
    public int musicFileType;
    public String musicId;
    public String musicLoadingMode;
    public String musicName;
    public static ClientContent$MusicLoadingStatusPackage[] _emptyArray;

    public void ClientContent$MusicLoadingStatusPackage(){
       super();
       this.clear();
    }
    public static ClientContent$MusicLoadingStatusPackage[] emptyArray(){
       if (ClientContent$MusicLoadingStatusPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MusicLoadingStatusPackage._emptyArray == null) {
             ClientContent$MusicLoadingStatusPackage[] musicLoading = new ClientContent$MusicLoadingStatusPackage[0];
             ClientContent$MusicLoadingStatusPackage._emptyArray = musicLoading;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MusicLoadingStatusPackage._emptyArray;
    }
    public static ClientContent$MusicLoadingStatusPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MusicLoadingStatusPackage().mergeFrom(p0);
    }
    public static ClientContent$MusicLoadingStatusPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MusicLoadingStatusPackage(), p0);
    }
    public ClientContent$MusicLoadingStatusPackage clear(){
       this.musicFileType = 0;
       this.musicLoadingMode = "";
       this.musicId = "";
       this.musicName = "";
       this.musicDuration = 0;
       this.downloadUrl = "";
       this.loadingDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$MusicLoadingStatusPackage tmusicFileTy = this.musicFileType;
       if (tmusicFileTy != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmusicFileTy);
       }
       String str = "";
       if (!(this.musicLoadingMode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.musicLoadingMode);
       }
       if (!(this.musicId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.musicId);
       }
       if (!(this.musicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.musicName);
       }
       ClientContent$MusicLoadingStatusPackage tmusicDurati = this.musicDuration;
       if (tmusicDurati) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tmusicDurati);
       }
       if (!(this.downloadUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.downloadUrl);
       }
       tmusicFileTy = this.loadingDuration;
       if (tmusicFileTy) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tmusicFileTy);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MusicLoadingStatusPackage mergeFrom(CodedInputByteBufferNano p0){
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
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.loadingDuration = p0.readUInt64();
                            }
                         }else {
                            this.downloadUrl = p0.readString();
                         }
                      }else {
                         this.musicDuration = p0.readUInt64();
                      }
                   }else {
                      this.musicName = p0.readString();
                   }
                }else {
                   this.musicId = p0.readString();
                }
             }else {
                this.musicLoadingMode = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.musicFileType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$MusicLoadingStatusPackage tmusicFileTy = this.musicFileType;
       if (tmusicFileTy != null) {
          p0.writeInt32(1, tmusicFileTy);
       }
       String str = "";
       if (!(this.musicLoadingMode).equals(str)) {
          p0.writeString(2, this.musicLoadingMode);
       }
       if (!(this.musicId).equals(str)) {
          p0.writeString(3, this.musicId);
       }
       if (!(this.musicName).equals(str)) {
          p0.writeString(4, this.musicName);
       }
       ClientContent$MusicLoadingStatusPackage tmusicDurati = this.musicDuration;
       if (tmusicDurati) {
          p0.writeUInt64(5, tmusicDurati);
       }
       if (!(this.downloadUrl).equals(str)) {
          p0.writeString(6, this.downloadUrl);
       }
       tmusicFileTy = this.loadingDuration;
       if (tmusicFileTy) {
          p0.writeUInt64(7, tmusicFileTy);
       }
       super.writeTo(p0);
       return;
    }
}
