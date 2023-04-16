package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidget;

public final class LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate extends MessageNano	// class@001149
{
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidget widget;
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate[] _emptyArray;

    public void LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate[] emptyArray(){
       if (LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate._emptyArray == null) {
             LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate[] sCLiveCommon = new LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate[0];
             LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate(), p0);
    }
    public LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate clear(){
       this.widget = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate twidget = this.widget;
       if (twidget != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, twidget);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.widget == null){
             this.widget = new LiveCommonActivityWidgetProto$LiveCommonActivityWidget();
          }
          p0.readMessage(this.widget);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate twidget = this.widget;
       if (twidget != null) {
          p0.writeMessage(1, twidget);
       }
       super.writeTo(p0);
       return;
    }
}
