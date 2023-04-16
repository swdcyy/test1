package com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveAdminAuditMessages$AuditAuthorMask;

public final class LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor extends MessageNano	// class@0010f5
{
    public boolean displayMask;
    public int type;
    public LiveAdminAuditMessages$AuditAuthorMask waitingMask;
    public LiveAdminAuditMessages$AuditAuthorMask warningMask;
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor[] _emptyArray;

    public void LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor(){
       super();
       this.clear();
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor[] emptyArray(){
       if (LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor._emptyArray == null) {
             LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor[] sCLiveWarnin = new LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor[0];
             LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor._emptyArray = sCLiveWarnin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor._emptyArray;
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor().mergeFrom(p0);
    }
    public static LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor(), p0);
    }
    public LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor clear(){
       this.displayMask = false;
       this.type = 0;
       this.warningMask = null;
       this.waitingMask = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor tdisplayMask = this.displayMask;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tdisplayMask);
       }
       tdisplayMask = this.type;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tdisplayMask);
       }
       tdisplayMask = this.warningMask;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tdisplayMask);
       }
       tdisplayMask = this.waitingMask;
       if (tdisplayMask != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tdisplayMask);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.waitingMask == null){
                      this.waitingMask = new LiveAdminAuditMessages$AuditAuthorMask();
                   }
                   p0.readMessage(this.waitingMask);
                }else if(this.warningMask == null){
                   this.warningMask = new LiveAdminAuditMessages$AuditAuthorMask();
                }
                p0.readMessage(this.warningMask);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.type = i;
                }
             }
          }else {
             this.displayMask = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAdminAuditMessages$SCLiveWarningMaskStatusChangedAuthor tdisplayMask = this.displayMask;
       if (tdisplayMask != null) {
          p0.writeBool(1, tdisplayMask);
       }
       tdisplayMask = this.type;
       if (tdisplayMask != null) {
          p0.writeInt32(2, tdisplayMask);
       }
       tdisplayMask = this.warningMask;
       if (tdisplayMask != null) {
          p0.writeMessage(3, tdisplayMask);
       }
       tdisplayMask = this.waitingMask;
       if (tdisplayMask != null) {
          p0.writeMessage(4, tdisplayMask);
       }
       super.writeTo(p0);
       return;
    }
}
