package com.yxcorp.gifshow.v3.editor.prettify.filter.n;
import usc.n;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import usc.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.prettify.filter.n$a;
import android.animation.Animator$AnimatorListener;
import xvc.l;
import com.kuaishou.edit.draft.ColorFilter;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kuaishou.edit.draft.FeatureId;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import com.yxcorp.gifshow.prettify.v4.magic.filter.InternalFilterInfo;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Intent;
import ekd.j0;
import com.yxcorp.gifshow.v3.f;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;

public class n extends n	// class@00117e
{
    public ColorFilter c;
    public static String d;

    static {
       n.d = "sFilterThumbnailFilePath"+System.currentTimeMillis();
    }
    public void n(){
       super();
    }
    public static void g(VideoSDKPlayerView p0,Minecraft$ColorFilterParam p1,ValueAnimator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, n.class, "1")) {
          return;
       }
       if (p1 != null) {
          if (p2 != null) {
             p2.addUpdateListener(new s(p0, p1));
             p2.addListener(new n$a(p0));
             p2.start();
          }else {
             n.h();
          }
       }else {
          n.h();
          p0.clearOverlyFilter();
       }
       return;
    }
    public static void h(){
       if (PatchProxy.applyVoid(null, null, n.class, "2")) {
          return;
       }
       l.a.a();
       return;
    }
    public void a(ColorFilter p0,String[] p1,boolean p2){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, n.class, "3")) {
          return;
       }
       this.c = p0;
       l.a.a();
       return;
    }
    public void b(VideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "5")) {
          return;
       }
       n tc = this.c;
       if (tc != null) {
          FilterConfig filterConfig = Filters.getFilterConfigFromFeatureId(tc.getFeatureId().getInternalValue(), FilterVideoPlugin$FilterEntranceType.EDIT);
          String str = (filterConfig == null)? null: String.valueOf(filterConfig.mFilterId);
          p0.W0(str);
          p0.X0((float)this.c.getIntensity());
          p0.W1(this.c.getIsReco());
       }else {
          p0.W0(String.valueOf(InternalFilterInfo.filter_none.mId));
          p0.W1(false);
       }
       return;
    }
    public Bundle c(){
       Bundle obj = PatchProxy.apply(null, this, n.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       obj.putBoolean("beautify_enabled", j0.a(this.d().getIntent(), "beautify_enabled", false));
       return obj;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, n.class, "6")) {
          return;
       }
       f.n(this.d()).setPreviewEventListener("VideoFilterHelper", null);
       return;
    }
}
