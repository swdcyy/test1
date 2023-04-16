package com.kuaishou.protobuf.log.nano.ClientExtInfo$RecoExtInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.packages.nano.ClientBase$ApplicationPackage;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;
import java.lang.System;

public final class ClientExtInfo$RecoExtInfo extends MessageNano	// class@000de3
{
    public String adChannel;
    public ClientBase$ApplicationPackage[] app;
    public String bssid;
    public String caidVersion;
    public String currentCaid;
    public int deviceStatBattery;
    public double deviceStatBrightness;
    public int deviceStatDensityDpi;
    public int deviceStatDiskAll;
    public int deviceStatDiskFree;
    public int deviceStatMemory;
    public String dynamicPkgInfo;
    public int height;
    public String idfa;
    public String[] imei;
    public String lastCaid;
    public String lastCaidVersion;
    public String mac;
    public String muid;
    public String oaid;
    public String originChannel;
    public String phoneMask;
    public String ssid;
    public int width;
    public static ClientExtInfo$RecoExtInfo[] _emptyArray;

    public void ClientExtInfo$RecoExtInfo(){
       super();
       this.clear();
    }
    public static ClientExtInfo$RecoExtInfo[] emptyArray(){
       if (ClientExtInfo$RecoExtInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientExtInfo$RecoExtInfo._emptyArray == null) {
             ClientExtInfo$RecoExtInfo[] recoExtInfoA = new ClientExtInfo$RecoExtInfo[0];
             ClientExtInfo$RecoExtInfo._emptyArray = recoExtInfoA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientExtInfo$RecoExtInfo._emptyArray;
    }
    public static ClientExtInfo$RecoExtInfo parseFrom(CodedInputByteBufferNano p0){
       return new ClientExtInfo$RecoExtInfo().mergeFrom(p0);
    }
    public static ClientExtInfo$RecoExtInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientExtInfo$RecoExtInfo(), p0);
    }
    public ClientExtInfo$RecoExtInfo clear(){
       this.app = ClientBase$ApplicationPackage.emptyArray();
       this.imei = WireFormatNano.EMPTY_STRING_ARRAY;
       this.idfa = "";
       this.muid = "";
       this.width = 0;
       this.height = 0;
       this.dynamicPkgInfo = "";
       this.mac = "";
       this.ssid = "";
       this.bssid = "";
       this.phoneMask = "";
       this.originChannel = "";
       this.deviceStatDiskFree = 0;
       this.deviceStatDiskAll = 0;
       this.deviceStatBrightness = 0;
       this.deviceStatBattery = 0;
       this.deviceStatMemory = 0;
       this.deviceStatDensityDpi = 0;
       this.adChannel = "";
       this.oaid = "";
       this.currentCaid = "";
       this.lastCaid = "";
       this.caidVersion = "";
       this.lastCaidVersion = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i3;
       int i = super.computeSerializedSize();
       ClientExtInfo$RecoExtInfo tapp = this.app;
       int i1 = 0;
       int i2 = 1;
       if (tapp != null && tapp.length > 0) {
          i3 = 0;
          ClientExtInfo$RecoExtInfo tapp1 = this.app;
          while (i3 < tapp1.length) {
             object oobject = tapp1[i3];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(i2, oobject);
             }
             i3 = i3 + 1;
          }
       }
       tapp = this.imei;
       if (tapp != null && tapp.length > 0) {
          i3 = 0;
          int i4 = 0;
          ClientExtInfo$RecoExtInfo timei = this.imei;
          while (i1 < timei.length) {
             object oobject1 = timei[i1];
             if (oobject1 != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i1 = i1 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       String str = "";
       if (!(this.idfa).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.idfa);
       }
       if (!(this.muid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.muid);
       }
       tapp = this.width;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tapp);
       }
       tapp = this.height;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tapp);
       }
       if (!(this.dynamicPkgInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.dynamicPkgInfo);
       }
       if (!(this.mac).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.mac);
       }
       if (!(this.ssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.ssid);
       }
       if (!(this.bssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.bssid);
       }
       if (!(this.phoneMask).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.phoneMask);
       }
       if (!(this.originChannel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.originChannel);
       }
       tapp = this.deviceStatDiskFree;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(13, tapp);
       }
       tapp = this.deviceStatDiskAll;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, tapp);
       }
       if (Double.doubleToLongBits(this.deviceStatBrightness) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(15, this.deviceStatBrightness);
       }
       tapp = this.deviceStatBattery;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tapp);
       }
       tapp = this.deviceStatMemory;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tapp);
       }
       tapp = this.deviceStatDensityDpi;
       if (tapp != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, tapp);
       }
       if (!(this.adChannel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.adChannel);
       }
       if (!(this.oaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.oaid);
       }
       if (!(this.currentCaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.currentCaid);
       }
       if (!(this.lastCaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(22, this.lastCaid);
       }
       if (!(this.caidVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.caidVersion);
       }
       if (!(this.lastCaidVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(24, this.lastCaidVersion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientExtInfo$RecoExtInfo mergeFrom(CodedInputByteBufferNano p0){
       ClientExtInfo$RecoExtInfo tapp;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 10);
                tapp = this.app;
                i2 = (tapp == null)? 0: tapp.length;
                i = i + i2;
                ClientBase$ApplicationPackage[] uApplication = new ClientBase$ApplicationPackage[i];
                if (i2) {
                   System.arraycopy(tapp, i1, uApplication, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uApplication[i2] = new ClientBase$ApplicationPackage();
                   p0.readMessage(uApplication[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uApplication[i2] = new ClientBase$ApplicationPackage();
                p0.readMessage(uApplication[i2]);
                this.app = uApplication;
                break;
              case 18:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 18);
                tapp = this.imei;
                i2 = (tapp == null)? 0: tapp.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tapp, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.imei = stringArray;
                break;
              case 26:
                this.idfa = p0.readString();
                break;
              case '"':
                this.muid = p0.readString();
                break;
              case '(':
                this.width = p0.readUInt32();
                break;
              case '0':
                this.height = p0.readUInt32();
                break;
              case ':':
                this.dynamicPkgInfo = p0.readString();
                break;
              case 'B':
                this.mac = p0.readString();
                break;
              case 'J':
                this.ssid = p0.readString();
                break;
              case 'R':
                this.bssid = p0.readString();
                break;
              case 'Z':
                this.phoneMask = p0.readString();
                break;
              case 'b':
                this.originChannel = p0.readString();
                break;
              case 'h':
                this.deviceStatDiskFree = p0.readUInt32();
                break;
              case 'p':
                this.deviceStatDiskAll = p0.readUInt32();
                break;
              case 'y':
                this.deviceStatBrightness = p0.readDouble();
                break;
              case 128:
                this.deviceStatBattery = p0.readUInt32();
                break;
              case 136:
                this.deviceStatMemory = p0.readUInt32();
                break;
              case 144:
                this.deviceStatDensityDpi = p0.readUInt32();
                break;
              case 154:
                this.adChannel = p0.readString();
                break;
              case 162:
                this.oaid = p0.readString();
                break;
              case 170:
                this.currentCaid = p0.readString();
                break;
              case 178:
                this.lastCaid = p0.readString();
                break;
              case 186:
                this.caidVersion = p0.readString();
                break;
              case 194:
                this.lastCaidVersion = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientExtInfo$RecoExtInfo tapp = this.app;
       int i = 0;
       if (tapp != null && tapp.length > 0) {
          int i1 = 0;
          ClientExtInfo$RecoExtInfo tapp1 = this.app;
          while (i1 < tapp1.length) {
             object oobject = tapp1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tapp = this.imei;
       if (tapp != null && tapp.length > 0) {
          tapp = this.imei;
          while (i < tapp.length) {
             object oobject1 = tapp[i];
             if (oobject1 != null) {
                p0.writeString(2, oobject1);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.idfa).equals(str)) {
          p0.writeString(3, this.idfa);
       }
       if (!(this.muid).equals(str)) {
          p0.writeString(4, this.muid);
       }
       tapp = this.width;
       if (tapp != null) {
          p0.writeUInt32(5, tapp);
       }
       tapp = this.height;
       if (tapp != null) {
          p0.writeUInt32(6, tapp);
       }
       if (!(this.dynamicPkgInfo).equals(str)) {
          p0.writeString(7, this.dynamicPkgInfo);
       }
       if (!(this.mac).equals(str)) {
          p0.writeString(8, this.mac);
       }
       if (!(this.ssid).equals(str)) {
          p0.writeString(9, this.ssid);
       }
       if (!(this.bssid).equals(str)) {
          p0.writeString(10, this.bssid);
       }
       if (!(this.phoneMask).equals(str)) {
          p0.writeString(11, this.phoneMask);
       }
       if (!(this.originChannel).equals(str)) {
          p0.writeString(12, this.originChannel);
       }
       tapp = this.deviceStatDiskFree;
       if (tapp != null) {
          p0.writeUInt32(13, tapp);
       }
       tapp = this.deviceStatDiskAll;
       if (tapp != null) {
          p0.writeUInt32(14, tapp);
       }
       if (Double.doubleToLongBits(this.deviceStatBrightness) - Double.doubleToLongBits(0)) {
          p0.writeDouble(15, this.deviceStatBrightness);
       }
       tapp = this.deviceStatBattery;
       if (tapp != null) {
          p0.writeUInt32(16, tapp);
       }
       tapp = this.deviceStatMemory;
       if (tapp != null) {
          p0.writeUInt32(17, tapp);
       }
       tapp = this.deviceStatDensityDpi;
       if (tapp != null) {
          p0.writeUInt32(18, tapp);
       }
       if (!(this.adChannel).equals(str)) {
          p0.writeString(19, this.adChannel);
       }
       if (!(this.oaid).equals(str)) {
          p0.writeString(20, this.oaid);
       }
       if (!(this.currentCaid).equals(str)) {
          p0.writeString(21, this.currentCaid);
       }
       if (!(this.lastCaid).equals(str)) {
          p0.writeString(22, this.lastCaid);
       }
       if (!(this.caidVersion).equals(str)) {
          p0.writeString(23, this.caidVersion);
       }
       if (!(this.lastCaidVersion).equals(str)) {
          p0.writeString(24, this.lastCaidVersion);
       }
       super.writeTo(p0);
       return;
    }
}
