package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$KwaiMusicStationPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BusinessPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MusicBillboardPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicChannelPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveImportMusicPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchImportPartPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$TargetUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveChatBetweenAnchorsPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LaunchTimeDifferencePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$GossipMessagePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ApplicationStateInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchMoreInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchSeriesPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$NotificationPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$AtlasEditPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$OutsideH5PagePackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$RedPointPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$RedPointDetailPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MusicPlayStatPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveQualityPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchKwaiMusicStationPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveChatPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchUserQuizPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$FanstopH5JumpPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ExamplePackage;

public final class ClientContentWrapper$ContentWrapper extends MessageNano	// class@00130c
{
    public ClientContentWrapper$ApplicationStateInfoPackage applicationStateInfoPackage;
    public ClientContentWrapper$AtlasEditPackage atlasEditPackage;
    public ClientContentWrapper$BatchImportPartPackage batchImportPartPackage;
    public ClientContentWrapper$BatchKwaiMusicStationPackage batchKwaiMusicStationPackage;
    public ClientContentWrapper$BatchMoreInfoPackage batchMoreInfoPackage;
    public ClientContentWrapper$BatchSeriesPackage batchSeriesPackage;
    public ClientContentWrapper$BatchUserQuizPackage batchUserQuizPackage;
    public ClientContentWrapper$BusinessPackage businessPackage;
    public ClientContentWrapper$ExamplePackage examplePackage;
    public ClientContentWrapper$FanstopH5JumpPackage fanstopH5JumpPackage;
    public ClientContentWrapper$GossipMessagePackage gossipMessagePackage;
    public ClientContentWrapper$KwaiMusicStationPackage kwaiMusicStationPackage;
    public ClientContentWrapper$LaunchTimeDifferencePackage launchTimeDifferencePackage;
    public ClientContentWrapper$LiveChatBetweenAnchorsPackage liveChatBetweenAnchorsPackage;
    public ClientContentWrapper$LiveChatPackage liveChatPackage;
    public ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage liveCommentVoiceRecognizeInputPackage;
    public ClientContentWrapper$LiveImportMusicPackage liveImportMusicPackage;
    public ClientContentWrapper$LiveMusicChannelPackage liveMusicChannelPackage;
    public ClientContentWrapper$LiveMusicPackage liveMusicPackage;
    public ClientContentWrapper$LiveQualityPackage liveQualityPackage;
    public ClientContentWrapper$LiveVoicePartyPackage liveVoicePartyPackage;
    public ClientContentWrapper$MoreInfoPackage moreInfoPackage;
    public ClientContentWrapper$MusicBillboardPackage musicBillboardPackage;
    public ClientContentWrapper$MusicPlayStatPackage musicPlayStatPackage;
    public ClientContentWrapper$NotificationPackage notificationPackage;
    public ClientContentWrapper$OutsideH5PagePackage outsideH5PagePackage;
    public ClientContentWrapper$RedPointDetailPackage redPointDetailPackage;
    public ClientContentWrapper$RedPointPackage redPointPackage;
    public ClientContent$SearchResultPackage searchResultPackage;
    public ClientContentWrapper$SeriesPackage seriesPackage;
    public ClientContentWrapper$TargetUserPackage targetUserPackage;
    public static ClientContentWrapper$ContentWrapper[] _emptyArray;

