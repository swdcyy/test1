package com.kuaishou.livestream.message.nano.SCLivePopularityRankImpetusPendant;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LivePopularityRankImpetusPendantFrameInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantUnfold;
import com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantFold;

public final class SCLivePopularityRankImpetusPendant extends MessageNano	// class@001434
{
    public int actionCode;
    public boolean clickClose;
    public String extraClientLog;
    public UserInfos$PicUrl[] foldArrowUrl;
    public boolean foldDisable;
    public UserInfos$PicUrl[] frameFoldBackgroundPicUrl;
    public LivePopularityRankImpetusPendantFrameInfo[] frameInfo;
    public long frameIntervalMs;
    public UserInfos$PicUrl[] frameUnfoldBackgroundPicUrl;
    public int initFoldStatus;
    public boolean lastPendantDelete;
    public long pendantEndTs;
    public PopularityRankImpetusPendantFold pendantFold;
    public PopularityRankImpetusPendantUnfold pendantUnfold;
    public long unfoldDurationMs;
    public String waitCountDownColor;
    public long waitCountEndTs;
    public static SCLivePopularityRankImpetusPendant[] _emptyArray;

    public void SCLivePopularityRankImpetusPendant(){
       super();
       this.clear();
    }
    public static SCLivePopularityRankImpetusPendant[] emptyArray(){
       if (SCLivePopularityRankImpetusPendant._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLivePopularityRankImpetusPendant._emptyArray == null) {
             SCLivePopularityRankImpetusPendant[] sCLivePopula = new SCLivePopularityRankImpetusPendant[0];
             SCLivePopularityRankImpetusPendant._emptyArray = sCLivePopula;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLivePopularityRankImpetusPendant._emptyArray;
    }
    public static SCLivePopularityRankImpetusPendant parseFrom(CodedInputByteBufferNano p0){
       return new SCLivePopularityRankImpetusPendant().mergeFrom(p0);
    }
    public static SCLivePopularityRankImpetusPendant parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLivePopularityRankImpetusPendant(), p0);
    }
    public SCLivePopularityRankImpetusPendant clear(){
       this.actionCode = 0;
       this.pendantEndTs = 0;
       this.initFoldStatus = 0;
       this.pendantFold = null;
       this.pendantUnfold = null;
       this.foldArrowUrl = UserInfos$PicUrl.emptyArray();
       this.unfoldDurationMs = 0;
       this.waitCountEndTs = 0;
       this.waitCountDownColor = "";
       this.extraClientLog = "";
       this.frameInfo = LivePopularityRankImpetusPendantFrameInfo.emptyArray();
       this.frameIntervalMs = 0;
       this.foldDisable = false;
       this.clickClose = false;
       this.frameFoldBackgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.frameUnfoldBackgroundPicUrl = UserInfos$PicUrl.emptyArray();
       this.lastPendantDelete = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCLivePopularityRankImpetusPendant tfoldArrowUr;
       object oobject;
       int i = super.computeSerializedSize();
       SCLivePopularityRankImpetusPendant tactionCode = this.actionCode;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tactionCode);
       }
       tactionCode = this.pendantEndTs;
       SCLivePopularityRankImpetusPendant sCLivePopula = null;
       if (tactionCode - sCLivePopula) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tactionCode);
       }
       tactionCode = this.initFoldStatus;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tactionCode);
       }
       tactionCode = this.pendantFold;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tactionCode);
       }
       tactionCode = this.pendantUnfold;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tactionCode);
       }
       tactionCode = this.foldArrowUrl;
       int i1 = 0;
       if (tactionCode != null && tactionCode.length > 0) {
          i2 = 0;
          tfoldArrowUr = this.foldArrowUrl;
          while (i2 < tfoldArrowUr.length) {
             oobject = tfoldArrowUr[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tfoldArrowUr = this.unfoldDurationMs;
       if (tfoldArrowUr - sCLivePopula) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(7, tfoldArrowUr);
       }
       tfoldArrowUr = this.waitCountEndTs;
       if (tfoldArrowUr - sCLivePopula) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(8, tfoldArrowUr);
       }
       String str = "";
       if (!(this.waitCountDownColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.waitCountDownColor);
       }
       if (!(this.extraClientLog).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.extraClientLog);
       }
       tactionCode = this.frameInfo;
       if (tactionCode != null && tactionCode.length > 0) {
          i2 = 0;
          tfoldArrowUr = this.frameInfo;
          while (i2 < tfoldArrowUr.length) {
             oobject = tfoldArrowUr[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tfoldArrowUr = this.frameIntervalMs;
       if (tfoldArrowUr - sCLivePopula) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(12, tfoldArrowUr);
       }
       tactionCode = this.foldDisable;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tactionCode);
       }
       tactionCode = this.clickClose;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, tactionCode);
       }
       tactionCode = this.frameFoldBackgroundPicUrl;
       if (tactionCode != null && tactionCode.length > 0) {
          i2 = 0;
          sCLivePopula = this.frameFoldBackgroundPicUrl;
          while (i2 < sCLivePopula.length) {
             object oobject1 = sCLivePopula[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(15, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tactionCode = this.frameUnfoldBackgroundPicUrl;
       if (tactionCode != null && tactionCode.length > 0) {
          tactionCode = this.frameUnfoldBackgroundPicUrl;
          while (i1 < tactionCode.length) {
             object oobject2 = tactionCode[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(16, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       tactionCode = this.lastPendantDelete;
       if (tactionCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(17, tactionCode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLivePopularityRankImpetusPendant mergeFrom(CodedInputByteBufferNano p0){
       SCLivePopularityRankImpetusPendant tfoldArrowUr;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.actionCode = p0.readInt32();
                break;
              case 16:
                this.pendantEndTs = p0.readInt64();
                break;
              case 24:
                this.initFoldStatus = p0.readInt32();
                break;
              case '"':
                if (this.pendantFold == null) {
                   this.pendantFold = new PopularityRankImpetusPendantFold();
                }
                p0.readMessage(this.pendantFold);
                break;
              case '*':
                if (this.pendantUnfold == null) {
                   this.pendantUnfold = new PopularityRankImpetusPendantUnfold();
                }
                p0.readMessage(this.pendantUnfold);
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                tfoldArrowUr = this.foldArrowUrl;
                i2 = (tfoldArrowUr == null)? 0: tfoldArrowUr.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tfoldArrowUr, i1, picUrlArray, i1, i2);
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
                this.foldArrowUrl = picUrlArray;
                break;
              case '8':
                this.unfoldDurationMs = p0.readInt64();
                break;
              case '@':
                this.waitCountEndTs = p0.readInt64();
                break;
              case 'J':
                this.waitCountDownColor = p0.readString();
                break;
              case 'R':
                this.extraClientLog = p0.readString();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tfoldArrowUr = this.frameInfo;
                i2 = (tfoldArrowUr == null)? 0: tfoldArrowUr.length;
                i = i + i2;
                LivePopularityRankImpetusPendantFrameInfo[] livePopulari = new LivePopularityRankImpetusPendantFrameInfo[i];
                if (i2) {
                   System.arraycopy(tfoldArrowUr, i1, livePopulari, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   livePopulari[i2] = new LivePopularityRankImpetusPendantFrameInfo();
                   p0.readMessage(livePopulari[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                livePopulari[i2] = new LivePopularityRankImpetusPendantFrameInfo();
                p0.readMessage(livePopulari[i2]);
                this.frameInfo = livePopulari;
                break;
              case '`':
                this.frameIntervalMs = p0.readInt64();
                break;
              case 'h':
                this.foldDisable = p0.readBool();
                break;
              case 'p':
                this.clickClose = p0.readBool();
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                tfoldArrowUr = this.frameFoldBackgroundPicUrl;
                i2 = (tfoldArrowUr == null)? 0: tfoldArrowUr.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tfoldArrowUr, i1, picUrlArray, i1, i2);
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
                this.frameFoldBackgroundPicUrl = picUrlArray;
                break;
              case 130:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 130);
                tfoldArrowUr = this.frameUnfoldBackgroundPicUrl;
                i2 = (tfoldArrowUr == null)? 0: tfoldArrowUr.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tfoldArrowUr, i1, picUrlArray, i1, i2);
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
                this.frameUnfoldBackgroundPicUrl = picUrlArray;
                break;
              case 136:
                this.lastPendantDelete = p0.readBool();
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
       SCLivePopularityRankImpetusPendant tfoldArrowUr;
       object oobject;
       SCLivePopularityRankImpetusPendant tactionCode = this.actionCode;
       if (tactionCode != null) {
          p0.writeInt32(1, tactionCode);
       }
       tactionCode = this.pendantEndTs;
       SCLivePopularityRankImpetusPendant sCLivePopula = null;
       if (tactionCode - sCLivePopula) {
          p0.writeInt64(2, tactionCode);
       }
       tactionCode = this.initFoldStatus;
       if (tactionCode != null) {
          p0.writeInt32(3, tactionCode);
       }
       tactionCode = this.pendantFold;
       if (tactionCode != null) {
          p0.writeMessage(4, tactionCode);
       }
       tactionCode = this.pendantUnfold;
       if (tactionCode != null) {
          p0.writeMessage(5, tactionCode);
       }
       tactionCode = this.foldArrowUrl;
       int i = 0;
       if (tactionCode != null && tactionCode.length > 0) {
          i1 = 0;
          tfoldArrowUr = this.foldArrowUrl;
          while (i1 < tfoldArrowUr.length) {
             oobject = tfoldArrowUr[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tfoldArrowUr = this.unfoldDurationMs;
       if (tfoldArrowUr - sCLivePopula) {
          p0.writeInt64(7, tfoldArrowUr);
       }
       tfoldArrowUr = this.waitCountEndTs;
       if (tfoldArrowUr - sCLivePopula) {
          p0.writeInt64(8, tfoldArrowUr);
       }
       String str = "";
       if (!(this.waitCountDownColor).equals(str)) {
          p0.writeString(9, this.waitCountDownColor);
       }
       if (!(this.extraClientLog).equals(str)) {
          p0.writeString(10, this.extraClientLog);
       }
       tactionCode = this.frameInfo;
       if (tactionCode != null && tactionCode.length > 0) {
          i1 = 0;
          tfoldArrowUr = this.frameInfo;
          while (i1 < tfoldArrowUr.length) {
             oobject = tfoldArrowUr[i1];
             if (oobject != null) {
                p0.writeMessage(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tfoldArrowUr = this.frameIntervalMs;
       if (tfoldArrowUr - sCLivePopula) {
          p0.writeInt64(12, tfoldArrowUr);
       }
       tactionCode = this.foldDisable;
       if (tactionCode != null) {
          p0.writeBool(13, tactionCode);
       }
       tactionCode = this.clickClose;
       if (tactionCode != null) {
          p0.writeBool(14, tactionCode);
       }
       tactionCode = this.frameFoldBackgroundPicUrl;
       if (tactionCode != null && tactionCode.length > 0) {
          i1 = 0;
          sCLivePopula = this.frameFoldBackgroundPicUrl;
          while (i1 < sCLivePopula.length) {
             object oobject1 = sCLivePopula[i1];
             if (oobject1 != null) {
                p0.writeMessage(15, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tactionCode = this.frameUnfoldBackgroundPicUrl;
       if (tactionCode != null && tactionCode.length > 0) {
          tactionCode = this.frameUnfoldBackgroundPicUrl;
          while (i < tactionCode.length) {
             object oobject2 = tactionCode[i];
             if (oobject2 != null) {
                p0.writeMessage(16, oobject2);
             }
             i = i + 1;
          }
       }
       tactionCode = this.lastPendantDelete;
       if (tactionCode != null) {
          p0.writeBool(17, tactionCode);
       }
       super.writeTo(p0);
       return;
    }
}
