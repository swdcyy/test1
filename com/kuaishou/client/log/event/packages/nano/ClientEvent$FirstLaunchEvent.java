package com.kuaishou.client.log.event.packages.nano.ClientEvent$FirstLaunchEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareLaunchPackage;

public final class ClientEvent$FirstLaunchEvent extends MessageNano	// class@000751
{
    public int mode;
    public int reason;
    public ClientEvent$ShareLaunchPackage shareLaunchPackage;
    public static ClientEvent$FirstLaunchEvent[] _emptyArray;

    public void ClientEvent$FirstLaunchEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$FirstLaunchEvent[] emptyArray(){
       if (ClientEvent$FirstLaunchEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$FirstLaunchEvent._emptyArray == null) {
             ClientEvent$FirstLaunchEvent[] uFirstLaunch = new ClientEvent$FirstLaunchEvent[0];
             ClientEvent$FirstLaunchEvent._emptyArray = uFirstLaunch;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$FirstLaunchEvent._emptyArray;
    }
    public static ClientEvent$FirstLaunchEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$FirstLaunchEvent().mergeFrom(p0);
    }
    public static ClientEvent$FirstLaunchEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$FirstLaunchEvent(), p0);
    }
    public ClientEvent$FirstLaunchEvent clear(){
       this.mode = 0;
       this.reason = 0;
       this.shareLaunchPackage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$FirstLaunchEvent tmode = this.mode;
       if (tmode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmode);
       }
       tmode = this.reason;
       if (tmode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmode);
       }
       tmode = this.shareLaunchPackage;
       if (tmode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tmode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$FirstLaunchEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.shareLaunchPackage == null){
                   this.shareLaunchPackage = new ClientEvent$ShareLaunchPackage();
                }
                p0.readMessage(this.shareLaunchPackage);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.reason = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.mode = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$FirstLaunchEvent tmode = this.mode;
       if (tmode != null) {
          p0.writeInt32(1, tmode);
       }
       tmode = this.reason;
       if (tmode != null) {
          p0.writeInt32(2, tmode);
       }
       tmode = this.shareLaunchPackage;
       if (tmode != null) {
          p0.writeMessage(3, tmode);
       }
       super.writeTo(p0);
       return;
    }
}
