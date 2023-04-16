package com.kuaishou.client.log.stat.packages.nano.ClientStat$DeviceStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$SwitchAuthorizationStatusPackage;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HdrCapabilityPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$MediaCodecVideoCapabilityPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AppStorageUsagePackage;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$NotificationSettingPackage;

public final class ClientStat$DeviceStatEvent extends MessageNano	// class@0007b9
{
    public String androidId;
    public int appDiskSdGifshowUsed;
    public int appDiskUsed;
    public int appDiskUsedAll;
    public int appDiskUsedPrivate;
    public ClientStat$AppStorageUsagePackage appStorageOccupy;
    public double battery;
    public int batteryTemperature;
    public double brightness;
    public String caidVersion;
    public boolean charging;
    public int cpuCores;
    public String cpuPlatform;
    public double cpuUsage;
    public String currentCaid;
    public int densityDpi;
    public int diskAll;
    public int diskFree;
    public String diskPathSize;
    public String fingerprint;
    public double fontScale;
    public boolean gdb;
    public ClientStat$HdrCapabilityPackage hdrCaps;
    public String idfa;
    public String imei;
    public String[] imeis;
    public String imsi;
    public String installerPackageName;
    public boolean isSupportArm64;
    public boolean isVoiceOverOn;
    public boolean jailBroken;
    public String jailBrokenDetail;
    public String lastCaid;
    public String lastCaidVersion;
    public String mac;
    public ClientStat$MediaCodecVideoCapabilityPackage mediacodecVideoCaps;
    public int memory;
    public double memoryUsage;
    public String model;
    public int navigationBarHeight;
    public ClientStat$NotificationSettingPackage notificationSetting;
    public String oaid;
    public String osVersion;
    public ClientStat$SwitchAuthorizationStatusPackage[] permissionAuthorizationStatus;
    public String romVersion;
    public int screenHeight;
    public int screenWidth;
    public String shumengId;
    public String socName;
    public int statusBarHeight;
    public String umengId;
    public boolean usingEarphone;
    public double volume;
    public double xppi;
    public static ClientStat$DeviceStatEvent[] _emptyArray;

