package com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AegonConnectionStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$RerankStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IoMonitorStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IoOverviewStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BridgeCenterEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AegonRequestStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HeartBeatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$DeviceIdMappingEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$InvalidRegionEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$TemplateStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ImageDisplayStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PhotoDownloadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ImVideoStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$KeyConfigStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoQosStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkQosStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StoryStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomProtoEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkExportTaskStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BatteryStatEvent;
import com.kuaishou.client.log.packages.nano.ClientBase$PerformanceMonitoringStatus;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$GooglePayStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LivePlayBizStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$PerformanceMonitoringEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$NetworkStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveStreamAdaptiveQosStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LocalMusicStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$MainThreadBlockEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ActivityLaunchEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$FrameRateStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorVoipQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$OpenedAppStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ImageLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceQoSSliceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApiCostDetailStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IdcSpeedStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AppUsageStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$LiveChatStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$RoundTripStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AnchorStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AudienceStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$ApplicationStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$DeviceStatEvent;

public final class ClientStat$StatPackage extends MessageNano	// class@000800
{
    public ClientStat$ActivityLaunchEvent activityLaunchEvent;
    public ClientStat$AegonConnectionStatEvent aegonConnectionStatEvent;
    public ClientStat$AegonRequestStatEvent aegonRequestStatEvent;
    public ClientStat$AnchorStatEvent anchorStatEvent;
    public ClientStat$AnchorVoipQoSSliceStatEvent anchorVoipQosSliceStatEvent;
    public ClientStat$ApiCostDetailStatEvent apiCostDetailStatEvent;
    public ClientStat$AppUsageStatEvent appUsageStatEvent;
    public ClientStat$ApplicationStatEvent applicationStatEvent;
    public ClientStat$AudienceQoSSliceStatEvent audienceQosSliceStatEvent;
    public ClientStat$AudienceStatEvent audienceStatEvent;
    public ClientStat$BaseStationStatEvent baseStationStatEvent;
    public ClientStat$BatteryStatEvent batteryStatEvent;
    public ClientStat$BridgeCenterEvent bridgeCenterStatEvent;
    public ClientStat$CdnResourceLoadStatEvent cdnResourceLoadStatEvent;
    public ClientStat$CustomProtoEvent customProtoEvent;
    public ClientStat$CustomStatEvent customStatEvent;
    public ClientStat$DeviceIdMappingEvent deviceMappingEvent;
    public ClientStat$DeviceStatEvent deviceStatEvent;
    public ClientStat$EditorSdkExportTaskStatEvent editorSdkExportTaskStatEvent;
    public ClientStat$EditorSdkQosStatEvent editorSdkQosStatEvent;
    public ClientStat$EditorSdkStatEvent editorSdkStatEvent;
    public ClientStat$FrameRateStatEvent frameRateStatEvent;
    public ClientStat$GooglePayStatEvent googlePayStatEvent;
    public ClientStat$HeartBeatEvent heartBeatEvent;
    public ClientStat$HttpdnsStatEvent httpdnsStatEvent;
    public ClientStat$IdcSpeedStatEvent idcSpeedStatEvent;
    public ClientStat$ImVideoStatEvent imVideoStatEvent;
    public ClientStat$ImageDisplayStatEvent imageDisplayStatEvent;
    public ClientStat$ImageLoadStatEvent imageLoadStatEvent;
    public ClientStat$InvalidRegionEvent invalidRegionEvent;
    public ClientStat$IoMonitorStatEvent ioMonitorStatEvent;
    public ClientStat$IoOverviewStatEvent ioOverviewStatEvent;
    public ClientStat$KeyConfigStatEvent keyConfigStatEvent;
    public ClientStat$LiveChatStatEvent liveChatStatEvent;
    public ClientStat$LivePlayBizStatEvent livePlayBizStatEvent;
    public ClientStat$LiveStreamAdaptiveQosStatEvent liveStreamAdaptiveQosStatEvent;
    public ClientStat$LocalMusicStatEvent localMusicStatEvent;
    public ClientStat$MainThreadBlockEvent mainThreadBlockEvent;
    public ClientStat$NetworkStatEvent networkStatEvent;
    public ClientStat$OpenedAppStatEvent openedAppStatEvent;
    public ClientBase$PerformanceMonitoringStatus performanceMonitorStatus;
    public ClientStat$PerformanceMonitoringEvent performanceMonitoringEvent;
    public ClientStat$PhotoDownloadStatEvent photoDownloadStatEvent;
    public ClientStat$RerankStatEvent rerankStatEvent;
    public ClientStat$RoundTripStatEvent roundTripStatEvent;
    public ClientStat$StoryStatEvent storyStatEvent;
    public ClientStat$TemplateStatEvent templateStatEvent;
    public ClientStat$VideoQosStatEvent videoQosStatEvent;
    public ClientStat$VideoStatEvent videoStatEvent;
    public ClientStat$WiFiStatEvent wifiStatEvent;
    public static ClientStat$StatPackage[] _emptyArray;

