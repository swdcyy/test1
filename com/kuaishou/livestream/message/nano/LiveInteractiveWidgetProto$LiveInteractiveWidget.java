package com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty;

public final class LiveInteractiveWidgetProto$LiveInteractiveWidget extends MessageNano	// class@0011cb
{
    public String bundleId;
    public String dataP;
    public LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty property;
    public int status;
    public long version;
    public String viewKey;
    public String widgetId;
    public static LiveInteractiveWidgetProto$LiveInteractiveWidget[] _emptyArray;

    public void LiveInteractiveWidgetProto$LiveInteractiveWidget(){
       super();
       this.clear();
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidget[] emptyArray(){
       if (LiveInteractiveWidgetProto$LiveInteractiveWidget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveInteractiveWidgetProto$LiveInteractiveWidget._emptyArray == null) {
             LiveInteractiveWidgetProto$LiveInteractiveWidget[] liveInteract = new LiveInteractiveWidgetProto$LiveInteractiveWidget[0];
             LiveInteractiveWidgetProto$LiveInteractiveWidget._emptyArray = liveInteract;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveInteractiveWidgetProto$LiveInteractiveWidget._emptyArray;
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidget parseFrom(CodedInputByteBufferNano p0){
       return new LiveInteractiveWidgetProto$LiveInteractiveWidget().mergeFrom(p0);
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveInteractiveWidgetProto$LiveInteractiveWidget(), p0);
    }
    public LiveInteractiveWidgetProto$LiveInteractiveWidget clear(){
       this.widgetId = "";
       this.property = null;
       this.status = 0;
       this.version = 0;
       this.bundleId = "";
       this.viewKey = "";
       this.dataP = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.widgetId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.widgetId);
       }
       LiveInteractiveWidgetProto$LiveInteractiveWidget tproperty = this.property;
       if (tproperty != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tproperty);
       }
       tproperty = this.status;
       if (tproperty != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tproperty);
       }
       LiveInteractiveWidgetProto$LiveInteractiveWidget tversion = this.version;
       if (tversion) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tversion);
       }
       if (!(this.bundleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.bundleId);
       }
       if (!(this.viewKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.viewKey);
       }
       if (!(this.dataP).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.dataP);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveInteractiveWidgetProto$LiveInteractiveWidget mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.dataP = p0.readString();
                            }
                         }else {
                            this.viewKey = p0.readString();
                         }
                      }else {
                         this.bundleId = p0.readString();
                      }
                   }else {
                      this.version = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && i != 1) {
                      continue ;
                   }else {
                      this.status = i;
                   }
                }
             }else if(this.property == null){
                this.property = new LiveInteractiveWidgetProto$LiveInteractiveWidgetProperty();
             }
             p0.readMessage(this.property);
          }else {
             this.widgetId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.widgetId).equals(str)) {
          p0.writeString(1, this.widgetId);
       }
       LiveInteractiveWidgetProto$LiveInteractiveWidget tproperty = this.property;
       if (tproperty != null) {
          p0.writeMessage(2, tproperty);
       }
       tproperty = this.status;
       if (tproperty != null) {
          p0.writeInt32(3, tproperty);
       }
       LiveInteractiveWidgetProto$LiveInteractiveWidget tversion = this.version;
       if (tversion) {
          p0.writeUInt64(4, tversion);
       }
       if (!(this.bundleId).equals(str)) {
          p0.writeString(5, this.bundleId);
       }
       if (!(this.viewKey).equals(str)) {
          p0.writeString(6, this.viewKey);
       }
       if (!(this.dataP).equals(str)) {
          p0.writeString(7, this.dataP);
       }
       super.writeTo(p0);
       return;
    }
}
