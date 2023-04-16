package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkKoMode;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$SCPkKoMode extends MessageNano	// class@00122a
{
    public String pkId;
    public int status;
    public static LivePkMessages$SCPkKoMode[] _emptyArray;

    public void LivePkMessages$SCPkKoMode(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkKoMode[] emptyArray(){
       if (LivePkMessages$SCPkKoMode._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkKoMode._emptyArray == null) {
             LivePkMessages$SCPkKoMode[] sCPkKoModeAr = new LivePkMessages$SCPkKoMode[0];
             LivePkMessages$SCPkKoMode._emptyArray = sCPkKoModeAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkKoMode._emptyArray;
    }
    public static LivePkMessages$SCPkKoMode parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkKoMode().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkKoMode parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkKoMode(), p0);
    }
    public LivePkMessages$SCPkKoMode clear(){
       this.pkId = "";
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCPkKoMode tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkKoMode mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
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
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$SCPkKoMode tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
