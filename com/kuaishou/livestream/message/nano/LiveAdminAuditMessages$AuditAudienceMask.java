package com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$AuditAudienceMask;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveAdminAuditMessages$AuditAudienceMask extends MessageNano	// class@0010ef
{
    public String detail;
    public LiveCdnNodeView[] iconCdnNodeView;
    public String title;
    public static LiveAdminAuditMessages$AuditAudienceMask[] _emptyArray;

    public void LiveAdminAuditMessages$AuditAudienceMask(){
       super();
       this.clear();
    }
    public static LiveAdminAuditMessages$AuditAudienceMask[] emptyArray(){
       if (LiveAdminAuditMessages$AuditAudienceMask._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminAuditMessages$AuditAudienceMask._emptyArray == null) {
             LiveAdminAuditMessages$AuditAudienceMask[] uAuditAudien = new LiveAdminAuditMessages$AuditAudienceMask[0];
             LiveAdminAuditMessages$AuditAudienceMask._emptyArray = uAuditAudien;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminAuditMessages$AuditAudienceMask._emptyArray;
    }
    public static LiveAdminAuditMessages$AuditAudienceMask parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminAuditMessages$AuditAudienceMask().mergeFrom(p0);
    }
    public static LiveAdminAuditMessages$AuditAudienceMask parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminAuditMessages$AuditAudienceMask(), p0);
    }
    public LiveAdminAuditMessages$AuditAudienceMask clear(){
       this.iconCdnNodeView = LiveCdnNodeView.emptyArray();
       this.title = "";
       this.detail = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdminAuditMessages$AuditAudienceMask ticonCdnNode = this.iconCdnNodeView;
       if (ticonCdnNode != null && ticonCdnNode.length > 0) {
          int i1 = 0;
          LiveAdminAuditMessages$AuditAudienceMask ticonCdnNode1 = this.iconCdnNodeView;
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
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminAuditMessages$AuditAudienceMask mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.detail = p0.readString();
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveAdminAuditMessages$AuditAudienceMask ticonCdnNode = this.iconCdnNodeView;
             int i2 = (ticonCdnNode == null)? 0: ticonCdnNode.length;
             i = i + i2;
             LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
             if (i2) {
                System.arraycopy(ticonCdnNode, 0, liveCdnNodeV, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveCdnNodeV[i2] = new LiveCdnNodeView();
             p0.readMessage(liveCdnNodeV[i2]);
             this.iconCdnNodeView = liveCdnNodeV;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAdminAuditMessages$AuditAudienceMask ticonCdnNode = this.iconCdnNodeView;
       if (ticonCdnNode != null && ticonCdnNode.length > 0) {
          int i = 0;
          LiveAdminAuditMessages$AuditAudienceMask ticonCdnNode1 = this.iconCdnNodeView;
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
       super.writeTo(p0);
       return;
    }
}
