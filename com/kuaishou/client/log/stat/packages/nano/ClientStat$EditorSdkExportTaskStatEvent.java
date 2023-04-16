package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkExportTaskStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerDecoderStats;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerRenderStats;
import java.lang.Double;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.System;

public final class ClientStat$EditorSdkExportTaskStatEvent extends MessageNano	// class@0007be
{
    public double audioPreprocessCostSec;
    public double decodeCostSec;
    public ClientStat$EditorSdkPreviewPlayerDecoderStats[] decoderStats;
    public int droppedFrameCount;
    public String editorMeta;
    public String editorSdkVersion;
    public double encodeCostSec;
    public String encoderType;
    public double exportDurationSec;
    public String exportFormat;
    public double exportFps;
    public int exportHeight;
    public int exportVideoBitrate;
    public int exportWidth;
    public double fmp4RemuxCostSec;
    public double fmp4WriteFileCostSec;
    public double interCost;
    public double intraCost;
    public boolean kwaiPhotoMovie;
    public double psnr;
    public boolean reTranscode;
    public double renderCostSec;
    public boolean renderPassThrough;
    public ClientStat$EditorSdkPreviewPlayerRenderStats[] renderStats;
    public boolean skipTranscode;
    public double startupCostSec;
    public String statsSessionId;
    public double totalCostSec;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientStat$EditorSdkExportTaskStatEvent[] _emptyArray;

