package com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MusicDetailPackage extends MessageNano	// class@0012b6
{
    public long cSource;
    public long categoryId;
    public String expTag;
    public String identity;
    public int index;
    public String llsid;
    public String name;
    public String params;
    public String type;
    public static ClientContent$MusicDetailPackage[] _emptyArray;

    public void ClientContent$MusicDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$MusicDetailPackage[] emptyArray(){
       if (ClientContent$MusicDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MusicDetailPackage._emptyArray == null) {
             ClientContent$MusicDetailPackage[] musicDetailP = new ClientContent$MusicDetailPackage[0];
             ClientContent$MusicDetailPackage._emptyArray = musicDetailP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MusicDetailPackage._emptyArray;
    }
    public static ClientContent$MusicDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MusicDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$MusicDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MusicDetailPackage(), p0);
    }
    public ClientContent$MusicDetailPackage clear(){
       this.identity = "";
       this.name = "";
       this.index = 0;
       this.type = "";
       this.categoryId = 0;
       this.expTag = "";
       this.llsid = "";
       this.cSource = 0;
       this.params = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       ClientContent$MusicDetailPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.type);
       }
       ClientContent$MusicDetailPackage tcategoryId = this.categoryId;
       if (tcategoryId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcategoryId);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.expTag);
       }
       if (!(this.llsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.llsid);
       }
       tcategoryId = this.cSource;
       if (tcategoryId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tcategoryId);
       }
       if (!(this.params).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.params);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MusicDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.params = p0.readString();
                                  }
                               }else {
                                  this.cSource = p0.readUInt64();
                               }
                            }else {
                               this.llsid = p0.readString();
                            }
                         }else {
                            this.expTag = p0.readString();
                         }
                      }else {
                         this.categoryId = p0.readUInt64();
                      }
                   }else {
                      this.type = p0.readString();
                   }
                }else {
                   this.index = p0.readUInt32();
                }
             }else {
                this.name = p0.readString();
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
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       ClientContent$MusicDetailPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       if (!(this.type).equals(str)) {
          p0.writeString(4, this.type);
       }
       ClientContent$MusicDetailPackage tcategoryId = this.categoryId;
       if (tcategoryId) {
          p0.writeUInt64(5, tcategoryId);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(6, this.expTag);
       }
       if (!(this.llsid).equals(str)) {
          p0.writeString(7, this.llsid);
       }
       tcategoryId = this.cSource;
       if (tcategoryId) {
          p0.writeUInt64(8, tcategoryId);
       }
       if (!(this.params).equals(str)) {
          p0.writeString(9, this.params);
       }
       super.writeTo(p0);
       return;
    }
}
