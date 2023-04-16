package com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceModelPb;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveKtraceProto$AppKTraceModelPb extends MessageNano	// class@0011d7
{
    public String az;
    public String catalog;
    public String dc;
    public String deployType;
    public String group;
    public String laneId;
    public String productName;
    public String productVersion;
    public String region;
    public String serviceName;
    public String stage;
    public String version;
    public static LiveKtraceProto$AppKTraceModelPb[] _emptyArray;

    public void LiveKtraceProto$AppKTraceModelPb(){
       super();
       this.clear();
    }
    public static LiveKtraceProto$AppKTraceModelPb[] emptyArray(){
       if (LiveKtraceProto$AppKTraceModelPb._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKtraceProto$AppKTraceModelPb._emptyArray == null) {
             LiveKtraceProto$AppKTraceModelPb[] uAppKTraceMo = new LiveKtraceProto$AppKTraceModelPb[0];
             LiveKtraceProto$AppKTraceModelPb._emptyArray = uAppKTraceMo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKtraceProto$AppKTraceModelPb._emptyArray;
    }
    public static LiveKtraceProto$AppKTraceModelPb parseFrom(CodedInputByteBufferNano p0){
       return new LiveKtraceProto$AppKTraceModelPb().mergeFrom(p0);
    }
    public static LiveKtraceProto$AppKTraceModelPb parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKtraceProto$AppKTraceModelPb(), p0);
    }
    public LiveKtraceProto$AppKTraceModelPb clear(){
       this.serviceName = "";
       this.stage = "";
       this.region = "";
       this.az = "";
       this.dc = "";
       this.version = "";
       this.catalog = "";
       this.deployType = "";
       this.productName = "";
       this.productVersion = "";
       this.laneId = "";
       this.group = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.serviceName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.serviceName);
       }
       if (!(this.stage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.stage);
       }
       if (!(this.region).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.region);
       }
       if (!(this.az).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.az);
       }
       if (!(this.dc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.dc);
       }
       if (!(this.version).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.version);
       }
       if (!(this.catalog).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.catalog);
       }
       if (!(this.deployType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.deployType);
       }
       if (!(this.productName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.productName);
       }
       if (!(this.productVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.productVersion);
       }
       if (!(this.laneId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.laneId);
       }
       if (!(this.group).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.group);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKtraceProto$AppKTraceModelPb mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.serviceName = p0.readString();
                break;
              case 18:
                this.stage = p0.readString();
                break;
              case 26:
                this.region = p0.readString();
                break;
              case '"':
                this.az = p0.readString();
                break;
              case '*':
                this.dc = p0.readString();
                break;
              case '2':
                this.version = p0.readString();
                break;
              case ':':
                this.catalog = p0.readString();
                break;
              case 'B':
                this.deployType = p0.readString();
                break;
              case 'J':
                this.productName = p0.readString();
                break;
              case 'R':
                this.productVersion = p0.readString();
                break;
              case 'Z':
                this.laneId = p0.readString();
                break;
              case 'b':
                this.group = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.serviceName).equals(str)) {
          p0.writeString(1, this.serviceName);
       }
       if (!(this.stage).equals(str)) {
          p0.writeString(2, this.stage);
       }
       if (!(this.region).equals(str)) {
          p0.writeString(3, this.region);
       }
       if (!(this.az).equals(str)) {
          p0.writeString(4, this.az);
       }
       if (!(this.dc).equals(str)) {
          p0.writeString(5, this.dc);
       }
       if (!(this.version).equals(str)) {
          p0.writeString(6, this.version);
       }
       if (!(this.catalog).equals(str)) {
          p0.writeString(7, this.catalog);
       }
       if (!(this.deployType).equals(str)) {
          p0.writeString(8, this.deployType);
       }
       if (!(this.productName).equals(str)) {
          p0.writeString(9, this.productName);
       }
       if (!(this.productVersion).equals(str)) {
          p0.writeString(10, this.productVersion);
       }
       if (!(this.laneId).equals(str)) {
          p0.writeString(11, this.laneId);
       }
       if (!(this.group).equals(str)) {
          p0.writeString(12, this.group);
       }
       super.writeTo(p0);
       return;
    }
}
