package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkReopenRespond;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$SCPkReopenRespond extends MessageNano	// class@001230
{
    public String pkId;
    public int status;
    public String tip;
    public static LivePkMessages$SCPkReopenRespond[] _emptyArray;

    public void LivePkMessages$SCPkReopenRespond(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkReopenRespond[] emptyArray(){
       if (LivePkMessages$SCPkReopenRespond._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkReopenRespond._emptyArray == null) {
             LivePkMessages$SCPkReopenRespond[] sCPkReopenRe = new LivePkMessages$SCPkReopenRespond[0];
             LivePkMessages$SCPkReopenRespond._emptyArray = sCPkReopenRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkReopenRespond._emptyArray;
    }
    public static LivePkMessages$SCPkReopenRespond parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkReopenRespond().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkReopenRespond parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkReopenRespond(), p0);
    }
    public LivePkMessages$SCPkReopenRespond clear(){
       this.pkId = "";
       this.status = 0;
       this.tip = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCPkReopenRespond tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       if (!(this.tip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tip);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkReopenRespond mergeFrom(CodedInputByteBufferNano p0){
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
                   this.tip = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && i != 1) {
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
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$SCPkReopenRespond tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       if (!(this.tip).equals(str)) {
          p0.writeString(3, this.tip);
       }
       super.writeTo(p0);
       return;
    }
}
