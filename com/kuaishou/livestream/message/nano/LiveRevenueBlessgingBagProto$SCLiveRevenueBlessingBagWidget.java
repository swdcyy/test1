package com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle;

public final class LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget extends MessageNano	// class@001291
{
    public UserInfos$PicUrl[] bagUrl;
    public LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle bottomText;
    public String campaignId;
    public String liveStreamId;
    public int status;
    public UserInfos$PicUrl[] titleBgUrl;
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget[] _emptyArray;

    public void LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget(){
       super();
       this.clear();
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget[] emptyArray(){
       if (LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget._emptyArray == null) {
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget[] sCLiveRevenu = new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget[0];
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget._emptyArray;
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget parseFrom(CodedInputByteBufferNano p0){
       return new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget().mergeFrom(p0);
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget(), p0);
    }
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget clear(){
       this.campaignId = "";
       this.status = 0;
       this.bagUrl = UserInfos$PicUrl.emptyArray();
       this.bottomText = null;
       this.titleBgUrl = UserInfos$PicUrl.emptyArray();
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.campaignId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.campaignId);
       }
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       tstatus = this.bagUrl;
       int i1 = 0;
       if (tstatus != null && tstatus.length > 0) {
          int i2 = 0;
          LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget tbagUrl = this.bagUrl;
          while (i2 < tbagUrl.length) {
             object oobject = tbagUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstatus = this.bottomText;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tstatus);
       }
       tstatus = this.titleBgUrl;
       if (tstatus != null && tstatus.length > 0) {
          tstatus = this.titleBgUrl;
          while (i1 < tstatus.length) {
             object oobject1 = tstatus[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget mergeFrom(CodedInputByteBufferNano p0){
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget ttitleBgUrl;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      i1 = 42;
                      if (i != i1) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.liveStreamId = p0.readString();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         ttitleBgUrl = this.titleBgUrl;
                         i2 = (ttitleBgUrl == null)? 0: ttitleBgUrl.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(ttitleBgUrl, 0, picUrlArray, 0, i2);
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
                         this.titleBgUrl = picUrlArray;
                      }
                   }else if(this.bottomText == null){
                      this.bottomText = new LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle();
                   }
                   p0.readMessage(this.bottomText);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   ttitleBgUrl = this.bagUrl;
                   i2 = (ttitleBgUrl == null)? 0: ttitleBgUrl.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(ttitleBgUrl, 0, picUrlArray, 0, i2);
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
                   this.bagUrl = picUrlArray;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.status = i;
                }
             }
          }else {
             this.campaignId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.campaignId).equals(str)) {
          p0.writeString(1, this.campaignId);
       }
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       tstatus = this.bagUrl;
       int i = 0;
       if (tstatus != null && tstatus.length > 0) {
          int i1 = 0;
          LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagWidget tbagUrl = this.bagUrl;
          while (i1 < tbagUrl.length) {
             object oobject = tbagUrl[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstatus = this.bottomText;
       if (tstatus != null) {
          p0.writeMessage(4, tstatus);
       }
       tstatus = this.titleBgUrl;
       if (tstatus != null && tstatus.length > 0) {
          tstatus = this.titleBgUrl;
          while (i < tstatus.length) {
             object oobject1 = tstatus[i];
             if (oobject1 != null) {
                p0.writeMessage(5, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(6, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
