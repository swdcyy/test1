package com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$SCRedPackRainResource;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPicture;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainPrizePic;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainButton;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainText;

public final class LiveRedPackRainMessage$SCRedPackRainResource extends MessageNano	// class@001275
{
    public long animateMagicFaceId;
    public LiveRedPackRainMessage$RedPackRainPicture animateSponsorRedPackPic;
    public LiveRedPackRainMessage$RedPackRainPicture animateSponsorTitlePic;
    public LiveRedPackRainMessage$RedPackRainText countDownText;
    public LiveRedPackRainMessage$RedPackRainPicture grabPopAnimateRedPackPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabPopAnimateStarPic;
    public LiveRedPackRainMessage$RedPackRainButton grabPopCountDownButton;
    public LiveRedPackRainMessage$RedPackRainPicture grabPopCoverBottomPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabPopCoverTopPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabPopGrabPic;
    public LiveRedPackRainMessage$RedPackRainButton grabPopReserveButton;
    public LiveRedPackRainMessage$RedPackRainButton grabPopRuleButton;
    public LiveRedPackRainMessage$RedPackRainText grabPopUnopenedSubtitleText;
    public LiveRedPackRainMessage$RedPackRainPicture grabPopUnopenedTitlePic;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultBackGroundPic;
    public LiveRedPackRainMessage$RedPackRainText grabResultBottomKscoinText;
    public LiveRedPackRainMessage$RedPackRainText grabResultBottomPrizeText;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultCardPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultCoverBottomPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultHeadFrame;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultKoiBackgroundPic;
    public LiveRedPackRainMessage$RedPackRainButton grabResultKoiButton;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultKoiCardPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultKoiCoverBottomPic;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultKoiPic;
    public LiveRedPackRainMessage$RedPackRainButton grabResultKoiReceiveButton;
    public LiveRedPackRainMessage$RedPackRainButton grabResultKoiShareButton;
    public String grabResultKoiSummaryTextColor;
    public LiveRedPackRainMessage$RedPackRainPicture grabResultMissPic;
    public String grabResultMissTextColor;
    public LiveRedPackRainMessage$RedPackRainButton grabResultReceiveButton;
    public LiveRedPackRainMessage$RedPackRainButton grabResultShareButton;
    public LiveRedPackRainMessage$RedPackRainText grabResultSponsorText;
    public String grabResultSummaryTextColor;
    public String grabResultTextColor;
    public long maxDelayRequestMillis;
    public LiveRedPackRainMessage$RedPackRainPrizePic[] prizePic;
    public String redPackRainId;
    public String redPackRainResourceId;
    public LiveRedPackRainMessage$RedPackRainPicture[] rewardPic;
    public long time;
    public boolean widgetAutoPop;
    public LiveRedPackRainMessage$RedPackRainPicture widgetBackGroupPic;
    public LiveRedPackRainMessage$RedPackRainPicture widgetBackgroundPic;
    public LiveRedPackRainMessage$RedPackRainPicture widgetBackgroundPicV2;
    public LiveRedPackRainMessage$RedPackRainButton widgetButton;
    public LiveRedPackRainMessage$RedPackRainText widgetDefaultText;
    public LiveRedPackRainMessage$RedPackRainPicture widgetLottieJson;
    public LiveRedPackRainMessage$RedPackRainPicture widgetLottiePic;
    public LiveRedPackRainMessage$RedPackRainButton widgetPopRuleButton;
    public LiveRedPackRainMessage$RedPackRainPicture widgetPopupPic;
    public LiveRedPackRainMessage$RedPackRainButton widgetPopupShareButton;
    public String widgetTextColor;
    public static LiveRedPackRainMessage$SCRedPackRainResource[] _emptyArray;

