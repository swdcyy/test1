package com.kuaishou.livestream.message.nano.LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonTopRightTkWidgetProto$TkWidgetConfig;

public final class LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget extends MessageNano	// class@00116a
{
    public boolean canShow;
    public long serverTimestamp;
    public long showDeadline;
    public LiveCommonTopRightTkWidgetProto$TkWidgetConfig tkConfig;
    public static LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget[] _emptyArray;

    public void LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget(){
       super();
       this.clear();
    }
    public static LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget[] emptyArray(){
       if (LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget._emptyArray == null) {
             LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget[] sCLiveCommon = new LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget[0];
             LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget._emptyArray;
    }
    public static LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget().mergeFrom(p0);
    }
    public static LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget(), p0);
    }
    public LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget clear(){
       this.tkConfig = null;
       this.canShow = false;
       this.showDeadline = 0;
       this.serverTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget ttkConfig = this.tkConfig;
       if (ttkConfig != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ttkConfig);
       }
       ttkConfig = this.canShow;
       if (ttkConfig != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttkConfig);
       }
       ttkConfig = this.showDeadline;
       int i1 = 0;
       if (ttkConfig - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttkConfig);
       }
       ttkConfig = this.serverTimestamp;
       if (ttkConfig - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttkConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.serverTimestamp = p0.readUInt64();
                   }
                }else {
                   this.showDeadline = p0.readUInt64();
                }
             }else {
                this.canShow = p0.readBool();
             }
          }else if(this.tkConfig == null){
             this.tkConfig = new LiveCommonTopRightTkWidgetProto$TkWidgetConfig();
          }
          p0.readMessage(this.tkConfig);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget ttkConfig = this.tkConfig;
       if (ttkConfig != null) {
          p0.writeMessage(1, ttkConfig);
       }
       ttkConfig = this.canShow;
       if (ttkConfig != null) {
          p0.writeBool(2, ttkConfig);
       }
       ttkConfig = this.showDeadline;
       int i = 0;
       if (ttkConfig - i) {
          p0.writeUInt64(3, ttkConfig);
       }
       ttkConfig = this.serverTimestamp;
       if (ttkConfig - i) {
          p0.writeUInt64(4, ttkConfig);
       }
       super.writeTo(p0);
       return;
    }
}
