package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWatchingList;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WatchingListUserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCLiveWatchingList extends MessageNano	// class@001350
{
    public String displayWatchingCount;
    public String liteDisplayWatchingCount;
    public long watchingCount;
    public LiveStreamMessages$WatchingListUserInfo[] watchingUser;
    public static LiveStreamMessages$SCLiveWatchingList[] _emptyArray;

    public void LiveStreamMessages$SCLiveWatchingList(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveWatchingList[] emptyArray(){
       if (LiveStreamMessages$SCLiveWatchingList._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveWatchingList._emptyArray == null) {
             LiveStreamMessages$SCLiveWatchingList[] sCLiveWatchi = new LiveStreamMessages$SCLiveWatchingList[0];
             LiveStreamMessages$SCLiveWatchingList._emptyArray = sCLiveWatchi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveWatchingList._emptyArray;
    }
    public static LiveStreamMessages$SCLiveWatchingList parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveWatchingList().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveWatchingList parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveWatchingList(), p0);
    }
    public LiveStreamMessages$SCLiveWatchingList clear(){
       this.watchingUser = LiveStreamMessages$WatchingListUserInfo.emptyArray();
       this.watchingCount = 0;
       this.displayWatchingCount = "";
       this.liteDisplayWatchingCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveWatchingList twatchingUse = this.watchingUser;
       if (twatchingUse != null && twatchingUse.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCLiveWatchingList twatchingUse1 = this.watchingUser;
          while (i1 < twatchingUse1.length) {
             object oobject = twatchingUse1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       twatchingUse = this.watchingCount;
       if (twatchingUse - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, twatchingUse);
       }
       String str = "";
       if (!(this.displayWatchingCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayWatchingCount);
       }
       if (!(this.liteDisplayWatchingCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liteDisplayWatchingCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveWatchingList mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.liteDisplayWatchingCount = p0.readString();
                   }
                }else {
                   this.displayWatchingCount = p0.readString();
                }
             }else {
                this.watchingCount = p0.readUInt64();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveStreamMessages$SCLiveWatchingList twatchingUse = this.watchingUser;
             int i2 = (twatchingUse == null)? 0: twatchingUse.length;
             i = i + i2;
             LiveStreamMessages$WatchingListUserInfo[] watchingList = new LiveStreamMessages$WatchingListUserInfo[i];
             if (i2) {
                System.arraycopy(twatchingUse, 0, watchingList, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                watchingList[i2] = new LiveStreamMessages$WatchingListUserInfo();
                p0.readMessage(watchingList[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             watchingList[i2] = new LiveStreamMessages$WatchingListUserInfo();
             p0.readMessage(watchingList[i2]);
             this.watchingUser = watchingList;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveWatchingList twatchingUse = this.watchingUser;
       if (twatchingUse != null && twatchingUse.length > 0) {
          int i = 0;
          LiveStreamMessages$SCLiveWatchingList twatchingUse1 = this.watchingUser;
          while (i < twatchingUse1.length) {
             object oobject = twatchingUse1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       twatchingUse = this.watchingCount;
       if (twatchingUse - null) {
          p0.writeUInt64(2, twatchingUse);
       }
       String str = "";
       if (!(this.displayWatchingCount).equals(str)) {
          p0.writeString(3, this.displayWatchingCount);
       }
       if (!(this.liteDisplayWatchingCount).equals(str)) {
          p0.writeString(4, this.liteDisplayWatchingCount);
       }
       super.writeTo(p0);
       return;
    }
}
