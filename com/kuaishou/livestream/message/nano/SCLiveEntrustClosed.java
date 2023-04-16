package com.kuaishou.livestream.message.nano.SCLiveEntrustClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveEntrustClosed extends MessageNano	// class@00141d
{
    public String liveStreamId;
    public String msg;
    public static SCLiveEntrustClosed[] _emptyArray;

    public void SCLiveEntrustClosed(){
       super();
       this.clear();
    }
    public static SCLiveEntrustClosed[] emptyArray(){
       if (SCLiveEntrustClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveEntrustClosed._emptyArray == null) {
             SCLiveEntrustClosed[] sCLiveEntrus = new SCLiveEntrustClosed[0];
             SCLiveEntrustClosed._emptyArray = sCLiveEntrus;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveEntrustClosed._emptyArray;
    }
    public static SCLiveEntrustClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveEntrustClosed().mergeFrom(p0);
    }
    public static SCLiveEntrustClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveEntrustClosed(), p0);
    }
    public SCLiveEntrustClosed clear(){
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
    public SCLiveEntrustClosed mergeFrom(CodedInputByteBufferNano p0){
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
