package com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DanmakuPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DanmakuShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BodyUsePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KuaishanVideoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTeamPkPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyAppPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchKuaishanVideoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveSharePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotTtsPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotSpeechRecognitionPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveAdminOperatePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DownloadResourcePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessProfilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MomentMessagePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$StyleStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveFansGroupPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMMessagePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMPersonalSessionPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchLocalIntelligentAlbumPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalIntelligentAlbumPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveBarrageInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveResourceFilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchCollectionPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CollectionPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TargetUserPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GossipMessagePackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchSeriesPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SeriesPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$NotificationPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasEditPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicPlayStatPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveChatPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MorelistPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicLoadingStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GameZoneGamePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMomentMessagePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LivePkPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchStickerInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchBeautyMakeUpStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyMakeUpStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ChinaMobileQuickLoginValidateResultPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoWatermarkDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$InitMethodCostPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ChatPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicAdjustDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchSeekBarDragPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEncodingDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoClipDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ImportOriginPhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ImportOriginVideoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoPreviewInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RecordFpsInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RecordInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFilterDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchCommodityDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchThemePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchEditEffectPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchMusicDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BeautyStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeaturesElementStayLengthPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProductionEditOperationPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MagicFaceShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoSeekBarDragPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KSongDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CameraRecordFeaturesStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommodityDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFeatureSwitchPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditFeaturesStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoEditOperationPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchFeedShowCountPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SingerDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchVisitDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentShowPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ECommerceLinkPacakge;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveAudiencePacakge;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ImportMusicFromPCPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$FeatureSwitchPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$EffectPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveBroadcastPacakge;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LoginSourcePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyBindPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BannerPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyRecommendUserListItemPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LocalMusicPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MessagePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SoundEffectPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PaymentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;

public final class ClientContent$ContentPackage extends MessageNano	// class@001231
{
    public ClientContent$AtlasEditPackageV2 atlasEditPackage;
    public ClientContent$AtlasPackage atlasPackage;
    public ClientContent$BannerPackage bannerPackage;
    public ClientContent$BatchBeautyMakeUpStatusPackage batchBeautyMakeUpStatusPackage;
    public ClientContent$BatchCollectionPackageV2 batchCollectionPackage;
    public ClientContent$BatchCommodityDetailPackage batchCommodityDetailPackage;
    public ClientContent$BatchEditEffectPackage batchEditEffectPackage;
    public ClientContent$BatchFeatureSwitchPackage batchFeatureSwitchPackage;
    public ClientContent$BatchFeedShowCountPackage batchFeedShowCountPackage;
    public ClientContent$BatchFilterDetailPackage batchFilterDetailPackage;
    public ClientContent$BatchKuaishanVideoPackage batchKuaishanVideoPackage;
    public ClientContent$BatchLocalIntelligentAlbumPackage batchLocalIntelligentAlbumPackage;
    public ClientContent$BatchMomentMessagePackage batchMomentMessagePackage;
    public ClientContent$BatchMoreInfoPackageV2 batchMoreInfoPackage;
    public ClientContent$BatchMusicDetailPackage batchMusicDetailPackage;
    public ClientContent$BatchSeekBarDragPackage batchSeekBarPackage;
    public ClientContent$BatchSeriesPackageV2 batchSeriesPackage;
    public ClientContent$BatchStickerInfoPackage batchStickerInfoPackage;
    public ClientContent$BatchThemePackage batchThemePackage;
    public ClientContent$BatchUserPackage batchUserPackage;
    public ClientContent$BatchVisitDetailPackage batchVisitDetailPackage;
    public ClientContent$BeautyMakeUpStatusPackage beautyMakeUpStatusPacakge;
    public ClientContent$BeautyStatusPackage beautyStatusPackage;
    public ClientContent$BodyUsePackage bodyUserPackage;
    public ClientContent$BusinessPackageV2 businessPackage;
    public ClientContent$BusinessProfilePackage businessProfilePackage;
    public ClientContent$CameraRecordFeaturesStatusPackage cameraRecordFeaturesStatusPackage;
    public ClientContent$ChatPackage chatPackage;
    public ClientContent$ChinaMobileQuickLoginValidateResultPackage chinaMobileQuickLoginValidateResultPackage;
    public ClientContent$CollectionPackageV2 collectionPackage;
    public ClientContent$CommentPackage commentPackage;
    public ClientContent$CommentShowPackage commentShowPackage;
    public ClientContent$CommodityDetailPackage commodityDetailPackage;
    public ClientContent$DanmakuPackage danmakuPackage;
    public ClientContent$DanmakuShowPackage danmakuShowPackage;
    public ClientContent$DistrictRankPackage districtRankPackage;
    public ClientContent$DownloadResourcePackage downloadResourcePackage;
    public ClientContent$ECommerceLinkPacakge eCommerceLinkPackage;
    public ClientContent$EffectPackage effectPackage;
    public ClientContent$FeatureSwitchPackage featureSwitchPackage;
    public ClientContent$FeaturesElementStayLengthPackage featuresElementStayLengthPackage;
    public ClientContent$GameZoneGamePackage gameZoneGamePackage;
    public ClientContent$GiftPackage giftPackage;
    public ClientContent$GossipMessagePackageV2 gossipMessagePackage;
    public ClientContent$IMGroupSessionPackage imGroupSessionPackage;
    public ClientContent$IMMessagePackage imMessagePackage;
    public ClientContent$IMPersonalSessionPackage imPersonalSessionPackage;
    public ClientContent$IMUserPackage imUserPackage;
    public ClientContent$ImportMusicFromPCPackage importMusicFromPcPackage;
    public ClientContent$ImportOriginPhotoPackage importOriginPhotoPackage;
    public ClientContent$ImportOriginVideoPackage importOriginVideoPackge;
    public ClientContent$InitMethodCostPackage initMethodCostPackage;
    public ClientContent$KSongDetailPackage kSongDetailPackage;
    public ClientContent$KsOrderInfoPackage ksOrderInfoPackage;
    public ClientContent$KuaishanVideoPackage kuaishanVideoPackage;
    public ClientContent$LiveAdminOperatePackage liveAdminOperatePackage;
    public ClientContent$LiveAudiencePacakge liveAudiencePackage;
    public ClientContent$LiveBarrageInfoPackage liveBarrageInfoPackage;
    public ClientContent$LiveBroadcastPacakge liveBroadcastPackage;
    public ClientContent$LiveChatPackageV2 liveChatPackage;
    public ClientContent$LiveFansGroupPackage liveFansGroupPackage;
    public ClientContent$LivePkPackage livePkPackage;
    public ClientContent$LiveResourceFilePackage liveResourceFilePackage;
    public ClientContent$LiveRobotPackage liveRobotPackage;
    public ClientContent$LiveRobotSpeechRecognitionPackage liveRobotSpeechRecognitionPackage;
    public ClientContent$LiveRobotTtsPackage liveRobotTtsPackage;
    public ClientContent$LiveSharePackage liveSharePackage;
    public ClientContent$LiveStreamPackage liveStreamPackage;
    public ClientContent$LiveVoicePartyPackageV2 liveVoicePartyPackage;
    public ClientContent$LiveVoicePartyTeamPkPackage liveVoicePartyTeampkPackage;
    public ClientContent$LiveVoicePartyTheaterPackage liveVoicePartyTheaterPackage;
    public ClientContent$LocalIntelligentAlbumPackage localIntelligentAlbumPackage;
    public ClientContent$LocalMusicPackage localMusicPackage;
    public ClientContent$LoginSourcePackage loginSourcePackage;
    public ClientContent$MagicFaceShowPackage magicFaceShowPackage;
    public ClientContent$MessagePackage messagePackage;
    public ClientContent$MomentMessagePackage momentMessagePackage;
    public ClientContent$MoreInfoPackageV2 moreInfoPackage;
    public ClientContent$MorelistPackage morelistPackage;
    public ClientContent$MusicAdjustDetailPackage musicAdjustDetailPackage;
    public ClientContent$MusicDetailPackage musicDetailPackage;
    public ClientContent$MusicLoadingStatusPackage musicLoadingStatusPackage;
    public ClientContent$MusicPlayStatPackageV2 musicPlayStatPackage;
    public ClientContent$NotificationPackageV2 notificationPackage;
    public ClientContent$PaymentPackage paymentPackage;
    public ClientContent$PhotoPackage photoPackage;
    public ClientContent$PhotoSeekBarDragPackage photoSeekBarDragPackage;
    public ClientContent$PhotoShowPackage photoShowPackage;
    public ClientContent$ProductionEditOperationPackage productionEditOperationPackage;
    public ClientContent$ProfilePackage profilePackage;
    public ClientContent$RecordFpsInfoPackage recordFpsInfoPackage;
    public ClientContent$RecordInfoPackage recordInfoPackage;
    public ClientContent$RedPackPackage redPackage;
    public ClientContent$PhotoPackage referPhotoPackage;
    public ClientContent$ScreenPackage screenPackage;
    public ClientContent$SearchResultPackage searchResultPackage;
    public ClientContent$SeriesPackageV2 seriesPackage;
    public ClientContent$SingerDetailPackage singerDetailPackage;
    public ClientContent$SoundEffectPackage soundEffectPackage;
    public ClientContent$StyleStatusPackage styleStatusPackage;
    public ClientContent$TagPackage tagPackage;
    public ClientContent$TagShowPackage tagShowPackage;
    public ClientContent$TargetUserPackageV2 targetUserPackage;
    public ClientContent$ThirdPartyAppPackage thirdPartyAppPackage;
    public ClientContent$ThirdPartyBindPackage thirdPartyBindPackage;
    public ClientContent$ThirdPartyRecommendUserListItemPackage thirdPartyRecommendUserListItemPackage;
    public ClientContent$UserPackage userPackage;
    public ClientContent$VideoClipDetailPackage videoClipDetailPackage;
    public ClientContent$VideoEditFeaturesStatusPackage videoEditFeaturesStatusPackage;
    public ClientContent$VideoEditOperationPackage videoEditOperationPackage;
    public ClientContent$VideoEncodingDetailPackage videoEncodingDetailPackage;
    public ClientContent$VideoPackage videoPackage;
    public ClientContent$VideoPreviewInfoPackage videoPreviewInfoPackage;
    public ClientContent$VideoWatermarkDetailPackage videoWatermarkDetailPackage;
    public static ClientContent$ContentPackage[] _emptyArray;

