package com.kuaishou.livestream.message.nano.LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance extends MessageNano	// class@001293
{
    public String bizId;
    public long bizPriority;
    public String logParams;
    public long serverTimestamp;
    public long showDeadline;
    public String text;
    public String textColor;
    public static LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance[] _emptyArray;

    public void LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance(){
       super();
       this.clear();
    }
    public static LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance[] emptyArray(){
       if (LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance._emptyArray == null) {
             LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance[] sCLiveRevenu = new LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance[0];
             LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance._emptyArray;
    }
    public static LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance parseFrom(CodedInputByteBufferNano p0){
       return new LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance().mergeFrom(p0);
    }
    public static LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance(), p0);
    }
    public LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance clear(){
       this.bizId = "";
       this.bizPriority = 0;
       this.text = "";
       this.textColor = "";
       this.showDeadline = 0;
       this.serverTimestamp = 0;
       this.logParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bizId);
       }
       LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance tbizPriority = this.bizPriority;
       if (tbizPriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tbizPriority);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.text);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.textColor);
       }
       tbizPriority = this.showDeadline;
       if (tbizPriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbizPriority);
       }
       tbizPriority = this.serverTimestamp;
       if (tbizPriority) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tbizPriority);
       }
       if (!(this.logParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.logParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.logParams = p0.readString();
                            }
                         }else {
                            this.serverTimestamp = p0.readUInt64();
                         }
                      }else {
                         this.showDeadline = p0.readUInt64();
                      }
                   }else {
                      this.textColor = p0.readString();
                   }
                }else {
                   this.text = p0.readString();
                }
             }else {
                this.bizPriority = p0.readUInt64();
             }
          }else {
             this.bizId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(1, this.bizId);
       }
       LiveRevenueRechargeOptimizationProto$SCLiveRevenueGiftPanelRechargeEntrance tbizPriority = this.bizPriority;
       if (tbizPriority) {
          p0.writeUInt64(2, tbizPriority);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(3, this.text);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(4, this.textColor);
       }
       tbizPriority = this.showDeadline;
       if (tbizPriority) {
          p0.writeUInt64(5, tbizPriority);
       }
       tbizPriority = this.serverTimestamp;
       if (tbizPriority) {
          p0.writeUInt64(6, tbizPriority);
       }
       if (!(this.logParams).equals(str)) {
          p0.writeString(7, this.logParams);
       }
       super.writeTo(p0);
       return;
    }
}
