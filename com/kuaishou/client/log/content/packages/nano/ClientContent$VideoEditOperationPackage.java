package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$VideoEditOperationPackage extends MessageNano	// class@0012f3
{
    public String extraMessage;
    public String name;
    public String subType;
    public int type;
    public String value;
    public static ClientContent$VideoEditOperationPackage[] _emptyArray;

    public void ClientContent$VideoEditOperationPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoEditOperationPackage[] emptyArray(){
       if (ClientContent$VideoEditOperationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoEditOperationPackage._emptyArray == null) {
             ClientContent$VideoEditOperationPackage[] videoEditOpe = new ClientContent$VideoEditOperationPackage[0];
             ClientContent$VideoEditOperationPackage._emptyArray = videoEditOpe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoEditOperationPackage._emptyArray;
    }
    public static ClientContent$VideoEditOperationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoEditOperationPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoEditOperationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoEditOperationPackage(), p0);
    }
    public ClientContent$VideoEditOperationPackage clear(){
       this.type = 0;
       this.subType = "";
       this.name = "";
       this.value = "";
       this.extraMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VideoEditOperationPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.subType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.subType);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.name);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.value);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extraMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoEditOperationPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.extraMessage = p0.readString();
                      }
                   }else {
                      this.value = p0.readString();
                   }
                }else {
                   this.name = p0.readString();
                }
             }else {
                this.subType = p0.readString();
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
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VideoEditOperationPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.subType).equals(str)) {
          p0.writeString(2, this.subType);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(3, this.name);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(4, this.value);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(5, this.extraMessage);
       }
       super.writeTo(p0);
       return;
    }
}
