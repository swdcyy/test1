package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveVoicePartyVideoLayoutMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import java.lang.Float;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveFlvStream$LiveVoicePartyVideoLayoutMessage extends MessageNano	// class@000c82
{
    public float dividerInVideoWidthPercent;
    public float guestFrameAspectRatio;
    public float liveVideoAspectRatio;
    public LiveFlvStream$LiveChatViewPostionMessage[] videoViewPosition;
    public static LiveFlvStream$LiveVoicePartyVideoLayoutMessage[] _emptyArray;

    public void LiveFlvStream$LiveVoicePartyVideoLayoutMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveVoicePartyVideoLayoutMessage[] emptyArray(){
       if (LiveFlvStream$LiveVoicePartyVideoLayoutMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveVoicePartyVideoLayoutMessage._emptyArray == null) {
             LiveFlvStream$LiveVoicePartyVideoLayoutMessage[] liveVoicePar = new LiveFlvStream$LiveVoicePartyVideoLayoutMessage[0];
             LiveFlvStream$LiveVoicePartyVideoLayoutMessage._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveVoicePartyVideoLayoutMessage._emptyArray;
    }
    public static LiveFlvStream$LiveVoicePartyVideoLayoutMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveVoicePartyVideoLayoutMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveVoicePartyVideoLayoutMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveVoicePartyVideoLayoutMessage(), p0);
    }
    public LiveFlvStream$LiveVoicePartyVideoLayoutMessage clear(){
       this.liveVideoAspectRatio = 0;
       this.guestFrameAspectRatio = 0;
       this.dividerInVideoWidthPercent = 0;
       this.videoViewPosition = LiveFlvStream$LiveChatViewPostionMessage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       float f = 0;
       if (Float.floatToIntBits(this.liveVideoAspectRatio) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(1, this.liveVideoAspectRatio);
       }
       if (Float.floatToIntBits(this.guestFrameAspectRatio) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(2, this.guestFrameAspectRatio);
       }
       if (Float.floatToIntBits(this.dividerInVideoWidthPercent) != Float.floatToIntBits(f)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(3, this.dividerInVideoWidthPercent);
       }
       LiveFlvStream$LiveVoicePartyVideoLayoutMessage tvideoViewPo = this.videoViewPosition;
       if (tvideoViewPo != null && tvideoViewPo.length > 0) {
          int i1 = 0;
          LiveFlvStream$LiveVoicePartyVideoLayoutMessage tvideoViewPo1 = this.videoViewPosition;
          while (i1 < tvideoViewPo1.length) {
             object oobject = tvideoViewPo1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveVoicePartyVideoLayoutMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 13) {
             if (i != 21) {
                if (i != 29) {
                   int i1 = 34;
                   if (i != i1) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LiveFlvStream$LiveVoicePartyVideoLayoutMessage tvideoViewPo = this.videoViewPosition;
                      int i2 = (tvideoViewPo == null)? 0: tvideoViewPo.length;
                      i = i + i2;
                      LiveFlvStream$LiveChatViewPostionMessage[] liveChatView = new LiveFlvStream$LiveChatViewPostionMessage[i];
                      if (i2) {
                         System.arraycopy(tvideoViewPo, 0, liveChatView, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         liveChatView[i2] = new LiveFlvStream$LiveChatViewPostionMessage();
                         p0.readMessage(liveChatView[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      liveChatView[i2] = new LiveFlvStream$LiveChatViewPostionMessage();
                      p0.readMessage(liveChatView[i2]);
                      this.videoViewPosition = liveChatView;
                   }
                }else {
                   this.dividerInVideoWidthPercent = p0.readFloat();
                }
             }else {
                this.guestFrameAspectRatio = p0.readFloat();
             }
          }else {
             this.liveVideoAspectRatio = p0.readFloat();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       float f = 0;
       if (Float.floatToIntBits(this.liveVideoAspectRatio) != Float.floatToIntBits(f)) {
          p0.writeFloat(1, this.liveVideoAspectRatio);
       }
       if (Float.floatToIntBits(this.guestFrameAspectRatio) != Float.floatToIntBits(f)) {
          p0.writeFloat(2, this.guestFrameAspectRatio);
       }
       if (Float.floatToIntBits(this.dividerInVideoWidthPercent) != Float.floatToIntBits(f)) {
          p0.writeFloat(3, this.dividerInVideoWidthPercent);
       }
       LiveFlvStream$LiveVoicePartyVideoLayoutMessage tvideoViewPo = this.videoViewPosition;
       if (tvideoViewPo != null && tvideoViewPo.length > 0) {
          int i = 0;
          LiveFlvStream$LiveVoicePartyVideoLayoutMessage tvideoViewPo1 = this.videoViewPosition;
          while (i < tvideoViewPo1.length) {
             object oobject = tvideoViewPo1[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
