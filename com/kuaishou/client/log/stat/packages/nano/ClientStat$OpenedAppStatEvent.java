package com.kuaishou.client.log.stat.packages.nano.ClientStat$OpenedAppStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;

public final class ClientStat$OpenedAppStatEvent extends MessageNano	// class@0007f1
{
    public long enterBackgroundTimestamp;
    public ClientBase$ApplicationPackage firstOpenedApp;
    public static ClientStat$OpenedAppStatEvent[] _emptyArray;

    public void ClientStat$OpenedAppStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$OpenedAppStatEvent[] emptyArray(){
       if (ClientStat$OpenedAppStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$OpenedAppStatEvent._emptyArray == null) {
             ClientStat$OpenedAppStatEvent[] openedAppSta = new ClientStat$OpenedAppStatEvent[0];
             ClientStat$OpenedAppStatEvent._emptyArray = openedAppSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$OpenedAppStatEvent._emptyArray;
    }
    public static ClientStat$OpenedAppStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$OpenedAppStatEvent().mergeFrom(p0);
    }
    public static ClientStat$OpenedAppStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$OpenedAppStatEvent(), p0);
    }
    public ClientStat$OpenedAppStatEvent clear(){
       this.enterBackgroundTimestamp = 0;
       this.firstOpenedApp = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$OpenedAppStatEvent tenterBackgr = this.enterBackgroundTimestamp;
       if (tenterBackgr) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tenterBackgr);
       }
       tenterBackgr = this.firstOpenedApp;
       if (tenterBackgr != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tenterBackgr);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$OpenedAppStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.firstOpenedApp == null){
                this.firstOpenedApp = new ClientBase$ApplicationPackage();
             }
             p0.readMessage(this.firstOpenedApp);
          }else {
             this.enterBackgroundTimestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$OpenedAppStatEvent tenterBackgr = this.enterBackgroundTimestamp;
       if (tenterBackgr) {
          p0.writeUInt64(1, tenterBackgr);
       }
       tenterBackgr = this.firstOpenedApp;
       if (tenterBackgr != null) {
          p0.writeMessage(2, tenterBackgr);
       }
       super.writeTo(p0);
       return;
    }
}
