package com.kuaishou.client.log.content.packages.nano.ClientContent$EditEffectPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$EditEffectPackage extends MessageNano	// class@001239
{
    public String id;
    public int index;
    public static ClientContent$EditEffectPackage[] _emptyArray;

    public void ClientContent$EditEffectPackage(){
       super();
       this.clear();
    }
    public static ClientContent$EditEffectPackage[] emptyArray(){
       if (ClientContent$EditEffectPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$EditEffectPackage._emptyArray == null) {
             ClientContent$EditEffectPackage[] uEditEffectP = new ClientContent$EditEffectPackage[0];
             ClientContent$EditEffectPackage._emptyArray = uEditEffectP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$EditEffectPackage._emptyArray;
    }
    public static ClientContent$EditEffectPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$EditEffectPackage().mergeFrom(p0);
    }
    public static ClientContent$EditEffectPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$EditEffectPackage(), p0);
    }
    public ClientContent$EditEffectPackage clear(){
       this.id = "";
       this.index = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       ClientContent$EditEffectPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$EditEffectPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.index = p0.readUInt32();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       ClientContent$EditEffectPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(2, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
