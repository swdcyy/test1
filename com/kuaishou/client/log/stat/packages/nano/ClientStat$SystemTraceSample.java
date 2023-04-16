package com.kuaishou.client.log.stat.packages.nano.ClientStat$SystemTraceSample;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$SystemTraceSample extends MessageNano	// class@001432
{
    public long endTimestamp;
    public long startTimestamp;
    public int systraceType;
    public String traceDetail;
    public int type;
    public static ClientStat$SystemTraceSample[] _emptyArray;

    public void ClientStat$SystemTraceSample(){
       super();
       this.clear();
    }
    public static ClientStat$SystemTraceSample[] emptyArray(){
       if (ClientStat$SystemTraceSample._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$SystemTraceSample._emptyArray == null) {
             ClientStat$SystemTraceSample[] systemTraceS = new ClientStat$SystemTraceSample[0];
             ClientStat$SystemTraceSample._emptyArray = systemTraceS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$SystemTraceSample._emptyArray;
    }
    public static ClientStat$SystemTraceSample parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$SystemTraceSample().mergeFrom(p0);
    }
    public static ClientStat$SystemTraceSample parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$SystemTraceSample(), p0);
    }
    public ClientStat$SystemTraceSample clear(){
       this.systraceType = 0;
       this.type = 0;
       this.startTimestamp = 0;
       this.endTimestamp = 0;
       this.traceDetail = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$SystemTraceSample tsystraceTyp = this.systraceType;
       if (tsystraceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsystraceTyp);
       }
       tsystraceTyp = this.type;
       if (tsystraceTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tsystraceTyp);
       }
       tsystraceTyp = this.startTimestamp;
       int i1 = 0;
       if (tsystraceTyp - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tsystraceTyp);
       }
       tsystraceTyp = this.endTimestamp;
       if (tsystraceTyp - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, tsystraceTyp);
       }
       if (!(this.traceDetail).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.traceDetail);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$SystemTraceSample mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.traceDetail = p0.readString();
                      }
                   }else {
                      this.endTimestamp = p0.readInt64();
                   }
                }else {
                   this.startTimestamp = p0.readInt64();
                }
             }else {
                this.type = p0.readInt32();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.systraceType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$SystemTraceSample tsystraceTyp = this.systraceType;
       if (tsystraceTyp != null) {
          p0.writeInt32(1, tsystraceTyp);
       }
       tsystraceTyp = this.type;
       if (tsystraceTyp != null) {
          p0.writeInt32(2, tsystraceTyp);
       }
       tsystraceTyp = this.startTimestamp;
       int i = 0;
       if (tsystraceTyp - i) {
          p0.writeInt64(3, tsystraceTyp);
       }
       tsystraceTyp = this.endTimestamp;
       if (tsystraceTyp - i) {
          p0.writeInt64(4, tsystraceTyp);
       }
       if (!(this.traceDetail).equals("")) {
          p0.writeString(5, this.traceDetail);
       }
       super.writeTo(p0);
       return;
    }
}
