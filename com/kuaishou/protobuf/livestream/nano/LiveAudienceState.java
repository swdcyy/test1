package com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveUserInfo;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import com.kuaishou.protobuf.livestream.nano.LivePrivilegeState;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$LiveFansGroupState;
import com.kuaishou.protobuf.livestream.nano.GzoneNameplate;

public final class LiveAudienceState extends MessageNano	// class@000c3b
{
    public int assistantType;
    public int audienceRank;
    public String badgeKey;
    public int fansGroupIntimacyLevel;
    public LiveFeedBackground feedBackground;
    public String hometown;
    public boolean isAnonymousIdentity;
    public boolean isFromFansTop;
    public boolean isJewelAndJadeCollector;
    public boolean isKoi;
    public boolean isSenderVisible;
    public UserStateRichTextSegment[] liteUserStateSegment;
    public LiveFansGroupMessages$LiveFansGroupState liveFansGroupState;
    public LivePrivilegeState livePrivilegeState;
    public LiveUserInfo liveUserInfo;
    public GzoneNameplate nameplate;
    public Map userConditionStateExtraInfo;
    public int[] userFeature;
    public UserStateRichTextSegment[] userStateConditionSegment;
    public UserStateRichTextSegment[] userStateSegment;
    public UserStateRichTextSegment[] userStateSegmentExtra;
    public UserStateRichTextSegment[] userStateSegmentForAuthor;
    public int wealthGrade;
    public static LiveAudienceState[] _emptyArray;

