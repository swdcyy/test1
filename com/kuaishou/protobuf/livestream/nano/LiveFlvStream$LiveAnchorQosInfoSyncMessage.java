package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveAnchorQosInfoSyncMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveAnchorQosInfoSyncMessage extends MessageNano	// class@000c63
{
    public int atxFrDly;
    public int ktpSrtt;
    public int maxQ;
    public int pushStreamType;
    public int version;
    public static LiveFlvStream$LiveAnchorQosInfoSyncMessage[] _emptyArray;

    public void LiveFlvStream$LiveAnchorQosInfoSyncMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveAnchorQosInfoSyncMessage[] emptyArray(){
       if (LiveFlvStream$LiveAnchorQosInfoSyncMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveAnchorQosInfoSyncMessage._emptyArray == null) {
             LiveFlvStream$LiveAnchorQosInfoSyncMessage[] liveAnchorQo = new LiveFlvStream$LiveAnchorQosInfoSyncMessage[0];
             LiveFlvStream$LiveAnchorQosInfoSyncMessage._emptyArray = liveAnchorQo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveAnchorQosInfoSyncMessage._emptyArray;
    }
    public static LiveFlvStream$LiveAnchorQosInfoSyncMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveAnchorQosInfoSyncMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveAnchorQosInfoSyncMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveAnchorQosInfoSyncMessage(), p0);
    }
    public LiveFlvStream$LiveAnchorQosInfoSyncMessage clear(){
       this.version = 0;
       this.pushStreamType = 0;
       this.maxQ = 0;
       this.ktpSrtt = 0;
       this.atxFrDly = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveAnchorQosInfoSyncMessage tversion = this.version;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tversion);
       }
       tversion = this.pushStreamType;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tversion);
       }
       tversion = this.maxQ;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tversion);
       }
       tversion = this.ktpSrtt;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tversion);
       }
       tversion = this.atxFrDly;
       if (tversion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveAnchorQosInfoSyncMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.atxFrDly = p0.readUInt32();
                      }
                   }else {
                      this.ktpSrtt = p0.readUInt32();
                   }
                }else {
                   this.maxQ = p0.readUInt32();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.pushStreamType = i;
                }
             }
          }else {
             this.version = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveAnchorQosInfoSyncMessage tversion = this.version;
       if (tversion != null) {
          p0.writeUInt32(1, tversion);
       }
       tversion = this.pushStreamType;
       if (tversion != null) {
          p0.writeInt32(2, tversion);
       }
       tversion = this.maxQ;
       if (tversion != null) {
          p0.writeUInt32(3, tversion);
       }
       tversion = this.ktpSrtt;
       if (tversion != null) {
          p0.writeUInt32(4, tversion);
       }
       tversion = this.atxFrDly;
       if (tversion != null) {
          p0.writeUInt32(5, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
