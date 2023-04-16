package com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailActivityTablet;
import com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public class NoticeBoxDetailActivityTablet extends NoticeBoxDetailActivity	// class@002164
{

    public void NoticeBoxDetailActivityTablet(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailActivityTablet.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
