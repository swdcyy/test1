package com.kuaishou.client.log.stat.packages.nano.ClientStat$IoOverviewStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$IoOverviewStatEvent extends MessageNano	// class@0007db
{
    public String ioOverview;
    public String page;
    public String procName;
    public String version;
    public static ClientStat$IoOverviewStatEvent[] _emptyArray;

    public void ClientStat$IoOverviewStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$IoOverviewStatEvent[] emptyArray(){
       if (ClientStat$IoOverviewStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$IoOverviewStatEvent._emptyArray == null) {
             ClientStat$IoOverviewStatEvent[] ioOverviewSt = new ClientStat$IoOverviewStatEvent[0];
             ClientStat$IoOverviewStatEvent._emptyArray = ioOverviewSt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$IoOverviewStatEvent._emptyArray;
    }
    public static ClientStat$IoOverviewStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$IoOverviewStatEvent().mergeFrom(p0);
    }
    public static ClientStat$IoOverviewStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$IoOverviewStatEvent(), p0);
    }
    public ClientStat$IoOverviewStatEvent clear(){
       this.version = "";
       this.procName = "";
       this.ioOverview = "";
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
       if (!(this.ioOverview).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ioOverview);
       }
       if (!(this.page).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.page);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$IoOverviewStatEvent mergeFrom(CodedInputByteBufferNano p0){
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
                   this.ioOverview = p0.readString();
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
       if (!(this.ioOverview).equals(str)) {
          p0.writeString(3, this.ioOverview);
       }
       if (!(this.page).equals(str)) {
          p0.writeString(4, this.page);
       }
       super.writeTo(p0);
       return;
    }
}
