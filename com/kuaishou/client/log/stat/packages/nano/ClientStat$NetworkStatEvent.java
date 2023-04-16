package com.kuaishou.client.log.stat.packages.nano.ClientStat$NetworkStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$NetworkStatEvent extends MessageNano	// class@0007ef
{
    public String bssid;
    public long endTimestamp;
    public String isp;
    public String ssid;
    public long startTimestamp;
    public long totalDuration;
    public long totalTraffic;
    public int type;
    public static ClientStat$NetworkStatEvent[] _emptyArray;

    public void ClientStat$NetworkStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$NetworkStatEvent[] emptyArray(){
       if (ClientStat$NetworkStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$NetworkStatEvent._emptyArray == null) {
             ClientStat$NetworkStatEvent[] networkStatE = new ClientStat$NetworkStatEvent[0];
             ClientStat$NetworkStatEvent._emptyArray = networkStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$NetworkStatEvent._emptyArray;
    }
    public static ClientStat$NetworkStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$NetworkStatEvent().mergeFrom(p0);
    }
    public static ClientStat$NetworkStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$NetworkStatEvent(), p0);
    }
    public ClientStat$NetworkStatEvent clear(){
       this.type = 0;
       this.ssid = "";
       this.bssid = "";
       this.isp = "";
       this.startTimestamp = 0;
       this.endTimestamp = 0;
       this.totalDuration = 0;
       this.totalTraffic = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$NetworkStatEvent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.ssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.ssid);
       }
       if (!(this.bssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bssid);
       }
       if (!(this.isp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.isp);
       }
       ttype = this.startTimestamp;
       int i1 = 0;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttype);
       }
       ttype = this.endTimestamp;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ttype);
       }
       ttype = this.totalDuration;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, ttype);
       }
       ttype = this.totalTraffic;
       if (ttype - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$NetworkStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.totalTraffic = p0.readUInt64();
                               }
                            }else {
                               this.totalDuration = p0.readUInt64();
                            }
                         }else {
                            this.endTimestamp = p0.readUInt64();
                         }
                      }else {
                         this.startTimestamp = p0.readUInt64();
                      }
                   }else {
                      this.isp = p0.readString();
                   }
                }else {
                   this.bssid = p0.readString();
                }
             }else {
                this.ssid = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$NetworkStatEvent ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.ssid).equals(str)) {
          p0.writeString(2, this.ssid);
       }
       if (!(this.bssid).equals(str)) {
          p0.writeString(3, this.bssid);
       }
       if (!(this.isp).equals(str)) {
          p0.writeString(4, this.isp);
       }
       ttype = this.startTimestamp;
       int i = 0;
       if (ttype - i) {
          p0.writeUInt64(5, ttype);
       }
       ttype = this.endTimestamp;
       if (ttype - i) {
          p0.writeUInt64(6, ttype);
       }
       ttype = this.totalDuration;
       if (ttype - i) {
          p0.writeUInt64(7, ttype);
       }
       ttype = this.totalTraffic;
       if (ttype - i) {
          p0.writeUInt64(8, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
