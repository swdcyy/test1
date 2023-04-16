package com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatWindow extends MessageNano	// class@000c1f
{
    public int cropMode;
    public int height;
    public long userId;
    public int width;
    public int windowId;
    public int x;
    public int y;
    public static InteractiveChatWindow[] _emptyArray;

    public void InteractiveChatWindow(){
       super();
       this.clear();
    }
    public static InteractiveChatWindow[] emptyArray(){
       if (InteractiveChatWindow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatWindow._emptyArray == null) {
             InteractiveChatWindow[] interactiveC = new InteractiveChatWindow[0];
             InteractiveChatWindow._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatWindow._emptyArray;
    }
    public static InteractiveChatWindow parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatWindow().mergeFrom(p0);
    }
    public static InteractiveChatWindow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatWindow(), p0);
    }
    public InteractiveChatWindow clear(){
       this.windowId = 0;
       this.userId = 0;
       this.x = 0;
       this.y = 0;
       this.width = 0;
       this.height = 0;
       this.cropMode = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatWindow twindowId = this.windowId;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twindowId);
       }
       twindowId = this.userId;
       if (twindowId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, twindowId);
       }
       twindowId = this.x;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, twindowId);
       }
       twindowId = this.y;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, twindowId);
       }
       twindowId = this.width;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, twindowId);
       }
       twindowId = this.height;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, twindowId);
       }
       twindowId = this.cropMode;
       if (twindowId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, twindowId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatWindow mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && i != 2)) {
                                  continue ;
                               }else {
                                  this.cropMode = i;
                               }
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
       InteractiveChatWindow twindowId = this.windowId;
       if (twindowId != null) {
          p0.writeUInt32(1, twindowId);
       }
       twindowId = this.userId;
       if (twindowId) {
          p0.writeUInt64(2, twindowId);
       }
       twindowId = this.x;
       if (twindowId != null) {
          p0.writeUInt32(3, twindowId);
       }
       twindowId = this.y;
       if (twindowId != null) {
          p0.writeUInt32(4, twindowId);
       }
       twindowId = this.width;
       if (twindowId != null) {
          p0.writeUInt32(5, twindowId);
       }
       twindowId = this.height;
       if (twindowId != null) {
          p0.writeUInt32(6, twindowId);
       }
       twindowId = this.cropMode;
       if (twindowId != null) {
          p0.writeInt32(7, twindowId);
       }
       super.writeTo(p0);
       return;
    }
}
