package com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceContextCarrier;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceUpstreamInfo;
import com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceId;

public final class LiveKtraceProto$AppKTraceContextCarrier extends MessageNano	// class@0011d5
{
    public Map baggageItems;
    public String bizName;
    public LiveKtraceProto$AppKTraceId primaryTraceId;
    public boolean sampled;
    public LiveKtraceProto$AppKTraceId segmentId;
    public String serviceName;
    public int spanId;
    public LiveKtraceProto$AppKTraceUpstreamInfo upstreamInfo;
    public int version;
    public static LiveKtraceProto$AppKTraceContextCarrier[] _emptyArray;

    public void LiveKtraceProto$AppKTraceContextCarrier(){
       super();
       this.clear();
    }
    public static LiveKtraceProto$AppKTraceContextCarrier[] emptyArray(){
       if (LiveKtraceProto$AppKTraceContextCarrier._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKtraceProto$AppKTraceContextCarrier._emptyArray == null) {
             LiveKtraceProto$AppKTraceContextCarrier[] uAppKTraceCo = new LiveKtraceProto$AppKTraceContextCarrier[0];
             LiveKtraceProto$AppKTraceContextCarrier._emptyArray = uAppKTraceCo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKtraceProto$AppKTraceContextCarrier._emptyArray;
    }
    public static LiveKtraceProto$AppKTraceContextCarrier parseFrom(CodedInputByteBufferNano p0){
       return new LiveKtraceProto$AppKTraceContextCarrier().mergeFrom(p0);
    }
    public static LiveKtraceProto$AppKTraceContextCarrier parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKtraceProto$AppKTraceContextCarrier(), p0);
    }
    public LiveKtraceProto$AppKTraceContextCarrier clear(){
       this.version = 0;
       this.primaryTraceId = null;
       this.segmentId = null;
       this.spanId = 0;
       this.serviceName = "";
       this.bizName = "";
       this.sampled = false;
       this.baggageItems = null;
       this.upstreamInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveKtraceProto$AppKTraceContextCarrier tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tversion);
       }
       tversion = this.primaryTraceId;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tversion);
       }
       tversion = this.segmentId;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tversion);
       }
       tversion = this.spanId;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tversion);
       }
       String str = "";
       if (!(this.serviceName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.serviceName);
       }
       if (!(this.bizName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.bizName);
       }
       tversion = this.sampled;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tversion);
       }
       tversion = this.baggageItems;
       if (tversion != null) {
          i = i + InternalNano.computeMapFieldSize(tversion, 8, 9, 9);
       }
       tversion = this.upstreamInfo;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKtraceProto$AppKTraceContextCarrier mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else if(this.upstreamInfo == null){
                                     this.upstreamInfo = new LiveKtraceProto$AppKTraceUpstreamInfo();
                                  }
                                  p0.readMessage(this.upstreamInfo);
                               }else {
                                  this.baggageItems = InternalNano.mergeMapEntry(p0, this.baggageItems, mapFactory, 9, 9, null, 10, 18);
                               }
                            }else {
                               this.sampled = p0.readBool();
                            }
                         }else {
                            this.bizName = p0.readString();
                         }
                      }else {
                         this.serviceName = p0.readString();
                      }
                   }else {
                      this.spanId = p0.readUInt32();
                   }
                }else if(this.segmentId == null){
                   this.segmentId = new LiveKtraceProto$AppKTraceId();
                }
                p0.readMessage(this.segmentId);
             }else if(this.primaryTraceId == null){
                this.primaryTraceId = new LiveKtraceProto$AppKTraceId();
             }
             p0.readMessage(this.primaryTraceId);
          }else {
             this.version = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveKtraceProto$AppKTraceContextCarrier tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(1, tversion);
       }
       tversion = this.primaryTraceId;
       if (tversion != null) {
          p0.writeMessage(2, tversion);
       }
       tversion = this.segmentId;
       if (tversion != null) {
          p0.writeMessage(3, tversion);
       }
       tversion = this.spanId;
       if (tversion != null) {
          p0.writeUInt32(4, tversion);
       }
       String str = "";
       if (!(this.serviceName).equals(str)) {
          p0.writeString(5, this.serviceName);
       }
       if (!(this.bizName).equals(str)) {
          p0.writeString(6, this.bizName);
       }
       tversion = this.sampled;
       if (tversion != null) {
          p0.writeBool(7, tversion);
       }
       tversion = this.baggageItems;
       if (tversion != null) {
          InternalNano.serializeMapField(p0, tversion, 8, 9, 9);
       }
       tversion = this.upstreamInfo;
       if (tversion != null) {
          p0.writeMessage(9, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
