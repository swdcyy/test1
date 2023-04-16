package com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRoute;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRouteModel;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveUserTaskProto$LiveUserTaskCommonRoute extends MessageNano	// class@0013be
{
    public LiveUserTaskProto$LiveUserTaskCommonRouteModel[] commonRoute;
    public static LiveUserTaskProto$LiveUserTaskCommonRoute[] _emptyArray;

    public void LiveUserTaskProto$LiveUserTaskCommonRoute(){
       super();
       this.clear();
    }
    public static LiveUserTaskProto$LiveUserTaskCommonRoute[] emptyArray(){
       if (LiveUserTaskProto$LiveUserTaskCommonRoute._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUserTaskProto$LiveUserTaskCommonRoute._emptyArray == null) {
             LiveUserTaskProto$LiveUserTaskCommonRoute[] liveUserTask = new LiveUserTaskProto$LiveUserTaskCommonRoute[0];
             LiveUserTaskProto$LiveUserTaskCommonRoute._emptyArray = liveUserTask;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUserTaskProto$LiveUserTaskCommonRoute._emptyArray;
    }
    public static LiveUserTaskProto$LiveUserTaskCommonRoute parseFrom(CodedInputByteBufferNano p0){
       return new LiveUserTaskProto$LiveUserTaskCommonRoute().mergeFrom(p0);
    }
    public static LiveUserTaskProto$LiveUserTaskCommonRoute parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUserTaskProto$LiveUserTaskCommonRoute(), p0);
    }
    public LiveUserTaskProto$LiveUserTaskCommonRoute clear(){
       this.commonRoute = LiveUserTaskProto$LiveUserTaskCommonRouteModel.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUserTaskProto$LiveUserTaskCommonRoute tcommonRoute = this.commonRoute;
       if (tcommonRoute != null && tcommonRoute.length > 0) {
          int i1 = 0;
          LiveUserTaskProto$LiveUserTaskCommonRoute tcommonRoute1 = this.commonRoute;
          while (i1 < tcommonRoute1.length) {
             object oobject = tcommonRoute1[i1];
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
    public LiveUserTaskProto$LiveUserTaskCommonRoute mergeFrom(CodedInputByteBufferNano p0){
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
             LiveUserTaskProto$LiveUserTaskCommonRoute tcommonRoute = this.commonRoute;
             int i2 = (tcommonRoute == null)? 0: tcommonRoute.length;
             i = i + i2;
             LiveUserTaskProto$LiveUserTaskCommonRouteModel[] liveUserTask = new LiveUserTaskProto$LiveUserTaskCommonRouteModel[i];
             if (i2) {
                System.arraycopy(tcommonRoute, 0, liveUserTask, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveUserTask[i2] = new LiveUserTaskProto$LiveUserTaskCommonRouteModel();
                p0.readMessage(liveUserTask[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveUserTask[i2] = new LiveUserTaskProto$LiveUserTaskCommonRouteModel();
             p0.readMessage(liveUserTask[i2]);
             this.commonRoute = liveUserTask;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUserTaskProto$LiveUserTaskCommonRoute tcommonRoute = this.commonRoute;
       if (tcommonRoute != null && tcommonRoute.length > 0) {
          int i = 0;
          LiveUserTaskProto$LiveUserTaskCommonRoute tcommonRoute1 = this.commonRoute;
          while (i < tcommonRoute1.length) {
             object oobject = tcommonRoute1[i];
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
