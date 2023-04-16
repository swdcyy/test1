package com.kuaishou.livestream.message.nano.SCLiveHotspotRankShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveHotspotSimpleInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveHotspotRankShow extends MessageNano	// class@001428
{
    public int liveHotspotRankEntranceType;
    public LiveHotspotSimpleInfo[] rankInfo;
    public String text;
    public long timestamp;
    public String url;
    public static SCLiveHotspotRankShow[] _emptyArray;

    public void SCLiveHotspotRankShow(){
       super();
       this.clear();
    }
    public static SCLiveHotspotRankShow[] emptyArray(){
       if (SCLiveHotspotRankShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveHotspotRankShow._emptyArray == null) {
             SCLiveHotspotRankShow[] sCLiveHotspo = new SCLiveHotspotRankShow[0];
             SCLiveHotspotRankShow._emptyArray = sCLiveHotspo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveHotspotRankShow._emptyArray;
    }
    public static SCLiveHotspotRankShow parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveHotspotRankShow().mergeFrom(p0);
    }
    public static SCLiveHotspotRankShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveHotspotRankShow(), p0);
    }
    public SCLiveHotspotRankShow clear(){
       this.liveHotspotRankEntranceType = 0;
       this.text = "";
       this.rankInfo = LiveHotspotSimpleInfo.emptyArray();
       this.url = "";
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveHotspotRankShow tliveHotspot = this.liveHotspotRankEntranceType;
       if (tliveHotspot != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tliveHotspot);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       tliveHotspot = this.rankInfo;
       if (tliveHotspot != null && tliveHotspot.length > 0) {
          int i1 = 0;
          SCLiveHotspotRankShow trankInfo = this.rankInfo;
          while (i1 < trankInfo.length) {
             object oobject = trankInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.url);
       }
       tliveHotspot = this.timestamp;
       if (tliveHotspot) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tliveHotspot);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveHotspotRankShow mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.url = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCLiveHotspotRankShow trankInfo = this.rankInfo;
                   int i2 = (trankInfo == null)? 0: trankInfo.length;
                   i = i + i2;
                   LiveHotspotSimpleInfo[] liveHotspotS = new LiveHotspotSimpleInfo[i];
                   if (i2) {
                      System.arraycopy(trankInfo, 0, liveHotspotS, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveHotspotS[i2] = new LiveHotspotSimpleInfo();
                      p0.readMessage(liveHotspotS[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveHotspotS[i2] = new LiveHotspotSimpleInfo();
                   p0.readMessage(liveHotspotS[i2]);
                   this.rankInfo = liveHotspotS;
                }
             }else {
                this.text = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.liveHotspotRankEntranceType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveHotspotRankShow tliveHotspot = this.liveHotspotRankEntranceType;
       if (tliveHotspot != null) {
          p0.writeInt32(1, tliveHotspot);
       }
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       tliveHotspot = this.rankInfo;
       if (tliveHotspot != null && tliveHotspot.length > 0) {
          int i = 0;
          SCLiveHotspotRankShow trankInfo = this.rankInfo;
          while (i < trankInfo.length) {
             object oobject = trankInfo[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.url).equals(str)) {
          p0.writeString(4, this.url);
       }
       tliveHotspot = this.timestamp;
       if (tliveHotspot) {
          p0.writeUInt64(5, tliveHotspot);
       }
       super.writeTo(p0);
       return;
    }
}