    public void LiveRedPackRainMessage$SCRedPackRainResource(){
       super();
       this.clear();
    }
    public static LiveRedPackRainMessage$SCRedPackRainResource[] emptyArray(){
       if (LiveRedPackRainMessage$SCRedPackRainResource._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackRainMessage$SCRedPackRainResource._emptyArray == null) {
             LiveRedPackRainMessage$SCRedPackRainResource[] sCRedPackRai = new LiveRedPackRainMessage$SCRedPackRainResource[0];
             LiveRedPackRainMessage$SCRedPackRainResource._emptyArray = sCRedPackRai;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackRainMessage$SCRedPackRainResource._emptyArray;
    }
    public static LiveRedPackRainMessage$SCRedPackRainResource parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackRainMessage$SCRedPackRainResource().mergeFrom(p0);
    }
    public static LiveRedPackRainMessage$SCRedPackRainResource parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackRainMessage$SCRedPackRainResource(), p0);
    }
    public LiveRedPackRainMessage$SCRedPackRainResource clear(){
       this.widgetPopupPic = null;
       this.widgetPopupShareButton = null;
       this.widgetPopRuleButton = null;
       this.widgetAutoPop = false;
       this.widgetBackGroupPic = null;
       this.widgetDefaultText = null;
       this.rewardPic = LiveRedPackRainMessage$RedPackRainPicture.emptyArray();
       this.countDownText = null;
       this.grabResultBackGroundPic = null;
       this.grabResultHeadFrame = null;
       this.grabResultKoiPic = null;
       this.grabResultSponsorText = null;
       this.grabResultReceiveButton = null;
       this.grabResultTextColor = "";
       this.grabResultShareButton = null;
       this.grabResultKoiShareButton = null;
       this.grabResultBottomKscoinText = null;
       this.grabResultBottomPrizeText = null;
       this.grabResultKoiButton = null;
       this.redPackRainId = "";
       this.time = 0;
       this.maxDelayRequestMillis = 0;
       this.redPackRainResourceId = "";
       this.widgetLottiePic = null;
       this.widgetLottieJson = null;
       this.widgetButton = null;
       this.animateMagicFaceId = 0;
       this.animateSponsorTitlePic = null;
       this.animateSponsorRedPackPic = null;
       this.grabPopCoverTopPic = null;
       this.grabPopCoverBottomPic = null;
       this.grabPopAnimateStarPic = null;
       this.grabPopAnimateRedPackPic = null;
       this.grabPopUnopenedTitlePic = null;
       this.grabPopUnopenedSubtitleText = null;
       this.grabPopCountDownButton = null;
       this.grabPopReserveButton = null;
       this.grabPopGrabPic = null;
       this.grabPopRuleButton = null;
       this.grabResultCardPic = null;
       this.grabResultSummaryTextColor = "";
       this.grabResultKoiBackgroundPic = null;
       this.grabResultKoiCoverBottomPic = null;
       this.grabResultKoiCardPic = null;
       this.grabResultKoiReceiveButton = null;
       this.grabResultKoiSummaryTextColor = "";
       this.grabResultMissPic = null;
       this.grabResultMissTextColor = "";
       this.widgetBackgroundPic = null;
       this.widgetTextColor = "";
       this.grabResultCoverBottomPic = null;
       this.prizePic = LiveRedPackRainMessage$RedPackRainPrizePic.emptyArray();
       this.widgetBackgroundPicV2 = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackRainMessage$SCRedPackRainResource twidgetPopup = this.widgetPopupPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, twidgetPopup);
       }
       twidgetPopup = this.widgetPopupShareButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, twidgetPopup);
       }
       twidgetPopup = this.widgetPopRuleButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, twidgetPopup);
       }
       twidgetPopup = this.widgetAutoPop;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, twidgetPopup);
       }
       twidgetPopup = this.widgetBackGroupPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, twidgetPopup);
       }
       twidgetPopup = this.widgetDefaultText;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, twidgetPopup);
       }
       twidgetPopup = this.rewardPic;
       int i1 = 0;
       if (twidgetPopup != null && twidgetPopup.length > 0) {
          int i2 = 0;
          LiveRedPackRainMessage$SCRedPackRainResource trewardPic = this.rewardPic;
          while (i2 < trewardPic.length) {
             object oobject = trewardPic[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       twidgetPopup = this.countDownText;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, twidgetPopup);
       }
       twidgetPopup = this.grabResultBackGroundPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, twidgetPopup);
       }
       twidgetPopup = this.grabResultHeadFrame;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, twidgetPopup);
       }
       twidgetPopup = this.grabResultSponsorText;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, twidgetPopup);
       }
       twidgetPopup = this.grabResultReceiveButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, twidgetPopup);
       }
       String str = "";
       if (!(this.grabResultTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.grabResultTextColor);
       }
       twidgetPopup = this.grabResultShareButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiShareButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, twidgetPopup);
       }
       twidgetPopup = this.grabResultBottomKscoinText;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, twidgetPopup);
       }
       twidgetPopup = this.grabResultBottomPrizeText;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, twidgetPopup);
       }
       if (!(this.redPackRainId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.redPackRainId);
       }
       LiveRedPackRainMessage$SCRedPackRainResource ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(21, ttime);
       }
       ttime = this.maxDelayRequestMillis;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(22, ttime);
       }
       if (!(this.redPackRainResourceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.redPackRainResourceId);
       }
       twidgetPopup = this.widgetLottiePic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, twidgetPopup);
       }
       twidgetPopup = this.widgetLottieJson;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, twidgetPopup);
       }
       twidgetPopup = this.widgetButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(26, twidgetPopup);
       }
       ttime = this.animateMagicFaceId;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(27, ttime);
       }
       twidgetPopup = this.animateSponsorTitlePic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, twidgetPopup);
       }
       twidgetPopup = this.animateSponsorRedPackPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(29, twidgetPopup);
       }
       twidgetPopup = this.grabPopCoverTopPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, twidgetPopup);
       }
       twidgetPopup = this.grabPopCoverBottomPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(31, twidgetPopup);
       }
       twidgetPopup = this.grabPopAnimateStarPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(32, twidgetPopup);
       }
       twidgetPopup = this.grabPopAnimateRedPackPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(33, twidgetPopup);
       }
       twidgetPopup = this.grabPopUnopenedTitlePic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(34, twidgetPopup);
       }
       twidgetPopup = this.grabPopUnopenedSubtitleText;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(35, twidgetPopup);
       }
       twidgetPopup = this.grabPopCountDownButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(36, twidgetPopup);
       }
       twidgetPopup = this.grabPopReserveButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(37, twidgetPopup);
       }
       twidgetPopup = this.grabPopGrabPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(38, twidgetPopup);
       }
       twidgetPopup = this.grabPopRuleButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(39, twidgetPopup);
       }
       twidgetPopup = this.grabResultCardPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(40, twidgetPopup);
       }
       if (!(this.grabResultSummaryTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(41, this.grabResultSummaryTextColor);
       }
       twidgetPopup = this.grabResultKoiBackgroundPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(42, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiCoverBottomPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(43, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiCardPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(44, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiReceiveButton;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(45, twidgetPopup);
       }
       if (!(this.grabResultKoiSummaryTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(46, this.grabResultKoiSummaryTextColor);
       }
       twidgetPopup = this.grabResultMissPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(47, twidgetPopup);
       }
       if (!(this.grabResultMissTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(48, this.grabResultMissTextColor);
       }
       twidgetPopup = this.widgetBackgroundPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(49, twidgetPopup);
       }
       if (!(this.widgetTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(50, this.widgetTextColor);
       }
       twidgetPopup = this.grabResultCoverBottomPic;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(51, twidgetPopup);
       }
       twidgetPopup = this.prizePic;
       if (twidgetPopup != null && twidgetPopup.length > 0) {
          twidgetPopup = this.prizePic;
          while (i1 < twidgetPopup.length) {
             object oobject1 = twidgetPopup[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(52, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       twidgetPopup = this.widgetBackgroundPicV2;
       if (twidgetPopup != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(53, twidgetPopup);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackRainMessage$SCRedPackRainResource mergeFrom(CodedInputByteBufferNano p0){
       LiveRedPackRainMessage$SCRedPackRainResource trewardPic;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.widgetPopupPic == null) {
                   this.widgetPopupPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.widgetPopupPic);
                break;
              case 18:
                if (this.widgetPopupShareButton == null) {
                   this.widgetPopupShareButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.widgetPopupShareButton);
                break;
              case 26:
                if (this.widgetPopRuleButton == null) {
                   this.widgetPopRuleButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.widgetPopRuleButton);
                break;
              case 32:
                this.widgetAutoPop = p0.readBool();
                break;
              case '*':
                if (this.widgetBackGroupPic == null) {
                   this.widgetBackGroupPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.widgetBackGroupPic);
                break;
              case '2':
                if (this.widgetDefaultText == null) {
                   this.widgetDefaultText = new LiveRedPackRainMessage$RedPackRainText();
                }
                p0.readMessage(this.widgetDefaultText);
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                trewardPic = this.rewardPic;
                i2 = (trewardPic == null)? 0: trewardPic.length;
                i = i + i2;
                LiveRedPackRainMessage$RedPackRainPicture[] redPackRainP = new LiveRedPackRainMessage$RedPackRainPicture[i];
                if (i2) {
                   System.arraycopy(trewardPic, i1, redPackRainP, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   redPackRainP[i2] = new LiveRedPackRainMessage$RedPackRainPicture();
                   p0.readMessage(redPackRainP[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                redPackRainP[i2] = new LiveRedPackRainMessage$RedPackRainPicture();
                p0.readMessage(redPackRainP[i2]);
                this.rewardPic = redPackRainP;
                break;
              case 'B':
                if (this.countDownText == null) {
                   this.countDownText = new LiveRedPackRainMessage$RedPackRainText();
                }
                p0.readMessage(this.countDownText);
                break;
              case 'J':
                if (this.grabResultBackGroundPic == null) {
                   this.grabResultBackGroundPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultBackGroundPic);
                break;
              case 'R':
                if (this.grabResultHeadFrame == null) {
                   this.grabResultHeadFrame = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultHeadFrame);
                break;
              case 'Z':
                if (this.grabResultKoiPic == null) {
                   this.grabResultKoiPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultKoiPic);
                break;
              case 'b':
                if (this.grabResultSponsorText == null) {
                   this.grabResultSponsorText = new LiveRedPackRainMessage$RedPackRainText();
                }
                p0.readMessage(this.grabResultSponsorText);
                break;
              case 'j':
                if (this.grabResultReceiveButton == null) {
                   this.grabResultReceiveButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabResultReceiveButton);
                break;
              case 'r':
                this.grabResultTextColor = p0.readString();
                break;
              case 'z':
                if (this.grabResultShareButton == null) {
                   this.grabResultShareButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabResultShareButton);
                break;
              case 130:
                if (this.grabResultKoiShareButton == null) {
                   this.grabResultKoiShareButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabResultKoiShareButton);
                break;
              case 138:
                if (this.grabResultBottomKscoinText == null) {
                   this.grabResultBottomKscoinText = new LiveRedPackRainMessage$RedPackRainText();
                }
                p0.readMessage(this.grabResultBottomKscoinText);
                break;
              case 146:
                if (this.grabResultBottomPrizeText == null) {
                   this.grabResultBottomPrizeText = new LiveRedPackRainMessage$RedPackRainText();
                }
                p0.readMessage(this.grabResultBottomPrizeText);
                break;
              case 154:
                if (this.grabResultKoiButton == null) {
                   this.grabResultKoiButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabResultKoiButton);
                break;
              case 162:
                this.redPackRainId = p0.readString();
                break;
              case 168:
                this.time = p0.readUInt64();
                break;
              case 176:
                this.maxDelayRequestMillis = p0.readUInt64();
                break;
              case 186:
                this.redPackRainResourceId = p0.readString();
                break;
              case 194:
                if (this.widgetLottiePic == null) {
                   this.widgetLottiePic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.widgetLottiePic);
                break;
              case 202:
                if (this.widgetLottieJson == null) {
                   this.widgetLottieJson = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.widgetLottieJson);
                break;
              case 210:
                if (this.widgetButton == null) {
                   this.widgetButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.widgetButton);
                break;
              case 216:
                this.animateMagicFaceId = p0.readUInt64();
                break;
              case 226:
                if (this.animateSponsorTitlePic == null) {
                   this.animateSponsorTitlePic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.animateSponsorTitlePic);
                break;
              case 234:
                if (this.animateSponsorRedPackPic == null) {
                   this.animateSponsorRedPackPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.animateSponsorRedPackPic);
                break;
              case 242:
                if (this.grabPopCoverTopPic == null) {
                   this.grabPopCoverTopPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabPopCoverTopPic);
                break;
              case 250:
                if (this.grabPopCoverBottomPic == null) {
                   this.grabPopCoverBottomPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabPopCoverBottomPic);
                break;
              case 258:
                if (this.grabPopAnimateStarPic == null) {
                   this.grabPopAnimateStarPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabPopAnimateStarPic);
                break;
              case 266:
                if (this.grabPopAnimateRedPackPic == null) {
                   this.grabPopAnimateRedPackPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabPopAnimateRedPackPic);
                break;
              case 274:
                if (this.grabPopUnopenedTitlePic == null) {
                   this.grabPopUnopenedTitlePic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabPopUnopenedTitlePic);
                break;
              case 282:
                if (this.grabPopUnopenedSubtitleText == null) {
                   this.grabPopUnopenedSubtitleText = new LiveRedPackRainMessage$RedPackRainText();
                }
                p0.readMessage(this.grabPopUnopenedSubtitleText);
                break;
              case 290:
                if (this.grabPopCountDownButton == null) {
                   this.grabPopCountDownButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabPopCountDownButton);
                break;
              case 298:
                if (this.grabPopReserveButton == null) {
                   this.grabPopReserveButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabPopReserveButton);
                break;
              case 306:
                if (this.grabPopGrabPic == null) {
                   this.grabPopGrabPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabPopGrabPic);
                break;
              case 314:
                if (this.grabPopRuleButton == null) {
                   this.grabPopRuleButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabPopRuleButton);
                break;
              case 322:
                if (this.grabResultCardPic == null) {
                   this.grabResultCardPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultCardPic);
                break;
              case 330:
                this.grabResultSummaryTextColor = p0.readString();
                break;
              case 338:
                if (this.grabResultKoiBackgroundPic == null) {
                   this.grabResultKoiBackgroundPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultKoiBackgroundPic);
                break;
              case 346:
                if (this.grabResultKoiCoverBottomPic == null) {
                   this.grabResultKoiCoverBottomPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultKoiCoverBottomPic);
                break;
              case 354:
                if (this.grabResultKoiCardPic == null) {
                   this.grabResultKoiCardPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultKoiCardPic);
                break;
              case 362:
                if (this.grabResultKoiReceiveButton == null) {
                   this.grabResultKoiReceiveButton = new LiveRedPackRainMessage$RedPackRainButton();
                }
                p0.readMessage(this.grabResultKoiReceiveButton);
                break;
              case 370:
                this.grabResultKoiSummaryTextColor = p0.readString();
                break;
              case 378:
                if (this.grabResultMissPic == null) {
                   this.grabResultMissPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultMissPic);
                break;
              case 386:
                this.grabResultMissTextColor = p0.readString();
                break;
              case 394:
                if (this.widgetBackgroundPic == null) {
                   this.widgetBackgroundPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.widgetBackgroundPic);
                break;
              case 402:
                this.widgetTextColor = p0.readString();
                break;
              case 410:
                if (this.grabResultCoverBottomPic == null) {
                   this.grabResultCoverBottomPic = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.grabResultCoverBottomPic);
                break;
              case 418:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 418);
                trewardPic = this.prizePic;
                i2 = (trewardPic == null)? 0: trewardPic.length;
                i = i + i2;
                LiveRedPackRainMessage$RedPackRainPrizePic[] redPackRainP1 = new LiveRedPackRainMessage$RedPackRainPrizePic[i];
                if (i2) {
                   System.arraycopy(trewardPic, i1, redPackRainP1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   redPackRainP1[i2] = new LiveRedPackRainMessage$RedPackRainPrizePic();
                   p0.readMessage(redPackRainP1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                redPackRainP1[i2] = new LiveRedPackRainMessage$RedPackRainPrizePic();
                p0.readMessage(redPackRainP1[i2]);
                this.prizePic = redPackRainP1;
                break;
              case 426:
                if (this.widgetBackgroundPicV2 == null) {
                   this.widgetBackgroundPicV2 = new LiveRedPackRainMessage$RedPackRainPicture();
                }
                p0.readMessage(this.widgetBackgroundPicV2);
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
       LiveRedPackRainMessage$SCRedPackRainResource twidgetPopup = this.widgetPopupPic;
       if (twidgetPopup != null) {
          p0.writeMessage(1, twidgetPopup);
       }
       twidgetPopup = this.widgetPopupShareButton;
       if (twidgetPopup != null) {
          p0.writeMessage(2, twidgetPopup);
       }
       twidgetPopup = this.widgetPopRuleButton;
       if (twidgetPopup != null) {
          p0.writeMessage(3, twidgetPopup);
       }
       twidgetPopup = this.widgetAutoPop;
       if (twidgetPopup != null) {
          p0.writeBool(4, twidgetPopup);
       }
       twidgetPopup = this.widgetBackGroupPic;
       if (twidgetPopup != null) {
          p0.writeMessage(5, twidgetPopup);
       }
       twidgetPopup = this.widgetDefaultText;
       if (twidgetPopup != null) {
          p0.writeMessage(6, twidgetPopup);
       }
       twidgetPopup = this.rewardPic;
       int i = 0;
       if (twidgetPopup != null && twidgetPopup.length > 0) {
          int i1 = 0;
          LiveRedPackRainMessage$SCRedPackRainResource trewardPic = this.rewardPic;
          while (i1 < trewardPic.length) {
             object oobject = trewardPic[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       twidgetPopup = this.countDownText;
       if (twidgetPopup != null) {
          p0.writeMessage(8, twidgetPopup);
       }
       twidgetPopup = this.grabResultBackGroundPic;
       if (twidgetPopup != null) {
          p0.writeMessage(9, twidgetPopup);
       }
       twidgetPopup = this.grabResultHeadFrame;
       if (twidgetPopup != null) {
          p0.writeMessage(10, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiPic;
       if (twidgetPopup != null) {
          p0.writeMessage(11, twidgetPopup);
       }
       twidgetPopup = this.grabResultSponsorText;
       if (twidgetPopup != null) {
          p0.writeMessage(12, twidgetPopup);
       }
       twidgetPopup = this.grabResultReceiveButton;
       if (twidgetPopup != null) {
          p0.writeMessage(13, twidgetPopup);
       }
       String str = "";
       if (!(this.grabResultTextColor).equals(str)) {
          p0.writeString(14, this.grabResultTextColor);
       }
       twidgetPopup = this.grabResultShareButton;
       if (twidgetPopup != null) {
          p0.writeMessage(15, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiShareButton;
       if (twidgetPopup != null) {
          p0.writeMessage(16, twidgetPopup);
       }
       twidgetPopup = this.grabResultBottomKscoinText;
       if (twidgetPopup != null) {
          p0.writeMessage(17, twidgetPopup);
       }
       twidgetPopup = this.grabResultBottomPrizeText;
       if (twidgetPopup != null) {
          p0.writeMessage(18, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiButton;
       if (twidgetPopup != null) {
          p0.writeMessage(19, twidgetPopup);
       }
       if (!(this.redPackRainId).equals(str)) {
          p0.writeString(20, this.redPackRainId);
       }
       LiveRedPackRainMessage$SCRedPackRainResource ttime = this.time;
       if (ttime) {
          p0.writeUInt64(21, ttime);
       }
       ttime = this.maxDelayRequestMillis;
       if (ttime) {
          p0.writeUInt64(22, ttime);
       }
       if (!(this.redPackRainResourceId).equals(str)) {
          p0.writeString(23, this.redPackRainResourceId);
       }
       twidgetPopup = this.widgetLottiePic;
       if (twidgetPopup != null) {
          p0.writeMessage(24, twidgetPopup);
       }
       twidgetPopup = this.widgetLottieJson;
       if (twidgetPopup != null) {
          p0.writeMessage(25, twidgetPopup);
       }
       twidgetPopup = this.widgetButton;
       if (twidgetPopup != null) {
          p0.writeMessage(26, twidgetPopup);
       }
       ttime = this.animateMagicFaceId;
       if (ttime) {
          p0.writeUInt64(27, ttime);
       }
       twidgetPopup = this.animateSponsorTitlePic;
       if (twidgetPopup != null) {
          p0.writeMessage(28, twidgetPopup);
       }
       twidgetPopup = this.animateSponsorRedPackPic;
       if (twidgetPopup != null) {
          p0.writeMessage(29, twidgetPopup);
       }
       twidgetPopup = this.grabPopCoverTopPic;
       if (twidgetPopup != null) {
          p0.writeMessage(30, twidgetPopup);
       }
       twidgetPopup = this.grabPopCoverBottomPic;
       if (twidgetPopup != null) {
          p0.writeMessage(31, twidgetPopup);
       }
       twidgetPopup = this.grabPopAnimateStarPic;
       if (twidgetPopup != null) {
          p0.writeMessage(32, twidgetPopup);
       }
       twidgetPopup = this.grabPopAnimateRedPackPic;
       if (twidgetPopup != null) {
          p0.writeMessage(33, twidgetPopup);
       }
       twidgetPopup = this.grabPopUnopenedTitlePic;
       if (twidgetPopup != null) {
          p0.writeMessage(34, twidgetPopup);
       }
       twidgetPopup = this.grabPopUnopenedSubtitleText;
       if (twidgetPopup != null) {
          p0.writeMessage(35, twidgetPopup);
       }
       twidgetPopup = this.grabPopCountDownButton;
       if (twidgetPopup != null) {
          p0.writeMessage(36, twidgetPopup);
       }
       twidgetPopup = this.grabPopReserveButton;
       if (twidgetPopup != null) {
          p0.writeMessage(37, twidgetPopup);
       }
       twidgetPopup = this.grabPopGrabPic;
       if (twidgetPopup != null) {
          p0.writeMessage(38, twidgetPopup);
       }
       twidgetPopup = this.grabPopRuleButton;
       if (twidgetPopup != null) {
          p0.writeMessage(39, twidgetPopup);
       }
       twidgetPopup = this.grabResultCardPic;
       if (twidgetPopup != null) {
          p0.writeMessage(40, twidgetPopup);
       }
       if (!(this.grabResultSummaryTextColor).equals(str)) {
          p0.writeString(41, this.grabResultSummaryTextColor);
       }
       twidgetPopup = this.grabResultKoiBackgroundPic;
       if (twidgetPopup != null) {
          p0.writeMessage(42, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiCoverBottomPic;
       if (twidgetPopup != null) {
          p0.writeMessage(43, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiCardPic;
       if (twidgetPopup != null) {
          p0.writeMessage(44, twidgetPopup);
       }
       twidgetPopup = this.grabResultKoiReceiveButton;
       if (twidgetPopup != null) {
          p0.writeMessage(45, twidgetPopup);
       }
       if (!(this.grabResultKoiSummaryTextColor).equals(str)) {
          p0.writeString(46, this.grabResultKoiSummaryTextColor);
       }
       twidgetPopup = this.grabResultMissPic;
       if (twidgetPopup != null) {
          p0.writeMessage(47, twidgetPopup);
       }
       if (!(this.grabResultMissTextColor).equals(str)) {
          p0.writeString(48, this.grabResultMissTextColor);
       }
       twidgetPopup = this.widgetBackgroundPic;
       if (twidgetPopup != null) {
          p0.writeMessage(49, twidgetPopup);
       }
       if (!(this.widgetTextColor).equals(str)) {
          p0.writeString(50, this.widgetTextColor);
       }
       twidgetPopup = this.grabResultCoverBottomPic;
       if (twidgetPopup != null) {
          p0.writeMessage(51, twidgetPopup);
       }
       twidgetPopup = this.prizePic;
       if (twidgetPopup != null && twidgetPopup.length > 0) {
          twidgetPopup = this.prizePic;
          while (i < twidgetPopup.length) {
             object oobject1 = twidgetPopup[i];
             if (oobject1 != null) {
                p0.writeMessage(52, oobject1);
             }
             i = i + 1;
          }
       }
       twidgetPopup = this.widgetBackgroundPicV2;
       if (twidgetPopup != null) {
          p0.writeMessage(53, twidgetPopup);
       }
       super.writeTo(p0);
       return;
    }
}
