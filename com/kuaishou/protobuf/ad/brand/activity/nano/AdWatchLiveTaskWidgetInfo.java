package com.kuaishou.protobuf.ad.brand.activity.nano.AdWatchLiveTaskWidgetInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.ad.brand.activity.nano.WidgetClientLog;
import com.kuaishou.protobuf.ad.brand.activity.nano.WidgetInfo;

public final class AdWatchLiveTaskWidgetInfo extends MessageNano	// class@000b95
{
    public WidgetClientLog widgetClientInfo;
    public WidgetInfo widgetInfo;
    public int widgetShowStatus;
    public static AdWatchLiveTaskWidgetInfo[] _emptyArray;

    public void AdWatchLiveTaskWidgetInfo(){
       super();
       this.clear();
    }
    public static AdWatchLiveTaskWidgetInfo[] emptyArray(){
       if (AdWatchLiveTaskWidgetInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (AdWatchLiveTaskWidgetInfo._emptyArray == null) {
             AdWatchLiveTaskWidgetInfo[] uAdWatchLive = new AdWatchLiveTaskWidgetInfo[0];
             AdWatchLiveTaskWidgetInfo._emptyArray = uAdWatchLive;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return AdWatchLiveTaskWidgetInfo._emptyArray;
    }
    public static AdWatchLiveTaskWidgetInfo parseFrom(CodedInputByteBufferNano p0){
       return new AdWatchLiveTaskWidgetInfo().mergeFrom(p0);
    }
    public static AdWatchLiveTaskWidgetInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new AdWatchLiveTaskWidgetInfo(), p0);
    }
    public AdWatchLiveTaskWidgetInfo clear(){
       this.widgetShowStatus = 0;
       this.widgetInfo = null;
       this.widgetClientInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       AdWatchLiveTaskWidgetInfo twidgetShowS = this.widgetShowStatus;
       if (twidgetShowS != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidgetShowS);
       }
       twidgetShowS = this.widgetInfo;
       if (twidgetShowS != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, twidgetShowS);
       }
       twidgetShowS = this.widgetClientInfo;
       if (twidgetShowS != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, twidgetShowS);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public AdWatchLiveTaskWidgetInfo mergeFrom(CodedInputByteBufferNano p0){
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
                }else if(this.widgetClientInfo == null){
                   this.widgetClientInfo = new WidgetClientLog();
                }
                p0.readMessage(this.widgetClientInfo);
             }else if(this.widgetInfo == null){
                this.widgetInfo = new WidgetInfo();
             }
             p0.readMessage(this.widgetInfo);
          }else {
             this.widgetShowStatus = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       AdWatchLiveTaskWidgetInfo twidgetShowS = this.widgetShowStatus;
       if (twidgetShowS != null) {
          p0.writeUInt32(1, twidgetShowS);
       }
       twidgetShowS = this.widgetInfo;
       if (twidgetShowS != null) {
          p0.writeMessage(2, twidgetShowS);
       }
       twidgetShowS = this.widgetClientInfo;
       if (twidgetShowS != null) {
          p0.writeMessage(3, twidgetShowS);
       }
       super.writeTo(p0);
       return;
    }
}
