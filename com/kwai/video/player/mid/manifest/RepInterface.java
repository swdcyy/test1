package com.kwai.video.player.mid.manifest.RepInterface;
import com.kwai.video.player.mid.manifest.v2.KvqScore;
import java.lang.String;

public interface abstract RepInterface	// class@000b5f
{

    int getId();
    KvqScore getKvqScore();
    String getMinorInfo();
    String getQualityLabel();
    String getQualityType();
    String getUrl();
}
