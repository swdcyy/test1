package com.kuaishou.protobuf.livestream.nano.BountyGameResultInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.BountyGameResultInfo$UserHead;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class BountyGameResultInfo extends MessageNano	// class@000c08
{
    public String bountyScoreDelta;
    public String defeatMessage;
    public String defeatShortMessage;
    public String drawMessage;
    public String drawShortMessage;
    public BountyGameResultInfo$UserHead[] firstStageKillUserHead;
    public String firstStageVictoryMessage;
    public String firstStageVictoryShortMessage;
    public String jumpUrl;
    public int result;
    public BountyGameResultInfo$UserHead[] secondStageKillUserHead;
    public String secondStageVictoryMessage;
    public String secondStageVictoryShortMessage;
    public static BountyGameResultInfo[] _emptyArray;

    public void BountyGameResultInfo(){
       super();
       this.clear();
    }
    public static BountyGameResultInfo[] emptyArray(){
       if (BountyGameResultInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (BountyGameResultInfo._emptyArray == null) {
             BountyGameResultInfo[] uBountyGameR = new BountyGameResultInfo[0];
             BountyGameResultInfo._emptyArray = uBountyGameR;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return BountyGameResultInfo._emptyArray;
    }
    public static BountyGameResultInfo parseFrom(CodedInputByteBufferNano p0){
       return new BountyGameResultInfo().mergeFrom(p0);
    }
    public static BountyGameResultInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new BountyGameResultInfo(), p0);
    }
    public BountyGameResultInfo clear(){
       this.result = 0;
       this.bountyScoreDelta = "";
       this.firstStageVictoryMessage = "";
       this.firstStageVictoryShortMessage = "";
       this.firstStageKillUserHead = BountyGameResultInfo$UserHead.emptyArray();
       this.secondStageVictoryMessage = "";
       this.secondStageVictoryShortMessage = "";
       this.secondStageKillUserHead = BountyGameResultInfo$UserHead.emptyArray();
       this.defeatMessage = "";
       this.defeatShortMessage = "";
       this.drawMessage = "";
       this.drawShortMessage = "";
       this.jumpUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       BountyGameResultInfo tresult = this.result;
       if (tresult != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tresult);
       }
       String str = "";
       if (!(this.bountyScoreDelta).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bountyScoreDelta);
       }
       if (!(this.firstStageVictoryMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.firstStageVictoryMessage);
       }
       if (!(this.firstStageVictoryShortMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.firstStageVictoryShortMessage);
       }
       tresult = this.firstStageKillUserHead;
       int i1 = 0;
       if (tresult != null && tresult.length > 0) {
          int i2 = 0;
          BountyGameResultInfo tfirstStageK = this.firstStageKillUserHead;
          while (i2 < tfirstStageK.length) {
             object oobject = tfirstStageK[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.secondStageVictoryMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.secondStageVictoryMessage);
       }
       if (!(this.secondStageVictoryShortMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.secondStageVictoryShortMessage);
       }
       tresult = this.secondStageKillUserHead;
       if (tresult != null && tresult.length > 0) {
          tresult = this.secondStageKillUserHead;
          while (i1 < tresult.length) {
             object oobject1 = tresult[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.defeatMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.defeatMessage);
       }
       if (!(this.defeatShortMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.defeatShortMessage);
       }
       if (!(this.drawMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.drawMessage);
       }
       if (!(this.drawShortMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.drawShortMessage);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.jumpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public BountyGameResultInfo mergeFrom(CodedInputByteBufferNano p0){
       BountyGameResultInfo tfirstStageK;
       int i2;
       BountyGameResultInfo$UserHead[] userHeadArra;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.result = i;
                }
                break;
              case 18:
                this.bountyScoreDelta = p0.readString();
                break;
              case 26:
                this.firstStageVictoryMessage = p0.readString();
                break;
              case '"':
                this.firstStageVictoryShortMessage = p0.readString();
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                tfirstStageK = this.firstStageKillUserHead;
                i2 = (tfirstStageK == null)? 0: tfirstStageK.length;
                i = i + i2;
                userHeadArra = new BountyGameResultInfo$UserHead[i];
                if (i2) {
                   System.arraycopy(tfirstStageK, i1, userHeadArra, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userHeadArra[i2] = new BountyGameResultInfo$UserHead();
                   p0.readMessage(userHeadArra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userHeadArra[i2] = new BountyGameResultInfo$UserHead();
                p0.readMessage(userHeadArra[i2]);
                this.firstStageKillUserHead = userHeadArra;
                break;
              case '2':
                this.secondStageVictoryMessage = p0.readString();
                break;
              case ':':
                this.secondStageVictoryShortMessage = p0.readString();
                break;
              case 'B':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 66);
                tfirstStageK = this.secondStageKillUserHead;
                i2 = (tfirstStageK == null)? 0: tfirstStageK.length;
                i = i + i2;
                userHeadArra = new BountyGameResultInfo$UserHead[i];
                if (i2) {
                   System.arraycopy(tfirstStageK, i1, userHeadArra, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   userHeadArra[i2] = new BountyGameResultInfo$UserHead();
                   p0.readMessage(userHeadArra[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                userHeadArra[i2] = new BountyGameResultInfo$UserHead();
                p0.readMessage(userHeadArra[i2]);
                this.secondStageKillUserHead = userHeadArra;
                break;
              case 'J':
                this.defeatMessage = p0.readString();
                break;
              case 'R':
                this.defeatShortMessage = p0.readString();
                break;
              case 'Z':
                this.drawMessage = p0.readString();
                break;
              case 'b':
                this.drawShortMessage = p0.readString();
                break;
              case 'j':
                this.jumpUrl = p0.readString();
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
       BountyGameResultInfo tresult = this.result;
       if (tresult != null) {
          p0.writeInt32(1, tresult);
       }
       String str = "";
       if (!(this.bountyScoreDelta).equals(str)) {
          p0.writeString(2, this.bountyScoreDelta);
       }
       if (!(this.firstStageVictoryMessage).equals(str)) {
          p0.writeString(3, this.firstStageVictoryMessage);
       }
       if (!(this.firstStageVictoryShortMessage).equals(str)) {
          p0.writeString(4, this.firstStageVictoryShortMessage);
       }
       tresult = this.firstStageKillUserHead;
       int i = 0;
       if (tresult != null && tresult.length > 0) {
          int i1 = 0;
          BountyGameResultInfo tfirstStageK = this.firstStageKillUserHead;
          while (i1 < tfirstStageK.length) {
             object oobject = tfirstStageK[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.secondStageVictoryMessage).equals(str)) {
          p0.writeString(6, this.secondStageVictoryMessage);
       }
       if (!(this.secondStageVictoryShortMessage).equals(str)) {
          p0.writeString(7, this.secondStageVictoryShortMessage);
       }
       tresult = this.secondStageKillUserHead;
       if (tresult != null && tresult.length > 0) {
          tresult = this.secondStageKillUserHead;
          while (i < tresult.length) {
             object oobject1 = tresult[i];
             if (oobject1 != null) {
                p0.writeMessage(8, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.defeatMessage).equals(str)) {
          p0.writeString(9, this.defeatMessage);
       }
       if (!(this.defeatShortMessage).equals(str)) {
          p0.writeString(10, this.defeatShortMessage);
       }
       if (!(this.drawMessage).equals(str)) {
          p0.writeString(11, this.drawMessage);
       }
       if (!(this.drawShortMessage).equals(str)) {
          p0.writeString(12, this.drawShortMessage);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(13, this.jumpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
