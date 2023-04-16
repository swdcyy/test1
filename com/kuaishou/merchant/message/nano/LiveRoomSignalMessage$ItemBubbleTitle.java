package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$ItemBubbleTitle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$ItemBubbleTitle extends MessageNano	// class@001c4c
{
    public String desc;
    public String iconUrl;
    public static LiveRoomSignalMessage$ItemBubbleTitle[] _emptyArray;

    public void LiveRoomSignalMessage$ItemBubbleTitle(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$ItemBubbleTitle[] emptyArray(){
       if (LiveRoomSignalMessage$ItemBubbleTitle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$ItemBubbleTitle._emptyArray == null) {
             LiveRoomSignalMessage$ItemBubbleTitle[] itemBubbleTi = new LiveRoomSignalMessage$ItemBubbleTitle[0];
             LiveRoomSignalMessage$ItemBubbleTitle._emptyArray = itemBubbleTi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$ItemBubbleTitle._emptyArray;
    }
    public static LiveRoomSignalMessage$ItemBubbleTitle parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$ItemBubbleTitle().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$ItemBubbleTitle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$ItemBubbleTitle(), p0);
    }
    public LiveRoomSignalMessage$ItemBubbleTitle clear(){
       this.iconUrl = "";
       this.desc = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.iconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.iconUrl);
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.desc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$ItemBubbleTitle mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.desc = p0.readString();
             }
          }else {
             this.iconUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.iconUrl).equals(str)) {
          p0.writeString(1, this.iconUrl);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(2, this.desc);
       }
       super.writeTo(p0);
       return;
    }
}
