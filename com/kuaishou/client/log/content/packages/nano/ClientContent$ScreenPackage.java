package com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ScreenPackage extends MessageNano	// class@0012d8
{
    public int orientation;
    public static ClientContent$ScreenPackage[] _emptyArray;

    public void ClientContent$ScreenPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ScreenPackage[] emptyArray(){
       if (ClientContent$ScreenPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ScreenPackage._emptyArray == null) {
             ClientContent$ScreenPackage[] screenPackag = new ClientContent$ScreenPackage[0];
             ClientContent$ScreenPackage._emptyArray = screenPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ScreenPackage._emptyArray;
    }
    public static ClientContent$ScreenPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ScreenPackage().mergeFrom(p0);
    }
    public static ClientContent$ScreenPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ScreenPackage(), p0);
    }
    public ClientContent$ScreenPackage clear(){
       this.orientation = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ScreenPackage torientation = this.orientation;
       if (torientation != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, torientation);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ScreenPackage mergeFrom(CodedInputByteBufferNano p0){
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
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.orientation = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$ScreenPackage torientation = this.orientation;
       if (torientation != null) {
          p0.writeInt32(1, torientation);
       }
       super.writeTo(p0);
       return;
    }
}
