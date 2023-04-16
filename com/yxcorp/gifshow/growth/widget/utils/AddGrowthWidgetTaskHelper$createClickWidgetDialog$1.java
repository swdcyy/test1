package com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.Activity;
import android.graphics.Typeface;
import com.kwai.feature.api.feed.growth.model.ClickWidgetDialogModel;
import f55.g;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.growth.widget.utils.AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import jra.c;
import java.util.Objects;
import com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper;
import m3a.x;
import wh5.c;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import zsd.u;
import eqa.a;
import com.kwai.video.wayne.player.util.CacheKeyUtil;
import com.kwai.video.hodor.MediaPreloadPriorityTask;
import java.util.Map;
import com.kwai.video.hodor.HodorConfig;
import com.kwai.video.hodor.AbstractHodorTask;
import com.kwai.video.hodor.AbstractHodorPreloadTask;
import jra.a;
import com.kwai.video.cache.AwesomeCacheCallback;

public final class AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 extends Lambda implements a	// class@001609
{
    public final Activity $activity;
    public final g $callback;
    public final ClickWidgetDialogModel $clickWidgetDialogModel;
    public final Typeface $fromAsset;

    public void AddGrowthWidgetTaskHelper$createClickWidgetDialog$1(Activity p0,Typeface p1,ClickWidgetDialogModel p2,g p3){
       this.$activity = p0;
       this.$fromAsset = p1;
       this.$clickWidgetDialogModel = p2;
       this.$callback = p3;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AddGrowthWidgetTaskHelper$createClickWidgetDialog$1.class, "1")) {
          return;
       }
       d uod = new d(this.$activity);
       boolean b = true;
       uod.z(b);
       uod.L(new AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$a(this));
       uod.M(new AddGrowthWidgetTaskHelper$createClickWidgetDialog$1$b(this));
       uod.k().Z();
       c b1 = c.b;
       AddGrowthWidgetTaskHelper$createClickWidgetDialog$1 t$activity = this.$activity;
       Objects.requireNonNull(b1);
       BaseGuidePipHelper uBaseGuidePi = BaseGuidePipHelper.class;
       if (!PatchProxy.applyVoidOneRefs(t$activity, b1, uBaseGuidePi, "5") && (x.b.b() && (b1.e(t$activity) && !c.b()))) {
          String str = b1.b();
          if (!PatchProxy.applyVoidOneRefs(str, b1, uBaseGuidePi, "3")) {
             Object[] objArray1 = new Object[0];
             w.C().w("EncourageGuidePipHelper", "downloadVideo "+str, objArray1);
             a uoa = (str == null || u.S1(str))? 1: null;
             if (!uoa && !a.a.a(str)) {
                MediaPreloadPriorityTask mediaPreload = new MediaPreloadPriorityTask(str, objArray, CacheKeyUtil.getCacheKey(str, 0));
                if (HodorConfig.isDefaultEnableUnifyLog()) {
                   mediaPreload.setUnifyCdnLog(b);
                }
                mediaPreload.setPreloadBytes(-1);
                mediaPreload.setBizType("GRWOTH_PIP");
                mediaPreload.setBizFt(":ks-features:ft-feed:kwai-growth");
                mediaPreload.setCacheGroup("growth_pip_default");
                mediaPreload.setAwesomeCacheCallback(new a(b1));
                mediaPreload.enableCronTask(b);
                mediaPreload.setEvictStrategy(3);
                mediaPreload.submit();
                objArray = new Object[0];
                w.C().w("EncourageGuidePipHelper", "downloadVideo add", objArray);
             }
          }
       }
    label_00db :
       return;
    }
}
