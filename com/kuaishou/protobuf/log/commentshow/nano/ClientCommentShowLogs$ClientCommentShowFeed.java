package com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientCommentShowLogs$ClientCommentShowFeed extends MessageNano	// class@000dd1
{
    public String actionLogId;
    public long commentId;
    public long commentUserId;
    public String sCommentUserId;
    public static ClientCommentShowLogs$ClientCommentShowFeed[] _emptyArray;

    public void ClientCommentShowLogs$ClientCommentShowFeed(){
       super();
       this.clear();
    }
    public static ClientCommentShowLogs$ClientCommentShowFeed[] emptyArray(){
       if (ClientCommentShowLogs$ClientCommentShowFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommentShowLogs$ClientCommentShowFeed._emptyArray == null) {
             ClientCommentShowLogs$ClientCommentShowFeed[] uClientComme = new ClientCommentShowLogs$ClientCommentShowFeed[0];
             ClientCommentShowLogs$ClientCommentShowFeed._emptyArray = uClientComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommentShowLogs$ClientCommentShowFeed._emptyArray;
    }
    public static ClientCommentShowLogs$ClientCommentShowFeed parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommentShowLogs$ClientCommentShowFeed().mergeFrom(p0);
    }
    public static ClientCommentShowLogs$ClientCommentShowFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommentShowLogs$ClientCommentShowFeed(), p0);
    }
    public ClientCommentShowLogs$ClientCommentShowFeed clear(){
       this.commentId = 0;
       this.commentUserId = 0;
       this.sCommentUserId = "";
       this.actionLogId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientCommentShowLogs$ClientCommentShowFeed tcommentId = this.commentId;
       ClientCommentShowLogs$ClientCommentShowFeed uClientComme = null;
       if (tcommentId - uClientComme) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tcommentId);
       }
       tcommentId = this.commentUserId;
       if (tcommentId - uClientComme) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tcommentId);
       }
       String str = "";
       if (!(this.sCommentUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sCommentUserId);
       }
       if (!(this.actionLogId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.actionLogId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommentShowLogs$ClientCommentShowFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.actionLogId = p0.readString();
                   }
                }else {
                   this.sCommentUserId = p0.readString();
                }
             }else {
                this.commentUserId = p0.readUInt64();
             }
          }else {
             this.commentId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientCommentShowLogs$ClientCommentShowFeed tcommentId = this.commentId;
       ClientCommentShowLogs$ClientCommentShowFeed uClientComme = null;
       if (tcommentId - uClientComme) {
          p0.writeUInt64(1, tcommentId);
       }
       tcommentId = this.commentUserId;
       if (tcommentId - uClientComme) {
          p0.writeUInt64(2, tcommentId);
       }
       String str = "";
       if (!(this.sCommentUserId).equals(str)) {
          p0.writeString(3, this.sCommentUserId);
       }
       if (!(this.actionLogId).equals(str)) {
          p0.writeString(4, this.actionLogId);
       }
       super.writeTo(p0);
       return;
    }
}
