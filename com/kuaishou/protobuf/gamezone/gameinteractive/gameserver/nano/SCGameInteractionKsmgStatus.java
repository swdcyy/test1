package com.kuaishou.protobuf.gamezone.gameinteractive.gameserver.nano.SCGameInteractionKsmgStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGameInteractionKsmgStatus extends MessageNano	// class@000b9c
{
    public String appId;
    public String gameId;
    public String gameName;
    public UserInfos$PicUrl[] icon;
    public String introduction;
    public UserInfos$PicUrl[] pic;
    public int status;
    public static SCGameInteractionKsmgStatus[] _emptyArray;

    public void SCGameInteractionKsmgStatus(){
       super();
       this.clear();
    }
    public static SCGameInteractionKsmgStatus[] emptyArray(){
       if (SCGameInteractionKsmgStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGameInteractionKsmgStatus._emptyArray == null) {
             SCGameInteractionKsmgStatus[] sCGameIntera = new SCGameInteractionKsmgStatus[0];
             SCGameInteractionKsmgStatus._emptyArray = sCGameIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGameInteractionKsmgStatus._emptyArray;
    }
    public static SCGameInteractionKsmgStatus parseFrom(CodedInputByteBufferNano p0){
       return new SCGameInteractionKsmgStatus().mergeFrom(p0);
    }
    public static SCGameInteractionKsmgStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGameInteractionKsmgStatus(), p0);
    }
    public SCGameInteractionKsmgStatus clear(){
       this.status = 0;
       this.gameName = "";
       this.gameId = "";
       this.appId = "";
       this.introduction = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.pic = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGameInteractionKsmgStatus tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tstatus);
       }
       String str = "";
       if (!(this.gameName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.gameName);
       }
       if (!(this.gameId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.gameId);
       }
       if (!(this.appId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.appId);
       }
       if (!(this.introduction).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.introduction);
       }
       tstatus = this.icon;
       int i1 = 0;
       if (tstatus != null && tstatus.length > 0) {
          int i2 = 0;
          SCGameInteractionKsmgStatus ticon = this.icon;
          while (i2 < ticon.length) {
             object oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatus = this.pic;
       if (tstatus != null && tstatus.length > 0) {
          tstatus = this.pic;
          while (i1 < tstatus.length) {
             object oobject1 = tstatus[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGameInteractionKsmgStatus mergeFrom(CodedInputByteBufferNano p0){
       SCGameInteractionKsmgStatus tpic;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            i1 = 58;
                            if (i != i1) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tpic = this.pic;
                               i2 = (tpic == null)? 0: tpic.length;
                               i = i + i2;
                               picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(tpic, 0, picUrlArray, 0, i2);
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
                               this.pic = picUrlArray;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tpic = this.icon;
                            i2 = (tpic == null)? 0: tpic.length;
                            i = i + i2;
                            picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(tpic, 0, picUrlArray, 0, i2);
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
                            this.icon = picUrlArray;
                         }
                      }else {
                         this.introduction = p0.readString();
                      }
                   }else {
                      this.appId = p0.readString();
                   }
                }else {
                   this.gameId = p0.readString();
                }
             }else {
                this.gameName = p0.readString();
             }
          }else {
             this.status = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGameInteractionKsmgStatus tstatus = this.status;
       if (tstatus != null) {
          p0.writeUInt32(1, tstatus);
       }
       String str = "";
       if (!(this.gameName).equals(str)) {
          p0.writeString(2, this.gameName);
       }
       if (!(this.gameId).equals(str)) {
          p0.writeString(3, this.gameId);
       }
       if (!(this.appId).equals(str)) {
          p0.writeString(4, this.appId);
       }
       if (!(this.introduction).equals(str)) {
          p0.writeString(5, this.introduction);
       }
       tstatus = this.icon;
       int i = 0;
       if (tstatus != null && tstatus.length > 0) {
          int i1 = 0;
          SCGameInteractionKsmgStatus ticon = this.icon;
          while (i1 < ticon.length) {
             object oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.pic;
       if (tstatus != null && tstatus.length > 0) {
          tstatus = this.pic;
          while (i < tstatus.length) {
             object oobject1 = tstatus[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
