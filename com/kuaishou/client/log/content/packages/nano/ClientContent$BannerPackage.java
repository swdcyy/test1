package com.kuaishou.client.log.content.packages.nano.ClientContent$BannerPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$BannerPackage extends MessageNano	// class@001208
{
    public String identity;
    public static ClientContent$BannerPackage[] _emptyArray;

    public void ClientContent$BannerPackage(){
       super();
       this.clear();
    }
    public static ClientContent$BannerPackage[] emptyArray(){
       if (ClientContent$BannerPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BannerPackage._emptyArray == null) {
             ClientContent$BannerPackage[] uBannerPacka = new ClientContent$BannerPackage[0];
             ClientContent$BannerPackage._emptyArray = uBannerPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BannerPackage._emptyArray;
    }
    public static ClientContent$BannerPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BannerPackage().mergeFrom(p0);
    }
    public static ClientContent$BannerPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BannerPackage(), p0);
    }
    public ClientContent$BannerPackage clear(){
       this.identity = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.identity).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$BannerPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.identity = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.identity).equals("")) {
          p0.writeString(1, this.identity);
       }
       super.writeTo(p0);
       return;
    }
}
