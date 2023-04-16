package com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRouteModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveUserTaskProto$LiveUserTaskCommonRouteModel extends MessageNano	// class@0013c0
{
    public String bizId;
    public int bizType;
    public String routeUrl;
    public static LiveUserTaskProto$LiveUserTaskCommonRouteModel[] _emptyArray;

    public void LiveUserTaskProto$LiveUserTaskCommonRouteModel(){
       super();
       this.clear();
    }
    public static LiveUserTaskProto$LiveUserTaskCommonRouteModel[] emptyArray(){
       if (LiveUserTaskProto$LiveUserTaskCommonRouteModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUserTaskProto$LiveUserTaskCommonRouteModel._emptyArray == null) {
             LiveUserTaskProto$LiveUserTaskCommonRouteModel[] liveUserTask = new LiveUserTaskProto$LiveUserTaskCommonRouteModel[0];
             LiveUserTaskProto$LiveUserTaskCommonRouteModel._emptyArray = liveUserTask;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUserTaskProto$LiveUserTaskCommonRouteModel._emptyArray;
    }
    public static LiveUserTaskProto$LiveUserTaskCommonRouteModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveUserTaskProto$LiveUserTaskCommonRouteModel().mergeFrom(p0);
    }
    public static LiveUserTaskProto$LiveUserTaskCommonRouteModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUserTaskProto$LiveUserTaskCommonRouteModel(), p0);
    }
    public LiveUserTaskProto$LiveUserTaskCommonRouteModel clear(){
       this.bizType = 0;
       this.bizId = "";
       this.routeUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUserTaskProto$LiveUserTaskCommonRouteModel tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       if (!(this.routeUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.routeUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUserTaskProto$LiveUserTaskCommonRouteModel mergeFrom(CodedInputByteBufferNano p0){
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
                   this.routeUrl = p0.readString();
                }
             }else {
                this.bizId = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUserTaskProto$LiveUserTaskCommonRouteModel tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(2, this.bizId);
       }
       if (!(this.routeUrl).equals(str)) {
          p0.writeString(3, this.routeUrl);
       }
       super.writeTo(p0);
       return;
    }
}
