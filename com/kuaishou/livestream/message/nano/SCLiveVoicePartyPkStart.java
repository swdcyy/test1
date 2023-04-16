package com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveVoicePartyPkStart extends MessageNano	// class@001452
{
    public String pkId;
    public long time;
    public long voteStartTime;
    public static SCLiveVoicePartyPkStart[] _emptyArray;

    public void SCLiveVoicePartyPkStart(){
       super();
       this.clear();
    }
    public static SCLiveVoicePartyPkStart[] emptyArray(){
       if (SCLiveVoicePartyPkStart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveVoicePartyPkStart._emptyArray == null) {
             SCLiveVoicePartyPkStart[] sCLiveVoiceP = new SCLiveVoicePartyPkStart[0];
             SCLiveVoicePartyPkStart._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveVoicePartyPkStart._emptyArray;
    }
    public static SCLiveVoicePartyPkStart parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveVoicePartyPkStart().mergeFrom(p0);
    }
    public static SCLiveVoicePartyPkStart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveVoicePartyPkStart(), p0);
    }
    public SCLiveVoicePartyPkStart clear(){
       this.pkId = "";
       this.time = 0;
       this.voteStartTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCLiveVoicePartyPkStart ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttime);
       }
       ttime = this.voteStartTime;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveVoicePartyPkStart mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.voteStartTime = p0.readUInt64();
                }
             }else {
                this.time = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       SCLiveVoicePartyPkStart ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(2, ttime);
       }
       ttime = this.voteStartTime;
       if (ttime - i) {
          p0.writeUInt64(3, ttime);
       }
       super.writeTo(p0);
       return;
    }
}
