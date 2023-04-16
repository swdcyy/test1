package com.kuaishou.client.log.content.packages.nano.ClientContent$ThemePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ThemePackage extends MessageNano	// class@0012e8
{
    public String id;
    public int index;
    public String name;
    public static ClientContent$ThemePackage[] _emptyArray;

    public void ClientContent$ThemePackage(){
       super();
       this.clear();
    }
    public static ClientContent$ThemePackage[] emptyArray(){
       if (ClientContent$ThemePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ThemePackage._emptyArray == null) {
             ClientContent$ThemePackage[] themePackage = new ClientContent$ThemePackage[0];
             ClientContent$ThemePackage._emptyArray = themePackage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ThemePackage._emptyArray;
    }
    public static ClientContent$ThemePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ThemePackage().mergeFrom(p0);
    }
    public static ClientContent$ThemePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ThemePackage(), p0);
    }
    public ClientContent$ThemePackage clear(){
       this.name = "";
       this.id = "";
       this.index = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.id);
       }
       ClientContent$ThemePackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ThemePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.index = p0.readUInt32();
                }
             }else {
                this.id = p0.readString();
             }
          }else {
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(1, this.name);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(2, this.id);
       }
       ClientContent$ThemePackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
