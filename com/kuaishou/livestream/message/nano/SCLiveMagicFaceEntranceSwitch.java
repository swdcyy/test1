package com.kuaishou.livestream.message.nano.SCLiveMagicFaceEntranceSwitch;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveMagicFaceEntranceSwitch extends MessageNano	// class@001430
{
    public UserInfos$PicUrl[] iconUrl;
    public int magicFaceEntranceState;
    public long magicFaceId;
    public String magicFaceName;
    public static SCLiveMagicFaceEntranceSwitch[] _emptyArray;

    public void SCLiveMagicFaceEntranceSwitch(){
       super();
       this.clear();
    }
    public static SCLiveMagicFaceEntranceSwitch[] emptyArray(){
       if (SCLiveMagicFaceEntranceSwitch._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMagicFaceEntranceSwitch._emptyArray == null) {
             SCLiveMagicFaceEntranceSwitch[] sCLiveMagicF = new SCLiveMagicFaceEntranceSwitch[0];
             SCLiveMagicFaceEntranceSwitch._emptyArray = sCLiveMagicF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMagicFaceEntranceSwitch._emptyArray;
    }
    public static SCLiveMagicFaceEntranceSwitch parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMagicFaceEntranceSwitch().mergeFrom(p0);
    }
    public static SCLiveMagicFaceEntranceSwitch parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMagicFaceEntranceSwitch(), p0);
    }
    public SCLiveMagicFaceEntranceSwitch clear(){
       this.magicFaceEntranceState = 0;
       this.magicFaceId = 0;
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.magicFaceName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveMagicFaceEntranceSwitch tmagicFaceEn = this.magicFaceEntranceState;
       if (tmagicFaceEn != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmagicFaceEn);
       }
       tmagicFaceEn = this.magicFaceId;
       if (tmagicFaceEn) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmagicFaceEn);
       }
       tmagicFaceEn = this.iconUrl;
       if (tmagicFaceEn != null && tmagicFaceEn.length > 0) {
          int i1 = 0;
          SCLiveMagicFaceEntranceSwitch ticonUrl = this.iconUrl;
          while (i1 < ticonUrl.length) {
             object oobject = ticonUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.magicFaceName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.magicFaceName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMagicFaceEntranceSwitch mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.magicFaceName = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCLiveMagicFaceEntranceSwitch ticonUrl = this.iconUrl;
                   int i2 = (ticonUrl == null)? 0: ticonUrl.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(ticonUrl, 0, picUrlArray, 0, i2);
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
                   this.iconUrl = picUrlArray;
                }
             }else {
                this.magicFaceId = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.magicFaceEntranceState = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveMagicFaceEntranceSwitch tmagicFaceEn = this.magicFaceEntranceState;
       if (tmagicFaceEn != null) {
          p0.writeInt32(1, tmagicFaceEn);
       }
       tmagicFaceEn = this.magicFaceId;
       if (tmagicFaceEn) {
          p0.writeUInt64(2, tmagicFaceEn);
       }
       tmagicFaceEn = this.iconUrl;
       if (tmagicFaceEn != null && tmagicFaceEn.length > 0) {
          int i = 0;
          SCLiveMagicFaceEntranceSwitch ticonUrl = this.iconUrl;
          while (i < ticonUrl.length) {
             object oobject = ticonUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.magicFaceName).equals("")) {
          p0.writeString(4, this.magicFaceName);
       }
       super.writeTo(p0);
       return;
    }
}
