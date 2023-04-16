package com.kuaishou.client.log.content.packages.nano.ClientContent$SeriesPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$SeriesPackageV2 extends MessageNano	// class@0012dc
{
    public long authorId;
    public int episodeCount;
    public int index;
    public boolean isSeriesEnded;
    public ClientContent$PhotoPackage[] photoPackage;
    public String recommendation;
    public String sSeriesId;
    public long seriesId;
    public String seriesName;
    public long tagId;
    public String tagName;
    public static ClientContent$SeriesPackageV2[] _emptyArray;

    public void ClientContent$SeriesPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$SeriesPackageV2[] emptyArray(){
       if (ClientContent$SeriesPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$SeriesPackageV2._emptyArray == null) {
             ClientContent$SeriesPackageV2[] seriesPackag = new ClientContent$SeriesPackageV2[0];
             ClientContent$SeriesPackageV2._emptyArray = seriesPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$SeriesPackageV2._emptyArray;
    }
    public static ClientContent$SeriesPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$SeriesPackageV2().mergeFrom(p0);
    }
    public static ClientContent$SeriesPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$SeriesPackageV2(), p0);
    }
    public ClientContent$SeriesPackageV2 clear(){
       this.seriesId = 0;
       this.seriesName = "";
       this.authorId = 0;
       this.episodeCount = 0;
       this.isSeriesEnded = false;
       this.index = 0;
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.sSeriesId = "";
       this.recommendation = "";
       this.tagId = 0;
       this.tagName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$SeriesPackageV2 tseriesId = this.seriesId;
       if (tseriesId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tseriesId);
       }
       String str = "";
       if (!(this.seriesName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.seriesName);
       }
       ClientContent$SeriesPackageV2 tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       tseriesId = this.episodeCount;
       if (tseriesId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tseriesId);
       }
       tseriesId = this.isSeriesEnded;
       if (tseriesId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tseriesId);
       }
       tseriesId = this.index;
       if (tseriesId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tseriesId);
       }
       tseriesId = this.photoPackage;
       if (tseriesId != null && tseriesId.length > 0) {
          int i1 = 0;
          tauthorId = this.photoPackage;
          while (i1 < tauthorId.length) {
             object oobject = tauthorId[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.sSeriesId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.sSeriesId);
       }
       if (!(this.recommendation).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.recommendation);
       }
       tauthorId = this.tagId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tauthorId);
       }
       if (!(this.tagName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.tagName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$SeriesPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.seriesId = p0.readUInt64();
                break;
              case 18:
                this.seriesName = p0.readString();
                break;
              case 24:
                this.authorId = p0.readUInt64();
                break;
              case 32:
                this.episodeCount = p0.readUInt32();
                break;
              case '(':
                this.isSeriesEnded = p0.readBool();
                break;
              case '0':
                this.index = p0.readUInt32();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                ClientContent$SeriesPackageV2 tphotoPackag = this.photoPackage;
                int i1 = (tphotoPackag == null)? 0: tphotoPackag.length;
                i = i + i1;
                ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
                if (i1) {
                   System.arraycopy(tphotoPackag, 0, photoPackage, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   photoPackage[i1] = new ClientContent$PhotoPackage();
                   p0.readMessage(photoPackage[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                photoPackage[i1] = new ClientContent$PhotoPackage();
                p0.readMessage(photoPackage[i1]);
                this.photoPackage = photoPackage;
                break;
              case 'B':
                this.sSeriesId = p0.readString();
                break;
              case 'J':
                this.recommendation = p0.readString();
                break;
              case 'P':
                this.tagId = p0.readUInt64();
                break;
              case 'Z':
                this.tagName = p0.readString();
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
       ClientContent$SeriesPackageV2 tseriesId = this.seriesId;
       if (tseriesId) {
          p0.writeUInt64(1, tseriesId);
       }
       String str = "";
       if (!(this.seriesName).equals(str)) {
          p0.writeString(2, this.seriesName);
       }
       ClientContent$SeriesPackageV2 tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       tseriesId = this.episodeCount;
       if (tseriesId != null) {
          p0.writeUInt32(4, tseriesId);
       }
       tseriesId = this.isSeriesEnded;
       if (tseriesId != null) {
          p0.writeBool(5, tseriesId);
       }
       tseriesId = this.index;
       if (tseriesId != null) {
          p0.writeUInt32(6, tseriesId);
       }
       tseriesId = this.photoPackage;
       if (tseriesId != null && tseriesId.length > 0) {
          int i = 0;
          tauthorId = this.photoPackage;
          while (i < tauthorId.length) {
             object oobject = tauthorId[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.sSeriesId).equals(str)) {
          p0.writeString(8, this.sSeriesId);
       }
       if (!(this.recommendation).equals(str)) {
          p0.writeString(9, this.recommendation);
       }
       tauthorId = this.tagId;
       if (tauthorId) {
          p0.writeUInt64(10, tauthorId);
       }
       if (!(this.tagName).equals(str)) {
          p0.writeString(11, this.tagName);
       }
       super.writeTo(p0);
       return;
    }
}
