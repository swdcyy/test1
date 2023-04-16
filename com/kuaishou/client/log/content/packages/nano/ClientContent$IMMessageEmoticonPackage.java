package com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessageEmoticonPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$IMMessageEmoticonPackage extends MessageNano	// class@00124c
{
    public int bizType;
    public String id;
    public String name;
    public String packageId;
    public int type;
    public String url;
    public static ClientContent$IMMessageEmoticonPackage[] _emptyArray;

    public void ClientContent$IMMessageEmoticonPackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMMessageEmoticonPackage[] emptyArray(){
       if (ClientContent$IMMessageEmoticonPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMMessageEmoticonPackage._emptyArray == null) {
             ClientContent$IMMessageEmoticonPackage[] iMMessageEmo = new ClientContent$IMMessageEmoticonPackage[0];
             ClientContent$IMMessageEmoticonPackage._emptyArray = iMMessageEmo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMMessageEmoticonPackage._emptyArray;
    }
    public static ClientContent$IMMessageEmoticonPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMMessageEmoticonPackage().mergeFrom(p0);
    }
    public static ClientContent$IMMessageEmoticonPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMMessageEmoticonPackage(), p0);
    }
    public ClientContent$IMMessageEmoticonPackage clear(){
       this.id = "";
       this.packageId = "";
       this.name = "";
       this.type = 0;
       this.bizType = 0;
       this.url = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.packageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.packageId);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.name);
       }
       ClientContent$IMMessageEmoticonPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ttype);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.url);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMMessageEmoticonPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.url = p0.readString();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 6))))) {
                            continue ;
                         }else {
                            this.bizType = i;
                         }
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                         continue ;
                      }else {
                         this.type = i;
                      }
                   }
                }else {
                   this.name = p0.readString();
                }
             }else {
                this.packageId = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.packageId).equals(str)) {
          p0.writeString(2, this.packageId);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(3, this.name);
       }
       ClientContent$IMMessageEmoticonPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(4, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          p0.writeInt32(5, ttype);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(6, this.url);
       }
       super.writeTo(p0);
       return;
    }
}
