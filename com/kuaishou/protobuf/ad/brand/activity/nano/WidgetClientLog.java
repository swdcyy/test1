package com.kuaishou.protobuf.ad.brand.activity.nano.WidgetClientLog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class WidgetClientLog extends MessageNano	// class@000b97
{
    public String taskId;
    public String taskName;
    public int taskType;
    public static WidgetClientLog[] _emptyArray;

    public void WidgetClientLog(){
       super();
       this.clear();
    }
    public static WidgetClientLog[] emptyArray(){
       if (WidgetClientLog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (WidgetClientLog._emptyArray == null) {
             WidgetClientLog[] widgetClient = new WidgetClientLog[0];
             WidgetClientLog._emptyArray = widgetClient;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return WidgetClientLog._emptyArray;
    }
    public static WidgetClientLog parseFrom(CodedInputByteBufferNano p0){
       return new WidgetClientLog().mergeFrom(p0);
    }
    public static WidgetClientLog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new WidgetClientLog(), p0);
    }
    public WidgetClientLog clear(){
       this.taskId = "";
       this.taskName = "";
       this.taskType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.taskId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.taskId);
       }
       if (!(this.taskName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.taskName);
       }
       WidgetClientLog ttaskType = this.taskType;
       if (ttaskType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttaskType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public WidgetClientLog mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.taskType = p0.readUInt32();
                }
             }else {
                this.taskName = p0.readString();
             }
          }else {
             this.taskId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.taskId).equals(str)) {
          p0.writeString(1, this.taskId);
       }
       if (!(this.taskName).equals(str)) {
          p0.writeString(2, this.taskName);
       }
       WidgetClientLog ttaskType = this.taskType;
       if (ttaskType != null) {
          p0.writeUInt32(3, ttaskType);
       }
       super.writeTo(p0);
       return;
    }
}
