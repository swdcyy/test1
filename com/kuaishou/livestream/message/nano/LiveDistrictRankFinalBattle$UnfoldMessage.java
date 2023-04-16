package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$UnfoldSubMessage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveDistrictRankFinalBattle$UnfoldMessage extends MessageNano	// class@00118b
{
    public String extraInfo;
    public UserInfos$PicUrl[] infoShowPicUrl;
    public LiveDistrictRankFinalBattle$UnfoldSubMessage[] unfoldSubMessage;
    public static LiveDistrictRankFinalBattle$UnfoldMessage[] _emptyArray;

    public void LiveDistrictRankFinalBattle$UnfoldMessage(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$UnfoldMessage[] emptyArray(){
       if (LiveDistrictRankFinalBattle$UnfoldMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$UnfoldMessage._emptyArray == null) {
             LiveDistrictRankFinalBattle$UnfoldMessage[] unfoldMessag = new LiveDistrictRankFinalBattle$UnfoldMessage[0];
             LiveDistrictRankFinalBattle$UnfoldMessage._emptyArray = unfoldMessag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$UnfoldMessage._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$UnfoldMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$UnfoldMessage().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$UnfoldMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$UnfoldMessage(), p0);
    }
    public LiveDistrictRankFinalBattle$UnfoldMessage clear(){
       this.infoShowPicUrl = UserInfos$PicUrl.emptyArray();
       this.unfoldSubMessage = LiveDistrictRankFinalBattle$UnfoldSubMessage.emptyArray();
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDistrictRankFinalBattle$UnfoldMessage tinfoShowPic = this.infoShowPicUrl;
       int i1 = 0;
       if (tinfoShowPic != null && tinfoShowPic.length > 0) {
          int i2 = 0;
          LiveDistrictRankFinalBattle$UnfoldMessage tinfoShowPic1 = this.infoShowPicUrl;
          while (i2 < tinfoShowPic1.length) {
             object oobject = tinfoShowPic1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tinfoShowPic = this.unfoldSubMessage;
       if (tinfoShowPic != null && tinfoShowPic.length > 0) {
          tinfoShowPic = this.unfoldSubMessage;
          while (i1 < tinfoShowPic.length) {
             object oobject1 = tinfoShowPic[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$UnfoldMessage mergeFrom(CodedInputByteBufferNano p0){
       LiveDistrictRankFinalBattle$UnfoldMessage tunfoldSubMe;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.extraInfo = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tunfoldSubMe = this.unfoldSubMessage;
                i2 = (tunfoldSubMe == null)? 0: tunfoldSubMe.length;
                i = i + i2;
                LiveDistrictRankFinalBattle$UnfoldSubMessage[] unfoldSubMes = new LiveDistrictRankFinalBattle$UnfoldSubMessage[i];
                if (i2) {
                   System.arraycopy(tunfoldSubMe, 0, unfoldSubMes, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   unfoldSubMes[i2] = new LiveDistrictRankFinalBattle$UnfoldSubMessage();
                   p0.readMessage(unfoldSubMes[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                unfoldSubMes[i2] = new LiveDistrictRankFinalBattle$UnfoldSubMessage();
                p0.readMessage(unfoldSubMes[i2]);
                this.unfoldSubMessage = unfoldSubMes;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tunfoldSubMe = this.infoShowPicUrl;
             i2 = (tunfoldSubMe == null)? 0: tunfoldSubMe.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tunfoldSubMe, 0, picUrlArray, 0, i2);
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
             this.infoShowPicUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDistrictRankFinalBattle$UnfoldMessage tinfoShowPic = this.infoShowPicUrl;
       int i = 0;
       if (tinfoShowPic != null && tinfoShowPic.length > 0) {
          int i1 = 0;
          LiveDistrictRankFinalBattle$UnfoldMessage tinfoShowPic1 = this.infoShowPicUrl;
          while (i1 < tinfoShowPic1.length) {
             object oobject = tinfoShowPic1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tinfoShowPic = this.unfoldSubMessage;
       if (tinfoShowPic != null && tinfoShowPic.length > 0) {
          tinfoShowPic = this.unfoldSubMessage;
          while (i < tinfoShowPic.length) {
             object oobject1 = tinfoShowPic[i];
             if (oobject1 != null) {
                p0.writeMessage(2, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.extraInfo).equals("")) {
          p0.writeString(3, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
