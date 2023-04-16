package com.kuaishou.livestream.message.nano.LiveStreamMessages$RedPackRainGroupInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$RedPackRainGroupInfo extends MessageNano	// class@001320
{
    public long groupEndTime;
    public String groupId;
    public long groupStartTime;
    public String ruleJumpLink;
    public long version;
    public static LiveStreamMessages$RedPackRainGroupInfo[] _emptyArray;

    public void LiveStreamMessages$RedPackRainGroupInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$RedPackRainGroupInfo[] emptyArray(){
       if (LiveStreamMessages$RedPackRainGroupInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$RedPackRainGroupInfo._emptyArray == null) {
             LiveStreamMessages$RedPackRainGroupInfo[] redPackRainG = new LiveStreamMessages$RedPackRainGroupInfo[0];
             LiveStreamMessages$RedPackRainGroupInfo._emptyArray = redPackRainG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$RedPackRainGroupInfo._emptyArray;
    }
    public static LiveStreamMessages$RedPackRainGroupInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$RedPackRainGroupInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$RedPackRainGroupInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$RedPackRainGroupInfo(), p0);
    }
    public LiveStreamMessages$RedPackRainGroupInfo clear(){
       this.groupId = "";
       this.groupStartTime = 0;
       this.groupEndTime = 0;
       this.ruleJumpLink = "";
       this.version = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.groupId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.groupId);
       }
       LiveStreamMessages$RedPackRainGroupInfo tgroupStartT = this.groupStartTime;
       if (tgroupStartT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tgroupStartT);
       }
       tgroupStartT = this.groupEndTime;
       if (tgroupStartT) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tgroupStartT);
       }
       if (!(this.ruleJumpLink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ruleJumpLink);
       }
       LiveStreamMessages$RedPackRainGroupInfo tversion = this.version;
       if (tversion) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tversion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$RedPackRainGroupInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.version = p0.readUInt64();
                      }
                   }else {
                      this.ruleJumpLink = p0.readString();
                   }
                }else {
                   this.groupEndTime = p0.readUInt64();
                }
             }else {
                this.groupStartTime = p0.readUInt64();
             }
          }else {
             this.groupId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.groupId).equals(str)) {
          p0.writeString(1, this.groupId);
       }
       LiveStreamMessages$RedPackRainGroupInfo tgroupStartT = this.groupStartTime;
       if (tgroupStartT) {
          p0.writeUInt64(2, tgroupStartT);
       }
       tgroupStartT = this.groupEndTime;
       if (tgroupStartT) {
          p0.writeUInt64(3, tgroupStartT);
       }
       if (!(this.ruleJumpLink).equals(str)) {
          p0.writeString(4, this.ruleJumpLink);
       }
       LiveStreamMessages$RedPackRainGroupInfo tversion = this.version;
       if (tversion) {
          p0.writeUInt64(5, tversion);
       }
       super.writeTo(p0);
       return;
    }
}
