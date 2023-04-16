package com.kuaishou.client.log.content.packages.nano.ClientContent$StickerInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$StickerInfoPackage extends MessageNano	// class@0012e1
{
    public String id;
    public int index;
    public int pageIndex;
    public String secondaryType;
    public int type;
    public static ClientContent$StickerInfoPackage[] _emptyArray;

    public void ClientContent$StickerInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$StickerInfoPackage[] emptyArray(){
       if (ClientContent$StickerInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$StickerInfoPackage._emptyArray == null) {
             ClientContent$StickerInfoPackage[] stickerInfoP = new ClientContent$StickerInfoPackage[0];
             ClientContent$StickerInfoPackage._emptyArray = stickerInfoP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$StickerInfoPackage._emptyArray;
    }
    public static ClientContent$StickerInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$StickerInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$StickerInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$StickerInfoPackage(), p0);
    }
    public ClientContent$StickerInfoPackage clear(){
       this.type = 0;
       this.secondaryType = "";
       this.id = "";
       this.pageIndex = 0;
       this.index = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$StickerInfoPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.secondaryType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.secondaryType);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.id);
       }
       ttype = this.pageIndex;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, ttype);
       }
       ttype = this.index;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$StickerInfoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.index = p0.readUInt32();
                      }
                   }else {
                      this.pageIndex = p0.readUInt32();
                   }
                }else {
                   this.id = p0.readString();
                }
             }else {
                this.secondaryType = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$StickerInfoPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.secondaryType).equals(str)) {
          p0.writeString(2, this.secondaryType);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(3, this.id);
       }
       ttype = this.pageIndex;
       if (ttype != null) {
          p0.writeUInt32(4, ttype);
       }
       ttype = this.index;
       if (ttype != null) {
          p0.writeUInt32(5, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
