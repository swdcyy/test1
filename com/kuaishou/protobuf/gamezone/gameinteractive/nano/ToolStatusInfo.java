package com.kuaishou.protobuf.gamezone.gameinteractive.nano.ToolStatusInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ToolStatusInfo extends MessageNano	// class@000bbb
{
    public String appId;
    public long delayLoading;
    public String liveStreamId;
    public long playId;
    public int status;
    public long timestamp;
    public static ToolStatusInfo[] _emptyArray;

    public void ToolStatusInfo(){
       super();
       this.clear();
    }
    public static ToolStatusInfo[] emptyArray(){
       if (ToolStatusInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ToolStatusInfo._emptyArray == null) {
             ToolStatusInfo[] toolStatusIn = new ToolStatusInfo[0];
             ToolStatusInfo._emptyArray = toolStatusIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ToolStatusInfo._emptyArray;
    }
    public static ToolStatusInfo parseFrom(CodedInputByteBufferNano p0){
       return new ToolStatusInfo().mergeFrom(p0);
    }
    public static ToolStatusInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ToolStatusInfo(), p0);
    }
    public ToolStatusInfo clear(){
       this.liveStreamId = "";
       this.appId = "";
       this.status = 0;
       this.delayLoading = 0;
       this.timestamp = 0;
       this.playId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.appId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.appId);
       }
       ToolStatusInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstatus);
       }
       tstatus = this.delayLoading;
       int i1 = 0;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstatus);
       }
       tstatus = this.timestamp;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tstatus);
       }
       tstatus = this.playId;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ToolStatusInfo mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.playId = p0.readUInt64();
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.delayLoading = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.status = i;
                   }
                }
             }else {
                this.appId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.appId).equals(str)) {
          p0.writeString(2, this.appId);
       }
       ToolStatusInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(3, tstatus);
       }
       tstatus = this.delayLoading;
       int i = 0;
       if (tstatus - i) {
          p0.writeUInt64(4, tstatus);
       }
       tstatus = this.timestamp;
       if (tstatus - i) {
          p0.writeUInt64(5, tstatus);
       }
       tstatus = this.playId;
       if (tstatus - i) {
          p0.writeUInt64(6, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
