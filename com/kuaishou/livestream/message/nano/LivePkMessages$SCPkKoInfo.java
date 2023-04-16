package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkKoInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$SCPkKoInfo extends MessageNano	// class@001228
{
    public long curWinnerId;
    public String pkId;
    public long startTime;
    public int status;
    public static LivePkMessages$SCPkKoInfo[] _emptyArray;

    public void LivePkMessages$SCPkKoInfo(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkKoInfo[] emptyArray(){
       if (LivePkMessages$SCPkKoInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkKoInfo._emptyArray == null) {
             LivePkMessages$SCPkKoInfo[] sCPkKoInfoAr = new LivePkMessages$SCPkKoInfo[0];
             LivePkMessages$SCPkKoInfo._emptyArray = sCPkKoInfoAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkKoInfo._emptyArray;
    }
    public static LivePkMessages$SCPkKoInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkKoInfo().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkKoInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkKoInfo(), p0);
    }
    public LivePkMessages$SCPkKoInfo clear(){
       this.status = 0;
       this.curWinnerId = 0;
       this.pkId = "";
       this.startTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$SCPkKoInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstatus);
       }
       tstatus = this.curWinnerId;
       int i1 = 0;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tstatus);
       }
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pkId);
       }
       tstatus = this.startTime;
       if (tstatus - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkKoInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.startTime = p0.readUInt64();
                   }
                }else {
                   this.pkId = p0.readString();
                }
             }else {
                this.curWinnerId = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.status = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$SCPkKoInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(1, tstatus);
       }
       tstatus = this.curWinnerId;
       int i = 0;
       if (tstatus - i) {
          p0.writeUInt64(2, tstatus);
       }
       if (!(this.pkId).equals("")) {
          p0.writeString(3, this.pkId);
       }
       tstatus = this.startTime;
       if (tstatus - i) {
          p0.writeUInt64(4, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
