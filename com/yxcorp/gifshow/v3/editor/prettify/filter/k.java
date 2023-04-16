package com.yxcorp.gifshow.v3.editor.prettify.filter.k;
import usc.n;
import com.kuaishou.edit.draft.ColorFilter;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import usc.q;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import qr4.i;
import qr4.e$h;
import qr4.e$i;
import java.lang.Float;
import lnc.q4;
import com.yxcorp.gifshow.prettify.v4.magic.filter.InternalFilterInfo;
import com.kuaishou.edit.draft.FeatureId;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import android.os.Bundle;

public class k extends n	// class@001178
{
    public ColorFilter c;

    public void k(){
       super();
    }
    public void a(ColorFilter p0,String[] p1,boolean p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, k.class, "1")) {
          return;
       }
       k1.r(new q(this), 0);
       this.c = p0;
       return;
    }
    public void b(VideoContext p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       VideoContext videoContext = VideoContext.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Boolean.FALSE, p0, videoContext, "108") != patchProxyRe) {
       }else {
          VideoContext.b();
          p0.Y();
          p0.a.d.j.d = false;
       }
       if (PatchProxy.isSupport(videoContext) && PatchProxy.applyOneRefs(Float.valueOf(0), p0, videoContext, "97") != patchProxyRe) {
       }else {
          VideoContext.b();
          p0.a.d.d = (float)q4.c(2, (double)0);
       }
       k tc = this.c;
       if (tc == null) {
          p0.W0(String.valueOf(InternalFilterInfo.filter_none.mId));
          p0.X0(0);
          p0.W1(false);
          return;
       }else {
          p0.X0((float)tc.getIntensity());
          FilterConfig filterConfig = Filters.getFilterConfigFromFeatureId(this.c.getFeatureId().getInternalValue(), FilterVideoPlugin$FilterEntranceType.EDIT);
          String str = (filterConfig == null)? null: String.valueOf(filterConfig.mFilterId);
          p0.W0(str);
          p0.W1(this.c.getIsReco());
          return;
       }
    }
    public Bundle c(){
       Bundle obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putBoolean("beautify_enabled", false);
       return obj;
    }
}
