package com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessageLinkPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$IMMessageLinkPackage extends MessageNano	// class@00124e
{
    public String desc;
    public String iconUrl;
    public String name;
    public int style;
    public String title;
    public String url;
    public static ClientContent$IMMessageLinkPackage[] _emptyArray;

    public void ClientContent$IMMessageLinkPackage(){
       super();
       this.clear();
    }
    public static ClientContent$IMMessageLinkPackage[] emptyArray(){
       if (ClientContent$IMMessageLinkPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$IMMessageLinkPackage._emptyArray == null) {
             ClientContent$IMMessageLinkPackage[] iMMessageLin = new ClientContent$IMMessageLinkPackage[0];
             ClientContent$IMMessageLinkPackage._emptyArray = iMMessageLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$IMMessageLinkPackage._emptyArray;
    }
    public static ClientContent$IMMessageLinkPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$IMMessageLinkPackage().mergeFrom(p0);
    }
    public static ClientContent$IMMessageLinkPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$IMMessageLinkPackage(), p0);
    }
    public ClientContent$IMMessageLinkPackage clear(){
       this.url = "";
       this.iconUrl = "";
       this.title = "";
       this.desc = "";
       this.name = "";
       this.style = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.url);
       }
       if (!(this.iconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.iconUrl);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.desc);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.name);
       }
       ClientContent$IMMessageLinkPackage tstyle = this.style;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tstyle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$IMMessageLinkPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && i != 1) {
                               continue ;
                            }else {
                               this.style = i;
                            }
                         }
                      }else {
                         this.name = p0.readString();
                      }
                   }else {
                      this.desc = p0.readString();
                   }
                }else {
                   this.title = p0.readString();
                }
             }else {
                this.iconUrl = p0.readString();
             }
          }else {
             this.url = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(1, this.url);
       }
       if (!(this.iconUrl).equals(str)) {
          p0.writeString(2, this.iconUrl);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(3, this.title);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(4, this.desc);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(5, this.name);
       }
       ClientContent$IMMessageLinkPackage tstyle = this.style;
       if (tstyle != null) {
          p0.writeInt32(6, tstyle);
       }
       super.writeTo(p0);
       return;
    }
}
