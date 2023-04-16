package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LaunchTimeDifferencePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LaunchTimeDifferencePackage extends MessageNano	// class@001319
{
    public boolean isColdStart;
    public long timeDifferenceSinceAppLaunched;
    public static ClientContentWrapper$LaunchTimeDifferencePackage[] _emptyArray;

    public void ClientContentWrapper$LaunchTimeDifferencePackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LaunchTimeDifferencePackage[] emptyArray(){
       if (ClientContentWrapper$LaunchTimeDifferencePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LaunchTimeDifferencePackage._emptyArray == null) {
             ClientContentWrapper$LaunchTimeDifferencePackage[] launchTimeDi = new ClientContentWrapper$LaunchTimeDifferencePackage[0];
             ClientContentWrapper$LaunchTimeDifferencePackage._emptyArray = launchTimeDi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LaunchTimeDifferencePackage._emptyArray;
    }
    public static ClientContentWrapper$LaunchTimeDifferencePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LaunchTimeDifferencePackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LaunchTimeDifferencePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LaunchTimeDifferencePackage(), p0);
    }
    public ClientContentWrapper$LaunchTimeDifferencePackage clear(){
       this.timeDifferenceSinceAppLaunched = 0;
       this.isColdStart = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$LaunchTimeDifferencePackage ttimeDiffere = this.timeDifferenceSinceAppLaunched;
       if (ttimeDiffere) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimeDiffere);
       }
       ttimeDiffere = this.isColdStart;
       if (ttimeDiffere != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, ttimeDiffere);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LaunchTimeDifferencePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.isColdStart = p0.readBool();
             }
          }else {
             this.timeDifferenceSinceAppLaunched = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$LaunchTimeDifferencePackage ttimeDiffere = this.timeDifferenceSinceAppLaunched;
       if (ttimeDiffere) {
          p0.writeUInt64(1, ttimeDiffere);
       }
       ttimeDiffere = this.isColdStart;
       if (ttimeDiffere != null) {
          p0.writeBool(2, ttimeDiffere);
       }
       super.writeTo(p0);
       return;
    }
}
