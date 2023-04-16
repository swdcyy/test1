package com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.packages.nano.ClientBase$Experiment;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidPackage;
import com.kuaishou.client.log.packages.nano.ClientCommon$AdditionalSeqIdPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$TimePackage;
import java.lang.System;
import com.kuaishou.client.log.packages.nano.ClientBase$LocationPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$NetworkPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$DevicePackage;
import com.kuaishou.client.log.packages.nano.ClientCommon$AppPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;

public final class ClientCommon$CommonPackage extends MessageNano	// class@00078d
{
    public ClientCommon$AdditionalSeqIdPackage additionalSeqIdPackage;
    public int apiAppStatus;
    public ClientCommon$AppPackage appPackage;
    public StidContainerProto$StidPackage commonStid;
    public ClientBase$DevicePackage devicePackage;
    public ClientBase$Experiment[] experiment;
    public String globalAttr;
    public String h5ExtraAttr;
    public ClientBase$IdentityPackage identityPackage;
    public ClientBase$LocationPackage locationPackage;
    public boolean needEncrypt;
    public ClientBase$NetworkPackage networkPackage;
    public String serviceName;
    public StidContainerProto$StidPackage stidPackage;
    public String styleType;
    public String subBiz;
    public ClientBase$TimePackage timePackage;
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
       this.timePackage = null;
       this.additionalSeqIdPackage = null;
       this.styleType = "";
       this.serviceName = "";
       this.subBiz = "";
       this.needEncrypt = false;
       this.globalAttr = "";
       this.h5ExtraAttr = "";
       this.stidPackage = null;
       this.commonStid = null;
       this.apiAppStatus = 0;
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
       tidentityPac = this.timePackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tidentityPac);
       }
       tidentityPac = this.additionalSeqIdPackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tidentityPac);
       }
       String str = "";
       if (!(this.styleType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.styleType);
       }
       if (!(this.serviceName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.serviceName);
       }
       if (!(this.subBiz).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.subBiz);
       }
       tidentityPac = this.needEncrypt;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tidentityPac);
       }
       if (!(this.globalAttr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.globalAttr);
       }
       if (!(this.h5ExtraAttr).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.h5ExtraAttr);
       }
       tidentityPac = this.stidPackage;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tidentityPac);
       }
       tidentityPac = this.commonStid;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tidentityPac);
       }
       tidentityPac = this.apiAppStatus;
       if (tidentityPac != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(18, tidentityPac);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommon$CommonPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.identityPackage == null) {
                   this.identityPackage = new ClientBase$IdentityPackage();
                }
                p0.readMessage(this.identityPackage);
                break;
              case 18:
                if (this.appPackage == null) {
                   this.appPackage = new ClientCommon$AppPackage();
                }
                p0.readMessage(this.appPackage);
                break;
              case 26:
                if (this.devicePackage == null) {
                   this.devicePackage = new ClientBase$DevicePackage();
                }
                p0.readMessage(this.devicePackage);
                break;
              case '"':
                if (this.networkPackage == null) {
                   this.networkPackage = new ClientBase$NetworkPackage();
                }
                p0.readMessage(this.networkPackage);
                break;
              case '*':
                if (this.locationPackage == null) {
                   this.locationPackage = new ClientBase$LocationPackage();
                }
                p0.readMessage(this.locationPackage);
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                ClientCommon$CommonPackage texperiment = this.experiment;
                int i1 = (texperiment == null)? 0: texperiment.length;
                i = i + i1;
                ClientBase$Experiment[] uExperimentA = new ClientBase$Experiment[i];
                if (i1) {
                   System.arraycopy(texperiment, 0, uExperimentA, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   uExperimentA[i1] = new ClientBase$Experiment();
                   p0.readMessage(uExperimentA[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                uExperimentA[i1] = new ClientBase$Experiment();
                p0.readMessage(uExperimentA[i1]);
                this.experiment = uExperimentA;
                break;
              case ':':
                if (this.timePackage == null) {
                   this.timePackage = new ClientBase$TimePackage();
                }
                p0.readMessage(this.timePackage);
                break;
              case 'B':
                if (this.additionalSeqIdPackage == null) {
                   this.additionalSeqIdPackage = new ClientCommon$AdditionalSeqIdPackage();
                }
                p0.readMessage(this.additionalSeqIdPackage);
                break;
              case 'J':
                this.styleType = p0.readString();
                break;
              case 'R':
                this.serviceName = p0.readString();
                break;
              case 'Z':
                this.subBiz = p0.readString();
                break;
              case '`':
                this.needEncrypt = p0.readBool();
                break;
              case 'j':
                this.globalAttr = p0.readString();
                break;
              case 'z':
                this.h5ExtraAttr = p0.readString();
                break;
              case 130:
                if (this.stidPackage == null) {
                   this.stidPackage = new StidContainerProto$StidPackage();
                }
                p0.readMessage(this.stidPackage);
                break;
              case 138:
                if (this.commonStid == null) {
                   this.commonStid = new StidContainerProto$StidPackage();
                }
                p0.readMessage(this.commonStid);
                break;
              case 144:
                this.apiAppStatus = p0.readInt32();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
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
       tidentityPac = this.timePackage;
       if (tidentityPac != null) {
          p0.writeMessage(7, tidentityPac);
       }
       tidentityPac = this.additionalSeqIdPackage;
       if (tidentityPac != null) {
          p0.writeMessage(8, tidentityPac);
       }
       String str = "";
       if (!(this.styleType).equals(str)) {
          p0.writeString(9, this.styleType);
       }
       if (!(this.serviceName).equals(str)) {
          p0.writeString(10, this.serviceName);
       }
       if (!(this.subBiz).equals(str)) {
          p0.writeString(11, this.subBiz);
       }
       tidentityPac = this.needEncrypt;
       if (tidentityPac != null) {
          p0.writeBool(12, tidentityPac);
       }
       if (!(this.globalAttr).equals(str)) {
          p0.writeString(13, this.globalAttr);
       }
       if (!(this.h5ExtraAttr).equals(str)) {
          p0.writeString(15, this.h5ExtraAttr);
       }
       tidentityPac = this.stidPackage;
       if (tidentityPac != null) {
          p0.writeMessage(16, tidentityPac);
       }
       tidentityPac = this.commonStid;
       if (tidentityPac != null) {
          p0.writeMessage(17, tidentityPac);
       }
       tidentityPac = this.apiAppStatus;
       if (tidentityPac != null) {
          p0.writeInt32(18, tidentityPac);
       }
       super.writeTo(p0);
       return;
    }
}
