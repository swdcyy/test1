package com.kuaishou.protobuf.ad.brand.activity.nano.SCAdWatchLiveTaskSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import com.kuaishou.protobuf.ad.brand.activity.nano.AdWatchLiveTaskWidgetInfo;

public final class SCAdWatchLiveTaskSignal extends MessageNano	// class@000b96
{
    public Map extraData;
    public int signalType;
    public AdWatchLiveTaskWidgetInfo widgetInfo;
    public static SCAdWatchLiveTaskSignal[] _emptyArray;

    public void SCAdWatchLiveTaskSignal(){
       super();
       this.clear();
    }
    public static SCAdWatchLiveTaskSignal[] emptyArray(){
       if (SCAdWatchLiveTaskSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCAdWatchLiveTaskSignal._emptyArray == null) {
             SCAdWatchLiveTaskSignal[] sCAdWatchLiv = new SCAdWatchLiveTaskSignal[0];
             SCAdWatchLiveTaskSignal._emptyArray = sCAdWatchLiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCAdWatchLiveTaskSignal._emptyArray;
    }
    public static SCAdWatchLiveTaskSignal parseFrom(CodedInputByteBufferNano p0){
       return new SCAdWatchLiveTaskSignal().mergeFrom(p0);
    }
    public static SCAdWatchLiveTaskSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCAdWatchLiveTaskSignal(), p0);
    }
    public SCAdWatchLiveTaskSignal clear(){
       this.signalType = 0;
       this.widgetInfo = null;
       this.extraData = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCAdWatchLiveTaskSignal tsignalType = this.signalType;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsignalType);
       }
       tsignalType = this.widgetInfo;
       if (tsignalType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tsignalType);
       }
       tsignalType = this.extraData;
       if (tsignalType != null) {
          i = i + InternalNano.computeMapFieldSize(tsignalType, 3, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCAdWatchLiveTaskSignal mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.extraData = InternalNano.mergeMapEntry(p0, this.extraData, mapFactory, 9, 9, null, 10, 18);
                }
             }else if(this.widgetInfo == null){
                this.widgetInfo = new AdWatchLiveTaskWidgetInfo();
             }
             p0.readMessage(this.widgetInfo);
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.signalType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCAdWatchLiveTaskSignal tsignalType = this.signalType;
       if (tsignalType != null) {
          p0.writeInt32(1, tsignalType);
       }
       tsignalType = this.widgetInfo;
       if (tsignalType != null) {
          p0.writeMessage(2, tsignalType);
       }
       tsignalType = this.extraData;
       if (tsignalType != null) {
          InternalNano.serializeMapField(p0, tsignalType, 3, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
