package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLinePic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveActivityWidgetProto$LiveActivityWidgetLinePic extends MessageNano	// class@0010d6
{
    public UserInfos$PicUrl[] picUrl;
    public static LiveActivityWidgetProto$LiveActivityWidgetLinePic[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetLinePic(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLinePic[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetLinePic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetLinePic._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetLinePic[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetLinePic[0];
             LiveActivityWidgetProto$LiveActivityWidgetLinePic._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetLinePic._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLinePic parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetLinePic().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLinePic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetLinePic(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLinePic clear(){
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$LiveActivityWidgetLinePic tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i1 = 0;
          LiveActivityWidgetProto$LiveActivityWidgetLinePic tpicUrl1 = this.picUrl;
          while (i1 < tpicUrl1.length) {
             object oobject = tpicUrl1[i1];
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
    public LiveActivityWidgetProto$LiveActivityWidgetLinePic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 18;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveActivityWidgetProto$LiveActivityWidgetLinePic tpicUrl = this.picUrl;
             int i2 = (tpicUrl == null)? 0: tpicUrl.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             picUrlArray[i2] = new UserInfos$PicUrl();
             p0.readMessage(picUrlArray[i2]);
             this.picUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$LiveActivityWidgetLinePic tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i = 0;
          LiveActivityWidgetProto$LiveActivityWidgetLinePic tpicUrl1 = this.picUrl;
          while (i < tpicUrl1.length) {
             object oobject = tpicUrl1[i];
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
