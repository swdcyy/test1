package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionEnterPkMode;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGameInteractionEnterPkMode extends MessageNano	// class@000b9a
{
    public String aryaConfig;
    public UserInfos$UserInfo[] author;
    public String id;
    public long timestamp;
    public static SCGameInteractionEnterPkMode[] _emptyArray;

    public void SCGameInteractionEnterPkMode(){
       super();
       this.clear();
    }
    public static SCGameInteractionEnterPkMode[] emptyArray(){
       if (SCGameInteractionEnterPkMode._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionEnterPkMode._emptyArray == null) {
             SCGameInteractionEnterPkMode[] sCGameIntera = new SCGameInteractionEnterPkMode[0];
             SCGameInteractionEnterPkMode._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionEnterPkMode._emptyArray;
    }
    public static SCGameInteractionEnterPkMode parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionEnterPkMode().mergeFrom(p0);
    }
    public static SCGameInteractionEnterPkMode parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionEnterPkMode(), p0);
    }
    public SCGameInteractionEnterPkMode clear(){
       this.id = "";
       this.author = UserInfos$UserInfo.emptyArray();
       this.timestamp = 0;
       this.aryaConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCGameInteractionEnterPkMode tauthor1;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       SCGameInteractionEnterPkMode tauthor = this.author;
       if (tauthor != null && tauthor.length > 0) {
          int i1 = 0;
          tauthor1 = this.author;
          while (i1 < tauthor1.length) {
             object oobject = tauthor1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tauthor1 = this.timestamp;
       if (tauthor1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthor1);
       }
       if (!(this.aryaConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.aryaConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionEnterPkMode mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.aryaConfig = p0.readString();
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                SCGameInteractionEnterPkMode tauthor = this.author;
                int i2 = (tauthor == null)? 0: tauthor.length;
                i = i + i2;
                UserInfos$UserInfo[] userInfoArra = new UserInfos$UserInfo[i];
                if (i2) {
                   System.arraycopy(tauthor, 0, userInfoArra, 0, i2);
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
                this.author = userInfoArra;
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGameInteractionEnterPkMode tauthor1;
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       SCGameInteractionEnterPkMode tauthor = this.author;
       if (tauthor != null && tauthor.length > 0) {
          int i = 0;
          tauthor1 = this.author;
          while (i < tauthor1.length) {
             object oobject = tauthor1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tauthor1 = this.timestamp;
       if (tauthor1) {
          p0.writeUInt64(3, tauthor1);
       }
       if (!(this.aryaConfig).equals(str)) {
          p0.writeString(4, this.aryaConfig);
       }
       super.writeTo(p0);
       return;
    }
}
