package com.kuaishou.protobuf.livestream.nano.SCMultiLiveCommonAuthorInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;

public final class SCMultiLiveCommonAuthorInfo extends MessageNano	// class@000d74
{
    public Map authorLabelMap;
    public long timestamp;
    public static SCMultiLiveCommonAuthorInfo[] _emptyArray;

    public void SCMultiLiveCommonAuthorInfo(){
       super();
       this.clear();
    }
    public static SCMultiLiveCommonAuthorInfo[] emptyArray(){
       if (SCMultiLiveCommonAuthorInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMultiLiveCommonAuthorInfo._emptyArray == null) {
             SCMultiLiveCommonAuthorInfo[] sCMultiLiveC = new SCMultiLiveCommonAuthorInfo[0];
             SCMultiLiveCommonAuthorInfo._emptyArray = sCMultiLiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMultiLiveCommonAuthorInfo._emptyArray;
    }
    public static SCMultiLiveCommonAuthorInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCMultiLiveCommonAuthorInfo().mergeFrom(p0);
    }
    public static SCMultiLiveCommonAuthorInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMultiLiveCommonAuthorInfo(), p0);
    }
    public SCMultiLiveCommonAuthorInfo clear(){
       this.authorLabelMap = null;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCMultiLiveCommonAuthorInfo tauthorLabel = this.authorLabelMap;
       if (tauthorLabel != null) {
          i = i + InternalNano.computeMapFieldSize(tauthorLabel, 1, 4, 9);
       }
       tauthorLabel = this.timestamp;
       if (tauthorLabel) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorLabel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMultiLiveCommonAuthorInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.timestamp = p0.readUInt64();
             }
          }else {
             this.authorLabelMap = InternalNano.mergeMapEntry(p0, this.authorLabelMap, mapFactory, 4, 9, null, 8, 18);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCMultiLiveCommonAuthorInfo tauthorLabel = this.authorLabelMap;
       if (tauthorLabel != null) {
          InternalNano.serializeMapField(p0, tauthorLabel, 1, 4, 9);
       }
       tauthorLabel = this.timestamp;
       if (tauthorLabel) {
          p0.writeUInt64(2, tauthorLabel);
       }
       super.writeTo(p0);
       return;
    }
}
