package com.kuaishou.protobuf.livestream.nano.SCLiveAuthorInfoRegionStatistics;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAuthorInfoRegionStatisticsModel;
import java.lang.Object;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class SCLiveAuthorInfoRegionStatistics extends MessageNano	// class@000d43
{
    public Map statisticsMap;
    public static SCLiveAuthorInfoRegionStatistics[] _emptyArray;

    public void SCLiveAuthorInfoRegionStatistics(){
       super();
       this.clear();
    }
    public static SCLiveAuthorInfoRegionStatistics[] emptyArray(){
       if (SCLiveAuthorInfoRegionStatistics._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveAuthorInfoRegionStatistics._emptyArray == null) {
             SCLiveAuthorInfoRegionStatistics[] sCLiveAuthor = new SCLiveAuthorInfoRegionStatistics[0];
             SCLiveAuthorInfoRegionStatistics._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveAuthorInfoRegionStatistics._emptyArray;
    }
    public static SCLiveAuthorInfoRegionStatistics parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveAuthorInfoRegionStatistics().mergeFrom(p0);
    }
    public static SCLiveAuthorInfoRegionStatistics parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveAuthorInfoRegionStatistics(), p0);
    }
    public SCLiveAuthorInfoRegionStatistics clear(){
       this.statisticsMap = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveAuthorInfoRegionStatistics tstatisticsM = this.statisticsMap;
       if (tstatisticsM != null) {
          i = i + InternalNano.computeMapFieldSize(tstatisticsM, 1, 13, 11);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveAuthorInfoRegionStatistics mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.statisticsMap = InternalNano.mergeMapEntry(p0, this.statisticsMap, mapFactory, 13, 11, new LiveAuthorInfoRegionStatisticsModel(), 8, 18);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveAuthorInfoRegionStatistics tstatisticsM = this.statisticsMap;
       if (tstatisticsM != null) {
          InternalNano.serializeMapField(p0, tstatisticsM, 1, 13, 11);
       }
       super.writeTo(p0);
       return;
    }
}
