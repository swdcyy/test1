package com.kuaishou.client.log.stat.packages.nano.ClientStat$MediaCodecVideoCapability;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$MediaCodecVideoCapability extends MessageNano	// class@00140a
{
    public double fhdLandscapeMaxFps;
    public double fhdPortraitMaxFps;
    public double hdLandscapeMaxFps;
    public double hdPortraitMaxFps;
    public boolean isSupportAdaptive;
    public boolean isSupportTunnel;
    public int maxHeight;
    public int maxInstance;
    public int maxWidth;
    public double uhdLandscapeMaxFps;
    public double uhdPortraitMaxFps;
    public static ClientStat$MediaCodecVideoCapability[] _emptyArray;

    public void ClientStat$MediaCodecVideoCapability(){
       super();
       this.clear();
    }
    public static ClientStat$MediaCodecVideoCapability[] emptyArray(){
       if (ClientStat$MediaCodecVideoCapability._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$MediaCodecVideoCapability._emptyArray == null) {
             ClientStat$MediaCodecVideoCapability[] mediaCodecVi = new ClientStat$MediaCodecVideoCapability[0];
             ClientStat$MediaCodecVideoCapability._emptyArray = mediaCodecVi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$MediaCodecVideoCapability._emptyArray;
    }
    public static ClientStat$MediaCodecVideoCapability parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$MediaCodecVideoCapability().mergeFrom(p0);
    }
    public static ClientStat$MediaCodecVideoCapability parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$MediaCodecVideoCapability(), p0);
    }
    public ClientStat$MediaCodecVideoCapability clear(){
       this.maxWidth = 0;
       this.maxHeight = 0;
       this.hdLandscapeMaxFps = 0;
       this.hdPortraitMaxFps = 0;
       this.fhdLandscapeMaxFps = 0;
       this.fhdPortraitMaxFps = 0;
       this.uhdLandscapeMaxFps = 0;
       this.uhdPortraitMaxFps = 0;
       this.maxInstance = 0;
       this.isSupportAdaptive = false;
       this.isSupportTunnel = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$MediaCodecVideoCapability tmaxWidth = this.maxWidth;
       if (tmaxWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tmaxWidth);
       }
       tmaxWidth = this.maxHeight;
       if (tmaxWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tmaxWidth);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.hdLandscapeMaxFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(3, this.hdLandscapeMaxFps);
       }
       if (Double.doubleToLongBits(this.hdPortraitMaxFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.hdPortraitMaxFps);
       }
       if (Double.doubleToLongBits(this.fhdLandscapeMaxFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(5, this.fhdLandscapeMaxFps);
       }
       if (Double.doubleToLongBits(this.fhdPortraitMaxFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(6, this.fhdPortraitMaxFps);
       }
       if (Double.doubleToLongBits(this.uhdLandscapeMaxFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(7, this.uhdLandscapeMaxFps);
       }
       if (Double.doubleToLongBits(this.uhdPortraitMaxFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(8, this.uhdPortraitMaxFps);
       }
       tmaxWidth = this.maxInstance;
       if (tmaxWidth != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tmaxWidth);
       }
       tmaxWidth = this.isSupportAdaptive;
       if (tmaxWidth != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tmaxWidth);
       }
       tmaxWidth = this.isSupportTunnel;
       if (tmaxWidth != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tmaxWidth);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$MediaCodecVideoCapability mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.maxWidth = p0.readUInt32();
                break;
              case 16:
                this.maxHeight = p0.readUInt32();
                break;
              case 25:
                this.hdLandscapeMaxFps = p0.readDouble();
                break;
              case '!':
                this.hdPortraitMaxFps = p0.readDouble();
                break;
              case ')':
                this.fhdLandscapeMaxFps = p0.readDouble();
                break;
              case '1':
                this.fhdPortraitMaxFps = p0.readDouble();
                break;
              case '9':
                this.uhdLandscapeMaxFps = p0.readDouble();
                break;
              case 'A':
                this.uhdPortraitMaxFps = p0.readDouble();
                break;
              case 'H':
                this.maxInstance = p0.readUInt32();
                break;
              case 'P':
                this.isSupportAdaptive = p0.readBool();
                break;
              case 'X':
                this.isSupportTunnel = p0.readBool();
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
       ClientStat$MediaCodecVideoCapability tmaxWidth = this.maxWidth;
       if (tmaxWidth != null) {
          p0.writeUInt32(1, tmaxWidth);
       }
       tmaxWidth = this.maxHeight;
       if (tmaxWidth != null) {
          p0.writeUInt32(2, tmaxWidth);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.hdLandscapeMaxFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(3, this.hdLandscapeMaxFps);
       }
       if (Double.doubleToLongBits(this.hdPortraitMaxFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(4, this.hdPortraitMaxFps);
       }
       if (Double.doubleToLongBits(this.fhdLandscapeMaxFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(5, this.fhdLandscapeMaxFps);
       }
       if (Double.doubleToLongBits(this.fhdPortraitMaxFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(6, this.fhdPortraitMaxFps);
       }
       if (Double.doubleToLongBits(this.uhdLandscapeMaxFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(7, this.uhdLandscapeMaxFps);
       }
       if (Double.doubleToLongBits(this.uhdPortraitMaxFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(8, this.uhdPortraitMaxFps);
       }
       tmaxWidth = this.maxInstance;
       if (tmaxWidth != null) {
          p0.writeUInt32(9, tmaxWidth);
       }
       tmaxWidth = this.isSupportAdaptive;
       if (tmaxWidth != null) {
          p0.writeBool(10, tmaxWidth);
       }
       tmaxWidth = this.isSupportTunnel;
       if (tmaxWidth != null) {
          p0.writeBool(11, tmaxWidth);
       }
       super.writeTo(p0);
       return;
    }
}
