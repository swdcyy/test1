package com.kuaishou.client.log.content.packages.nano.ClientContent$LocalIntelligentAlbumPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LocalIntelligentAlbumPackage extends MessageNano	// class@0012a3
{
    public long albumBeginTimestamp;
    public long albumEndTimestamp;
    public String albumLabel;
    public String albumLocation;
    public String clusterMethod;
    public String clusterRule;
    public boolean isLocal;
    public String mainAlbumCaption;
    public int pictureCount;
    public String subtitleAlbumCaption;
    public int videoCount;
    public static ClientContent$LocalIntelligentAlbumPackage[] _emptyArray;

    public void ClientContent$LocalIntelligentAlbumPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LocalIntelligentAlbumPackage[] emptyArray(){
       if (ClientContent$LocalIntelligentAlbumPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LocalIntelligentAlbumPackage._emptyArray == null) {
             ClientContent$LocalIntelligentAlbumPackage[] localIntelli = new ClientContent$LocalIntelligentAlbumPackage[0];
             ClientContent$LocalIntelligentAlbumPackage._emptyArray = localIntelli;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LocalIntelligentAlbumPackage._emptyArray;
    }
    public static ClientContent$LocalIntelligentAlbumPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LocalIntelligentAlbumPackage().mergeFrom(p0);
    }
    public static ClientContent$LocalIntelligentAlbumPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LocalIntelligentAlbumPackage(), p0);
    }
    public ClientContent$LocalIntelligentAlbumPackage clear(){
       this.mainAlbumCaption = "";
       this.subtitleAlbumCaption = "";
       this.pictureCount = 0;
       this.videoCount = 0;
       this.albumBeginTimestamp = 0;
       this.albumEndTimestamp = 0;
       this.albumLocation = "";
       this.clusterMethod = "";
       this.clusterRule = "";
       this.isLocal = false;
       this.albumLabel = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.mainAlbumCaption).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.mainAlbumCaption);
       }
       if (!(this.subtitleAlbumCaption).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.subtitleAlbumCaption);
       }
       ClientContent$LocalIntelligentAlbumPackage tpictureCoun = this.pictureCount;
       if (tpictureCoun != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tpictureCoun);
       }
       tpictureCoun = this.videoCount;
       if (tpictureCoun != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tpictureCoun);
       }
       ClientContent$LocalIntelligentAlbumPackage talbumBeginT = this.albumBeginTimestamp;
       if (talbumBeginT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, talbumBeginT);
       }
       talbumBeginT = this.albumEndTimestamp;
       if (talbumBeginT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, talbumBeginT);
       }
       if (!(this.albumLocation).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.albumLocation);
       }
       if (!(this.clusterMethod).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.clusterMethod);
       }
       if (!(this.clusterRule).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.clusterRule);
       }
       tpictureCoun = this.isLocal;
       if (tpictureCoun != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tpictureCoun);
       }
       if (!(this.albumLabel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.albumLabel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LocalIntelligentAlbumPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.mainAlbumCaption = p0.readString();
                break;
              case 18:
                this.subtitleAlbumCaption = p0.readString();
                break;
              case 24:
                this.pictureCount = p0.readUInt32();
                break;
              case 32:
                this.videoCount = p0.readUInt32();
                break;
              case '(':
                this.albumBeginTimestamp = p0.readUInt64();
                break;
              case '0':
                this.albumEndTimestamp = p0.readUInt64();
                break;
              case ':':
                this.albumLocation = p0.readString();
                break;
              case 'B':
                this.clusterMethod = p0.readString();
                break;
              case 'J':
                this.clusterRule = p0.readString();
                break;
              case 'P':
                this.isLocal = p0.readBool();
                break;
              case 'Z':
                this.albumLabel = p0.readString();
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
       if (!(this.mainAlbumCaption).equals(str)) {
          p0.writeString(1, this.mainAlbumCaption);
       }
       if (!(this.subtitleAlbumCaption).equals(str)) {
          p0.writeString(2, this.subtitleAlbumCaption);
       }
       ClientContent$LocalIntelligentAlbumPackage tpictureCoun = this.pictureCount;
       if (tpictureCoun != null) {
          p0.writeUInt32(3, tpictureCoun);
       }
       tpictureCoun = this.videoCount;
       if (tpictureCoun != null) {
          p0.writeUInt32(4, tpictureCoun);
       }
       ClientContent$LocalIntelligentAlbumPackage talbumBeginT = this.albumBeginTimestamp;
       if (talbumBeginT) {
          p0.writeUInt64(5, talbumBeginT);
       }
       talbumBeginT = this.albumEndTimestamp;
       if (talbumBeginT) {
          p0.writeUInt64(6, talbumBeginT);
       }
       if (!(this.albumLocation).equals(str)) {
          p0.writeString(7, this.albumLocation);
       }
       if (!(this.clusterMethod).equals(str)) {
          p0.writeString(8, this.clusterMethod);
       }
       if (!(this.clusterRule).equals(str)) {
          p0.writeString(9, this.clusterRule);
       }
       tpictureCoun = this.isLocal;
       if (tpictureCoun != null) {
          p0.writeBool(10, tpictureCoun);
       }
       if (!(this.albumLabel).equals(str)) {
          p0.writeString(11, this.albumLabel);
       }
       super.writeTo(p0);
       return;
    }
}
