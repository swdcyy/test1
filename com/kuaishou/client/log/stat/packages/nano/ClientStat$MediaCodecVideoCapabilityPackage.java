package com.kuaishou.client.log.stat.packages.nano.ClientStat$MediaCodecVideoCapabilityPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$MediaCodecVideoCapability;

public final class ClientStat$MediaCodecVideoCapabilityPackage extends MessageNano	// class@00140b
{
    public ClientStat$MediaCodecVideoCapability avcCaps;
    public ClientStat$MediaCodecVideoCapability hevcCaps;
    public static ClientStat$MediaCodecVideoCapabilityPackage[] _emptyArray;

    public void ClientStat$MediaCodecVideoCapabilityPackage(){
       super();
       this.clear();
    }
    public static ClientStat$MediaCodecVideoCapabilityPackage[] emptyArray(){
       if (ClientStat$MediaCodecVideoCapabilityPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$MediaCodecVideoCapabilityPackage._emptyArray == null) {
             ClientStat$MediaCodecVideoCapabilityPackage[] mediaCodecVi = new ClientStat$MediaCodecVideoCapabilityPackage[0];
             ClientStat$MediaCodecVideoCapabilityPackage._emptyArray = mediaCodecVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$MediaCodecVideoCapabilityPackage._emptyArray;
    }
    public static ClientStat$MediaCodecVideoCapabilityPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$MediaCodecVideoCapabilityPackage().mergeFrom(p0);
    }
    public static ClientStat$MediaCodecVideoCapabilityPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$MediaCodecVideoCapabilityPackage(), p0);
    }
    public ClientStat$MediaCodecVideoCapabilityPackage clear(){
       this.avcCaps = null;
       this.hevcCaps = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$MediaCodecVideoCapabilityPackage tavcCaps = this.avcCaps;
       if (tavcCaps != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tavcCaps);
       }
       tavcCaps = this.hevcCaps;
       if (tavcCaps != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tavcCaps);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$MediaCodecVideoCapabilityPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.hevcCaps == null){
                this.hevcCaps = new ClientStat$MediaCodecVideoCapability();
             }
             p0.readMessage(this.hevcCaps);
          }else if(this.avcCaps == null){
             this.avcCaps = new ClientStat$MediaCodecVideoCapability();
          }
          p0.readMessage(this.avcCaps);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$MediaCodecVideoCapabilityPackage tavcCaps = this.avcCaps;
       if (tavcCaps != null) {
          p0.writeMessage(1, tavcCaps);
       }
       tavcCaps = this.hevcCaps;
       if (tavcCaps != null) {
          p0.writeMessage(2, tavcCaps);
       }
       super.writeTo(p0);
       return;
    }
}
