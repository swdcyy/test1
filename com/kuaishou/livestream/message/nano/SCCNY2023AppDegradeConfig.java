package com.kuaishou.livestream.message.nano.SCCNY2023AppDegradeConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCCNY2023AppDegradeConfig extends MessageNano	// class@0013ee
{
    public String degradeConfig;
    public static SCCNY2023AppDegradeConfig[] _emptyArray;

    public void SCCNY2023AppDegradeConfig(){
       super();
       this.clear();
    }
    public static SCCNY2023AppDegradeConfig[] emptyArray(){
       if (SCCNY2023AppDegradeConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCCNY2023AppDegradeConfig._emptyArray == null) {
             SCCNY2023AppDegradeConfig[] sCCNY2023App = new SCCNY2023AppDegradeConfig[0];
             SCCNY2023AppDegradeConfig._emptyArray = sCCNY2023App;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCCNY2023AppDegradeConfig._emptyArray;
    }
    public static SCCNY2023AppDegradeConfig parseFrom(CodedInputByteBufferNano p0){
       return new SCCNY2023AppDegradeConfig().mergeFrom(p0);
    }
    public static SCCNY2023AppDegradeConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCCNY2023AppDegradeConfig(), p0);
    }
    public SCCNY2023AppDegradeConfig clear(){
       this.degradeConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.degradeConfig).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.degradeConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCCNY2023AppDegradeConfig mergeFrom(CodedInputByteBufferNano p0){
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
             this.degradeConfig = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.degradeConfig).equals("")) {
          p0.writeString(1, this.degradeConfig);
       }
       super.writeTo(p0);
       return;
    }
}
