package com.kuaishou.protobuf.livestream.nano.InteractiveChatSwitchBizExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveChatSwitchBizExtraInfo extends MessageNano	// class@000c1a
{
    public String bizId;
    public int bizType;
    public String extraInfoPb;
    public static InteractiveChatSwitchBizExtraInfo[] _emptyArray;

    public void InteractiveChatSwitchBizExtraInfo(){
       super();
       this.clear();
    }
    public static InteractiveChatSwitchBizExtraInfo[] emptyArray(){
       if (InteractiveChatSwitchBizExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatSwitchBizExtraInfo._emptyArray == null) {
             InteractiveChatSwitchBizExtraInfo[] interactiveC = new InteractiveChatSwitchBizExtraInfo[0];
             InteractiveChatSwitchBizExtraInfo._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatSwitchBizExtraInfo._emptyArray;
    }
    public static InteractiveChatSwitchBizExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatSwitchBizExtraInfo().mergeFrom(p0);
    }
    public static InteractiveChatSwitchBizExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatSwitchBizExtraInfo(), p0);
    }
    public InteractiveChatSwitchBizExtraInfo clear(){
       this.bizType = 0;
       this.extraInfoPb = "";
       this.bizId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatSwitchBizExtraInfo tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       String str = "";
       if (!(this.extraInfoPb).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.extraInfoPb);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bizId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatSwitchBizExtraInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.bizId = p0.readString();
                }
             }else {
                this.extraInfoPb = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatSwitchBizExtraInfo tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       String str = "";
       if (!(this.extraInfoPb).equals(str)) {
          p0.writeString(2, this.extraInfoPb);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(3, this.bizId);
       }
       super.writeTo(p0);
       return;
    }
}
