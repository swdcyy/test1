package com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoShakeActivity;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoShakeActivityConfig;

public final class SCLiveRevenueActivityInfoShakeActivity extends MessageNano	// class@00143f
{
    public String activityId;
    public boolean enable;
    public SCLiveRevenueActivityInfoShakeActivityConfig shakeActivityConfig;
    public long shakeMinIntervalMs;
    public static SCLiveRevenueActivityInfoShakeActivity[] _emptyArray;

    public void SCLiveRevenueActivityInfoShakeActivity(){
       super();
       this.clear();
    }
    public static SCLiveRevenueActivityInfoShakeActivity[] emptyArray(){
       if (SCLiveRevenueActivityInfoShakeActivity._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRevenueActivityInfoShakeActivity._emptyArray == null) {
             SCLiveRevenueActivityInfoShakeActivity[] sCLiveRevenu = new SCLiveRevenueActivityInfoShakeActivity[0];
             SCLiveRevenueActivityInfoShakeActivity._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRevenueActivityInfoShakeActivity._emptyArray;
    }
    public static SCLiveRevenueActivityInfoShakeActivity parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRevenueActivityInfoShakeActivity().mergeFrom(p0);
    }
    public static SCLiveRevenueActivityInfoShakeActivity parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRevenueActivityInfoShakeActivity(), p0);
    }
    public SCLiveRevenueActivityInfoShakeActivity clear(){
       this.activityId = "";
       this.enable = false;
       this.shakeMinIntervalMs = 0;
       this.shakeActivityConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.activityId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityId);
       }
       SCLiveRevenueActivityInfoShakeActivity tenable = this.enable;
       if (tenable != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tenable);
       }
       tenable = this.shakeMinIntervalMs;
       if (tenable) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tenable);
       }
       tenable = this.shakeActivityConfig;
       if (tenable != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tenable);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRevenueActivityInfoShakeActivity mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.shakeActivityConfig == null){
                      this.shakeActivityConfig = new SCLiveRevenueActivityInfoShakeActivityConfig();
                   }
                   p0.readMessage(this.shakeActivityConfig);
                }else {
                   this.shakeMinIntervalMs = p0.readUInt64();
                }
             }else {
                this.enable = p0.readBool();
             }
          }else {
             this.activityId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.activityId).equals("")) {
          p0.writeString(1, this.activityId);
       }
       SCLiveRevenueActivityInfoShakeActivity tenable = this.enable;
       if (tenable != null) {
          p0.writeBool(2, tenable);
       }
       tenable = this.shakeMinIntervalMs;
       if (tenable) {
          p0.writeUInt64(3, tenable);
       }
       tenable = this.shakeActivityConfig;
       if (tenable != null) {
          p0.writeMessage(4, tenable);
       }
       super.writeTo(p0);
       return;
    }
}
