package com.kuaishou.client.log.content.packages.nano.ClientContent$FeedShowCountPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$FeedShowCountPackage extends MessageNano	// class@00123f
{
    public int count;
    public int type;
    public static ClientContent$FeedShowCountPackage[] _emptyArray;

    public void ClientContent$FeedShowCountPackage(){
       super();
       this.clear();
    }
    public static ClientContent$FeedShowCountPackage[] emptyArray(){
       if (ClientContent$FeedShowCountPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$FeedShowCountPackage._emptyArray == null) {
             ClientContent$FeedShowCountPackage[] uFeedShowCou = new ClientContent$FeedShowCountPackage[0];
             ClientContent$FeedShowCountPackage._emptyArray = uFeedShowCou;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$FeedShowCountPackage._emptyArray;
    }
    public static ClientContent$FeedShowCountPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$FeedShowCountPackage().mergeFrom(p0);
    }
    public static ClientContent$FeedShowCountPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$FeedShowCountPackage(), p0);
    }
    public ClientContent$FeedShowCountPackage clear(){
       this.type = 0;
       this.count = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$FeedShowCountPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.count;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$FeedShowCountPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.count = p0.readUInt32();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$FeedShowCountPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.count;
       if (ttype != null) {
          p0.writeUInt32(2, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
