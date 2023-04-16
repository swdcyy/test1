package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ApplicationStateInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$ApplicationStateInfoPackage extends MessageNano	// class@001303
{
    public int state;
    public static ClientContentWrapper$ApplicationStateInfoPackage[] _emptyArray;

    public void ClientContentWrapper$ApplicationStateInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$ApplicationStateInfoPackage[] emptyArray(){
       if (ClientContentWrapper$ApplicationStateInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$ApplicationStateInfoPackage._emptyArray == null) {
             ClientContentWrapper$ApplicationStateInfoPackage[] uApplication = new ClientContentWrapper$ApplicationStateInfoPackage[0];
             ClientContentWrapper$ApplicationStateInfoPackage._emptyArray = uApplication;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$ApplicationStateInfoPackage._emptyArray;
    }
    public static ClientContentWrapper$ApplicationStateInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$ApplicationStateInfoPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$ApplicationStateInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$ApplicationStateInfoPackage(), p0);
    }
    public ClientContentWrapper$ApplicationStateInfoPackage clear(){
       this.state = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$ApplicationStateInfoPackage tstate = this.state;
       if (tstate != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstate);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$ApplicationStateInfoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.state = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$ApplicationStateInfoPackage tstate = this.state;
       if (tstate != null) {
          p0.writeInt32(1, tstate);
       }
       super.writeTo(p0);
       return;
    }
}
