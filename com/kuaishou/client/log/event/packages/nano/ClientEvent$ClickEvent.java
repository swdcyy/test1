package com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientEvent$ClickEvent extends MessageNano	// class@000744
{
    public ClientEvent$AreaPackage areaPackage;
    public ClientContent$ContentPackage contentPackage;
    public String contentWrapper;
    public long correlationId;
    public int direction;
    public ClientEvent$ElementPackage elementPackage;
    public String extraMessage;
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public StidContainerProto$StidContainer internalStidContainer;
    public String internalStidContainerJson;
    public ClientEvent$ElementPackage referElementPackage;
    public ClientEvent$UrlPackage referUrlPackage;
    public int type;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientEvent$ClickEvent[] _emptyArray;

    public void ClientEvent$ClickEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$ClickEvent[] emptyArray(){
       if (ClientEvent$ClickEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ClickEvent._emptyArray == null) {
             ClientEvent$ClickEvent[] uClickEventA = new ClientEvent$ClickEvent[0];
             ClientEvent$ClickEvent._emptyArray = uClickEventA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ClickEvent._emptyArray;
    }
    public static ClientEvent$ClickEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ClickEvent().mergeFrom(p0);
    }
    public static ClientEvent$ClickEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ClickEvent(), p0);
    }
    public ClientEvent$ClickEvent clear(){
       this.type = 0;
       this.direction = 0;
       this.urlPackage = null;
       this.referUrlPackage = null;
       this.elementPackage = null;
       this.referElementPackage = null;
       this.contentPackage = null;
       this.extraMessage = "";
       this.contentWrapper = "";
       this.areaPackage = null;
       this.internalStidContainer = null;
       this.internalStidContainerJson = "";
       this.interStidContainer = null;
       this.correlationId = 0;
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ClickEvent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.direction;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttype);
       }
       ttype = this.urlPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       ttype = this.referUrlPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, ttype);
       }
       ttype = this.elementPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, ttype);
       }
       ttype = this.referElementPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, ttype);
       }
       ttype = this.contentPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, ttype);
       }
       String str = "";
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.extraMessage);
       }
       if (!(this.contentWrapper).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.contentWrapper);
       }
       ttype = this.areaPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, ttype);
       }
       ttype = this.internalStidContainer;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, ttype);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.internalStidContainerJson);
       }
       ttype = this.interStidContainer;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, ttype);
       }
       ClientEvent$ClickEvent tcorrelation = this.correlationId;
       if (tcorrelation) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(14, tcorrelation);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ClickEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
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
                this.type = i;
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.direction = i;
                }
                break;
              case 26:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case '"':
                if (this.referUrlPackage == null) {
                   this.referUrlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.referUrlPackage);
                break;
              case '*':
                if (this.elementPackage == null) {
                   this.elementPackage = new ClientEvent$ElementPackage();
                }
                p0.readMessage(this.elementPackage);
                break;
              case '2':
                if (this.referElementPackage == null) {
                   this.referElementPackage = new ClientEvent$ElementPackage();
                }
                p0.readMessage(this.referElementPackage);
                break;
              case ':':
                if (this.contentPackage == null) {
                   this.contentPackage = new ClientContent$ContentPackage();
                }
                p0.readMessage(this.contentPackage);
                break;
              case 'B':
                this.extraMessage = p0.readString();
                break;
              case 'J':
                this.contentWrapper = p0.readString();
                break;
              case 'R':
                if (this.areaPackage == null) {
                   this.areaPackage = new ClientEvent$AreaPackage();
                }
                p0.readMessage(this.areaPackage);
                break;
              case 'Z':
                if (this.internalStidContainer == null) {
                   this.internalStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.internalStidContainer);
                break;
              case 'b':
                this.internalStidContainerJson = p0.readString();
                break;
              case 'j':
                if (this.interStidContainer == null) {
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
                break;
              case 'p':
                this.correlationId = p0.readUInt64();
                break;
              case 'z':
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
       ClientEvent$ClickEvent ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.direction;
       if (ttype != null) {
          p0.writeInt32(2, ttype);
       }
       ttype = this.urlPackage;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       ttype = this.referUrlPackage;
       if (ttype != null) {
          p0.writeMessage(4, ttype);
       }
       ttype = this.elementPackage;
       if (ttype != null) {
          p0.writeMessage(5, ttype);
       }
       ttype = this.referElementPackage;
       if (ttype != null) {
          p0.writeMessage(6, ttype);
       }
       ttype = this.contentPackage;
       if (ttype != null) {
          p0.writeMessage(7, ttype);
       }
       String str = "";
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(8, this.extraMessage);
       }
       if (!(this.contentWrapper).equals(str)) {
          p0.writeString(9, this.contentWrapper);
       }
       ttype = this.areaPackage;
       if (ttype != null) {
          p0.writeMessage(10, ttype);
       }
       ttype = this.internalStidContainer;
       if (ttype != null) {
          p0.writeMessage(11, ttype);
       }
       if (!(this.internalStidContainerJson).equals(str)) {
          p0.writeString(12, this.internalStidContainerJson);
       }
       ttype = this.interStidContainer;
       if (ttype != null) {
          p0.writeMessage(13, ttype);
       }
       ClientEvent$ClickEvent tcorrelation = this.correlationId;
       if (tcorrelation) {
          p0.writeUInt64(14, tcorrelation);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(15, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
