package com.kuaishou.livestream.message.nano.PkBountyActivityResultInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class PkBountyActivityResultInfo extends MessageNano	// class@0013e0
{
    public String bountyChangeText;
    public String leftBottomText;
    public String[] middleBottomTextArray;
    public long originBounty;
    public String pkId;
    public String rightBottomText;
    public long settleBounty;
    public String textAfterAnimation;
    public String textBeforeAnimation;
    public long totalBounty;
    public int winLossStatus;
    public static PkBountyActivityResultInfo[] _emptyArray;

    public void PkBountyActivityResultInfo(){
       super();
       this.clear();
    }
    public static PkBountyActivityResultInfo[] emptyArray(){
       if (PkBountyActivityResultInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (PkBountyActivityResultInfo._emptyArray == null) {
             PkBountyActivityResultInfo[] pkBountyActi = new PkBountyActivityResultInfo[0];
             PkBountyActivityResultInfo._emptyArray = pkBountyActi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return PkBountyActivityResultInfo._emptyArray;
    }
    public static PkBountyActivityResultInfo parseFrom(CodedInputByteBufferNano p0){
       return new PkBountyActivityResultInfo().mergeFrom(p0);
    }
    public static PkBountyActivityResultInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new PkBountyActivityResultInfo(), p0);
    }
    public PkBountyActivityResultInfo clear(){
       this.pkId = "";
       this.winLossStatus = 0;
       this.textBeforeAnimation = "";
       this.originBounty = 0;
       this.settleBounty = 0;
       this.totalBounty = 0;
       this.leftBottomText = "";
       this.rightBottomText = "";
       this.middleBottomTextArray = WireFormatNano.EMPTY_STRING_ARRAY;
       this.textAfterAnimation = "";
       this.bountyChangeText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.pkId);
       }
       PkBountyActivityResultInfo twinLossStat = this.winLossStatus;
       if (twinLossStat != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, twinLossStat);
       }
       if (!(this.textBeforeAnimation).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.textBeforeAnimation);
       }
       PkBountyActivityResultInfo toriginBount = this.originBounty;
       PkBountyActivityResultInfo pkBountyActi = null;
       if (toriginBount - pkBountyActi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, toriginBount);
       }
       toriginBount = this.settleBounty;
       if (toriginBount - pkBountyActi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, toriginBount);
       }
       toriginBount = this.totalBounty;
       if (toriginBount - pkBountyActi) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, toriginBount);
       }
       if (!(this.leftBottomText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.leftBottomText);
       }
       if (!(this.rightBottomText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.rightBottomText);
       }
       twinLossStat = this.middleBottomTextArray;
       if (twinLossStat != null && twinLossStat.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          pkBountyActi = this.middleBottomTextArray;
          while (i2 < pkBountyActi.length) {
             object oobject = pkBountyActi[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       if (!(this.textAfterAnimation).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.textAfterAnimation);
       }
       if (!(this.bountyChangeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.bountyChangeText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public PkBountyActivityResultInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.pkId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.winLossStatus = i;
                }
                break;
              case 26:
                this.textBeforeAnimation = p0.readString();
                break;
              case 32:
                this.originBounty = p0.readUInt64();
                break;
              case '(':
                this.settleBounty = p0.readUInt64();
                break;
              case '0':
                this.totalBounty = p0.readUInt64();
                break;
              case ':':
                this.leftBottomText = p0.readString();
                break;
              case 'B':
                this.rightBottomText = p0.readString();
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                PkBountyActivityResultInfo tmiddleBotto = this.middleBottomTextArray;
                int i1 = (tmiddleBotto == null)? 0: tmiddleBotto.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(tmiddleBotto, 0, stringArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.middleBottomTextArray = stringArray;
                break;
              case 'R':
                this.textAfterAnimation = p0.readString();
                break;
              case 'Z':
                this.bountyChangeText = p0.readString();
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
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       PkBountyActivityResultInfo twinLossStat = this.winLossStatus;
       if (twinLossStat != null) {
          p0.writeInt32(2, twinLossStat);
       }
       if (!(this.textBeforeAnimation).equals(str)) {
          p0.writeString(3, this.textBeforeAnimation);
       }
       PkBountyActivityResultInfo toriginBount = this.originBounty;
       if (toriginBount) {
          p0.writeUInt64(4, toriginBount);
       }
       toriginBount = this.settleBounty;
       if (toriginBount) {
          p0.writeUInt64(5, toriginBount);
       }
       toriginBount = this.totalBounty;
       if (toriginBount) {
          p0.writeUInt64(6, toriginBount);
       }
       if (!(this.leftBottomText).equals(str)) {
          p0.writeString(7, this.leftBottomText);
       }
       if (!(this.rightBottomText).equals(str)) {
          p0.writeString(8, this.rightBottomText);
       }
       twinLossStat = this.middleBottomTextArray;
       if (twinLossStat != null && twinLossStat.length > 0) {
          int i = 0;
          toriginBount = this.middleBottomTextArray;
          while (i < toriginBount.length) {
             object oobject = toriginBount[i];
             if (oobject != null) {
                p0.writeString(9, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.textAfterAnimation).equals(str)) {
          p0.writeString(10, this.textAfterAnimation);
       }
       if (!(this.bountyChangeText).equals(str)) {
          p0.writeString(11, this.bountyChangeText);
       }
       super.writeTo(p0);
       return;
    }
}
