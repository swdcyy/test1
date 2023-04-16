package com.kuaishou.livestream.message.nano.LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo extends MessageNano	// class@001103
{
    public int permission;
    public boolean serviceStatus;
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo[] _emptyArray;

    public void LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo(){
       super();
       this.clear();
    }
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo[] emptyArray(){
       if (LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo._emptyArray == null) {
             LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo[] sCLiveAuthor = new LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo[0];
             LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo._emptyArray;
    }
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo().mergeFrom(p0);
    }
    public static LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo(), p0);
    }
    public LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo clear(){
       this.permission = 0;
       this.serviceStatus = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo tpermission = this.permission;
       if (tpermission != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpermission);
       }
       tpermission = this.serviceStatus;
       if (tpermission != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tpermission);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.serviceStatus = p0.readBool();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.permission = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAuthorPaidTalentMessages$SCLiveAuthorPaidTalentAuthorStatusInfo tpermission = this.permission;
       if (tpermission != null) {
          p0.writeInt32(1, tpermission);
       }
       tpermission = this.serviceStatus;
       if (tpermission != null) {
          p0.writeBool(2, tpermission);
       }
       super.writeTo(p0);
       return;
    }
}
