package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetBase;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivityWidgetProto$LiveActivityWidgetBase extends MessageNano	// class@0010d3
{
    public boolean isExclusive;
    public String ksOrderId;
    public String name;
    public long startTime;
    public int type;
    public static LiveActivityWidgetProto$LiveActivityWidgetBase[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetBase(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetBase[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetBase._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetBase._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetBase[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetBase[0];
             LiveActivityWidgetProto$LiveActivityWidgetBase._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetBase._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetBase parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetBase().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetBase parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetBase(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetBase clear(){
       this.type = 0;
       this.name = "";
       this.startTime = 0;
       this.ksOrderId = "";
       this.isExclusive = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$LiveActivityWidgetBase ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       LiveActivityWidgetProto$LiveActivityWidgetBase tstartTime = this.startTime;
       if (tstartTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tstartTime);
       }
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ksOrderId);
       }
       ttype = this.isExclusive;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetBase mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.isExclusive = p0.readBool();
                      }
                   }else {
                      this.ksOrderId = p0.readString();
                   }
                }else {
                   this.startTime = p0.readUInt64();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$LiveActivityWidgetBase ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       LiveActivityWidgetProto$LiveActivityWidgetBase tstartTime = this.startTime;
       if (tstartTime) {
          p0.writeUInt64(3, tstartTime);
       }
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(4, this.ksOrderId);
       }
       ttype = this.isExclusive;
       if (ttype != null) {
          p0.writeBool(5, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
