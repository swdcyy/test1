package com.kuaishou.livestream.message.nano.GzoneCommentLotteryFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class GzoneCommentLotteryFeed extends MessageNano	// class@0010ac
{
    public String content;
    public String deviceHash;
    public UserInfos$PicUrl[] iconUrls;
    public String id;
    public long time;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public static GzoneCommentLotteryFeed[] _emptyArray;

    public void GzoneCommentLotteryFeed(){
       super();
       this.clear();
    }
    public static GzoneCommentLotteryFeed[] emptyArray(){
       if (GzoneCommentLotteryFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneCommentLotteryFeed._emptyArray == null) {
             GzoneCommentLotteryFeed[] gzoneComment = new GzoneCommentLotteryFeed[0];
             GzoneCommentLotteryFeed._emptyArray = gzoneComment;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneCommentLotteryFeed._emptyArray;
    }
    public static GzoneCommentLotteryFeed parseFrom(CodedInputByteBufferNano p0){
       return new GzoneCommentLotteryFeed().mergeFrom(p0);
    }
    public static GzoneCommentLotteryFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneCommentLotteryFeed(), p0);
    }
    public GzoneCommentLotteryFeed clear(){
       this.id = "";
       this.user = null;
       this.deviceHash = "";
       this.userState = null;
       this.time = 0;
       this.content = "";
       this.iconUrls = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       GzoneCommentLotteryFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.deviceHash);
       }
       tuser = this.userState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tuser);
       }
       GzoneCommentLotteryFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttime);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.content);
       }
       tuser = this.iconUrls;
       if (tuser != null && tuser.length > 0) {
          int i1 = 0;
          GzoneCommentLotteryFeed ticonUrls = this.iconUrls;
          while (i1 < ticonUrls.length) {
             object oobject = ticonUrls[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneCommentLotteryFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            int i1 = 58;
                            if (i != i1) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               GzoneCommentLotteryFeed ticonUrls = this.iconUrls;
                               int i2 = (ticonUrls == null)? 0: ticonUrls.length;
                               i = i + i2;
                               UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(ticonUrls, 0, picUrlArray, 0, i2);
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
                               this.iconUrls = picUrlArray;
                            }
                         }else {
                            this.content = p0.readString();
                         }
                      }else {
                         this.time = p0.readUInt64();
                      }
                   }else if(this.userState == null){
                      this.userState = new LiveAudienceState();
                   }
                   p0.readMessage(this.userState);
                }else {
                   this.deviceHash = p0.readString();
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       GzoneCommentLotteryFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(3, this.deviceHash);
       }
       tuser = this.userState;
       if (tuser != null) {
          p0.writeMessage(4, tuser);
       }
       GzoneCommentLotteryFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(5, ttime);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(6, this.content);
       }
       tuser = this.iconUrls;
       if (tuser != null && tuser.length > 0) {
          int i = 0;
          GzoneCommentLotteryFeed ticonUrls = this.iconUrls;
          while (i < ticonUrls.length) {
             object oobject = ticonUrls[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
