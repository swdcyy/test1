package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose extends MessageNano	// class@001148
{
    public String widgetId;
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose[] _emptyArray;

    public void LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose[] emptyArray(){
       if (LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose._emptyArray == null) {
             LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose[] sCLiveCommon = new LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose[0];
             LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose(), p0);
    }
    public LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose clear(){
       this.widgetId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.widgetId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.widgetId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.widgetId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.widgetId).equals("")) {
          p0.writeString(1, this.widgetId);
       }
       super.writeTo(p0);
       return;
    }
}
