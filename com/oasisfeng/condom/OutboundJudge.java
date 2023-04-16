package com.oasisfeng.condom.OutboundJudge;
import com.oasisfeng.condom.OutboundType;
import android.content.Intent;
import java.lang.String;

public interface abstract OutboundJudge	// class@000a94
{

    boolean shouldAllow(OutboundType p0,Intent p1,String p2);
}
