package com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo extends MessageNano	// class@0011ec
{
    public String bizData;
    public String configData;
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo[] _emptyArray;

    public void LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo(){
       super();
       this.clear();
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo[] emptyArray(){
       if (LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo._emptyArray == null) {
             LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo[] sCLiveLocalL = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo[0];
             LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo._emptyArray;
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo().mergeFrom(p0);
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo(), p0);
    }
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo clear(){
       this.configData = "";
       this.bizData = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.configData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.configData);
       }
       if (!(this.bizData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizData);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetMaterialInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.bizData = p0.readString();
             }
          }else {
             this.configData = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.configData).equals(str)) {
          p0.writeString(1, this.configData);
       }
       if (!(this.bizData).equals(str)) {
          p0.writeString(2, this.bizData);
       }
       super.writeTo(p0);
       return;
    }
}
