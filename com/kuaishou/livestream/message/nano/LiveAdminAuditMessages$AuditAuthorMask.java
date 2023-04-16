package com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$AuditAuthorMask;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveAdminAuditMessages$AuditAuthorMask extends MessageNano	// class@0010f0
{
    public long buttonClickCountdownSecond;
    public String buttonContent;
    public long buttonCountdownSecond;
    public long buttonCountdownSecondV2;
    public String detail;
    public boolean displayStopPushButton;
    public String guidePageContent;
    public String guidePageUrl;
    public LiveCdnNodeView[] iconCdnNodeView;
    public String title;
    public static LiveAdminAuditMessages$AuditAuthorMask[] _emptyArray;

    public void LiveAdminAuditMessages$AuditAuthorMask(){
       super();
       this.clear();
    }
    public static LiveAdminAuditMessages$AuditAuthorMask[] emptyArray(){
       if (LiveAdminAuditMessages$AuditAuthorMask._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminAuditMessages$AuditAuthorMask._emptyArray == null) {
             LiveAdminAuditMessages$AuditAuthorMask[] uAuditAuthor = new LiveAdminAuditMessages$AuditAuthorMask[0];
             LiveAdminAuditMessages$AuditAuthorMask._emptyArray = uAuditAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminAuditMessages$AuditAuthorMask._emptyArray;
    }
    public static LiveAdminAuditMessages$AuditAuthorMask parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminAuditMessages$AuditAuthorMask().mergeFrom(p0);
    }
    public static LiveAdminAuditMessages$AuditAuthorMask parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminAuditMessages$AuditAuthorMask(), p0);
    }
    public LiveAdminAuditMessages$AuditAuthorMask clear(){
       this.iconCdnNodeView = LiveCdnNodeView.emptyArray();
       this.title = "";
       this.detail = "";
       this.buttonContent = "";
       this.buttonCountdownSecond = 0;
       this.buttonClickCountdownSecond = 0;
       this.guidePageContent = "";
       this.guidePageUrl = "";
       this.buttonCountdownSecondV2 = 0;
       this.displayStopPushButton = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdminAuditMessages$AuditAuthorMask ticonCdnNode = this.iconCdnNodeView;
       if (ticonCdnNode != null && ticonCdnNode.length > 0) {
          int i1 = 0;
          LiveAdminAuditMessages$AuditAuthorMask ticonCdnNode1 = this.iconCdnNodeView;
          while (i1 < ticonCdnNode1.length) {
             object oobject = ticonCdnNode1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.detail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.detail);
       }
       if (!(this.buttonContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonContent);
       }
       LiveAdminAuditMessages$AuditAuthorMask tbuttonCount = this.buttonCountdownSecond;
       if (tbuttonCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbuttonCount);
       }
       tbuttonCount = this.buttonClickCountdownSecond;
       if (tbuttonCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tbuttonCount);
       }
       if (!(this.guidePageContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.guidePageContent);
       }
       if (!(this.guidePageUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.guidePageUrl);
       }
       ticonCdnNode = this.buttonCountdownSecondV2;
       if (ticonCdnNode) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ticonCdnNode);
       }
       ticonCdnNode = this.displayStopPushButton;
       if (ticonCdnNode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, ticonCdnNode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminAuditMessages$AuditAuthorMask mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                LiveAdminAuditMessages$AuditAuthorMask ticonCdnNode = this.iconCdnNodeView;
                int i1 = (ticonCdnNode == null)? 0: ticonCdnNode.length;
                i = i + i1;
                LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                if (i1) {
                   System.arraycopy(ticonCdnNode, 0, liveCdnNodeV, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveCdnNodeV[i1] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveCdnNodeV[i1] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i1]);
                this.iconCdnNodeView = liveCdnNodeV;
                break;
              case 18:
                this.title = p0.readString();
                break;
              case 26:
                this.detail = p0.readString();
                break;
              case '"':
                this.buttonContent = p0.readString();
                break;
              case '(':
                this.buttonCountdownSecond = p0.readUInt64();
                break;
              case '0':
                this.buttonClickCountdownSecond = p0.readUInt64();
                break;
              case ':':
                this.guidePageContent = p0.readString();
                break;
              case 'B':
                this.guidePageUrl = p0.readString();
                break;
              case 'H':
                this.buttonCountdownSecondV2 = p0.readUInt64();
                break;
              case 'P':
                this.displayStopPushButton = p0.readBool();
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
       LiveAdminAuditMessages$AuditAuthorMask ticonCdnNode = this.iconCdnNodeView;
       if (ticonCdnNode != null && ticonCdnNode.length > 0) {
          int i = 0;
          LiveAdminAuditMessages$AuditAuthorMask ticonCdnNode1 = this.iconCdnNodeView;
          while (i < ticonCdnNode1.length) {
             object oobject = ticonCdnNode1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.detail).equals(str)) {
          p0.writeString(3, this.detail);
       }
       if (!(this.buttonContent).equals(str)) {
          p0.writeString(4, this.buttonContent);
       }
       LiveAdminAuditMessages$AuditAuthorMask tbuttonCount = this.buttonCountdownSecond;
       if (tbuttonCount) {
          p0.writeUInt64(5, tbuttonCount);
       }
       tbuttonCount = this.buttonClickCountdownSecond;
       if (tbuttonCount) {
          p0.writeUInt64(6, tbuttonCount);
       }
       if (!(this.guidePageContent).equals(str)) {
          p0.writeString(7, this.guidePageContent);
       }
       if (!(this.guidePageUrl).equals(str)) {
          p0.writeString(8, this.guidePageUrl);
       }
       ticonCdnNode = this.buttonCountdownSecondV2;
       if (ticonCdnNode) {
          p0.writeUInt64(9, ticonCdnNode);
       }
       ticonCdnNode = this.displayStopPushButton;
       if (ticonCdnNode != null) {
          p0.writeBool(10, ticonCdnNode);
       }
       super.writeTo(p0);
       return;
    }
}
