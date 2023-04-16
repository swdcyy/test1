package com.kuaishou.protobuf.livestream.nano.LiveMultiPkStart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTeam;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.PkAttachGiftInfo;
import com.kuaishou.protobuf.livestream.nano.CohesionPkInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinueInviteInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkRightBottomInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkInitialInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkScoreRuleInfo;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinuousWin;
import com.kuaishou.livestream.message.nano.LiveShopMessages$LiveInteractiveRoomShopCartStatus;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkEndPopup;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkReopen;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;

public final class LiveMultiPkStart extends MessageNano	// class@000cc8
{
    public CohesionPkInfo cohesionPkInfo;
    public LiveMultiPkContinueInviteInfo continueInviteInfo;
    public LiveMultiPkContinuousWin continuousWin;
    public boolean disablePkNodeAnimation;
    public boolean enableAdvanceEnd;
    public boolean enableReopenMultiPk;
    public boolean enableShowContributorList;
    public boolean enableShowContributorListLite;
    public boolean enableShowMvp;
    public LiveMultiPkEndPopup endPopUp;
    public boolean forbidPopCounterpartProfile;
    public boolean hideScoreRelatedView;
    public LiveMultiPkInitialInfo initialInfo;
    public int mode;
    public PkAttachGiftInfo pkAttachGiftInfo;
    public String pkId;
    public int playType;
    public LiveMultiPkReopen reopen;
    public LiveMultiPkRightBottomInfo rightBottomInfo;
    public LiveMultiPkRightBottomInfo rightBottomInfoLite;
    public LiveMultiPkScoreRuleInfo scoreRuleInfo;
    public LiveShopMessages$LiveInteractiveRoomShopCartStatus shopCartStatus;
    public long startUserId;
    public int startWay;
    public LiveMultiPkTeam[] team;
    public long teamVersion;
    public LiveMultiPkTimeLine timeLine;
    public static LiveMultiPkStart[] _emptyArray;

