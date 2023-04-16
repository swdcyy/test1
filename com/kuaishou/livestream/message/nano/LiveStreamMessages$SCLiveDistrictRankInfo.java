package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveDistrictDisplayRankHintInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveDistrictBenefitDisplayInfo;

public final class LiveStreamMessages$SCLiveDistrictRankInfo extends MessageNano	// class@001346
{
    public String aggregationDisplayName;
    public String aggregationDisplayRank;
    public boolean aggregationInRank;
    public String[] aggregationPendantColor;
    public int aggregationRank;
    public int aggregationRankType;
    public boolean aggregationShowRank;
    public LiveStreamMessages$LiveDistrictBenefitDisplayInfo benefitDisplayInfo;
    public String cityDisplayRank;
    public String[] cityPendantColor;
    public String cityRankName;
    public long currentTimestamp;
    public String displayNotInTop;
    public String displayRank;
    public String displayRankHint;
    public String displayRankName;
    public String[] districtPendantColor;
    public LiveStreamMessages$LiveDistrictDisplayRankHintInfo districtRankHintInfo;
    public String globalDisplayRank;
    public String[] globalPendantColor;
    public int globalRank;
    public String globalRankHint;
    public LiveStreamMessages$LiveDistrictDisplayRankHintInfo globalRankHintInfo;
    public String globalRankName;
    public boolean isDisplayBenefitInfo;
    public boolean isInCityRank;
    public boolean isInGlobalRank;
    public boolean isInRank;
    public boolean isInTop;
    public String liveStreamId;
    public int priority;
    public int rank;
    public String rankHint;
    public String rankName;
    public static LiveStreamMessages$SCLiveDistrictRankInfo[] _emptyArray;

