package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContentWrapper$SeriesPackage extends MessageNano	// class@00133d
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
    public static ClientContentWrapper$SeriesPackage[] _emptyArray;

    public void ClientContentWrapper$SeriesPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$SeriesPackage[] emptyArray(){
       if (ClientContentWrapper$SeriesPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$SeriesPackage._emptyArray == null) {
             ClientContentWrapper$SeriesPackage[] seriesPackag = new ClientContentWrapper$SeriesPackage[0];
             ClientContentWrapper$SeriesPackage._emptyArray = seriesPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$SeriesPackage._emptyArray;
    }
    public static ClientContentWrapper$SeriesPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$SeriesPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$SeriesPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$SeriesPackage(), p0);
    }
    public ClientContentWrapper$SeriesPackage clear(){
       this.seriesId = 0;
       this.seriesName = "";
       this.authorId = 0;
       this.episodeCount = 0;
       this.isSeriesEnded = false;
       this.index = 0;
       this.photoPackage = ClientContent$PhotoPackage.emptyArray();
       this.sSeriesId = "";
       this.recommendation = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$SeriesPackage tseriesId = this.seriesId;
       ClientContentWrapper$SeriesPackage seriesPackag = null;
       if (tseriesId - seriesPackag) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tseriesId);
       }
       String str = "";
       if (!(this.seriesName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.seriesName);
       }
       ClientContentWrapper$SeriesPackage tauthorId = this.authorId;
       if (tauthorId - seriesPackag) {
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
          seriesPackag = this.photoPackage;
          while (i1 < seriesPackag.length) {
             object oobject = seriesPackag[i1];
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
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$SeriesPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            int i1 = 58;
                            if (i != i1) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.recommendation = p0.readString();
                                  }
                               }else {
                                  this.sSeriesId = p0.readString();
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               ClientContentWrapper$SeriesPackage tphotoPackag = this.photoPackage;
                               int i2 = (tphotoPackag == null)? 0: tphotoPackag.length;
                               i = i + i2;
                               ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[i];
                               if (i2) {
                                  System.arraycopy(tphotoPackag, 0, photoPackage, 0, i2);
                               }
                               i1 = i - 1;
                               while (i2 < i1) {
                                  photoPackage[i2] = new ClientContent$PhotoPackage();
                                  p0.readMessage(photoPackage[i2]);
                                  p0.readTag();
                                  i2 = i2 + 1;
                               }
                               photoPackage[i2] = new ClientContent$PhotoPackage();
                               p0.readMessage(photoPackage[i2]);
                               this.photoPackage = photoPackage;
                            }
                         }else {
                            this.index = p0.readUInt32();
                         }
                      }else {
                         this.isSeriesEnded = p0.readBool();
                      }
                   }else {
                      this.episodeCount = p0.readUInt32();
                   }
                }else {
                   this.authorId = p0.readUInt64();
                }
             }else {
                this.seriesName = p0.readString();
             }
          }else {
             this.seriesId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$SeriesPackage tseriesId = this.seriesId;
       ClientContentWrapper$SeriesPackage seriesPackag = null;
       if (tseriesId - seriesPackag) {
          p0.writeUInt64(1, tseriesId);
       }
       String str = "";
       if (!(this.seriesName).equals(str)) {
          p0.writeString(2, this.seriesName);
       }
       ClientContentWrapper$SeriesPackage tauthorId = this.authorId;
       if (tauthorId - seriesPackag) {
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
          seriesPackag = this.photoPackage;
          while (i < seriesPackag.length) {
             object oobject = seriesPackag[i];
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
       super.writeTo(p0);
       return;
    }
}
