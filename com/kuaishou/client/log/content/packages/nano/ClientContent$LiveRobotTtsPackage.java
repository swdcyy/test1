package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotTtsPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotRequestPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$LiveRobotTtsPackage extends MessageNano	// class@001281
{
    public int playStatus;
    public ClientContent$LiveRobotRequestPackage[] requestPackages;
    public String sessionId;
    public static ClientContent$LiveRobotTtsPackage[] _emptyArray;

    public void ClientContent$LiveRobotTtsPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveRobotTtsPackage[] emptyArray(){
       if (ClientContent$LiveRobotTtsPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveRobotTtsPackage._emptyArray == null) {
             ClientContent$LiveRobotTtsPackage[] liveRobotTts = new ClientContent$LiveRobotTtsPackage[0];
             ClientContent$LiveRobotTtsPackage._emptyArray = liveRobotTts;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveRobotTtsPackage._emptyArray;
    }
    public static ClientContent$LiveRobotTtsPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveRobotTtsPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveRobotTtsPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveRobotTtsPackage(), p0);
    }
    public ClientContent$LiveRobotTtsPackage clear(){
       this.sessionId = "";
       this.requestPackages = ClientContent$LiveRobotRequestPackage.emptyArray();
       this.playStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.sessionId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sessionId);
       }
       ClientContent$LiveRobotTtsPackage trequestPack = this.requestPackages;
       if (trequestPack != null && trequestPack.length > 0) {
          int i1 = 0;
          ClientContent$LiveRobotTtsPackage trequestPack1 = this.requestPackages;
          while (i1 < trequestPack1.length) {
             object oobject = trequestPack1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trequestPack = this.playStatus;
       if (trequestPack != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, trequestPack);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveRobotTtsPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.playStatus = i;
                   }
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ClientContent$LiveRobotTtsPackage trequestPack = this.requestPackages;
                int i2 = (trequestPack == null)? 0: trequestPack.length;
                i = i + i2;
                ClientContent$LiveRobotRequestPackage[] liveRobotReq = new ClientContent$LiveRobotRequestPackage[i];
                if (i2) {
                   System.arraycopy(trequestPack, 0, liveRobotReq, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveRobotReq[i2] = new ClientContent$LiveRobotRequestPackage();
                   p0.readMessage(liveRobotReq[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveRobotReq[i2] = new ClientContent$LiveRobotRequestPackage();
                p0.readMessage(liveRobotReq[i2]);
                this.requestPackages = liveRobotReq;
             }
          }else {
             this.sessionId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.sessionId).equals("")) {
          p0.writeString(1, this.sessionId);
       }
       ClientContent$LiveRobotTtsPackage trequestPack = this.requestPackages;
       if (trequestPack != null && trequestPack.length > 0) {
          int i = 0;
          ClientContent$LiveRobotTtsPackage trequestPack1 = this.requestPackages;
          while (i < trequestPack1.length) {
             object oobject = trequestPack1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       trequestPack = this.playStatus;
       if (trequestPack != null) {
          p0.writeInt32(3, trequestPack);
       }
       super.writeTo(p0);
       return;
    }
}
