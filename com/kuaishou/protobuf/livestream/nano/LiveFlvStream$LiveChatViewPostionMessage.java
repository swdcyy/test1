package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFlvStream$LiveChatViewPostionMessage extends MessageNano	// class@000c68
{
    public String chatGuestId;
    public float chatViewPositionHeight;
    public float chatViewPositionLeft;
    public float chatViewPositionTop;
    public float chatViewPositionWidth;
    public static LiveFlvStream$LiveChatViewPostionMessage[] _emptyArray;

    public void LiveFlvStream$LiveChatViewPostionMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveChatViewPostionMessage[] emptyArray(){
       if (LiveFlvStream$LiveChatViewPostionMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveChatViewPostionMessage._emptyArray == null) {
             LiveFlvStream$LiveChatViewPostionMessage[] liveChatView = new LiveFlvStream$LiveChatViewPostionMessage[0];
             LiveFlvStream$LiveChatViewPostionMessage._emptyArray = liveChatView;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveChatViewPostionMessage._emptyArray;
    }
    public static LiveFlvStream$LiveChatViewPostionMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveChatViewPostionMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveChatViewPostionMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveChatViewPostionMessage(), p0);
    }
    public LiveFlvStream$LiveChatViewPostionMessage clear(){
       this.chatViewPositionTop = 0;
       this.chatViewPositionLeft = 0;
       this.chatViewPositionWidth = 0;
       this.chatViewPositionHeight = 0;
       this.chatGuestId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       float f = 0;
       if (Float.floatToIntBits(this.chatViewPositionTop) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(1, this.chatViewPositionTop);
       }
       if (Float.floatToIntBits(this.chatViewPositionLeft) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.chatViewPositionLeft);
       }
       if (Float.floatToIntBits(this.chatViewPositionWidth) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.chatViewPositionWidth);
       }
       if (Float.floatToIntBits(this.chatViewPositionHeight) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(4, this.chatViewPositionHeight);
       }
       if (!(this.chatGuestId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.chatGuestId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveChatViewPostionMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 13) {
             if (i != 21) {
                if (i != 29) {
                   if (i != 37) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.chatGuestId = p0.readString();
                      }
                   }else {
                      this.chatViewPositionHeight = p0.readFloat();
                   }
                }else {
                   this.chatViewPositionWidth = p0.readFloat();
                }
             }else {
                this.chatViewPositionLeft = p0.readFloat();
             }
          }else {
             this.chatViewPositionTop = p0.readFloat();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       float f = 0;
       if (Float.floatToIntBits(this.chatViewPositionTop) != Float.floatToIntBits(f)) {
          p0.writeFloat(1, this.chatViewPositionTop);
       }
       if (Float.floatToIntBits(this.chatViewPositionLeft) != Float.floatToIntBits(f)) {
          p0.writeFloat(2, this.chatViewPositionLeft);
       }
       if (Float.floatToIntBits(this.chatViewPositionWidth) != Float.floatToIntBits(f)) {
          p0.writeFloat(3, this.chatViewPositionWidth);
       }
       if (Float.floatToIntBits(this.chatViewPositionHeight) != Float.floatToIntBits(f)) {
          p0.writeFloat(4, this.chatViewPositionHeight);
       }
       if (!(this.chatGuestId).equals("")) {
          p0.writeString(5, this.chatGuestId);
       }
       super.writeTo(p0);
       return;
    }
}
