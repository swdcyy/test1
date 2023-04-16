package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController$a;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailExplainData$HotSpotLinkData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public final class LiveHotSpotDetailExplainLinkItemViewController$a implements Observer	// class@0013a0
{
    public final TextView b;

    public void LiveHotSpotDetailExplainLinkItemViewController$a(TextView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailExplainLinkItemViewController$a.class, "1")) {
       }else {
          this.b.setText(p0.mTitle);
       }
       return;
    }
}
