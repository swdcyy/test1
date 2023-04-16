package com.kuaishou.livestream.message.nano.SCLiveEntrustOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveEntrustOpened extends MessageNano	// class@00141e
{
    public String liveStreamId;
    public String msg;
    public static SCLiveEntrustOpened[] _emptyArray;

    public void SCLiveEntrustOpened(){
       super();
       this.clear();
    }
    public static SCLiveEntrustOpened[] emptyArray(){
       if (SCLiveEntrustOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveEntrustOpened._emptyArray == null) {
             SCLiveEntrustOpened[] sCLiveEntrus = new SCLiveEntrustOpened[0];
             SCLiveEntrustOpened._emptyArray = sCLiveEntrus;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveEntrustOpened._emptyArray;
    }
    public static SCLiveEntrustOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveEntrustOpened().mergeFrom(p0);
    }
    public static SCLiveEntrustOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveEntrustOpened(), p0);
    }
    public SCLiveEntrustOpened clear(){
       this.liveStreamId = "";
       this.msg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.msg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.msg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveEntrustOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.msg = p0.readString();
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
       if (!(this.msg).equals(str)) {
          p0.writeString(2, this.msg);
       }
       super.writeTo(p0);
       return;
    }
}
