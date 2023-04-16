package com.kwai.video.wayne.player.config.inerface.InnerBuilderConfigInterface;
import com.kwai.video.player.kwai_player.KwaiPlayerVodBuilder;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;

public interface abstract InnerBuilderConfigInterface	// class@000cde
{

    void configBufferControl(KwaiPlayerVodBuilder p0);
    void configDataSourceToBuilder(KwaiPlayerVodBuilder p0,WayneBuildData p1);
    void configDataSourceToPlayer(IKwaiMediaPlayer p0,WayneBuildData p1);
    void configHardwareDecoder(KwaiPlayerVodBuilder p0);
    void configHttpHeaders(IKwaiMediaPlayer p0);
    void configKwaiManifestReleated(KwaiPlayerVodBuilder p0,KwaiManifest p1);
    void configKwaiVPP(KwaiPlayerVodBuilder p0);
    void configMisc(KwaiPlayerVodBuilder p0);
    void configPlayInfo(KwaiPlayerVodBuilder p0,KwaiManifest p1);
    void configPlayerAfterBuilt(IKwaiMediaPlayer p0);
    void configRender(KwaiPlayerVodBuilder p0);
    void configSoftwareDecoder(KwaiPlayerVodBuilder p0);
    void configStartPlay(KwaiPlayerVodBuilder p0);
    void configVR(KwaiPlayerVodBuilder p0,KwaiManifest p1);
}