    public void LiveStreamMessages$SCLiveDistrictRankInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveDistrictRankInfo[] emptyArray(){
       if (LiveStreamMessages$SCLiveDistrictRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveDistrictRankInfo._emptyArray == null) {
             LiveStreamMessages$SCLiveDistrictRankInfo[] sCLiveDistri = new LiveStreamMessages$SCLiveDistrictRankInfo[0];
             LiveStreamMessages$SCLiveDistrictRankInfo._emptyArray = sCLiveDistri;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveDistrictRankInfo._emptyArray;
    }
    public static LiveStreamMessages$SCLiveDistrictRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveDistrictRankInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveDistrictRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveDistrictRankInfo(), p0);
    }
    public LiveStreamMessages$SCLiveDistrictRankInfo clear(){
       this.liveStreamId = "";
       this.isInRank = false;
       this.rank = 0;
       this.rankName = "";
       this.rankHint = "";
       this.displayRank = "";
       this.displayRankName = "";
       this.displayRankHint = "";
       this.isInGlobalRank = false;
       this.globalDisplayRank = "";
       this.globalRankName = "";
       this.globalRankHint = "";
       this.isInTop = false;
       this.displayNotInTop = "";
       this.globalRank = 0;
       this.isDisplayBenefitInfo = false;
       this.benefitDisplayInfo = null;
       this.districtRankHintInfo = null;
       this.globalRankHintInfo = null;
       this.isInCityRank = false;
       this.cityDisplayRank = "";
       this.cityRankName = "";
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.globalPendantColor = eMPTY_STRING;
       this.districtPendantColor = eMPTY_STRING;
       this.cityPendantColor = eMPTY_STRING;
       this.aggregationInRank = false;
       this.aggregationDisplayRank = "";
       this.aggregationDisplayName = "";
       this.aggregationRankType = 0;
       this.aggregationPendantColor = eMPTY_STRING;
       this.priority = 0;
       this.currentTimestamp = 0;
       this.aggregationShowRank = false;
       this.aggregationRank = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i4;
       int i5;
       LiveStreamMessages$SCLiveDistrictRankInfo tglobalPenda;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveStreamMessages$SCLiveDistrictRankInfo tisInRank = this.isInRank;
       int i1 = 2;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, tisInRank);
       }
       tisInRank = this.rank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tisInRank);
       }
       if (!(this.rankName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.rankName);
       }
       if (!(this.rankHint).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.rankHint);
       }
       if (!(this.displayRank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.displayRank);
       }
       if (!(this.displayRankName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.displayRankName);
       }
       if (!(this.displayRankHint).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.displayRankHint);
       }
       tisInRank = this.isInGlobalRank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tisInRank);
       }
       if (!(this.globalDisplayRank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.globalDisplayRank);
       }
       if (!(this.globalRankName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.globalRankName);
       }
       if (!(this.globalRankHint).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.globalRankHint);
       }
       tisInRank = this.isInTop;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tisInRank);
       }
       if (!(this.displayNotInTop).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.displayNotInTop);
       }
       tisInRank = this.globalRank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tisInRank);
       }
       tisInRank = this.isDisplayBenefitInfo;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tisInRank);
       }
       tisInRank = this.benefitDisplayInfo;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tisInRank);
       }
       tisInRank = this.districtRankHintInfo;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, tisInRank);
       }
       tisInRank = this.globalRankHintInfo;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, tisInRank);
       }
       tisInRank = this.isInCityRank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(20, tisInRank);
       }
       if (!(this.cityDisplayRank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.cityDisplayRank);
       }
       if (!(this.cityRankName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.cityRankName);
       }
       tisInRank = this.globalPendantColor;
       int i2 = 0;
       if (tisInRank != null && tisInRank.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tglobalPenda = this.globalPendantColor;
          while (i3 < tglobalPenda.length) {
             oobject = tglobalPenda[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       tisInRank = this.districtPendantColor;
       if (tisInRank != null && tisInRank.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tglobalPenda = this.districtPendantColor;
          while (i3 < tglobalPenda.length) {
             oobject = tglobalPenda[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       tisInRank = this.cityPendantColor;
       if (tisInRank != null && tisInRank.length > 0) {
          i3 = 0;
          i4 = 0;
          i5 = 0;
          tglobalPenda = this.cityPendantColor;
          while (i3 < tglobalPenda.length) {
             oobject = tglobalPenda[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       tisInRank = this.aggregationInRank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(26, tisInRank);
       }
       if (!(this.aggregationDisplayRank).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(27, this.aggregationDisplayRank);
       }
       if (!(this.aggregationDisplayName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.aggregationDisplayName);
       }
       tisInRank = this.aggregationRankType;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(29, tisInRank);
       }
       tisInRank = this.aggregationPendantColor;
       if (tisInRank != null && tisInRank.length > 0) {
          i3 = 0;
          int i6 = 0;
          LiveStreamMessages$SCLiveDistrictRankInfo taggregation = this.aggregationPendantColor;
          while (i2 < taggregation.length) {
             object oobject1 = taggregation[i2];
             if (oobject1 != null) {
                i6 = i6 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i6 * 2);
       }
       tisInRank = this.priority;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(31, tisInRank);
       }
       tisInRank = this.currentTimestamp;
       if (tisInRank) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(32, tisInRank);
       }
       tisInRank = this.aggregationShowRank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(33, tisInRank);
       }
       tisInRank = this.aggregationRank;
       if (tisInRank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(34, tisInRank);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveDistrictRankInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveStreamMessages$SCLiveDistrictRankInfo tglobalPenda;
       int i2;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                this.isInRank = p0.readBool();
                break;
              case 24:
                this.rank = p0.readUInt32();
                break;
              case '"':
                this.rankName = p0.readString();
                break;
              case '*':
                this.rankHint = p0.readString();
                break;
              case '2':
                this.displayRank = p0.readString();
                break;
              case ':':
                this.displayRankName = p0.readString();
                break;
              case 'B':
                this.displayRankHint = p0.readString();
                break;
              case 'H':
                this.isInGlobalRank = p0.readBool();
                break;
              case 'R':
                this.globalDisplayRank = p0.readString();
                break;
              case 'Z':
                this.globalRankName = p0.readString();
                break;
              case 'b':
                this.globalRankHint = p0.readString();
                break;
              case 'h':
                this.isInTop = p0.readBool();
                break;
              case 'r':
                this.displayNotInTop = p0.readString();
                break;
              case 'x':
                this.globalRank = p0.readUInt32();
                break;
              case 128:
                this.isDisplayBenefitInfo = p0.readBool();
                break;
              case 138:
                if (this.benefitDisplayInfo == null) {
                   this.benefitDisplayInfo = new LiveStreamMessages$LiveDistrictBenefitDisplayInfo();
                }
                p0.readMessage(this.benefitDisplayInfo);
                break;
              case 146:
                if (this.districtRankHintInfo == null) {
                   this.districtRankHintInfo = new LiveStreamMessages$LiveDistrictDisplayRankHintInfo();
                }
                p0.readMessage(this.districtRankHintInfo);
                break;
              case 154:
                if (this.globalRankHintInfo == null) {
                   this.globalRankHintInfo = new LiveStreamMessages$LiveDistrictDisplayRankHintInfo();
                }
                p0.readMessage(this.globalRankHintInfo);
                break;
              case 160:
                this.isInCityRank = p0.readBool();
                break;
              case 170:
                this.cityDisplayRank = p0.readString();
                break;
              case 178:
                this.cityRankName = p0.readString();
                break;
              case 186:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 186);
                tglobalPenda = this.globalPendantColor;
                i2 = (tglobalPenda == null)? 0: tglobalPenda.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tglobalPenda, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.globalPendantColor = stringArray;
                break;
              case 194:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 194);
                tglobalPenda = this.districtPendantColor;
                i2 = (tglobalPenda == null)? 0: tglobalPenda.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tglobalPenda, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.districtPendantColor = stringArray;
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                tglobalPenda = this.cityPendantColor;
                i2 = (tglobalPenda == null)? 0: tglobalPenda.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tglobalPenda, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.cityPendantColor = stringArray;
                break;
              case 208:
                this.aggregationInRank = p0.readBool();
                break;
              case 218:
                this.aggregationDisplayRank = p0.readString();
                break;
              case 226:
                this.aggregationDisplayName = p0.readString();
                break;
              case 232:
                this.aggregationRankType = p0.readUInt32();
                break;
              case 242:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 242);
                tglobalPenda = this.aggregationPendantColor;
                i2 = (tglobalPenda == null)? 0: tglobalPenda.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tglobalPenda, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.aggregationPendantColor = stringArray;
                break;
              case 248:
                this.priority = p0.readUInt32();
                break;
              case 256:
                this.currentTimestamp = p0.readUInt64();
                break;
              case 264:
                this.aggregationShowRank = p0.readBool();
                break;
              case 272:
                this.aggregationRank = p0.readUInt32();
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
       LiveStreamMessages$SCLiveDistrictRankInfo tglobalPenda;
       object oobject;
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveStreamMessages$SCLiveDistrictRankInfo tisInRank = this.isInRank;
       if (tisInRank != null) {
          p0.writeBool(2, tisInRank);
       }
       tisInRank = this.rank;
       if (tisInRank != null) {
          p0.writeUInt32(3, tisInRank);
       }
       if (!(this.rankName).equals(str)) {
          p0.writeString(4, this.rankName);
       }
       if (!(this.rankHint).equals(str)) {
          p0.writeString(5, this.rankHint);
       }
       if (!(this.displayRank).equals(str)) {
          p0.writeString(6, this.displayRank);
       }
       if (!(this.displayRankName).equals(str)) {
          p0.writeString(7, this.displayRankName);
       }
       if (!(this.displayRankHint).equals(str)) {
          p0.writeString(8, this.displayRankHint);
       }
       tisInRank = this.isInGlobalRank;
       if (tisInRank != null) {
          p0.writeBool(9, tisInRank);
       }
       if (!(this.globalDisplayRank).equals(str)) {
          p0.writeString(10, this.globalDisplayRank);
       }
       if (!(this.globalRankName).equals(str)) {
          p0.writeString(11, this.globalRankName);
       }
       if (!(this.globalRankHint).equals(str)) {
          p0.writeString(12, this.globalRankHint);
       }
       tisInRank = this.isInTop;
       if (tisInRank != null) {
          p0.writeBool(13, tisInRank);
       }
       if (!(this.displayNotInTop).equals(str)) {
          p0.writeString(14, this.displayNotInTop);
       }
       tisInRank = this.globalRank;
       if (tisInRank != null) {
          p0.writeUInt32(15, tisInRank);
       }
       tisInRank = this.isDisplayBenefitInfo;
       if (tisInRank != null) {
          p0.writeBool(16, tisInRank);
       }
       tisInRank = this.benefitDisplayInfo;
       if (tisInRank != null) {
          p0.writeMessage(17, tisInRank);
       }
       tisInRank = this.districtRankHintInfo;
       if (tisInRank != null) {
          p0.writeMessage(18, tisInRank);
       }
       tisInRank = this.globalRankHintInfo;
       if (tisInRank != null) {
          p0.writeMessage(19, tisInRank);
       }
       tisInRank = this.isInCityRank;
       if (tisInRank != null) {
          p0.writeBool(20, tisInRank);
       }
       if (!(this.cityDisplayRank).equals(str)) {
          p0.writeString(21, this.cityDisplayRank);
       }
       if (!(this.cityRankName).equals(str)) {
          p0.writeString(22, this.cityRankName);
       }
       tisInRank = this.globalPendantColor;
       int i = 0;
       if (tisInRank != null && tisInRank.length > 0) {
          i1 = 0;
          tglobalPenda = this.globalPendantColor;
          while (i1 < tglobalPenda.length) {
             oobject = tglobalPenda[i1];
             if (oobject != null) {
                p0.writeString(23, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tisInRank = this.districtPendantColor;
       if (tisInRank != null && tisInRank.length > 0) {
          i1 = 0;
          tglobalPenda = this.districtPendantColor;
          while (i1 < tglobalPenda.length) {
             oobject = tglobalPenda[i1];
             if (oobject != null) {
                p0.writeString(24, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tisInRank = this.cityPendantColor;
       if (tisInRank != null && tisInRank.length > 0) {
          i1 = 0;
          tglobalPenda = this.cityPendantColor;
          while (i1 < tglobalPenda.length) {
             oobject = tglobalPenda[i1];
             if (oobject != null) {
                p0.writeString(25, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tisInRank = this.aggregationInRank;
       if (tisInRank != null) {
          p0.writeBool(26, tisInRank);
       }
       if (!(this.aggregationDisplayRank).equals(str)) {
          p0.writeString(27, this.aggregationDisplayRank);
       }
       if (!(this.aggregationDisplayName).equals(str)) {
          p0.writeString(28, this.aggregationDisplayName);
       }
       tisInRank = this.aggregationRankType;
       if (tisInRank != null) {
          p0.writeUInt32(29, tisInRank);
       }
       tisInRank = this.aggregationPendantColor;
       if (tisInRank != null && tisInRank.length > 0) {
          tisInRank = this.aggregationPendantColor;
          while (i < tisInRank.length) {
             object oobject1 = tisInRank[i];
             if (oobject1 != null) {
                p0.writeString(30, oobject1);
             }
             i = i + 1;
          }
       }
       tisInRank = this.priority;
       if (tisInRank != null) {
          p0.writeUInt32(31, tisInRank);
       }
       tisInRank = this.currentTimestamp;
       if (tisInRank) {
          p0.writeUInt64(32, tisInRank);
       }
       tisInRank = this.aggregationShowRank;
       if (tisInRank != null) {
          p0.writeBool(33, tisInRank);
       }
       tisInRank = this.aggregationRank;
       if (tisInRank != null) {
          p0.writeUInt32(34, tisInRank);
       }
       super.writeTo(p0);
       return;
    }
}
