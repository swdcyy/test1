package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendRedPackDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$SendRedPackDetailPackage$Grade;

public final class ClientTaskDetail$SendRedPackDetailPackage extends MessageNano	// class@00147c
{
    public ClientTaskDetail$SendRedPackDetailPackage$Grade grade;
    public long id;
    public String identity;
    public long onlineAudienceCount;
    public long openTime;
    public long totalValue;
    public int type;
    public long value;
    public static ClientTaskDetail$SendRedPackDetailPackage[] _emptyArray;

    public void ClientTaskDetail$SendRedPackDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$SendRedPackDetailPackage[] emptyArray(){
       if (ClientTaskDetail$SendRedPackDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$SendRedPackDetailPackage._emptyArray == null) {
             ClientTaskDetail$SendRedPackDetailPackage[] sendRedPackD = new ClientTaskDetail$SendRedPackDetailPackage[0];
             ClientTaskDetail$SendRedPackDetailPackage._emptyArray = sendRedPackD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$SendRedPackDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$SendRedPackDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$SendRedPackDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$SendRedPackDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$SendRedPackDetailPackage(), p0);
    }
    public ClientTaskDetail$SendRedPackDetailPackage clear(){
       this.type = 0;
       this.id = 0;
       this.grade = null;
       this.value = 0;
       this.totalValue = 0;
       this.openTime = 0;
       this.onlineAudienceCount = 0;
       this.identity = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$SendRedPackDetailPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.id;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.grade;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       ttype = this.value;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttype);
       }
       ttype = this.totalValue;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttype);
       }
       ttype = this.openTime;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ttype);
       }
       ttype = this.onlineAudienceCount;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttype);
       }
       if (!(this.identity).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.identity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$SendRedPackDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.identity = p0.readString();
                               }
                            }else {
                               this.onlineAudienceCount = p0.readUInt64();
                            }
                         }else {
                            this.openTime = p0.readUInt64();
                         }
                      }else {
                         this.totalValue = p0.readUInt64();
                      }
                   }else {
                      this.value = p0.readUInt64();
                   }
                }else if(this.grade == null){
                   this.grade = new ClientTaskDetail$SendRedPackDetailPackage$Grade();
                }
                p0.readMessage(this.grade);
             }else {
                this.id = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$SendRedPackDetailPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.id;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.grade;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       ttype = this.value;
       if (ttype - i) {
          p0.writeUInt64(4, ttype);
       }
       ttype = this.totalValue;
       if (ttype - i) {
          p0.writeUInt64(5, ttype);
       }
       ttype = this.openTime;
       if (ttype - i) {
          p0.writeUInt64(6, ttype);
       }
       ttype = this.onlineAudienceCount;
       if (ttype - i) {
          p0.writeUInt64(7, ttype);
       }
       if (!(this.identity).equals("")) {
          p0.writeString(8, this.identity);
       }
       super.writeTo(p0);
       return;
    }
}
