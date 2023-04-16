package com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceUpstreamInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveKtraceProto$AppKTraceModelPb;

public final class LiveKtraceProto$AppKTraceUpstreamInfo extends MessageNano	// class@0011d8
{
    public String hostname;
    public String ipString;
    public LiveKtraceProto$AppKTraceModelPb kws;
    public static LiveKtraceProto$AppKTraceUpstreamInfo[] _emptyArray;

    public void LiveKtraceProto$AppKTraceUpstreamInfo(){
       super();
       this.clear();
    }
    public static LiveKtraceProto$AppKTraceUpstreamInfo[] emptyArray(){
       if (LiveKtraceProto$AppKTraceUpstreamInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveKtraceProto$AppKTraceUpstreamInfo._emptyArray == null) {
             LiveKtraceProto$AppKTraceUpstreamInfo[] uAppKTraceUp = new LiveKtraceProto$AppKTraceUpstreamInfo[0];
             LiveKtraceProto$AppKTraceUpstreamInfo._emptyArray = uAppKTraceUp;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveKtraceProto$AppKTraceUpstreamInfo._emptyArray;
    }
    public static LiveKtraceProto$AppKTraceUpstreamInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveKtraceProto$AppKTraceUpstreamInfo().mergeFrom(p0);
    }
    public static LiveKtraceProto$AppKTraceUpstreamInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveKtraceProto$AppKTraceUpstreamInfo(), p0);
    }
    public LiveKtraceProto$AppKTraceUpstreamInfo clear(){
       this.hostname = "";
       this.ipString = "";
       this.kws = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.hostname).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.hostname);
       }
       if (!(this.ipString).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.ipString);
       }
       LiveKtraceProto$AppKTraceUpstreamInfo tkws = this.kws;
       if (tkws != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tkws);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveKtraceProto$AppKTraceUpstreamInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.kws == null){
                   this.kws = new LiveKtraceProto$AppKTraceModelPb();
                }
                p0.readMessage(this.kws);
             }else {
                this.ipString = p0.readString();
             }
          }else {
             this.hostname = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.hostname).equals(str)) {
          p0.writeString(1, this.hostname);
       }
       if (!(this.ipString).equals(str)) {
          p0.writeString(2, this.ipString);
       }
       LiveKtraceProto$AppKTraceUpstreamInfo tkws = this.kws;
       if (tkws != null) {
          p0.writeMessage(3, tkws);
       }
       super.writeTo(p0);
       return;
    }
}