    public void LiveMultiPkStart(){
       super();
       this.clear();
    }
    public static LiveMultiPkStart[] emptyArray(){
       if (LiveMultiPkStart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkStart._emptyArray == null) {
             LiveMultiPkStart[] liveMultiPkS = new LiveMultiPkStart[0];
             LiveMultiPkStart._emptyArray = liveMultiPkS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkStart._emptyArray;
    }
    public static LiveMultiPkStart parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkStart().mergeFrom(p0);
    }
    public static LiveMultiPkStart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkStart(), p0);
    }
    public LiveMultiPkStart clear(){
       this.startUserId = 0;
       this.pkId = "";
       this.timeLine = null;
       this.playType = 0;
       this.team = LiveMultiPkTeam.emptyArray();
       this.enableAdvanceEnd = false;
       this.enableReopenMultiPk = false;
       this.mode = 0;
       this.startWay = 0;
       this.forbidPopCounterpartProfile = false;
       this.hideScoreRelatedView = false;
       this.enableShowContributorList = false;
       this.enableShowMvp = false;
       this.reopen = null;
       this.endPopUp = null;
       this.shopCartStatus = null;
       this.continuousWin = null;
       this.scoreRuleInfo = null;
       this.initialInfo = null;
       this.rightBottomInfo = null;
       this.rightBottomInfoLite = null;
       this.enableShowContributorListLite = false;
       this.disablePkNodeAnimation = false;
       this.continueInviteInfo = null;
       this.cohesionPkInfo = null;
       this.teamVersion = 0;
       this.pkAttachGiftInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkStart tstartUserId = this.startUserId;
       int i1 = 0;
       if (tstartUserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstartUserId);
       }
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.pkId);
       }
       tstartUserId = this.timeLine;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tstartUserId);
       }
       tstartUserId = this.playType;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tstartUserId);
       }
       tstartUserId = this.team;
       if (tstartUserId != null && tstartUserId.length > 0) {
          int i2 = 0;
          LiveMultiPkStart tteam = this.team;
          while (i2 < tteam.length) {
             object oobject = tteam[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tstartUserId = this.enableAdvanceEnd;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tstartUserId);
       }
       tstartUserId = this.enableReopenMultiPk;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tstartUserId);
       }
       tstartUserId = this.mode;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tstartUserId);
       }
       tstartUserId = this.startWay;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tstartUserId);
       }
       tstartUserId = this.forbidPopCounterpartProfile;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tstartUserId);
       }
       tstartUserId = this.hideScoreRelatedView;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tstartUserId);
       }
       tstartUserId = this.enableShowContributorList;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tstartUserId);
       }
       tstartUserId = this.enableShowMvp;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tstartUserId);
       }
       tstartUserId = this.reopen;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tstartUserId);
       }
       tstartUserId = this.endPopUp;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tstartUserId);
       }
       tstartUserId = this.shopCartStatus;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tstartUserId);
       }
       tstartUserId = this.continuousWin;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tstartUserId);
       }
       tstartUserId = this.scoreRuleInfo;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, tstartUserId);
       }
       tstartUserId = this.initialInfo;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, tstartUserId);
       }
       tstartUserId = this.rightBottomInfo;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tstartUserId);
       }
       tstartUserId = this.rightBottomInfoLite;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tstartUserId);
       }
       tstartUserId = this.enableShowContributorListLite;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tstartUserId);
       }
       tstartUserId = this.disablePkNodeAnimation;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, tstartUserId);
       }
       tstartUserId = this.continueInviteInfo;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tstartUserId);
       }
       tstartUserId = this.cohesionPkInfo;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, tstartUserId);
       }
       tstartUserId = this.teamVersion;
       if (tstartUserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(26, tstartUserId);
       }
       tstartUserId = this.pkAttachGiftInfo;
       if (tstartUserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(27, tstartUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkStart mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          LiveMultiPkStart liveMultiPkS = 3;
          int i1 = 2;
          int i2 = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                this.startUserId = p0.readUInt64();
                break;
              case 18:
                this.pkId = p0.readString();
                break;
              case 26:
                if (this.timeLine == null) {
                   this.timeLine = new LiveMultiPkTimeLine();
                }
                p0.readMessage(this.timeLine);
                break;
              case 32:
                i = p0.readInt32();
                if (i && (i != i2 && (i != i1 && i != liveMultiPkS))) {
                   continue ;
                }else {
                   this.playType = i;
                }
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                liveMultiPkS = this.team;
                i1 = 0;
                i2 = (liveMultiPkS == null)? 0: liveMultiPkS.length;
                i = i + i2;
                LiveMultiPkTeam[] liveMultiPkT = new LiveMultiPkTeam[i];
                if (i2) {
                   System.arraycopy(liveMultiPkS, i1, liveMultiPkT, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   liveMultiPkT[i2] = new LiveMultiPkTeam();
                   p0.readMessage(liveMultiPkT[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveMultiPkT[i2] = new LiveMultiPkTeam();
                p0.readMessage(liveMultiPkT[i2]);
                this.team = liveMultiPkT;
                break;
              case '0':
                this.enableAdvanceEnd = p0.readBool();
                break;
              case '8':
                this.enableReopenMultiPk = p0.readBool();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != i2 && (i != i1 && (i != liveMultiPkS && i != 4)))) {
                   continue ;
                }else {
                   this.mode = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.startWay = i;
                break;
              case 'P':
                this.forbidPopCounterpartProfile = p0.readBool();
                break;
              case 'X':
                this.hideScoreRelatedView = p0.readBool();
                break;
              case '`':
                this.enableShowContributorList = p0.readBool();
                break;
              case 'h':
                this.enableShowMvp = p0.readBool();
                break;
              case 'r':
                if (this.reopen == null) {
                   this.reopen = new LiveMultiPkReopen();
                }
                p0.readMessage(this.reopen);
                break;
              case 'z':
                if (this.endPopUp == null) {
                   this.endPopUp = new LiveMultiPkEndPopup();
                }
                p0.readMessage(this.endPopUp);
                break;
              case 130:
                if (this.shopCartStatus == null) {
                   this.shopCartStatus = new LiveShopMessages$LiveInteractiveRoomShopCartStatus();
                }
                p0.readMessage(this.shopCartStatus);
                break;
              case 138:
                if (this.continuousWin == null) {
                   this.continuousWin = new LiveMultiPkContinuousWin();
                }
                p0.readMessage(this.continuousWin);
                break;
              case 146:
                if (this.scoreRuleInfo == null) {
                   this.scoreRuleInfo = new LiveMultiPkScoreRuleInfo();
                }
                p0.readMessage(this.scoreRuleInfo);
                break;
              case 154:
                if (this.initialInfo == null) {
                   this.initialInfo = new LiveMultiPkInitialInfo();
                }
                p0.readMessage(this.initialInfo);
                break;
              case 162:
                if (this.rightBottomInfo == null) {
                   this.rightBottomInfo = new LiveMultiPkRightBottomInfo();
                }
                p0.readMessage(this.rightBottomInfo);
                break;
              case 170:
                if (this.rightBottomInfoLite == null) {
                   this.rightBottomInfoLite = new LiveMultiPkRightBottomInfo();
                }
                p0.readMessage(this.rightBottomInfoLite);
                break;
              case 176:
                this.enableShowContributorListLite = p0.readBool();
                break;
              case 184:
                this.disablePkNodeAnimation = p0.readBool();
                break;
              case 194:
                if (this.continueInviteInfo == null) {
                   this.continueInviteInfo = new LiveMultiPkContinueInviteInfo();
                }
                p0.readMessage(this.continueInviteInfo);
                break;
              case 202:
                if (this.cohesionPkInfo == null) {
                   this.cohesionPkInfo = new CohesionPkInfo();
                }
                p0.readMessage(this.cohesionPkInfo);
                break;
              case 208:
                this.teamVersion = p0.readUInt64();
                break;
              case 218:
                if (this.pkAttachGiftInfo == null) {
                   this.pkAttachGiftInfo = new PkAttachGiftInfo();
                }
                p0.readMessage(this.pkAttachGiftInfo);
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
       LiveMultiPkStart tstartUserId = this.startUserId;
       int i = 0;
       if (tstartUserId - i) {
          p0.writeUInt64(1, tstartUserId);
       }
       if (!(this.pkId).equals("")) {
          p0.writeString(2, this.pkId);
       }
       tstartUserId = this.timeLine;
       if (tstartUserId != null) {
          p0.writeMessage(3, tstartUserId);
       }
       tstartUserId = this.playType;
       if (tstartUserId != null) {
          p0.writeInt32(4, tstartUserId);
       }
       tstartUserId = this.team;
       if (tstartUserId != null && tstartUserId.length > 0) {
          int i1 = 0;
          LiveMultiPkStart tteam = this.team;
          while (i1 < tteam.length) {
             object oobject = tteam[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tstartUserId = this.enableAdvanceEnd;
       if (tstartUserId != null) {
          p0.writeBool(6, tstartUserId);
       }
       tstartUserId = this.enableReopenMultiPk;
       if (tstartUserId != null) {
          p0.writeBool(7, tstartUserId);
       }
       tstartUserId = this.mode;
       if (tstartUserId != null) {
          p0.writeInt32(8, tstartUserId);
       }
       tstartUserId = this.startWay;
       if (tstartUserId != null) {
          p0.writeInt32(9, tstartUserId);
       }
       tstartUserId = this.forbidPopCounterpartProfile;
       if (tstartUserId != null) {
          p0.writeBool(10, tstartUserId);
       }
       tstartUserId = this.hideScoreRelatedView;
       if (tstartUserId != null) {
          p0.writeBool(11, tstartUserId);
       }
       tstartUserId = this.enableShowContributorList;
       if (tstartUserId != null) {
          p0.writeBool(12, tstartUserId);
       }
       tstartUserId = this.enableShowMvp;
       if (tstartUserId != null) {
          p0.writeBool(13, tstartUserId);
       }
       tstartUserId = this.reopen;
       if (tstartUserId != null) {
          p0.writeMessage(14, tstartUserId);
       }
       tstartUserId = this.endPopUp;
       if (tstartUserId != null) {
          p0.writeMessage(15, tstartUserId);
       }
       tstartUserId = this.shopCartStatus;
       if (tstartUserId != null) {
          p0.writeMessage(16, tstartUserId);
       }
       tstartUserId = this.continuousWin;
       if (tstartUserId != null) {
          p0.writeMessage(17, tstartUserId);
       }
       tstartUserId = this.scoreRuleInfo;
       if (tstartUserId != null) {
          p0.writeMessage(18, tstartUserId);
       }
       tstartUserId = this.initialInfo;
       if (tstartUserId != null) {
          p0.writeMessage(19, tstartUserId);
       }
       tstartUserId = this.rightBottomInfo;
       if (tstartUserId != null) {
          p0.writeMessage(20, tstartUserId);
       }
       tstartUserId = this.rightBottomInfoLite;
       if (tstartUserId != null) {
          p0.writeMessage(21, tstartUserId);
       }
       tstartUserId = this.enableShowContributorListLite;
       if (tstartUserId != null) {
          p0.writeBool(22, tstartUserId);
       }
       tstartUserId = this.disablePkNodeAnimation;
       if (tstartUserId != null) {
          p0.writeBool(23, tstartUserId);
       }
       tstartUserId = this.continueInviteInfo;
       if (tstartUserId != null) {
          p0.writeMessage(24, tstartUserId);
       }
       tstartUserId = this.cohesionPkInfo;
       if (tstartUserId != null) {
          p0.writeMessage(25, tstartUserId);
       }
       tstartUserId = this.teamVersion;
       if (tstartUserId - i) {
          p0.writeUInt64(26, tstartUserId);
       }
       tstartUserId = this.pkAttachGiftInfo;
       if (tstartUserId != null) {
          p0.writeMessage(27, tstartUserId);
       }
       super.writeTo(p0);
       return;
    }
}
