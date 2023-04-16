package com.kuaishou.protobuf.livestream.nano.LiveAuthorInfoRegionStatisticsModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAuthorInfoRegionStatisticsModel extends MessageNano	// class@000c3e
{
    public String displayCount;
    public long realCount;
    public static LiveAuthorInfoRegionStatisticsModel[] _emptyArray;

    public void LiveAuthorInfoRegionStatisticsModel(){
       super();
       this.clear();
    }
    public static LiveAuthorInfoRegionStatisticsModel[] emptyArray(){
       if (LiveAuthorInfoRegionStatisticsModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAuthorInfoRegionStatisticsModel._emptyArray == null) {
             LiveAuthorInfoRegionStatisticsModel[] liveAuthorIn = new LiveAuthorInfoRegionStatisticsModel[0];
             LiveAuthorInfoRegionStatisticsModel._emptyArray = liveAuthorIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAuthorInfoRegionStatisticsModel._emptyArray;
    }
    public static LiveAuthorInfoRegionStatisticsModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveAuthorInfoRegionStatisticsModel().mergeFrom(p0);
    }
    public static LiveAuthorInfoRegionStatisticsModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAuthorInfoRegionStatisticsModel(), p0);
    }
    public LiveAuthorInfoRegionStatisticsModel clear(){
       this.realCount = 0;
       this.displayCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAuthorInfoRegionStatisticsModel trealCount = this.realCount;
       if (trealCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trealCount);
       }
       if (!(this.displayCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAuthorInfoRegionStatisticsModel mergeFrom(CodedInputByteBufferNano p0){
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
                this.displayCount = p0.readString();
             }
          }else {
             this.realCount = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAuthorInfoRegionStatisticsModel trealCount = this.realCount;
       if (trealCount) {
          p0.writeUInt64(1, trealCount);
       }
       if (!(this.displayCount).equals("")) {
          p0.writeString(2, this.displayCount);
       }
       super.writeTo(p0);
       return;
    }
}
