package com.kuaishou.protobuf.livestream.nano.LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo extends MessageNano	// class@000c9a
{
    public String bizId;
    public int bizType;
    public long randomDelayMillis;
    public int source;
    public String toFollowUserId;
    public static LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[] _emptyArray;

    public void LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo(){
       super();
       this.clear();
    }
    public static LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[] emptyArray(){
       if (LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo._emptyArray == null) {
             LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[] sCLiveGuideF = new LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo[0];
             LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo._emptyArray = sCLiveGuideF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo._emptyArray;
    }
    public static LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo().mergeFrom(p0);
    }
    public static LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo(), p0);
    }
    public LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo clear(){
       this.toFollowUserId = "";
       this.source = 0;
       this.randomDelayMillis = 0;
       this.bizType = 0;
       this.bizId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.toFollowUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.toFollowUserId);
       }
       LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo tsource = this.source;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tsource);
       }
       LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo trandomDelay = this.randomDelayMillis;
       if (trandomDelay) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, trandomDelay);
       }
       tsource = this.bizType;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tsource);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.bizId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.bizId = p0.readString();
                      }
                   }else {
                      this.bizType = p0.readUInt32();
                   }
                }else {
                   this.randomDelayMillis = p0.readUInt64();
                }
             }else {
                this.source = p0.readUInt32();
             }
          }else {
             this.toFollowUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.toFollowUserId).equals(str)) {
          p0.writeString(1, this.toFollowUserId);
       }
       LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo tsource = this.source;
       if (tsource != null) {
          p0.writeUInt32(2, tsource);
       }
       LiveGuideFollowAuthorCardInfo$SCLiveGuideFollowAuthorCardInfo trandomDelay = this.randomDelayMillis;
       if (trandomDelay) {
          p0.writeUInt64(3, trandomDelay);
       }
       tsource = this.bizType;
       if (tsource != null) {
          p0.writeUInt32(4, tsource);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(5, this.bizId);
       }
       super.writeTo(p0);
       return;
    }
}
