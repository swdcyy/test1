package com.kuaishou.livestream.message.nano.LivePullRequestProto$SCLivePullRequest;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePullRequestProto$SCLivePullRequest extends MessageNano	// class@001250
{
    public String bizInfo;
    public long requestLatestTimestamp;
    public static LivePullRequestProto$SCLivePullRequest[] _emptyArray;

    public void LivePullRequestProto$SCLivePullRequest(){
       super();
       this.clear();
    }
    public static LivePullRequestProto$SCLivePullRequest[] emptyArray(){
       if (LivePullRequestProto$SCLivePullRequest._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePullRequestProto$SCLivePullRequest._emptyArray == null) {
             LivePullRequestProto$SCLivePullRequest[] sCLivePullRe = new LivePullRequestProto$SCLivePullRequest[0];
             LivePullRequestProto$SCLivePullRequest._emptyArray = sCLivePullRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePullRequestProto$SCLivePullRequest._emptyArray;
    }
    public static LivePullRequestProto$SCLivePullRequest parseFrom(CodedInputByteBufferNano p0){
       return new LivePullRequestProto$SCLivePullRequest().mergeFrom(p0);
    }
    public static LivePullRequestProto$SCLivePullRequest parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePullRequestProto$SCLivePullRequest(), p0);
    }
    public LivePullRequestProto$SCLivePullRequest clear(){
       this.requestLatestTimestamp = 0;
       this.bizInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePullRequestProto$SCLivePullRequest trequestLate = this.requestLatestTimestamp;
       if (trequestLate) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trequestLate);
       }
       if (!(this.bizInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePullRequestProto$SCLivePullRequest mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.bizInfo = p0.readString();
             }
          }else {
             this.requestLatestTimestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePullRequestProto$SCLivePullRequest trequestLate = this.requestLatestTimestamp;
       if (trequestLate) {
          p0.writeUInt64(1, trequestLate);
       }
       if (!(this.bizInfo).equals("")) {
          p0.writeString(2, this.bizInfo);
       }
       super.writeTo(p0);
       return;
    }
}
