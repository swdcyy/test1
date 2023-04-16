package com.kuaishou.livestream.message.nano.LiveDistrictRankForTk$SCLiveDistrictHourRankForTk;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveDistrictRankForTk$KdsInfo;

public final class LiveDistrictRankForTk$SCLiveDistrictHourRankForTk extends MessageNano	// class@001191
{
    public LiveDistrictRankForTk$KdsInfo kdsInfo;
    public static LiveDistrictRankForTk$SCLiveDistrictHourRankForTk[] _emptyArray;

    public void LiveDistrictRankForTk$SCLiveDistrictHourRankForTk(){
       super();
       this.clear();
    }
    public static LiveDistrictRankForTk$SCLiveDistrictHourRankForTk[] emptyArray(){
       if (LiveDistrictRankForTk$SCLiveDistrictHourRankForTk._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankForTk$SCLiveDistrictHourRankForTk._emptyArray == null) {
             LiveDistrictRankForTk$SCLiveDistrictHourRankForTk[] sCLiveDistri = new LiveDistrictRankForTk$SCLiveDistrictHourRankForTk[0];
             LiveDistrictRankForTk$SCLiveDistrictHourRankForTk._emptyArray = sCLiveDistri;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankForTk$SCLiveDistrictHourRankForTk._emptyArray;
    }
    public static LiveDistrictRankForTk$SCLiveDistrictHourRankForTk parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankForTk$SCLiveDistrictHourRankForTk().mergeFrom(p0);
    }
    public static LiveDistrictRankForTk$SCLiveDistrictHourRankForTk parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankForTk$SCLiveDistrictHourRankForTk(), p0);
    }
    public LiveDistrictRankForTk$SCLiveDistrictHourRankForTk clear(){
       this.kdsInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveDistrictRankForTk$SCLiveDistrictHourRankForTk tkdsInfo = this.kdsInfo;
       if (tkdsInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tkdsInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankForTk$SCLiveDistrictHourRankForTk mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.kdsInfo == null){
             this.kdsInfo = new LiveDistrictRankForTk$KdsInfo();
          }
          p0.readMessage(this.kdsInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveDistrictRankForTk$SCLiveDistrictHourRankForTk tkdsInfo = this.kdsInfo;
       if (tkdsInfo != null) {
          p0.writeMessage(1, tkdsInfo);
       }
       super.writeTo(p0);
       return;
    }
}
