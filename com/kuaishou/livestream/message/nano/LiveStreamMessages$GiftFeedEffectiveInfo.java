package com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeedEffectiveInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$GiftFeedEffectiveInfo extends MessageNano	// class@0012da
{
    public String interactiveTip;
    public boolean needAvatar;
    public boolean needInteractive;
    public int needParamType;
    public boolean showNickname;
    public static LiveStreamMessages$GiftFeedEffectiveInfo[] _emptyArray;

    public void LiveStreamMessages$GiftFeedEffectiveInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$GiftFeedEffectiveInfo[] emptyArray(){
       if (LiveStreamMessages$GiftFeedEffectiveInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$GiftFeedEffectiveInfo._emptyArray == null) {
             LiveStreamMessages$GiftFeedEffectiveInfo[] giftFeedEffe = new LiveStreamMessages$GiftFeedEffectiveInfo[0];
             LiveStreamMessages$GiftFeedEffectiveInfo._emptyArray = giftFeedEffe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$GiftFeedEffectiveInfo._emptyArray;
    }
    public static LiveStreamMessages$GiftFeedEffectiveInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$GiftFeedEffectiveInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$GiftFeedEffectiveInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$GiftFeedEffectiveInfo(), p0);
    }
    public LiveStreamMessages$GiftFeedEffectiveInfo clear(){
       this.needAvatar = false;
       this.showNickname = false;
       this.needInteractive = false;
       this.interactiveTip = "";
       this.needParamType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$GiftFeedEffectiveInfo tneedAvatar = this.needAvatar;
       if (tneedAvatar != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tneedAvatar);
       }
       tneedAvatar = this.showNickname;
       if (tneedAvatar != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tneedAvatar);
       }
       tneedAvatar = this.needInteractive;
       if (tneedAvatar != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tneedAvatar);
       }
       if (!(this.interactiveTip).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.interactiveTip);
       }
       tneedAvatar = this.needParamType;
       if (tneedAvatar != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tneedAvatar);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$GiftFeedEffectiveInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.needParamType = i;
                         }
                      }
                   }else {
                      this.interactiveTip = p0.readString();
                   }
                }else {
                   this.needInteractive = p0.readBool();
                }
             }else {
                this.showNickname = p0.readBool();
             }
          }else {
             this.needAvatar = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$GiftFeedEffectiveInfo tneedAvatar = this.needAvatar;
       if (tneedAvatar != null) {
          p0.writeBool(1, tneedAvatar);
       }
       tneedAvatar = this.showNickname;
       if (tneedAvatar != null) {
          p0.writeBool(2, tneedAvatar);
       }
       tneedAvatar = this.needInteractive;
       if (tneedAvatar != null) {
          p0.writeBool(3, tneedAvatar);
       }
       if (!(this.interactiveTip).equals("")) {
          p0.writeString(4, this.interactiveTip);
       }
       tneedAvatar = this.needParamType;
       if (tneedAvatar != null) {
          p0.writeInt32(5, tneedAvatar);
       }
       super.writeTo(p0);
       return;
    }
}
