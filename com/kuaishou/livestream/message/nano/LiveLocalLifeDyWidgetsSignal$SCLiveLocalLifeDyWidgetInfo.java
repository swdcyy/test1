package com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo;

public final class LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo extends MessageNano	// class@0011eb
{
    public String componentName;
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo materialMap;
    public String widgetId;
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[] _emptyArray;

    public void LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo(){
       super();
       this.clear();
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[] emptyArray(){
       if (LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo._emptyArray == null) {
             LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[] sCLiveLocalL = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[0];
             LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo._emptyArray;
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo().mergeFrom(p0);
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo(), p0);
    }
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo clear(){
       this.componentName = "";
       this.widgetId = "";
       this.materialMap = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.componentName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.componentName);
       }
       if (!(this.widgetId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.widgetId);
       }
       LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo tmaterialMap = this.materialMap;
       if (tmaterialMap != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tmaterialMap);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.materialMap == null){
                   this.materialMap = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo();
                }
                p0.readMessage(this.materialMap);
             }else {
                this.widgetId = p0.readString();
             }
          }else {
             this.componentName = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.componentName).equals(str)) {
          p0.writeString(1, this.componentName);
       }
       if (!(this.widgetId).equals(str)) {
          p0.writeString(2, this.widgetId);
       }
       LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo tmaterialMap = this.materialMap;
       if (tmaterialMap != null) {
          p0.writeMessage(3, tmaterialMap);
       }
       super.writeTo(p0);
       return;
    }
}
