package com.kuaishou.client.log.stat.packages.nano.ClientStat$EdgeItemMetaInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$EdgeItemMetaInfo extends MessageNano	// class@0013d0
{
    public String id;
    public String type;
    public static ClientStat$EdgeItemMetaInfo[] _emptyArray;

    public void ClientStat$EdgeItemMetaInfo(){
       super();
       this.clear();
    }
    public static ClientStat$EdgeItemMetaInfo[] emptyArray(){
       if (ClientStat$EdgeItemMetaInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EdgeItemMetaInfo._emptyArray == null) {
             ClientStat$EdgeItemMetaInfo[] uEdgeItemMet = new ClientStat$EdgeItemMetaInfo[0];
             ClientStat$EdgeItemMetaInfo._emptyArray = uEdgeItemMet;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EdgeItemMetaInfo._emptyArray;
    }
    public static ClientStat$EdgeItemMetaInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EdgeItemMetaInfo().mergeFrom(p0);
    }
    public static ClientStat$EdgeItemMetaInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EdgeItemMetaInfo(), p0);
    }
    public ClientStat$EdgeItemMetaInfo clear(){
       this.type = "";
       this.id = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.type);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EdgeItemMetaInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.id = p0.readString();
             }
          }else {
             this.type = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.type).equals(str)) {
          p0.writeString(1, this.type);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(2, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
