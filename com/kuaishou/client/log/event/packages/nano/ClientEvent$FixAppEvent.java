package com.kuaishou.client.log.event.packages.nano.ClientEvent$FixAppEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$FixAppEvent extends MessageNano	// class@000754
{
    public int action;
    public String extraMessage;
    public int status;
    public static ClientEvent$FixAppEvent[] _emptyArray;

    public void ClientEvent$FixAppEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$FixAppEvent[] emptyArray(){
       if (ClientEvent$FixAppEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$FixAppEvent._emptyArray == null) {
             ClientEvent$FixAppEvent[] uFixAppEvent = new ClientEvent$FixAppEvent[0];
             ClientEvent$FixAppEvent._emptyArray = uFixAppEvent;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$FixAppEvent._emptyArray;
    }
    public static ClientEvent$FixAppEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$FixAppEvent().mergeFrom(p0);
    }
    public static ClientEvent$FixAppEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$FixAppEvent(), p0);
    }
    public ClientEvent$FixAppEvent clear(){
       this.action = 0;
       this.status = 0;
       this.extraMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$FixAppEvent taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, taction);
       }
       taction = this.status;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, taction);
       }
       if (!(this.extraMessage).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extraMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$FixAppEvent mergeFrom(CodedInputByteBufferNano p0){
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
                }else {
                   this.extraMessage = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.status = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.action = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$FixAppEvent taction = this.action;
       if (taction != null) {
          p0.writeInt32(1, taction);
       }
       taction = this.status;
       if (taction != null) {
          p0.writeInt32(2, taction);
       }
       if (!(this.extraMessage).equals("")) {
          p0.writeString(3, this.extraMessage);
       }
       super.writeTo(p0);
       return;
    }
}
