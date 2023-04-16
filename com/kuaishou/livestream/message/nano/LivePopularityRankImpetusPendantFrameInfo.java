package com.kuaishou.livestream.message.nano.LivePopularityRankImpetusPendantFrameInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantUnfold;
import com.kuaishou.livestream.message.nano.PopularityRankImpetusPendantFold;

public final class LivePopularityRankImpetusPendantFrameInfo extends MessageNano	// class@00124d
{
    public PopularityRankImpetusPendantFold pendantFold;
    public PopularityRankImpetusPendantUnfold pendantUnfold;
    public static LivePopularityRankImpetusPendantFrameInfo[] _emptyArray;

    public void LivePopularityRankImpetusPendantFrameInfo(){
       super();
       this.clear();
    }
    public static LivePopularityRankImpetusPendantFrameInfo[] emptyArray(){
       if (LivePopularityRankImpetusPendantFrameInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePopularityRankImpetusPendantFrameInfo._emptyArray == null) {
             LivePopularityRankImpetusPendantFrameInfo[] livePopulari = new LivePopularityRankImpetusPendantFrameInfo[0];
             LivePopularityRankImpetusPendantFrameInfo._emptyArray = livePopulari;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePopularityRankImpetusPendantFrameInfo._emptyArray;
    }
    public static LivePopularityRankImpetusPendantFrameInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePopularityRankImpetusPendantFrameInfo().mergeFrom(p0);
    }
    public static LivePopularityRankImpetusPendantFrameInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePopularityRankImpetusPendantFrameInfo(), p0);
    }
    public LivePopularityRankImpetusPendantFrameInfo clear(){
       this.pendantFold = null;
       this.pendantUnfold = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePopularityRankImpetusPendantFrameInfo tpendantFold = this.pendantFold;
       if (tpendantFold != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tpendantFold);
       }
       tpendantFold = this.pendantUnfold;
       if (tpendantFold != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tpendantFold);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePopularityRankImpetusPendantFrameInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.pendantUnfold == null){
                this.pendantUnfold = new PopularityRankImpetusPendantUnfold();
             }
             p0.readMessage(this.pendantUnfold);
          }else if(this.pendantFold == null){
             this.pendantFold = new PopularityRankImpetusPendantFold();
          }
          p0.readMessage(this.pendantFold);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePopularityRankImpetusPendantFrameInfo tpendantFold = this.pendantFold;
       if (tpendantFold != null) {
          p0.writeMessage(1, tpendantFold);
       }
       tpendantFold = this.pendantUnfold;
       if (tpendantFold != null) {
          p0.writeMessage(2, tpendantFold);
       }
       super.writeTo(p0);
       return;
    }
}
