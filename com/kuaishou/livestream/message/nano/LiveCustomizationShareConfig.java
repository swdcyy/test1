package com.kuaishou.livestream.message.nano.LiveCustomizationShareConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCustomizationShareConfig extends MessageNano	// class@001180
{
    public boolean externalShow;
    public int version;
    public static LiveCustomizationShareConfig[] _emptyArray;

    public void LiveCustomizationShareConfig(){
       super();
       this.clear();
    }
    public static LiveCustomizationShareConfig[] emptyArray(){
       if (LiveCustomizationShareConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCustomizationShareConfig._emptyArray == null) {
             LiveCustomizationShareConfig[] liveCustomiz = new LiveCustomizationShareConfig[0];
             LiveCustomizationShareConfig._emptyArray = liveCustomiz;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCustomizationShareConfig._emptyArray;
    }
    public static LiveCustomizationShareConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveCustomizationShareConfig().mergeFrom(p0);
    }
    public static LiveCustomizationShareConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCustomizationShareConfig(), p0);
    }
    public LiveCustomizationShareConfig clear(){
       this.version = 0;
       this.externalShow = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCustomizationShareConfig tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tversion);
       }
       tversion = this.externalShow;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCustomizationShareConfig mergeFrom(CodedInputByteBufferNano p0){
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
                this.externalShow = p0.readBool();
             }
          }else {
             this.version = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCustomizationShareConfig tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(1, tversion);
       }
       tversion = this.externalShow;
       if (tversion != null) {
          p0.writeBool(2, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
