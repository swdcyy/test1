package com.kuaishou.protobuf.log.nano.ClientCommon$CommonPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.log.nano.ClientBase$Experiment;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.protobuf.log.nano.ClientBase$LocationPackage;
import com.kuaishou.protobuf.log.nano.ClientBase$NetworkPackage;
import com.kuaishou.protobuf.log.nano.ClientBase$DevicePackage;
import com.kuaishou.protobuf.log.nano.ClientCommon$AppPackage;
import com.kuaishou.protobuf.log.nano.ClientBase$IdentityPackage;

public final class ClientCommon$CommonPackage extends MessageNano	// class@000de1
{
    public ClientCommon$AppPackage appPackage;
    public ClientBase$DevicePackage devicePackage;
    public ClientBase$Experiment[] experiment;
    public ClientBase$IdentityPackage identityPackage;
    public ClientBase$LocationPackage locationPackage;
    public ClientBase$NetworkPackage networkPackage;
    public static ClientCommon$CommonPackage[] _emptyArray;

    public void ClientCommon$CommonPackage(){
       super();
       this.clear();
    }
    public static ClientCommon$CommonPackage[] emptyArray(){
       if (ClientCommon$CommonPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommon$CommonPackage._emptyArray == null) {
             ClientCommon$CommonPackage[] uCommonPacka = new ClientCommon$CommonPackage[0];
             ClientCommon$CommonPackage._emptyArray = uCommonPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommon$CommonPackage._emptyArray;
    }
    public static ClientCommon$CommonPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommon$CommonPackage().mergeFrom(p0);
    }
    public static ClientCommon$CommonPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommon$CommonPackage(), p0);
    }
    public ClientCommon$CommonPackage clear(){
       this.identityPackage = null;
       this.appPackage = null;
       this.devicePackage = null;
       this.networkPackage = null;
       this.locationPackage = null;
       this.experiment = ClientBase$Experiment.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientCommon$CommonPackage tidentityPac = this.identityPackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tidentityPac);
       }
       tidentityPac = this.appPackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tidentityPac);
       }
       tidentityPac = this.devicePackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tidentityPac);
       }
       tidentityPac = this.networkPackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tidentityPac);
       }
       tidentityPac = this.locationPackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tidentityPac);
       }
       tidentityPac = this.experiment;
       if (tidentityPac != null && tidentityPac.length > 0) {
          int i1 = 0;
          ClientCommon$CommonPackage texperiment = this.experiment;
          while (i1 < texperiment.length) {
             object oobject = texperiment[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommon$CommonPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            ClientCommon$CommonPackage texperiment = this.experiment;
                            int i2 = (texperiment == null)? 0: texperiment.length;
                            i = i + i2;
                            ClientBase$Experiment[] uExperimentA = new ClientBase$Experiment[i];
                            if (i2) {
                               System.arraycopy(texperiment, 0, uExperimentA, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               uExperimentA[i2] = new ClientBase$Experiment();
                               p0.readMessage(uExperimentA[i2]);
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            uExperimentA[i2] = new ClientBase$Experiment();
                            p0.readMessage(uExperimentA[i2]);
                            this.experiment = uExperimentA;
                         }
                      }else if(this.locationPackage == null){
                         this.locationPackage = new ClientBase$LocationPackage();
                      }
                      p0.readMessage(this.locationPackage);
                   }else if(this.networkPackage == null){
                      this.networkPackage = new ClientBase$NetworkPackage();
                   }
                   p0.readMessage(this.networkPackage);
                }else if(this.devicePackage == null){
                   this.devicePackage = new ClientBase$DevicePackage();
                }
                p0.readMessage(this.devicePackage);
             }else if(this.appPackage == null){
                this.appPackage = new ClientCommon$AppPackage();
             }
             p0.readMessage(this.appPackage);
          }else if(this.identityPackage == null){
             this.identityPackage = new ClientBase$IdentityPackage();
          }
          p0.readMessage(this.identityPackage);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientCommon$CommonPackage tidentityPac = this.identityPackage;
       if (tidentityPac != null) {
          p0.writeMessage(1, tidentityPac);
       }
       tidentityPac = this.appPackage;
       if (tidentityPac != null) {
          p0.writeMessage(2, tidentityPac);
       }
       tidentityPac = this.devicePackage;
       if (tidentityPac != null) {
          p0.writeMessage(3, tidentityPac);
       }
       tidentityPac = this.networkPackage;
       if (tidentityPac != null) {
          p0.writeMessage(4, tidentityPac);
       }
       tidentityPac = this.locationPackage;
       if (tidentityPac != null) {
          p0.writeMessage(5, tidentityPac);
       }
       tidentityPac = this.experiment;
       if (tidentityPac != null && tidentityPac.length > 0) {
          int i = 0;
          ClientCommon$CommonPackage texperiment = this.experiment;
          while (i < texperiment.length) {
             object oobject = texperiment[i];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
