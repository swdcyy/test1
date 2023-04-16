package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitAuthorWidget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetButtonInfo;
import java.lang.System;

public final class LivePlusRecruitMessages$LivePlusRecruitAuthorWidget extends MessageNano	// class@00123a
{
    public LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo alertInfo;
    public String applyCount;
    public LivePlusRecruitMessages$RecruitWidgetButtonInfo button;
    public String guideDesc;
    public String guideTitle;
    public String jobId;
    public String jobTitle;
    public String jumpUrl;
    public String liveStreamId;
    public UserInfos$PicUrl[] picture;
    public String salary;
    public int widgetState;
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorWidget[] _emptyArray;

    public void LivePlusRecruitMessages$LivePlusRecruitAuthorWidget(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorWidget[] emptyArray(){
       if (LivePlusRecruitMessages$LivePlusRecruitAuthorWidget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LivePlusRecruitAuthorWidget._emptyArray == null) {
             LivePlusRecruitMessages$LivePlusRecruitAuthorWidget[] livePlusRecr = new LivePlusRecruitMessages$LivePlusRecruitAuthorWidget[0];
             LivePlusRecruitMessages$LivePlusRecruitAuthorWidget._emptyArray = livePlusRecr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LivePlusRecruitAuthorWidget._emptyArray;
    }
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorWidget parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LivePlusRecruitAuthorWidget().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LivePlusRecruitAuthorWidget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LivePlusRecruitAuthorWidget(), p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitAuthorWidget clear(){
       this.liveStreamId = "";
       this.widgetState = 0;
       this.guideTitle = "";
       this.guideDesc = "";
       this.picture = UserInfos$PicUrl.emptyArray();
       this.jobId = "";
       this.jobTitle = "";
       this.salary = "";
       this.applyCount = "";
       this.jumpUrl = "";
       this.button = null;
       this.alertInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LivePlusRecruitMessages$LivePlusRecruitAuthorWidget twidgetState = this.widgetState;
       if (twidgetState != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, twidgetState);
       }
       if (!(this.guideTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.guideTitle);
       }
       if (!(this.guideDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.guideDesc);
       }
       twidgetState = this.picture;
       if (twidgetState != null && twidgetState.length > 0) {
          int i1 = 0;
          LivePlusRecruitMessages$LivePlusRecruitAuthorWidget tpicture = this.picture;
          while (i1 < tpicture.length) {
             object oobject = tpicture[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jobId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.jobId);
       }
       if (!(this.jobTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.jobTitle);
       }
       if (!(this.salary).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.salary);
       }
       if (!(this.applyCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.applyCount);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.jumpUrl);
       }
       twidgetState = this.button;
       if (twidgetState != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, twidgetState);
       }
       twidgetState = this.alertInfo;
       if (twidgetState != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, twidgetState);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitAuthorWidget mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.widgetState = i;
                }
                break;
              case 26:
                this.guideTitle = p0.readString();
                break;
              case '"':
                this.guideDesc = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                LivePlusRecruitMessages$LivePlusRecruitAuthorWidget tpicture = this.picture;
                int i1 = (tpicture == null)? 0: tpicture.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(tpicture, 0, picUrlArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.picture = picUrlArray;
                break;
              case '2':
                this.jobId = p0.readString();
                break;
              case ':':
                this.jobTitle = p0.readString();
                break;
              case 'B':
                this.salary = p0.readString();
                break;
              case 'J':
                this.applyCount = p0.readString();
                break;
              case 'R':
                this.jumpUrl = p0.readString();
                break;
              case 'Z':
                if (this.button == null) {
                   this.button = new LivePlusRecruitMessages$RecruitWidgetButtonInfo();
                }
                p0.readMessage(this.button);
                break;
              case 'b':
                if (this.alertInfo == null) {
                   this.alertInfo = new LivePlusRecruitMessages$RecruitWidgetTopLeftAlertInfo();
                }
                p0.readMessage(this.alertInfo);
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
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LivePlusRecruitMessages$LivePlusRecruitAuthorWidget twidgetState = this.widgetState;
       if (twidgetState != null) {
          p0.writeInt32(2, twidgetState);
       }
       if (!(this.guideTitle).equals(str)) {
          p0.writeString(3, this.guideTitle);
       }
       if (!(this.guideDesc).equals(str)) {
          p0.writeString(4, this.guideDesc);
       }
       twidgetState = this.picture;
       if (twidgetState != null && twidgetState.length > 0) {
          int i = 0;
          LivePlusRecruitMessages$LivePlusRecruitAuthorWidget tpicture = this.picture;
          while (i < tpicture.length) {
             object oobject = tpicture[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.jobId).equals(str)) {
          p0.writeString(6, this.jobId);
       }
       if (!(this.jobTitle).equals(str)) {
          p0.writeString(7, this.jobTitle);
       }
       if (!(this.salary).equals(str)) {
          p0.writeString(8, this.salary);
       }
       if (!(this.applyCount).equals(str)) {
          p0.writeString(9, this.applyCount);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(10, this.jumpUrl);
       }
       twidgetState = this.button;
       if (twidgetState != null) {
          p0.writeMessage(11, twidgetState);
       }
       twidgetState = this.alertInfo;
       if (twidgetState != null) {
          p0.writeMessage(12, twidgetState);
       }
       super.writeTo(p0);
       return;
    }
}
