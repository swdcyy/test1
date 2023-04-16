package com.kuaishou.livestream.message.nano.SCLiveActivityPush;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveActivityPush extends MessageNano	// class@001400
{
    public UserInfos$PicUrl[] backgroundPic;
    public String broadcastInfo;
    public long displayDuration;
    public String ksOrderId;
    public String targetLiveStreamId;
    public String title;
    public String titleBackgroundColor;
    public static SCLiveActivityPush[] _emptyArray;

    public void SCLiveActivityPush(){
       super();
       this.clear();
    }
    public static SCLiveActivityPush[] emptyArray(){
       if (SCLiveActivityPush._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveActivityPush._emptyArray == null) {
             SCLiveActivityPush[] sCLiveActivi = new SCLiveActivityPush[0];
             SCLiveActivityPush._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveActivityPush._emptyArray;
    }
    public static SCLiveActivityPush parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveActivityPush().mergeFrom(p0);
    }
    public static SCLiveActivityPush parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveActivityPush(), p0);
    }
    public SCLiveActivityPush clear(){
       this.title = "";
       this.titleBackgroundColor = "";
       this.backgroundPic = UserInfos$PicUrl.emptyArray();
       this.targetLiveStreamId = "";
       this.displayDuration = 0;
       this.ksOrderId = "";
       this.broadcastInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       SCLiveActivityPush tbackgroundP1;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.titleBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.titleBackgroundColor);
       }
       SCLiveActivityPush tbackgroundP = this.backgroundPic;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i1 = 0;
          tbackgroundP1 = this.backgroundPic;
          while (i1 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.targetLiveStreamId);
       }
       tbackgroundP1 = this.displayDuration;
       if (tbackgroundP1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbackgroundP1);
       }
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.ksOrderId);
       }
       if (!(this.broadcastInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.broadcastInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveActivityPush mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.broadcastInfo = p0.readString();
                            }
                         }else {
                            this.ksOrderId = p0.readString();
                         }
                      }else {
                         this.displayDuration = p0.readUInt64();
                      }
                   }else {
                      this.targetLiveStreamId = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   SCLiveActivityPush tbackgroundP = this.backgroundPic;
                   int i2 = (tbackgroundP == null)? 0: tbackgroundP.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tbackgroundP, 0, picUrlArray, 0, i2);
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
                   this.backgroundPic = picUrlArray;
                }
             }else {
                this.titleBackgroundColor = p0.readString();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveActivityPush tbackgroundP1;
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.titleBackgroundColor).equals(str)) {
          p0.writeString(2, this.titleBackgroundColor);
       }
       SCLiveActivityPush tbackgroundP = this.backgroundPic;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i = 0;
          tbackgroundP1 = this.backgroundPic;
          while (i < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.targetLiveStreamId).equals(str)) {
          p0.writeString(4, this.targetLiveStreamId);
       }
       tbackgroundP1 = this.displayDuration;
       if (tbackgroundP1) {
          p0.writeUInt64(5, tbackgroundP1);
       }
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(6, this.ksOrderId);
       }
       if (!(this.broadcastInfo).equals(str)) {
          p0.writeString(7, this.broadcastInfo);
       }
       super.writeTo(p0);
       return;
    }
}
