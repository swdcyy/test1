package com.kuaishou.client.log.stat.packages.nano.ClientStat$RawStatPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class ClientStat$RawStatPackage extends MessageNano	// class@00141f
{
    public byte[] activityLaunchEvent;
    public byte[] aegonConnectionStatEvent;
    public byte[] aegonRequestStatEvent;
    public byte[] allocStatsEvent;
    public byte[] anchorQosSliceStatEvent;
    public byte[] anchorStatEvent;
    public byte[] anchorVoipQosSliceStatEvent;
    public byte[] apiCostDetailStatEvent;
    public byte[] apiRequestStatEvent;
    public byte[] appUsageStatEvent;
    public byte[] applicationStatEvent;
    public byte[] audienceQosSliceStatEvent;
    public byte[] audienceStatEvent;
    public byte[] baseStationStatEvent;
    public byte[] batteryStatEvent;
    public byte[] bridgeCenterStatEvent;
    public byte[] cdnResourceLoadStatEvent;
    public byte[] customProtoEvent;
    public byte[] customStatEvent;
    public byte[] deviceMappingEvent;
    public byte[] deviceStatEvent;
    public byte[] editorSdkExportTaskStatEvent;
    public byte[] editorSdkQosStatEvent;
    public byte[] editorSdkStatEvent;
    public byte[] feedExposureStatEvent;
    public byte[] feedPhotoPlayStatEvent;
    public byte[] frameRateStatEvent;
    public byte[] googlePayStatEvent;
    public byte[] heartBeatEvent;
    public byte[] httpdnsStatEvent;
    public byte[] idcSpeedStatEvent;
    public byte[] imVideoStatEvent;
    public byte[] imageDisplayStatEvent;
    public byte[] imageLoadStatEvent;
    public byte[] invalidRegionEvent;
    public byte[] ioMonitorStatEvent;
    public byte[] ioOverviewStatEvent;
    public byte[] keyConfigStatEvent;
    public byte[] liveAdaptiveQosStatEvent;
    public byte[] liveChatStatEvent;
    public byte[] livePlayBizStatEvent;
    public byte[] liveSocketStatEvent;
    public byte[] liveStreamAdaptiveQosStatEvent;
    public byte[] localMusicStatEvent;
    public byte[] mainThreadBlockEvent;
    public byte[] networkDiagnosisStatEvent;
    public byte[] networkStatEvent;
    public byte[] openedAppStatEvent;
    public byte[] performanceMonitorStatus;
    public byte[] performanceMonitoringEvent;
    public byte[] photoDownloadStatEvent;
    public byte[] rerankStatEvent;
    public byte[] roundTripStatEvent;
    public byte[] shareStatEvent;
    public byte[] storyStatEvent;
    public byte[] temperatureStatEvent;
    public byte[] templateStatEvent;
    public byte[] videoQosStatEvent;
    public byte[] videoStatEvent;
    public byte[] webLoadStatEvent;
    public byte[] wifiStatEvent;
    public static ClientStat$RawStatPackage[] _emptyArray;

    public void ClientStat$RawStatPackage(){
       super();
       this.clear();
    }
    public static ClientStat$RawStatPackage[] emptyArray(){
       if (ClientStat$RawStatPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$RawStatPackage._emptyArray == null) {
             ClientStat$RawStatPackage[] rawStatPacka = new ClientStat$RawStatPackage[0];
             ClientStat$RawStatPackage._emptyArray = rawStatPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$RawStatPackage._emptyArray;
    }
    public static ClientStat$RawStatPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$RawStatPackage().mergeFrom(p0);
    }
    public static ClientStat$RawStatPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$RawStatPackage(), p0);
    }
    public ClientStat$RawStatPackage clear(){
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       this.deviceStatEvent = eMPTY_BYTES;
       this.applicationStatEvent = eMPTY_BYTES;
       this.audienceStatEvent = eMPTY_BYTES;
       this.anchorStatEvent = eMPTY_BYTES;
       this.roundTripStatEvent = eMPTY_BYTES;
       this.apiRequestStatEvent = eMPTY_BYTES;
       this.wifiStatEvent = eMPTY_BYTES;
       this.baseStationStatEvent = eMPTY_BYTES;
       this.liveChatStatEvent = eMPTY_BYTES;
       this.videoStatEvent = eMPTY_BYTES;
       this.appUsageStatEvent = eMPTY_BYTES;
       this.idcSpeedStatEvent = eMPTY_BYTES;
       this.apiCostDetailStatEvent = eMPTY_BYTES;
       this.audienceQosSliceStatEvent = eMPTY_BYTES;
       this.imageLoadStatEvent = eMPTY_BYTES;
       this.cdnResourceLoadStatEvent = eMPTY_BYTES;
       this.anchorQosSliceStatEvent = eMPTY_BYTES;
       this.customStatEvent = eMPTY_BYTES;
       this.shareStatEvent = eMPTY_BYTES;
       this.openedAppStatEvent = eMPTY_BYTES;
       this.anchorVoipQosSliceStatEvent = eMPTY_BYTES;
       this.frameRateStatEvent = eMPTY_BYTES;
       this.activityLaunchEvent = eMPTY_BYTES;
       this.mainThreadBlockEvent = eMPTY_BYTES;
       this.localMusicStatEvent = eMPTY_BYTES;
       this.allocStatsEvent = eMPTY_BYTES;
       this.liveAdaptiveQosStatEvent = eMPTY_BYTES;
       this.liveStreamAdaptiveQosStatEvent = eMPTY_BYTES;
       this.feedPhotoPlayStatEvent = eMPTY_BYTES;
       this.networkDiagnosisStatEvent = eMPTY_BYTES;
       this.networkStatEvent = eMPTY_BYTES;
       this.performanceMonitoringEvent = eMPTY_BYTES;
       this.editorSdkStatEvent = eMPTY_BYTES;
       this.feedExposureStatEvent = eMPTY_BYTES;
       this.livePlayBizStatEvent = eMPTY_BYTES;
       this.googlePayStatEvent = eMPTY_BYTES;
       this.performanceMonitorStatus = eMPTY_BYTES;
       this.batteryStatEvent = eMPTY_BYTES;
       this.temperatureStatEvent = eMPTY_BYTES;
       this.editorSdkExportTaskStatEvent = eMPTY_BYTES;
       this.webLoadStatEvent = eMPTY_BYTES;
       this.customProtoEvent = eMPTY_BYTES;
       this.storyStatEvent = eMPTY_BYTES;
       this.editorSdkQosStatEvent = eMPTY_BYTES;
       this.liveSocketStatEvent = eMPTY_BYTES;
       this.videoQosStatEvent = eMPTY_BYTES;
       this.keyConfigStatEvent = eMPTY_BYTES;
       this.imVideoStatEvent = eMPTY_BYTES;
       this.photoDownloadStatEvent = eMPTY_BYTES;
       this.imageDisplayStatEvent = eMPTY_BYTES;
       this.templateStatEvent = eMPTY_BYTES;
       this.invalidRegionEvent = eMPTY_BYTES;
       this.deviceMappingEvent = eMPTY_BYTES;
       this.heartBeatEvent = eMPTY_BYTES;
       this.aegonRequestStatEvent = eMPTY_BYTES;
       this.bridgeCenterStatEvent = eMPTY_BYTES;
       this.ioOverviewStatEvent = eMPTY_BYTES;
       this.ioMonitorStatEvent = eMPTY_BYTES;
       this.rerankStatEvent = eMPTY_BYTES;
       this.httpdnsStatEvent = eMPTY_BYTES;
       this.aegonConnectionStatEvent = eMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       if (!Arrays.equals(this.deviceStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(1, this.deviceStatEvent);
       }
       if (!Arrays.equals(this.applicationStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.applicationStatEvent);
       }
       if (!Arrays.equals(this.audienceStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.audienceStatEvent);
       }
       if (!Arrays.equals(this.anchorStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(4, this.anchorStatEvent);
       }
       if (!Arrays.equals(this.roundTripStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(5, this.roundTripStatEvent);
       }
       if (!Arrays.equals(this.apiRequestStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(6, this.apiRequestStatEvent);
       }
       if (!Arrays.equals(this.wifiStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(7, this.wifiStatEvent);
       }
       if (!Arrays.equals(this.baseStationStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(8, this.baseStationStatEvent);
       }
       if (!Arrays.equals(this.liveChatStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(9, this.liveChatStatEvent);
       }
       if (!Arrays.equals(this.videoStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(10, this.videoStatEvent);
       }
       if (!Arrays.equals(this.appUsageStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(11, this.appUsageStatEvent);
       }
       if (!Arrays.equals(this.idcSpeedStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(12, this.idcSpeedStatEvent);
       }
       if (!Arrays.equals(this.apiCostDetailStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(13, this.apiCostDetailStatEvent);
       }
       if (!Arrays.equals(this.audienceQosSliceStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(14, this.audienceQosSliceStatEvent);
       }
       if (!Arrays.equals(this.imageLoadStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(15, this.imageLoadStatEvent);
       }
       if (!Arrays.equals(this.cdnResourceLoadStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(16, this.cdnResourceLoadStatEvent);
       }
       if (!Arrays.equals(this.anchorQosSliceStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(17, this.anchorQosSliceStatEvent);
       }
       if (!Arrays.equals(this.customStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(18, this.customStatEvent);
       }
       if (!Arrays.equals(this.shareStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(19, this.shareStatEvent);
       }
       if (!Arrays.equals(this.openedAppStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(20, this.openedAppStatEvent);
       }
       if (!Arrays.equals(this.anchorVoipQosSliceStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(21, this.anchorVoipQosSliceStatEvent);
       }
       if (!Arrays.equals(this.frameRateStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(22, this.frameRateStatEvent);
       }
       if (!Arrays.equals(this.activityLaunchEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(23, this.activityLaunchEvent);
       }
       if (!Arrays.equals(this.mainThreadBlockEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(24, this.mainThreadBlockEvent);
       }
       if (!Arrays.equals(this.localMusicStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(25, this.localMusicStatEvent);
       }
       if (!Arrays.equals(this.allocStatsEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(26, this.allocStatsEvent);
       }
       if (!Arrays.equals(this.liveAdaptiveQosStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(27, this.liveAdaptiveQosStatEvent);
       }
       if (!Arrays.equals(this.liveStreamAdaptiveQosStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(28, this.liveStreamAdaptiveQosStatEvent);
       }
       if (!Arrays.equals(this.feedPhotoPlayStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(29, this.feedPhotoPlayStatEvent);
       }
       if (!Arrays.equals(this.networkDiagnosisStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(30, this.networkDiagnosisStatEvent);
       }
       if (!Arrays.equals(this.networkStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(31, this.networkStatEvent);
       }
       if (!Arrays.equals(this.performanceMonitoringEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(32, this.performanceMonitoringEvent);
       }
       if (!Arrays.equals(this.editorSdkStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(33, this.editorSdkStatEvent);
       }
       if (!Arrays.equals(this.feedExposureStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(34, this.feedExposureStatEvent);
       }
       if (!Arrays.equals(this.livePlayBizStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(35, this.livePlayBizStatEvent);
       }
       if (!Arrays.equals(this.googlePayStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(36, this.googlePayStatEvent);
       }
       if (!Arrays.equals(this.performanceMonitorStatus, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(37, this.performanceMonitorStatus);
       }
       if (!Arrays.equals(this.batteryStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(38, this.batteryStatEvent);
       }
       if (!Arrays.equals(this.temperatureStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(39, this.temperatureStatEvent);
       }
       if (!Arrays.equals(this.editorSdkExportTaskStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(40, this.editorSdkExportTaskStatEvent);
       }
       if (!Arrays.equals(this.webLoadStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(41, this.webLoadStatEvent);
       }
       if (!Arrays.equals(this.customProtoEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(42, this.customProtoEvent);
       }
       if (!Arrays.equals(this.storyStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(43, this.storyStatEvent);
       }
       if (!Arrays.equals(this.editorSdkQosStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(44, this.editorSdkQosStatEvent);
       }
       if (!Arrays.equals(this.liveSocketStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(45, this.liveSocketStatEvent);
       }
       if (!Arrays.equals(this.videoQosStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(46, this.videoQosStatEvent);
       }
       if (!Arrays.equals(this.keyConfigStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(47, this.keyConfigStatEvent);
       }
       if (!Arrays.equals(this.imVideoStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(48, this.imVideoStatEvent);
       }
       if (!Arrays.equals(this.photoDownloadStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(49, this.photoDownloadStatEvent);
       }
       if (!Arrays.equals(this.imageDisplayStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(50, this.imageDisplayStatEvent);
       }
       if (!Arrays.equals(this.templateStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(51, this.templateStatEvent);
       }
       if (!Arrays.equals(this.invalidRegionEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(52, this.invalidRegionEvent);
       }
       if (!Arrays.equals(this.deviceMappingEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(53, this.deviceMappingEvent);
       }
       if (!Arrays.equals(this.heartBeatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(54, this.heartBeatEvent);
       }
       if (!Arrays.equals(this.aegonRequestStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(55, this.aegonRequestStatEvent);
       }
       if (!Arrays.equals(this.bridgeCenterStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(56, this.bridgeCenterStatEvent);
       }
       if (!Arrays.equals(this.ioOverviewStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(57, this.ioOverviewStatEvent);
       }
       if (!Arrays.equals(this.ioMonitorStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(58, this.ioMonitorStatEvent);
       }
       if (!Arrays.equals(this.rerankStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(59, this.rerankStatEvent);
       }
       if (!Arrays.equals(this.httpdnsStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(60, this.httpdnsStatEvent);
       }
       if (!Arrays.equals(this.aegonConnectionStatEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(61, this.aegonConnectionStatEvent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$RawStatPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.deviceStatEvent = p0.readBytes();
                break;
              case 18:
                this.applicationStatEvent = p0.readBytes();
                break;
              case 26:
                this.audienceStatEvent = p0.readBytes();
                break;
              case '"':
                this.anchorStatEvent = p0.readBytes();
                break;
              case '*':
                this.roundTripStatEvent = p0.readBytes();
                break;
              case '2':
                this.apiRequestStatEvent = p0.readBytes();
                break;
              case ':':
                this.wifiStatEvent = p0.readBytes();
                break;
              case 'B':
                this.baseStationStatEvent = p0.readBytes();
                break;
              case 'J':
                this.liveChatStatEvent = p0.readBytes();
                break;
              case 'R':
                this.videoStatEvent = p0.readBytes();
                break;
              case 'Z':
                this.appUsageStatEvent = p0.readBytes();
                break;
              case 'b':
                this.idcSpeedStatEvent = p0.readBytes();
                break;
              case 'j':
                this.apiCostDetailStatEvent = p0.readBytes();
                break;
              case 'r':
                this.audienceQosSliceStatEvent = p0.readBytes();
                break;
              case 'z':
                this.imageLoadStatEvent = p0.readBytes();
                break;
              case 130:
                this.cdnResourceLoadStatEvent = p0.readBytes();
                break;
              case 138:
                this.anchorQosSliceStatEvent = p0.readBytes();
                break;
              case 146:
                this.customStatEvent = p0.readBytes();
                break;
              case 154:
                this.shareStatEvent = p0.readBytes();
                break;
              case 162:
                this.openedAppStatEvent = p0.readBytes();
                break;
              case 170:
                this.anchorVoipQosSliceStatEvent = p0.readBytes();
                break;
              case 178:
                this.frameRateStatEvent = p0.readBytes();
                break;
              case 186:
                this.activityLaunchEvent = p0.readBytes();
                break;
              case 194:
                this.mainThreadBlockEvent = p0.readBytes();
                break;
              case 202:
                this.localMusicStatEvent = p0.readBytes();
                break;
              case 210:
                this.allocStatsEvent = p0.readBytes();
                break;
              case 218:
                this.liveAdaptiveQosStatEvent = p0.readBytes();
                break;
              case 226:
                this.liveStreamAdaptiveQosStatEvent = p0.readBytes();
                break;
              case 234:
                this.feedPhotoPlayStatEvent = p0.readBytes();
                break;
              case 242:
                this.networkDiagnosisStatEvent = p0.readBytes();
                break;
              case 250:
                this.networkStatEvent = p0.readBytes();
                break;
              case 258:
                this.performanceMonitoringEvent = p0.readBytes();
                break;
              case 266:
                this.editorSdkStatEvent = p0.readBytes();
                break;
              case 274:
                this.feedExposureStatEvent = p0.readBytes();
                break;
              case 282:
                this.livePlayBizStatEvent = p0.readBytes();
                break;
              case 290:
                this.googlePayStatEvent = p0.readBytes();
                break;
              case 298:
                this.performanceMonitorStatus = p0.readBytes();
                break;
              case 306:
                this.batteryStatEvent = p0.readBytes();
                break;
              case 314:
                this.temperatureStatEvent = p0.readBytes();
                break;
              case 322:
                this.editorSdkExportTaskStatEvent = p0.readBytes();
                break;
              case 330:
                this.webLoadStatEvent = p0.readBytes();
                break;
              case 338:
                this.customProtoEvent = p0.readBytes();
                break;
              case 346:
                this.storyStatEvent = p0.readBytes();
                break;
              case 354:
                this.editorSdkQosStatEvent = p0.readBytes();
                break;
              case 362:
                this.liveSocketStatEvent = p0.readBytes();
                break;
              case 370:
                this.videoQosStatEvent = p0.readBytes();
                break;
              case 378:
                this.keyConfigStatEvent = p0.readBytes();
                break;
              case 386:
                this.imVideoStatEvent = p0.readBytes();
                break;
              case 394:
                this.photoDownloadStatEvent = p0.readBytes();
                break;
              case 402:
                this.imageDisplayStatEvent = p0.readBytes();
                break;
              case 410:
                this.templateStatEvent = p0.readBytes();
                break;
              case 418:
                this.invalidRegionEvent = p0.readBytes();
                break;
              case 426:
                this.deviceMappingEvent = p0.readBytes();
                break;
              case 434:
                this.heartBeatEvent = p0.readBytes();
                break;
              case 442:
                this.aegonRequestStatEvent = p0.readBytes();
                break;
              case 450:
                this.bridgeCenterStatEvent = p0.readBytes();
                break;
              case 458:
                this.ioOverviewStatEvent = p0.readBytes();
                break;
              case 466:
                this.ioMonitorStatEvent = p0.readBytes();
                break;
              case 474:
                this.rerankStatEvent = p0.readBytes();
                break;
              case 482:
                this.httpdnsStatEvent = p0.readBytes();
                break;
              case 490:
                this.aegonConnectionStatEvent = p0.readBytes();
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
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       if (!Arrays.equals(this.deviceStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(1, this.deviceStatEvent);
       }
       if (!Arrays.equals(this.applicationStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(2, this.applicationStatEvent);
       }
       if (!Arrays.equals(this.audienceStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(3, this.audienceStatEvent);
       }
       if (!Arrays.equals(this.anchorStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(4, this.anchorStatEvent);
       }
       if (!Arrays.equals(this.roundTripStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(5, this.roundTripStatEvent);
       }
       if (!Arrays.equals(this.apiRequestStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(6, this.apiRequestStatEvent);
       }
       if (!Arrays.equals(this.wifiStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(7, this.wifiStatEvent);
       }
       if (!Arrays.equals(this.baseStationStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(8, this.baseStationStatEvent);
       }
       if (!Arrays.equals(this.liveChatStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(9, this.liveChatStatEvent);
       }
       if (!Arrays.equals(this.videoStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(10, this.videoStatEvent);
       }
       if (!Arrays.equals(this.appUsageStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(11, this.appUsageStatEvent);
       }
       if (!Arrays.equals(this.idcSpeedStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(12, this.idcSpeedStatEvent);
       }
       if (!Arrays.equals(this.apiCostDetailStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(13, this.apiCostDetailStatEvent);
       }
       if (!Arrays.equals(this.audienceQosSliceStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(14, this.audienceQosSliceStatEvent);
       }
       if (!Arrays.equals(this.imageLoadStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(15, this.imageLoadStatEvent);
       }
       if (!Arrays.equals(this.cdnResourceLoadStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(16, this.cdnResourceLoadStatEvent);
       }
       if (!Arrays.equals(this.anchorQosSliceStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(17, this.anchorQosSliceStatEvent);
       }
       if (!Arrays.equals(this.customStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(18, this.customStatEvent);
       }
       if (!Arrays.equals(this.shareStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(19, this.shareStatEvent);
       }
       if (!Arrays.equals(this.openedAppStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(20, this.openedAppStatEvent);
       }
       if (!Arrays.equals(this.anchorVoipQosSliceStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(21, this.anchorVoipQosSliceStatEvent);
       }
       if (!Arrays.equals(this.frameRateStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(22, this.frameRateStatEvent);
       }
       if (!Arrays.equals(this.activityLaunchEvent, eMPTY_BYTES)) {
          p0.writeBytes(23, this.activityLaunchEvent);
       }
       if (!Arrays.equals(this.mainThreadBlockEvent, eMPTY_BYTES)) {
          p0.writeBytes(24, this.mainThreadBlockEvent);
       }
       if (!Arrays.equals(this.localMusicStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(25, this.localMusicStatEvent);
       }
       if (!Arrays.equals(this.allocStatsEvent, eMPTY_BYTES)) {
          p0.writeBytes(26, this.allocStatsEvent);
       }
       if (!Arrays.equals(this.liveAdaptiveQosStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(27, this.liveAdaptiveQosStatEvent);
       }
       if (!Arrays.equals(this.liveStreamAdaptiveQosStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(28, this.liveStreamAdaptiveQosStatEvent);
       }
       if (!Arrays.equals(this.feedPhotoPlayStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(29, this.feedPhotoPlayStatEvent);
       }
       if (!Arrays.equals(this.networkDiagnosisStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(30, this.networkDiagnosisStatEvent);
       }
       if (!Arrays.equals(this.networkStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(31, this.networkStatEvent);
       }
       if (!Arrays.equals(this.performanceMonitoringEvent, eMPTY_BYTES)) {
          p0.writeBytes(32, this.performanceMonitoringEvent);
       }
       if (!Arrays.equals(this.editorSdkStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(33, this.editorSdkStatEvent);
       }
       if (!Arrays.equals(this.feedExposureStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(34, this.feedExposureStatEvent);
       }
       if (!Arrays.equals(this.livePlayBizStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(35, this.livePlayBizStatEvent);
       }
       if (!Arrays.equals(this.googlePayStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(36, this.googlePayStatEvent);
       }
       if (!Arrays.equals(this.performanceMonitorStatus, eMPTY_BYTES)) {
          p0.writeBytes(37, this.performanceMonitorStatus);
       }
       if (!Arrays.equals(this.batteryStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(38, this.batteryStatEvent);
       }
       if (!Arrays.equals(this.temperatureStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(39, this.temperatureStatEvent);
       }
       if (!Arrays.equals(this.editorSdkExportTaskStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(40, this.editorSdkExportTaskStatEvent);
       }
       if (!Arrays.equals(this.webLoadStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(41, this.webLoadStatEvent);
       }
       if (!Arrays.equals(this.customProtoEvent, eMPTY_BYTES)) {
          p0.writeBytes(42, this.customProtoEvent);
       }
       if (!Arrays.equals(this.storyStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(43, this.storyStatEvent);
       }
       if (!Arrays.equals(this.editorSdkQosStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(44, this.editorSdkQosStatEvent);
       }
       if (!Arrays.equals(this.liveSocketStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(45, this.liveSocketStatEvent);
       }
       if (!Arrays.equals(this.videoQosStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(46, this.videoQosStatEvent);
       }
       if (!Arrays.equals(this.keyConfigStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(47, this.keyConfigStatEvent);
       }
       if (!Arrays.equals(this.imVideoStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(48, this.imVideoStatEvent);
       }
       if (!Arrays.equals(this.photoDownloadStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(49, this.photoDownloadStatEvent);
       }
       if (!Arrays.equals(this.imageDisplayStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(50, this.imageDisplayStatEvent);
       }
       if (!Arrays.equals(this.templateStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(51, this.templateStatEvent);
       }
       if (!Arrays.equals(this.invalidRegionEvent, eMPTY_BYTES)) {
          p0.writeBytes(52, this.invalidRegionEvent);
       }
       if (!Arrays.equals(this.deviceMappingEvent, eMPTY_BYTES)) {
          p0.writeBytes(53, this.deviceMappingEvent);
       }
       if (!Arrays.equals(this.heartBeatEvent, eMPTY_BYTES)) {
          p0.writeBytes(54, this.heartBeatEvent);
       }
       if (!Arrays.equals(this.aegonRequestStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(55, this.aegonRequestStatEvent);
       }
       if (!Arrays.equals(this.bridgeCenterStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(56, this.bridgeCenterStatEvent);
       }
       if (!Arrays.equals(this.ioOverviewStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(57, this.ioOverviewStatEvent);
       }
       if (!Arrays.equals(this.ioMonitorStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(58, this.ioMonitorStatEvent);
       }
       if (!Arrays.equals(this.rerankStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(59, this.rerankStatEvent);
       }
       if (!Arrays.equals(this.httpdnsStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(60, this.httpdnsStatEvent);
       }
       if (!Arrays.equals(this.aegonConnectionStatEvent, eMPTY_BYTES)) {
          p0.writeBytes(61, this.aegonConnectionStatEvent);
       }
       super.writeTo(p0);
       return;
    }
}
