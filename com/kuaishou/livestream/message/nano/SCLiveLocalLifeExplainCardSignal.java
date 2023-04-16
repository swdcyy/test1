package com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.SCLiveLocalLifeExplainCardPromotionStageInfo;
import com.kuaishou.livestream.message.nano.ItemBizTag;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveLocalLifeExplainCardSignal extends MessageNano	// class@00142e
{
    public String actionUrl;
    public String anchorUrl;
    public String audienceUrl;
    public String authorRole;
    public String bizDataId;
    public String bizId;
    public String bizType;
    public long breakUpTime;
    public String bundleInfo;
    public String buttonText;
    public boolean closeAudienceExplainForever;
    public String ext;
    public UserInfos$PicUrl[] icon;
    public String priceText;
    public String productId;
    public long promotionId;
    public long promotionStageIdx;
    public SCLiveLocalLifeExplainCardPromotionStageInfo[] promotionStages;
    public long promotionTemplateId;
    public int queryApiType;
    public boolean showClose;
    public int signalType;
    public String source;
    public boolean stateButtonClickStatus;
    public String stateText;
    public String subTitle;
    public String symbol;
    public ItemBizTag[] tagList;
    public String title;
    public UserInfos$PicUrl[] topLeftIcon;
    public UserInfos$PicUrl[] topLeftIconSecond;
    public int topLeftStyle;
    public String topLeftTips;
    public String topLeftTipsSecond;
    public String traceTag;
    public static SCLiveLocalLifeExplainCardSignal[] _emptyArray;

    public void SCLiveLocalLifeExplainCardSignal(){
       super();
       this.clear();
    }
    public static SCLiveLocalLifeExplainCardSignal[] emptyArray(){
       if (SCLiveLocalLifeExplainCardSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveLocalLifeExplainCardSignal._emptyArray == null) {
             SCLiveLocalLifeExplainCardSignal[] sCLiveLocalL = new SCLiveLocalLifeExplainCardSignal[0];
             SCLiveLocalLifeExplainCardSignal._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveLocalLifeExplainCardSignal._emptyArray;
    }
    public static SCLiveLocalLifeExplainCardSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveLocalLifeExplainCardSignal().mergeFrom(p0);
    }
    public static SCLiveLocalLifeExplainCardSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveLocalLifeExplainCardSignal(), p0);
    }
    public SCLiveLocalLifeExplainCardSignal clear(){
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
       this.subTitle = "";
       this.symbol = "";
       this.productId = "";
       this.closeAudienceExplainForever = false;
       this.bizId = "";
       this.priceText = "";
       this.stateText = "";
       this.source = "";
       this.anchorUrl = "";
       this.audienceUrl = "";
       this.topLeftTipsSecond = "";
       this.topLeftIconSecond = UserInfos$PicUrl.emptyArray();
       this.topLeftStyle = 0;
       this.queryApiType = 0;
       this.promotionStages = SCLiveLocalLifeExplainCardPromotionStageInfo.emptyArray();
       this.promotionStageIdx = 0;
       this.bizDataId = "";
       this.authorRole = "";
       this.promotionId = 0;
       this.promotionTemplateId = 0;
       this.traceTag = "";
       this.tagList = ItemBizTag.emptyArray();
       this.breakUpTime = 0;
       this.stateButtonClickStatus = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       SCLiveLocalLifeExplainCardSignal ticon;
       object oobject;
       int i = super.computeSerializedSize();
       SCLiveLocalLifeExplainCardSignal tsignalType = this.signalType;
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
          i2 = 0;
          ticon = this.icon;
          while (i2 < ticon.length) {
             oobject = ticon[i2];
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
          i2 = 0;
          ticon = this.topLeftIcon;
          while (i2 < ticon.length) {
             oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
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
       if (!(this.subTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.subTitle);
       }
       if (!(this.symbol).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.symbol);
       }
       if (!(this.productId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.productId);
       }
       tsignalType = this.closeAudienceExplainForever;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tsignalType);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(16, this.bizId);
       }
       if (!(this.priceText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.priceText);
       }
       if (!(this.stateText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.stateText);
       }
       if (!(this.source).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.source);
       }
       if (!(this.anchorUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.anchorUrl);
       }
       if (!(this.audienceUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.audienceUrl);
       }
       if (!(this.topLeftTipsSecond).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.topLeftTipsSecond);
       }
       tsignalType = this.topLeftIconSecond;
       if (tsignalType != null && tsignalType.length > 0) {
          i2 = 0;
          ticon = this.topLeftIconSecond;
          while (i2 < ticon.length) {
             oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(23, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tsignalType = this.topLeftStyle;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(24, tsignalType);
       }
       tsignalType = this.queryApiType;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(29, tsignalType);
       }
       tsignalType = this.promotionStages;
       if (tsignalType != null && tsignalType.length > 0) {
          i2 = 0;
          ticon = this.promotionStages;
          while (i2 < ticon.length) {
             oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(30, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ticon = this.promotionStageIdx;
       if (ticon) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(31, ticon);
       }
       if (!(this.bizDataId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.bizDataId);
       }
       if (!(this.authorRole).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(33, this.authorRole);
       }
       ticon = this.promotionId;
       if (ticon) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(34, ticon);
       }
       ticon = this.promotionTemplateId;
       if (ticon) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(35, ticon);
       }
       if (!(this.traceTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(36, this.traceTag);
       }
       tsignalType = this.tagList;
       if (tsignalType != null && tsignalType.length > 0) {
          tsignalType = this.tagList;
          while (i1 < tsignalType.length) {
             object oobject1 = tsignalType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(37, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tsignalType = this.breakUpTime;
       if (tsignalType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(38, tsignalType);
       }
       tsignalType = this.stateButtonClickStatus;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(39, tsignalType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveLocalLifeExplainCardSignal mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       UserInfos$PicUrl[] picUrlArray;
       int i2;
       while (true) {
          int i = p0.readTag();
          SCLiveLocalLifeExplainCardSignal sCLiveLocalL = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != sCLiveLocalL && i != 2)) {
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
                sCLiveLocalL = this.icon;
                i1 = (sCLiveLocalL == null)? 0: sCLiveLocalL.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(sCLiveLocalL, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
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
                sCLiveLocalL = this.topLeftIcon;
                i1 = (sCLiveLocalL == null)? 0: sCLiveLocalL.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(sCLiveLocalL, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
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
              case 'b':
                this.subTitle = p0.readString();
                break;
              case 'j':
                this.symbol = p0.readString();
                break;
              case 'r':
                this.productId = p0.readString();
                break;
              case 'x':
                this.closeAudienceExplainForever = p0.readBool();
                break;
              case 130:
                this.bizId = p0.readString();
                break;
              case 138:
                this.priceText = p0.readString();
                break;
              case 146:
                this.stateText = p0.readString();
                break;
              case 154:
                this.source = p0.readString();
                break;
              case 162:
                this.anchorUrl = p0.readString();
                break;
              case 170:
                this.audienceUrl = p0.readString();
                break;
              case 178:
                this.topLeftTipsSecond = p0.readString();
                break;
              case 186:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 186);
                sCLiveLocalL = this.topLeftIconSecond;
                i1 = (sCLiveLocalL == null)? 0: sCLiveLocalL.length;
                i = i + i1;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i1) {
                   System.arraycopy(sCLiveLocalL, 0, picUrlArray, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   picUrlArray[i1] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                picUrlArray[i1] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i1]);
                this.topLeftIconSecond = picUrlArray;
                break;
              case 192:
                i = p0.readInt32();
                if (i && i != sCLiveLocalL) {
                   continue ;
                }else {
                   this.topLeftStyle = i;
                }
                break;
              case 232:
                this.queryApiType = p0.readInt32();
                break;
              case 242:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 242);
                sCLiveLocalL = this.promotionStages;
                i1 = (sCLiveLocalL == null)? 0: sCLiveLocalL.length;
                i = i + i1;
                SCLiveLocalLifeExplainCardPromotionStageInfo[] sCLiveLocalL1 = new SCLiveLocalLifeExplainCardPromotionStageInfo[i];
                if (i1) {
                   System.arraycopy(sCLiveLocalL, 0, sCLiveLocalL1, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   sCLiveLocalL1[i1] = new SCLiveLocalLifeExplainCardPromotionStageInfo();
                   p0.readMessage(sCLiveLocalL1[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                sCLiveLocalL1[i1] = new SCLiveLocalLifeExplainCardPromotionStageInfo();
                p0.readMessage(sCLiveLocalL1[i1]);
                this.promotionStages = sCLiveLocalL1;
                break;
              case 248:
                this.promotionStageIdx = p0.readUInt64();
                break;
              case 258:
                this.bizDataId = p0.readString();
                break;
              case 266:
                this.authorRole = p0.readString();
                break;
              case 272:
                this.promotionId = p0.readUInt64();
                break;
              case 280:
                this.promotionTemplateId = p0.readUInt64();
                break;
              case 290:
                this.traceTag = p0.readString();
                break;
              case 298:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 298);
                sCLiveLocalL = this.tagList;
                i1 = (sCLiveLocalL == null)? 0: sCLiveLocalL.length;
                i = i + i1;
                ItemBizTag[] itemBizTagAr = new ItemBizTag[i];
                if (i1) {
                   System.arraycopy(sCLiveLocalL, 0, itemBizTagAr, 0, i1);
                }
                i2 = i - 1;
                while (i1 < i2) {
                   itemBizTagAr[i1] = new ItemBizTag();
                   p0.readMessage(itemBizTagAr[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                itemBizTagAr[i1] = new ItemBizTag();
                p0.readMessage(itemBizTagAr[i1]);
                this.tagList = itemBizTagAr;
                break;
              case 304:
                this.breakUpTime = p0.readUInt64();
                break;
              case 312:
                this.stateButtonClickStatus = p0.readBool();
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
       SCLiveLocalLifeExplainCardSignal ticon;
       object oobject;
       SCLiveLocalLifeExplainCardSignal tsignalType = this.signalType;
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
          i1 = 0;
          ticon = this.icon;
          while (i1 < ticon.length) {
             oobject = ticon[i1];
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
          i1 = 0;
          ticon = this.topLeftIcon;
          while (i1 < ticon.length) {
             oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
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
       if (!(this.subTitle).equals(str)) {
          p0.writeString(12, this.subTitle);
       }
       if (!(this.symbol).equals(str)) {
          p0.writeString(13, this.symbol);
       }
       if (!(this.productId).equals(str)) {
          p0.writeString(14, this.productId);
       }
       tsignalType = this.closeAudienceExplainForever;
       if (tsignalType != null) {
          p0.writeBool(15, tsignalType);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(16, this.bizId);
       }
       if (!(this.priceText).equals(str)) {
          p0.writeString(17, this.priceText);
       }
       if (!(this.stateText).equals(str)) {
          p0.writeString(18, this.stateText);
       }
       if (!(this.source).equals(str)) {
          p0.writeString(19, this.source);
       }
       if (!(this.anchorUrl).equals(str)) {
          p0.writeString(20, this.anchorUrl);
       }
       if (!(this.audienceUrl).equals(str)) {
          p0.writeString(21, this.audienceUrl);
       }
       if (!(this.topLeftTipsSecond).equals(str)) {
          p0.writeString(22, this.topLeftTipsSecond);
       }
       tsignalType = this.topLeftIconSecond;
       if (tsignalType != null && tsignalType.length > 0) {
          i1 = 0;
          ticon = this.topLeftIconSecond;
          while (i1 < ticon.length) {
             oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(23, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tsignalType = this.topLeftStyle;
       if (tsignalType != null) {
          p0.writeInt32(24, tsignalType);
       }
       tsignalType = this.queryApiType;
       if (tsignalType != null) {
          p0.writeInt32(29, tsignalType);
       }
       tsignalType = this.promotionStages;
       if (tsignalType != null && tsignalType.length > 0) {
          i1 = 0;
          ticon = this.promotionStages;
          while (i1 < ticon.length) {
             oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(30, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ticon = this.promotionStageIdx;
       if (ticon) {
          p0.writeUInt64(31, ticon);
       }
       if (!(this.bizDataId).equals(str)) {
          p0.writeString(32, this.bizDataId);
       }
       if (!(this.authorRole).equals(str)) {
          p0.writeString(33, this.authorRole);
       }
       ticon = this.promotionId;
       if (ticon) {
          p0.writeUInt64(34, ticon);
       }
       ticon = this.promotionTemplateId;
       if (ticon) {
          p0.writeUInt64(35, ticon);
       }
       if (!(this.traceTag).equals(str)) {
          p0.writeString(36, this.traceTag);
       }
       tsignalType = this.tagList;
       if (tsignalType != null && tsignalType.length > 0) {
          tsignalType = this.tagList;
          while (i < tsignalType.length) {
             object oobject1 = tsignalType[i];
             if (oobject1 != null) {
                p0.writeMessage(37, oobject1);
             }
             i = i + 1;
          }
       }
       tsignalType = this.breakUpTime;
       if (tsignalType) {
          p0.writeUInt64(38, tsignalType);
       }
       tsignalType = this.stateButtonClickStatus;
       if (tsignalType != null) {
          p0.writeBool(39, tsignalType);
       }
       super.writeTo(p0);
       return;
    }
}
