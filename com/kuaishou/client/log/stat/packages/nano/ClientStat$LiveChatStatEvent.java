package com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveChatStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorLiveStreamQoSPackage;

public final class ClientStat$LiveChatStatEvent extends MessageNano	// class@0007e0
{
    public ClientStat$AnchorLiveStreamQoSPackage anchorStreamingQos;
    public long chatDuration;
    public int chatMediaType;
    public Map cpuRate;
    public Map decFps;
    public Map encBr;
    public Map encFps;
    public int endReason;
    public int errorCode;
    public String errorDomain;
    public String errorMessage;
    public long establishConnectionCost;
    public boolean fromAudienceApply;
    public Map kbpsRecv;
    public Map kbpsSend;
    public long liveChatRoomId;
    public String liveStreamId;
    public Map lossRateRecv;
    public Map lossRateRecvUdt;
    public Map lossRateSend;
    public Map lossRateSendUdt;
    public int role;
    public Map rtt;
    public boolean useArya;
    public static ClientStat$LiveChatStatEvent[] _emptyArray;

    public void ClientStat$LiveChatStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$LiveChatStatEvent[] emptyArray(){
       if (ClientStat$LiveChatStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$LiveChatStatEvent._emptyArray == null) {
             ClientStat$LiveChatStatEvent[] liveChatStat = new ClientStat$LiveChatStatEvent[0];
             ClientStat$LiveChatStatEvent._emptyArray = liveChatStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$LiveChatStatEvent._emptyArray;
    }
    public static ClientStat$LiveChatStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$LiveChatStatEvent().mergeFrom(p0);
    }
    public static ClientStat$LiveChatStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$LiveChatStatEvent(), p0);
    }
    public ClientStat$LiveChatStatEvent clear(){
       this.liveStreamId = "";
       this.liveChatRoomId = 0;
       this.role = 0;
       this.establishConnectionCost = 0;
       this.chatDuration = 0;
       this.endReason = 0;
       this.errorDomain = "";
       this.errorCode = 0;
       this.errorMessage = "";
       this.kbpsSend = null;
       this.kbpsRecv = null;
       this.lossRateSend = null;
       this.lossRateRecv = null;
       this.lossRateSendUdt = null;
       this.lossRateRecvUdt = null;
       this.encFps = null;
       this.encBr = null;
       this.decFps = null;
       this.rtt = null;
       this.cpuRate = null;
       this.anchorStreamingQos = null;
       this.chatMediaType = 0;
       this.useArya = false;
       this.fromAudienceApply = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       ClientStat$LiveChatStatEvent tliveChatRoo = this.liveChatRoomId;
       if (tliveChatRoo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tliveChatRoo);
       }
       ClientStat$LiveChatStatEvent trole = this.role;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, trole);
       }
       tliveChatRoo = this.establishConnectionCost;
       if (tliveChatRoo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tliveChatRoo);
       }
       tliveChatRoo = this.chatDuration;
       if (tliveChatRoo) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tliveChatRoo);
       }
       trole = this.endReason;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, trole);
       }
       if (!(this.errorDomain).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.errorDomain);
       }
       trole = this.errorCode;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, trole);
       }
       int i1 = 9;
       if (!(this.errorMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.errorMessage);
       }
       trole = this.kbpsSend;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 10, i1, 13);
       }
       trole = this.kbpsRecv;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 11, i1, 13);
       }
       trole = this.lossRateSend;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 12, i1, 13);
       }
       trole = this.lossRateRecv;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 13, i1, 13);
       }
       trole = this.lossRateSendUdt;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 14, i1, 13);
       }
       trole = this.lossRateRecvUdt;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 15, i1, 13);
       }
       trole = this.encFps;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 16, i1, 13);
       }
       trole = this.encBr;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 17, i1, 13);
       }
       trole = this.decFps;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 18, i1, 13);
       }
       trole = this.rtt;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 19, i1, 13);
       }
       trole = this.cpuRate;
       if (trole != null) {
          i = i + InternalNano.computeMapFieldSize(trole, 20, i1, 13);
       }
       trole = this.anchorStreamingQos;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, trole);
       }
       trole = this.chatMediaType;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(22, trole);
       }
       trole = this.useArya;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(23, trole);
       }
       trole = this.fromAudienceApply;
       if (trole != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(24, trole);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$LiveChatStatEvent mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          ClientStat$LiveChatStatEvent liveChatStat = 2;
          MapFactories$MapFactory mapFactory1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.liveStreamId = p0.readString();
                break;
              case 16:
                this.liveChatRoomId = p0.readUInt64();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != mapFactory1 && i != liveChatStat)) {
                   continue ;
                }else {
                   this.role = i;
                }
                break;
              case 32:
                this.establishConnectionCost = p0.readUInt64();
                break;
              case '(':
                this.chatDuration = p0.readUInt64();
                break;
              case '0':
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
                    case 10:
                    case 1:
                      break;
                    default:
                }
                this.endReason = i;
                break;
              case ':':
                this.errorDomain = p0.readString();
                break;
              case '@':
                this.errorCode = p0.readUInt32();
                break;
              case 'J':
                this.errorMessage = p0.readString();
                break;
              case 'R':
                this.kbpsSend = InternalNano.mergeMapEntry(p0, this.kbpsSend, mapFactory, 9, 13, null, 10, 16);
                break;
              case 'Z':
                this.kbpsRecv = InternalNano.mergeMapEntry(p0, this.kbpsRecv, mapFactory, 9, 13, null, 10, 16);
                break;
              case 'b':
                this.lossRateSend = InternalNano.mergeMapEntry(p0, this.lossRateSend, mapFactory, 9, 13, null, 10, 16);
                break;
              case 'j':
                this.lossRateRecv = InternalNano.mergeMapEntry(p0, this.lossRateRecv, mapFactory, 9, 13, null, 10, 16);
                break;
              case 'r':
                this.lossRateSendUdt = InternalNano.mergeMapEntry(p0, this.lossRateSendUdt, mapFactory, 9, 13, null, 10, 16);
                break;
              case 'z':
                this.lossRateRecvUdt = InternalNano.mergeMapEntry(p0, this.lossRateRecvUdt, mapFactory, 9, 13, null, 10, 16);
                break;
              case 130:
                this.encFps = InternalNano.mergeMapEntry(p0, this.encFps, mapFactory, 9, 13, null, 10, 16);
                break;
              case 138:
                this.encBr = InternalNano.mergeMapEntry(p0, this.encBr, mapFactory, 9, 13, null, 10, 16);
                break;
              case 146:
                this.decFps = InternalNano.mergeMapEntry(p0, this.decFps, mapFactory, 9, 13, null, 10, 16);
                break;
              case 154:
                this.rtt = InternalNano.mergeMapEntry(p0, this.rtt, mapFactory, 9, 13, null, 10, 16);
                break;
              case 162:
                this.cpuRate = InternalNano.mergeMapEntry(p0, this.cpuRate, mapFactory, 9, 13, null, 10, 16);
                break;
              case 170:
                if (this.anchorStreamingQos == null) {
                   this.anchorStreamingQos = new ClientStat$AnchorLiveStreamQoSPackage();
                }
                p0.readMessage(this.anchorStreamingQos);
                break;
              case 176:
                i = p0.readInt32();
                if (i && (i != mapFactory1 && i != liveChatStat)) {
                   continue ;
                }else {
                   this.chatMediaType = i;
                }
                break;
              case 184:
                this.useArya = p0.readBool();
                break;
              case 192:
                this.fromAudienceApply = p0.readBool();
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
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       ClientStat$LiveChatStatEvent tliveChatRoo = this.liveChatRoomId;
       if (tliveChatRoo) {
          p0.writeUInt64(2, tliveChatRoo);
       }
       ClientStat$LiveChatStatEvent trole = this.role;
       if (trole != null) {
          p0.writeInt32(3, trole);
       }
       tliveChatRoo = this.establishConnectionCost;
       if (tliveChatRoo) {
          p0.writeUInt64(4, tliveChatRoo);
       }
       tliveChatRoo = this.chatDuration;
       if (tliveChatRoo) {
          p0.writeUInt64(5, tliveChatRoo);
       }
       trole = this.endReason;
       if (trole != null) {
          p0.writeInt32(6, trole);
       }
       if (!(this.errorDomain).equals(str)) {
          p0.writeString(7, this.errorDomain);
       }
       trole = this.errorCode;
       if (trole != null) {
          p0.writeUInt32(8, trole);
       }
       int i = 9;
       if (!(this.errorMessage).equals(str)) {
          p0.writeString(i, this.errorMessage);
       }
       trole = this.kbpsSend;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 10, i, 13);
       }
       trole = this.kbpsRecv;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 11, i, 13);
       }
       trole = this.lossRateSend;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 12, i, 13);
       }
       trole = this.lossRateRecv;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 13, i, 13);
       }
       trole = this.lossRateSendUdt;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 14, i, 13);
       }
       trole = this.lossRateRecvUdt;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 15, i, 13);
       }
       trole = this.encFps;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 16, i, 13);
       }
       trole = this.encBr;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 17, i, 13);
       }
       trole = this.decFps;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 18, i, 13);
       }
       trole = this.rtt;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 19, i, 13);
       }
       trole = this.cpuRate;
       if (trole != null) {
          InternalNano.serializeMapField(p0, trole, 20, i, 13);
       }
       trole = this.anchorStreamingQos;
       if (trole != null) {
          p0.writeMessage(21, trole);
       }
       trole = this.chatMediaType;
       if (trole != null) {
          p0.writeInt32(22, trole);
       }
       trole = this.useArya;
       if (trole != null) {
          p0.writeBool(23, trole);
       }
       trole = this.fromAudienceApply;
       if (trole != null) {
          p0.writeBool(24, trole);
       }
       super.writeTo(p0);
       return;
    }
}
