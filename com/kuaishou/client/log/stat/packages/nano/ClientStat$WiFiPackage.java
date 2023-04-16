package com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$WiFiPackage extends MessageNano	// class@001447
{
    public String bssid;
    public String capabilities;
    public boolean connected;
    public int frequency;
    public int level;
    public String ssid;
    public long timestamp;
    public static ClientStat$WiFiPackage[] _emptyArray;

    public void ClientStat$WiFiPackage(){
       super();
       this.clear();
    }
    public static ClientStat$WiFiPackage[] emptyArray(){
       if (ClientStat$WiFiPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$WiFiPackage._emptyArray == null) {
             ClientStat$WiFiPackage[] wiFiPackageA = new ClientStat$WiFiPackage[0];
             ClientStat$WiFiPackage._emptyArray = wiFiPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$WiFiPackage._emptyArray;
    }
    public static ClientStat$WiFiPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$WiFiPackage().mergeFrom(p0);
    }
    public static ClientStat$WiFiPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$WiFiPackage(), p0);
    }
    public ClientStat$WiFiPackage clear(){
       this.ssid = "";
       this.bssid = "";
       this.capabilities = "";
       this.level = 0;
       this.frequency = 0;
       this.timestamp = 0;
       this.connected = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.ssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.ssid);
       }
       if (!(this.bssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bssid);
       }
       if (!(this.capabilities).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.capabilities);
       }
       ClientStat$WiFiPackage tlevel = this.level;
       if (tlevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tlevel);
       }
       tlevel = this.frequency;
       if (tlevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tlevel);
       }
       tlevel = this.timestamp;
       if (tlevel) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tlevel);
       }
       tlevel = this.connected;
       if (tlevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tlevel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$WiFiPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.connected = p0.readBool();
                            }
                         }else {
                            this.timestamp = p0.readUInt64();
                         }
                      }else {
                         this.frequency = p0.readUInt32();
                      }
                   }else {
                      this.level = p0.readUInt32();
                   }
                }else {
                   this.capabilities = p0.readString();
                }
             }else {
                this.bssid = p0.readString();
             }
          }else {
             this.ssid = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.ssid).equals(str)) {
          p0.writeString(1, this.ssid);
       }
       if (!(this.bssid).equals(str)) {
          p0.writeString(2, this.bssid);
       }
       if (!(this.capabilities).equals(str)) {
          p0.writeString(3, this.capabilities);
       }
       ClientStat$WiFiPackage tlevel = this.level;
       if (tlevel != null) {
          p0.writeUInt32(4, tlevel);
       }
       tlevel = this.frequency;
       if (tlevel != null) {
          p0.writeUInt32(5, tlevel);
       }
       tlevel = this.timestamp;
       if (tlevel) {
          p0.writeUInt64(6, tlevel);
       }
       tlevel = this.connected;
       if (tlevel != null) {
          p0.writeBool(7, tlevel);
       }
       super.writeTo(p0);
       return;
    }
}
