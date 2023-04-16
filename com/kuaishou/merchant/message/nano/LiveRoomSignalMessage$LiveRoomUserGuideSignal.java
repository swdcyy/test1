package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveRoomUserGuideSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$LiveRoomUserGuideSignal extends MessageNano	// class@001c5b
{
    public int durationMills;
    public String liveStreamId;
    public String title;
    public int type;
    public static LiveRoomSignalMessage$LiveRoomUserGuideSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveRoomUserGuideSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveRoomUserGuideSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveRoomUserGuideSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveRoomUserGuideSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveRoomUserGuideSignal[] liveRoomUser = new LiveRoomSignalMessage$LiveRoomUserGuideSignal[0];
             LiveRoomSignalMessage$LiveRoomUserGuideSignal._emptyArray = liveRoomUser;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveRoomUserGuideSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveRoomUserGuideSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveRoomUserGuideSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveRoomUserGuideSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveRoomUserGuideSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveRoomUserGuideSignal clear(){
       this.title = "";
       this.durationMills = 0;
       this.type = 0;
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       LiveRoomSignalMessage$LiveRoomUserGuideSignal tdurationMil = this.durationMills;
       if (tdurationMil != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tdurationMil);
       }
       tdurationMil = this.type;
       if (tdurationMil != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tdurationMil);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveRoomUserGuideSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.type = p0.readUInt32();
                }
             }else {
                this.durationMills = p0.readUInt32();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       LiveRoomSignalMessage$LiveRoomUserGuideSignal tdurationMil = this.durationMills;
       if (tdurationMil != null) {
          p0.writeUInt32(2, tdurationMil);
       }
       tdurationMil = this.type;
       if (tdurationMil != null) {
          p0.writeUInt32(3, tdurationMil);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
