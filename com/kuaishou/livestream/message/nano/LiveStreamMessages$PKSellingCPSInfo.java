package com.kuaishou.livestream.message.nano.LiveStreamMessages$PKSellingCPSInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PKSellingCPSInfo extends MessageNano	// class@00130c
{
    public long inviteeUserId;
    public long inviterUserId;
    public String noticeButtonText;
    public String noticeButtonUrl;
    public String noticeDesc;
    public int noticePriority;
    public long noticeShowDeadlineTimestamp;
    public String noticeTitle;
    public String orderId;
    public static LiveStreamMessages$PKSellingCPSInfo[] _emptyArray;

    public void LiveStreamMessages$PKSellingCPSInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PKSellingCPSInfo[] emptyArray(){
       if (LiveStreamMessages$PKSellingCPSInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PKSellingCPSInfo._emptyArray == null) {
             LiveStreamMessages$PKSellingCPSInfo[] pKSellingCPS = new LiveStreamMessages$PKSellingCPSInfo[0];
             LiveStreamMessages$PKSellingCPSInfo._emptyArray = pKSellingCPS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PKSellingCPSInfo._emptyArray;
    }
    public static LiveStreamMessages$PKSellingCPSInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PKSellingCPSInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PKSellingCPSInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PKSellingCPSInfo(), p0);
    }
    public LiveStreamMessages$PKSellingCPSInfo clear(){
       this.orderId = "";
       this.inviterUserId = 0;
       this.inviteeUserId = 0;
       this.noticeTitle = "";
       this.noticeDesc = "";
       this.noticeButtonText = "";
       this.noticeButtonUrl = "";
       this.noticePriority = 0;
       this.noticeShowDeadlineTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.orderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.orderId);
       }
       LiveStreamMessages$PKSellingCPSInfo tinviterUser = this.inviterUserId;
       if (tinviterUser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tinviterUser);
       }
       tinviterUser = this.inviteeUserId;
       if (tinviterUser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tinviterUser);
       }
       if (!(this.noticeTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.noticeTitle);
       }
       if (!(this.noticeDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.noticeDesc);
       }
       if (!(this.noticeButtonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.noticeButtonText);
       }
       if (!(this.noticeButtonUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.noticeButtonUrl);
       }
       LiveStreamMessages$PKSellingCPSInfo tnoticePrior = this.noticePriority;
       if (tnoticePrior != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tnoticePrior);
       }
       tnoticePrior = this.noticeShowDeadlineTimestamp;
       if (tnoticePrior) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tnoticePrior);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PKSellingCPSInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.noticeShowDeadlineTimestamp = p0.readUInt64();
                                  }
                               }else {
                                  this.noticePriority = p0.readUInt32();
                               }
                            }else {
                               this.noticeButtonUrl = p0.readString();
                            }
                         }else {
                            this.noticeButtonText = p0.readString();
                         }
                      }else {
                         this.noticeDesc = p0.readString();
                      }
                   }else {
                      this.noticeTitle = p0.readString();
                   }
                }else {
                   this.inviteeUserId = p0.readUInt64();
                }
             }else {
                this.inviterUserId = p0.readUInt64();
             }
          }else {
             this.orderId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.orderId).equals(str)) {
          p0.writeString(1, this.orderId);
       }
       LiveStreamMessages$PKSellingCPSInfo tinviterUser = this.inviterUserId;
       if (tinviterUser) {
          p0.writeUInt64(2, tinviterUser);
       }
       tinviterUser = this.inviteeUserId;
       if (tinviterUser) {
          p0.writeUInt64(3, tinviterUser);
       }
       if (!(this.noticeTitle).equals(str)) {
          p0.writeString(4, this.noticeTitle);
       }
       if (!(this.noticeDesc).equals(str)) {
          p0.writeString(5, this.noticeDesc);
       }
       if (!(this.noticeButtonText).equals(str)) {
          p0.writeString(6, this.noticeButtonText);
       }
       if (!(this.noticeButtonUrl).equals(str)) {
          p0.writeString(7, this.noticeButtonUrl);
       }
       LiveStreamMessages$PKSellingCPSInfo tnoticePrior = this.noticePriority;
       if (tnoticePrior != null) {
          p0.writeUInt32(8, tnoticePrior);
       }
       tnoticePrior = this.noticeShowDeadlineTimestamp;
       if (tnoticePrior) {
          p0.writeUInt64(9, tnoticePrior);
       }
       super.writeTo(p0);
       return;
    }
}
