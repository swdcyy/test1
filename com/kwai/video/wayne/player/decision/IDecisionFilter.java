package com.kwai.video.wayne.player.decision.IDecisionFilter;
import com.kwai.video.wayne.player.decision.DecisionParams;
import com.kwai.video.player.mid.manifest.v2.KwaiManifest;
import java.lang.String;

public interface abstract IDecisionFilter	// class@000d26
{

    void filterV2DataSource(DecisionParams p0,KwaiManifest p1,String p2);
}
