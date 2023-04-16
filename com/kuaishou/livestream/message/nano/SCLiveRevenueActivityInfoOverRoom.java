package com.kuaishou.livestream.message.nano.SCLiveRevenueActivityInfoOverRoom;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveRevenueActivityInfoOverRoom extends MessageNano	// class@00143e
{
    public String activityId;
    public boolean enable;
    public long maxDelayMs;
    public static SCLiveRevenueActivityInfoOverRoom[] _emptyArray;

    public void SCLiveRevenueActivityInfoOverRoom(){
       super();
       this.clear();
    }
    public static SCLiveRevenueActivityInfoOverRoom[] emptyArray(){
       if (SCLiveRevenueActivityInfoOverRoom._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRevenueActivityInfoOverRoom._emptyArray == null) {
             SCLiveRevenueActivityInfoOverRoom[] sCLiveRevenu = new SCLiveRevenueActivityInfoOverRoom[0];
             SCLiveRevenueActivityInfoOverRoom._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRevenueActivityInfoOverRoom._emptyArray;
    }
    public static SCLiveRevenueActivityInfoOverRoom parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRevenueActivityInfoOverRoom().mergeFrom(p0);
    }
    public static SCLiveRevenueActivityInfoOverRoom parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRevenueActivityInfoOverRoom(), p0);
    }
    public SCLiveRevenueActivityInfoOverRoom clear(){
       this.activityId = "";
       this.enable = false;
       this.maxDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.activityId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityId);
       }
       SCLiveRevenueActivityInfoOverRoom tenable = this.enable;
       if (tenable != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tenable);
       }
       tenable = this.maxDelayMs;
       if (tenable) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tenable);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRevenueActivityInfoOverRoom mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.maxDelayMs = p0.readUInt64();
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
       SCLiveRevenueActivityInfoOverRoom tenable = this.enable;
       if (tenable != null) {
          p0.writeBool(2, tenable);
       }
       tenable = this.maxDelayMs;
       if (tenable) {
          p0.writeUInt64(3, tenable);
       }
       super.writeTo(p0);
       return;
    }
}
