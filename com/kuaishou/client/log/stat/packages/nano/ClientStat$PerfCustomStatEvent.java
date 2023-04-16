package com.kuaishou.client.log.stat.packages.nano.ClientStat$PerfCustomStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$PerfCustomStatEvent extends MessageNano	// class@001414
{
    public String key;
    public String value;
    public static ClientStat$PerfCustomStatEvent[] _emptyArray;

    public void ClientStat$PerfCustomStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$PerfCustomStatEvent[] emptyArray(){
       if (ClientStat$PerfCustomStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$PerfCustomStatEvent._emptyArray == null) {
             ClientStat$PerfCustomStatEvent[] perfCustomSt = new ClientStat$PerfCustomStatEvent[0];
             ClientStat$PerfCustomStatEvent._emptyArray = perfCustomSt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$PerfCustomStatEvent._emptyArray;
    }
    public static ClientStat$PerfCustomStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$PerfCustomStatEvent().mergeFrom(p0);
    }
    public static ClientStat$PerfCustomStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$PerfCustomStatEvent(), p0);
    }
    public ClientStat$PerfCustomStatEvent clear(){
       this.key = "";
       this.value = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.key).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.key);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.value);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$PerfCustomStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
                this.value = p0.readString();
             }
          }else {
             this.key = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.key).equals(str)) {
          p0.writeString(1, this.key);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(2, this.value);
       }
       super.writeTo(p0);
       return;
    }
}
