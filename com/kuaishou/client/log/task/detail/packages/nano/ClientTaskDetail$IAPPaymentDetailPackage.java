package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$IAPPaymentDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$IAPPaymentDetailPackage extends MessageNano	// class@00145d
{
    public int errorType;
    public String extraMessage;
    public boolean jailBroken;
    public String product;
    public int step;
    public int verifySource;
    public static ClientTaskDetail$IAPPaymentDetailPackage[] _emptyArray;

    public void ClientTaskDetail$IAPPaymentDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$IAPPaymentDetailPackage[] emptyArray(){
       if (ClientTaskDetail$IAPPaymentDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$IAPPaymentDetailPackage._emptyArray == null) {
             ClientTaskDetail$IAPPaymentDetailPackage[] iAPPaymentDe = new ClientTaskDetail$IAPPaymentDetailPackage[0];
             ClientTaskDetail$IAPPaymentDetailPackage._emptyArray = iAPPaymentDe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$IAPPaymentDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$IAPPaymentDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$IAPPaymentDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$IAPPaymentDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$IAPPaymentDetailPackage(), p0);
    }
    public ClientTaskDetail$IAPPaymentDetailPackage clear(){
       this.product = "";
       this.step = 0;
       this.errorType = 0;
       this.verifySource = 0;
       this.extraMessage = "";
       this.jailBroken = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.product).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.product);
       }
       ClientTaskDetail$IAPPaymentDetailPackage tstep = this.step;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstep);
       }
       tstep = this.errorType;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstep);
       }
       tstep = this.verifySource;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tstep);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extraMessage);
       }
       tstep = this.jailBroken;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tstep);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$IAPPaymentDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.jailBroken = p0.readBool();
                         }
                      }else {
                         this.extraMessage = p0.readString();
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                         continue ;
                      }else {
                         this.verifySource = i;
                      }
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                      continue ;
                   }else {
                      this.errorType = i;
                   }
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.step = i;
                }
             }
          }else {
             this.product = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.product).equals(str)) {
          p0.writeString(1, this.product);
       }
       ClientTaskDetail$IAPPaymentDetailPackage tstep = this.step;
       if (tstep != null) {
          p0.writeInt32(2, tstep);
       }
       tstep = this.errorType;
       if (tstep != null) {
          p0.writeInt32(3, tstep);
       }
       tstep = this.verifySource;
       if (tstep != null) {
          p0.writeInt32(4, tstep);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(5, this.extraMessage);
       }
       tstep = this.jailBroken;
       if (tstep != null) {
          p0.writeBool(6, tstep);
       }
       super.writeTo(p0);
       return;
    }
}
