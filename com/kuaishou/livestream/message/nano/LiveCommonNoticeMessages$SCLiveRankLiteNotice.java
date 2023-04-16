package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$SCLiveRankLiteNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveCommonNoticeMessages$SCLiveRankLiteNotice extends MessageNano	// class@00115a
{
    public UserInfos$PicUrl[] backgroundPicUrls;
    public int bizType;
    public int displayDurationMillis;
    public int displayPriority;
    public String iconUrl;
    public String jumpKwaiUrl;
    public String textContent;
    public static LiveCommonNoticeMessages$SCLiveRankLiteNotice[] _emptyArray;

    public void LiveCommonNoticeMessages$SCLiveRankLiteNotice(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$SCLiveRankLiteNotice[] emptyArray(){
       if (LiveCommonNoticeMessages$SCLiveRankLiteNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$SCLiveRankLiteNotice._emptyArray == null) {
             LiveCommonNoticeMessages$SCLiveRankLiteNotice[] sCLiveRankLi = new LiveCommonNoticeMessages$SCLiveRankLiteNotice[0];
             LiveCommonNoticeMessages$SCLiveRankLiteNotice._emptyArray = sCLiveRankLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$SCLiveRankLiteNotice._emptyArray;
    }
    public static LiveCommonNoticeMessages$SCLiveRankLiteNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$SCLiveRankLiteNotice().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$SCLiveRankLiteNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$SCLiveRankLiteNotice(), p0);
    }
    public LiveCommonNoticeMessages$SCLiveRankLiteNotice clear(){
       this.bizType = 0;
       this.displayPriority = 0;
       this.displayDurationMillis = 0;
       this.iconUrl = "";
       this.textContent = "";
       this.backgroundPicUrls = UserInfos$PicUrl.emptyArray();
       this.jumpKwaiUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonNoticeMessages$SCLiveRankLiteNotice tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       tbizType = this.displayPriority;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tbizType);
       }
       tbizType = this.displayDurationMillis;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tbizType);
       }
       String str = "";
       if (!(this.iconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.iconUrl);
       }
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.textContent);
       }
       tbizType = this.backgroundPicUrls;
       if (tbizType != null && tbizType.length > 0) {
          int i1 = 0;
          LiveCommonNoticeMessages$SCLiveRankLiteNotice tbackgroundP = this.backgroundPicUrls;
          while (i1 < tbackgroundP.length) {
             object oobject = tbackgroundP[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jumpKwaiUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jumpKwaiUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$SCLiveRankLiteNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.jumpKwaiUrl = p0.readString();
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            LiveCommonNoticeMessages$SCLiveRankLiteNotice tbackgroundP = this.backgroundPicUrls;
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
                            this.backgroundPicUrls = picUrlArray;
                         }
                      }else {
                         this.textContent = p0.readString();
                      }
                   }else {
                      this.iconUrl = p0.readString();
                   }
                }else {
                   this.displayDurationMillis = p0.readUInt32();
                }
             }else {
                this.displayPriority = p0.readUInt32();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonNoticeMessages$SCLiveRankLiteNotice tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       tbizType = this.displayPriority;
       if (tbizType != null) {
          p0.writeUInt32(2, tbizType);
       }
       tbizType = this.displayDurationMillis;
       if (tbizType != null) {
          p0.writeUInt32(3, tbizType);
       }
       String str = "";
       if (!(this.iconUrl).equals(str)) {
          p0.writeString(4, this.iconUrl);
       }
       if (!(this.textContent).equals(str)) {
          p0.writeString(5, this.textContent);
       }
       tbizType = this.backgroundPicUrls;
       if (tbizType != null && tbizType.length > 0) {
          int i = 0;
          LiveCommonNoticeMessages$SCLiveRankLiteNotice tbackgroundP = this.backgroundPicUrls;
          while (i < tbackgroundP.length) {
             object oobject = tbackgroundP[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.jumpKwaiUrl).equals(str)) {
          p0.writeString(7, this.jumpKwaiUrl);
       }
       super.writeTo(p0);
       return;
    }
}
