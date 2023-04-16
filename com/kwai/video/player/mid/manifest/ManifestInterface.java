package com.kwai.video.player.mid.manifest.ManifestInterface;
import com.kwai.video.player.mid.manifest.RepInterface;
import java.util.List;
import java.lang.String;

public interface abstract ManifestInterface	// class@000b5e
{

    RepInterface getHighestResolutionRep();
    int getRepCount();
    List getRepList();
    String toJsonString();
}
