package com.kuaishou.livestream.message.nano.SCLiveEcoExplainCardSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveEcoExplainCardSignal extends MessageNano	// class@00141a
{
    public String actionUrl;
    public String bizType;
    public String bundleInfo;
    public String buttonText;
    public String ext;
    public UserInfos$PicUrl[] icon;
    public boolean showClose;
    public int signalType;
    public String title;
    public UserInfos$PicUrl[] topLeftIcon;
    public String topLeftTips;
    public static SCLiveEcoExplainCardSignal[] _emptyArray;

    public void SCLiveEcoExplainCardSignal(){
       super();
       this.clear();
    }
    public static SCLiveEcoExplainCardSignal[] emptyArray(){
       if (SCLiveEcoExplainCardSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveEcoExplainCardSignal._emptyArray == null) {
             SCLiveEcoExplainCardSignal[] sCLiveEcoExp = new SCLiveEcoExplainCardSignal[0];
             SCLiveEcoExplainCardSignal._emptyArray = sCLiveEcoExp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveEcoExplainCardSignal._emptyArray;
    }
    public static SCLiveEcoExplainCardSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveEcoExplainCardSignal().mergeFrom(p0);
    }
    public static SCLiveEcoExplainCardSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveEcoExplainCardSignal(), p0);
    }
    public SCLiveEcoExplainCardSignal clear(){
       this.signalType = 0;
       this.title = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.actionUrl = "";
       this.buttonText = "";
       this.topLeftTips = "";
       this.topLeftIcon = UserInfos$PicUrl.emptyArray();
       this.showClose = false;
       this.bundleInfo = "";
       this.ext = "";
       this.bizType = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveEcoExplainCardSignal tsignalType = this.signalType;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsignalType);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       tsignalType = this.icon;
       int i1 = 0;
       if (tsignalType != null && tsignalType.length > 0) {
          int i2 = 0;
          SCLiveEcoExplainCardSignal ticon = this.icon;
          while (i2 < ticon.length) {
             object oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.actionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.actionUrl);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.buttonText);
       }
       if (!(this.topLeftTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.topLeftTips);
       }
       tsignalType = this.topLeftIcon;
       if (tsignalType != null && tsignalType.length > 0) {
          tsignalType = this.topLeftIcon;
          while (i1 < tsignalType.length) {
             object oobject1 = tsignalType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tsignalType = this.showClose;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tsignalType);
       }
       if (!(this.bundleInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.bundleInfo);
       }
       if (!(this.ext).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.ext);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.bizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveEcoExplainCardSignal mergeFrom(CodedInputByteBufferNano p0){
       SCLiveEcoExplainCardSignal ticon;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.signalType = i;
                }
                break;
              case 18:
                this.title = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                ticon = this.icon;
                i2 = (ticon == null)? 0: ticon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticon, i1, picUrlArray, i1, i2);
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
                this.icon = picUrlArray;
                break;
              case '"':
                this.actionUrl = p0.readString();
                break;
              case '*':
                this.buttonText = p0.readString();
                break;
              case '2':
                this.topLeftTips = p0.readString();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                ticon = this.topLeftIcon;
                i2 = (ticon == null)? 0: ticon.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticon, i1, picUrlArray, i1, i2);
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
                this.topLeftIcon = picUrlArray;
                break;
              case '@':
                this.showClose = p0.readBool();
                break;
              case 'J':
                this.bundleInfo = p0.readString();
                break;
              case 'R':
                this.ext = p0.readString();
                break;
              case 'Z':
                this.bizType = p0.readString();
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
       SCLiveEcoExplainCardSignal tsignalType = this.signalType;
       if (tsignalType != null) {
          p0.writeInt32(1, tsignalType);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       tsignalType = this.icon;
       int i = 0;
       if (tsignalType != null && tsignalType.length > 0) {
          int i1 = 0;
          SCLiveEcoExplainCardSignal ticon = this.icon;
          while (i1 < ticon.length) {
             object oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.actionUrl).equals(str)) {
          p0.writeString(4, this.actionUrl);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(5, this.buttonText);
       }
       if (!(this.topLeftTips).equals(str)) {
          p0.writeString(6, this.topLeftTips);
       }
       tsignalType = this.topLeftIcon;
       if (tsignalType != null && tsignalType.length > 0) {
          tsignalType = this.topLeftIcon;
          while (i < tsignalType.length) {
             object oobject1 = tsignalType[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       tsignalType = this.showClose;
       if (tsignalType != null) {
          p0.writeBool(8, tsignalType);
       }
       if (!(this.bundleInfo).equals(str)) {
          p0.writeString(9, this.bundleInfo);
       }
       if (!(this.ext).equals(str)) {
          p0.writeString(10, this.ext);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(11, this.bizType);
       }
       super.writeTo(p0);
       return;
    }
}
