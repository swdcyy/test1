package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal extends MessageNano	// class@001c51
{
    public String askContent;
    public long askedCount;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public long latestAskedCount;
    public static LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[] _emptyArray;

    public void LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[] emptyArray(){
       if (LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal._emptyArray == null) {
             LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[] kwaishopLive = new LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal[0];
             LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal._emptyArray = kwaishopLive;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal(), p0);
    }
    public LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal clear(){
       this.itemInfo = null;
       this.askContent = "";
       this.askedCount = 0;
       this.latestAskedCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, titemInfo);
       }
       if (!(this.askContent).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.askContent);
       }
       titemInfo = this.askedCount;
       int i1 = 0;
       if (titemInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, titemInfo);
       }
       titemInfo = this.latestAskedCount;
       if (titemInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, titemInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.latestAskedCount = p0.readUInt64();
                   }
                }else {
                   this.askedCount = p0.readUInt64();
                }
             }else {
                this.askContent = p0.readString();
             }
          }else if(this.itemInfo == null){
             this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
          }
          p0.readMessage(this.itemInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRoomSignalMessage$KwaishopLiveAskOnItemSignal titemInfo = this.itemInfo;
       if (titemInfo != null) {
          p0.writeMessage(1, titemInfo);
       }
       if (!(this.askContent).equals("")) {
          p0.writeString(2, this.askContent);
       }
       titemInfo = this.askedCount;
       int i = 0;
       if (titemInfo - i) {
          p0.writeUInt64(3, titemInfo);
       }
       titemInfo = this.latestAskedCount;
       if (titemInfo - i) {
          p0.writeUInt64(4, titemInfo);
       }
       super.writeTo(p0);
       return;
    }
}
