package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$LiveItemVolumeChangeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemInfo;

public final class LiveRoomSignalMessage$LiveItemVolumeChangeSignal extends MessageNano	// class@001c57
{
    public int changeType;
    public int displayIntervalMillis;
    public String itemId;
    public LiveRoomSignalMessage$ItemInfo itemInfo;
    public int lastVolume;
    public int volume;
    public static LiveRoomSignalMessage$LiveItemVolumeChangeSignal[] _emptyArray;

    public void LiveRoomSignalMessage$LiveItemVolumeChangeSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$LiveItemVolumeChangeSignal[] emptyArray(){
       if (LiveRoomSignalMessage$LiveItemVolumeChangeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$LiveItemVolumeChangeSignal._emptyArray == null) {
             LiveRoomSignalMessage$LiveItemVolumeChangeSignal[] liveItemVolu = new LiveRoomSignalMessage$LiveItemVolumeChangeSignal[0];
             LiveRoomSignalMessage$LiveItemVolumeChangeSignal._emptyArray = liveItemVolu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$LiveItemVolumeChangeSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$LiveItemVolumeChangeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$LiveItemVolumeChangeSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$LiveItemVolumeChangeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$LiveItemVolumeChangeSignal(), p0);
    }
    public LiveRoomSignalMessage$LiveItemVolumeChangeSignal clear(){
       this.itemId = "";
       this.volume = 0;
       this.itemInfo = null;
       this.changeType = 0;
       this.lastVolume = 0;
       this.displayIntervalMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.itemId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.itemId);
       }
       LiveRoomSignalMessage$LiveItemVolumeChangeSignal tvolume = this.volume;
       if (tvolume != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tvolume);
       }
       tvolume = this.itemInfo;
       if (tvolume != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tvolume);
       }
       tvolume = this.changeType;
       if (tvolume != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tvolume);
       }
       tvolume = this.lastVolume;
       if (tvolume != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tvolume);
       }
       tvolume = this.displayIntervalMillis;
       if (tvolume != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tvolume);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$LiveItemVolumeChangeSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.displayIntervalMillis = p0.readUInt32();
                         }
                      }else {
                         this.lastVolume = p0.readUInt32();
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && i != 1) {
                         continue ;
                      }else {
                         this.changeType = i;
                      }
                   }
                }else if(this.itemInfo == null){
                   this.itemInfo = new LiveRoomSignalMessage$ItemInfo();
                }
                p0.readMessage(this.itemInfo);
             }else {
                this.volume = p0.readUInt32();
             }
          }else {
             this.itemId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.itemId).equals("")) {
          p0.writeString(1, this.itemId);
       }
       LiveRoomSignalMessage$LiveItemVolumeChangeSignal tvolume = this.volume;
       if (tvolume != null) {
          p0.writeUInt32(2, tvolume);
       }
       tvolume = this.itemInfo;
       if (tvolume != null) {
          p0.writeMessage(3, tvolume);
       }
       tvolume = this.changeType;
       if (tvolume != null) {
          p0.writeInt32(4, tvolume);
       }
       tvolume = this.lastVolume;
       if (tvolume != null) {
          p0.writeUInt32(5, tvolume);
       }
       tvolume = this.displayIntervalMillis;
       if (tvolume != null) {
          p0.writeUInt32(6, tvolume);
       }
       super.writeTo(p0);
       return;
    }
}
