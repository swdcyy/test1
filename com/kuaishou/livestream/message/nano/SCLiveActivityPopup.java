package com.kuaishou.livestream.message.nano.SCLiveActivityPopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import java.lang.System;

public final class SCLiveActivityPopup extends MessageNano	// class@0013ff
{
    public LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo animationPicInfo;
    public UserInfos$PicUrl[] displayPict;
    public String link;
    public int linkType;
    public static SCLiveActivityPopup[] _emptyArray;

    public void SCLiveActivityPopup(){
       super();
       this.clear();
    }
    public static SCLiveActivityPopup[] emptyArray(){
       if (SCLiveActivityPopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveActivityPopup._emptyArray == null) {
             SCLiveActivityPopup[] sCLiveActivi = new SCLiveActivityPopup[0];
             SCLiveActivityPopup._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveActivityPopup._emptyArray;
    }
    public static SCLiveActivityPopup parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveActivityPopup().mergeFrom(p0);
    }
    public static SCLiveActivityPopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveActivityPopup(), p0);
    }
    public SCLiveActivityPopup clear(){
       this.displayPict = UserInfos$PicUrl.emptyArray();
       this.animationPicInfo = null;
       this.linkType = 0;
       this.link = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveActivityPopup tdisplayPict = this.displayPict;
       if (tdisplayPict != null && tdisplayPict.length > 0) {
          int i1 = 0;
          SCLiveActivityPopup tdisplayPict1 = this.displayPict;
          while (i1 < tdisplayPict1.length) {
             object oobject = tdisplayPict1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tdisplayPict = this.animationPicInfo;
       if (tdisplayPict != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tdisplayPict);
       }
       tdisplayPict = this.linkType;
       if (tdisplayPict != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tdisplayPict);
       }
       if (!(this.link).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.link);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveActivityPopup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.link = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && i != 1) {
                      continue ;
                   }else {
                      this.linkType = i;
                   }
                }
             }else if(this.animationPicInfo == null){
                this.animationPicInfo = new LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo();
             }
             p0.readMessage(this.animationPicInfo);
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCLiveActivityPopup tdisplayPict = this.displayPict;
             int i2 = (tdisplayPict == null)? 0: tdisplayPict.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tdisplayPict, 0, picUrlArray, 0, i2);
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
             this.displayPict = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveActivityPopup tdisplayPict = this.displayPict;
       if (tdisplayPict != null && tdisplayPict.length > 0) {
          int i = 0;
          SCLiveActivityPopup tdisplayPict1 = this.displayPict;
          while (i < tdisplayPict1.length) {
             object oobject = tdisplayPict1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tdisplayPict = this.animationPicInfo;
       if (tdisplayPict != null) {
          p0.writeMessage(2, tdisplayPict);
       }
       tdisplayPict = this.linkType;
       if (tdisplayPict != null) {
          p0.writeInt32(3, tdisplayPict);
       }
       if (!(this.link).equals("")) {
          p0.writeString(4, this.link);
       }
       super.writeTo(p0);
       return;
    }
}