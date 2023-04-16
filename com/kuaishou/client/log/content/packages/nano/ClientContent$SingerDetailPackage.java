package com.kuaishou.client.log.content.packages.nano.ClientContent$SingerDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$SingerDetailPackage extends MessageNano	// class@0012dd
{
    public String identity;
    public int index;
    public String name;
    public static ClientContent$SingerDetailPackage[] _emptyArray;

    public void ClientContent$SingerDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$SingerDetailPackage[] emptyArray(){
       if (ClientContent$SingerDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$SingerDetailPackage._emptyArray == null) {
             ClientContent$SingerDetailPackage[] singerDetail = new ClientContent$SingerDetailPackage[0];
             ClientContent$SingerDetailPackage._emptyArray = singerDetail;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$SingerDetailPackage._emptyArray;
    }
    public static ClientContent$SingerDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$SingerDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$SingerDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$SingerDetailPackage(), p0);
    }
    public ClientContent$SingerDetailPackage clear(){
       this.identity = "";
       this.name = "";
       this.index = 0;
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
       ClientContent$SingerDetailPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$SingerDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
       ClientContent$SingerDetailPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