    public void ClientStat$EditorSdkExportTaskStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkExportTaskStatEvent[] emptyArray(){
       if (ClientStat$EditorSdkExportTaskStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkExportTaskStatEvent._emptyArray == null) {
             ClientStat$EditorSdkExportTaskStatEvent[] uEditorSdkEx = new ClientStat$EditorSdkExportTaskStatEvent[0];
             ClientStat$EditorSdkExportTaskStatEvent._emptyArray = uEditorSdkEx;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkExportTaskStatEvent._emptyArray;
    }
    public static ClientStat$EditorSdkExportTaskStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkExportTaskStatEvent().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkExportTaskStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkExportTaskStatEvent(), p0);
    }
    public ClientStat$EditorSdkExportTaskStatEvent clear(){
       this.totalCostSec = 0;
       this.startupCostSec = 0;
       this.encodeCostSec = 0;
       this.decodeCostSec = 0;
       this.renderCostSec = 0;
       this.exportDurationSec = 0;
       this.exportFps = 0;
       this.exportVideoBitrate = 0;
       this.exportFormat = "";
       this.exportWidth = 0;
       this.exportHeight = 0;
       this.skipTranscode = false;
       this.renderPassThrough = false;
       this.droppedFrameCount = 0;
       this.encoderType = "";
       this.audioPreprocessCostSec = 0;
       this.fmp4WriteFileCostSec = 0;
       this.fmp4RemuxCostSec = 0;
       this.decoderStats = ClientStat$EditorSdkPreviewPlayerDecoderStats.emptyArray();
       this.renderStats = ClientStat$EditorSdkPreviewPlayerRenderStats.emptyArray();
       this.statsSessionId = "";
       this.urlPackage = null;
       this.psnr = 0;
       this.intraCost = 0;
       this.interCost = 0;
       this.reTranscode = false;
       this.kwaiPhotoMovie = false;
       this.editorSdkVersion = "";
       this.editorMeta = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       double d = 0;
       if (Double.doubleToLongBits(this.totalCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(1, this.totalCostSec);
       }
       if (Double.doubleToLongBits(this.startupCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.startupCostSec);
       }
       if (Double.doubleToLongBits(this.encodeCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(3, this.encodeCostSec);
       }
       if (Double.doubleToLongBits(this.decodeCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.decodeCostSec);
       }
       if (Double.doubleToLongBits(this.renderCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(5, this.renderCostSec);
       }
       if (Double.doubleToLongBits(this.exportDurationSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(6, this.exportDurationSec);
       }
       if (Double.doubleToLongBits(this.exportFps) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(7, this.exportFps);
       }
       ClientStat$EditorSdkExportTaskStatEvent texportVideo = this.exportVideoBitrate;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, texportVideo);
       }
       String str = "";
       if (!(this.exportFormat).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.exportFormat);
       }
       texportVideo = this.exportWidth;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, texportVideo);
       }
       texportVideo = this.exportHeight;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(11, texportVideo);
       }
       texportVideo = this.skipTranscode;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, texportVideo);
       }
       texportVideo = this.renderPassThrough;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, texportVideo);
       }
       texportVideo = this.droppedFrameCount;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(14, texportVideo);
       }
       if (!(this.encoderType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.encoderType);
       }
       if (Double.doubleToLongBits(this.audioPreprocessCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(16, this.audioPreprocessCostSec);
       }
       if (Double.doubleToLongBits(this.fmp4WriteFileCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(17, this.fmp4WriteFileCostSec);
       }
       if (Double.doubleToLongBits(this.fmp4RemuxCostSec) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(18, this.fmp4RemuxCostSec);
       }
       texportVideo = this.decoderStats;
       int i1 = 0;
       if (texportVideo != null && texportVideo.length > 0) {
          int i2 = 0;
          ClientStat$EditorSdkExportTaskStatEvent tdecoderStat = this.decoderStats;
          while (i2 < tdecoderStat.length) {
             object oobject = tdecoderStat[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(19, oobject);
             }
             i2 = i2 + 1;
          }
       }
       texportVideo = this.renderStats;
       if (texportVideo != null && texportVideo.length > 0) {
          texportVideo = this.renderStats;
          while (i1 < texportVideo.length) {
             object oobject1 = texportVideo[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(20, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.statsSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(21, this.statsSessionId);
       }
       texportVideo = this.urlPackage;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, texportVideo);
       }
       if (Double.doubleToLongBits(this.psnr) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(23, this.psnr);
       }
       if (Double.doubleToLongBits(this.intraCost) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(24, this.intraCost);
       }
       if (Double.doubleToLongBits(this.interCost) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(25, this.interCost);
       }
       texportVideo = this.reTranscode;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(26, texportVideo);
       }
       texportVideo = this.kwaiPhotoMovie;
       if (texportVideo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(27, texportVideo);
       }
       if (!(this.editorSdkVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(28, this.editorSdkVersion);
       }
       if (!(this.editorMeta).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(29, this.editorMeta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkExportTaskStatEvent mergeFrom(CodedInputByteBufferNano p0){
       ClientStat$EditorSdkExportTaskStatEvent tdecoderStat;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 9:
                this.totalCostSec = p0.readDouble();
                break;
              case 17:
                this.startupCostSec = p0.readDouble();
                break;
              case 25:
                this.encodeCostSec = p0.readDouble();
                break;
              case '!':
                this.decodeCostSec = p0.readDouble();
                break;
              case ')':
                this.renderCostSec = p0.readDouble();
                break;
              case '1':
                this.exportDurationSec = p0.readDouble();
                break;
              case '9':
                this.exportFps = p0.readDouble();
                break;
              case '@':
                this.exportVideoBitrate = p0.readUInt32();
                break;
              case 'J':
                this.exportFormat = p0.readString();
                break;
              case 'P':
                this.exportWidth = p0.readUInt32();
                break;
              case 'X':
                this.exportHeight = p0.readUInt32();
                break;
              case '`':
                this.skipTranscode = p0.readBool();
                break;
              case 'h':
                this.renderPassThrough = p0.readBool();
                break;
              case 'p':
                this.droppedFrameCount = p0.readUInt32();
                break;
              case 'z':
                this.encoderType = p0.readString();
                break;
              case 129:
                this.audioPreprocessCostSec = p0.readDouble();
                break;
              case 137:
                this.fmp4WriteFileCostSec = p0.readDouble();
                break;
              case 145:
                this.fmp4RemuxCostSec = p0.readDouble();
                break;
              case 154:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 154);
                tdecoderStat = this.decoderStats;
                i2 = (tdecoderStat == null)? 0: tdecoderStat.length;
                i = i + i2;
                ClientStat$EditorSdkPreviewPlayerDecoderStats[] uEditorSdkPr = new ClientStat$EditorSdkPreviewPlayerDecoderStats[i];
                if (i2) {
                   System.arraycopy(tdecoderStat, i1, uEditorSdkPr, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEditorSdkPr[i2] = new ClientStat$EditorSdkPreviewPlayerDecoderStats();
                   p0.readMessage(uEditorSdkPr[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEditorSdkPr[i2] = new ClientStat$EditorSdkPreviewPlayerDecoderStats();
                p0.readMessage(uEditorSdkPr[i2]);
                this.decoderStats = uEditorSdkPr;
                break;
              case 162:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 162);
                tdecoderStat = this.renderStats;
                i2 = (tdecoderStat == null)? 0: tdecoderStat.length;
                i = i + i2;
                ClientStat$EditorSdkPreviewPlayerRenderStats[] uEditorSdkPr1 = new ClientStat$EditorSdkPreviewPlayerRenderStats[i];
                if (i2) {
                   System.arraycopy(tdecoderStat, i1, uEditorSdkPr1, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uEditorSdkPr1[i2] = new ClientStat$EditorSdkPreviewPlayerRenderStats();
                   p0.readMessage(uEditorSdkPr1[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uEditorSdkPr1[i2] = new ClientStat$EditorSdkPreviewPlayerRenderStats();
                p0.readMessage(uEditorSdkPr1[i2]);
                this.renderStats = uEditorSdkPr1;
                break;
              case 170:
                this.statsSessionId = p0.readString();
                break;
              case 178:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 185:
                this.psnr = p0.readDouble();
                break;
              case 193:
                this.intraCost = p0.readDouble();
                break;
              case 201:
                this.interCost = p0.readDouble();
                break;
              case 208:
                this.reTranscode = p0.readBool();
                break;
              case 216:
                this.kwaiPhotoMovie = p0.readBool();
                break;
              case 226:
                this.editorSdkVersion = p0.readString();
                break;
              case 234:
                this.editorMeta = p0.readString();
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
       double d = 0;
       if (Double.doubleToLongBits(this.totalCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(1, this.totalCostSec);
       }
       if (Double.doubleToLongBits(this.startupCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(2, this.startupCostSec);
       }
       if (Double.doubleToLongBits(this.encodeCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(3, this.encodeCostSec);
       }
       if (Double.doubleToLongBits(this.decodeCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(4, this.decodeCostSec);
       }
       if (Double.doubleToLongBits(this.renderCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(5, this.renderCostSec);
       }
       if (Double.doubleToLongBits(this.exportDurationSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(6, this.exportDurationSec);
       }
       if (Double.doubleToLongBits(this.exportFps) - Double.doubleToLongBits(d)) {
          p0.writeDouble(7, this.exportFps);
       }
       ClientStat$EditorSdkExportTaskStatEvent texportVideo = this.exportVideoBitrate;
       if (texportVideo != null) {
          p0.writeUInt32(8, texportVideo);
       }
       String str = "";
       if (!(this.exportFormat).equals(str)) {
          p0.writeString(9, this.exportFormat);
       }
       texportVideo = this.exportWidth;
       if (texportVideo != null) {
          p0.writeUInt32(10, texportVideo);
       }
       texportVideo = this.exportHeight;
       if (texportVideo != null) {
          p0.writeUInt32(11, texportVideo);
       }
       texportVideo = this.skipTranscode;
       if (texportVideo != null) {
          p0.writeBool(12, texportVideo);
       }
       texportVideo = this.renderPassThrough;
       if (texportVideo != null) {
          p0.writeBool(13, texportVideo);
       }
       texportVideo = this.droppedFrameCount;
       if (texportVideo != null) {
          p0.writeUInt32(14, texportVideo);
       }
       if (!(this.encoderType).equals(str)) {
          p0.writeString(15, this.encoderType);
       }
       if (Double.doubleToLongBits(this.audioPreprocessCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(16, this.audioPreprocessCostSec);
       }
       if (Double.doubleToLongBits(this.fmp4WriteFileCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(17, this.fmp4WriteFileCostSec);
       }
       if (Double.doubleToLongBits(this.fmp4RemuxCostSec) - Double.doubleToLongBits(d)) {
          p0.writeDouble(18, this.fmp4RemuxCostSec);
       }
       texportVideo = this.decoderStats;
       int i = 0;
       if (texportVideo != null && texportVideo.length > 0) {
          int i1 = 0;
          ClientStat$EditorSdkExportTaskStatEvent tdecoderStat = this.decoderStats;
          while (i1 < tdecoderStat.length) {
             object oobject = tdecoderStat[i1];
             if (oobject != null) {
                p0.writeMessage(19, oobject);
             }
             i1 = i1 + 1;
          }
       }
       texportVideo = this.renderStats;
       if (texportVideo != null && texportVideo.length > 0) {
          texportVideo = this.renderStats;
          while (i < texportVideo.length) {
             object oobject1 = texportVideo[i];
             if (oobject1 != null) {
                p0.writeMessage(20, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.statsSessionId).equals(str)) {
          p0.writeString(21, this.statsSessionId);
       }
       texportVideo = this.urlPackage;
       if (texportVideo != null) {
          p0.writeMessage(22, texportVideo);
       }
       if (Double.doubleToLongBits(this.psnr) - Double.doubleToLongBits(d)) {
          p0.writeDouble(23, this.psnr);
       }
       if (Double.doubleToLongBits(this.intraCost) - Double.doubleToLongBits(d)) {
          p0.writeDouble(24, this.intraCost);
       }
       if (Double.doubleToLongBits(this.interCost) - Double.doubleToLongBits(d)) {
          p0.writeDouble(25, this.interCost);
       }
       texportVideo = this.reTranscode;
       if (texportVideo != null) {
          p0.writeBool(26, texportVideo);
       }
       texportVideo = this.kwaiPhotoMovie;
       if (texportVideo != null) {
          p0.writeBool(27, texportVideo);
       }
       if (!(this.editorSdkVersion).equals(str)) {
          p0.writeString(28, this.editorSdkVersion);
       }
       if (!(this.editorMeta).equals(str)) {
          p0.writeString(29, this.editorMeta);
       }
       super.writeTo(p0);
       return;
    }
}
