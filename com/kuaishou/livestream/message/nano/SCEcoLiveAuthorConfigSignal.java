package com.kuaishou.livestream.message.nano.SCEcoLiveAuthorConfigSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCEcoLiveAuthorConfigSignal extends MessageNano	// class@0013f2
{
    public String actionUrl;
    public int bizId;
    public UserInfos$PicUrl[] icons;
    public String title;
    public static SCEcoLiveAuthorConfigSignal[] _emptyArray;

    public void SCEcoLiveAuthorConfigSignal(){
       super();
       this.clear();
    }
    public static SCEcoLiveAuthorConfigSignal[] emptyArray(){
       if (SCEcoLiveAuthorConfigSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCEcoLiveAuthorConfigSignal._emptyArray == null) {
             SCEcoLiveAuthorConfigSignal[] sCEcoLiveAut = new SCEcoLiveAuthorConfigSignal[0];
             SCEcoLiveAuthorConfigSignal._emptyArray = sCEcoLiveAut;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCEcoLiveAuthorConfigSignal._emptyArray;
    }
    public static SCEcoLiveAuthorConfigSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCEcoLiveAuthorConfigSignal().mergeFrom(p0);
    }
    public static SCEcoLiveAuthorConfigSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCEcoLiveAuthorConfigSignal(), p0);
    }
    public SCEcoLiveAuthorConfigSignal clear(){
       this.bizId = 0;
       this.title = "";
       this.actionUrl = "";
       this.icons = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCEcoLiveAuthorConfigSignal tbizId = this.bizId;
       if (tbizId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tbizId);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.actionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.actionUrl);
       }
       tbizId = this.icons;
       if (tbizId != null && tbizId.length > 0) {
          int i1 = 0;
          SCEcoLiveAuthorConfigSignal ticons = this.icons;
          while (i1 < ticons.length) {
             object oobject = ticons[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCEcoLiveAuthorConfigSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      SCEcoLiveAuthorConfigSignal ticons = this.icons;
                      int i2 = (ticons == null)? 0: ticons.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(ticons, 0, picUrlArray, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         picUrlArray[i2] = new UserInfos$PicUrl();
                         p0.readMessage(picUrlArray[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      this.icons = picUrlArray;
                   }
                }else {
                   this.actionUrl = p0.readString();
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             this.bizId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCEcoLiveAuthorConfigSignal tbizId = this.bizId;
       if (tbizId != null) {
          p0.writeUInt32(1, tbizId);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.actionUrl).equals(str)) {
          p0.writeString(3, this.actionUrl);
       }
       tbizId = this.icons;
       if (tbizId != null && tbizId.length > 0) {
          int i = 0;
          SCEcoLiveAuthorConfigSignal ticons = this.icons;
          while (i < ticons.length) {
             object oobject = ticons[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
