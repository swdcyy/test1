package com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientEvent$ShowEvent extends MessageNano	// class@00076e
{
    public int action;
    public ClientEvent$AreaPackage areaPackage;
    public ClientContent$ContentPackage contentPackage;
    public String contentWrapper;
    public ClientEvent$ElementPackage elementPackage;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public StidContainerProto$StidContainer internalStidContainer;
    public String internalStidContainerJson;
    public int pageShowSeq;
    public ClientEvent$ElementPackage referElementPackage;
    public ClientEvent$UrlPackage referUrlPackage;
    public int showType;
    public int status;
    public long stayLength;
    public int subAction;
    public long timeCost;
    public int type;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientEvent$ShowEvent[] _emptyArray;

    public void ClientEvent$ShowEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$ShowEvent[] emptyArray(){
       if (ClientEvent$ShowEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ShowEvent._emptyArray == null) {
             ClientEvent$ShowEvent[] showEventArr = new ClientEvent$ShowEvent[0];
             ClientEvent$ShowEvent._emptyArray = showEventArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ShowEvent._emptyArray;
    }
    public static ClientEvent$ShowEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ShowEvent().mergeFrom(p0);
    }
    public static ClientEvent$ShowEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ShowEvent(), p0);
    }
    public ClientEvent$ShowEvent clear(){
       this.action = 0;
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.type = 0;
       this.status = 0;
       this.timeCost = 0;
       this.stayLength = 0;
       this.contentPackage = null;
       this.elementPackage = null;
       this.referElementPackage = null;
       this.showType = 0;
       this.subAction = 0;
       this.pageShowSeq = 0;
       this.contentWrapper = "";
       this.areaPackage = null;
       this.internalStidContainer = null;
       this.internalStidContainerJson = "";
       this.interStidContainer = null;
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ShowEvent taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, taction);
       }
       taction = this.urlPackage;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, taction);
       }
       taction = this.referUrlPackage;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, taction);
       }
       taction = this.type;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, taction);
       }
       taction = this.status;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, taction);
       }
       taction = this.timeCost;
       ClientEvent$ShowEvent showEvent = null;
       if (taction - showEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, taction);
       }
       taction = this.stayLength;
       if (taction - showEvent) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, taction);
       }
       taction = this.contentPackage;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, taction);
       }
       taction = this.elementPackage;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, taction);
       }
       taction = this.referElementPackage;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, taction);
       }
       taction = this.showType;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, taction);
       }
       taction = this.subAction;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, taction);
       }
       taction = this.pageShowSeq;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, taction);
       }
       String str = "";
       if (!(this.contentWrapper).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.contentWrapper);
       }
       taction = this.areaPackage;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, taction);
       }
       taction = this.internalStidContainer;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, taction);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.internalStidContainerJson);
       }
       taction = this.interStidContainer;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, taction);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ShowEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 3;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != i1))) {
                   continue ;
                }else {
                   this.action = i;
                }
                break;
              case 18:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 26:
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case 32:
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
                this.type = i;
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case '0':
                this.timeCost = p0.readUInt64();
                break;
              case '8':
                this.stayLength = p0.readUInt64();
                break;
              case 'B':
                if (this.contentPackage == null) {
                   this.contentPackage = new ClientContent$ContentPackage();
                }
                p0.readMessage(this.contentPackage);
                break;
              case 'J':
                if (this.elementPackage == null) {
                   this.elementPackage = new ClientEvent$ElementPackage();
                }
                p0.readMessage(this.elementPackage);
                break;
              case 'R':
                if (this.referElementPackage == null) {
                   this.referElementPackage = new ClientEvent$ElementPackage();
                }
                p0.readMessage(this.referElementPackage);
                break;
              case 'X':
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
                    case 11:
                    case 1:
                      break;
                    default:
                }
                this.showType = i;
                break;
              case '`':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != i1 && i != 4)))) {
                   continue ;
                }else {
                   this.subAction = i;
                }
                break;
              case 'p':
                this.pageShowSeq = p0.readInt32();
                break;
              case 'z':
                this.contentWrapper = p0.readString();
                break;
              case 130:
                if (this.areaPackage == null) {
                   this.areaPackage = new ClientEvent$AreaPackage();
                }
                p0.readMessage(this.areaPackage);
                break;
              case 138:
                if (this.internalStidContainer == null) {
                   this.internalStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.internalStidContainer);
                break;
              case 146:
                this.internalStidContainerJson = p0.readString();
                break;
              case 154:
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 162:
                this.interStExParams = p0.readString();
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
       ClientEvent$ShowEvent taction = this.action;
       if (taction != null) {
          p0.writeInt32(1, taction);
       }
       taction = this.urlPackage;
       if (taction != null) {
          p0.writeMessage(2, taction);
       }
       taction = this.referUrlPackage;
       if (taction != null) {
          p0.writeMessage(3, taction);
       }
       taction = this.type;
       if (taction != null) {
          p0.writeInt32(4, taction);
       }
       taction = this.status;
       if (taction != null) {
          p0.writeInt32(5, taction);
       }
       taction = this.timeCost;
       ClientEvent$ShowEvent showEvent = null;
       if (taction - showEvent) {
          p0.writeUInt64(6, taction);
       }
       taction = this.stayLength;
       if (taction - showEvent) {
          p0.writeUInt64(7, taction);
       }
       taction = this.contentPackage;
       if (taction != null) {
          p0.writeMessage(8, taction);
       }
       taction = this.elementPackage;
       if (taction != null) {
          p0.writeMessage(9, taction);
       }
       taction = this.referElementPackage;
       if (taction != null) {
          p0.writeMessage(10, taction);
       }
       taction = this.showType;
       if (taction != null) {
          p0.writeInt32(11, taction);
       }
       taction = this.subAction;
       if (taction != null) {
          p0.writeInt32(12, taction);
       }
       taction = this.pageShowSeq;
       if (taction != null) {
          p0.writeInt32(14, taction);
       }
       String str = "";
       if (!(this.contentWrapper).equals(str)) {
          p0.writeString(15, this.contentWrapper);
       }
       taction = this.areaPackage;
       if (taction != null) {
          p0.writeMessage(16, taction);
       }
       taction = this.internalStidContainer;
       if (taction != null) {
          p0.writeMessage(17, taction);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          p0.writeString(18, this.internalStidContainerJson);
       }
       taction = this.interStidContainer;
       if (taction != null) {
          p0.writeMessage(19, taction);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(20, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
