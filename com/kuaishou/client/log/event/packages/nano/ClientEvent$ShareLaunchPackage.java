package com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareLaunchPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$ShareLaunchPackage extends MessageNano	// class@001371
{
    public String extraInfo;
    public String shareId;
    public String token;
    public static ClientEvent$ShareLaunchPackage[] _emptyArray;

    public void ClientEvent$ShareLaunchPackage(){
       super();
       this.clear();
    }
    public static ClientEvent$ShareLaunchPackage[] emptyArray(){
       if (ClientEvent$ShareLaunchPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ShareLaunchPackage._emptyArray == null) {
             ClientEvent$ShareLaunchPackage[] shareLaunchP = new ClientEvent$ShareLaunchPackage[0];
             ClientEvent$ShareLaunchPackage._emptyArray = shareLaunchP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ShareLaunchPackage._emptyArray;
    }
    public static ClientEvent$ShareLaunchPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ShareLaunchPackage().mergeFrom(p0);
    }
    public static ClientEvent$ShareLaunchPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ShareLaunchPackage(), p0);
    }
    public ClientEvent$ShareLaunchPackage clear(){
       this.shareId = "";
       this.token = "";
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.shareId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.shareId);
       }
       if (!(this.token).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.token);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ShareLaunchPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.extraInfo = p0.readString();
                }
             }else {
                this.token = p0.readString();
             }
          }else {
             this.shareId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.shareId).equals(str)) {
          p0.writeString(1, this.shareId);
       }
       if (!(this.token).equals(str)) {
          p0.writeString(2, this.token);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(3, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
