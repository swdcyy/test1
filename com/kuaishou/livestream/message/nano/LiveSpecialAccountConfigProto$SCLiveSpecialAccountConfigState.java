package com.kuaishou.livestream.message.nano.LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveSpecialAccountConfigProto$ConfigSwitchItem;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState extends MessageNano	// class@0012ae
{
    public LiveSpecialAccountConfigProto$ConfigSwitchItem[] configSwitchItem;
    public long timestamp;
    public static LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState[] _emptyArray;

    public void LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState(){
       super();
       this.clear();
    }
    public static LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState[] emptyArray(){
       if (LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState._emptyArray == null) {
             LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState[] sCLiveSpecia = new LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState[0];
             LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState._emptyArray = sCLiveSpecia;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState._emptyArray;
    }
    public static LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState parseFrom(CodedInputByteBufferNano p0){
       return new LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState().mergeFrom(p0);
    }
    public static LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState(), p0);
    }
    public LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState clear(){
       this.configSwitchItem = LiveSpecialAccountConfigProto$ConfigSwitchItem.emptyArray();
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState tconfigSwitc = this.configSwitchItem;
       if (tconfigSwitc != null && tconfigSwitc.length > 0) {
          int i1 = 0;
          LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState tconfigSwitc1 = this.configSwitchItem;
          while (i1 < tconfigSwitc1.length) {
             object oobject = tconfigSwitc1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tconfigSwitc = this.timestamp;
       if (tconfigSwitc) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tconfigSwitc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState tconfigSwitc = this.configSwitchItem;
             int i2 = (tconfigSwitc == null)? 0: tconfigSwitc.length;
             i = i + i2;
             LiveSpecialAccountConfigProto$ConfigSwitchItem[] uConfigSwitc = new LiveSpecialAccountConfigProto$ConfigSwitchItem[i];
             if (i2) {
                System.arraycopy(tconfigSwitc, 0, uConfigSwitc, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uConfigSwitc[i2] = new LiveSpecialAccountConfigProto$ConfigSwitchItem();
                p0.readMessage(uConfigSwitc[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uConfigSwitc[i2] = new LiveSpecialAccountConfigProto$ConfigSwitchItem();
             p0.readMessage(uConfigSwitc[i2]);
             this.configSwitchItem = uConfigSwitc;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState tconfigSwitc = this.configSwitchItem;
       if (tconfigSwitc != null && tconfigSwitc.length > 0) {
          int i = 0;
          LiveSpecialAccountConfigProto$SCLiveSpecialAccountConfigState tconfigSwitc1 = this.configSwitchItem;
          while (i < tconfigSwitc1.length) {
             object oobject = tconfigSwitc1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tconfigSwitc = this.timestamp;
       if (tconfigSwitc) {
          p0.writeUInt64(2, tconfigSwitc);
       }
       super.writeTo(p0);
       return;
    }
}
