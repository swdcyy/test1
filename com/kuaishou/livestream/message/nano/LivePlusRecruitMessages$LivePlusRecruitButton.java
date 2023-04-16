package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitButton;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePlusRecruitMessages$LivePlusRecruitButton extends MessageNano	// class@00123b
{
    public String audienceButtonJumpUrl;
    public String authorButtonJumpUrl;
    public String authorPanelJumpUrl;
    public String authorPanelPromptConfirm;
    public String authorPanelPromptContent;
    public String authorPanelPromptTitle;
    public boolean canShow;
    public boolean canShowMoreOption;
    public boolean enableOpenRecruit;
    public String liveStreamId;
    public UserInfos$PicUrl[] recruitIcon;
    public static LivePlusRecruitMessages$LivePlusRecruitButton[] _emptyArray;

    public void LivePlusRecruitMessages$LivePlusRecruitButton(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LivePlusRecruitButton[] emptyArray(){
       if (LivePlusRecruitMessages$LivePlusRecruitButton._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LivePlusRecruitButton._emptyArray == null) {
             LivePlusRecruitMessages$LivePlusRecruitButton[] livePlusRecr = new LivePlusRecruitMessages$LivePlusRecruitButton[0];
             LivePlusRecruitMessages$LivePlusRecruitButton._emptyArray = livePlusRecr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LivePlusRecruitButton._emptyArray;
    }
    public static LivePlusRecruitMessages$LivePlusRecruitButton parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LivePlusRecruitButton().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LivePlusRecruitButton parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LivePlusRecruitButton(), p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitButton clear(){
       this.liveStreamId = "";
       this.canShow = false;
       this.authorButtonJumpUrl = "";
       this.audienceButtonJumpUrl = "";
       this.authorPanelJumpUrl = "";
       this.recruitIcon = UserInfos$PicUrl.emptyArray();
       this.canShowMoreOption = false;
       this.enableOpenRecruit = false;
       this.authorPanelPromptTitle = "";
       this.authorPanelPromptContent = "";
       this.authorPanelPromptConfirm = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LivePlusRecruitMessages$LivePlusRecruitButton tcanShow = this.canShow;
       if (tcanShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tcanShow);
       }
       if (!(this.authorButtonJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.authorButtonJumpUrl);
       }
       if (!(this.audienceButtonJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.audienceButtonJumpUrl);
       }
       if (!(this.authorPanelJumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.authorPanelJumpUrl);
       }
       tcanShow = this.recruitIcon;
       if (tcanShow != null && tcanShow.length > 0) {
          int i1 = 0;
          LivePlusRecruitMessages$LivePlusRecruitButton trecruitIcon = this.recruitIcon;
          while (i1 < trecruitIcon.length) {
             object oobject = trecruitIcon[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcanShow = this.canShowMoreOption;
       if (tcanShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tcanShow);
       }
       tcanShow = this.enableOpenRecruit;
       if (tcanShow != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tcanShow);
       }
       if (!(this.authorPanelPromptTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.authorPanelPromptTitle);
       }
       if (!(this.authorPanelPromptContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.authorPanelPromptContent);
       }
       if (!(this.authorPanelPromptConfirm).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.authorPanelPromptConfirm);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitButton mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                this.canShow = p0.readBool();
                break;
              case 26:
                this.authorButtonJumpUrl = p0.readString();
                break;
              case '"':
                this.audienceButtonJumpUrl = p0.readString();
                break;
              case '*':
                this.authorPanelJumpUrl = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                LivePlusRecruitMessages$LivePlusRecruitButton trecruitIcon = this.recruitIcon;
                int i1 = (trecruitIcon == null)? 0: trecruitIcon.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(trecruitIcon, 0, picUrlArray, 0, i1);
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
                this.recruitIcon = picUrlArray;
                break;
              case '8':
                this.canShowMoreOption = p0.readBool();
                break;
              case '@':
                this.enableOpenRecruit = p0.readBool();
                break;
              case 'J':
                this.authorPanelPromptTitle = p0.readString();
                break;
              case 'R':
                this.authorPanelPromptContent = p0.readString();
                break;
              case 'Z':
                this.authorPanelPromptConfirm = p0.readString();
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
       LivePlusRecruitMessages$LivePlusRecruitButton tcanShow = this.canShow;
       if (tcanShow != null) {
          p0.writeBool(2, tcanShow);
       }
       if (!(this.authorButtonJumpUrl).equals(str)) {
          p0.writeString(3, this.authorButtonJumpUrl);
       }
       if (!(this.audienceButtonJumpUrl).equals(str)) {
          p0.writeString(4, this.audienceButtonJumpUrl);
       }
       if (!(this.authorPanelJumpUrl).equals(str)) {
          p0.writeString(5, this.authorPanelJumpUrl);
       }
       tcanShow = this.recruitIcon;
       if (tcanShow != null && tcanShow.length > 0) {
          int i = 0;
          LivePlusRecruitMessages$LivePlusRecruitButton trecruitIcon = this.recruitIcon;
          while (i < trecruitIcon.length) {
             object oobject = trecruitIcon[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       tcanShow = this.canShowMoreOption;
       if (tcanShow != null) {
          p0.writeBool(7, tcanShow);
       }
       tcanShow = this.enableOpenRecruit;
       if (tcanShow != null) {
          p0.writeBool(8, tcanShow);
       }
       if (!(this.authorPanelPromptTitle).equals(str)) {
          p0.writeString(9, this.authorPanelPromptTitle);
       }
       if (!(this.authorPanelPromptContent).equals(str)) {
          p0.writeString(10, this.authorPanelPromptContent);
       }
       if (!(this.authorPanelPromptConfirm).equals(str)) {
          p0.writeString(11, this.authorPanelPromptConfirm);
       }
       super.writeTo(p0);
       return;
    }
}
