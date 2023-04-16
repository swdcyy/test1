package com.kuaishou.client.log.packages.nano.ClientBase$TimePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$TimePackage extends MessageNano	// class@000783
{
    public long clientTimeDiff;
    public long clientTimeDifference;
    public int syncStatus;
    public String timeZone;
    public static ClientBase$TimePackage[] _emptyArray;

    public void ClientBase$TimePackage(){
       super();
       this.clear();
    }
    public static ClientBase$TimePackage[] emptyArray(){
       if (ClientBase$TimePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$TimePackage._emptyArray == null) {
             ClientBase$TimePackage[] timePackageA = new ClientBase$TimePackage[0];
             ClientBase$TimePackage._emptyArray = timePackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$TimePackage._emptyArray;
    }
    public static ClientBase$TimePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$TimePackage().mergeFrom(p0);
    }
    public static ClientBase$TimePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$TimePackage(), p0);
    }
    public ClientBase$TimePackage clear(){
       this.syncStatus = 0;
       this.clientTimeDiff = 0;
       this.timeZone = "";
       this.clientTimeDifference = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientBase$TimePackage tsyncStatus = this.syncStatus;
       if (tsyncStatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsyncStatus);
       }
       tsyncStatus = this.clientTimeDiff;
       int i1 = 0;
       if (tsyncStatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tsyncStatus);
       }
       if (!(this.timeZone).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.timeZone);
       }
       tsyncStatus = this.clientTimeDifference;
       if (tsyncStatus - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, tsyncStatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$TimePackage mergeFrom(CodedInputByteBufferNano p0){
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
                      this.clientTimeDifference = p0.readInt64();
                   }
                }else {
                   this.timeZone = p0.readString();
                }
             }else {
                this.clientTimeDiff = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.syncStatus = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientBase$TimePackage tsyncStatus = this.syncStatus;
       if (tsyncStatus != null) {
          p0.writeInt32(1, tsyncStatus);
       }
       tsyncStatus = this.clientTimeDiff;
       int i = 0;
       if (tsyncStatus - i) {
          p0.writeUInt64(2, tsyncStatus);
       }
       if (!(this.timeZone).equals("")) {
          p0.writeString(3, this.timeZone);
       }
       tsyncStatus = this.clientTimeDifference;
       if (tsyncStatus - i) {
          p0.writeInt64(4, tsyncStatus);
       }
       super.writeTo(p0);
       return;
    }
}
