package com.kuaishou.client.log.packages.nano.ClientCommon$AdditionalSeqIdPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientCommon$AdditionalSeqIdPackage extends MessageNano	// class@000786
{
    public int channel;
    public long channelSeqId;
    public long customSeqId;
    public String customType;
    public static ClientCommon$AdditionalSeqIdPackage[] _emptyArray;

    public void ClientCommon$AdditionalSeqIdPackage(){
       super();
       this.clear();
    }
    public static ClientCommon$AdditionalSeqIdPackage[] emptyArray(){
       if (ClientCommon$AdditionalSeqIdPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommon$AdditionalSeqIdPackage._emptyArray == null) {
             ClientCommon$AdditionalSeqIdPackage[] uAdditionalS = new ClientCommon$AdditionalSeqIdPackage[0];
             ClientCommon$AdditionalSeqIdPackage._emptyArray = uAdditionalS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommon$AdditionalSeqIdPackage._emptyArray;
    }
    public static ClientCommon$AdditionalSeqIdPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommon$AdditionalSeqIdPackage().mergeFrom(p0);
    }
    public static ClientCommon$AdditionalSeqIdPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommon$AdditionalSeqIdPackage(), p0);
    }
    public ClientCommon$AdditionalSeqIdPackage clear(){
       this.channel = 0;
       this.channelSeqId = 0;
       this.customType = "";
       this.customSeqId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientCommon$AdditionalSeqIdPackage tchannel = this.channel;
       if (tchannel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tchannel);
       }
       tchannel = this.channelSeqId;
       int i1 = 0;
       if (tchannel - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tchannel);
       }
       if (!(this.customType).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.customType);
       }
       tchannel = this.customSeqId;
       if (tchannel - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tchannel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommon$AdditionalSeqIdPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.customSeqId = p0.readUInt64();
                   }
                }else {
                   this.customType = p0.readString();
                }
             }else {
                this.channelSeqId = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.channel = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientCommon$AdditionalSeqIdPackage tchannel = this.channel;
       if (tchannel != null) {
          p0.writeInt32(1, tchannel);
       }
       tchannel = this.channelSeqId;
       int i = 0;
       if (tchannel - i) {
          p0.writeUInt64(2, tchannel);
       }
       if (!(this.customType).equals("")) {
          p0.writeString(3, this.customType);
       }
       tchannel = this.customSeqId;
       if (tchannel - i) {
          p0.writeUInt64(4, tchannel);
       }
       super.writeTo(p0);
       return;
    }
}
