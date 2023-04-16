package com.kuaishou.protobuf.livestream.nano.SCLiveOfficialProgrammeShuntAudience;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;

public final class SCLiveOfficialProgrammeShuntAudience extends MessageNano	// class@000d6b
{
    public Map liveStreamIdPercentMap;
    public long maxDelayMs;
    public long minDelayMs;
    public static SCLiveOfficialProgrammeShuntAudience[] _emptyArray;

    public void SCLiveOfficialProgrammeShuntAudience(){
       super();
       this.clear();
    }
    public static SCLiveOfficialProgrammeShuntAudience[] emptyArray(){
       if (SCLiveOfficialProgrammeShuntAudience._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveOfficialProgrammeShuntAudience._emptyArray == null) {
             SCLiveOfficialProgrammeShuntAudience[] sCLiveOffici = new SCLiveOfficialProgrammeShuntAudience[0];
             SCLiveOfficialProgrammeShuntAudience._emptyArray = sCLiveOffici;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveOfficialProgrammeShuntAudience._emptyArray;
    }
    public static SCLiveOfficialProgrammeShuntAudience parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveOfficialProgrammeShuntAudience().mergeFrom(p0);
    }
    public static SCLiveOfficialProgrammeShuntAudience parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveOfficialProgrammeShuntAudience(), p0);
    }
    public SCLiveOfficialProgrammeShuntAudience clear(){
       this.liveStreamIdPercentMap = null;
       this.minDelayMs = 0;
       this.maxDelayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveOfficialProgrammeShuntAudience tliveStreamI = this.liveStreamIdPercentMap;
       if (tliveStreamI != null) {
          i = i + InternalNano.computeMapFieldSize(tliveStreamI, 1, 9, 5);
       }
       tliveStreamI = this.minDelayMs;
       int i1 = 0;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tliveStreamI);
       }
       tliveStreamI = this.maxDelayMs;
       if (tliveStreamI - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tliveStreamI);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveOfficialProgrammeShuntAudience mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
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
                this.minDelayMs = p0.readUInt64();
             }
          }else {
             this.liveStreamIdPercentMap = InternalNano.mergeMapEntry(p0, this.liveStreamIdPercentMap, mapFactory, 9, 5, null, 10, 16);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveOfficialProgrammeShuntAudience tliveStreamI = this.liveStreamIdPercentMap;
       if (tliveStreamI != null) {
          InternalNano.serializeMapField(p0, tliveStreamI, 1, 9, 5);
       }
       tliveStreamI = this.minDelayMs;
       int i = 0;
       if (tliveStreamI - i) {
          p0.writeUInt64(2, tliveStreamI);
       }
       tliveStreamI = this.maxDelayMs;
       if (tliveStreamI - i) {
          p0.writeUInt64(3, tliveStreamI);
       }
       super.writeTo(p0);
       return;
    }
}
