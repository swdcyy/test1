package com.kuaishou.protobuf.livestream.nano.SCLiveMultiLinePkPrepareUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMultiLinePkPrepareUpdate extends MessageNano	// class@000d5e
{
    public String chatId;
    public String multiLineChatId;
    public long prepareEndDeadline;
    public long prepareEndNotifyDeadline;
    public long timestamp;
    public String updateToast;
    public static SCLiveMultiLinePkPrepareUpdate[] _emptyArray;

    public void SCLiveMultiLinePkPrepareUpdate(){
       super();
       this.clear();
    }
    public static SCLiveMultiLinePkPrepareUpdate[] emptyArray(){
       if (SCLiveMultiLinePkPrepareUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiLinePkPrepareUpdate._emptyArray == null) {
             SCLiveMultiLinePkPrepareUpdate[] sCLiveMultiL = new SCLiveMultiLinePkPrepareUpdate[0];
             SCLiveMultiLinePkPrepareUpdate._emptyArray = sCLiveMultiL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiLinePkPrepareUpdate._emptyArray;
    }
    public static SCLiveMultiLinePkPrepareUpdate parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiLinePkPrepareUpdate().mergeFrom(p0);
    }
    public static SCLiveMultiLinePkPrepareUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiLinePkPrepareUpdate(), p0);
    }
    public SCLiveMultiLinePkPrepareUpdate clear(){
       this.chatId = "";
       this.multiLineChatId = "";
       this.timestamp = 0;
       this.prepareEndDeadline = 0;
       this.prepareEndNotifyDeadline = 0;
       this.updateToast = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.chatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.chatId);
       }
       if (!(this.multiLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.multiLineChatId);
       }
       SCLiveMultiLinePkPrepareUpdate ttimestamp = this.timestamp;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttimestamp);
       }
       ttimestamp = this.prepareEndDeadline;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttimestamp);
       }
       ttimestamp = this.prepareEndNotifyDeadline;
       if (ttimestamp) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttimestamp);
       }
       if (!(this.updateToast).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.updateToast);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiLinePkPrepareUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.updateToast = p0.readString();
                         }
                      }else {
                         this.prepareEndNotifyDeadline = p0.readUInt64();
                      }
                   }else {
                      this.prepareEndDeadline = p0.readUInt64();
                   }
                }else {
                   this.timestamp = p0.readUInt64();
                }
             }else {
                this.multiLineChatId = p0.readString();
             }
          }else {
             this.chatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.chatId).equals(str)) {
          p0.writeString(1, this.chatId);
       }
       if (!(this.multiLineChatId).equals(str)) {
          p0.writeString(2, this.multiLineChatId);
       }
       SCLiveMultiLinePkPrepareUpdate ttimestamp = this.timestamp;
       if (ttimestamp) {
          p0.writeUInt64(3, ttimestamp);
       }
       ttimestamp = this.prepareEndDeadline;
       if (ttimestamp) {
          p0.writeUInt64(4, ttimestamp);
       }
       ttimestamp = this.prepareEndNotifyDeadline;
       if (ttimestamp) {
          p0.writeUInt64(5, ttimestamp);
       }
       if (!(this.updateToast).equals(str)) {
          p0.writeString(6, this.updateToast);
       }
       super.writeTo(p0);
       return;
    }
}