    public void ClientStat$StatPackage(){
       super();
       this.clear();
    }
    public static ClientStat$StatPackage[] emptyArray(){
       if (ClientStat$StatPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$StatPackage._emptyArray == null) {
             ClientStat$StatPackage[] statPackageA = new ClientStat$StatPackage[0];
             ClientStat$StatPackage._emptyArray = statPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$StatPackage._emptyArray;
    }
    public static ClientStat$StatPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$StatPackage().mergeFrom(p0);
    }
    public static ClientStat$StatPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$StatPackage(), p0);
    }
    public ClientStat$StatPackage clear(){
       this.deviceStatEvent = null;
       this.applicationStatEvent = null;
       this.audienceStatEvent = null;
       this.anchorStatEvent = null;
       this.roundTripStatEvent = null;
       this.wifiStatEvent = null;
       this.baseStationStatEvent = null;
       this.liveChatStatEvent = null;
       this.videoStatEvent = null;
       this.appUsageStatEvent = null;
       this.idcSpeedStatEvent = null;
       this.apiCostDetailStatEvent = null;
       this.audienceQosSliceStatEvent = null;
       this.imageLoadStatEvent = null;
       this.cdnResourceLoadStatEvent = null;
       this.customStatEvent = null;
       this.openedAppStatEvent = null;
       this.anchorVoipQosSliceStatEvent = null;
       this.frameRateStatEvent = null;
       this.activityLaunchEvent = null;
       this.mainThreadBlockEvent = null;
       this.localMusicStatEvent = null;
       this.liveStreamAdaptiveQosStatEvent = null;
       this.networkStatEvent = null;
       this.performanceMonitoringEvent = null;
       this.editorSdkStatEvent = null;
       this.livePlayBizStatEvent = null;
       this.googlePayStatEvent = null;
       this.performanceMonitorStatus = null;
       this.batteryStatEvent = null;
       this.editorSdkExportTaskStatEvent = null;
       this.customProtoEvent = null;
       this.storyStatEvent = null;
       this.editorSdkQosStatEvent = null;
       this.videoQosStatEvent = null;
       this.keyConfigStatEvent = null;
       this.imVideoStatEvent = null;
       this.photoDownloadStatEvent = null;
       this.imageDisplayStatEvent = null;
       this.templateStatEvent = null;
       this.invalidRegionEvent = null;
       this.deviceMappingEvent = null;
       this.heartBeatEvent = null;
       this.aegonRequestStatEvent = null;
       this.bridgeCenterStatEvent = null;
       this.ioOverviewStatEvent = null;
       this.ioMonitorStatEvent = null;
       this.rerankStatEvent = null;
       this.httpdnsStatEvent = null;
       this.aegonConnectionStatEvent = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$StatPackage tdeviceStatE = this.deviceStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tdeviceStatE);
       }
       tdeviceStatE = this.applicationStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tdeviceStatE);
       }
       tdeviceStatE = this.audienceStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tdeviceStatE);
       }
       tdeviceStatE = this.anchorStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tdeviceStatE);
       }
       tdeviceStatE = this.roundTripStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tdeviceStatE);
       }
       tdeviceStatE = this.wifiStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tdeviceStatE);
       }
       tdeviceStatE = this.baseStationStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tdeviceStatE);
       }
       tdeviceStatE = this.liveChatStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tdeviceStatE);
       }
       tdeviceStatE = this.videoStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tdeviceStatE);
       }
       tdeviceStatE = this.appUsageStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tdeviceStatE);
       }
       tdeviceStatE = this.idcSpeedStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tdeviceStatE);
       }
       tdeviceStatE = this.apiCostDetailStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tdeviceStatE);
       }
       tdeviceStatE = this.audienceQosSliceStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tdeviceStatE);
       }
       tdeviceStatE = this.imageLoadStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tdeviceStatE);
       }
       tdeviceStatE = this.cdnResourceLoadStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tdeviceStatE);
       }
       tdeviceStatE = this.customStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, tdeviceStatE);
       }
       tdeviceStatE = this.openedAppStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tdeviceStatE);
       }
       tdeviceStatE = this.anchorVoipQosSliceStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tdeviceStatE);
       }
       tdeviceStatE = this.frameRateStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, tdeviceStatE);
       }
       tdeviceStatE = this.activityLaunchEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, tdeviceStatE);
       }
       tdeviceStatE = this.mainThreadBlockEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tdeviceStatE);
       }
       tdeviceStatE = this.localMusicStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, tdeviceStatE);
       }
       tdeviceStatE = this.liveStreamAdaptiveQosStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, tdeviceStatE);
       }
       tdeviceStatE = this.networkStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(31, tdeviceStatE);
       }
       tdeviceStatE = this.performanceMonitoringEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(32, tdeviceStatE);
       }
       tdeviceStatE = this.editorSdkStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(33, tdeviceStatE);
       }
       tdeviceStatE = this.livePlayBizStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(35, tdeviceStatE);
       }
       tdeviceStatE = this.googlePayStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(36, tdeviceStatE);
       }
       tdeviceStatE = this.performanceMonitorStatus;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(37, tdeviceStatE);
       }
       tdeviceStatE = this.batteryStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(38, tdeviceStatE);
       }
       tdeviceStatE = this.editorSdkExportTaskStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(40, tdeviceStatE);
       }
       tdeviceStatE = this.customProtoEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(42, tdeviceStatE);
       }
       tdeviceStatE = this.storyStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(43, tdeviceStatE);
       }
       tdeviceStatE = this.editorSdkQosStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(44, tdeviceStatE);
       }
       tdeviceStatE = this.videoQosStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(46, tdeviceStatE);
       }
       tdeviceStatE = this.keyConfigStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(47, tdeviceStatE);
       }
       tdeviceStatE = this.imVideoStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(48, tdeviceStatE);
       }
       tdeviceStatE = this.photoDownloadStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(49, tdeviceStatE);
       }
       tdeviceStatE = this.imageDisplayStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(50, tdeviceStatE);
       }
       tdeviceStatE = this.templateStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(51, tdeviceStatE);
       }
       tdeviceStatE = this.invalidRegionEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(52, tdeviceStatE);
       }
       tdeviceStatE = this.deviceMappingEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(53, tdeviceStatE);
       }
       tdeviceStatE = this.heartBeatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(54, tdeviceStatE);
       }
       tdeviceStatE = this.aegonRequestStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(55, tdeviceStatE);
       }
       tdeviceStatE = this.bridgeCenterStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(56, tdeviceStatE);
       }
       tdeviceStatE = this.ioOverviewStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(57, tdeviceStatE);
       }
       tdeviceStatE = this.ioMonitorStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(58, tdeviceStatE);
       }
       tdeviceStatE = this.rerankStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(59, tdeviceStatE);
       }
       tdeviceStatE = this.httpdnsStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(60, tdeviceStatE);
       }
       tdeviceStatE = this.aegonConnectionStatEvent;
       if (tdeviceStatE != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(61, tdeviceStatE);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$StatPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.deviceStatEvent == null) {
                   this.deviceStatEvent = new ClientStat$DeviceStatEvent();
                }
                p0.readMessage(this.deviceStatEvent);
                break;
              case 18:
                if (this.applicationStatEvent == null) {
                   this.applicationStatEvent = new ClientStat$ApplicationStatEvent();
                }
                p0.readMessage(this.applicationStatEvent);
                break;
              case 26:
                if (this.audienceStatEvent == null) {
                   this.audienceStatEvent = new ClientStat$AudienceStatEvent();
                }
                p0.readMessage(this.audienceStatEvent);
                break;
              case '"':
                if (this.anchorStatEvent == null) {
                   this.anchorStatEvent = new ClientStat$AnchorStatEvent();
                }
                p0.readMessage(this.anchorStatEvent);
                break;
              case '*':
                if (this.roundTripStatEvent == null) {
                   this.roundTripStatEvent = new ClientStat$RoundTripStatEvent();
                }
                p0.readMessage(this.roundTripStatEvent);
                break;
              case ':':
                if (this.wifiStatEvent == null) {
                   this.wifiStatEvent = new ClientStat$WiFiStatEvent();
                }
                p0.readMessage(this.wifiStatEvent);
                break;
              case 'B':
                if (this.baseStationStatEvent == null) {
                   this.baseStationStatEvent = new ClientStat$BaseStationStatEvent();
                }
                p0.readMessage(this.baseStationStatEvent);
                break;
              case 'J':
                if (this.liveChatStatEvent == null) {
                   this.liveChatStatEvent = new ClientStat$LiveChatStatEvent();
                }
                p0.readMessage(this.liveChatStatEvent);
                break;
              case 'R':
                if (this.videoStatEvent == null) {
                   this.videoStatEvent = new ClientStat$VideoStatEvent();
                }
                p0.readMessage(this.videoStatEvent);
                break;
              case 'Z':
                if (this.appUsageStatEvent == null) {
                   this.appUsageStatEvent = new ClientStat$AppUsageStatEvent();
                }
                p0.readMessage(this.appUsageStatEvent);
                break;
              case 'b':
                if (this.idcSpeedStatEvent == null) {
                   this.idcSpeedStatEvent = new ClientStat$IdcSpeedStatEvent();
                }
                p0.readMessage(this.idcSpeedStatEvent);
                break;
              case 'j':
                if (this.apiCostDetailStatEvent == null) {
                   this.apiCostDetailStatEvent = new ClientStat$ApiCostDetailStatEvent();
                }
                p0.readMessage(this.apiCostDetailStatEvent);
                break;
              case 'r':
                if (this.audienceQosSliceStatEvent == null) {
                   this.audienceQosSliceStatEvent = new ClientStat$AudienceQoSSliceStatEvent();
                }
                p0.readMessage(this.audienceQosSliceStatEvent);
                break;
              case 'z':
                if (this.imageLoadStatEvent == null) {
                   this.imageLoadStatEvent = new ClientStat$ImageLoadStatEvent();
                }
                p0.readMessage(this.imageLoadStatEvent);
                break;
              case 130:
                if (this.cdnResourceLoadStatEvent == null) {
                   this.cdnResourceLoadStatEvent = new ClientStat$CdnResourceLoadStatEvent();
                }
                p0.readMessage(this.cdnResourceLoadStatEvent);
                break;
              case 146:
                if (this.customStatEvent == null) {
                   this.customStatEvent = new ClientStat$CustomStatEvent();
                }
                p0.readMessage(this.customStatEvent);
                break;
              case 162:
                if (this.openedAppStatEvent == null) {
                   this.openedAppStatEvent = new ClientStat$OpenedAppStatEvent();
                }
                p0.readMessage(this.openedAppStatEvent);
                break;
              case 170:
                if (this.anchorVoipQosSliceStatEvent == null) {
                   this.anchorVoipQosSliceStatEvent = new ClientStat$AnchorVoipQoSSliceStatEvent();
                }
                p0.readMessage(this.anchorVoipQosSliceStatEvent);
                break;
              case 178:
                if (this.frameRateStatEvent == null) {
                   this.frameRateStatEvent = new ClientStat$FrameRateStatEvent();
                }
                p0.readMessage(this.frameRateStatEvent);
                break;
              case 186:
                if (this.activityLaunchEvent == null) {
                   this.activityLaunchEvent = new ClientStat$ActivityLaunchEvent();
                }
                p0.readMessage(this.activityLaunchEvent);
                break;
              case 194:
                if (this.mainThreadBlockEvent == null) {
                   this.mainThreadBlockEvent = new ClientStat$MainThreadBlockEvent();
                }
                p0.readMessage(this.mainThreadBlockEvent);
                break;
              case 202:
                if (this.localMusicStatEvent == null) {
                   this.localMusicStatEvent = new ClientStat$LocalMusicStatEvent();
                }
                p0.readMessage(this.localMusicStatEvent);
                break;
              case 226:
                if (this.liveStreamAdaptiveQosStatEvent == null) {
                   this.liveStreamAdaptiveQosStatEvent = new ClientStat$LiveStreamAdaptiveQosStatEvent();
                }
                p0.readMessage(this.liveStreamAdaptiveQosStatEvent);
                break;
              case 250:
                if (this.networkStatEvent == null) {
                   this.networkStatEvent = new ClientStat$NetworkStatEvent();
                }
                p0.readMessage(this.networkStatEvent);
                break;
              case 258:
                if (this.performanceMonitoringEvent == null) {
                   this.performanceMonitoringEvent = new ClientStat$PerformanceMonitoringEvent();
                }
                p0.readMessage(this.performanceMonitoringEvent);
                break;
              case 266:
                if (this.editorSdkStatEvent == null) {
                   this.editorSdkStatEvent = new ClientStat$EditorSdkStatEvent();
                }
                p0.readMessage(this.editorSdkStatEvent);
                break;
              case 282:
                if (this.livePlayBizStatEvent == null) {
                   this.livePlayBizStatEvent = new ClientStat$LivePlayBizStatEvent();
                }
                p0.readMessage(this.livePlayBizStatEvent);
                break;
              case 290:
                if (this.googlePayStatEvent == null) {
                   this.googlePayStatEvent = new ClientStat$GooglePayStatEvent();
                }
                p0.readMessage(this.googlePayStatEvent);
                break;
              case 298:
                if (this.performanceMonitorStatus == null) {
                   this.performanceMonitorStatus = new ClientBase$PerformanceMonitoringStatus();
                }
                p0.readMessage(this.performanceMonitorStatus);
                break;
              case 306:
                if (this.batteryStatEvent == null) {
                   this.batteryStatEvent = new ClientStat$BatteryStatEvent();
                }
                p0.readMessage(this.batteryStatEvent);
                break;
              case 322:
                if (this.editorSdkExportTaskStatEvent == null) {
                   this.editorSdkExportTaskStatEvent = new ClientStat$EditorSdkExportTaskStatEvent();
                }
                p0.readMessage(this.editorSdkExportTaskStatEvent);
                break;
              case 338:
                if (this.customProtoEvent == null) {
                   this.customProtoEvent = new ClientStat$CustomProtoEvent();
                }
                p0.readMessage(this.customProtoEvent);
                break;
              case 346:
                if (this.storyStatEvent == null) {
                   this.storyStatEvent = new ClientStat$StoryStatEvent();
                }
                p0.readMessage(this.storyStatEvent);
                break;
              case 354:
                if (this.editorSdkQosStatEvent == null) {
                   this.editorSdkQosStatEvent = new ClientStat$EditorSdkQosStatEvent();
                }
                p0.readMessage(this.editorSdkQosStatEvent);
                break;
              case 370:
                if (this.videoQosStatEvent == null) {
                   this.videoQosStatEvent = new ClientStat$VideoQosStatEvent();
                }
                p0.readMessage(this.videoQosStatEvent);
                break;
              case 378:
                if (this.keyConfigStatEvent == null) {
                   this.keyConfigStatEvent = new ClientStat$KeyConfigStatEvent();
                }
                p0.readMessage(this.keyConfigStatEvent);
                break;
              case 386:
                if (this.imVideoStatEvent == null) {
                   this.imVideoStatEvent = new ClientStat$ImVideoStatEvent();
                }
                p0.readMessage(this.imVideoStatEvent);
                break;
              case 394:
                if (this.photoDownloadStatEvent == null) {
                   this.photoDownloadStatEvent = new ClientStat$PhotoDownloadStatEvent();
                }
                p0.readMessage(this.photoDownloadStatEvent);
                break;
              case 402:
                if (this.imageDisplayStatEvent == null) {
                   this.imageDisplayStatEvent = new ClientStat$ImageDisplayStatEvent();
                }
                p0.readMessage(this.imageDisplayStatEvent);
                break;
              case 410:
                if (this.templateStatEvent == null) {
                   this.templateStatEvent = new ClientStat$TemplateStatEvent();
                }
                p0.readMessage(this.templateStatEvent);
                break;
              case 418:
                if (this.invalidRegionEvent == null) {
                   this.invalidRegionEvent = new ClientStat$InvalidRegionEvent();
                }
                p0.readMessage(this.invalidRegionEvent);
                break;
              case 426:
                if (this.deviceMappingEvent == null) {
                   this.deviceMappingEvent = new ClientStat$DeviceIdMappingEvent();
                }
                p0.readMessage(this.deviceMappingEvent);
                break;
              case 434:
                if (this.heartBeatEvent == null) {
                   this.heartBeatEvent = new ClientStat$HeartBeatEvent();
                }
                p0.readMessage(this.heartBeatEvent);
                break;
              case 442:
                if (this.aegonRequestStatEvent == null) {
                   this.aegonRequestStatEvent = new ClientStat$AegonRequestStatEvent();
                }
                p0.readMessage(this.aegonRequestStatEvent);
                break;
              case 450:
                if (this.bridgeCenterStatEvent == null) {
                   this.bridgeCenterStatEvent = new ClientStat$BridgeCenterEvent();
                }
                p0.readMessage(this.bridgeCenterStatEvent);
                break;
              case 458:
                if (this.ioOverviewStatEvent == null) {
                   this.ioOverviewStatEvent = new ClientStat$IoOverviewStatEvent();
                }
                p0.readMessage(this.ioOverviewStatEvent);
                break;
              case 466:
                if (this.ioMonitorStatEvent == null) {
                   this.ioMonitorStatEvent = new ClientStat$IoMonitorStatEvent();
                }
                p0.readMessage(this.ioMonitorStatEvent);
                break;
              case 474:
                if (this.rerankStatEvent == null) {
                   this.rerankStatEvent = new ClientStat$RerankStatEvent();
                }
                p0.readMessage(this.rerankStatEvent);
                break;
              case 482:
                if (this.httpdnsStatEvent == null) {
                   this.httpdnsStatEvent = new ClientStat$HttpdnsStatEvent();
                }
                p0.readMessage(this.httpdnsStatEvent);
                break;
              case 490:
                if (this.aegonConnectionStatEvent == null) {
                   this.aegonConnectionStatEvent = new ClientStat$AegonConnectionStatEvent();
                }
                p0.readMessage(this.aegonConnectionStatEvent);
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
       ClientStat$StatPackage tdeviceStatE = this.deviceStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(1, tdeviceStatE);
       }
       tdeviceStatE = this.applicationStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(2, tdeviceStatE);
       }
       tdeviceStatE = this.audienceStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(3, tdeviceStatE);
       }
       tdeviceStatE = this.anchorStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(4, tdeviceStatE);
       }
       tdeviceStatE = this.roundTripStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(5, tdeviceStatE);
       }
       tdeviceStatE = this.wifiStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(7, tdeviceStatE);
       }
       tdeviceStatE = this.baseStationStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(8, tdeviceStatE);
       }
       tdeviceStatE = this.liveChatStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(9, tdeviceStatE);
       }
       tdeviceStatE = this.videoStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(10, tdeviceStatE);
       }
       tdeviceStatE = this.appUsageStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(11, tdeviceStatE);
       }
       tdeviceStatE = this.idcSpeedStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(12, tdeviceStatE);
       }
       tdeviceStatE = this.apiCostDetailStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(13, tdeviceStatE);
       }
       tdeviceStatE = this.audienceQosSliceStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(14, tdeviceStatE);
       }
       tdeviceStatE = this.imageLoadStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(15, tdeviceStatE);
       }
       tdeviceStatE = this.cdnResourceLoadStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(16, tdeviceStatE);
       }
       tdeviceStatE = this.customStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(18, tdeviceStatE);
       }
       tdeviceStatE = this.openedAppStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(20, tdeviceStatE);
       }
       tdeviceStatE = this.anchorVoipQosSliceStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(21, tdeviceStatE);
       }
       tdeviceStatE = this.frameRateStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(22, tdeviceStatE);
       }
       tdeviceStatE = this.activityLaunchEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(23, tdeviceStatE);
       }
       tdeviceStatE = this.mainThreadBlockEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(24, tdeviceStatE);
       }
       tdeviceStatE = this.localMusicStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(25, tdeviceStatE);
       }
       tdeviceStatE = this.liveStreamAdaptiveQosStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(28, tdeviceStatE);
       }
       tdeviceStatE = this.networkStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(31, tdeviceStatE);
       }
       tdeviceStatE = this.performanceMonitoringEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(32, tdeviceStatE);
       }
       tdeviceStatE = this.editorSdkStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(33, tdeviceStatE);
       }
       tdeviceStatE = this.livePlayBizStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(35, tdeviceStatE);
       }
       tdeviceStatE = this.googlePayStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(36, tdeviceStatE);
       }
       tdeviceStatE = this.performanceMonitorStatus;
       if (tdeviceStatE != null) {
          p0.writeMessage(37, tdeviceStatE);
       }
       tdeviceStatE = this.batteryStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(38, tdeviceStatE);
       }
       tdeviceStatE = this.editorSdkExportTaskStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(40, tdeviceStatE);
       }
       tdeviceStatE = this.customProtoEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(42, tdeviceStatE);
       }
       tdeviceStatE = this.storyStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(43, tdeviceStatE);
       }
       tdeviceStatE = this.editorSdkQosStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(44, tdeviceStatE);
       }
       tdeviceStatE = this.videoQosStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(46, tdeviceStatE);
       }
       tdeviceStatE = this.keyConfigStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(47, tdeviceStatE);
       }
       tdeviceStatE = this.imVideoStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(48, tdeviceStatE);
       }
       tdeviceStatE = this.photoDownloadStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(49, tdeviceStatE);
       }
       tdeviceStatE = this.imageDisplayStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(50, tdeviceStatE);
       }
       tdeviceStatE = this.templateStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(51, tdeviceStatE);
       }
       tdeviceStatE = this.invalidRegionEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(52, tdeviceStatE);
       }
       tdeviceStatE = this.deviceMappingEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(53, tdeviceStatE);
       }
       tdeviceStatE = this.heartBeatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(54, tdeviceStatE);
       }
       tdeviceStatE = this.aegonRequestStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(55, tdeviceStatE);
       }
       tdeviceStatE = this.bridgeCenterStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(56, tdeviceStatE);
       }
       tdeviceStatE = this.ioOverviewStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(57, tdeviceStatE);
       }
       tdeviceStatE = this.ioMonitorStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(58, tdeviceStatE);
       }
       tdeviceStatE = this.rerankStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(59, tdeviceStatE);
       }
       tdeviceStatE = this.httpdnsStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(60, tdeviceStatE);
       }
       tdeviceStatE = this.aegonConnectionStatEvent;
       if (tdeviceStatE != null) {
          p0.writeMessage(61, tdeviceStatE);
       }
       super.writeTo(p0);
       return;
    }
}
