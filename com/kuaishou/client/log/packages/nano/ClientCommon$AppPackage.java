package com.kuaishou.client.log.packages.nano.ClientCommon$AppPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.packages.nano.ClientBase$PerformanceMonitoringStatus;

public final class ClientCommon$AppPackage extends MessageNano	// class@00078c
{
    public int abi;
    public int androidOs;
    public int buildType;
    public String channel;
    public String container;
    public String hotfixPatchVersion;
    public String language;
    public String newOc;
    public String packageName;
    public ClientBase$PerformanceMonitoringStatus performanceMonitoringStatus;
    public int platform;
    public int product;
    public String robustInfo;
    public int versionCode;
    public String versionName;
    public static ClientCommon$AppPackage[] _emptyArray;

    public void ClientCommon$AppPackage(){
       super();
       this.clear();
    }
    public static ClientCommon$AppPackage[] emptyArray(){
       if (ClientCommon$AppPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommon$AppPackage._emptyArray == null) {
             ClientCommon$AppPackage[] uAppPackageA = new ClientCommon$AppPackage[0];
             ClientCommon$AppPackage._emptyArray = uAppPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommon$AppPackage._emptyArray;
    }
    public static ClientCommon$AppPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommon$AppPackage().mergeFrom(p0);
    }
    public static ClientCommon$AppPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommon$AppPackage(), p0);
    }
    public ClientCommon$AppPackage clear(){
       this.product = 0;
       this.platform = 0;
       this.language = "";
       this.channel = "";
       this.versionName = "";
       this.versionCode = 0;
       this.packageName = "";
       this.hotfixPatchVersion = "";
       this.buildType = 0;
       this.performanceMonitoringStatus = null;
       this.container = "";
       this.newOc = "";
       this.abi = 0;
       this.robustInfo = "";
       this.androidOs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientCommon$AppPackage tproduct = this.product;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tproduct);
       }
       tproduct = this.platform;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tproduct);
       }
       String str = "";
       if (!(this.language).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.language);
       }
       if (!(this.channel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.channel);
       }
       if (!(this.versionName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.versionName);
       }
       tproduct = this.versionCode;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tproduct);
       }
       if (!(this.packageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.packageName);
       }
       if (!(this.hotfixPatchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.hotfixPatchVersion);
       }
       tproduct = this.buildType;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tproduct);
       }
       tproduct = this.performanceMonitoringStatus;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tproduct);
       }
       if (!(this.container).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.container);
       }
       if (!(this.newOc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.newOc);
       }
       tproduct = this.abi;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, tproduct);
       }
       if (!(this.robustInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.robustInfo);
       }
       tproduct = this.androidOs;
       if (tproduct != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(15, tproduct);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommon$AppPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 8:
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
                    case 9:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case 1:
                      break;
                    default:
                }
                this.product = i;
                break;
              case 16:
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
                    case 9:
                    case 10:
                    case 11:
                    case 1:
                      break;
                    default:
                }
                this.platform = i;
                break;
              case 26:
                this.language = p0.readString();
                break;
              case '"':
                this.channel = p0.readString();
                break;
              case '*':
                this.versionName = p0.readString();
                break;
              case '0':
                this.versionCode = p0.readInt32();
                break;
              case ':':
                this.packageName = p0.readString();
                break;
              case 'B':
                this.hotfixPatchVersion = p0.readString();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.buildType = i;
                }
                break;
              case 'R':
                if (this.performanceMonitoringStatus == null) {
                   this.performanceMonitoringStatus = new ClientBase$PerformanceMonitoringStatus();
                }
                p0.readMessage(this.performanceMonitoringStatus);
                break;
              case 'Z':
                this.container = p0.readString();
                break;
              case 'b':
                this.newOc = p0.readString();
                break;
              case 'h':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.abi = i;
                }
                break;
              case 'r':
                this.robustInfo = p0.readString();
                break;
              case 'x':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.androidOs = i;
                }
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
       ClientCommon$AppPackage tproduct = this.product;
       if (tproduct != null) {
          p0.writeInt32(1, tproduct);
       }
       tproduct = this.platform;
       if (tproduct != null) {
          p0.writeInt32(2, tproduct);
       }
       String str = "";
       if (!(this.language).equals(str)) {
          p0.writeString(3, this.language);
       }
       if (!(this.channel).equals(str)) {
          p0.writeString(4, this.channel);
       }
       if (!(this.versionName).equals(str)) {
          p0.writeString(5, this.versionName);
       }
       tproduct = this.versionCode;
       if (tproduct != null) {
          p0.writeInt32(6, tproduct);
       }
       if (!(this.packageName).equals(str)) {
          p0.writeString(7, this.packageName);
       }
       if (!(this.hotfixPatchVersion).equals(str)) {
          p0.writeString(8, this.hotfixPatchVersion);
       }
       tproduct = this.buildType;
       if (tproduct != null) {
          p0.writeInt32(9, tproduct);
       }
       tproduct = this.performanceMonitoringStatus;
       if (tproduct != null) {
          p0.writeMessage(10, tproduct);
       }
       if (!(this.container).equals(str)) {
          p0.writeString(11, this.container);
       }
       if (!(this.newOc).equals(str)) {
          p0.writeString(12, this.newOc);
       }
       tproduct = this.abi;
       if (tproduct != null) {
          p0.writeInt32(13, tproduct);
       }
       if (!(this.robustInfo).equals(str)) {
          p0.writeString(14, this.robustInfo);
       }
       tproduct = this.androidOs;
       if (tproduct != null) {
          p0.writeInt32(15, tproduct);
       }
       super.writeTo(p0);
       return;
    }
}
