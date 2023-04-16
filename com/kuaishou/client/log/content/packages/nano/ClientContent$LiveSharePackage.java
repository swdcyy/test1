package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveSharePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveSharePackage extends MessageNano	// class@001285
{
    public int guideTriggerRule;
    public int shareBoxSourceType;
    public int shareChannel;
    public int thirdPartyPlatform;
    public static ClientContent$LiveSharePackage[] _emptyArray;

    public void ClientContent$LiveSharePackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveSharePackage[] emptyArray(){
       if (ClientContent$LiveSharePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveSharePackage._emptyArray == null) {
             ClientContent$LiveSharePackage[] liveSharePac = new ClientContent$LiveSharePackage[0];
             ClientContent$LiveSharePackage._emptyArray = liveSharePac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveSharePackage._emptyArray;
    }
    public static ClientContent$LiveSharePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveSharePackage().mergeFrom(p0);
    }
    public static ClientContent$LiveSharePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveSharePackage(), p0);
    }
    public ClientContent$LiveSharePackage clear(){
       this.shareChannel = 0;
       this.guideTriggerRule = 0;
       this.thirdPartyPlatform = 0;
       this.shareBoxSourceType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LiveSharePackage tshareChanne = this.shareChannel;
       if (tshareChanne != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tshareChanne);
       }
       tshareChanne = this.guideTriggerRule;
       if (tshareChanne != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tshareChanne);
       }
       tshareChanne = this.thirdPartyPlatform;
       if (tshareChanne != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tshareChanne);
       }
       tshareChanne = this.shareBoxSourceType;
       if (tshareChanne != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tshareChanne);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveSharePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
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
                      this.shareBoxSourceType = i;
                   }
                }else {
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
                       case 12:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case '1':
                       case '2':
                       case '3':
                       case '4':
                       case '5':
                       case '6':
                       case '7':
                       case '8':
                       case '9':
                       case ':':
                       case ';':
                       case '<':
                       case '=':
                       case '>':
                       case '?':
                       case '@':
                       case 'A':
                       case 'B':
                       case 'C':
                       case 'D':
                       case 'E':
                       case 1:
                         break;
                       default:
                   }
                   this.thirdPartyPlatform = i;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.guideTriggerRule = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.shareChannel = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$LiveSharePackage tshareChanne = this.shareChannel;
       if (tshareChanne != null) {
          p0.writeInt32(1, tshareChanne);
       }
       tshareChanne = this.guideTriggerRule;
       if (tshareChanne != null) {
          p0.writeInt32(2, tshareChanne);
       }
       tshareChanne = this.thirdPartyPlatform;
       if (tshareChanne != null) {
          p0.writeInt32(3, tshareChanne);
       }
       tshareChanne = this.shareBoxSourceType;
       if (tshareChanne != null) {
          p0.writeInt32(4, tshareChanne);
       }
       super.writeTo(p0);
       return;
    }
}
