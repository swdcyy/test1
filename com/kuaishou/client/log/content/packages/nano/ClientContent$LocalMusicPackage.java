package com.kuaishou.client.log.content.packages.nano.ClientContent$LocalMusicPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LocalMusicPackage extends MessageNano	// class@0012a4
{
    public String album;
    public String artist;
    public long duration;
    public String filePath;
    public long fileSize;
    public String title;
    public static ClientContent$LocalMusicPackage[] _emptyArray;

    public void ClientContent$LocalMusicPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LocalMusicPackage[] emptyArray(){
       if (ClientContent$LocalMusicPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LocalMusicPackage._emptyArray == null) {
             ClientContent$LocalMusicPackage[] localMusicPa = new ClientContent$LocalMusicPackage[0];
             ClientContent$LocalMusicPackage._emptyArray = localMusicPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LocalMusicPackage._emptyArray;
    }
    public static ClientContent$LocalMusicPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LocalMusicPackage().mergeFrom(p0);
    }
    public static ClientContent$LocalMusicPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LocalMusicPackage(), p0);
    }
    public ClientContent$LocalMusicPackage clear(){
       this.filePath = "";
       this.fileSize = 0;
       this.duration = 0;
       this.title = "";
       this.artist = "";
       this.album = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.filePath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.filePath);
       }
       ClientContent$LocalMusicPackage tfileSize = this.fileSize;
       if (tfileSize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tfileSize);
       }
       tfileSize = this.duration;
       if (tfileSize) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tfileSize);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       if (!(this.artist).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.artist);
       }
       if (!(this.album).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.album);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LocalMusicPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.album = p0.readString();
                         }
                      }else {
                         this.artist = p0.readString();
                      }
                   }else {
                      this.title = p0.readString();
                   }
                }else {
                   this.duration = p0.readUInt64();
                }
             }else {
                this.fileSize = p0.readUInt64();
             }
          }else {
             this.filePath = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.filePath).equals(str)) {
          p0.writeString(1, this.filePath);
       }
       ClientContent$LocalMusicPackage tfileSize = this.fileSize;
       if (tfileSize) {
          p0.writeUInt64(2, tfileSize);
       }
       tfileSize = this.duration;
       if (tfileSize) {
          p0.writeUInt64(3, tfileSize);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       if (!(this.artist).equals(str)) {
          p0.writeString(5, this.artist);
       }
       if (!(this.album).equals(str)) {
          p0.writeString(6, this.album);
       }
       super.writeTo(p0);
       return;
    }
}
