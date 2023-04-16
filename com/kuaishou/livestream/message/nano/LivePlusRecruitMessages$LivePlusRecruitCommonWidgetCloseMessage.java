package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage extends MessageNano	// class@00123d
{
    public int widgetType;
    public static LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage[] _emptyArray;

    public void LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage[] emptyArray(){
       if (LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage._emptyArray == null) {
             LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage[] livePlusRecr = new LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage[0];
             LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage._emptyArray = livePlusRecr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage._emptyArray;
    }
    public static LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage(), p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage clear(){
       this.widgetType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage twidgetType = this.widgetType;
       if (twidgetType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, twidgetType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.widgetType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePlusRecruitMessages$LivePlusRecruitCommonWidgetCloseMessage twidgetType = this.widgetType;
       if (twidgetType != null) {
          p0.writeInt32(1, twidgetType);
       }
       super.writeTo(p0);
       return;
    }
}
