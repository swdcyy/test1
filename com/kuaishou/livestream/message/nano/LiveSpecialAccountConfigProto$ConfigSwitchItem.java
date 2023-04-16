package com.kuaishou.livestream.message.nano.LiveSpecialAccountConfigProto$ConfigSwitchItem;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveSpecialAccountConfigProto$ConfigSwitchItem extends MessageNano	// class@0012ac
{
    public int configSwitchType;
    public boolean value;
    public static LiveSpecialAccountConfigProto$ConfigSwitchItem[] _emptyArray;

    public void LiveSpecialAccountConfigProto$ConfigSwitchItem(){
       super();
       this.clear();
    }
    public static LiveSpecialAccountConfigProto$ConfigSwitchItem[] emptyArray(){
       if (LiveSpecialAccountConfigProto$ConfigSwitchItem._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveSpecialAccountConfigProto$ConfigSwitchItem._emptyArray == null) {
             LiveSpecialAccountConfigProto$ConfigSwitchItem[] uConfigSwitc = new LiveSpecialAccountConfigProto$ConfigSwitchItem[0];
             LiveSpecialAccountConfigProto$ConfigSwitchItem._emptyArray = uConfigSwitc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveSpecialAccountConfigProto$ConfigSwitchItem._emptyArray;
    }
    public static LiveSpecialAccountConfigProto$ConfigSwitchItem parseFrom(CodedInputByteBufferNano p0){
       return new LiveSpecialAccountConfigProto$ConfigSwitchItem().mergeFrom(p0);
    }
    public static LiveSpecialAccountConfigProto$ConfigSwitchItem parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveSpecialAccountConfigProto$ConfigSwitchItem(), p0);
    }
    public LiveSpecialAccountConfigProto$ConfigSwitchItem clear(){
       this.configSwitchType = 0;
       this.value = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveSpecialAccountConfigProto$ConfigSwitchItem tconfigSwitc = this.configSwitchType;
       if (tconfigSwitc != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tconfigSwitc);
       }
       tconfigSwitc = this.value;
       if (tconfigSwitc != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tconfigSwitc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveSpecialAccountConfigProto$ConfigSwitchItem mergeFrom(CodedInputByteBufferNano p0){
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
                this.value = p0.readBool();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.configSwitchType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveSpecialAccountConfigProto$ConfigSwitchItem tconfigSwitc = this.configSwitchType;
       if (tconfigSwitc != null) {
          p0.writeInt32(1, tconfigSwitc);
       }
       tconfigSwitc = this.value;
       if (tconfigSwitc != null) {
          p0.writeBool(2, tconfigSwitc);
       }
       super.writeTo(p0);
       return;
    }
}
