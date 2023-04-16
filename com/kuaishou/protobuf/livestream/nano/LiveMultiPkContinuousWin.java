package com.kuaishou.protobuf.livestream.nano.LiveMultiPkContinuousWin;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiContinuousWinInfo;
import java.lang.Object;

public final class LiveMultiPkContinuousWin extends MessageNano	// class@000cbc
{
    public Map continuousWinMap;
    public boolean enableContinuousWin;
    public static LiveMultiPkContinuousWin[] _emptyArray;

    public void LiveMultiPkContinuousWin(){
       super();
       this.clear();
    }
    public static LiveMultiPkContinuousWin[] emptyArray(){
       if (LiveMultiPkContinuousWin._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkContinuousWin._emptyArray == null) {
             LiveMultiPkContinuousWin[] liveMultiPkC = new LiveMultiPkContinuousWin[0];
             LiveMultiPkContinuousWin._emptyArray = liveMultiPkC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkContinuousWin._emptyArray;
    }
    public static LiveMultiPkContinuousWin parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkContinuousWin().mergeFrom(p0);
    }
    public static LiveMultiPkContinuousWin parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkContinuousWin(), p0);
    }
    public LiveMultiPkContinuousWin clear(){
       this.enableContinuousWin = false;
       this.continuousWinMap = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiPkContinuousWin tenableConti = this.enableContinuousWin;
       if (tenableConti != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableConti);
       }
       tenableConti = this.continuousWinMap;
       if (tenableConti != null) {
          i = i + InternalNano.computeMapFieldSize(tenableConti, 2, 4, 11);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkContinuousWin mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.continuousWinMap = InternalNano.mergeMapEntry(p0, this.continuousWinMap, mapFactory, 4, 11, new LiveMultiContinuousWinInfo(), 8, 18);
             }
          }else {
             this.enableContinuousWin = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiPkContinuousWin tenableConti = this.enableContinuousWin;
       if (tenableConti != null) {
          p0.writeBool(1, tenableConti);
       }
       tenableConti = this.continuousWinMap;
       if (tenableConti != null) {
          InternalNano.serializeMapField(p0, tenableConti, 2, 4, 11);
       }
       super.writeTo(p0);
       return;
    }
}
