package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ProfileActionDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$ProfileActionDetailPackage extends MessageNano	// class@00146c
{
    public int clickPlayCount;
    public int commentCount;
    public long enterTime;
    public int expandCommentPopupWindowCount;
    public int followCount;
    public boolean followedWhenEnter;
    public boolean followedWhenLeave;
    public int forwardCount;
    public int leaveAction;
    public long leaveTime;
    public int likeCount;
    public int negativeCount;
    public int reportCount;
    public int slideDownPlayCount;
    public int slideUpPlayCount;
    public long stayDuration;
    public static ClientTaskDetail$ProfileActionDetailPackage[] _emptyArray;

    public void ClientTaskDetail$ProfileActionDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$ProfileActionDetailPackage[] emptyArray(){
       if (ClientTaskDetail$ProfileActionDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$ProfileActionDetailPackage._emptyArray == null) {
             ClientTaskDetail$ProfileActionDetailPackage[] profileActio = new ClientTaskDetail$ProfileActionDetailPackage[0];
             ClientTaskDetail$ProfileActionDetailPackage._emptyArray = profileActio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$ProfileActionDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$ProfileActionDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$ProfileActionDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$ProfileActionDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$ProfileActionDetailPackage(), p0);
    }
    public ClientTaskDetail$ProfileActionDetailPackage clear(){
       this.enterTime = 0;
       this.leaveTime = 0;
       this.stayDuration = 0;
       this.followedWhenEnter = false;
       this.followedWhenLeave = false;
       this.leaveAction = 0;
       this.slideUpPlayCount = 0;
       this.slideDownPlayCount = 0;
       this.clickPlayCount = 0;
       this.likeCount = 0;
       this.followCount = 0;
       this.forwardCount = 0;
       this.expandCommentPopupWindowCount = 0;
       this.commentCount = 0;
       this.negativeCount = 0;
       this.reportCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$ProfileActionDetailPackage tenterTime = this.enterTime;
       int i1 = 0;
       if (tenterTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tenterTime);
       }
       tenterTime = this.leaveTime;
       if (tenterTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tenterTime);
       }
       tenterTime = this.stayDuration;
       if (tenterTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tenterTime);
       }
       tenterTime = this.followedWhenEnter;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tenterTime);
       }
       tenterTime = this.followedWhenLeave;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tenterTime);
       }
       tenterTime = this.leaveAction;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tenterTime);
       }
       tenterTime = this.slideUpPlayCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tenterTime);
       }
       tenterTime = this.slideDownPlayCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tenterTime);
       }
       tenterTime = this.clickPlayCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tenterTime);
       }
       tenterTime = this.likeCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tenterTime);
       }
       tenterTime = this.followCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tenterTime);
       }
       tenterTime = this.forwardCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tenterTime);
       }
       tenterTime = this.expandCommentPopupWindowCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tenterTime);
       }
       tenterTime = this.commentCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tenterTime);
       }
       tenterTime = this.negativeCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(15, tenterTime);
       }
       tenterTime = this.reportCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tenterTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$ProfileActionDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.enterTime = p0.readUInt64();
                break;
              case 16:
                this.leaveTime = p0.readUInt64();
                break;
              case 24:
                this.stayDuration = p0.readUInt64();
                break;
              case 32:
                this.followedWhenEnter = p0.readBool();
                break;
              case '(':
                this.followedWhenLeave = p0.readBool();
                break;
              case '0':
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 1:
                      break;
                    default:
                }
                this.leaveAction = i;
                break;
              case '8':
                this.slideUpPlayCount = p0.readUInt32();
                break;
              case '@':
                this.slideDownPlayCount = p0.readUInt32();
                break;
              case 'H':
                this.clickPlayCount = p0.readUInt32();
                break;
              case 'P':
                this.likeCount = p0.readUInt32();
                break;
              case 'X':
                this.followCount = p0.readUInt32();
                break;
              case '`':
                this.forwardCount = p0.readUInt32();
                break;
              case 'h':
                this.expandCommentPopupWindowCount = p0.readUInt32();
                break;
              case 'p':
                this.commentCount = p0.readUInt32();
                break;
              case 'x':
                this.negativeCount = p0.readUInt32();
                break;
              case 128:
                this.reportCount = p0.readUInt32();
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
       ClientTaskDetail$ProfileActionDetailPackage tenterTime = this.enterTime;
       int i = 0;
       if (tenterTime - i) {
          p0.writeUInt64(1, tenterTime);
       }
       tenterTime = this.leaveTime;
       if (tenterTime - i) {
          p0.writeUInt64(2, tenterTime);
       }
       tenterTime = this.stayDuration;
       if (tenterTime - i) {
          p0.writeUInt64(3, tenterTime);
       }
       tenterTime = this.followedWhenEnter;
       if (tenterTime != null) {
          p0.writeBool(4, tenterTime);
       }
       tenterTime = this.followedWhenLeave;
       if (tenterTime != null) {
          p0.writeBool(5, tenterTime);
       }
       tenterTime = this.leaveAction;
       if (tenterTime != null) {
          p0.writeInt32(6, tenterTime);
       }
       tenterTime = this.slideUpPlayCount;
       if (tenterTime != null) {
          p0.writeUInt32(7, tenterTime);
       }
       tenterTime = this.slideDownPlayCount;
       if (tenterTime != null) {
          p0.writeUInt32(8, tenterTime);
       }
       tenterTime = this.clickPlayCount;
       if (tenterTime != null) {
          p0.writeUInt32(9, tenterTime);
       }
       tenterTime = this.likeCount;
       if (tenterTime != null) {
          p0.writeUInt32(10, tenterTime);
       }
       tenterTime = this.followCount;
       if (tenterTime != null) {
          p0.writeUInt32(11, tenterTime);
       }
       tenterTime = this.forwardCount;
       if (tenterTime != null) {
          p0.writeUInt32(12, tenterTime);
       }
       tenterTime = this.expandCommentPopupWindowCount;
       if (tenterTime != null) {
          p0.writeUInt32(13, tenterTime);
       }
       tenterTime = this.commentCount;
       if (tenterTime != null) {
          p0.writeUInt32(14, tenterTime);
       }
       tenterTime = this.negativeCount;
       if (tenterTime != null) {
          p0.writeUInt32(15, tenterTime);
       }
       tenterTime = this.reportCount;
       if (tenterTime != null) {
          p0.writeUInt32(16, tenterTime);
       }
       super.writeTo(p0);
       return;
    }
}
