package com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveBanned;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveAdminAuditMessages$SCLiveBanned extends MessageNano	// class@0010f1
{
    public String banReason;
    public LiveCdnNodeView[] imageCdnNodeView;
    public String jumpUrl;
    public static LiveAdminAuditMessages$SCLiveBanned[] _emptyArray;

    public void LiveAdminAuditMessages$SCLiveBanned(){
       super();
       this.clear();
    }
    public static LiveAdminAuditMessages$SCLiveBanned[] emptyArray(){
       if (LiveAdminAuditMessages$SCLiveBanned._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminAuditMessages$SCLiveBanned._emptyArray == null) {
             LiveAdminAuditMessages$SCLiveBanned[] sCLiveBanned = new LiveAdminAuditMessages$SCLiveBanned[0];
             LiveAdminAuditMessages$SCLiveBanned._emptyArray = sCLiveBanned;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminAuditMessages$SCLiveBanned._emptyArray;
    }
    public static LiveAdminAuditMessages$SCLiveBanned parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminAuditMessages$SCLiveBanned().mergeFrom(p0);
    }
    public static LiveAdminAuditMessages$SCLiveBanned parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminAuditMessages$SCLiveBanned(), p0);
    }
    public LiveAdminAuditMessages$SCLiveBanned clear(){
       this.imageCdnNodeView = LiveCdnNodeView.emptyArray();
       this.banReason = "";
       this.jumpUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdminAuditMessages$SCLiveBanned timageCdnNod = this.imageCdnNodeView;
       if (timageCdnNod != null && timageCdnNod.length > 0) {
          int i1 = 0;
          LiveAdminAuditMessages$SCLiveBanned timageCdnNod1 = this.imageCdnNodeView;
          while (i1 < timageCdnNod1.length) {
             object oobject = timageCdnNod1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.banReason).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.banReason);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminAuditMessages$SCLiveBanned mergeFrom(CodedInputByteBufferNano p0){
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
                   this.jumpUrl = p0.readString();
                }
             }else {
                this.banReason = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveAdminAuditMessages$SCLiveBanned timageCdnNod = this.imageCdnNodeView;
             int i2 = (timageCdnNod == null)? 0: timageCdnNod.length;
             i = i + i2;
             LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
             if (i2) {
                System.arraycopy(timageCdnNod, 0, liveCdnNodeV, 0, i2);
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
             this.imageCdnNodeView = liveCdnNodeV;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAdminAuditMessages$SCLiveBanned timageCdnNod = this.imageCdnNodeView;
       if (timageCdnNod != null && timageCdnNod.length > 0) {
          int i = 0;
          LiveAdminAuditMessages$SCLiveBanned timageCdnNod1 = this.imageCdnNodeView;
          while (i < timageCdnNod1.length) {
             object oobject = timageCdnNod1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.banReason).equals(str)) {
          p0.writeString(2, this.banReason);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(3, this.jumpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
