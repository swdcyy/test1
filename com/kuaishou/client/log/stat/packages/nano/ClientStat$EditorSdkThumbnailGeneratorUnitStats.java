package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkThumbnailGeneratorUnitStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$EditorSdkThumbnailGeneratorUnitStats extends MessageNano	// class@0013dd
{
    public boolean cacheOn;
    public String decoderConfig;
    public String decoderType;
    public int height;
    public double thumbnailAvgMs;
    public double thumbnailPercentile50Ms;
    public double thumbnailPercentile5Ms;
    public double thumbnailPercentile95Ms;
    public int width;
    public static ClientStat$EditorSdkThumbnailGeneratorUnitStats[] _emptyArray;

    public void ClientStat$EditorSdkThumbnailGeneratorUnitStats(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkThumbnailGeneratorUnitStats[] emptyArray(){
       if (ClientStat$EditorSdkThumbnailGeneratorUnitStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkThumbnailGeneratorUnitStats._emptyArray == null) {
             ClientStat$EditorSdkThumbnailGeneratorUnitStats[] uEditorSdkTh = new ClientStat$EditorSdkThumbnailGeneratorUnitStats[0];
             ClientStat$EditorSdkThumbnailGeneratorUnitStats._emptyArray = uEditorSdkTh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkThumbnailGeneratorUnitStats._emptyArray;
    }
    public static ClientStat$EditorSdkThumbnailGeneratorUnitStats parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkThumbnailGeneratorUnitStats().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkThumbnailGeneratorUnitStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkThumbnailGeneratorUnitStats(), p0);
    }
    public ClientStat$EditorSdkThumbnailGeneratorUnitStats clear(){
       this.thumbnailAvgMs = 0;
       this.thumbnailPercentile5Ms = 0;
       this.thumbnailPercentile50Ms = 0;
       this.thumbnailPercentile95Ms = 0;
       this.width = 0;
       this.height = 0;
       this.decoderType = "";
       this.cacheOn = false;
       this.decoderConfig = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       double d = 0;
       if (Double.doubleToLongBits(this.thumbnailAvgMs) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(1, this.thumbnailAvgMs);
       }
       if (Double.doubleToLongBits(this.thumbnailPercentile5Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.thumbnailPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.thumbnailPercentile50Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(3, this.thumbnailPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.thumbnailPercentile95Ms) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.thumbnailPercentile95Ms);
       }
       ClientStat$EditorSdkThumbnailGeneratorUnitStats twidth = this.width;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, twidth);
       }
       String str = "";
       if (!(this.decoderType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.decoderType);
       }
       twidth = this.cacheOn;
       if (twidth != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, twidth);
       }
       if (!(this.decoderConfig).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.decoderConfig);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkThumbnailGeneratorUnitStats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 9) {
             if (i != 17) {
                if (i != 25) {
                   if (i != 33) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 66) {
                               if (i != 72) {
                                  if (i != 82) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.decoderConfig = p0.readString();
                                  }
                               }else {
                                  this.cacheOn = p0.readBool();
                               }
                            }else {
                               this.decoderType = p0.readString();
                            }
                         }else {
                            this.height = p0.readUInt32();
                         }
                      }else {
                         this.width = p0.readUInt32();
                      }
                   }else {
                      this.thumbnailPercentile95Ms = p0.readDouble();
                   }
                }else {
                   this.thumbnailPercentile50Ms = p0.readDouble();
                }
             }else {
                this.thumbnailPercentile5Ms = p0.readDouble();
             }
          }else {
             this.thumbnailAvgMs = p0.readDouble();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       double d = 0;
       if (Double.doubleToLongBits(this.thumbnailAvgMs) - Double.doubleToLongBits(d)) {
          p0.writeDouble(1, this.thumbnailAvgMs);
       }
       if (Double.doubleToLongBits(this.thumbnailPercentile5Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(2, this.thumbnailPercentile5Ms);
       }
       if (Double.doubleToLongBits(this.thumbnailPercentile50Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(3, this.thumbnailPercentile50Ms);
       }
       if (Double.doubleToLongBits(this.thumbnailPercentile95Ms) - Double.doubleToLongBits(d)) {
          p0.writeDouble(4, this.thumbnailPercentile95Ms);
       }
       ClientStat$EditorSdkThumbnailGeneratorUnitStats twidth = this.width;
       if (twidth != null) {
          p0.writeUInt32(5, twidth);
       }
       twidth = this.height;
       if (twidth != null) {
          p0.writeUInt32(6, twidth);
       }
       String str = "";
       if (!(this.decoderType).equals(str)) {
          p0.writeString(8, this.decoderType);
       }
       twidth = this.cacheOn;
       if (twidth != null) {
          p0.writeBool(9, twidth);
       }
       if (!(this.decoderConfig).equals(str)) {
          p0.writeString(10, this.decoderConfig);
       }
       super.writeTo(p0);
       return;
    }
}
