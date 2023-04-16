package com.kuaishou.protobuf.livestage.nano.LiveStageProto$Window;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$StreamId;

public final class LiveStageProto$Window extends MessageNano	// class@000c01
{
    public int height;
    public long userId;
    public LiveStageProto$StreamId videoStreamId;
    public int width;
    public int windowId;
    public int x;
    public int y;
    public static LiveStageProto$Window[] _emptyArray;

    public void LiveStageProto$Window(){
       super();
       this.clear();
    }
    public static LiveStageProto$Window[] emptyArray(){
       if (LiveStageProto$Window._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStageProto$Window._emptyArray == null) {
             LiveStageProto$Window[] windowArray = new LiveStageProto$Window[0];
             LiveStageProto$Window._emptyArray = windowArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStageProto$Window._emptyArray;
    }
    public static LiveStageProto$Window parseFrom(CodedInputByteBufferNano p0){
       return new LiveStageProto$Window().mergeFrom(p0);
    }
    public static LiveStageProto$Window parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStageProto$Window(), p0);
    }
    public LiveStageProto$Window clear(){
       this.windowId = 0;
       this.userId = 0;
       this.videoStreamId = null;
       this.x = 0;
       this.y = 0;
       this.width = 0;
       this.height = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStageProto$Window twindowId = this.windowId;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twindowId);
       }
       twindowId = this.userId;
       if (twindowId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, twindowId);
       }
       twindowId = this.videoStreamId;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, twindowId);
       }
       twindowId = this.x;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, twindowId);
       }
       twindowId = this.y;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, twindowId);
       }
       twindowId = this.width;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, twindowId);
       }
       twindowId = this.height;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, twindowId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStageProto$Window mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.height = p0.readUInt32();
                            }
                         }else {
                            this.width = p0.readUInt32();
                         }
                      }else {
                         this.y = p0.readUInt32();
                      }
                   }else {
                      this.x = p0.readUInt32();
                   }
                }else if(this.videoStreamId == null){
                   this.videoStreamId = new LiveStageProto$StreamId();
                }
                p0.readMessage(this.videoStreamId);
             }else {
                this.userId = p0.readUInt64();
             }
          }else {
             this.windowId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStageProto$Window twindowId = this.windowId;
       if (twindowId != null) {
          p0.writeUInt32(1, twindowId);
       }
       twindowId = this.userId;
       if (twindowId) {
          p0.writeUInt64(2, twindowId);
       }
       twindowId = this.videoStreamId;
       if (twindowId != null) {
          p0.writeMessage(3, twindowId);
       }
       twindowId = this.x;
       if (twindowId != null) {
          p0.writeUInt32(4, twindowId);
       }
       twindowId = this.y;
       if (twindowId != null) {
          p0.writeUInt32(5, twindowId);
       }
       twindowId = this.width;
       if (twindowId != null) {
          p0.writeUInt32(6, twindowId);
       }
       twindowId = this.height;
       if (twindowId != null) {
          p0.writeUInt32(7, twindowId);
       }
       super.writeTo(p0);
       return;
    }
}
