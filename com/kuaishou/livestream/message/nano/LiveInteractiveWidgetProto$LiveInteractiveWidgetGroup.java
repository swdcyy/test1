package com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveInteractiveWidgetProto$LiveInteractiveWidget;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup extends MessageNano	// class@0011cc
{
    public LiveInteractiveWidgetProto$LiveInteractiveWidget[] liveInteractiveWidget;
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup[] _emptyArray;

    public void LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup(){
       super();
       this.clear();
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup[] emptyArray(){
       if (LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup._emptyArray == null) {
             LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup[] liveInteract = new LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup[0];
             LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup._emptyArray = liveInteract;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup._emptyArray;
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup parseFrom(CodedInputByteBufferNano p0){
       return new LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup().mergeFrom(p0);
    }
    public static LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup(), p0);
    }
    public LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup clear(){
       this.liveInteractiveWidget = LiveInteractiveWidgetProto$LiveInteractiveWidget.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup tliveInterac = this.liveInteractiveWidget;
       if (tliveInterac != null && tliveInterac.length > 0) {
          int i1 = 0;
          LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup tliveInterac1 = this.liveInteractiveWidget;
          while (i1 < tliveInterac1.length) {
             object oobject = tliveInterac1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup tliveInterac = this.liveInteractiveWidget;
             int i2 = (tliveInterac == null)? 0: tliveInterac.length;
             i = i + i2;
             LiveInteractiveWidgetProto$LiveInteractiveWidget[] liveInteract = new LiveInteractiveWidgetProto$LiveInteractiveWidget[i];
             if (i2) {
                System.arraycopy(tliveInterac, 0, liveInteract, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveInteract[i2] = new LiveInteractiveWidgetProto$LiveInteractiveWidget();
                p0.readMessage(liveInteract[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveInteract[i2] = new LiveInteractiveWidgetProto$LiveInteractiveWidget();
             p0.readMessage(liveInteract[i2]);
             this.liveInteractiveWidget = liveInteract;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup tliveInterac = this.liveInteractiveWidget;
       if (tliveInterac != null && tliveInterac.length > 0) {
          int i = 0;
          LiveInteractiveWidgetProto$LiveInteractiveWidgetGroup tliveInterac1 = this.liveInteractiveWidget;
          while (i < tliveInterac1.length) {
             object oobject = tliveInterac1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
