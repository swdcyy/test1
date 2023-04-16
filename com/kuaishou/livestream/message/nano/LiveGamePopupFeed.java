package com.kuaishou.livestream.message.nano.LiveGamePopupFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveGamePopupFeed extends MessageNano	// class@0011b7
{
    public long popupId;
    public long randomTime;
    public int type;
    public static LiveGamePopupFeed[] _emptyArray;

    public void LiveGamePopupFeed(){
       super();
       this.clear();
    }
    public static LiveGamePopupFeed[] emptyArray(){
       if (LiveGamePopupFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGamePopupFeed._emptyArray == null) {
             LiveGamePopupFeed[] liveGamePopu = new LiveGamePopupFeed[0];
             LiveGamePopupFeed._emptyArray = liveGamePopu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGamePopupFeed._emptyArray;
    }
    public static LiveGamePopupFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveGamePopupFeed().mergeFrom(p0);
    }
    public static LiveGamePopupFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGamePopupFeed(), p0);
    }
    public LiveGamePopupFeed clear(){
       this.type = 0;
       this.popupId = 0;
       this.randomTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGamePopupFeed ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.popupId;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       ttype = this.randomTime;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGamePopupFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.randomTime = p0.readUInt64();
                }
             }else {
                this.popupId = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveGamePopupFeed ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.popupId;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(2, ttype);
       }
       ttype = this.randomTime;
       if (ttype - i) {
          p0.writeUInt64(3, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
