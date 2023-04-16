package com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal extends MessageNano	// class@0011ed
{
    public String areaCode;
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[] widget;
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal[] _emptyArray;

    public void LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal(){
       super();
       this.clear();
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal[] emptyArray(){
       if (LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal._emptyArray == null) {
             LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal[] sCLiveLocalL = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal[0];
             LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal._emptyArray;
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal().mergeFrom(p0);
    }
    public static LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal(), p0);
    }
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal clear(){
       this.areaCode = "";
       this.widget = LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.areaCode).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.areaCode);
       }
       LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal twidget = this.widget;
       if (twidget != null && twidget.length > 0) {
          int i1 = 0;
          LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal twidget1 = this.widget;
          while (i1 < twidget1.length) {
             object oobject = twidget1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal twidget = this.widget;
                int i2 = (twidget == null)? 0: twidget.length;
                i = i + i2;
                LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[] sCLiveLocalL = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo[i];
                if (i2) {
                   System.arraycopy(twidget, 0, sCLiveLocalL, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   sCLiveLocalL[i2] = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo();
                   p0.readMessage(sCLiveLocalL[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                sCLiveLocalL[i2] = new LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetInfo();
                p0.readMessage(sCLiveLocalL[i2]);
                this.widget = sCLiveLocalL;
             }
          }else {
             this.areaCode = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.areaCode).equals("")) {
          p0.writeString(1, this.areaCode);
       }
       LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal twidget = this.widget;
       if (twidget != null && twidget.length > 0) {
          int i = 0;
          LiveLocalLifeDyWidgetsSignal$SCLiveLocalLifeDyWidgetsSignal twidget1 = this.widget;
          while (i < twidget1.length) {
             object oobject = twidget1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
