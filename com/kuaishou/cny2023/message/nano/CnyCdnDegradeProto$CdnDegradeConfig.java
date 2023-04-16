package com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$CdnDegradeConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class CnyCdnDegradeProto$CdnDegradeConfig extends MessageNano	// class@00148c
{
    public int degradeLevel;
    public String degradeText;
    public String resourceType;
    public static CnyCdnDegradeProto$CdnDegradeConfig[] _emptyArray;

    public void CnyCdnDegradeProto$CdnDegradeConfig(){
       super();
       this.clear();
    }
    public static CnyCdnDegradeProto$CdnDegradeConfig[] emptyArray(){
       if (CnyCdnDegradeProto$CdnDegradeConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CnyCdnDegradeProto$CdnDegradeConfig._emptyArray == null) {
             CnyCdnDegradeProto$CdnDegradeConfig[] uCdnDegradeC = new CnyCdnDegradeProto$CdnDegradeConfig[0];
             CnyCdnDegradeProto$CdnDegradeConfig._emptyArray = uCdnDegradeC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CnyCdnDegradeProto$CdnDegradeConfig._emptyArray;
    }
    public static CnyCdnDegradeProto$CdnDegradeConfig parseFrom(CodedInputByteBufferNano p0){
       return new CnyCdnDegradeProto$CdnDegradeConfig().mergeFrom(p0);
    }
    public static CnyCdnDegradeProto$CdnDegradeConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CnyCdnDegradeProto$CdnDegradeConfig(), p0);
    }
    public CnyCdnDegradeProto$CdnDegradeConfig clear(){
       this.degradeLevel = 0;
       this.resourceType = "";
       this.degradeText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CnyCdnDegradeProto$CdnDegradeConfig tdegradeLeve = this.degradeLevel;
       if (tdegradeLeve != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tdegradeLeve);
       }
       String str = "";
       if (!(this.resourceType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.resourceType);
       }
       if (!(this.degradeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.degradeText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CnyCdnDegradeProto$CdnDegradeConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.degradeText = p0.readString();
                }
             }else {
                this.resourceType = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.degradeLevel = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CnyCdnDegradeProto$CdnDegradeConfig tdegradeLeve = this.degradeLevel;
       if (tdegradeLeve != null) {
          p0.writeInt32(1, tdegradeLeve);
       }
       String str = "";
       if (!(this.resourceType).equals(str)) {
          p0.writeString(2, this.resourceType);
       }
       if (!(this.degradeText).equals(str)) {
          p0.writeString(3, this.degradeText);
       }
       super.writeTo(p0);
       return;
    }
}
