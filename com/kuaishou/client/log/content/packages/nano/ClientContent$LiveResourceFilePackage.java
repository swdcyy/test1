package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveResourceFilePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveResourceFilePackage extends MessageNano	// class@001274
{
    public boolean isZipFile;
    public String type;
    public String version;
    public static ClientContent$LiveResourceFilePackage[] _emptyArray;

    public void ClientContent$LiveResourceFilePackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveResourceFilePackage[] emptyArray(){
       if (ClientContent$LiveResourceFilePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveResourceFilePackage._emptyArray == null) {
             ClientContent$LiveResourceFilePackage[] liveResource = new ClientContent$LiveResourceFilePackage[0];
             ClientContent$LiveResourceFilePackage._emptyArray = liveResource;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveResourceFilePackage._emptyArray;
    }
    public static ClientContent$LiveResourceFilePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveResourceFilePackage().mergeFrom(p0);
    }
    public static ClientContent$LiveResourceFilePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveResourceFilePackage(), p0);
    }
    public ClientContent$LiveResourceFilePackage clear(){
       this.type = "";
       this.version = "";
       this.isZipFile = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.type);
       }
       if (!(this.version).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.version);
       }
       ClientContent$LiveResourceFilePackage tisZipFile = this.isZipFile;
       if (tisZipFile != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tisZipFile);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveResourceFilePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.isZipFile = p0.readBool();
                }
             }else {
                this.version = p0.readString();
             }
          }else {
             this.type = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.type).equals(str)) {
          p0.writeString(1, this.type);
       }
       if (!(this.version).equals(str)) {
          p0.writeString(2, this.version);
       }
       ClientContent$LiveResourceFilePackage tisZipFile = this.isZipFile;
       if (tisZipFile != null) {
          p0.writeBool(3, tisZipFile);
       }
       super.writeTo(p0);
       return;
    }
}
