package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveNewActivityPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveAnimationInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantKdsInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantDisplayStyle;

public final class LiveStreamMessages$SCLiveNewActivityPendant extends MessageNano	// class@001349
{
    public LiveStreamMessages$LiveAnimationInfo animationInfo;
    public long displayDurationMs;
    public LiveStreamMessages$LiveActivityNewPendantDisplayStyle displayStyle;
    public boolean ignoreAbTest;
    public LiveStreamMessages$LiveActivityNewPendantKdsInfo kdsInfo;
    public boolean largePendant;
    public String logMessage;
    public String pendantId;
    public int pendantPriority;
    public boolean showAnimationInfo;
    public String shrinkBarBackgroundColor;
    public UserInfos$PicUrl[] shrinkBarImg;
    public String shrinkBarImgTitle;
    public String shrinkBarTitle;
    public static LiveStreamMessages$SCLiveNewActivityPendant[] _emptyArray;

    public void LiveStreamMessages$SCLiveNewActivityPendant(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveNewActivityPendant[] emptyArray(){
       if (LiveStreamMessages$SCLiveNewActivityPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveNewActivityPendant._emptyArray == null) {
             LiveStreamMessages$SCLiveNewActivityPendant[] sCLiveNewAct = new LiveStreamMessages$SCLiveNewActivityPendant[0];
             LiveStreamMessages$SCLiveNewActivityPendant._emptyArray = sCLiveNewAct;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveNewActivityPendant._emptyArray;
    }
    public static LiveStreamMessages$SCLiveNewActivityPendant parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveNewActivityPendant().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveNewActivityPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveNewActivityPendant(), p0);
    }
    public LiveStreamMessages$SCLiveNewActivityPendant clear(){
       this.displayStyle = null;
       this.kdsInfo = null;
       this.shrinkBarBackgroundColor = "";
       this.shrinkBarTitle = "";
       this.logMessage = "";
       this.pendantId = "";
       this.pendantPriority = 0;
       this.ignoreAbTest = false;
       this.largePendant = false;
       this.showAnimationInfo = false;
       this.animationInfo = null;
       this.shrinkBarImg = UserInfos$PicUrl.emptyArray();
       this.shrinkBarImgTitle = "";
       this.displayDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveNewActivityPendant tdisplayStyl = this.displayStyle;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tdisplayStyl);
       }
       tdisplayStyl = this.kdsInfo;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tdisplayStyl);
       }
       String str = "";
       if (!(this.shrinkBarBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.shrinkBarBackgroundColor);
       }
       if (!(this.shrinkBarTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.shrinkBarTitle);
       }
       if (!(this.logMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.logMessage);
       }
       if (!(this.pendantId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.pendantId);
       }
       tdisplayStyl = this.pendantPriority;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tdisplayStyl);
       }
       tdisplayStyl = this.ignoreAbTest;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tdisplayStyl);
       }
       tdisplayStyl = this.largePendant;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tdisplayStyl);
       }
       tdisplayStyl = this.showAnimationInfo;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tdisplayStyl);
       }
       tdisplayStyl = this.animationInfo;
       if (tdisplayStyl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tdisplayStyl);
       }
       tdisplayStyl = this.shrinkBarImg;
       if (tdisplayStyl != null && tdisplayStyl.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCLiveNewActivityPendant tshrinkBarIm = this.shrinkBarImg;
          while (i1 < tshrinkBarIm.length) {
             object oobject = tshrinkBarIm[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(12, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.shrinkBarImgTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.shrinkBarImgTitle);
       }
       tdisplayStyl = this.displayDurationMs;
       if (tdisplayStyl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tdisplayStyl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveNewActivityPendant mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.displayStyle == null) {
                   this.displayStyle = new LiveStreamMessages$LiveActivityNewPendantDisplayStyle();
                }
                p0.readMessage(this.displayStyle);
                break;
              case 18:
                if (this.kdsInfo == null) {
                   this.kdsInfo = new LiveStreamMessages$LiveActivityNewPendantKdsInfo();
                }
                p0.readMessage(this.kdsInfo);
                break;
              case 26:
                this.shrinkBarBackgroundColor = p0.readString();
                break;
              case '"':
                this.shrinkBarTitle = p0.readString();
                break;
              case '*':
                this.logMessage = p0.readString();
                break;
              case '2':
                this.pendantId = p0.readString();
                break;
              case '8':
                this.pendantPriority = p0.readUInt32();
                break;
              case '@':
                this.ignoreAbTest = p0.readBool();
                break;
              case 'H':
                this.largePendant = p0.readBool();
                break;
              case 'P':
                this.showAnimationInfo = p0.readBool();
                break;
              case 'Z':
                if (this.animationInfo == null) {
                   this.animationInfo = new LiveStreamMessages$LiveAnimationInfo();
                }
                p0.readMessage(this.animationInfo);
                break;
              case 'b':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 98);
                LiveStreamMessages$SCLiveNewActivityPendant tshrinkBarIm = this.shrinkBarImg;
                int i1 = (tshrinkBarIm == null)? 0: tshrinkBarIm.length;
                i = i + i1;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(tshrinkBarIm, 0, picUrlArray, 0, i1);
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
                this.shrinkBarImg = picUrlArray;
                break;
              case 'j':
                this.shrinkBarImgTitle = p0.readString();
                break;
              case 'p':
                this.displayDurationMs = p0.readUInt64();
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
       LiveStreamMessages$SCLiveNewActivityPendant tdisplayStyl = this.displayStyle;
       if (tdisplayStyl != null) {
          p0.writeMessage(1, tdisplayStyl);
       }
       tdisplayStyl = this.kdsInfo;
       if (tdisplayStyl != null) {
          p0.writeMessage(2, tdisplayStyl);
       }
       String str = "";
       if (!(this.shrinkBarBackgroundColor).equals(str)) {
          p0.writeString(3, this.shrinkBarBackgroundColor);
       }
       if (!(this.shrinkBarTitle).equals(str)) {
          p0.writeString(4, this.shrinkBarTitle);
       }
       if (!(this.logMessage).equals(str)) {
          p0.writeString(5, this.logMessage);
       }
       if (!(this.pendantId).equals(str)) {
          p0.writeString(6, this.pendantId);
       }
       tdisplayStyl = this.pendantPriority;
       if (tdisplayStyl != null) {
          p0.writeUInt32(7, tdisplayStyl);
       }
       tdisplayStyl = this.ignoreAbTest;
       if (tdisplayStyl != null) {
          p0.writeBool(8, tdisplayStyl);
       }
       tdisplayStyl = this.largePendant;
       if (tdisplayStyl != null) {
          p0.writeBool(9, tdisplayStyl);
       }
       tdisplayStyl = this.showAnimationInfo;
       if (tdisplayStyl != null) {
          p0.writeBool(10, tdisplayStyl);
       }
       tdisplayStyl = this.animationInfo;
       if (tdisplayStyl != null) {
          p0.writeMessage(11, tdisplayStyl);
       }
       tdisplayStyl = this.shrinkBarImg;
       if (tdisplayStyl != null && tdisplayStyl.length > 0) {
          int i = 0;
          LiveStreamMessages$SCLiveNewActivityPendant tshrinkBarIm = this.shrinkBarImg;
          while (i < tshrinkBarIm.length) {
             object oobject = tshrinkBarIm[i];
             if (oobject != null) {
                p0.writeMessage(12, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.shrinkBarImgTitle).equals(str)) {
          p0.writeString(13, this.shrinkBarImgTitle);
       }
       tdisplayStyl = this.displayDurationMs;
       if (tdisplayStyl) {
          p0.writeUInt64(14, tdisplayStyl);
       }
       super.writeTo(p0);
       return;
    }
}
