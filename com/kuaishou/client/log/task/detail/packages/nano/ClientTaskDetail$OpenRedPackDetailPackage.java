package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$OpenRedPackDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo;

public final class ClientTaskDetail$OpenRedPackDetailPackage extends MessageNano	// class@001468
{
    public long grabValue;
    public long id;
    public String identity;
    public long openTime;
    public boolean sendRequest;
    public ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo timeInfo;
    public long totalValue;
    public static ClientTaskDetail$OpenRedPackDetailPackage[] _emptyArray;

    public void ClientTaskDetail$OpenRedPackDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$OpenRedPackDetailPackage[] emptyArray(){
       if (ClientTaskDetail$OpenRedPackDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$OpenRedPackDetailPackage._emptyArray == null) {
             ClientTaskDetail$OpenRedPackDetailPackage[] openRedPackD = new ClientTaskDetail$OpenRedPackDetailPackage[0];
             ClientTaskDetail$OpenRedPackDetailPackage._emptyArray = openRedPackD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$OpenRedPackDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$OpenRedPackDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$OpenRedPackDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$OpenRedPackDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$OpenRedPackDetailPackage(), p0);
    }
    public ClientTaskDetail$OpenRedPackDetailPackage clear(){
       this.id = 0;
       this.totalValue = 0;
       this.grabValue = 0;
       this.openTime = 0;
       this.sendRequest = false;
       this.timeInfo = null;
       this.identity = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$OpenRedPackDetailPackage tid = this.id;
       int i1 = 0;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       tid = this.totalValue;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tid);
       }
       tid = this.grabValue;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tid);
       }
       tid = this.openTime;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tid);
       }
       tid = this.sendRequest;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tid);
       }
       tid = this.timeInfo;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tid);
       }
       if (!(this.identity).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.identity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$OpenRedPackDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.identity = p0.readString();
                            }
                         }else if(this.timeInfo == null){
                            this.timeInfo = new ClientTaskDetail$OpenRedPackDetailPackage$TimeInfo();
                         }
                         p0.readMessage(this.timeInfo);
                      }else {
                         this.sendRequest = p0.readBool();
                      }
                   }else {
                      this.openTime = p0.readUInt64();
                   }
                }else {
                   this.grabValue = p0.readUInt64();
                }
             }else {
                this.totalValue = p0.readUInt64();
             }
          }else {
             this.id = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$OpenRedPackDetailPackage tid = this.id;
       int i = 0;
       if (tid - i) {
          p0.writeUInt64(1, tid);
       }
       tid = this.totalValue;
       if (tid - i) {
          p0.writeUInt64(2, tid);
       }
       tid = this.grabValue;
       if (tid - i) {
          p0.writeUInt64(3, tid);
       }
       tid = this.openTime;
       if (tid - i) {
          p0.writeUInt64(4, tid);
       }
       tid = this.sendRequest;
       if (tid != null) {
          p0.writeBool(5, tid);
       }
       tid = this.timeInfo;
       if (tid != null) {
          p0.writeMessage(6, tid);
       }
       if (!(this.identity).equals("")) {
          p0.writeString(7, this.identity);
       }
       super.writeTo(p0);
       return;
    }
}
