package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotSpeechRecognitionPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotRequestPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientContent$LiveRobotSpeechRecognitionPackage extends MessageNano	// class@00127f
{
    public int action;
    public long finishTimestamp;
    public long localWakeUpTimestamp;
    public long receiveSendStopTimestamp;
    public int recognitionResult;
    public ClientContent$LiveRobotRequestPackage[] requestPackages;
    public long serverWakeUpFalseTimestamp;
    public long serverWakeUpTrueTimestamp;
    public String sessionId;
    public int skill;
    public String slots;
    public static ClientContent$LiveRobotSpeechRecognitionPackage[] _emptyArray;

    public void ClientContent$LiveRobotSpeechRecognitionPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveRobotSpeechRecognitionPackage[] emptyArray(){
       if (ClientContent$LiveRobotSpeechRecognitionPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveRobotSpeechRecognitionPackage._emptyArray == null) {
             ClientContent$LiveRobotSpeechRecognitionPackage[] liveRobotSpe = new ClientContent$LiveRobotSpeechRecognitionPackage[0];
             ClientContent$LiveRobotSpeechRecognitionPackage._emptyArray = liveRobotSpe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveRobotSpeechRecognitionPackage._emptyArray;
    }
    public static ClientContent$LiveRobotSpeechRecognitionPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveRobotSpeechRecognitionPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveRobotSpeechRecognitionPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveRobotSpeechRecognitionPackage(), p0);
    }
    public ClientContent$LiveRobotSpeechRecognitionPackage clear(){
       this.sessionId = "";
       this.requestPackages = ClientContent$LiveRobotRequestPackage.emptyArray();
       this.localWakeUpTimestamp = 0;
       this.serverWakeUpTrueTimestamp = 0;
       this.serverWakeUpFalseTimestamp = 0;
       this.receiveSendStopTimestamp = 0;
       this.finishTimestamp = 0;
       this.recognitionResult = 0;
       this.skill = 0;
       this.action = 0;
       this.slots = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       ClientContent$LiveRobotSpeechRecognitionPackage trequestPack1;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sessionId);
       }
       ClientContent$LiveRobotSpeechRecognitionPackage trequestPack = this.requestPackages;
       if (trequestPack != null && trequestPack.length > 0) {
          int i1 = 0;
          trequestPack1 = this.requestPackages;
          while (i1 < trequestPack1.length) {
             object oobject = trequestPack1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       trequestPack1 = this.localWakeUpTimestamp;
       if (trequestPack1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, trequestPack1);
       }
       trequestPack1 = this.serverWakeUpTrueTimestamp;
       if (trequestPack1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, trequestPack1);
       }
       trequestPack1 = this.serverWakeUpFalseTimestamp;
       if (trequestPack1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, trequestPack1);
       }
       trequestPack1 = this.receiveSendStopTimestamp;
       if (trequestPack1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, trequestPack1);
       }
       trequestPack1 = this.finishTimestamp;
       if (trequestPack1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, trequestPack1);
       }
       trequestPack = this.recognitionResult;
       if (trequestPack != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, trequestPack);
       }
       trequestPack = this.skill;
       if (trequestPack != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, trequestPack);
       }
       trequestPack = this.action;
       if (trequestPack != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, trequestPack);
       }
       if (!(this.slots).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.slots);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveRobotSpeechRecognitionPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.sessionId = p0.readString();
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                ClientContent$LiveRobotSpeechRecognitionPackage trequestPack = this.requestPackages;
                int i1 = (trequestPack == null)? 0: trequestPack.length;
                i = i + i1;
                ClientContent$LiveRobotRequestPackage[] liveRobotReq = new ClientContent$LiveRobotRequestPackage[i];
                if (i1) {
                   System.arraycopy(trequestPack, 0, liveRobotReq, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   liveRobotReq[i1] = new ClientContent$LiveRobotRequestPackage();
                   p0.readMessage(liveRobotReq[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                liveRobotReq[i1] = new ClientContent$LiveRobotRequestPackage();
                p0.readMessage(liveRobotReq[i1]);
                this.requestPackages = liveRobotReq;
                break;
              case 24:
                this.localWakeUpTimestamp = p0.readUInt64();
                break;
              case 32:
                this.serverWakeUpTrueTimestamp = p0.readUInt64();
                break;
              case '(':
                this.serverWakeUpFalseTimestamp = p0.readUInt64();
                break;
              case '0':
                this.receiveSendStopTimestamp = p0.readUInt64();
                break;
              case '8':
                this.finishTimestamp = p0.readUInt64();
                break;
              case '@':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 1:
                      break;
                    default:
                }
                this.recognitionResult = i;
                break;
              case 'H':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 1:
                      break;
                    default:
                }
                this.skill = i;
                break;
              case 'P':
                i = p0.readInt32();
                if (i && (i != 3001 && (i != 4001 && (i != 5001 && (i != 8001 && (i != 0x2af9 && (i != 0x2ee1 && (i != 0x32c9 && (i != 0x36b1 && (i != 1008 && i != 1009)))))))))) {
                   switch (i){
                       case 1001:
                       case 1003:
                       case 1004:
                       case 1005:
                       case 1002:
                         break;
                       default:
                         switch (i){
                             case 1013:
                             case 1015:
                             case 1014:
                               break;
                             default:
                               switch (i){
                                   case 2001:
                                   case 2003:
                                   case 2004:
                                   case 2002:
                                     break;
                                   default:
                                     switch (i){
                                         case 6001:
                                         case 6003:
                                         case 6002:
                                           break;
                                         default:
                                           switch (i){
                                               case 7001:
                                               case 7003:
                                               case 7004:
                                               case 7005:
                                               case 7006:
                                               case 7007:
                                               case 7002:
                                                 break;
                                               default:
                                                 switch (i){
                                                     case 0x3a99:
                                                     case 0x3a9b:
                                                     case 0x3a9a:
                                                       break;
                                                     default:
                                                       switch (i){
                                                           case 0x3e81:
                                                           case 0x3e83:
                                                           case 0x3e84:
                                                           case 0x3e85:
                                                           case 0x3e86:
                                                           case 0x3e87:
                                                           case 0x3e88:
                                                           case 0x3e89:
                                                           case 0x3e8a:
                                                           case 0x3e82:
                                                             break;
                                                           default:
                                                       }
                                                 }
                                           }
                                     }
                               }
                         }
                   }
                }
             label_0059 :
                this.action = i;
                break;
              case 'Z':
                this.slots = p0.readString();
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
       ClientContent$LiveRobotSpeechRecognitionPackage trequestPack1;
       String str = "";
       if (!(this.sessionId).equals(str)) {
          p0.writeString(1, this.sessionId);
       }
       ClientContent$LiveRobotSpeechRecognitionPackage trequestPack = this.requestPackages;
       if (trequestPack != null && trequestPack.length > 0) {
          int i = 0;
          trequestPack1 = this.requestPackages;
          while (i < trequestPack1.length) {
             object oobject = trequestPack1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       trequestPack1 = this.localWakeUpTimestamp;
       if (trequestPack1) {
          p0.writeUInt64(3, trequestPack1);
       }
       trequestPack1 = this.serverWakeUpTrueTimestamp;
       if (trequestPack1) {
          p0.writeUInt64(4, trequestPack1);
       }
       trequestPack1 = this.serverWakeUpFalseTimestamp;
       if (trequestPack1) {
          p0.writeUInt64(5, trequestPack1);
       }
       trequestPack1 = this.receiveSendStopTimestamp;
       if (trequestPack1) {
          p0.writeUInt64(6, trequestPack1);
       }
       trequestPack1 = this.finishTimestamp;
       if (trequestPack1) {
          p0.writeUInt64(7, trequestPack1);
       }
       trequestPack = this.recognitionResult;
       if (trequestPack != null) {
          p0.writeInt32(8, trequestPack);
       }
       trequestPack = this.skill;
       if (trequestPack != null) {
          p0.writeInt32(9, trequestPack);
       }
       trequestPack = this.action;
       if (trequestPack != null) {
          p0.writeInt32(10, trequestPack);
       }
       if (!(this.slots).equals(str)) {
          p0.writeString(11, this.slots);
       }
       super.writeTo(p0);
       return;
    }
}
