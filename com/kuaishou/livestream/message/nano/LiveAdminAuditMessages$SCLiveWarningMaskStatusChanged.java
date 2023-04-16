package com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged extends MessageNano	// class@0010f2
{
    public String bottomContent;
    public boolean displayMask;
    public LiveCdnNodeView[] imageCdnNodeView;
    public long timeout;
    public long timestamp;
    public String topContent;
    public String warningContent;
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged[] _emptyArray;

    public void LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged(){
       super();
       this.clear();
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged[] emptyArray(){
       if (LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged._emptyArray == null) {
             LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged[] sCLiveWarnin = new LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged[0];
             LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged._emptyArray = sCLiveWarnin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged._emptyArray;
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged().mergeFrom(p0);
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged(), p0);
    }
    public LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged clear(){
       this.displayMask = false;
       this.timeout = 0;
       this.imageCdnNodeView = LiveCdnNodeView.emptyArray();
       this.warningContent = "";
       this.timestamp = 0;
       this.topContent = "";
       this.bottomContent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged tdisplayMask = this.displayMask;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tdisplayMask);
       }
       tdisplayMask = this.timeout;
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged sCLiveWarnin = null;
       if (tdisplayMask - sCLiveWarnin) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tdisplayMask);
       }
       tdisplayMask = this.imageCdnNodeView;
       if (tdisplayMask != null && tdisplayMask.length > 0) {
          int i1 = 0;
          LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged timageCdnNod = this.imageCdnNodeView;
          while (i1 < timageCdnNod.length) {
             object oobject = timageCdnNod[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.warningContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.warningContent);
       }
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged ttimestamp = this.timestamp;
       if (ttimestamp - sCLiveWarnin) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttimestamp);
       }
       if (!(this.topContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.topContent);
       }
       if (!(this.bottomContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.bottomContent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.bottomContent = p0.readString();
                            }
                         }else {
                            this.topContent = p0.readString();
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.warningContent = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged timageCdnNod = this.imageCdnNodeView;
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
             }else {
                this.timeout = p0.readUInt64();
             }
          }else {
             this.displayMask = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged tdisplayMask = this.displayMask;
       if (tdisplayMask != null) {
          p0.writeBool(1, tdisplayMask);
       }
       tdisplayMask = this.timeout;
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged sCLiveWarnin = null;
       if (tdisplayMask - sCLiveWarnin) {
          p0.writeUInt64(2, tdisplayMask);
       }
       tdisplayMask = this.imageCdnNodeView;
       if (tdisplayMask != null && tdisplayMask.length > 0) {
          int i = 0;
          LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged timageCdnNod = this.imageCdnNodeView;
          while (i < timageCdnNod.length) {
             object oobject = timageCdnNod[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.warningContent).equals(str)) {
          p0.writeString(4, this.warningContent);
       }
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChanged ttimestamp = this.timestamp;
       if (ttimestamp - sCLiveWarnin) {
          p0.writeUInt64(5, ttimestamp);
       }
       if (!(this.topContent).equals(str)) {
          p0.writeString(6, this.topContent);
       }
       if (!(this.bottomContent).equals(str)) {
          p0.writeString(7, this.bottomContent);
       }
       super.writeTo(p0);
       return;
    }
}
