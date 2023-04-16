package com.kuaishou.client.log.content.packages.nano.ClientContent$GameZoneGamePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$GameZoneGamePackage extends MessageNano	// class@001242
{
    public String categoryId;
    public String categoryName;
    public String downloadChannelName;
    public String downloadChannelPackage;
    public int downloadChannelType;
    public String gameId;
    public String gameName;
    public String gamePackageName;
    public long gamePackageSize;
    public String gameScore;
    public boolean isFullscreen;
    public int liveRoomCount;
    public String liveRoomCountText;
    public int position;
    public int reviewCount;
    public String reviewCountText;
    public static ClientContent$GameZoneGamePackage[] _emptyArray;

    public void ClientContent$GameZoneGamePackage(){
       super();
       this.clear();
    }
    public static ClientContent$GameZoneGamePackage[] emptyArray(){
       if (ClientContent$GameZoneGamePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$GameZoneGamePackage._emptyArray == null) {
             ClientContent$GameZoneGamePackage[] gameZoneGame = new ClientContent$GameZoneGamePackage[0];
             ClientContent$GameZoneGamePackage._emptyArray = gameZoneGame;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$GameZoneGamePackage._emptyArray;
    }
    public static ClientContent$GameZoneGamePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$GameZoneGamePackage().mergeFrom(p0);
    }
    public static ClientContent$GameZoneGamePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$GameZoneGamePackage(), p0);
    }
    public ClientContent$GameZoneGamePackage clear(){
       this.categoryId = "";
       this.categoryName = "";
       this.gameId = "";
       this.gameName = "";
       this.gameScore = "";
       this.position = 0;
       this.isFullscreen = false;
       this.liveRoomCount = 0;
       this.reviewCount = 0;
       this.liveRoomCountText = "";
       this.reviewCountText = "";
       this.downloadChannelName = "";
       this.downloadChannelPackage = "";
       this.downloadChannelType = 0;
       this.gamePackageName = "";
       this.gamePackageSize = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.categoryId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.categoryId);
       }
       if (!(this.categoryName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.categoryName);
       }
       if (!(this.gameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.gameId);
       }
       if (!(this.gameName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.gameName);
       }
       if (!(this.gameScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.gameScore);
       }
       ClientContent$GameZoneGamePackage tposition = this.position;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tposition);
       }
       tposition = this.isFullscreen;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tposition);
       }
       tposition = this.liveRoomCount;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tposition);
       }
       tposition = this.reviewCount;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tposition);
       }
       if (!(this.liveRoomCountText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.liveRoomCountText);
       }
       if (!(this.reviewCountText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.reviewCountText);
       }
       if (!(this.downloadChannelName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.downloadChannelName);
       }
       if (!(this.downloadChannelPackage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.downloadChannelPackage);
       }
       tposition = this.downloadChannelType;
       if (tposition != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tposition);
       }
       if (!(this.gamePackageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.gamePackageName);
       }
       tposition = this.gamePackageSize;
       if (tposition) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(18, tposition);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$GameZoneGamePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.categoryId = p0.readString();
                break;
              case 18:
                this.categoryName = p0.readString();
                break;
              case 26:
                this.gameId = p0.readString();
                break;
              case '"':
                this.gameName = p0.readString();
                break;
              case '*':
                this.gameScore = p0.readString();
                break;
              case '0':
                this.position = p0.readUInt32();
                break;
              case '@':
                this.isFullscreen = p0.readBool();
                break;
              case 'H':
                this.liveRoomCount = p0.readUInt32();
                break;
              case 'P':
                this.reviewCount = p0.readUInt32();
                break;
              case 'b':
                this.liveRoomCountText = p0.readString();
                break;
              case 'j':
                this.reviewCountText = p0.readString();
                break;
              case 'r':
                this.downloadChannelName = p0.readString();
                break;
              case 'z':
                this.downloadChannelPackage = p0.readString();
                break;
              case 128:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.downloadChannelType = i;
                }
                break;
              case 138:
                this.gamePackageName = p0.readString();
                break;
              case 144:
                this.gamePackageSize = p0.readUInt64();
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
       if (!(this.categoryId).equals(str)) {
          p0.writeString(1, this.categoryId);
       }
       if (!(this.categoryName).equals(str)) {
          p0.writeString(2, this.categoryName);
       }
       if (!(this.gameId).equals(str)) {
          p0.writeString(3, this.gameId);
       }
       if (!(this.gameName).equals(str)) {
          p0.writeString(4, this.gameName);
       }
       if (!(this.gameScore).equals(str)) {
          p0.writeString(5, this.gameScore);
       }
       ClientContent$GameZoneGamePackage tposition = this.position;
       if (tposition != null) {
          p0.writeUInt32(6, tposition);
       }
       tposition = this.isFullscreen;
       if (tposition != null) {
          p0.writeBool(8, tposition);
       }
       tposition = this.liveRoomCount;
       if (tposition != null) {
          p0.writeUInt32(9, tposition);
       }
       tposition = this.reviewCount;
       if (tposition != null) {
          p0.writeUInt32(10, tposition);
       }
       if (!(this.liveRoomCountText).equals(str)) {
          p0.writeString(12, this.liveRoomCountText);
       }
       if (!(this.reviewCountText).equals(str)) {
          p0.writeString(13, this.reviewCountText);
       }
       if (!(this.downloadChannelName).equals(str)) {
          p0.writeString(14, this.downloadChannelName);
       }
       if (!(this.downloadChannelPackage).equals(str)) {
          p0.writeString(15, this.downloadChannelPackage);
       }
       tposition = this.downloadChannelType;
       if (tposition != null) {
          p0.writeInt32(16, tposition);
       }
       if (!(this.gamePackageName).equals(str)) {
          p0.writeString(17, this.gamePackageName);
       }
       tposition = this.gamePackageSize;
       if (tposition) {
          p0.writeUInt64(18, tposition);
       }
       super.writeTo(p0);
       return;
    }
}
