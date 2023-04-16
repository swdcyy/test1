package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSpecialAudienceRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveSponsorRankInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveActivitySignalMessage$LiveSpecialAudienceRankInfo extends MessageNano	// class@0010cc
{
    public String popularity;
    public String popularityTitle;
    public int rankIndex;
    public UserInfos$UserInfo specialAudienceUser;
    public LiveActivitySignalMessage$LiveSponsorRankInfo[] sponsorRank;
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveSpecialAudienceRankInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveSpecialAudienceRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveSpecialAudienceRankInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[] liveSpecialA = new LiveActivitySignalMessage$LiveSpecialAudienceRankInfo[0];
             LiveActivitySignalMessage$LiveSpecialAudienceRankInfo._emptyArray = liveSpecialA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveSpecialAudienceRankInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveSpecialAudienceRankInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveSpecialAudienceRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveSpecialAudienceRankInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveSpecialAudienceRankInfo clear(){
       this.specialAudienceUser = null;
       this.popularity = "";
       this.sponsorRank = LiveActivitySignalMessage$LiveSponsorRankInfo.emptyArray();
       this.rankIndex = 0;
       this.popularityTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivitySignalMessage$LiveSpecialAudienceRankInfo tspecialAudi = this.specialAudienceUser;
       if (tspecialAudi != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tspecialAudi);
       }
       String str = "";
       if (!(this.popularity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.popularity);
       }
       tspecialAudi = this.sponsorRank;
       if (tspecialAudi != null && tspecialAudi.length > 0) {
          int i1 = 0;
          LiveActivitySignalMessage$LiveSpecialAudienceRankInfo tsponsorRank = this.sponsorRank;
          while (i1 < tsponsorRank.length) {
             object oobject = tsponsorRank[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tspecialAudi = this.rankIndex;
       if (tspecialAudi != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tspecialAudi);
       }
       if (!(this.popularityTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.popularityTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivitySignalMessage$LiveSpecialAudienceRankInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.popularityTitle = p0.readString();
                      }
                   }else {
                      this.rankIndex = p0.readUInt32();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveActivitySignalMessage$LiveSpecialAudienceRankInfo tsponsorRank = this.sponsorRank;
                   int i2 = (tsponsorRank == null)? 0: tsponsorRank.length;
                   i = i + i2;
                   LiveActivitySignalMessage$LiveSponsorRankInfo[] liveSponsorR = new LiveActivitySignalMessage$LiveSponsorRankInfo[i];
                   if (i2) {
                      System.arraycopy(tsponsorRank, 0, liveSponsorR, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveSponsorR[i2] = new LiveActivitySignalMessage$LiveSponsorRankInfo();
                      p0.readMessage(liveSponsorR[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveSponsorR[i2] = new LiveActivitySignalMessage$LiveSponsorRankInfo();
                   p0.readMessage(liveSponsorR[i2]);
                   this.sponsorRank = liveSponsorR;
                }
             }else {
                this.popularity = p0.readString();
             }
          }else if(this.specialAudienceUser == null){
             this.specialAudienceUser = new UserInfos$UserInfo();
          }
          p0.readMessage(this.specialAudienceUser);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivitySignalMessage$LiveSpecialAudienceRankInfo tspecialAudi = this.specialAudienceUser;
       if (tspecialAudi != null) {
          p0.writeMessage(1, tspecialAudi);
       }
       String str = "";
       if (!(this.popularity).equals(str)) {
          p0.writeString(2, this.popularity);
       }
       tspecialAudi = this.sponsorRank;
       if (tspecialAudi != null && tspecialAudi.length > 0) {
          int i = 0;
          LiveActivitySignalMessage$LiveSpecialAudienceRankInfo tsponsorRank = this.sponsorRank;
          while (i < tsponsorRank.length) {
             object oobject = tsponsorRank[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tspecialAudi = this.rankIndex;
       if (tspecialAudi != null) {
          p0.writeUInt32(4, tspecialAudi);
       }
       if (!(this.popularityTitle).equals(str)) {
          p0.writeString(5, this.popularityTitle);
       }
       super.writeTo(p0);
       return;
    }
}
