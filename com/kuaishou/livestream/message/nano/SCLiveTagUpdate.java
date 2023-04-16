package com.kuaishou.livestream.message.nano.SCLiveTagUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveTagUpdate extends MessageNano	// class@001448
{
    public String liveStreamId;
    public UserInfos$PicUrl[] pendantIcon;
    public long tagId;
    public String tagName;
    public static SCLiveTagUpdate[] _emptyArray;

    public void SCLiveTagUpdate(){
       super();
       this.clear();
    }
    public static SCLiveTagUpdate[] emptyArray(){
       if (SCLiveTagUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveTagUpdate._emptyArray == null) {
             SCLiveTagUpdate[] sCLiveTagUpd = new SCLiveTagUpdate[0];
             SCLiveTagUpdate._emptyArray = sCLiveTagUpd;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveTagUpdate._emptyArray;
    }
    public static SCLiveTagUpdate parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveTagUpdate().mergeFrom(p0);
    }
    public static SCLiveTagUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveTagUpdate(), p0);
    }
    public SCLiveTagUpdate clear(){
       this.tagId = 0;
       this.tagName = "";
       this.liveStreamId = "";
       this.pendantIcon = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveTagUpdate ttagId = this.tagId;
       if (ttagId - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttagId);
       }
       String str = "";
       if (!(this.tagName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.tagName);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       ttagId = this.pendantIcon;
       if (ttagId != null && ttagId.length > 0) {
          int i1 = 0;
          SCLiveTagUpdate tpendantIcon = this.pendantIcon;
          while (i1 < tpendantIcon.length) {
             object oobject = tpendantIcon[i1];
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
    public SCLiveTagUpdate mergeFrom(CodedInputByteBufferNano p0){
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
                      SCLiveTagUpdate tpendantIcon = this.pendantIcon;
                      int i2 = (tpendantIcon == null)? 0: tpendantIcon.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tpendantIcon, 0, picUrlArray, 0, i2);
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
                      this.pendantIcon = picUrlArray;
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
       SCLiveTagUpdate ttagId = this.tagId;
       if (ttagId - null) {
          p0.writeUInt64(1, ttagId);
       }
       String str = "";
       if (!(this.tagName).equals(str)) {
          p0.writeString(2, this.tagName);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       ttagId = this.pendantIcon;
       if (ttagId != null && ttagId.length > 0) {
          int i = 0;
          SCLiveTagUpdate tpendantIcon = this.pendantIcon;
          while (i < tpendantIcon.length) {
             object oobject = tpendantIcon[i];
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
