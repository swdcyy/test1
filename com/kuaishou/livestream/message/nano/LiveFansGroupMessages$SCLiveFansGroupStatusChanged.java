package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupStatusChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFansGroupMessages$SCLiveFansGroupStatusChanged extends MessageNano	// class@0011b1
{
    public int activeStatus;
    public long audienceId;
    public int intimacyLevel;
    public int medalType;
    public String noticeText;
    public int statusChangedType;
    public static LiveFansGroupMessages$SCLiveFansGroupStatusChanged[] _emptyArray;

    public void LiveFansGroupMessages$SCLiveFansGroupStatusChanged(){
       super();
       this.clear();
    }
    public static LiveFansGroupMessages$SCLiveFansGroupStatusChanged[] emptyArray(){
       if (LiveFansGroupMessages$SCLiveFansGroupStatusChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$SCLiveFansGroupStatusChanged._emptyArray == null) {
             LiveFansGroupMessages$SCLiveFansGroupStatusChanged[] sCLiveFansGr = new LiveFansGroupMessages$SCLiveFansGroupStatusChanged[0];
             LiveFansGroupMessages$SCLiveFansGroupStatusChanged._emptyArray = sCLiveFansGr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$SCLiveFansGroupStatusChanged._emptyArray;
    }
    public static LiveFansGroupMessages$SCLiveFansGroupStatusChanged parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$SCLiveFansGroupStatusChanged().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$SCLiveFansGroupStatusChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$SCLiveFansGroupStatusChanged(), p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupStatusChanged clear(){
       this.audienceId = 0;
       this.statusChangedType = 0;
       this.intimacyLevel = 0;
       this.activeStatus = 0;
       this.noticeText = "";
       this.medalType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$SCLiveFansGroupStatusChanged taudienceId = this.audienceId;
       if (taudienceId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, taudienceId);
       }
       taudienceId = this.statusChangedType;
       if (taudienceId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, taudienceId);
       }
       taudienceId = this.intimacyLevel;
       if (taudienceId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, taudienceId);
       }
       taudienceId = this.activeStatus;
       if (taudienceId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, taudienceId);
       }
       if (!(this.noticeText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.noticeText);
       }
       taudienceId = this.medalType;
       if (taudienceId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, taudienceId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansGroupMessages$SCLiveFansGroupStatusChanged mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.medalType = p0.readUInt32();
                         }
                      }else {
                         this.noticeText = p0.readString();
                      }
                   }else {
                      this.activeStatus = p0.readUInt32();
                   }
                }else {
                   this.intimacyLevel = p0.readUInt32();
                }
             }else {
                this.statusChangedType = p0.readUInt32();
             }
          }else {
             this.audienceId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$SCLiveFansGroupStatusChanged taudienceId = this.audienceId;
       if (taudienceId) {
          p0.writeUInt64(1, taudienceId);
       }
       taudienceId = this.statusChangedType;
       if (taudienceId != null) {
          p0.writeUInt32(2, taudienceId);
       }
       taudienceId = this.intimacyLevel;
       if (taudienceId != null) {
          p0.writeUInt32(3, taudienceId);
       }
       taudienceId = this.activeStatus;
       if (taudienceId != null) {
          p0.writeUInt32(4, taudienceId);
       }
       if (!(this.noticeText).equals("")) {
          p0.writeString(5, this.noticeText);
       }
       taudienceId = this.medalType;
       if (taudienceId != null) {
          p0.writeUInt32(6, taudienceId);
       }
       super.writeTo(p0);
       return;
    }
}
