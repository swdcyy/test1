package com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MoreInfoPackageV2 extends MessageNano	// class@0012af
{
    public String extraInfo;
    public String id;
    public String identity;
    public String index;
    public String name;
    public String params;
    public String status;
    public String tag;
    public String text;
    public String type;
    public String vlaue;
    public static ClientContent$MoreInfoPackageV2[] _emptyArray;

    public void ClientContent$MoreInfoPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$MoreInfoPackageV2[] emptyArray(){
       if (ClientContent$MoreInfoPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MoreInfoPackageV2._emptyArray == null) {
             ClientContent$MoreInfoPackageV2[] moreInfoPack = new ClientContent$MoreInfoPackageV2[0];
             ClientContent$MoreInfoPackageV2._emptyArray = moreInfoPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MoreInfoPackageV2._emptyArray;
    }
    public static ClientContent$MoreInfoPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MoreInfoPackageV2().mergeFrom(p0);
    }
    public static ClientContent$MoreInfoPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MoreInfoPackageV2(), p0);
    }
    public ClientContent$MoreInfoPackageV2 clear(){
       this.id = "";
       this.identity = "";
       this.type = "";
       this.name = "";
       this.index = "";
       this.vlaue = "";
       this.status = "";
       this.text = "";
       this.tag = "";
       this.params = "";
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.identity);
       }
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.type);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.name);
       }
       if (!(this.index).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.index);
       }
       if (!(this.vlaue).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.vlaue);
       }
       if (!(this.status).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.status);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.text);
       }
       if (!(this.tag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.tag);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.params);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MoreInfoPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                this.identity = p0.readString();
                break;
              case 26:
                this.type = p0.readString();
                break;
              case '"':
                this.name = p0.readString();
                break;
              case '*':
                this.index = p0.readString();
                break;
              case '2':
                this.vlaue = p0.readString();
                break;
              case ':':
                this.status = p0.readString();
                break;
              case 'B':
                this.text = p0.readString();
                break;
              case 'J':
                this.tag = p0.readString();
                break;
              case 'R':
                this.params = p0.readString();
                break;
              case 'Z':
                this.extraInfo = p0.readString();
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.identity).equals(str)) {
          p0.writeString(2, this.identity);
       }
       if (!(this.type).equals(str)) {
          p0.writeString(3, this.type);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(4, this.name);
       }
       if (!(this.index).equals(str)) {
          p0.writeString(5, this.index);
       }
       if (!(this.vlaue).equals(str)) {
          p0.writeString(6, this.vlaue);
       }
       if (!(this.status).equals(str)) {
          p0.writeString(7, this.status);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(8, this.text);
       }
       if (!(this.tag).equals(str)) {
          p0.writeString(9, this.tag);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(10, this.params);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(11, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}