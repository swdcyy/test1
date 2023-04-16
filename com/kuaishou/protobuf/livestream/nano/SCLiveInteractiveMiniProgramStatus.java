package com.kuaishou.protobuf.livestream.nano.SCLiveInteractiveMiniProgramStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveInteractiveMiniProgramStatus extends MessageNano	// class@000d52
{
    public String appId;
    public String liveStreamId;
    public int status;
    public static SCLiveInteractiveMiniProgramStatus[] _emptyArray;

    public void SCLiveInteractiveMiniProgramStatus(){
       super();
       this.clear();
    }
    public static SCLiveInteractiveMiniProgramStatus[] emptyArray(){
       if (SCLiveInteractiveMiniProgramStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveInteractiveMiniProgramStatus._emptyArray == null) {
             SCLiveInteractiveMiniProgramStatus[] sCLiveIntera = new SCLiveInteractiveMiniProgramStatus[0];
             SCLiveInteractiveMiniProgramStatus._emptyArray = sCLiveIntera;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveInteractiveMiniProgramStatus._emptyArray;
    }
    public static SCLiveInteractiveMiniProgramStatus parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveInteractiveMiniProgramStatus().mergeFrom(p0);
    }
    public static SCLiveInteractiveMiniProgramStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveInteractiveMiniProgramStatus(), p0);
    }
    public SCLiveInteractiveMiniProgramStatus clear(){
       this.appId = "";
       this.status = 0;
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.appId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.appId);
       }
       SCLiveInteractiveMiniProgramStatus tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveInteractiveMiniProgramStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.liveStreamId = p0.readString();
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
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.appId).equals(str)) {
          p0.writeString(1, this.appId);
       }
       SCLiveInteractiveMiniProgramStatus tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
