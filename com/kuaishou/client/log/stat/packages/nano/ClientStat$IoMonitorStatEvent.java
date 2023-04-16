package com.kuaishou.client.log.stat.packages.nano.ClientStat$IoMonitorStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$IoMonitorStatEvent extends MessageNano	// class@0007da
{
    public String ioFiles;
    public String page;
    public String procName;
    public String version;
    public static ClientStat$IoMonitorStatEvent[] _emptyArray;

    public void ClientStat$IoMonitorStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$IoMonitorStatEvent[] emptyArray(){
       if (ClientStat$IoMonitorStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$IoMonitorStatEvent._emptyArray == null) {
             ClientStat$IoMonitorStatEvent[] ioMonitorSta = new ClientStat$IoMonitorStatEvent[0];
             ClientStat$IoMonitorStatEvent._emptyArray = ioMonitorSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$IoMonitorStatEvent._emptyArray;
    }
    public static ClientStat$IoMonitorStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$IoMonitorStatEvent().mergeFrom(p0);
    }
    public static ClientStat$IoMonitorStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$IoMonitorStatEvent(), p0);
    }
    public ClientStat$IoMonitorStatEvent clear(){
       this.version = "";
       this.procName = "";
       this.ioFiles = "";
       this.page = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.version).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.version);
       }
       if (!(this.procName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.procName);
       }
       if (!(this.ioFiles).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ioFiles);
       }
       if (!(this.page).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.page);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$IoMonitorStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.page = p0.readString();
                   }
                }else {
                   this.ioFiles = p0.readString();
                }
             }else {
                this.procName = p0.readString();
             }
          }else {
             this.version = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.version).equals(str)) {
          p0.writeString(1, this.version);
       }
       if (!(this.procName).equals(str)) {
          p0.writeString(2, this.procName);
       }
       if (!(this.ioFiles).equals(str)) {
          p0.writeString(3, this.ioFiles);
       }
       if (!(this.page).equals(str)) {
          p0.writeString(4, this.page);
       }
       super.writeTo(p0);
       return;
    }
}
