package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetExtend;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivityWidgetProto$LiveActivityWidgetExtend extends MessageNano	// class@0010d4
{
    public String jumpUrl;
    public int popupOpenType;
    public static LiveActivityWidgetProto$LiveActivityWidgetExtend[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetExtend(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetExtend[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetExtend._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetExtend._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetExtend[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetExtend[0];
             LiveActivityWidgetProto$LiveActivityWidgetExtend._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetExtend._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetExtend parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetExtend().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetExtend parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetExtend(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetExtend clear(){
       this.popupOpenType = 0;
       this.jumpUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$LiveActivityWidgetExtend tpopupOpenTy = this.popupOpenType;
       if (tpopupOpenTy != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpopupOpenTy);
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.jumpUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetExtend mergeFrom(CodedInputByteBufferNano p0){
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
             }else {
                this.jumpUrl = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.popupOpenType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$LiveActivityWidgetExtend tpopupOpenTy = this.popupOpenType;
       if (tpopupOpenTy != null) {
          p0.writeInt32(1, tpopupOpenTy);
       }
       if (!(this.jumpUrl).equals("")) {
          p0.writeString(2, this.jumpUrl);
       }
       super.writeTo(p0);
       return;
    }
}
