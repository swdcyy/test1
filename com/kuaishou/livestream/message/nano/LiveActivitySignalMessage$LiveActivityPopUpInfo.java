package com.kuaishou.livestream.message.nano.LiveActivitySignalMessage$LiveActivityPopUpInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.System;

public final class LiveActivitySignalMessage$LiveActivityPopUpInfo extends MessageNano	// class@0010c8
{
    public String activityId;
    public LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo animationPicInfo;
    public boolean displayFollowButton;
    public long followRequestMaxDelayMs;
    public UserInfos$PicUrl[] picUrl;
    public long timeoutMillis;
    public UserInfos$UserInfo user;
    public static LiveActivitySignalMessage$LiveActivityPopUpInfo[] _emptyArray;

    public void LiveActivitySignalMessage$LiveActivityPopUpInfo(){
       super();
       this.clear();
    }
    public static LiveActivitySignalMessage$LiveActivityPopUpInfo[] emptyArray(){
       if (LiveActivitySignalMessage$LiveActivityPopUpInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivitySignalMessage$LiveActivityPopUpInfo._emptyArray == null) {
             LiveActivitySignalMessage$LiveActivityPopUpInfo[] liveActivity = new LiveActivitySignalMessage$LiveActivityPopUpInfo[0];
             LiveActivitySignalMessage$LiveActivityPopUpInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivitySignalMessage$LiveActivityPopUpInfo._emptyArray;
    }
    public static LiveActivitySignalMessage$LiveActivityPopUpInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivitySignalMessage$LiveActivityPopUpInfo().mergeFrom(p0);
    }
    public static LiveActivitySignalMessage$LiveActivityPopUpInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivitySignalMessage$LiveActivityPopUpInfo(), p0);
    }
    public LiveActivitySignalMessage$LiveActivityPopUpInfo clear(){
       this.activityId = "";
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.user = null;
       this.displayFollowButton = false;
       this.timeoutMillis = 0;
       this.followRequestMaxDelayMs = 0;
       this.animationPicInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.activityId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityId);
       }
       LiveActivitySignalMessage$LiveActivityPopUpInfo tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i1 = 0;
          LiveActivitySignalMessage$LiveActivityPopUpInfo tpicUrl1 = this.picUrl;
          while (i1 < tpicUrl1.length) {
             object oobject = tpicUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpicUrl = this.user;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tpicUrl);
       }
       tpicUrl = this.displayFollowButton;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tpicUrl);
       }
       tpicUrl = this.timeoutMillis;
       int i2 = 0;
       if (tpicUrl - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tpicUrl);
       }
       tpicUrl = this.followRequestMaxDelayMs;
       if (tpicUrl - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tpicUrl);
       }
       tpicUrl = this.animationPicInfo;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tpicUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivitySignalMessage$LiveActivityPopUpInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else if(this.animationPicInfo == null){
                               this.animationPicInfo = new LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo();
                            }
                            p0.readMessage(this.animationPicInfo);
                         }else {
                            this.followRequestMaxDelayMs = p0.readUInt64();
                         }
                      }else {
                         this.timeoutMillis = p0.readUInt64();
                      }
                   }else {
                      this.displayFollowButton = p0.readBool();
                   }
                }else if(this.user == null){
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveActivitySignalMessage$LiveActivityPopUpInfo tpicUrl = this.picUrl;
                int i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
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
                this.picUrl = picUrlArray;
             }
          }else {
             this.activityId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.activityId).equals("")) {
          p0.writeString(1, this.activityId);
       }
       LiveActivitySignalMessage$LiveActivityPopUpInfo tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i = 0;
          LiveActivitySignalMessage$LiveActivityPopUpInfo tpicUrl1 = this.picUrl;
          while (i < tpicUrl1.length) {
             object oobject = tpicUrl1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tpicUrl = this.user;
       if (tpicUrl != null) {
          p0.writeMessage(3, tpicUrl);
       }
       tpicUrl = this.displayFollowButton;
       if (tpicUrl != null) {
          p0.writeBool(4, tpicUrl);
       }
       tpicUrl = this.timeoutMillis;
       int i1 = 0;
       if (tpicUrl - i1) {
          p0.writeUInt64(5, tpicUrl);
       }
       tpicUrl = this.followRequestMaxDelayMs;
       if (tpicUrl - i1) {
          p0.writeUInt64(6, tpicUrl);
       }
       tpicUrl = this.animationPicInfo;
       if (tpicUrl != null) {
          p0.writeMessage(7, tpicUrl);
       }
       super.writeTo(p0);
       return;
    }
}