    public void ClientContent$ContentPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ContentPackage[] emptyArray(){
       if (ClientContent$ContentPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ContentPackage._emptyArray == null) {
             ClientContent$ContentPackage[] uContentPack = new ClientContent$ContentPackage[0];
             ClientContent$ContentPackage._emptyArray = uContentPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ContentPackage._emptyArray;
    }
    public static ClientContent$ContentPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ContentPackage().mergeFrom(p0);
    }
    public static ClientContent$ContentPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ContentPackage(), p0);
    }
    public ClientContent$ContentPackage clear(){
       this.userPackage = null;
       this.liveStreamPackage = null;
       this.screenPackage = null;
       this.paymentPackage = null;
       this.giftPackage = null;
       this.soundEffectPackage = null;
       this.messagePackage = null;
       this.photoPackage = null;
       this.videoPackage = null;
       this.commentPackage = null;
       this.localMusicPackage = null;
       this.searchResultPackage = null;
       this.thirdPartyRecommendUserListItemPackage = null;
       this.atlasPackage = null;
       this.bannerPackage = null;
       this.profilePackage = null;
       this.thirdPartyBindPackage = null;
       this.loginSourcePackage = null;
       this.referPhotoPackage = null;
       this.tagPackage = null;
       this.liveBroadcastPackage = null;
       this.effectPackage = null;
       this.featureSwitchPackage = null;
       this.importMusicFromPcPackage = null;
       this.liveAudiencePackage = null;
       this.eCommerceLinkPackage = null;
       this.commentShowPackage = null;
       this.tagShowPackage = null;
       this.photoShowPackage = null;
       this.batchVisitDetailPackage = null;
       this.singerDetailPackage = null;
       this.musicDetailPackage = null;
       this.batchFeedShowCountPackage = null;
       this.videoEditOperationPackage = null;
       this.videoEditFeaturesStatusPackage = null;
       this.batchFeatureSwitchPackage = null;
       this.commodityDetailPackage = null;
       this.batchUserPackage = null;
       this.cameraRecordFeaturesStatusPackage = null;
       this.kSongDetailPackage = null;
       this.photoSeekBarDragPackage = null;
       this.magicFaceShowPackage = null;
       this.productionEditOperationPackage = null;
       this.featuresElementStayLengthPackage = null;
       this.beautyStatusPackage = null;
       this.batchMusicDetailPackage = null;
       this.batchEditEffectPackage = null;
       this.batchThemePackage = null;
       this.batchCommodityDetailPackage = null;
       this.batchFilterDetailPackage = null;
       this.recordInfoPackage = null;
       this.recordFpsInfoPackage = null;
       this.videoPreviewInfoPackage = null;
       this.importOriginVideoPackge = null;
       this.importOriginPhotoPackage = null;
       this.videoClipDetailPackage = null;
       this.videoEncodingDetailPackage = null;
       this.batchSeekBarPackage = null;
       this.musicAdjustDetailPackage = null;
       this.chatPackage = null;
       this.initMethodCostPackage = null;
       this.videoWatermarkDetailPackage = null;
       this.chinaMobileQuickLoginValidateResultPackage = null;
       this.beautyMakeUpStatusPacakge = null;
       this.batchBeautyMakeUpStatusPackage = null;
       this.batchStickerInfoPackage = null;
       this.livePkPackage = null;
       this.batchMomentMessagePackage = null;
       this.gameZoneGamePackage = null;
       this.musicLoadingStatusPackage = null;
       this.morelistPackage = null;
       this.liveChatPackage = null;
       this.liveVoicePartyPackage = null;
       this.musicPlayStatPackage = null;
       this.atlasEditPackage = null;
       this.notificationPackage = null;
       this.seriesPackage = null;
       this.batchSeriesPackage = null;
       this.moreInfoPackage = null;
       this.batchMoreInfoPackage = null;
       this.gossipMessagePackage = null;
       this.targetUserPackage = null;
       this.collectionPackage = null;
       this.batchCollectionPackage = null;
       this.businessPackage = null;
       this.liveResourceFilePackage = null;
       this.liveBarrageInfoPackage = null;
       this.localIntelligentAlbumPackage = null;
       this.batchLocalIntelligentAlbumPackage = null;
       this.imUserPackage = null;
       this.imPersonalSessionPackage = null;
       this.imGroupSessionPackage = null;
       this.imMessagePackage = null;
       this.liveFansGroupPackage = null;
       this.styleStatusPackage = null;
       this.momentMessagePackage = null;
       this.businessProfilePackage = null;
       this.redPackage = null;
       this.downloadResourcePackage = null;
       this.liveAdminOperatePackage = null;
       this.liveRobotSpeechRecognitionPackage = null;
       this.liveRobotTtsPackage = null;
       this.ksOrderInfoPackage = null;
       this.liveSharePackage = null;
       this.batchKuaishanVideoPackage = null;
       this.districtRankPackage = null;
       this.thirdPartyAppPackage = null;
       this.liveRobotPackage = null;
       this.liveVoicePartyTheaterPackage = null;
       this.liveVoicePartyTeampkPackage = null;
       this.kuaishanVideoPackage = null;
       this.bodyUserPackage = null;
       this.danmakuShowPackage = null;
       this.danmakuPackage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ContentPackage tuserPackage = this.userPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserPackage);
       }
       tuserPackage = this.liveStreamPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuserPackage);
       }
       tuserPackage = this.screenPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tuserPackage);
       }
       tuserPackage = this.paymentPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tuserPackage);
       }
       tuserPackage = this.giftPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tuserPackage);
       }
       tuserPackage = this.soundEffectPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tuserPackage);
       }
       tuserPackage = this.messagePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuserPackage);
       }
       tuserPackage = this.photoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tuserPackage);
       }
       tuserPackage = this.videoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tuserPackage);
       }
       tuserPackage = this.commentPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tuserPackage);
       }
       tuserPackage = this.localMusicPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, tuserPackage);
       }
       tuserPackage = this.searchResultPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tuserPackage);
       }
       tuserPackage = this.thirdPartyRecommendUserListItemPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tuserPackage);
       }
       tuserPackage = this.atlasPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, tuserPackage);
       }
       tuserPackage = this.bannerPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tuserPackage);
       }
       tuserPackage = this.profilePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, tuserPackage);
       }
       tuserPackage = this.thirdPartyBindPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(17, tuserPackage);
       }
       tuserPackage = this.loginSourcePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, tuserPackage);
       }
       tuserPackage = this.referPhotoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, tuserPackage);
       }
       tuserPackage = this.tagPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, tuserPackage);
       }
       tuserPackage = this.liveBroadcastPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(21, tuserPackage);
       }
       tuserPackage = this.effectPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(22, tuserPackage);
       }
       tuserPackage = this.featureSwitchPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, tuserPackage);
       }
       tuserPackage = this.importMusicFromPcPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, tuserPackage);
       }
       tuserPackage = this.liveAudiencePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(25, tuserPackage);
       }
       tuserPackage = this.eCommerceLinkPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(26, tuserPackage);
       }
       tuserPackage = this.commentShowPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(27, tuserPackage);
       }
       tuserPackage = this.tagShowPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, tuserPackage);
       }
       tuserPackage = this.photoShowPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(29, tuserPackage);
       }
       tuserPackage = this.batchVisitDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, tuserPackage);
       }
       tuserPackage = this.singerDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(31, tuserPackage);
       }
       tuserPackage = this.musicDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(32, tuserPackage);
       }
       tuserPackage = this.batchFeedShowCountPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(34, tuserPackage);
       }
       tuserPackage = this.videoEditOperationPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(36, tuserPackage);
       }
       tuserPackage = this.videoEditFeaturesStatusPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(37, tuserPackage);
       }
       tuserPackage = this.batchFeatureSwitchPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(38, tuserPackage);
       }
       tuserPackage = this.commodityDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(39, tuserPackage);
       }
       tuserPackage = this.batchUserPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(40, tuserPackage);
       }
       tuserPackage = this.cameraRecordFeaturesStatusPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(41, tuserPackage);
       }
       tuserPackage = this.kSongDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(42, tuserPackage);
       }
       tuserPackage = this.photoSeekBarDragPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(44, tuserPackage);
       }
       tuserPackage = this.magicFaceShowPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(46, tuserPackage);
       }
       tuserPackage = this.productionEditOperationPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(47, tuserPackage);
       }
       tuserPackage = this.featuresElementStayLengthPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(48, tuserPackage);
       }
       tuserPackage = this.beautyStatusPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(49, tuserPackage);
       }
       tuserPackage = this.batchMusicDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(50, tuserPackage);
       }
       tuserPackage = this.batchEditEffectPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(51, tuserPackage);
       }
       tuserPackage = this.batchThemePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(53, tuserPackage);
       }
       tuserPackage = this.batchCommodityDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(54, tuserPackage);
       }
       tuserPackage = this.batchFilterDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(57, tuserPackage);
       }
       tuserPackage = this.recordInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(58, tuserPackage);
       }
       tuserPackage = this.recordFpsInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(59, tuserPackage);
       }
       tuserPackage = this.videoPreviewInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(61, tuserPackage);
       }
       tuserPackage = this.importOriginVideoPackge;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(62, tuserPackage);
       }
       tuserPackage = this.importOriginPhotoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(63, tuserPackage);
       }
       tuserPackage = this.videoClipDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(65, tuserPackage);
       }
       tuserPackage = this.videoEncodingDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(66, tuserPackage);
       }
       tuserPackage = this.batchSeekBarPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(68, tuserPackage);
       }
       tuserPackage = this.musicAdjustDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(70, tuserPackage);
       }
       tuserPackage = this.chatPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(71, tuserPackage);
       }
       tuserPackage = this.initMethodCostPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(72, tuserPackage);
       }
       tuserPackage = this.videoWatermarkDetailPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(73, tuserPackage);
       }
       tuserPackage = this.chinaMobileQuickLoginValidateResultPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(75, tuserPackage);
       }
       tuserPackage = this.beautyMakeUpStatusPacakge;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(76, tuserPackage);
       }
       tuserPackage = this.batchBeautyMakeUpStatusPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(77, tuserPackage);
       }
       tuserPackage = this.batchStickerInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(78, tuserPackage);
       }
       tuserPackage = this.livePkPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(79, tuserPackage);
       }
       tuserPackage = this.batchMomentMessagePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(80, tuserPackage);
       }
       tuserPackage = this.gameZoneGamePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(85, tuserPackage);
       }
       tuserPackage = this.musicLoadingStatusPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(89, tuserPackage);
       }
       tuserPackage = this.morelistPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(91, tuserPackage);
       }
       tuserPackage = this.liveChatPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(109, tuserPackage);
       }
       tuserPackage = this.liveVoicePartyPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(113, tuserPackage);
       }
       tuserPackage = this.musicPlayStatPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(116, tuserPackage);
       }
       tuserPackage = this.atlasEditPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(123, tuserPackage);
       }
       tuserPackage = this.notificationPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(124, tuserPackage);
       }
       tuserPackage = this.seriesPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(127, tuserPackage);
       }
       tuserPackage = this.batchSeriesPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(128, tuserPackage);
       }
       tuserPackage = this.moreInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(129, tuserPackage);
       }
       tuserPackage = this.batchMoreInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(130, tuserPackage);
       }
       tuserPackage = this.gossipMessagePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(133, tuserPackage);
       }
       tuserPackage = this.targetUserPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(136, tuserPackage);
       }
       tuserPackage = this.collectionPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(140, tuserPackage);
       }
       tuserPackage = this.batchCollectionPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(141, tuserPackage);
       }
       tuserPackage = this.businessPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(147, tuserPackage);
       }
       tuserPackage = this.liveResourceFilePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(149, tuserPackage);
       }
       tuserPackage = this.liveBarrageInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(150, tuserPackage);
       }
       tuserPackage = this.localIntelligentAlbumPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(151, tuserPackage);
       }
       tuserPackage = this.batchLocalIntelligentAlbumPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(152, tuserPackage);
       }
       tuserPackage = this.imUserPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(153, tuserPackage);
       }
       tuserPackage = this.imPersonalSessionPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(154, tuserPackage);
       }
       tuserPackage = this.imGroupSessionPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(155, tuserPackage);
       }
       tuserPackage = this.imMessagePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(156, tuserPackage);
       }
       tuserPackage = this.liveFansGroupPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(157, tuserPackage);
       }
       tuserPackage = this.styleStatusPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(159, tuserPackage);
       }
       tuserPackage = this.momentMessagePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(160, tuserPackage);
       }
       tuserPackage = this.businessProfilePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(161, tuserPackage);
       }
       tuserPackage = this.redPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(162, tuserPackage);
       }
       tuserPackage = this.downloadResourcePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(165, tuserPackage);
       }
       tuserPackage = this.liveAdminOperatePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(166, tuserPackage);
       }
       tuserPackage = this.liveRobotSpeechRecognitionPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(167, tuserPackage);
       }
       tuserPackage = this.liveRobotTtsPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(168, tuserPackage);
       }
       tuserPackage = this.ksOrderInfoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(169, tuserPackage);
       }
       tuserPackage = this.liveSharePackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(170, tuserPackage);
       }
       tuserPackage = this.batchKuaishanVideoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(172, tuserPackage);
       }
       tuserPackage = this.districtRankPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(173, tuserPackage);
       }
       tuserPackage = this.thirdPartyAppPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(174, tuserPackage);
       }
       tuserPackage = this.liveRobotPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(175, tuserPackage);
       }
       tuserPackage = this.liveVoicePartyTheaterPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(177, tuserPackage);
       }
       tuserPackage = this.liveVoicePartyTeampkPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(178, tuserPackage);
       }
       tuserPackage = this.kuaishanVideoPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(179, tuserPackage);
       }
       tuserPackage = this.bodyUserPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(180, tuserPackage);
       }
       tuserPackage = this.danmakuShowPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(181, tuserPackage);
       }
       tuserPackage = this.danmakuPackage;
       if (tuserPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(182, tuserPackage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ContentPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.userPackage == null) {
                   this.userPackage = new ClientContent$UserPackage();
                }
                p0.readMessage(this.userPackage);
                break;
              case 18:
                if (this.liveStreamPackage == null) {
                   this.liveStreamPackage = new ClientContent$LiveStreamPackage();
                }
                p0.readMessage(this.liveStreamPackage);
                break;
              case 26:
                if (this.screenPackage == null) {
                   this.screenPackage = new ClientContent$ScreenPackage();
                }
                p0.readMessage(this.screenPackage);
                break;
              case '"':
                if (this.paymentPackage == null) {
                   this.paymentPackage = new ClientContent$PaymentPackage();
                }
                p0.readMessage(this.paymentPackage);
                break;
              case '*':
                if (this.giftPackage == null) {
                   this.giftPackage = new ClientContent$GiftPackage();
                }
                p0.readMessage(this.giftPackage);
                break;
              case '2':
                if (this.soundEffectPackage == null) {
                   this.soundEffectPackage = new ClientContent$SoundEffectPackage();
                }
                p0.readMessage(this.soundEffectPackage);
                break;
              case ':':
                if (this.messagePackage == null) {
                   this.messagePackage = new ClientContent$MessagePackage();
                }
                p0.readMessage(this.messagePackage);
                break;
              case 'B':
                if (this.photoPackage == null) {
                   this.photoPackage = new ClientContent$PhotoPackage();
                }
                p0.readMessage(this.photoPackage);
                break;
              case 'J':
                if (this.videoPackage == null) {
                   this.videoPackage = new ClientContent$VideoPackage();
                }
                p0.readMessage(this.videoPackage);
                break;
              case 'R':
                if (this.commentPackage == null) {
                   this.commentPackage = new ClientContent$CommentPackage();
                }
                p0.readMessage(this.commentPackage);
                break;
              case 'Z':
                if (this.localMusicPackage == null) {
                   this.localMusicPackage = new ClientContent$LocalMusicPackage();
                }
                p0.readMessage(this.localMusicPackage);
                break;
              case 'b':
                if (this.searchResultPackage == null) {
                   this.searchResultPackage = new ClientContent$SearchResultPackage();
                }
                p0.readMessage(this.searchResultPackage);
                break;
              case 'j':
                if (this.thirdPartyRecommendUserListItemPackage == null) {
                   this.thirdPartyRecommendUserListItemPackage = new ClientContent$ThirdPartyRecommendUserListItemPackage();
                }
                p0.readMessage(this.thirdPartyRecommendUserListItemPackage);
                break;
              case 'r':
                if (this.atlasPackage == null) {
                   this.atlasPackage = new ClientContent$AtlasPackage();
                }
                p0.readMessage(this.atlasPackage);
                break;
              case 'z':
                if (this.bannerPackage == null) {
                   this.bannerPackage = new ClientContent$BannerPackage();
                }
                p0.readMessage(this.bannerPackage);
                break;
              case 130:
                if (this.profilePackage == null) {
                   this.profilePackage = new ClientContent$ProfilePackage();
                }
                p0.readMessage(this.profilePackage);
                break;
              case 138:
                if (this.thirdPartyBindPackage == null) {
                   this.thirdPartyBindPackage = new ClientContent$ThirdPartyBindPackage();
                }
                p0.readMessage(this.thirdPartyBindPackage);
                break;
              case 146:
                if (this.loginSourcePackage == null) {
                   this.loginSourcePackage = new ClientContent$LoginSourcePackage();
                }
                p0.readMessage(this.loginSourcePackage);
                break;
              case 154:
                if (this.referPhotoPackage == null) {
                   this.referPhotoPackage = new ClientContent$PhotoPackage();
                }
                p0.readMessage(this.referPhotoPackage);
                break;
              case 162:
                if (this.tagPackage == null) {
                   this.tagPackage = new ClientContent$TagPackage();
                }
                p0.readMessage(this.tagPackage);
                break;
              case 170:
                if (this.liveBroadcastPackage == null) {
                   this.liveBroadcastPackage = new ClientContent$LiveBroadcastPacakge();
                }
                p0.readMessage(this.liveBroadcastPackage);
                break;
              case 178:
                if (this.effectPackage == null) {
                   this.effectPackage = new ClientContent$EffectPackage();
                }
                p0.readMessage(this.effectPackage);
                break;
              case 186:
                if (this.featureSwitchPackage == null) {
                   this.featureSwitchPackage = new ClientContent$FeatureSwitchPackage();
                }
                p0.readMessage(this.featureSwitchPackage);
                break;
              case 194:
                if (this.importMusicFromPcPackage == null) {
                   this.importMusicFromPcPackage = new ClientContent$ImportMusicFromPCPackage();
                }
                p0.readMessage(this.importMusicFromPcPackage);
                break;
              case 202:
                if (this.liveAudiencePackage == null) {
                   this.liveAudiencePackage = new ClientContent$LiveAudiencePacakge();
                }
                p0.readMessage(this.liveAudiencePackage);
                break;
              case 210:
                if (this.eCommerceLinkPackage == null) {
                   this.eCommerceLinkPackage = new ClientContent$ECommerceLinkPacakge();
                }
                p0.readMessage(this.eCommerceLinkPackage);
                break;
              case 218:
                if (this.commentShowPackage == null) {
                   this.commentShowPackage = new ClientContent$CommentShowPackage();
                }
                p0.readMessage(this.commentShowPackage);
                break;
              case 226:
                if (this.tagShowPackage == null) {
                   this.tagShowPackage = new ClientContent$TagShowPackage();
                }
                p0.readMessage(this.tagShowPackage);
                break;
              case 234:
                if (this.photoShowPackage == null) {
                   this.photoShowPackage = new ClientContent$PhotoShowPackage();
                }
                p0.readMessage(this.photoShowPackage);
                break;
              case 242:
                if (this.batchVisitDetailPackage == null) {
                   this.batchVisitDetailPackage = new ClientContent$BatchVisitDetailPackage();
                }
                p0.readMessage(this.batchVisitDetailPackage);
                break;
              case 250:
                if (this.singerDetailPackage == null) {
                   this.singerDetailPackage = new ClientContent$SingerDetailPackage();
                }
                p0.readMessage(this.singerDetailPackage);
                break;
              case 258:
                if (this.musicDetailPackage == null) {
                   this.musicDetailPackage = new ClientContent$MusicDetailPackage();
                }
                p0.readMessage(this.musicDetailPackage);
                break;
              case 274:
                if (this.batchFeedShowCountPackage == null) {
                   this.batchFeedShowCountPackage = new ClientContent$BatchFeedShowCountPackage();
                }
                p0.readMessage(this.batchFeedShowCountPackage);
                break;
              case 290:
                if (this.videoEditOperationPackage == null) {
                   this.videoEditOperationPackage = new ClientContent$VideoEditOperationPackage();
                }
                p0.readMessage(this.videoEditOperationPackage);
                break;
              case 298:
                if (this.videoEditFeaturesStatusPackage == null) {
                   this.videoEditFeaturesStatusPackage = new ClientContent$VideoEditFeaturesStatusPackage();
                }
                p0.readMessage(this.videoEditFeaturesStatusPackage);
                break;
              case 306:
                if (this.batchFeatureSwitchPackage == null) {
                   this.batchFeatureSwitchPackage = new ClientContent$BatchFeatureSwitchPackage();
                }
                p0.readMessage(this.batchFeatureSwitchPackage);
                break;
              case 314:
                if (this.commodityDetailPackage == null) {
                   this.commodityDetailPackage = new ClientContent$CommodityDetailPackage();
                }
                p0.readMessage(this.commodityDetailPackage);
                break;
              case 322:
                if (this.batchUserPackage == null) {
                   this.batchUserPackage = new ClientContent$BatchUserPackage();
                }
                p0.readMessage(this.batchUserPackage);
                break;
              case 330:
                if (this.cameraRecordFeaturesStatusPackage == null) {
                   this.cameraRecordFeaturesStatusPackage = new ClientContent$CameraRecordFeaturesStatusPackage();
                }
                p0.readMessage(this.cameraRecordFeaturesStatusPackage);
                break;
              case 338:
                if (this.kSongDetailPackage == null) {
                   this.kSongDetailPackage = new ClientContent$KSongDetailPackage();
                }
                p0.readMessage(this.kSongDetailPackage);
                break;
              case 354:
                if (this.photoSeekBarDragPackage == null) {
                   this.photoSeekBarDragPackage = new ClientContent$PhotoSeekBarDragPackage();
                }
                p0.readMessage(this.photoSeekBarDragPackage);
                break;
              case 370:
                if (this.magicFaceShowPackage == null) {
                   this.magicFaceShowPackage = new ClientContent$MagicFaceShowPackage();
                }
                p0.readMessage(this.magicFaceShowPackage);
                break;
              case 378:
                if (this.productionEditOperationPackage == null) {
                   this.productionEditOperationPackage = new ClientContent$ProductionEditOperationPackage();
                }
                p0.readMessage(this.productionEditOperationPackage);
                break;
              case 386:
                if (this.featuresElementStayLengthPackage == null) {
                   this.featuresElementStayLengthPackage = new ClientContent$FeaturesElementStayLengthPackage();
                }
                p0.readMessage(this.featuresElementStayLengthPackage);
                break;
              case 394:
                if (this.beautyStatusPackage == null) {
                   this.beautyStatusPackage = new ClientContent$BeautyStatusPackage();
                }
                p0.readMessage(this.beautyStatusPackage);
                break;
              case 402:
                if (this.batchMusicDetailPackage == null) {
                   this.batchMusicDetailPackage = new ClientContent$BatchMusicDetailPackage();
                }
                p0.readMessage(this.batchMusicDetailPackage);
                break;
              case 410:
                if (this.batchEditEffectPackage == null) {
                   this.batchEditEffectPackage = new ClientContent$BatchEditEffectPackage();
                }
                p0.readMessage(this.batchEditEffectPackage);
                break;
              case 426:
                if (this.batchThemePackage == null) {
                   this.batchThemePackage = new ClientContent$BatchThemePackage();
                }
                p0.readMessage(this.batchThemePackage);
                break;
              case 434:
                if (this.batchCommodityDetailPackage == null) {
                   this.batchCommodityDetailPackage = new ClientContent$BatchCommodityDetailPackage();
                }
                p0.readMessage(this.batchCommodityDetailPackage);
                break;
              case 458:
                if (this.batchFilterDetailPackage == null) {
                   this.batchFilterDetailPackage = new ClientContent$BatchFilterDetailPackage();
                }
                p0.readMessage(this.batchFilterDetailPackage);
                break;
              case 466:
                if (this.recordInfoPackage == null) {
                   this.recordInfoPackage = new ClientContent$RecordInfoPackage();
                }
                p0.readMessage(this.recordInfoPackage);
                break;
              case 474:
                if (this.recordFpsInfoPackage == null) {
                   this.recordFpsInfoPackage = new ClientContent$RecordFpsInfoPackage();
                }
                p0.readMessage(this.recordFpsInfoPackage);
                break;
              case 490:
                if (this.videoPreviewInfoPackage == null) {
                   this.videoPreviewInfoPackage = new ClientContent$VideoPreviewInfoPackage();
                }
                p0.readMessage(this.videoPreviewInfoPackage);
                break;
              case 498:
                if (this.importOriginVideoPackge == null) {
                   this.importOriginVideoPackge = new ClientContent$ImportOriginVideoPackage();
                }
                p0.readMessage(this.importOriginVideoPackge);
                break;
              case 506:
                if (this.importOriginPhotoPackage == null) {
                   this.importOriginPhotoPackage = new ClientContent$ImportOriginPhotoPackage();
                }
                p0.readMessage(this.importOriginPhotoPackage);
                break;
              case 522:
                if (this.videoClipDetailPackage == null) {
                   this.videoClipDetailPackage = new ClientContent$VideoClipDetailPackage();
                }
                p0.readMessage(this.videoClipDetailPackage);
                break;
              case 530:
                if (this.videoEncodingDetailPackage == null) {
                   this.videoEncodingDetailPackage = new ClientContent$VideoEncodingDetailPackage();
                }
                p0.readMessage(this.videoEncodingDetailPackage);
                break;
              case 546:
                if (this.batchSeekBarPackage == null) {
                   this.batchSeekBarPackage = new ClientContent$BatchSeekBarDragPackage();
                }
                p0.readMessage(this.batchSeekBarPackage);
                break;
              case 562:
                if (this.musicAdjustDetailPackage == null) {
                   this.musicAdjustDetailPackage = new ClientContent$MusicAdjustDetailPackage();
                }
                p0.readMessage(this.musicAdjustDetailPackage);
                break;
              case 570:
                if (this.chatPackage == null) {
                   this.chatPackage = new ClientContent$ChatPackage();
                }
                p0.readMessage(this.chatPackage);
                break;
              case 578:
                if (this.initMethodCostPackage == null) {
                   this.initMethodCostPackage = new ClientContent$InitMethodCostPackage();
                }
                p0.readMessage(this.initMethodCostPackage);
                break;
              case 586:
                if (this.videoWatermarkDetailPackage == null) {
                   this.videoWatermarkDetailPackage = new ClientContent$VideoWatermarkDetailPackage();
                }
                p0.readMessage(this.videoWatermarkDetailPackage);
                break;
              case 602:
                if (this.chinaMobileQuickLoginValidateResultPackage == null) {
                   this.chinaMobileQuickLoginValidateResultPackage = new ClientContent$ChinaMobileQuickLoginValidateResultPackage();
                }
                p0.readMessage(this.chinaMobileQuickLoginValidateResultPackage);
                break;
              case 610:
                if (this.beautyMakeUpStatusPacakge == null) {
                   this.beautyMakeUpStatusPacakge = new ClientContent$BeautyMakeUpStatusPackage();
                }
                p0.readMessage(this.beautyMakeUpStatusPacakge);
                break;
              case 618:
                if (this.batchBeautyMakeUpStatusPackage == null) {
                   this.batchBeautyMakeUpStatusPackage = new ClientContent$BatchBeautyMakeUpStatusPackage();
                }
                p0.readMessage(this.batchBeautyMakeUpStatusPackage);
                break;
              case 626:
                if (this.batchStickerInfoPackage == null) {
                   this.batchStickerInfoPackage = new ClientContent$BatchStickerInfoPackage();
                }
                p0.readMessage(this.batchStickerInfoPackage);
                break;
              case 634:
                if (this.livePkPackage == null) {
                   this.livePkPackage = new ClientContent$LivePkPackage();
                }
                p0.readMessage(this.livePkPackage);
                break;
              case 642:
                if (this.batchMomentMessagePackage == null) {
                   this.batchMomentMessagePackage = new ClientContent$BatchMomentMessagePackage();
                }
                p0.readMessage(this.batchMomentMessagePackage);
                break;
              case 682:
                if (this.gameZoneGamePackage == null) {
                   this.gameZoneGamePackage = new ClientContent$GameZoneGamePackage();
                }
                p0.readMessage(this.gameZoneGamePackage);
                break;
              case 714:
                if (this.musicLoadingStatusPackage == null) {
                   this.musicLoadingStatusPackage = new ClientContent$MusicLoadingStatusPackage();
                }
                p0.readMessage(this.musicLoadingStatusPackage);
                break;
              case 730:
                if (this.morelistPackage == null) {
                   this.morelistPackage = new ClientContent$MorelistPackage();
                }
                p0.readMessage(this.morelistPackage);
                break;
              case 874:
                if (this.liveChatPackage == null) {
                   this.liveChatPackage = new ClientContent$LiveChatPackageV2();
                }
                p0.readMessage(this.liveChatPackage);
                break;
              case 906:
                if (this.liveVoicePartyPackage == null) {
                   this.liveVoicePartyPackage = new ClientContent$LiveVoicePartyPackageV2();
                }
                p0.readMessage(this.liveVoicePartyPackage);
                break;
              case 930:
                if (this.musicPlayStatPackage == null) {
                   this.musicPlayStatPackage = new ClientContent$MusicPlayStatPackageV2();
                }
                p0.readMessage(this.musicPlayStatPackage);
                break;
              case 986:
                if (this.atlasEditPackage == null) {
                   this.atlasEditPackage = new ClientContent$AtlasEditPackageV2();
                }
                p0.readMessage(this.atlasEditPackage);
                break;
              case 994:
                if (this.notificationPackage == null) {
                   this.notificationPackage = new ClientContent$NotificationPackageV2();
                }
                p0.readMessage(this.notificationPackage);
                break;
              case 1018:
                if (this.seriesPackage == null) {
                   this.seriesPackage = new ClientContent$SeriesPackageV2();
                }
                p0.readMessage(this.seriesPackage);
                break;
              case 1026:
                if (this.batchSeriesPackage == null) {
                   this.batchSeriesPackage = new ClientContent$BatchSeriesPackageV2();
                }
                p0.readMessage(this.batchSeriesPackage);
                break;
              case 1034:
                if (this.moreInfoPackage == null) {
                   this.moreInfoPackage = new ClientContent$MoreInfoPackageV2();
                }
                p0.readMessage(this.moreInfoPackage);
                break;
              case 1042:
                if (this.batchMoreInfoPackage == null) {
                   this.batchMoreInfoPackage = new ClientContent$BatchMoreInfoPackageV2();
                }
                p0.readMessage(this.batchMoreInfoPackage);
                break;
              case 1066:
                if (this.gossipMessagePackage == null) {
                   this.gossipMessagePackage = new ClientContent$GossipMessagePackageV2();
                }
                p0.readMessage(this.gossipMessagePackage);
                break;
              case 1090:
                if (this.targetUserPackage == null) {
                   this.targetUserPackage = new ClientContent$TargetUserPackageV2();
                }
                p0.readMessage(this.targetUserPackage);
                break;
              case 1122:
                if (this.collectionPackage == null) {
                   this.collectionPackage = new ClientContent$CollectionPackageV2();
                }
                p0.readMessage(this.collectionPackage);
                break;
              case 1130:
                if (this.batchCollectionPackage == null) {
                   this.batchCollectionPackage = new ClientContent$BatchCollectionPackageV2();
                }
                p0.readMessage(this.batchCollectionPackage);
                break;
              case 1178:
                if (this.businessPackage == null) {
                   this.businessPackage = new ClientContent$BusinessPackageV2();
                }
                p0.readMessage(this.businessPackage);
                break;
              case 1194:
                if (this.liveResourceFilePackage == null) {
                   this.liveResourceFilePackage = new ClientContent$LiveResourceFilePackage();
                }
                p0.readMessage(this.liveResourceFilePackage);
                break;
              case 1202:
                if (this.liveBarrageInfoPackage == null) {
                   this.liveBarrageInfoPackage = new ClientContent$LiveBarrageInfoPackage();
                }
                p0.readMessage(this.liveBarrageInfoPackage);
                break;
              case 1210:
                if (this.localIntelligentAlbumPackage == null) {
                   this.localIntelligentAlbumPackage = new ClientContent$LocalIntelligentAlbumPackage();
                }
                p0.readMessage(this.localIntelligentAlbumPackage);
                break;
              case 1218:
                if (this.batchLocalIntelligentAlbumPackage == null) {
                   this.batchLocalIntelligentAlbumPackage = new ClientContent$BatchLocalIntelligentAlbumPackage();
                }
                p0.readMessage(this.batchLocalIntelligentAlbumPackage);
                break;
              case 1226:
                if (this.imUserPackage == null) {
                   this.imUserPackage = new ClientContent$IMUserPackage();
                }
                p0.readMessage(this.imUserPackage);
                break;
              case 1234:
                if (this.imPersonalSessionPackage == null) {
                   this.imPersonalSessionPackage = new ClientContent$IMPersonalSessionPackage();
                }
                p0.readMessage(this.imPersonalSessionPackage);
                break;
              case 1242:
                if (this.imGroupSessionPackage == null) {
                   this.imGroupSessionPackage = new ClientContent$IMGroupSessionPackage();
                }
                p0.readMessage(this.imGroupSessionPackage);
                break;
              case 1250:
                if (this.imMessagePackage == null) {
                   this.imMessagePackage = new ClientContent$IMMessagePackage();
                }
                p0.readMessage(this.imMessagePackage);
                break;
              case 1258:
                if (this.liveFansGroupPackage == null) {
                   this.liveFansGroupPackage = new ClientContent$LiveFansGroupPackage();
                }
                p0.readMessage(this.liveFansGroupPackage);
                break;
              case 1274:
                if (this.styleStatusPackage == null) {
                   this.styleStatusPackage = new ClientContent$StyleStatusPackage();
                }
                p0.readMessage(this.styleStatusPackage);
                break;
              case 1282:
                if (this.momentMessagePackage == null) {
                   this.momentMessagePackage = new ClientContent$MomentMessagePackage();
                }
                p0.readMessage(this.momentMessagePackage);
                break;
              case 1290:
                if (this.businessProfilePackage == null) {
                   this.businessProfilePackage = new ClientContent$BusinessProfilePackage();
                }
                p0.readMessage(this.businessProfilePackage);
                break;
              case 1298:
                if (this.redPackage == null) {
                   this.redPackage = new ClientContent$RedPackPackage();
                }
                p0.readMessage(this.redPackage);
                break;
              case 1322:
                if (this.downloadResourcePackage == null) {
                   this.downloadResourcePackage = new ClientContent$DownloadResourcePackage();
                }
                p0.readMessage(this.downloadResourcePackage);
                break;
              case 1330:
                if (this.liveAdminOperatePackage == null) {
                   this.liveAdminOperatePackage = new ClientContent$LiveAdminOperatePackage();
                }
                p0.readMessage(this.liveAdminOperatePackage);
                break;
              case 1338:
                if (this.liveRobotSpeechRecognitionPackage == null) {
                   this.liveRobotSpeechRecognitionPackage = new ClientContent$LiveRobotSpeechRecognitionPackage();
                }
                p0.readMessage(this.liveRobotSpeechRecognitionPackage);
                break;
              case 1346:
                if (this.liveRobotTtsPackage == null) {
                   this.liveRobotTtsPackage = new ClientContent$LiveRobotTtsPackage();
                }
                p0.readMessage(this.liveRobotTtsPackage);
                break;
              case 1354:
                if (this.ksOrderInfoPackage == null) {
                   this.ksOrderInfoPackage = new ClientContent$KsOrderInfoPackage();
                }
                p0.readMessage(this.ksOrderInfoPackage);
                break;
              case 1362:
                if (this.liveSharePackage == null) {
                   this.liveSharePackage = new ClientContent$LiveSharePackage();
                }
                p0.readMessage(this.liveSharePackage);
                break;
              case 1378:
                if (this.batchKuaishanVideoPackage == null) {
                   this.batchKuaishanVideoPackage = new ClientContent$BatchKuaishanVideoPackage();
                }
                p0.readMessage(this.batchKuaishanVideoPackage);
                break;
              case 1386:
                if (this.districtRankPackage == null) {
                   this.districtRankPackage = new ClientContent$DistrictRankPackage();
                }
                p0.readMessage(this.districtRankPackage);
                break;
              case 1394:
                if (this.thirdPartyAppPackage == null) {
                   this.thirdPartyAppPackage = new ClientContent$ThirdPartyAppPackage();
                }
                p0.readMessage(this.thirdPartyAppPackage);
                break;
              case 1402:
                if (this.liveRobotPackage == null) {
                   this.liveRobotPackage = new ClientContent$LiveRobotPackage();
                }
                p0.readMessage(this.liveRobotPackage);
                break;
              case 1418:
                if (this.liveVoicePartyTheaterPackage == null) {
                   this.liveVoicePartyTheaterPackage = new ClientContent$LiveVoicePartyTheaterPackage();
                }
                p0.readMessage(this.liveVoicePartyTheaterPackage);
                break;
              case 1426:
                if (this.liveVoicePartyTeampkPackage == null) {
                   this.liveVoicePartyTeampkPackage = new ClientContent$LiveVoicePartyTeamPkPackage();
                }
                p0.readMessage(this.liveVoicePartyTeampkPackage);
                break;
              case 1434:
                if (this.kuaishanVideoPackage == null) {
                   this.kuaishanVideoPackage = new ClientContent$KuaishanVideoPackage();
                }
                p0.readMessage(this.kuaishanVideoPackage);
                break;
              case 1442:
                if (this.bodyUserPackage == null) {
                   this.bodyUserPackage = new ClientContent$BodyUsePackage();
                }
                p0.readMessage(this.bodyUserPackage);
                break;
              case 1450:
                if (this.danmakuShowPackage == null) {
                   this.danmakuShowPackage = new ClientContent$DanmakuShowPackage();
                }
                p0.readMessage(this.danmakuShowPackage);
                break;
              case 1458:
                if (this.danmakuPackage == null) {
                   this.danmakuPackage = new ClientContent$DanmakuPackage();
                }
                p0.readMessage(this.danmakuPackage);
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
       ClientContent$ContentPackage tuserPackage = this.userPackage;
       if (tuserPackage != null) {
          p0.writeMessage(1, tuserPackage);
       }
       tuserPackage = this.liveStreamPackage;
       if (tuserPackage != null) {
          p0.writeMessage(2, tuserPackage);
       }
       tuserPackage = this.screenPackage;
       if (tuserPackage != null) {
          p0.writeMessage(3, tuserPackage);
       }
       tuserPackage = this.paymentPackage;
       if (tuserPackage != null) {
          p0.writeMessage(4, tuserPackage);
       }
       tuserPackage = this.giftPackage;
       if (tuserPackage != null) {
          p0.writeMessage(5, tuserPackage);
       }
       tuserPackage = this.soundEffectPackage;
       if (tuserPackage != null) {
          p0.writeMessage(6, tuserPackage);
       }
       tuserPackage = this.messagePackage;
       if (tuserPackage != null) {
          p0.writeMessage(7, tuserPackage);
       }
       tuserPackage = this.photoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(8, tuserPackage);
       }
       tuserPackage = this.videoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(9, tuserPackage);
       }
       tuserPackage = this.commentPackage;
       if (tuserPackage != null) {
          p0.writeMessage(10, tuserPackage);
       }
       tuserPackage = this.localMusicPackage;
       if (tuserPackage != null) {
          p0.writeMessage(11, tuserPackage);
       }
       tuserPackage = this.searchResultPackage;
       if (tuserPackage != null) {
          p0.writeMessage(12, tuserPackage);
       }
       tuserPackage = this.thirdPartyRecommendUserListItemPackage;
       if (tuserPackage != null) {
          p0.writeMessage(13, tuserPackage);
       }
       tuserPackage = this.atlasPackage;
       if (tuserPackage != null) {
          p0.writeMessage(14, tuserPackage);
       }
       tuserPackage = this.bannerPackage;
       if (tuserPackage != null) {
          p0.writeMessage(15, tuserPackage);
       }
       tuserPackage = this.profilePackage;
       if (tuserPackage != null) {
          p0.writeMessage(16, tuserPackage);
       }
       tuserPackage = this.thirdPartyBindPackage;
       if (tuserPackage != null) {
          p0.writeMessage(17, tuserPackage);
       }
       tuserPackage = this.loginSourcePackage;
       if (tuserPackage != null) {
          p0.writeMessage(18, tuserPackage);
       }
       tuserPackage = this.referPhotoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(19, tuserPackage);
       }
       tuserPackage = this.tagPackage;
       if (tuserPackage != null) {
          p0.writeMessage(20, tuserPackage);
       }
       tuserPackage = this.liveBroadcastPackage;
       if (tuserPackage != null) {
          p0.writeMessage(21, tuserPackage);
       }
       tuserPackage = this.effectPackage;
       if (tuserPackage != null) {
          p0.writeMessage(22, tuserPackage);
       }
       tuserPackage = this.featureSwitchPackage;
       if (tuserPackage != null) {
          p0.writeMessage(23, tuserPackage);
       }
       tuserPackage = this.importMusicFromPcPackage;
       if (tuserPackage != null) {
          p0.writeMessage(24, tuserPackage);
       }
       tuserPackage = this.liveAudiencePackage;
       if (tuserPackage != null) {
          p0.writeMessage(25, tuserPackage);
       }
       tuserPackage = this.eCommerceLinkPackage;
       if (tuserPackage != null) {
          p0.writeMessage(26, tuserPackage);
       }
       tuserPackage = this.commentShowPackage;
       if (tuserPackage != null) {
          p0.writeMessage(27, tuserPackage);
       }
       tuserPackage = this.tagShowPackage;
       if (tuserPackage != null) {
          p0.writeMessage(28, tuserPackage);
       }
       tuserPackage = this.photoShowPackage;
       if (tuserPackage != null) {
          p0.writeMessage(29, tuserPackage);
       }
       tuserPackage = this.batchVisitDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(30, tuserPackage);
       }
       tuserPackage = this.singerDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(31, tuserPackage);
       }
       tuserPackage = this.musicDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(32, tuserPackage);
       }
       tuserPackage = this.batchFeedShowCountPackage;
       if (tuserPackage != null) {
          p0.writeMessage(34, tuserPackage);
       }
       tuserPackage = this.videoEditOperationPackage;
       if (tuserPackage != null) {
          p0.writeMessage(36, tuserPackage);
       }
       tuserPackage = this.videoEditFeaturesStatusPackage;
       if (tuserPackage != null) {
          p0.writeMessage(37, tuserPackage);
       }
       tuserPackage = this.batchFeatureSwitchPackage;
       if (tuserPackage != null) {
          p0.writeMessage(38, tuserPackage);
       }
       tuserPackage = this.commodityDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(39, tuserPackage);
       }
       tuserPackage = this.batchUserPackage;
       if (tuserPackage != null) {
          p0.writeMessage(40, tuserPackage);
       }
       tuserPackage = this.cameraRecordFeaturesStatusPackage;
       if (tuserPackage != null) {
          p0.writeMessage(41, tuserPackage);
       }
       tuserPackage = this.kSongDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(42, tuserPackage);
       }
       tuserPackage = this.photoSeekBarDragPackage;
       if (tuserPackage != null) {
          p0.writeMessage(44, tuserPackage);
       }
       tuserPackage = this.magicFaceShowPackage;
       if (tuserPackage != null) {
          p0.writeMessage(46, tuserPackage);
       }
       tuserPackage = this.productionEditOperationPackage;
       if (tuserPackage != null) {
          p0.writeMessage(47, tuserPackage);
       }
       tuserPackage = this.featuresElementStayLengthPackage;
       if (tuserPackage != null) {
          p0.writeMessage(48, tuserPackage);
       }
       tuserPackage = this.beautyStatusPackage;
       if (tuserPackage != null) {
          p0.writeMessage(49, tuserPackage);
       }
       tuserPackage = this.batchMusicDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(50, tuserPackage);
       }
       tuserPackage = this.batchEditEffectPackage;
       if (tuserPackage != null) {
          p0.writeMessage(51, tuserPackage);
       }
       tuserPackage = this.batchThemePackage;
       if (tuserPackage != null) {
          p0.writeMessage(53, tuserPackage);
       }
       tuserPackage = this.batchCommodityDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(54, tuserPackage);
       }
       tuserPackage = this.batchFilterDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(57, tuserPackage);
       }
       tuserPackage = this.recordInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(58, tuserPackage);
       }
       tuserPackage = this.recordFpsInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(59, tuserPackage);
       }
       tuserPackage = this.videoPreviewInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(61, tuserPackage);
       }
       tuserPackage = this.importOriginVideoPackge;
       if (tuserPackage != null) {
          p0.writeMessage(62, tuserPackage);
       }
       tuserPackage = this.importOriginPhotoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(63, tuserPackage);
       }
       tuserPackage = this.videoClipDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(65, tuserPackage);
       }
       tuserPackage = this.videoEncodingDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(66, tuserPackage);
       }
       tuserPackage = this.batchSeekBarPackage;
       if (tuserPackage != null) {
          p0.writeMessage(68, tuserPackage);
       }
       tuserPackage = this.musicAdjustDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(70, tuserPackage);
       }
       tuserPackage = this.chatPackage;
       if (tuserPackage != null) {
          p0.writeMessage(71, tuserPackage);
       }
       tuserPackage = this.initMethodCostPackage;
       if (tuserPackage != null) {
          p0.writeMessage(72, tuserPackage);
       }
       tuserPackage = this.videoWatermarkDetailPackage;
       if (tuserPackage != null) {
          p0.writeMessage(73, tuserPackage);
       }
       tuserPackage = this.chinaMobileQuickLoginValidateResultPackage;
       if (tuserPackage != null) {
          p0.writeMessage(75, tuserPackage);
       }
       tuserPackage = this.beautyMakeUpStatusPacakge;
       if (tuserPackage != null) {
          p0.writeMessage(76, tuserPackage);
       }
       tuserPackage = this.batchBeautyMakeUpStatusPackage;
       if (tuserPackage != null) {
          p0.writeMessage(77, tuserPackage);
       }
       tuserPackage = this.batchStickerInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(78, tuserPackage);
       }
       tuserPackage = this.livePkPackage;
       if (tuserPackage != null) {
          p0.writeMessage(79, tuserPackage);
       }
       tuserPackage = this.batchMomentMessagePackage;
       if (tuserPackage != null) {
          p0.writeMessage(80, tuserPackage);
       }
       tuserPackage = this.gameZoneGamePackage;
       if (tuserPackage != null) {
          p0.writeMessage(85, tuserPackage);
       }
       tuserPackage = this.musicLoadingStatusPackage;
       if (tuserPackage != null) {
          p0.writeMessage(89, tuserPackage);
       }
       tuserPackage = this.morelistPackage;
       if (tuserPackage != null) {
          p0.writeMessage(91, tuserPackage);
       }
       tuserPackage = this.liveChatPackage;
       if (tuserPackage != null) {
          p0.writeMessage(109, tuserPackage);
       }
       tuserPackage = this.liveVoicePartyPackage;
       if (tuserPackage != null) {
          p0.writeMessage(113, tuserPackage);
       }
       tuserPackage = this.musicPlayStatPackage;
       if (tuserPackage != null) {
          p0.writeMessage(116, tuserPackage);
       }
       tuserPackage = this.atlasEditPackage;
       if (tuserPackage != null) {
          p0.writeMessage(123, tuserPackage);
       }
       tuserPackage = this.notificationPackage;
       if (tuserPackage != null) {
          p0.writeMessage(124, tuserPackage);
       }
       tuserPackage = this.seriesPackage;
       if (tuserPackage != null) {
          p0.writeMessage(127, tuserPackage);
       }
       tuserPackage = this.batchSeriesPackage;
       if (tuserPackage != null) {
          p0.writeMessage(128, tuserPackage);
       }
       tuserPackage = this.moreInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(129, tuserPackage);
       }
       tuserPackage = this.batchMoreInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(130, tuserPackage);
       }
       tuserPackage = this.gossipMessagePackage;
       if (tuserPackage != null) {
          p0.writeMessage(133, tuserPackage);
       }
       tuserPackage = this.targetUserPackage;
       if (tuserPackage != null) {
          p0.writeMessage(136, tuserPackage);
       }
       tuserPackage = this.collectionPackage;
       if (tuserPackage != null) {
          p0.writeMessage(140, tuserPackage);
       }
       tuserPackage = this.batchCollectionPackage;
       if (tuserPackage != null) {
          p0.writeMessage(141, tuserPackage);
       }
       tuserPackage = this.businessPackage;
       if (tuserPackage != null) {
          p0.writeMessage(147, tuserPackage);
       }
       tuserPackage = this.liveResourceFilePackage;
       if (tuserPackage != null) {
          p0.writeMessage(149, tuserPackage);
       }
       tuserPackage = this.liveBarrageInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(150, tuserPackage);
       }
       tuserPackage = this.localIntelligentAlbumPackage;
       if (tuserPackage != null) {
          p0.writeMessage(151, tuserPackage);
       }
       tuserPackage = this.batchLocalIntelligentAlbumPackage;
       if (tuserPackage != null) {
          p0.writeMessage(152, tuserPackage);
       }
       tuserPackage = this.imUserPackage;
       if (tuserPackage != null) {
          p0.writeMessage(153, tuserPackage);
       }
       tuserPackage = this.imPersonalSessionPackage;
       if (tuserPackage != null) {
          p0.writeMessage(154, tuserPackage);
       }
       tuserPackage = this.imGroupSessionPackage;
       if (tuserPackage != null) {
          p0.writeMessage(155, tuserPackage);
       }
       tuserPackage = this.imMessagePackage;
       if (tuserPackage != null) {
          p0.writeMessage(156, tuserPackage);
       }
       tuserPackage = this.liveFansGroupPackage;
       if (tuserPackage != null) {
          p0.writeMessage(157, tuserPackage);
       }
       tuserPackage = this.styleStatusPackage;
       if (tuserPackage != null) {
          p0.writeMessage(159, tuserPackage);
       }
       tuserPackage = this.momentMessagePackage;
       if (tuserPackage != null) {
          p0.writeMessage(160, tuserPackage);
       }
       tuserPackage = this.businessProfilePackage;
       if (tuserPackage != null) {
          p0.writeMessage(161, tuserPackage);
       }
       tuserPackage = this.redPackage;
       if (tuserPackage != null) {
          p0.writeMessage(162, tuserPackage);
       }
       tuserPackage = this.downloadResourcePackage;
       if (tuserPackage != null) {
          p0.writeMessage(165, tuserPackage);
       }
       tuserPackage = this.liveAdminOperatePackage;
       if (tuserPackage != null) {
          p0.writeMessage(166, tuserPackage);
       }
       tuserPackage = this.liveRobotSpeechRecognitionPackage;
       if (tuserPackage != null) {
          p0.writeMessage(167, tuserPackage);
       }
       tuserPackage = this.liveRobotTtsPackage;
       if (tuserPackage != null) {
          p0.writeMessage(168, tuserPackage);
       }
       tuserPackage = this.ksOrderInfoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(169, tuserPackage);
       }
       tuserPackage = this.liveSharePackage;
       if (tuserPackage != null) {
          p0.writeMessage(170, tuserPackage);
       }
       tuserPackage = this.batchKuaishanVideoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(172, tuserPackage);
       }
       tuserPackage = this.districtRankPackage;
       if (tuserPackage != null) {
          p0.writeMessage(173, tuserPackage);
       }
       tuserPackage = this.thirdPartyAppPackage;
       if (tuserPackage != null) {
          p0.writeMessage(174, tuserPackage);
       }
       tuserPackage = this.liveRobotPackage;
       if (tuserPackage != null) {
          p0.writeMessage(175, tuserPackage);
       }
       tuserPackage = this.liveVoicePartyTheaterPackage;
       if (tuserPackage != null) {
          p0.writeMessage(177, tuserPackage);
       }
       tuserPackage = this.liveVoicePartyTeampkPackage;
       if (tuserPackage != null) {
          p0.writeMessage(178, tuserPackage);
       }
       tuserPackage = this.kuaishanVideoPackage;
       if (tuserPackage != null) {
          p0.writeMessage(179, tuserPackage);
       }
       tuserPackage = this.bodyUserPackage;
       if (tuserPackage != null) {
          p0.writeMessage(180, tuserPackage);
       }
       tuserPackage = this.danmakuShowPackage;
       if (tuserPackage != null) {
          p0.writeMessage(181, tuserPackage);
       }
       tuserPackage = this.danmakuPackage;
       if (tuserPackage != null) {
          p0.writeMessage(182, tuserPackage);
       }
       super.writeTo(p0);
       return;
    }
}