    public void ClientStat$DeviceStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$DeviceStatEvent[] emptyArray(){
       if (ClientStat$DeviceStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$DeviceStatEvent._emptyArray == null) {
             ClientStat$DeviceStatEvent[] uDeviceStatE = new ClientStat$DeviceStatEvent[0];
             ClientStat$DeviceStatEvent._emptyArray = uDeviceStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$DeviceStatEvent._emptyArray;
    }
    public static ClientStat$DeviceStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$DeviceStatEvent().mergeFrom(p0);
    }
    public static ClientStat$DeviceStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$DeviceStatEvent(), p0);
    }
    public ClientStat$DeviceStatEvent clear(){
       this.osVersion = "";
       this.model = "";
       this.cpuCores = 0;
       this.memory = 0;
       this.densityDpi = 0;
       this.screenWidth = 0;
       this.screenHeight = 0;
       this.batteryTemperature = 0;
       this.cpuUsage = 0;
       this.memoryUsage = 0;
       this.battery = 0;
       this.charging = false;
       this.volume = 0;
       this.brightness = 0;
       this.usingEarphone = false;
       this.diskAll = 0;
       this.diskFree = 0;
       this.appDiskUsed = 0;
       this.imei = "";
       this.imsi = "";
       this.notificationSetting = null;
       this.jailBroken = false;
       this.jailBrokenDetail = "";
       this.gdb = false;
       this.imeis = WireFormatNano.EMPTY_STRING_ARRAY;
       this.idfa = "";
       this.permissionAuthorizationStatus = ClientStat$SwitchAuthorizationStatusPackage.emptyArray();
       this.socName = "";
       this.umengId = "";
       this.shumengId = "";
       this.androidId = "";
       this.installerPackageName = "";
       this.appDiskUsedAll = 0;
       this.appDiskUsedPrivate = 0;
       this.appStorageOccupy = null;
       this.mac = "";
       this.isVoiceOverOn = false;
       this.oaid = "";
       this.mediacodecVideoCaps = null;
       this.hdrCaps = null;
       this.appDiskSdGifshowUsed = 0;
       this.fingerprint = "";
       this.romVersion = "";
       this.cpuPlatform = "";
       this.statusBarHeight = 0;
       this.navigationBarHeight = 0;
       this.isSupportArm64 = false;
       this.currentCaid = "";
       this.lastCaid = "";
       this.caidVersion = "";
       this.xppi = 0;
       this.lastCaidVersion = "";
       this.fontScale = 0;
       this.diskPathSize = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.osVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.osVersion);
       }
       int i1 = 2;
       if (!(this.model).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.model);
       }
       ClientStat$DeviceStatEvent tcpuCores = this.cpuCores;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcpuCores);
       }
       tcpuCores = this.memory;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tcpuCores);
       }
       tcpuCores = this.densityDpi;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tcpuCores);
       }
       tcpuCores = this.screenWidth;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tcpuCores);
       }
       tcpuCores = this.screenHeight;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tcpuCores);
       }
       tcpuCores = this.batteryTemperature;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tcpuCores);
       }
       if (Double.doubleToLongBits(this.cpuUsage) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(9, this.cpuUsage);
       }
       if (Double.doubleToLongBits(this.memoryUsage) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(10, this.memoryUsage);
       }
       if (Double.doubleToLongBits(this.battery) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(11, this.battery);
       }
       tcpuCores = this.charging;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tcpuCores);
       }
       if (Double.doubleToLongBits(this.volume) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(13, this.volume);
       }
       if (Double.doubleToLongBits(this.brightness) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(14, this.brightness);
       }
       tcpuCores = this.usingEarphone;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tcpuCores);
       }
       tcpuCores = this.diskAll;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(16, tcpuCores);
       }
       tcpuCores = this.diskFree;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, tcpuCores);
       }
       tcpuCores = this.appDiskUsed;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(18, tcpuCores);
       }
       if (!(this.imei).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.imei);
       }
       if (!(this.imsi).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.imsi);
       }
       tcpuCores = this.notificationSetting;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tcpuCores);
       }
       tcpuCores = this.jailBroken;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, tcpuCores);
       }
       if (!(this.jailBrokenDetail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(23, this.jailBrokenDetail);
       }
       tcpuCores = this.gdb;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(24, tcpuCores);
       }
       tcpuCores = this.imeis;
       int i2 = 0;
       if (tcpuCores != null && tcpuCores.length > 0) {
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          ClientStat$DeviceStatEvent timeis = this.imeis;
          while (i3 < timeis.length) {
             object oobject = timeis[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 2);
       }
       if (!(this.idfa).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(26, this.idfa);
       }
       tcpuCores = this.permissionAuthorizationStatus;
       if (tcpuCores != null && tcpuCores.length > 0) {
          tcpuCores = this.permissionAuthorizationStatus;
          while (i2 < tcpuCores.length) {
             object oobject1 = tcpuCores[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(27, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.socName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.socName);
       }
       if (!(this.umengId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.umengId);
       }
       if (!(this.shumengId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(30, this.shumengId);
       }
       if (!(this.androidId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(31, this.androidId);
       }
       if (!(this.installerPackageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(32, this.installerPackageName);
       }
       tcpuCores = this.appDiskUsedAll;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(33, tcpuCores);
       }
       tcpuCores = this.appDiskUsedPrivate;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(34, tcpuCores);
       }
       tcpuCores = this.appStorageOccupy;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(35, tcpuCores);
       }
       if (!(this.mac).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(36, this.mac);
       }
       tcpuCores = this.isVoiceOverOn;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(37, tcpuCores);
       }
       if (!(this.oaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(38, this.oaid);
       }
       tcpuCores = this.mediacodecVideoCaps;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(39, tcpuCores);
       }
       tcpuCores = this.hdrCaps;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(40, tcpuCores);
       }
       tcpuCores = this.appDiskSdGifshowUsed;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(41, tcpuCores);
       }
       if (!(this.fingerprint).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(42, this.fingerprint);
       }
       if (!(this.romVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(43, this.romVersion);
       }
       if (!(this.cpuPlatform).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(44, this.cpuPlatform);
       }
       tcpuCores = this.statusBarHeight;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(45, tcpuCores);
       }
       tcpuCores = this.navigationBarHeight;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(46, tcpuCores);
       }
       tcpuCores = this.isSupportArm64;
       if (tcpuCores != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(47, tcpuCores);
       }
       if (!(this.currentCaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(48, this.currentCaid);
       }
       if (!(this.lastCaid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(49, this.lastCaid);
       }
       if (!(this.caidVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(50, this.caidVersion);
       }
       if (Double.doubleToLongBits(this.xppi) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(51, this.xppi);
       }
       if (!(this.lastCaidVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(52, this.lastCaidVersion);
       }
       if (Double.doubleToLongBits(this.fontScale) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(53, this.fontScale);
       }
       if (!(this.diskPathSize).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(54, this.diskPathSize);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$DeviceStatEvent mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$DeviceStatEvent timeis;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.osVersion = p0.readString();
                break;
              case 18:
                this.model = p0.readString();
                break;
              case 24:
                this.cpuCores = p0.readUInt32();
                break;
              case 32:
                this.memory = p0.readUInt32();
                break;
              case '(':
                this.densityDpi = p0.readUInt32();
                break;
              case '0':
                this.screenWidth = p0.readUInt32();
                break;
              case '8':
                this.screenHeight = p0.readUInt32();
                break;
              case '@':
                this.batteryTemperature = p0.readUInt32();
                break;
              case 'I':
                this.cpuUsage = p0.readDouble();
                break;
              case 'Q':
                this.memoryUsage = p0.readDouble();
                break;
              case 'Y':
                this.battery = p0.readDouble();
                break;
              case '`':
                this.charging = p0.readBool();
                break;
              case 'i':
                this.volume = p0.readDouble();
                break;
              case 'q':
                this.brightness = p0.readDouble();
                break;
              case 'x':
                this.usingEarphone = p0.readBool();
                break;
              case 128:
                this.diskAll = p0.readUInt32();
                break;
              case 136:
                this.diskFree = p0.readUInt32();
                break;
              case 144:
                this.appDiskUsed = p0.readUInt32();
                break;
              case 154:
                this.imei = p0.readString();
                break;
              case 162:
                this.imsi = p0.readString();
                break;
              case 170:
                if (this.notificationSetting == null) {
                   this.notificationSetting = new ClientStat$NotificationSettingPackage();
                }
                p0.readMessage(this.notificationSetting);
                break;
              case 176:
                this.jailBroken = p0.readBool();
                break;
              case 186:
                this.jailBrokenDetail = p0.readString();
                break;
              case 192:
                this.gdb = p0.readBool();
                break;
              case 202:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 202);
                timeis = this.imeis;
                i2 = (timeis == null)? 0: timeis.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(timeis, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.imeis = stringArray;
                break;
              case 210:
                this.idfa = p0.readString();
                break;
              case 218:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 218);
                timeis = this.permissionAuthorizationStatus;
                i2 = (timeis == null)? 0: timeis.length;
                i = i + i2;
                ClientStat$SwitchAuthorizationStatusPackage[] switchAuthor = new ClientStat$SwitchAuthorizationStatusPackage[i];
                if (i2) {
                   System.arraycopy(timeis, i1, switchAuthor, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   switchAuthor[i2] = new ClientStat$SwitchAuthorizationStatusPackage();
                   p0.readMessage(switchAuthor[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                switchAuthor[i2] = new ClientStat$SwitchAuthorizationStatusPackage();
                p0.readMessage(switchAuthor[i2]);
                this.permissionAuthorizationStatus = switchAuthor;
                break;
              case 226:
                this.socName = p0.readString();
                break;
              case 234:
                this.umengId = p0.readString();
                break;
              case 242:
                this.shumengId = p0.readString();
                break;
              case 250:
                this.androidId = p0.readString();
                break;
              case 258:
                this.installerPackageName = p0.readString();
                break;
              case 264:
                this.appDiskUsedAll = p0.readUInt32();
                break;
              case 272:
                this.appDiskUsedPrivate = p0.readUInt32();
                break;
              case 282:
                if (this.appStorageOccupy == null) {
                   this.appStorageOccupy = new ClientStat$AppStorageUsagePackage();
                }
                p0.readMessage(this.appStorageOccupy);
                break;
              case 290:
                this.mac = p0.readString();
                break;
              case 296:
                this.isVoiceOverOn = p0.readBool();
                break;
              case 306:
                this.oaid = p0.readString();
                break;
              case 314:
                if (this.mediacodecVideoCaps == null) {
                   this.mediacodecVideoCaps = new ClientStat$MediaCodecVideoCapabilityPackage();
                }
                p0.readMessage(this.mediacodecVideoCaps);
                break;
              case 322:
                if (this.hdrCaps == null) {
                   this.hdrCaps = new ClientStat$HdrCapabilityPackage();
                }
                p0.readMessage(this.hdrCaps);
                break;
              case 328:
                this.appDiskSdGifshowUsed = p0.readUInt32();
                break;
              case 338:
                this.fingerprint = p0.readString();
                break;
              case 346:
                this.romVersion = p0.readString();
                break;
              case 354:
                this.cpuPlatform = p0.readString();
                break;
              case 360:
                this.statusBarHeight = p0.readUInt32();
                break;
              case 368:
                this.navigationBarHeight = p0.readUInt32();
                break;
              case 376:
                this.isSupportArm64 = p0.readBool();
                break;
              case 386:
                this.currentCaid = p0.readString();
                break;
              case 394:
                this.lastCaid = p0.readString();
                break;
              case 402:
                this.caidVersion = p0.readString();
                break;
              case 409:
                this.xppi = p0.readDouble();
                break;
              case 418:
                this.lastCaidVersion = p0.readString();
                break;
              case 425:
                this.fontScale = p0.readDouble();
                break;
              case 434:
                this.diskPathSize = p0.readString();
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
       String str = "";
       if (!(this.osVersion).equals(str)) {
          p0.writeString(1, this.osVersion);
       }
       if (!(this.model).equals(str)) {
          p0.writeString(2, this.model);
       }
       ClientStat$DeviceStatEvent tcpuCores = this.cpuCores;
       if (tcpuCores != null) {
          p0.writeUInt32(3, tcpuCores);
       }
       tcpuCores = this.memory;
       if (tcpuCores != null) {
          p0.writeUInt32(4, tcpuCores);
       }
       tcpuCores = this.densityDpi;
       if (tcpuCores != null) {
          p0.writeUInt32(5, tcpuCores);
       }
       tcpuCores = this.screenWidth;
       if (tcpuCores != null) {
          p0.writeUInt32(6, tcpuCores);
       }
       tcpuCores = this.screenHeight;
       if (tcpuCores != null) {
          p0.writeUInt32(7, tcpuCores);
       }
       tcpuCores = this.batteryTemperature;
       if (tcpuCores != null) {
          p0.writeUInt32(8, tcpuCores);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.cpuUsage) - Double.doubleToLongBits(d)) {
          p0.writeDouble(9, this.cpuUsage);
       }
       if (Double.doubleToLongBits(this.memoryUsage) - Double.doubleToLongBits(d)) {
          p0.writeDouble(10, this.memoryUsage);
       }
       if (Double.doubleToLongBits(this.battery) - Double.doubleToLongBits(d)) {
          p0.writeDouble(11, this.battery);
       }
       tcpuCores = this.charging;
       if (tcpuCores != null) {
          p0.writeBool(12, tcpuCores);
       }
       if (Double.doubleToLongBits(this.volume) - Double.doubleToLongBits(d)) {
          p0.writeDouble(13, this.volume);
       }
       if (Double.doubleToLongBits(this.brightness) - Double.doubleToLongBits(d)) {
          p0.writeDouble(14, this.brightness);
       }
       tcpuCores = this.usingEarphone;
       if (tcpuCores != null) {
          p0.writeBool(15, tcpuCores);
       }
       tcpuCores = this.diskAll;
       if (tcpuCores != null) {
          p0.writeUInt32(16, tcpuCores);
       }
       tcpuCores = this.diskFree;
       if (tcpuCores != null) {
          p0.writeUInt32(17, tcpuCores);
       }
       tcpuCores = this.appDiskUsed;
       if (tcpuCores != null) {
          p0.writeUInt32(18, tcpuCores);
       }
       if (!(this.imei).equals(str)) {
          p0.writeString(19, this.imei);
       }
       if (!(this.imsi).equals(str)) {
          p0.writeString(20, this.imsi);
       }
       tcpuCores = this.notificationSetting;
       if (tcpuCores != null) {
          p0.writeMessage(21, tcpuCores);
       }
       tcpuCores = this.jailBroken;
       if (tcpuCores != null) {
          p0.writeBool(22, tcpuCores);
       }
       if (!(this.jailBrokenDetail).equals(str)) {
          p0.writeString(23, this.jailBrokenDetail);
       }
       tcpuCores = this.gdb;
       if (tcpuCores != null) {
          p0.writeBool(24, tcpuCores);
       }
       tcpuCores = this.imeis;
       int i = 0;
       if (tcpuCores != null && tcpuCores.length > 0) {
          int i1 = 0;
          ClientStat$DeviceStatEvent timeis = this.imeis;
          while (i1 < timeis.length) {
             object oobject = timeis[i1];
             if (oobject != null) {
                p0.writeString(25, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.idfa).equals(str)) {
          p0.writeString(26, this.idfa);
       }
       tcpuCores = this.permissionAuthorizationStatus;
       if (tcpuCores != null && tcpuCores.length > 0) {
          tcpuCores = this.permissionAuthorizationStatus;
          while (i < tcpuCores.length) {
             object oobject1 = tcpuCores[i];
             if (oobject1 != null) {
                p0.writeMessage(27, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.socName).equals(str)) {
          p0.writeString(28, this.socName);
       }
       if (!(this.umengId).equals(str)) {
          p0.writeString(29, this.umengId);
       }
       if (!(this.shumengId).equals(str)) {
          p0.writeString(30, this.shumengId);
       }
       if (!(this.androidId).equals(str)) {
          p0.writeString(31, this.androidId);
       }
       if (!(this.installerPackageName).equals(str)) {
          p0.writeString(32, this.installerPackageName);
       }
       tcpuCores = this.appDiskUsedAll;
       if (tcpuCores != null) {
          p0.writeUInt32(33, tcpuCores);
       }
       tcpuCores = this.appDiskUsedPrivate;
       if (tcpuCores != null) {
          p0.writeUInt32(34, tcpuCores);
       }
       tcpuCores = this.appStorageOccupy;
       if (tcpuCores != null) {
          p0.writeMessage(35, tcpuCores);
       }
       if (!(this.mac).equals(str)) {
          p0.writeString(36, this.mac);
       }
       tcpuCores = this.isVoiceOverOn;
       if (tcpuCores != null) {
          p0.writeBool(37, tcpuCores);
       }
       if (!(this.oaid).equals(str)) {
          p0.writeString(38, this.oaid);
       }
       tcpuCores = this.mediacodecVideoCaps;
       if (tcpuCores != null) {
          p0.writeMessage(39, tcpuCores);
       }
       tcpuCores = this.hdrCaps;
       if (tcpuCores != null) {
          p0.writeMessage(40, tcpuCores);
       }
       tcpuCores = this.appDiskSdGifshowUsed;
       if (tcpuCores != null) {
          p0.writeUInt32(41, tcpuCores);
       }
       if (!(this.fingerprint).equals(str)) {
          p0.writeString(42, this.fingerprint);
       }
       if (!(this.romVersion).equals(str)) {
          p0.writeString(43, this.romVersion);
       }
       if (!(this.cpuPlatform).equals(str)) {
          p0.writeString(44, this.cpuPlatform);
       }
       tcpuCores = this.statusBarHeight;
       if (tcpuCores != null) {
          p0.writeUInt32(45, tcpuCores);
       }
       tcpuCores = this.navigationBarHeight;
       if (tcpuCores != null) {
          p0.writeUInt32(46, tcpuCores);
       }
       tcpuCores = this.isSupportArm64;
       if (tcpuCores != null) {
          p0.writeBool(47, tcpuCores);
       }
       if (!(this.currentCaid).equals(str)) {
          p0.writeString(48, this.currentCaid);
       }
       if (!(this.lastCaid).equals(str)) {
          p0.writeString(49, this.lastCaid);
       }
       if (!(this.caidVersion).equals(str)) {
          p0.writeString(50, this.caidVersion);
       }
       if (Double.doubleToLongBits(this.xppi) - Double.doubleToLongBits(d)) {
          p0.writeDouble(51, this.xppi);
       }
       if (!(this.lastCaidVersion).equals(str)) {
          p0.writeString(52, this.lastCaidVersion);
       }
       if (Double.doubleToLongBits(this.fontScale) - Double.doubleToLongBits(d)) {
          p0.writeDouble(53, this.fontScale);
       }
       if (!(this.diskPathSize).equals(str)) {
          p0.writeString(54, this.diskPathSize);
       }
       super.writeTo(p0);
       return;
    }
}
