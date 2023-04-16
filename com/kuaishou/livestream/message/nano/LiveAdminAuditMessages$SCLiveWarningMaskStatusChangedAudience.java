package com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$AuditAudienceMask;

public final class LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience extends MessageNano	// class@0010f3
{
    public boolean displayMask;
    public LiveAdminAuditMessages$AuditAudienceMask warningMask;
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience[] _emptyArray;

    public void LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience(){
       super();
       this.clear();
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience[] emptyArray(){
       if (LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience._emptyArray == null) {
             LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience[] sCLiveWarnin = new LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience[0];
             LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience._emptyArray = sCLiveWarnin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience._emptyArray;
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience().mergeFrom(p0);
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience(), p0);
    }
    public LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience clear(){
       this.displayMask = false;
       this.warningMask = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience tdisplayMask = this.displayMask;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tdisplayMask);
       }
       tdisplayMask = this.warningMask;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tdisplayMask);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.warningMask == null){
                this.warningMask = new LiveAdminAuditMessages$AuditAudienceMask();
             }
             p0.readMessage(this.warningMask);
          }else {
             this.displayMask = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAudience tdisplayMask = this.displayMask;
       if (tdisplayMask != null) {
          p0.writeBool(1, tdisplayMask);
       }
       tdisplayMask = this.warningMask;
       if (tdisplayMask != null) {
          p0.writeMessage(2, tdisplayMask);
       }
       super.writeTo(p0);
       return;
    }
}
