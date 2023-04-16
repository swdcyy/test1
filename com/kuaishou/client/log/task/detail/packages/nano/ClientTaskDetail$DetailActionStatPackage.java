package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$DetailActionStatPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$DetailActionStatPackage extends MessageNano	// class@001452
{
    public int commentCount;
    public long enterTime;
    public int expandCommentPopupWindowCount;
    public int followCount;
    public int forwardCount;
    public int leaveAction;
    public long leaveTime;
    public int likeCount;
    public int negativeCount;
    public int reportCount;
    public int slideDownPlayCount;
    public int slideUpPlayCount;
    public long stayDuration;
    public static ClientTaskDetail$DetailActionStatPackage[] _emptyArray;

    public void ClientTaskDetail$DetailActionStatPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$DetailActionStatPackage[] emptyArray(){
       if (ClientTaskDetail$DetailActionStatPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$DetailActionStatPackage._emptyArray == null) {
             ClientTaskDetail$DetailActionStatPackage[] uDetailActio = new ClientTaskDetail$DetailActionStatPackage[0];
             ClientTaskDetail$DetailActionStatPackage._emptyArray = uDetailActio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$DetailActionStatPackage._emptyArray;
    }
    public static ClientTaskDetail$DetailActionStatPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$DetailActionStatPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$DetailActionStatPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$DetailActionStatPackage(), p0);
    }
    public ClientTaskDetail$DetailActionStatPackage clear(){
       this.enterTime = 0;
       this.leaveTime = 0;
       this.stayDuration = 0;
       this.slideUpPlayCount = 0;
       this.slideDownPlayCount = 0;
       this.likeCount = 0;
       this.followCount = 0;
       this.forwardCount = 0;
       this.expandCommentPopupWindowCount = 0;
       this.commentCount = 0;
       this.negativeCount = 0;
       this.reportCount = 0;
       this.leaveAction = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$DetailActionStatPackage tenterTime = this.enterTime;
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
       tenterTime = this.slideUpPlayCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tenterTime);
       }
       tenterTime = this.slideDownPlayCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tenterTime);
       }
       tenterTime = this.likeCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tenterTime);
       }
       tenterTime = this.followCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tenterTime);
       }
       tenterTime = this.forwardCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tenterTime);
       }
       tenterTime = this.expandCommentPopupWindowCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tenterTime);
       }
       tenterTime = this.commentCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tenterTime);
       }
       tenterTime = this.negativeCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, tenterTime);
       }
       tenterTime = this.reportCount;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(12, tenterTime);
       }
       tenterTime = this.leaveAction;
       if (tenterTime != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tenterTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$DetailActionStatPackage mergeFrom(CodedInputByteBufferNano p0){
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
                this.slideUpPlayCount = p0.readUInt32();
                break;
              case '(':
                this.slideDownPlayCount = p0.readUInt32();
                break;
              case '0':
                this.likeCount = p0.readUInt32();
                break;
              case '8':
                this.followCount = p0.readUInt32();
                break;
              case '@':
                this.forwardCount = p0.readUInt32();
                break;
              case 'H':
                this.expandCommentPopupWindowCount = p0.readUInt32();
                break;
              case 'P':
                this.commentCount = p0.readUInt32();
                break;
              case 'X':
                this.negativeCount = p0.readUInt32();
                break;
              case '`':
                this.reportCount = p0.readUInt32();
                break;
              case 'h':
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
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$DetailActionStatPackage tenterTime = this.enterTime;
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
       tenterTime = this.slideUpPlayCount;
       if (tenterTime != null) {
          p0.writeUInt32(4, tenterTime);
       }
       tenterTime = this.slideDownPlayCount;
       if (tenterTime != null) {
          p0.writeUInt32(5, tenterTime);
       }
       tenterTime = this.likeCount;
       if (tenterTime != null) {
          p0.writeUInt32(6, tenterTime);
       }
       tenterTime = this.followCount;
       if (tenterTime != null) {
          p0.writeUInt32(7, tenterTime);
       }
       tenterTime = this.forwardCount;
       if (tenterTime != null) {
          p0.writeUInt32(8, tenterTime);
       }
       tenterTime = this.expandCommentPopupWindowCount;
       if (tenterTime != null) {
          p0.writeUInt32(9, tenterTime);
       }
       tenterTime = this.commentCount;
       if (tenterTime != null) {
          p0.writeUInt32(10, tenterTime);
       }
       tenterTime = this.negativeCount;
       if (tenterTime != null) {
          p0.writeUInt32(11, tenterTime);
       }
       tenterTime = this.reportCount;
       if (tenterTime != null) {
          p0.writeUInt32(12, tenterTime);
       }
       tenterTime = this.leaveAction;
       if (tenterTime != null) {
          p0.writeInt32(13, tenterTime);
       }
       super.writeTo(p0);
       return;
    }
}
