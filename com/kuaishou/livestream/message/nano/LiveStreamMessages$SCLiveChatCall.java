package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatCall;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveChatCall extends MessageNano	// class@00133b
{
    public boolean allowVideoChat;
    public long guestAcceptDeadline;
    public int mediaType;
    public int sourceType;
    public long time;
    public boolean useAryaSdk;
    public static LiveStreamMessages$SCLiveChatCall[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatCall(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatCall[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatCall._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatCall._emptyArray == null) {
             LiveStreamMessages$SCLiveChatCall[] sCLiveChatCa = new LiveStreamMessages$SCLiveChatCall[0];
             LiveStreamMessages$SCLiveChatCall._emptyArray = sCLiveChatCa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatCall._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatCall parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatCall().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatCall parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatCall(), p0);
    }
    public LiveStreamMessages$SCLiveChatCall clear(){
       this.allowVideoChat = false;
       this.useAryaSdk = false;
       this.guestAcceptDeadline = 0;
       this.time = 0;
       this.sourceType = 0;
       this.mediaType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveChatCall tallowVideoC = this.allowVideoChat;
       if (tallowVideoC != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tallowVideoC);
       }
       tallowVideoC = this.useAryaSdk;
       if (tallowVideoC != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tallowVideoC);
       }
       tallowVideoC = this.guestAcceptDeadline;
       int i1 = 0;
       if (tallowVideoC - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tallowVideoC);
       }
       tallowVideoC = this.time;
       if (tallowVideoC - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tallowVideoC);
       }
       tallowVideoC = this.sourceType;
       if (tallowVideoC != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tallowVideoC);
       }
       tallowVideoC = this.mediaType;
       if (tallowVideoC != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tallowVideoC);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatCall mergeFrom(CodedInputByteBufferNano p0){
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
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.mediaType = i;
                            }
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && i != 1) {
                            continue ;
                         }else {
                            this.sourceType = i;
                         }
                      }
                   }else {
                      this.time = p0.readUInt64();
                   }
                }else {
                   this.guestAcceptDeadline = p0.readUInt64();
                }
             }else {
                this.useAryaSdk = p0.readBool();
             }
          }else {
             this.allowVideoChat = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveChatCall tallowVideoC = this.allowVideoChat;
       if (tallowVideoC != null) {
          p0.writeBool(1, tallowVideoC);
       }
       tallowVideoC = this.useAryaSdk;
       if (tallowVideoC != null) {
          p0.writeBool(2, tallowVideoC);
       }
       tallowVideoC = this.guestAcceptDeadline;
       int i = 0;
       if (tallowVideoC - i) {
          p0.writeUInt64(3, tallowVideoC);
       }
       tallowVideoC = this.time;
       if (tallowVideoC - i) {
          p0.writeUInt64(4, tallowVideoC);
       }
       tallowVideoC = this.sourceType;
       if (tallowVideoC != null) {
          p0.writeInt32(5, tallowVideoC);
       }
       tallowVideoC = this.mediaType;
       if (tallowVideoC != null) {
          p0.writeInt32(6, tallowVideoC);
       }
       super.writeTo(p0);
       return;
    }
}