    public void ClientContentWrapper$ContentWrapper(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$ContentWrapper[] emptyArray(){
       if (ClientContentWrapper$ContentWrapper._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$ContentWrapper._emptyArray == null) {
             ClientContentWrapper$ContentWrapper[] uContentWrap = new ClientContentWrapper$ContentWrapper[0];
             ClientContentWrapper$ContentWrapper._emptyArray = uContentWrap;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$ContentWrapper._emptyArray;
    }
    public static ClientContentWrapper$ContentWrapper parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$ContentWrapper().mergeFrom(p0);
    }
    public static ClientContentWrapper$ContentWrapper parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$ContentWrapper(), p0);
    }
    public ClientContentWrapper$ContentWrapper clear(){
       this.examplePackage = null;
       this.fanstopH5JumpPackage = null;
       this.batchUserQuizPackage = null;
       this.liveChatPackage = null;
       this.batchKwaiMusicStationPackage = null;
       this.liveQualityPackage = null;
       this.liveVoicePartyPackage = null;
       this.liveMusicPackage = null;
       this.musicPlayStatPackage = null;
       this.redPointDetailPackage = null;
       this.redPointPackage = null;
       this.outsideH5PagePackage = null;
       this.atlasEditPackage = null;
       this.notificationPackage = null;
       this.seriesPackage = null;
       this.batchSeriesPackage = null;
       this.moreInfoPackage = null;
       this.batchMoreInfoPackage = null;
       this.applicationStateInfoPackage = null;
       this.gossipMessagePackage = null;
       this.launchTimeDifferencePackage = null;
       this.liveChatBetweenAnchorsPackage = null;
       this.targetUserPackage = null;
       this.batchImportPartPackage = null;
       this.searchResultPackage = null;
       this.liveImportMusicPackage = null;
       this.liveMusicChannelPackage = null;
       this.musicBillboardPackage = null;
       this.businessPackage = null;
       this.liveCommentVoiceRecognizeInputPackage = null;
       this.kwaiMusicStationPackage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$ContentWrapper texamplePack = this.examplePackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, texamplePack);
       }
       texamplePack = this.fanstopH5JumpPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, texamplePack);
       }
       texamplePack = this.batchUserQuizPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, texamplePack);
       }
       texamplePack = this.liveChatPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, texamplePack);
       }
       texamplePack = this.batchKwaiMusicStationPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(11, texamplePack);
       }
       texamplePack = this.liveQualityPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, texamplePack);
       }
       texamplePack = this.liveVoicePartyPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, texamplePack);
       }
       texamplePack = this.liveMusicPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(14, texamplePack);
       }
       texamplePack = this.musicPlayStatPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(16, texamplePack);
       }
       texamplePack = this.redPointDetailPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(18, texamplePack);
       }
       texamplePack = this.redPointPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(19, texamplePack);
       }
       texamplePack = this.outsideH5PagePackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(20, texamplePack);
       }
       texamplePack = this.atlasEditPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(23, texamplePack);
       }
       texamplePack = this.notificationPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(24, texamplePack);
       }
       texamplePack = this.seriesPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(27, texamplePack);
       }
       texamplePack = this.batchSeriesPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(28, texamplePack);
       }
       texamplePack = this.moreInfoPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(29, texamplePack);
       }
       texamplePack = this.batchMoreInfoPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(30, texamplePack);
       }
       texamplePack = this.applicationStateInfoPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(31, texamplePack);
       }
       texamplePack = this.gossipMessagePackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(33, texamplePack);
       }
       texamplePack = this.launchTimeDifferencePackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(34, texamplePack);
       }
       texamplePack = this.liveChatBetweenAnchorsPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(35, texamplePack);
       }
       texamplePack = this.targetUserPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(36, texamplePack);
       }
       texamplePack = this.batchImportPartPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(37, texamplePack);
       }
       texamplePack = this.searchResultPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(38, texamplePack);
       }
       texamplePack = this.liveImportMusicPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(43, texamplePack);
       }
       texamplePack = this.liveMusicChannelPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(44, texamplePack);
       }
       texamplePack = this.musicBillboardPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(46, texamplePack);
       }
       texamplePack = this.businessPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(47, texamplePack);
       }
       texamplePack = this.liveCommentVoiceRecognizeInputPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(48, texamplePack);
       }
       texamplePack = this.kwaiMusicStationPackage;
       if (texamplePack != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(49, texamplePack);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$ContentWrapper mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.examplePackage == null) {
                   this.examplePackage = new ClientContentWrapper$ExamplePackage();
                }
                p0.readMessage(this.examplePackage);
                break;
              case ':':
                if (this.fanstopH5JumpPackage == null) {
                   this.fanstopH5JumpPackage = new ClientContentWrapper$FanstopH5JumpPackage();
                }
                p0.readMessage(this.fanstopH5JumpPackage);
                break;
              case 'B':
                if (this.batchUserQuizPackage == null) {
                   this.batchUserQuizPackage = new ClientContentWrapper$BatchUserQuizPackage();
                }
                p0.readMessage(this.batchUserQuizPackage);
                break;
              case 'J':
                if (this.liveChatPackage == null) {
                   this.liveChatPackage = new ClientContentWrapper$LiveChatPackage();
                }
                p0.readMessage(this.liveChatPackage);
                break;
              case 'Z':
                if (this.batchKwaiMusicStationPackage == null) {
                   this.batchKwaiMusicStationPackage = new ClientContentWrapper$BatchKwaiMusicStationPackage();
                }
                p0.readMessage(this.batchKwaiMusicStationPackage);
                break;
              case 'b':
                if (this.liveQualityPackage == null) {
                   this.liveQualityPackage = new ClientContentWrapper$LiveQualityPackage();
                }
                p0.readMessage(this.liveQualityPackage);
                break;
              case 'j':
                if (this.liveVoicePartyPackage == null) {
                   this.liveVoicePartyPackage = new ClientContentWrapper$LiveVoicePartyPackage();
                }
                p0.readMessage(this.liveVoicePartyPackage);
                break;
              case 'r':
                if (this.liveMusicPackage == null) {
                   this.liveMusicPackage = new ClientContentWrapper$LiveMusicPackage();
                }
                p0.readMessage(this.liveMusicPackage);
                break;
              case 130:
                if (this.musicPlayStatPackage == null) {
                   this.musicPlayStatPackage = new ClientContentWrapper$MusicPlayStatPackage();
                }
                p0.readMessage(this.musicPlayStatPackage);
                break;
              case 146:
                if (this.redPointDetailPackage == null) {
                   this.redPointDetailPackage = new ClientContentWrapper$RedPointDetailPackage();
                }
                p0.readMessage(this.redPointDetailPackage);
                break;
              case 154:
                if (this.redPointPackage == null) {
                   this.redPointPackage = new ClientContentWrapper$RedPointPackage();
                }
                p0.readMessage(this.redPointPackage);
                break;
              case 162:
                if (this.outsideH5PagePackage == null) {
                   this.outsideH5PagePackage = new ClientContentWrapper$OutsideH5PagePackage();
                }
                p0.readMessage(this.outsideH5PagePackage);
                break;
              case 186:
                if (this.atlasEditPackage == null) {
                   this.atlasEditPackage = new ClientContentWrapper$AtlasEditPackage();
                }
                p0.readMessage(this.atlasEditPackage);
                break;
              case 194:
                if (this.notificationPackage == null) {
                   this.notificationPackage = new ClientContentWrapper$NotificationPackage();
                }
                p0.readMessage(this.notificationPackage);
                break;
              case 218:
                if (this.seriesPackage == null) {
                   this.seriesPackage = new ClientContentWrapper$SeriesPackage();
                }
                p0.readMessage(this.seriesPackage);
                break;
              case 226:
                if (this.batchSeriesPackage == null) {
                   this.batchSeriesPackage = new ClientContentWrapper$BatchSeriesPackage();
                }
                p0.readMessage(this.batchSeriesPackage);
                break;
              case 234:
                if (this.moreInfoPackage == null) {
                   this.moreInfoPackage = new ClientContentWrapper$MoreInfoPackage();
                }
                p0.readMessage(this.moreInfoPackage);
                break;
              case 242:
                if (this.batchMoreInfoPackage == null) {
                   this.batchMoreInfoPackage = new ClientContentWrapper$BatchMoreInfoPackage();
                }
                p0.readMessage(this.batchMoreInfoPackage);
                break;
              case 250:
                if (this.applicationStateInfoPackage == null) {
                   this.applicationStateInfoPackage = new ClientContentWrapper$ApplicationStateInfoPackage();
                }
                p0.readMessage(this.applicationStateInfoPackage);
                break;
              case 266:
                if (this.gossipMessagePackage == null) {
                   this.gossipMessagePackage = new ClientContentWrapper$GossipMessagePackage();
                }
                p0.readMessage(this.gossipMessagePackage);
                break;
              case 274:
                if (this.launchTimeDifferencePackage == null) {
                   this.launchTimeDifferencePackage = new ClientContentWrapper$LaunchTimeDifferencePackage();
                }
                p0.readMessage(this.launchTimeDifferencePackage);
                break;
              case 282:
                if (this.liveChatBetweenAnchorsPackage == null) {
                   this.liveChatBetweenAnchorsPackage = new ClientContentWrapper$LiveChatBetweenAnchorsPackage();
                }
                p0.readMessage(this.liveChatBetweenAnchorsPackage);
                break;
              case 290:
                if (this.targetUserPackage == null) {
                   this.targetUserPackage = new ClientContentWrapper$TargetUserPackage();
                }
                p0.readMessage(this.targetUserPackage);
                break;
              case 298:
                if (this.batchImportPartPackage == null) {
                   this.batchImportPartPackage = new ClientContentWrapper$BatchImportPartPackage();
                }
                p0.readMessage(this.batchImportPartPackage);
                break;
              case 306:
                if (this.searchResultPackage == null) {
                   this.searchResultPackage = new ClientContent$SearchResultPackage();
                }
                p0.readMessage(this.searchResultPackage);
                break;
              case 346:
                if (this.liveImportMusicPackage == null) {
                   this.liveImportMusicPackage = new ClientContentWrapper$LiveImportMusicPackage();
                }
                p0.readMessage(this.liveImportMusicPackage);
                break;
              case 354:
                if (this.liveMusicChannelPackage == null) {
                   this.liveMusicChannelPackage = new ClientContentWrapper$LiveMusicChannelPackage();
                }
                p0.readMessage(this.liveMusicChannelPackage);
                break;
              case 370:
                if (this.musicBillboardPackage == null) {
                   this.musicBillboardPackage = new ClientContentWrapper$MusicBillboardPackage();
                }
                p0.readMessage(this.musicBillboardPackage);
                break;
              case 378:
                if (this.businessPackage == null) {
                   this.businessPackage = new ClientContentWrapper$BusinessPackage();
                }
                p0.readMessage(this.businessPackage);
                break;
              case 386:
                if (this.liveCommentVoiceRecognizeInputPackage == null) {
                   this.liveCommentVoiceRecognizeInputPackage = new ClientContentWrapper$LiveCommentVoiceRecognizeInputPackage();
                }
                p0.readMessage(this.liveCommentVoiceRecognizeInputPackage);
                break;
              case 394:
                if (this.kwaiMusicStationPackage == null) {
                   this.kwaiMusicStationPackage = new ClientContentWrapper$KwaiMusicStationPackage();
                }
                p0.readMessage(this.kwaiMusicStationPackage);
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
       ClientContentWrapper$ContentWrapper texamplePack = this.examplePackage;
       if (texamplePack != null) {
          p0.writeMessage(1, texamplePack);
       }
       texamplePack = this.fanstopH5JumpPackage;
       if (texamplePack != null) {
          p0.writeMessage(7, texamplePack);
       }
       texamplePack = this.batchUserQuizPackage;
       if (texamplePack != null) {
          p0.writeMessage(8, texamplePack);
       }
       texamplePack = this.liveChatPackage;
       if (texamplePack != null) {
          p0.writeMessage(9, texamplePack);
       }
       texamplePack = this.batchKwaiMusicStationPackage;
       if (texamplePack != null) {
          p0.writeMessage(11, texamplePack);
       }
       texamplePack = this.liveQualityPackage;
       if (texamplePack != null) {
          p0.writeMessage(12, texamplePack);
       }
       texamplePack = this.liveVoicePartyPackage;
       if (texamplePack != null) {
          p0.writeMessage(13, texamplePack);
       }
       texamplePack = this.liveMusicPackage;
       if (texamplePack != null) {
          p0.writeMessage(14, texamplePack);
       }
       texamplePack = this.musicPlayStatPackage;
       if (texamplePack != null) {
          p0.writeMessage(16, texamplePack);
       }
       texamplePack = this.redPointDetailPackage;
       if (texamplePack != null) {
          p0.writeMessage(18, texamplePack);
       }
       texamplePack = this.redPointPackage;
       if (texamplePack != null) {
          p0.writeMessage(19, texamplePack);
       }
       texamplePack = this.outsideH5PagePackage;
       if (texamplePack != null) {
          p0.writeMessage(20, texamplePack);
       }
       texamplePack = this.atlasEditPackage;
       if (texamplePack != null) {
          p0.writeMessage(23, texamplePack);
       }
       texamplePack = this.notificationPackage;
       if (texamplePack != null) {
          p0.writeMessage(24, texamplePack);
       }
       texamplePack = this.seriesPackage;
       if (texamplePack != null) {
          p0.writeMessage(27, texamplePack);
       }
       texamplePack = this.batchSeriesPackage;
       if (texamplePack != null) {
          p0.writeMessage(28, texamplePack);
       }
       texamplePack = this.moreInfoPackage;
       if (texamplePack != null) {
          p0.writeMessage(29, texamplePack);
       }
       texamplePack = this.batchMoreInfoPackage;
       if (texamplePack != null) {
          p0.writeMessage(30, texamplePack);
       }
       texamplePack = this.applicationStateInfoPackage;
       if (texamplePack != null) {
          p0.writeMessage(31, texamplePack);
       }
       texamplePack = this.gossipMessagePackage;
       if (texamplePack != null) {
          p0.writeMessage(33, texamplePack);
       }
       texamplePack = this.launchTimeDifferencePackage;
       if (texamplePack != null) {
          p0.writeMessage(34, texamplePack);
       }
       texamplePack = this.liveChatBetweenAnchorsPackage;
       if (texamplePack != null) {
          p0.writeMessage(35, texamplePack);
       }
       texamplePack = this.targetUserPackage;
       if (texamplePack != null) {
          p0.writeMessage(36, texamplePack);
       }
       texamplePack = this.batchImportPartPackage;
       if (texamplePack != null) {
          p0.writeMessage(37, texamplePack);
       }
       texamplePack = this.searchResultPackage;
       if (texamplePack != null) {
          p0.writeMessage(38, texamplePack);
       }
       texamplePack = this.liveImportMusicPackage;
       if (texamplePack != null) {
          p0.writeMessage(43, texamplePack);
       }
       texamplePack = this.liveMusicChannelPackage;
       if (texamplePack != null) {
          p0.writeMessage(44, texamplePack);
       }
       texamplePack = this.musicBillboardPackage;
       if (texamplePack != null) {
          p0.writeMessage(46, texamplePack);
       }
       texamplePack = this.businessPackage;
       if (texamplePack != null) {
          p0.writeMessage(47, texamplePack);
       }
       texamplePack = this.liveCommentVoiceRecognizeInputPackage;
       if (texamplePack != null) {
          p0.writeMessage(48, texamplePack);
       }
       texamplePack = this.kwaiMusicStationPackage;
       if (texamplePack != null) {
          p0.writeMessage(49, texamplePack);
       }
       super.writeTo(p0);
       return;
    }
}
