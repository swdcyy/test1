package com.kwai.player.debuginfo.KwaiPlayerDebugInfoProvider;
import com.kwai.player.debuginfo.model.KwaiPlayerDebugInfo;
import com.kwai.video.player.kwai_player.ProductContext;

public interface abstract KwaiPlayerDebugInfoProvider	// class@0012e0
{

    KwaiPlayerDebugInfo getDebugInfo();
    ProductContext getPlayerProductContext();
}
