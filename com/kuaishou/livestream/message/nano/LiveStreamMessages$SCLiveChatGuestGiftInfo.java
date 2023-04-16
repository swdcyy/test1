package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveChatGuestGiftInfo extends MessageNano	// class@00133f
{
    public String displayKsCoin;
    public String liveStreamId;
    public long userId;
    public Map userId2ReceiveGift;
    public static LiveStreamMessages$SCLiveChatGuestGiftInfo[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatGuestGiftInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatGuestGiftInfo[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatGuestGiftInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatGuestGiftInfo._emptyArray == null) {
             LiveStreamMessages$SCLiveChatGuestGiftInfo[] sCLiveChatGu = new LiveStreamMessages$SCLiveChatGuestGiftInfo[0];
             LiveStreamMessages$SCLiveChatGuestGiftInfo._emptyArray = sCLiveChatGu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatGuestGiftInfo._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatGuestGiftInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatGuestGiftInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatGuestGiftInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatGuestGiftInfo(), p0);
    }
    public LiveStreamMessages$SCLiveChatGuestGiftInfo clear(){
       this.liveStreamId = "";
       this.userId = 0;
       this.displayKsCoin = "";
       this.userId2ReceiveGift = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveStreamMessages$SCLiveChatGuestGiftInfo tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tuserId);
       }
       if (!(this.displayKsCoin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.displayKsCoin);
       }
       LiveStreamMessages$SCLiveChatGuestGiftInfo tuserId2Rece = this.userId2ReceiveGift;
       if (tuserId2Rece != null) {
          i = i + InternalNano.computeMapFieldSize(tuserId2Rece, 4, 4, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatGuestGiftInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.userId2ReceiveGift = InternalNano.mergeMapEntry(p0, this.userId2ReceiveGift, mapFactory, 4, 9, null, 8, 18);
                   }
                }else {
                   this.displayKsCoin = p0.readString();
                }
             }else {
                this.userId = p0.readUInt64();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveStreamMessages$SCLiveChatGuestGiftInfo tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(2, tuserId);
       }
       if (!(this.displayKsCoin).equals(str)) {
          p0.writeString(3, this.displayKsCoin);
       }
       LiveStreamMessages$SCLiveChatGuestGiftInfo tuserId2Rece = this.userId2ReceiveGift;
       if (tuserId2Rece != null) {
          InternalNano.serializeMapField(p0, tuserId2Rece, 4, 4, 9);
       }
       super.writeTo(p0);
       return;
    }
}
