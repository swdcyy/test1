package com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$UserPackage extends MessageNano	// class@0012ee
{
    public int accountType;
    public String avatarStatus;
    public String identity;
    public int index;
    public String kwaiId;
    public String params;
    public boolean promotionTag;
    public String respackId;
    public static ClientContent$UserPackage[] _emptyArray;

    public void ClientContent$UserPackage(){
       super();
       this.clear();
    }
    public static ClientContent$UserPackage[] emptyArray(){
       if (ClientContent$UserPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$UserPackage._emptyArray == null) {
             ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[0];
             ClientContent$UserPackage._emptyArray = userPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$UserPackage._emptyArray;
    }
    public static ClientContent$UserPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$UserPackage().mergeFrom(p0);
    }
    public static ClientContent$UserPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$UserPackage(), p0);
    }
    public ClientContent$UserPackage clear(){
       this.identity = "";
       this.kwaiId = "";
       this.index = 0;
       this.params = "";
       this.promotionTag = false;
       this.accountType = 0;
       this.avatarStatus = "";
       this.respackId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       if (!(this.kwaiId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.kwaiId);
       }
       ClientContent$UserPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.params);
       }
       tindex = this.promotionTag;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tindex);
       }
       tindex = this.accountType;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tindex);
       }
       if (!(this.avatarStatus).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.avatarStatus);
       }
       if (!(this.respackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.respackId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$UserPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.respackId = p0.readString();
                               }
                            }else {
                               this.avatarStatus = p0.readString();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.accountType = i;
                            }
                         }
                      }else {
                         this.promotionTag = p0.readBool();
                      }
                   }else {
                      this.params = p0.readString();
                   }
                }else {
                   this.index = p0.readUInt32();
                }
             }else {
                this.kwaiId = p0.readString();
             }
          }else {
             this.identity = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(1, this.identity);
       }
       if (!(this.kwaiId).equals(str)) {
          p0.writeString(2, this.kwaiId);
       }
       ClientContent$UserPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(4, this.params);
       }
       tindex = this.promotionTag;
       if (tindex != null) {
          p0.writeBool(5, tindex);
       }
       tindex = this.accountType;
       if (tindex != null) {
          p0.writeInt32(6, tindex);
       }
       if (!(this.avatarStatus).equals(str)) {
          p0.writeString(7, this.avatarStatus);
       }
       if (!(this.respackId).equals(str)) {
          p0.writeString(8, this.respackId);
       }
       super.writeTo(p0);
       return;
    }
}
