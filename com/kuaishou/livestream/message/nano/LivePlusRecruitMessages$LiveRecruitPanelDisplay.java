package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelDisplay;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitPanelButton;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePlusRecruitMessages$LiveRecruitPanelDisplay extends MessageNano	// class@001243
{
    public LivePlusRecruitMessages$LiveRecruitPanelButton[] audienceButtonList;
    public LivePlusRecruitMessages$LiveRecruitPanelButton[] authorButtonList;
    public int authorErrorCode;
    public String authorErrorMsg;
    public boolean isMultiJob;
    public String jobId;
    public String jobImageJumpUrl;
    public UserInfos$PicUrl[] jobInfoImageUrl;
    public String moreJobButtonText;
    public String moreJobButtonUrl;
    public String templateId;
    public static LivePlusRecruitMessages$LiveRecruitPanelDisplay[] _emptyArray;

    public void LivePlusRecruitMessages$LiveRecruitPanelDisplay(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LiveRecruitPanelDisplay[] emptyArray(){
       if (LivePlusRecruitMessages$LiveRecruitPanelDisplay._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LiveRecruitPanelDisplay._emptyArray == null) {
             LivePlusRecruitMessages$LiveRecruitPanelDisplay[] liveRecruitP = new LivePlusRecruitMessages$LiveRecruitPanelDisplay[0];
             LivePlusRecruitMessages$LiveRecruitPanelDisplay._emptyArray = liveRecruitP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LiveRecruitPanelDisplay._emptyArray;
    }
    public static LivePlusRecruitMessages$LiveRecruitPanelDisplay parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LiveRecruitPanelDisplay().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LiveRecruitPanelDisplay parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LiveRecruitPanelDisplay(), p0);
    }
    public LivePlusRecruitMessages$LiveRecruitPanelDisplay clear(){
       this.authorErrorCode = 0;
       this.authorErrorMsg = "";
       this.jobInfoImageUrl = UserInfos$PicUrl.emptyArray();
       this.authorButtonList = LivePlusRecruitMessages$LiveRecruitPanelButton.emptyArray();
       this.audienceButtonList = LivePlusRecruitMessages$LiveRecruitPanelButton.emptyArray();
       this.jobImageJumpUrl = "";
       this.jobId = "";
       this.templateId = "";
       this.moreJobButtonText = "";
       this.moreJobButtonUrl = "";
       this.isMultiJob = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LivePlusRecruitMessages$LiveRecruitPanelDisplay tjobInfoImag;
       object oobject;
       int i = super.computeSerializedSize();
       LivePlusRecruitMessages$LiveRecruitPanelDisplay tauthorError = this.authorErrorCode;
       if (tauthorError != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tauthorError);
       }
       String str = "";
       if (!(this.authorErrorMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.authorErrorMsg);
       }
       tauthorError = this.jobInfoImageUrl;
       int i1 = 0;
       if (tauthorError != null && tauthorError.length > 0) {
          i2 = 0;
          tjobInfoImag = this.jobInfoImageUrl;
          while (i2 < tjobInfoImag.length) {
             oobject = tjobInfoImag[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tauthorError = this.authorButtonList;
       if (tauthorError != null && tauthorError.length > 0) {
          i2 = 0;
          tjobInfoImag = this.authorButtonList;
          while (i2 < tjobInfoImag.length) {
             oobject = tjobInfoImag[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tauthorError = this.audienceButtonList;
       if (tauthorError != null && tauthorError.length > 0) {
          tauthorError = this.audienceButtonList;
          while (i1 < tauthorError.length) {
             object oobject1 = tauthorError[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jobImageJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.jobImageJumpUrl);
       }
       if (!(this.jobId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jobId);
       }
       if (!(this.templateId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.templateId);
       }
       if (!(this.moreJobButtonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.moreJobButtonText);
       }
       if (!(this.moreJobButtonUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.moreJobButtonUrl);
       }
       tauthorError = this.isMultiJob;
       if (tauthorError != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tauthorError);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LiveRecruitPanelDisplay mergeFrom(CodedInputByteBufferNano p0){
       LivePlusRecruitMessages$LiveRecruitPanelDisplay tjobInfoImag;
       int i2;
       LivePlusRecruitMessages$LiveRecruitPanelButton[] liveRecruitP;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.authorErrorCode = p0.readUInt32();
                break;
              case 18:
                this.authorErrorMsg = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                tjobInfoImag = this.jobInfoImageUrl;
                i2 = (tjobInfoImag == null)? 0: tjobInfoImag.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tjobInfoImag, i1, picUrlArray, i1, i2);
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
                this.jobInfoImageUrl = picUrlArray;
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tjobInfoImag = this.authorButtonList;
                i2 = (tjobInfoImag == null)? 0: tjobInfoImag.length;
                i = i + i2;
                liveRecruitP = new LivePlusRecruitMessages$LiveRecruitPanelButton[i];
                if (i2) {
                   System.arraycopy(tjobInfoImag, i1, liveRecruitP, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveRecruitP[i2] = new LivePlusRecruitMessages$LiveRecruitPanelButton();
                   p0.readMessage(liveRecruitP[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveRecruitP[i2] = new LivePlusRecruitMessages$LiveRecruitPanelButton();
                p0.readMessage(liveRecruitP[i2]);
                this.authorButtonList = liveRecruitP;
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tjobInfoImag = this.audienceButtonList;
                i2 = (tjobInfoImag == null)? 0: tjobInfoImag.length;
                i = i + i2;
                liveRecruitP = new LivePlusRecruitMessages$LiveRecruitPanelButton[i];
                if (i2) {
                   System.arraycopy(tjobInfoImag, i1, liveRecruitP, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveRecruitP[i2] = new LivePlusRecruitMessages$LiveRecruitPanelButton();
                   p0.readMessage(liveRecruitP[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveRecruitP[i2] = new LivePlusRecruitMessages$LiveRecruitPanelButton();
                p0.readMessage(liveRecruitP[i2]);
                this.audienceButtonList = liveRecruitP;
                break;
              case '2':
                this.jobImageJumpUrl = p0.readString();
                break;
              case ':':
                this.jobId = p0.readString();
                break;
              case 'B':
                this.templateId = p0.readString();
                break;
              case 'J':
                this.moreJobButtonText = p0.readString();
                break;
              case 'R':
                this.moreJobButtonUrl = p0.readString();
                break;
              case 'X':
                this.isMultiJob = p0.readBool();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LivePlusRecruitMessages$LiveRecruitPanelDisplay tjobInfoImag;
       object oobject;
       LivePlusRecruitMessages$LiveRecruitPanelDisplay tauthorError = this.authorErrorCode;
       if (tauthorError != null) {
          p0.writeUInt32(1, tauthorError);
       }
       String str = "";
       if (!(this.authorErrorMsg).equals(str)) {
          p0.writeString(2, this.authorErrorMsg);
       }
       tauthorError = this.jobInfoImageUrl;
       int i = 0;
       if (tauthorError != null && tauthorError.length > 0) {
          i1 = 0;
          tjobInfoImag = this.jobInfoImageUrl;
          while (i1 < tjobInfoImag.length) {
             oobject = tjobInfoImag[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tauthorError = this.authorButtonList;
       if (tauthorError != null && tauthorError.length > 0) {
          i1 = 0;
          tjobInfoImag = this.authorButtonList;
          while (i1 < tjobInfoImag.length) {
             oobject = tjobInfoImag[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tauthorError = this.audienceButtonList;
       if (tauthorError != null && tauthorError.length > 0) {
          tauthorError = this.audienceButtonList;
          while (i < tauthorError.length) {
             object oobject1 = tauthorError[i];
             if (oobject1 != null) {
                p0.writeMessage(5, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.jobImageJumpUrl).equals(str)) {
          p0.writeString(6, this.jobImageJumpUrl);
       }
       if (!(this.jobId).equals(str)) {
          p0.writeString(7, this.jobId);
       }
       if (!(this.templateId).equals(str)) {
          p0.writeString(8, this.templateId);
       }
       if (!(this.moreJobButtonText).equals(str)) {
          p0.writeString(9, this.moreJobButtonText);
       }
       if (!(this.moreJobButtonUrl).equals(str)) {
          p0.writeString(10, this.moreJobButtonUrl);
       }
       tauthorError = this.isMultiJob;
       if (tauthorError != null) {
          p0.writeBool(11, tauthorError);
       }
       super.writeTo(p0);
       return;
    }
}
