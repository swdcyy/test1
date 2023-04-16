package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionPkContributionRank$Rank;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class SCGameInteractionPkContributionRank$Rank extends MessageNano	// class@000b9d
{
    public long authorId;
    public UserInfos$UserInfo[] user;
    public static SCGameInteractionPkContributionRank$Rank[] _emptyArray;

    public void SCGameInteractionPkContributionRank$Rank(){
       super();
       this.clear();
    }
    public static SCGameInteractionPkContributionRank$Rank[] emptyArray(){
       if (SCGameInteractionPkContributionRank$Rank._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionPkContributionRank$Rank._emptyArray == null) {
             SCGameInteractionPkContributionRank$Rank[] rankArray = new SCGameInteractionPkContributionRank$Rank[0];
             SCGameInteractionPkContributionRank$Rank._emptyArray = rankArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionPkContributionRank$Rank._emptyArray;
    }
    public static SCGameInteractionPkContributionRank$Rank parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionPkContributionRank$Rank().mergeFrom(p0);
    }
    public static SCGameInteractionPkContributionRank$Rank parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionPkContributionRank$Rank(), p0);
    }
    public SCGameInteractionPkContributionRank$Rank clear(){
       this.authorId = 0;
       this.user = UserInfos$UserInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGameInteractionPkContributionRank$Rank tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       tauthorId = this.user;
       if (tauthorId != null && tauthorId.length > 0) {
          int i1 = 0;
          SCGameInteractionPkContributionRank$Rank tuser = this.user;
          while (i1 < tuser.length) {
             object oobject = tuser[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionPkContributionRank$Rank mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCGameInteractionPkContributionRank$Rank tuser = this.user;
                int i2 = (tuser == null)? 0: tuser.length;
                i = i + i2;
                UserInfos$UserInfo[] userInfoArra = new UserInfos$UserInfo[i];
                if (i2) {
                   System.arraycopy(tuser, 0, userInfoArra, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userInfoArra[i2] = new UserInfos$UserInfo();
                   p0.readMessage(userInfoArra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userInfoArra[i2] = new UserInfos$UserInfo();
                p0.readMessage(userInfoArra[i2]);
                this.user = userInfoArra;
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGameInteractionPkContributionRank$Rank tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(1, tauthorId);
       }
       tauthorId = this.user;
       if (tauthorId != null && tauthorId.length > 0) {
          int i = 0;
          SCGameInteractionPkContributionRank$Rank tuser = this.user;
          while (i < tuser.length) {
             object oobject = tuser[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
