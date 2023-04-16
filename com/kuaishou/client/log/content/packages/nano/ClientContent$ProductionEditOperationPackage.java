package com.kuaishou.client.log.content.packages.nano.ClientContent$ProductionEditOperationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ProductionEditOperationPackage extends MessageNano	// class@0012c8
{
    public String name;
    public String params;
    public String subType;
    public int tabId;
    public String tabName;
    public int type;
    public static ClientContent$ProductionEditOperationPackage[] _emptyArray;

    public void ClientContent$ProductionEditOperationPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ProductionEditOperationPackage[] emptyArray(){
       if (ClientContent$ProductionEditOperationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ProductionEditOperationPackage._emptyArray == null) {
             ClientContent$ProductionEditOperationPackage[] productionEd = new ClientContent$ProductionEditOperationPackage[0];
             ClientContent$ProductionEditOperationPackage._emptyArray = productionEd;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ProductionEditOperationPackage._emptyArray;
    }
    public static ClientContent$ProductionEditOperationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ProductionEditOperationPackage().mergeFrom(p0);
    }
    public static ClientContent$ProductionEditOperationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ProductionEditOperationPackage(), p0);
    }
    public ClientContent$ProductionEditOperationPackage clear(){
       this.type = 0;
       this.subType = "";
       this.name = "";
       this.params = "";
       this.tabId = 0;
       this.tabName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ProductionEditOperationPackage ttype = this.type;
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
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.params);
       }
       ttype = this.tabId;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ttype);
       }
       if (!(this.tabName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.tabName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ProductionEditOperationPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.tabName = p0.readString();
                         }
                      }else {
                         this.tabId = p0.readInt32();
                      }
                   }else {
                      this.params = p0.readString();
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
       ClientContent$ProductionEditOperationPackage ttype = this.type;
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
       if (!(this.params).equals(str)) {
          p0.writeString(4, this.params);
       }
       ttype = this.tabId;
       if (ttype != null) {
          p0.writeInt32(5, ttype);
       }
       if (!(this.tabName).equals(str)) {
          p0.writeString(6, this.tabName);
       }
       super.writeTo(p0);
       return;
    }
}
