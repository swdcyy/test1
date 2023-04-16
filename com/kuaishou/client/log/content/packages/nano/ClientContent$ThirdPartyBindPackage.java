package com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyBindPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ThirdPartyBindPackage extends MessageNano	// class@0012ea
{
    public int platform;
    public static ClientContent$ThirdPartyBindPackage[] _emptyArray;

    public void ClientContent$ThirdPartyBindPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ThirdPartyBindPackage[] emptyArray(){
       if (ClientContent$ThirdPartyBindPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ThirdPartyBindPackage._emptyArray == null) {
             ClientContent$ThirdPartyBindPackage[] thirdPartyBi = new ClientContent$ThirdPartyBindPackage[0];
             ClientContent$ThirdPartyBindPackage._emptyArray = thirdPartyBi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ThirdPartyBindPackage._emptyArray;
    }
    public static ClientContent$ThirdPartyBindPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ThirdPartyBindPackage().mergeFrom(p0);
    }
    public static ClientContent$ThirdPartyBindPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ThirdPartyBindPackage(), p0);
    }
    public ClientContent$ThirdPartyBindPackage clear(){
       this.platform = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ThirdPartyBindPackage tplatform = this.platform;
       if (tplatform != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tplatform);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ThirdPartyBindPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
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
             this.platform = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$ThirdPartyBindPackage tplatform = this.platform;
       if (tplatform != null) {
          p0.writeInt32(1, tplatform);
       }
       super.writeTo(p0);
       return;
    }
}
