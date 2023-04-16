package com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class TheaterEpisodeInfo extends MessageNano	// class@001477
{
    public TheaterEpisodePhotoCdnProto[] coverThumbnailUrl;
    public String extParams;
    public boolean isSyntheticStream;
    public String liveRelayStream;
    public TheaterEpisodePhotoCdnProto[] mainMvUrl;
    public String manifest;
    public String name;
    public String photoId;
    public int rank;
    public String tubeId;
    public String tubeName;
    public int type;
    public String watermark;
    public static TheaterEpisodeInfo[] _emptyArray;

    public void TheaterEpisodeInfo(){
       super();
       this.clear();
    }
    public static TheaterEpisodeInfo[] emptyArray(){
       if (TheaterEpisodeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TheaterEpisodeInfo._emptyArray == null) {
             TheaterEpisodeInfo[] theaterEpiso = new TheaterEpisodeInfo[0];
             TheaterEpisodeInfo._emptyArray = theaterEpiso;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TheaterEpisodeInfo._emptyArray;
    }
    public static TheaterEpisodeInfo parseFrom(CodedInputByteBufferNano p0){
       return new TheaterEpisodeInfo().mergeFrom(p0);
    }
    public static TheaterEpisodeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TheaterEpisodeInfo(), p0);
    }
    public TheaterEpisodeInfo clear(){
       this.photoId = "";
       this.mainMvUrl = TheaterEpisodePhotoCdnProto.emptyArray();
       this.extParams = "";
       this.coverThumbnailUrl = TheaterEpisodePhotoCdnProto.emptyArray();
       this.tubeName = "";
       this.rank = 0;
       this.name = "";
       this.manifest = "";
       this.type = 0;
       this.watermark = "";
       this.liveRelayStream = "";
       this.tubeId = "";
       this.isSyntheticStream = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.photoId);
       }
       TheaterEpisodeInfo tmainMvUrl = this.mainMvUrl;
       int i1 = 0;
       if (tmainMvUrl != null && tmainMvUrl.length > 0) {
          int i2 = 0;
          TheaterEpisodeInfo tmainMvUrl1 = this.mainMvUrl;
          while (i2 < tmainMvUrl1.length) {
             object oobject = tmainMvUrl1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.extParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extParams);
       }
       tmainMvUrl = this.coverThumbnailUrl;
       if (tmainMvUrl != null && tmainMvUrl.length > 0) {
          tmainMvUrl = this.coverThumbnailUrl;
          while (i1 < tmainMvUrl.length) {
             object oobject1 = tmainMvUrl[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.tubeName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.tubeName);
       }
       tmainMvUrl = this.rank;
       if (tmainMvUrl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tmainMvUrl);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.name);
       }
       if (!(this.manifest).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.manifest);
       }
       tmainMvUrl = this.type;
       if (tmainMvUrl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tmainMvUrl);
       }
       if (!(this.watermark).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.watermark);
       }
       if (!(this.liveRelayStream).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.liveRelayStream);
       }
       if (!(this.tubeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.tubeId);
       }
       tmainMvUrl = this.isSyntheticStream;
       if (tmainMvUrl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tmainMvUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TheaterEpisodeInfo mergeFrom(CodedInputByteBufferNano p0){
       TheaterEpisodeInfo tmainMvUrl;
       int i2;
       TheaterEpisodePhotoCdnProto[] theaterEpiso;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.photoId = p0.readString();
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tmainMvUrl = this.mainMvUrl;
                i2 = (tmainMvUrl == null)? 0: tmainMvUrl.length;
                i = i + i2;
                theaterEpiso = new TheaterEpisodePhotoCdnProto[i];
                if (i2) {
                   System.arraycopy(tmainMvUrl, i1, theaterEpiso, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   theaterEpiso[i2] = new TheaterEpisodePhotoCdnProto();
                   p0.readMessage(theaterEpiso[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                theaterEpiso[i2] = new TheaterEpisodePhotoCdnProto();
                p0.readMessage(theaterEpiso[i2]);
                this.mainMvUrl = theaterEpiso;
                break;
              case 26:
                this.extParams = p0.readString();
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tmainMvUrl = this.coverThumbnailUrl;
                i2 = (tmainMvUrl == null)? 0: tmainMvUrl.length;
                i = i + i2;
                theaterEpiso = new TheaterEpisodePhotoCdnProto[i];
                if (i2) {
                   System.arraycopy(tmainMvUrl, i1, theaterEpiso, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   theaterEpiso[i2] = new TheaterEpisodePhotoCdnProto();
                   p0.readMessage(theaterEpiso[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                theaterEpiso[i2] = new TheaterEpisodePhotoCdnProto();
                p0.readMessage(theaterEpiso[i2]);
                this.coverThumbnailUrl = theaterEpiso;
                break;
              case '*':
                this.tubeName = p0.readString();
                break;
              case '0':
                this.rank = p0.readUInt32();
                break;
              case ':':
                this.name = p0.readString();
                break;
              case 'B':
                this.manifest = p0.readString();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case 'R':
                this.watermark = p0.readString();
                break;
              case 'Z':
                this.liveRelayStream = p0.readString();
                break;
              case 'b':
                this.tubeId = p0.readString();
                break;
              case 'h':
                this.isSyntheticStream = p0.readBool();
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
       if (!(this.photoId).equals(str)) {
          p0.writeString(1, this.photoId);
       }
       TheaterEpisodeInfo tmainMvUrl = this.mainMvUrl;
       int i = 0;
       if (tmainMvUrl != null && tmainMvUrl.length > 0) {
          int i1 = 0;
          TheaterEpisodeInfo tmainMvUrl1 = this.mainMvUrl;
          while (i1 < tmainMvUrl1.length) {
             object oobject = tmainMvUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.extParams).equals(str)) {
          p0.writeString(3, this.extParams);
       }
       tmainMvUrl = this.coverThumbnailUrl;
       if (tmainMvUrl != null && tmainMvUrl.length > 0) {
          tmainMvUrl = this.coverThumbnailUrl;
          while (i < tmainMvUrl.length) {
             object oobject1 = tmainMvUrl[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.tubeName).equals(str)) {
          p0.writeString(5, this.tubeName);
       }
       tmainMvUrl = this.rank;
       if (tmainMvUrl != null) {
          p0.writeUInt32(6, tmainMvUrl);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(7, this.name);
       }
       if (!(this.manifest).equals(str)) {
          p0.writeString(8, this.manifest);
       }
       tmainMvUrl = this.type;
       if (tmainMvUrl != null) {
          p0.writeInt32(9, tmainMvUrl);
       }
       if (!(this.watermark).equals(str)) {
          p0.writeString(10, this.watermark);
       }
       if (!(this.liveRelayStream).equals(str)) {
          p0.writeString(11, this.liveRelayStream);
       }
       if (!(this.tubeId).equals(str)) {
          p0.writeString(12, this.tubeId);
       }
       tmainMvUrl = this.isSyntheticStream;
       if (tmainMvUrl != null) {
          p0.writeBool(13, tmainMvUrl);
       }
       super.writeTo(p0);
       return;
    }
}
