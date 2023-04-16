package com.kuaishou.client.log.stat.packages.nano.ClientStat$AppStorageUsagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$AppStorageUsagePackage extends MessageNano	// class@0013ad
{
    public int dataDedicatedDirOccupy;
    public int dataStorageOccupy;
    public String descDataDedicatedDirOccupy;
    public String descExternalDataDedicatedDirOccupy;
    public String descSdcardStorageOccupy;
    public int externalDataDedicatedDirOccupy;
    public int externalDataStorageOccupy;
    public int sdcardStorageOccupy;
    public int systemCacheStorageOccupy;
    public int totalStorageOccupy;
    public static ClientStat$AppStorageUsagePackage[] _emptyArray;

    public void ClientStat$AppStorageUsagePackage(){
       super();
       this.clear();
    }
    public static ClientStat$AppStorageUsagePackage[] emptyArray(){
       if (ClientStat$AppStorageUsagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$AppStorageUsagePackage._emptyArray == null) {
             ClientStat$AppStorageUsagePackage[] uAppStorageU = new ClientStat$AppStorageUsagePackage[0];
             ClientStat$AppStorageUsagePackage._emptyArray = uAppStorageU;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$AppStorageUsagePackage._emptyArray;
    }
    public static ClientStat$AppStorageUsagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$AppStorageUsagePackage().mergeFrom(p0);
    }
    public static ClientStat$AppStorageUsagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$AppStorageUsagePackage(), p0);
    }
    public ClientStat$AppStorageUsagePackage clear(){
       this.systemCacheStorageOccupy = 0;
       this.dataStorageOccupy = 0;
       this.dataDedicatedDirOccupy = 0;
       this.sdcardStorageOccupy = 0;
       this.externalDataStorageOccupy = 0;
       this.externalDataDedicatedDirOccupy = 0;
       this.totalStorageOccupy = 0;
       this.descDataDedicatedDirOccupy = "";
       this.descSdcardStorageOccupy = "";
       this.descExternalDataDedicatedDirOccupy = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$AppStorageUsagePackage tsystemCache = this.systemCacheStorageOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tsystemCache);
       }
       tsystemCache = this.dataStorageOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tsystemCache);
       }
       tsystemCache = this.dataDedicatedDirOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tsystemCache);
       }
       tsystemCache = this.sdcardStorageOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tsystemCache);
       }
       tsystemCache = this.externalDataStorageOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tsystemCache);
       }
       tsystemCache = this.externalDataDedicatedDirOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tsystemCache);
       }
       tsystemCache = this.totalStorageOccupy;
       if (tsystemCache != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tsystemCache);
       }
       String str = "";
       if (!(this.descDataDedicatedDirOccupy).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.descDataDedicatedDirOccupy);
       }
       if (!(this.descSdcardStorageOccupy).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.descSdcardStorageOccupy);
       }
       if (!(this.descExternalDataDedicatedDirOccupy).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.descExternalDataDedicatedDirOccupy);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$AppStorageUsagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.systemCacheStorageOccupy = p0.readUInt32();
                break;
              case 16:
                this.dataStorageOccupy = p0.readUInt32();
                break;
              case 24:
                this.dataDedicatedDirOccupy = p0.readUInt32();
                break;
              case 32:
                this.sdcardStorageOccupy = p0.readUInt32();
                break;
              case '(':
                this.externalDataStorageOccupy = p0.readUInt32();
                break;
              case '0':
                this.externalDataDedicatedDirOccupy = p0.readUInt32();
                break;
              case '8':
                this.totalStorageOccupy = p0.readUInt32();
                break;
              case 'B':
                this.descDataDedicatedDirOccupy = p0.readString();
                break;
              case 'J':
                this.descSdcardStorageOccupy = p0.readString();
                break;
              case 'R':
                this.descExternalDataDedicatedDirOccupy = p0.readString();
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
       ClientStat$AppStorageUsagePackage tsystemCache = this.systemCacheStorageOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(1, tsystemCache);
       }
       tsystemCache = this.dataStorageOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(2, tsystemCache);
       }
       tsystemCache = this.dataDedicatedDirOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(3, tsystemCache);
       }
       tsystemCache = this.sdcardStorageOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(4, tsystemCache);
       }
       tsystemCache = this.externalDataStorageOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(5, tsystemCache);
       }
       tsystemCache = this.externalDataDedicatedDirOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(6, tsystemCache);
       }
       tsystemCache = this.totalStorageOccupy;
       if (tsystemCache != null) {
          p0.writeUInt32(7, tsystemCache);
       }
       String str = "";
       if (!(this.descDataDedicatedDirOccupy).equals(str)) {
          p0.writeString(8, this.descDataDedicatedDirOccupy);
       }
       if (!(this.descSdcardStorageOccupy).equals(str)) {
          p0.writeString(9, this.descSdcardStorageOccupy);
       }
       if (!(this.descExternalDataDedicatedDirOccupy).equals(str)) {
          p0.writeString(10, this.descExternalDataDedicatedDirOccupy);
       }
       super.writeTo(p0);
       return;
    }
}
