package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvSyncLyricsMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveFlvSyncLyricsMessage extends MessageNano	// class@000c71
{
    public long lyricsOffset;
    public String orderId;
    public int syncLyricsType;
    public int syncState;
    public static LiveFlvStream$LiveFlvSyncLyricsMessage[] _emptyArray;

    public void LiveFlvStream$LiveFlvSyncLyricsMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveFlvSyncLyricsMessage[] emptyArray(){
       if (LiveFlvStream$LiveFlvSyncLyricsMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveFlvSyncLyricsMessage._emptyArray == null) {
             LiveFlvStream$LiveFlvSyncLyricsMessage[] liveFlvSyncL = new LiveFlvStream$LiveFlvSyncLyricsMessage[0];
             LiveFlvStream$LiveFlvSyncLyricsMessage._emptyArray = liveFlvSyncL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveFlvSyncLyricsMessage._emptyArray;
    }
    public static LiveFlvStream$LiveFlvSyncLyricsMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveFlvSyncLyricsMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveFlvSyncLyricsMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveFlvSyncLyricsMessage(), p0);
    }
    public LiveFlvStream$LiveFlvSyncLyricsMessage clear(){
       this.syncLyricsType = 0;
       this.lyricsOffset = 0;
       this.orderId = "";
       this.syncState = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveFlvSyncLyricsMessage tsyncLyricsT = this.syncLyricsType;
       if (tsyncLyricsT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsyncLyricsT);
       }
       tsyncLyricsT = this.lyricsOffset;
       if (tsyncLyricsT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tsyncLyricsT);
       }
       if (!(this.orderId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.orderId);
       }
       tsyncLyricsT = this.syncState;
       if (tsyncLyricsT != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tsyncLyricsT);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveFlvSyncLyricsMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && (i != 2 && i != 3))) {
                         continue ;
                      }else {
                         this.syncState = i;
                      }
                   }
                }else {
                   this.orderId = p0.readString();
                }
             }else {
                this.lyricsOffset = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.syncLyricsType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveFlvSyncLyricsMessage tsyncLyricsT = this.syncLyricsType;
       if (tsyncLyricsT != null) {
          p0.writeInt32(1, tsyncLyricsT);
       }
       tsyncLyricsT = this.lyricsOffset;
       if (tsyncLyricsT) {
          p0.writeUInt64(2, tsyncLyricsT);
       }
       if (!(this.orderId).equals("")) {
          p0.writeString(3, this.orderId);
       }
       tsyncLyricsT = this.syncState;
       if (tsyncLyricsT != null) {
          p0.writeInt32(4, tsyncLyricsT);
       }
       super.writeTo(p0);
       return;
    }
}
