package com.kuaishou.livestream.message.nano.SCLiveSpecialTagUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveSpecialTagUpdate extends MessageNano	// class@001444
{
    public String clickAction;
    public String liveStreamId;
    public long tagExpireTime;
    public UserInfos$PicUrl[] tagIcon;
    public long tagId;
    public String tagName;
    public static SCLiveSpecialTagUpdate[] _emptyArray;

    public void SCLiveSpecialTagUpdate(){
       super();
       this.clear();
    }
    public static SCLiveSpecialTagUpdate[] emptyArray(){
       if (SCLiveSpecialTagUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveSpecialTagUpdate._emptyArray == null) {
             SCLiveSpecialTagUpdate[] sCLiveSpecia = new SCLiveSpecialTagUpdate[0];
             SCLiveSpecialTagUpdate._emptyArray = sCLiveSpecia;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveSpecialTagUpdate._emptyArray;
    }
    public static SCLiveSpecialTagUpdate parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveSpecialTagUpdate().mergeFrom(p0);
    }
    public static SCLiveSpecialTagUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveSpecialTagUpdate(), p0);
    }
    public SCLiveSpecialTagUpdate clear(){
       this.tagId = 0;
       this.tagName = "";
       this.liveStreamId = "";
       this.tagIcon = UserInfos$PicUrl.emptyArray();
       this.tagExpireTime = 0;
       this.clickAction = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCLiveSpecialTagUpdate ttagIcon;
       int i = super.computeSerializedSize();
       SCLiveSpecialTagUpdate ttagId = this.tagId;
       if (ttagId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttagId);
       }
       String str = "";
       if (!(this.tagName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.tagName);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       ttagId = this.tagIcon;
       if (ttagId != null && ttagId.length > 0) {
          int i1 = 0;
          ttagIcon = this.tagIcon;
          while (i1 < ttagIcon.length) {
             object oobject = ttagIcon[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttagIcon = this.tagExpireTime;
       if (ttagIcon) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttagIcon);
       }
       if (!(this.clickAction).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.clickAction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveSpecialTagUpdate mergeFrom(CodedInputByteBufferNano p0){
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
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.clickAction = p0.readString();
                         }
                      }else {
                         this.tagExpireTime = p0.readUInt64();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      SCLiveSpecialTagUpdate ttagIcon = this.tagIcon;
                      int i2 = (ttagIcon == null)? 0: ttagIcon.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(ttagIcon, 0, picUrlArray, 0, i2);
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
                      this.tagIcon = picUrlArray;
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.tagName = p0.readString();
             }
          }else {
             this.tagId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveSpecialTagUpdate ttagIcon;
       SCLiveSpecialTagUpdate ttagId = this.tagId;
       if (ttagId) {
          p0.writeUInt64(1, ttagId);
       }
       String str = "";
       if (!(this.tagName).equals(str)) {
          p0.writeString(2, this.tagName);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       ttagId = this.tagIcon;
       if (ttagId != null && ttagId.length > 0) {
          int i = 0;
          ttagIcon = this.tagIcon;
          while (i < ttagIcon.length) {
             object oobject = ttagIcon[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       ttagIcon = this.tagExpireTime;
       if (ttagIcon) {
          p0.writeUInt64(5, ttagIcon);
       }
       if (!(this.clickAction).equals(str)) {
          p0.writeString(6, this.clickAction);
       }
       super.writeTo(p0);
       return;
    }
}
