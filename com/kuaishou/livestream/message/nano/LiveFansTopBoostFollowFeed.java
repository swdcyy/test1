package com.kuaishou.livestream.message.nano.LiveFansTopBoostFollowFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFansTopBoostFollowFeed extends MessageNano	// class@0011b3
{
    public int giftId;
    public String id;
    public String textContent;
    public static LiveFansTopBoostFollowFeed[] _emptyArray;

    public void LiveFansTopBoostFollowFeed(){
       super();
       this.clear();
    }
    public static LiveFansTopBoostFollowFeed[] emptyArray(){
       if (LiveFansTopBoostFollowFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansTopBoostFollowFeed._emptyArray == null) {
             LiveFansTopBoostFollowFeed[] liveFansTopB = new LiveFansTopBoostFollowFeed[0];
             LiveFansTopBoostFollowFeed._emptyArray = liveFansTopB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansTopBoostFollowFeed._emptyArray;
    }
    public static LiveFansTopBoostFollowFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansTopBoostFollowFeed().mergeFrom(p0);
    }
    public static LiveFansTopBoostFollowFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansTopBoostFollowFeed(), p0);
    }
    public LiveFansTopBoostFollowFeed clear(){
       this.giftId = 0;
       this.textContent = "";
       this.id = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansTopBoostFollowFeed tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       String str = "";
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textContent);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansTopBoostFollowFeed mergeFrom(CodedInputByteBufferNano p0){
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
                   this.id = p0.readString();
                }
             }else {
                this.textContent = p0.readString();
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansTopBoostFollowFeed tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       String str = "";
       if (!(this.textContent).equals(str)) {
          p0.writeString(2, this.textContent);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(3, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