    public void LiveAudienceState(){
       super();
       this.clear();
    }
    public static LiveAudienceState[] emptyArray(){
       if (LiveAudienceState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAudienceState._emptyArray == null) {
             LiveAudienceState[] liveAudience = new LiveAudienceState[0];
             LiveAudienceState._emptyArray = liveAudience;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAudienceState._emptyArray;
    }
    public static LiveAudienceState parseFrom(CodedInputByteBufferNano p0){
       return new LiveAudienceState().mergeFrom(p0);
    }
    public static LiveAudienceState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAudienceState(), p0);
    }
    public LiveAudienceState clear(){
       this.isFromFansTop = false;
       this.isKoi = false;
       this.assistantType = 0;
       this.fansGroupIntimacyLevel = 0;
       this.nameplate = null;
       this.liveFansGroupState = null;
       this.wealthGrade = 0;
       this.badgeKey = "";
       this.livePrivilegeState = null;
       this.audienceRank = 0;
       this.userStateSegment = UserStateRichTextSegment.emptyArray();
       this.feedBackground = null;
       this.userFeature = WireFormatNano.EMPTY_INT_ARRAY;
       this.liveUserInfo = null;
       this.userStateSegmentForAuthor = UserStateRichTextSegment.emptyArray();
       this.isSenderVisible = false;
       this.hometown = "";
       this.userStateConditionSegment = UserStateRichTextSegment.emptyArray();
       this.isJewelAndJadeCollector = false;
       this.isAnonymousIdentity = false;
       this.liteUserStateSegment = UserStateRichTextSegment.emptyArray();
       this.userStateSegmentExtra = UserStateRichTextSegment.emptyArray();
       this.userConditionStateExtraInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       LiveAudienceState tuserStateSe1;
       object oobject1;
       int i = super.computeSerializedSize();
       LiveAudienceState tisFromFansT = this.isFromFansTop;
       int i1 = 1;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, tisFromFansT);
       }
       tisFromFansT = this.isKoi;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisFromFansT);
       }
       tisFromFansT = this.assistantType;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tisFromFansT);
       }
       tisFromFansT = this.fansGroupIntimacyLevel;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tisFromFansT);
       }
       tisFromFansT = this.nameplate;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tisFromFansT);
       }
       tisFromFansT = this.liveFansGroupState;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tisFromFansT);
       }
       tisFromFansT = this.wealthGrade;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tisFromFansT);
       }
       String str = "";
       if (!(this.badgeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.badgeKey);
       }
       tisFromFansT = this.livePrivilegeState;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tisFromFansT);
       }
       tisFromFansT = this.audienceRank;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tisFromFansT);
       }
       tisFromFansT = this.userStateSegment;
       int i2 = 0;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i3 = 0;
          LiveAudienceState tuserStateSe = this.userStateSegment;
          while (i3 < tuserStateSe.length) {
             object oobject = tuserStateSe[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(11, oobject);
             }
             i3 = i3 + 1;
          }
       }
       tisFromFansT = this.feedBackground;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tisFromFansT);
       }
       tisFromFansT = this.userFeature;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i3 = 0;
          int i4 = 0;
          LiveAudienceState tuserFeature = this.userFeature;
          while (i3 < tuserFeature.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tuserFeature[i3]);
             i3 = i3 + 1;
          }
          i = (i + i4) + (tuserFeature.length * 1);
       }
       tisFromFansT = this.liveUserInfo;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tisFromFansT);
       }
       tisFromFansT = this.userStateSegmentForAuthor;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i3 = 0;
          tuserStateSe1 = this.userStateSegmentForAuthor;
          while (i3 < tuserStateSe1.length) {
             oobject1 = tuserStateSe1[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(15, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       tisFromFansT = this.isSenderVisible;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, tisFromFansT);
       }
       if (!(this.hometown).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(17, this.hometown);
       }
       tisFromFansT = this.userStateConditionSegment;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i3 = 0;
          tuserStateSe1 = this.userStateConditionSegment;
          while (i3 < tuserStateSe1.length) {
             oobject1 = tuserStateSe1[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(18, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       tisFromFansT = this.isJewelAndJadeCollector;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(19, tisFromFansT);
       }
       tisFromFansT = this.isAnonymousIdentity;
       if (tisFromFansT != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(20, tisFromFansT);
       }
       tisFromFansT = this.liteUserStateSegment;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i3 = 0;
          tuserStateSe1 = this.liteUserStateSegment;
          while (i3 < tuserStateSe1.length) {
             oobject1 = tuserStateSe1[i3];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(21, oobject1);
             }
             i3 = i3 + 1;
          }
       }
       tisFromFansT = this.userStateSegmentExtra;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          tisFromFansT = this.userStateSegmentExtra;
          while (i2 < tisFromFansT.length) {
             object oobject2 = tisFromFansT[i2];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(22, oobject2);
             }
             i2 = i2 + 1;
          }
       }
       tisFromFansT = this.userConditionStateExtraInfo;
       if (tisFromFansT != null) {
          i = i + InternalNano.computeMapFieldSize(tisFromFansT, 23, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAudienceState mergeFrom(CodedInputByteBufferNano p0){
       LiveAudienceState tuserStateSe;
       int i2;
       UserStateRichTextSegment[] userStateRic;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                this.isFromFansTop = p0.readBool();
                break;
              case 16:
                this.isKoi = p0.readBool();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.assistantType = i;
                }
                break;
              case 32:
                this.fansGroupIntimacyLevel = p0.readUInt32();
                break;
              case '*':
                if (this.nameplate == null) {
                   this.nameplate = new GzoneNameplate();
                }
                p0.readMessage(this.nameplate);
                break;
              case '2':
                if (this.liveFansGroupState == null) {
                   this.liveFansGroupState = new LiveFansGroupMessages$LiveFansGroupState();
                }
                p0.readMessage(this.liveFansGroupState);
                break;
              case '8':
                this.wealthGrade = p0.readUInt32();
                break;
              case 'B':
                this.badgeKey = p0.readString();
                break;
              case 'J':
                if (this.livePrivilegeState == null) {
                   this.livePrivilegeState = new LivePrivilegeState();
                }
                p0.readMessage(this.livePrivilegeState);
                break;
              case 'P':
                this.audienceRank = p0.readUInt32();
                break;
              case 'Z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 90);
                tuserStateSe = this.userStateSegment;
                i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i = i + i2;
                userStateRic = new UserStateRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tuserStateSe, i1, userStateRic, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userStateRic[i2] = new UserStateRichTextSegment();
                   p0.readMessage(userStateRic[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userStateRic[i2] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i2]);
                this.userStateSegment = userStateRic;
                break;
              case 'b':
                if (this.feedBackground == null) {
                   this.feedBackground = new LiveFeedBackground();
                }
                p0.readMessage(this.feedBackground);
                break;
              case 'h':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 104);
                tuserStateSe = this.userFeature;
                i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i = i + i2;
                int[] ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tuserStateSe, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readUInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readUInt32();
                this.userFeature = ointArray;
                break;
              case 'j':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tuserStateSe = this.userFeature;
                int i3 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i2 = i2 + i3;
                int[] ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tuserStateSe, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.userFeature = ointArray1;
                p0.popLimit(i);
                break;
              case 'r':
                if (this.liveUserInfo == null) {
                   this.liveUserInfo = new LiveUserInfo();
                }
                p0.readMessage(this.liveUserInfo);
                break;
              case 'z':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 122);
                tuserStateSe = this.userStateSegmentForAuthor;
                i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i = i + i2;
                userStateRic = new UserStateRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tuserStateSe, i1, userStateRic, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userStateRic[i2] = new UserStateRichTextSegment();
                   p0.readMessage(userStateRic[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userStateRic[i2] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i2]);
                this.userStateSegmentForAuthor = userStateRic;
                break;
              case 128:
                this.isSenderVisible = p0.readBool();
                break;
              case 138:
                this.hometown = p0.readString();
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                tuserStateSe = this.userStateConditionSegment;
                i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i = i + i2;
                userStateRic = new UserStateRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tuserStateSe, i1, userStateRic, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userStateRic[i2] = new UserStateRichTextSegment();
                   p0.readMessage(userStateRic[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userStateRic[i2] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i2]);
                this.userStateConditionSegment = userStateRic;
                break;
              case 152:
                this.isJewelAndJadeCollector = p0.readBool();
                break;
              case 160:
                this.isAnonymousIdentity = p0.readBool();
                break;
              case 170:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 170);
                tuserStateSe = this.liteUserStateSegment;
                i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i = i + i2;
                userStateRic = new UserStateRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tuserStateSe, i1, userStateRic, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userStateRic[i2] = new UserStateRichTextSegment();
                   p0.readMessage(userStateRic[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userStateRic[i2] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i2]);
                this.liteUserStateSegment = userStateRic;
                break;
              case 178:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 178);
                tuserStateSe = this.userStateSegmentExtra;
                i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
                i = i + i2;
                userStateRic = new UserStateRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tuserStateSe, i1, userStateRic, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userStateRic[i2] = new UserStateRichTextSegment();
                   p0.readMessage(userStateRic[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userStateRic[i2] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i2]);
                this.userStateSegmentExtra = userStateRic;
                break;
              case 186:
                this.userConditionStateExtraInfo = InternalNano.mergeMapEntry(p0, this.userConditionStateExtraInfo, mapFactory, 9, 9, null, 10, 18);
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
       LiveAudienceState tuserStateSe;
       object oobject;
       LiveAudienceState tuserStateCo;
       object oobject1;
       LiveAudienceState tisFromFansT = this.isFromFansTop;
       if (tisFromFansT != null) {
          p0.writeBool(1, tisFromFansT);
       }
       tisFromFansT = this.isKoi;
       if (tisFromFansT != null) {
          p0.writeBool(2, tisFromFansT);
       }
       tisFromFansT = this.assistantType;
       if (tisFromFansT != null) {
          p0.writeInt32(3, tisFromFansT);
       }
       tisFromFansT = this.fansGroupIntimacyLevel;
       if (tisFromFansT != null) {
          p0.writeUInt32(4, tisFromFansT);
       }
       tisFromFansT = this.nameplate;
       if (tisFromFansT != null) {
          p0.writeMessage(5, tisFromFansT);
       }
       tisFromFansT = this.liveFansGroupState;
       if (tisFromFansT != null) {
          p0.writeMessage(6, tisFromFansT);
       }
       tisFromFansT = this.wealthGrade;
       if (tisFromFansT != null) {
          p0.writeUInt32(7, tisFromFansT);
       }
       String str = "";
       if (!(this.badgeKey).equals(str)) {
          p0.writeString(8, this.badgeKey);
       }
       tisFromFansT = this.livePrivilegeState;
       if (tisFromFansT != null) {
          p0.writeMessage(9, tisFromFansT);
       }
       tisFromFansT = this.audienceRank;
       if (tisFromFansT != null) {
          p0.writeUInt32(10, tisFromFansT);
       }
       tisFromFansT = this.userStateSegment;
       int i = 0;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i1 = 0;
          tuserStateSe = this.userStateSegment;
          while (i1 < tuserStateSe.length) {
             oobject = tuserStateSe[i1];
             if (oobject != null) {
                p0.writeMessage(11, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tisFromFansT = this.feedBackground;
       if (tisFromFansT != null) {
          p0.writeMessage(12, tisFromFansT);
       }
       tisFromFansT = this.userFeature;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i1 = 0;
          tuserStateSe = this.userFeature;
          while (i1 < tuserStateSe.length) {
             p0.writeUInt32(13, tuserStateSe[i1]);
             i1 = i1 + 1;
          }
       }
       tisFromFansT = this.liveUserInfo;
       if (tisFromFansT != null) {
          p0.writeMessage(14, tisFromFansT);
       }
       tisFromFansT = this.userStateSegmentForAuthor;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i1 = 0;
          tuserStateSe = this.userStateSegmentForAuthor;
          while (i1 < tuserStateSe.length) {
             oobject = tuserStateSe[i1];
             if (oobject != null) {
                p0.writeMessage(15, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tisFromFansT = this.isSenderVisible;
       if (tisFromFansT != null) {
          p0.writeBool(16, tisFromFansT);
       }
       if (!(this.hometown).equals(str)) {
          p0.writeString(17, this.hometown);
       }
       tisFromFansT = this.userStateConditionSegment;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i1 = 0;
          tuserStateCo = this.userStateConditionSegment;
          while (i1 < tuserStateCo.length) {
             oobject1 = tuserStateCo[i1];
             if (oobject1 != null) {
                p0.writeMessage(18, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tisFromFansT = this.isJewelAndJadeCollector;
       if (tisFromFansT != null) {
          p0.writeBool(19, tisFromFansT);
       }
       tisFromFansT = this.isAnonymousIdentity;
       if (tisFromFansT != null) {
          p0.writeBool(20, tisFromFansT);
       }
       tisFromFansT = this.liteUserStateSegment;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          i1 = 0;
          tuserStateCo = this.liteUserStateSegment;
          while (i1 < tuserStateCo.length) {
             oobject1 = tuserStateCo[i1];
             if (oobject1 != null) {
                p0.writeMessage(21, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tisFromFansT = this.userStateSegmentExtra;
       if (tisFromFansT != null && tisFromFansT.length > 0) {
          tisFromFansT = this.userStateSegmentExtra;
          while (i < tisFromFansT.length) {
             object oobject2 = tisFromFansT[i];
             if (oobject2 != null) {
                p0.writeMessage(22, oobject2);
             }
             i = i + 1;
          }
       }
       tisFromFansT = this.userConditionStateExtraInfo;
       if (tisFromFansT != null) {
          InternalNano.serializeMapField(p0, tisFromFansT, 23, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
