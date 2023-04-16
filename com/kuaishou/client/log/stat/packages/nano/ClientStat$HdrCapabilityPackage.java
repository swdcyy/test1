package com.kuaishou.client.log.stat.packages.nano.ClientStat$HdrCapabilityPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$HdrCapabilityPackage extends MessageNano	// class@0013e1
{
    public String codecSupportedHdrTypes;
    public String displaySupportedHdrTypes;
    public boolean isCodecSupportHdr10;
    public boolean isCodecSupportHdrdolby;
    public boolean isCodecSupportHdrvp9;
    public boolean isDisplaySupportHdr10;
    public double maxAvgLuminance;
    public double maxLuminance;
    public double minLuminance;
    public static ClientStat$HdrCapabilityPackage[] _emptyArray;

    public void ClientStat$HdrCapabilityPackage(){
       super();
       this.clear();
    }
    public static ClientStat$HdrCapabilityPackage[] emptyArray(){
       if (ClientStat$HdrCapabilityPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$HdrCapabilityPackage._emptyArray == null) {
             ClientStat$HdrCapabilityPackage[] hdrCapabilit = new ClientStat$HdrCapabilityPackage[0];
             ClientStat$HdrCapabilityPackage._emptyArray = hdrCapabilit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$HdrCapabilityPackage._emptyArray;
    }
    public static ClientStat$HdrCapabilityPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$HdrCapabilityPackage().mergeFrom(p0);
    }
    public static ClientStat$HdrCapabilityPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$HdrCapabilityPackage(), p0);
    }
    public ClientStat$HdrCapabilityPackage clear(){
       this.isCodecSupportHdr10 = false;
       this.isCodecSupportHdrvp9 = false;
       this.isCodecSupportHdrdolby = false;
       this.codecSupportedHdrTypes = "";
       this.isDisplaySupportHdr10 = false;
       this.maxAvgLuminance = 0;
       this.maxLuminance = 0;
       this.minLuminance = 0;
       this.displaySupportedHdrTypes = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$HdrCapabilityPackage tisCodecSupp = this.isCodecSupportHdr10;
       if (tisCodecSupp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisCodecSupp);
       }
       tisCodecSupp = this.isCodecSupportHdrvp9;
       if (tisCodecSupp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisCodecSupp);
       }
       tisCodecSupp = this.isCodecSupportHdrdolby;
       if (tisCodecSupp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tisCodecSupp);
       }
       String str = "";
       if (!(this.codecSupportedHdrTypes).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.codecSupportedHdrTypes);
       }
       tisCodecSupp = this.isDisplaySupportHdr10;
       if (tisCodecSupp != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tisCodecSupp);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.maxAvgLuminance) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(6, this.maxAvgLuminance);
       }
       if (Double.doubleToLongBits(this.maxLuminance) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(7, this.maxLuminance);
       }
       if (Double.doubleToLongBits(this.minLuminance) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(8, this.minLuminance);
       }
       if (!(this.displaySupportedHdrTypes).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.displaySupportedHdrTypes);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$HdrCapabilityPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 49) {
                            if (i != 57) {
                               if (i != 65) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.displaySupportedHdrTypes = p0.readString();
                                  }
                               }else {
                                  this.minLuminance = p0.readDouble();
                               }
                            }else {
                               this.maxLuminance = p0.readDouble();
                            }
                         }else {
                            this.maxAvgLuminance = p0.readDouble();
                         }
                      }else {
                         this.isDisplaySupportHdr10 = p0.readBool();
                      }
                   }else {
                      this.codecSupportedHdrTypes = p0.readString();
                   }
                }else {
                   this.isCodecSupportHdrdolby = p0.readBool();
                }
             }else {
                this.isCodecSupportHdrvp9 = p0.readBool();
             }
          }else {
             this.isCodecSupportHdr10 = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$HdrCapabilityPackage tisCodecSupp = this.isCodecSupportHdr10;
       if (tisCodecSupp != null) {
          p0.writeBool(1, tisCodecSupp);
       }
       tisCodecSupp = this.isCodecSupportHdrvp9;
       if (tisCodecSupp != null) {
          p0.writeBool(2, tisCodecSupp);
       }
       tisCodecSupp = this.isCodecSupportHdrdolby;
       if (tisCodecSupp != null) {
          p0.writeBool(3, tisCodecSupp);
       }
       String str = "";
       if (!(this.codecSupportedHdrTypes).equals(str)) {
          p0.writeString(4, this.codecSupportedHdrTypes);
       }
       tisCodecSupp = this.isDisplaySupportHdr10;
       if (tisCodecSupp != null) {
          p0.writeBool(5, tisCodecSupp);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.maxAvgLuminance) - Double.doubleToLongBits(d)) {
          p0.writeDouble(6, this.maxAvgLuminance);
       }
       if (Double.doubleToLongBits(this.maxLuminance) - Double.doubleToLongBits(d)) {
          p0.writeDouble(7, this.maxLuminance);
       }
       if (Double.doubleToLongBits(this.minLuminance) - Double.doubleToLongBits(d)) {
          p0.writeDouble(8, this.minLuminance);
       }
       if (!(this.displaySupportedHdrTypes).equals(str)) {
          p0.writeString(9, this.displaySupportedHdrTypes);
       }
       super.writeTo(p0);
       return;
    }
}
