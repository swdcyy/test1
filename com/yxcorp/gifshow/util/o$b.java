package com.yxcorp.gifshow.util.o$b;
import mhc.p;
import com.kwai.framework.model.feed.BaseFeed;
import uo7.k;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import java.lang.Object;
import java.lang.String;

public class o$b extends p	// class@001f92
{

    public void o$b(BaseFeed p0){
       super(p0);
    }
    public void b(k p0,ShareInitResponse$SharePanelElement p1){
       super.b(p0, p1);
       if (p0.p()) {
          ("COPY_LINK").equals(p0.r().mShareAnyData.mShareChannel);
       }
       return;
    }
}
