package com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchTimeline;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$ActivityLaunchTimeline extends MessageNano	// class@0013a2
{
    public long firstTimeViewTreeTraversalBegin;
    public long firstTimeViewTreeTraversalEnd;
    public long launchActivityCallBackBegin;
    public long launchActivityCallBackEnd;
    public long launchActivityCallBackOnCreated;
    public long launchActivityCallBackOnResumed;
    public long launchActivityCallBackOnStarted;
    public long startActivityOutgoingCallBegin;
    public long startActivityOutgoingCallEnd;
    public long userClick;
    public static ClientStat$ActivityLaunchTimeline[] _emptyArray;

    public void ClientStat$ActivityLaunchTimeline(){
       super();
       this.clear();
    }
    public static ClientStat$ActivityLaunchTimeline[] emptyArray(){
       if (ClientStat$ActivityLaunchTimeline._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ActivityLaunchTimeline._emptyArray == null) {
             ClientStat$ActivityLaunchTimeline[] uActivityLau = new ClientStat$ActivityLaunchTimeline[0];
             ClientStat$ActivityLaunchTimeline._emptyArray = uActivityLau;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ActivityLaunchTimeline._emptyArray;
    }
    public static ClientStat$ActivityLaunchTimeline parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ActivityLaunchTimeline().mergeFrom(p0);
    }
    public static ClientStat$ActivityLaunchTimeline parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ActivityLaunchTimeline(), p0);
    }
    public ClientStat$ActivityLaunchTimeline clear(){
       this.userClick = 0;
       this.startActivityOutgoingCallBegin = 0;
       this.startActivityOutgoingCallEnd = 0;
       this.launchActivityCallBackBegin = 0;
       this.launchActivityCallBackOnCreated = 0;
       this.launchActivityCallBackOnStarted = 0;
       this.launchActivityCallBackOnResumed = 0;
       this.launchActivityCallBackEnd = 0;
       this.firstTimeViewTreeTraversalBegin = 0;
       this.firstTimeViewTreeTraversalEnd = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$ActivityLaunchTimeline tuserClick = this.userClick;
       int i1 = 0;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(100, tuserClick);
       }
       tuserClick = this.startActivityOutgoingCallBegin;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(110, tuserClick);
       }
       tuserClick = this.startActivityOutgoingCallEnd;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(120, tuserClick);
       }
       tuserClick = this.launchActivityCallBackBegin;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(130, tuserClick);
       }
       tuserClick = this.launchActivityCallBackOnCreated;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(140, tuserClick);
       }
       tuserClick = this.launchActivityCallBackOnStarted;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(150, tuserClick);
       }
       tuserClick = this.launchActivityCallBackOnResumed;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(160, tuserClick);
       }
       tuserClick = this.launchActivityCallBackEnd;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(170, tuserClick);
       }
       tuserClick = this.firstTimeViewTreeTraversalBegin;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(180, tuserClick);
       }
       tuserClick = this.firstTimeViewTreeTraversalEnd;
       if (tuserClick - i1) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(190, tuserClick);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ActivityLaunchTimeline mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 800:
                this.userClick = p0.readInt64();
                break;
              case 880:
                this.startActivityOutgoingCallBegin = p0.readInt64();
                break;
              case 960:
                this.startActivityOutgoingCallEnd = p0.readInt64();
                break;
              case 1040:
                this.launchActivityCallBackBegin = p0.readInt64();
                break;
              case 1120:
                this.launchActivityCallBackOnCreated = p0.readInt64();
                break;
              case 1200:
                this.launchActivityCallBackOnStarted = p0.readInt64();
                break;
              case 1280:
                this.launchActivityCallBackOnResumed = p0.readInt64();
                break;
              case 1360:
                this.launchActivityCallBackEnd = p0.readInt64();
                break;
              case 1440:
                this.firstTimeViewTreeTraversalBegin = p0.readInt64();
                break;
              case 1520:
                this.firstTimeViewTreeTraversalEnd = p0.readInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$ActivityLaunchTimeline tuserClick = this.userClick;
       int i = 0;
       if (tuserClick - i) {
          p0.writeInt64(100, tuserClick);
       }
       tuserClick = this.startActivityOutgoingCallBegin;
       if (tuserClick - i) {
          p0.writeInt64(110, tuserClick);
       }
       tuserClick = this.startActivityOutgoingCallEnd;
       if (tuserClick - i) {
          p0.writeInt64(120, tuserClick);
       }
       tuserClick = this.launchActivityCallBackBegin;
       if (tuserClick - i) {
          p0.writeInt64(130, tuserClick);
       }
       tuserClick = this.launchActivityCallBackOnCreated;
       if (tuserClick - i) {
          p0.writeInt64(140, tuserClick);
       }
       tuserClick = this.launchActivityCallBackOnStarted;
       if (tuserClick - i) {
          p0.writeInt64(150, tuserClick);
       }
       tuserClick = this.launchActivityCallBackOnResumed;
       if (tuserClick - i) {
          p0.writeInt64(160, tuserClick);
       }
       tuserClick = this.launchActivityCallBackEnd;
       if (tuserClick - i) {
          p0.writeInt64(170, tuserClick);
       }
       tuserClick = this.firstTimeViewTreeTraversalBegin;
       if (tuserClick - i) {
          p0.writeInt64(180, tuserClick);
       }
       tuserClick = this.firstTimeViewTreeTraversalEnd;
       if (tuserClick - i) {
          p0.writeInt64(190, tuserClick);
       }
       super.writeTo(p0);
       return;
    }
}
