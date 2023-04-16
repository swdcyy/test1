package com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatStatistic;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatUserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveArenaLineChatStatistic extends MessageNano	// class@000c2f
{
    public boolean ended;
    public long freeChatEndTime;
    public long freeChatStartTime;
    public long hostUserId;
    public LiveArenaLineChatUserInfo[] orderList;
    public long version;
    public long winnerUserId;
    public static LiveArenaLineChatStatistic[] _emptyArray;

    public void LiveArenaLineChatStatistic(){
       super();
       this.clear();
    }
    public static LiveArenaLineChatStatistic[] emptyArray(){
       if (LiveArenaLineChatStatistic._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveArenaLineChatStatistic._emptyArray == null) {
             LiveArenaLineChatStatistic[] liveArenaLin = new LiveArenaLineChatStatistic[0];
             LiveArenaLineChatStatistic._emptyArray = liveArenaLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveArenaLineChatStatistic._emptyArray;
    }
    public static LiveArenaLineChatStatistic parseFrom(CodedInputByteBufferNano p0){
       return new LiveArenaLineChatStatistic().mergeFrom(p0);
    }
    public static LiveArenaLineChatStatistic parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveArenaLineChatStatistic(), p0);
    }
    public LiveArenaLineChatStatistic clear(){
       this.orderList = LiveArenaLineChatUserInfo.emptyArray();
       this.ended = false;
       this.winnerUserId = 0;
       this.hostUserId = 0;
       this.version = 0;
       this.freeChatStartTime = 0;
       this.freeChatEndTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveArenaLineChatStatistic torderList = this.orderList;
       if (torderList != null && torderList.length > 0) {
          int i1 = 0;
          LiveArenaLineChatStatistic torderList1 = this.orderList;
          while (i1 < torderList1.length) {
             object oobject = torderList1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       torderList = this.ended;
       if (torderList != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, torderList);
       }
       torderList = this.winnerUserId;
       int i2 = 0;
       if (torderList - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, torderList);
       }
       torderList = this.hostUserId;
       if (torderList - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, torderList);
       }
       torderList = this.version;
       if (torderList - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, torderList);
       }
       torderList = this.freeChatStartTime;
       if (torderList - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, torderList);
       }
       torderList = this.freeChatEndTime;
       if (torderList - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, torderList);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveArenaLineChatStatistic mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.freeChatEndTime = p0.readUInt64();
                            }
                         }else {
                            this.freeChatStartTime = p0.readUInt64();
                         }
                      }else {
                         this.version = p0.readUInt64();
                      }
                   }else {
                      this.hostUserId = p0.readUInt64();
                   }
                }else {
                   this.winnerUserId = p0.readUInt64();
                }
             }else {
                this.ended = p0.readBool();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveArenaLineChatStatistic torderList = this.orderList;
             int i2 = (torderList == null)? 0: torderList.length;
             i = i + i2;
             LiveArenaLineChatUserInfo[] liveArenaLin = new LiveArenaLineChatUserInfo[i];
             if (i2) {
                System.arraycopy(torderList, 0, liveArenaLin, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveArenaLin[i2] = new LiveArenaLineChatUserInfo();
                p0.readMessage(liveArenaLin[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveArenaLin[i2] = new LiveArenaLineChatUserInfo();
             p0.readMessage(liveArenaLin[i2]);
             this.orderList = liveArenaLin;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveArenaLineChatStatistic torderList = this.orderList;
       if (torderList != null && torderList.length > 0) {
          int i = 0;
          LiveArenaLineChatStatistic torderList1 = this.orderList;
          while (i < torderList1.length) {
             object oobject = torderList1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       torderList = this.ended;
       if (torderList != null) {
          p0.writeBool(2, torderList);
       }
       torderList = this.winnerUserId;
       int i1 = 0;
       if (torderList - i1) {
          p0.writeUInt64(3, torderList);
       }
       torderList = this.hostUserId;
       if (torderList - i1) {
          p0.writeUInt64(4, torderList);
       }
       torderList = this.version;
       if (torderList - i1) {
          p0.writeUInt64(5, torderList);
       }
       torderList = this.freeChatStartTime;
       if (torderList - i1) {
          p0.writeUInt64(6, torderList);
       }
       torderList = this.freeChatEndTime;
       if (torderList - i1) {
          p0.writeUInt64(7, torderList);
       }
       super.writeTo(p0);
       return;
    }
}
