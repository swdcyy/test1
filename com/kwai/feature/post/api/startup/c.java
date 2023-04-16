package com.kwai.feature.post.api.startup.c;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import lnc.p3;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import o46.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.feature.post.api.startup.PreloadStatus;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import lnc.y6;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a;
import lnc.t;
import java.util.Objects;
import io.reactivex.internal.fuseable.b;
import brd.h;
import io.reactivex.internal.operators.completable.k;
import brd.e;
import ird.a;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.completable.e;
import cxd.b;
import o46.e;
import o46.f;
import erd.a;
import crd.b;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import java.util.List;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;

public final class c implements g	// class@001441
{
    public final long b;

    public void c(long p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d d;
       c tb = this.b;
       Object[] objArray = new Object[0];
       p3.D().A("PostPluginPreload", "plugin isDownloaded: "+p0, objArray);
       if (!p0.booleanValue() && (!PatchProxy.applyVoid(null, null, d.class, "1") && d.a)) {
          d.c = true;
          d = d.d;
          g.a(d.b.edit().putLong("last_preload_start_day", d.a()));
          d.b(PreloadStatus.START);
       }
    label_0057 :
       PluginDownloadExtension k = PluginDownloadExtension.k;
       DownloadTask$DownloadBizExtra$DownloadUpBizFt fT_Post = DownloadTask$DownloadBizExtra$DownloadUpBizFt.FT_Post;
       k.p("post", fT_Post);
       a uoa = y6.e.h(LoadPolicy.SILENT_INIT);
       long l = 2;
       Objects.requireNonNull(uoa);
       h oh = (uoa instanceof b)? uoa.d(): a.f(new k(uoa));
       oh = oh.w(l);
       a.c(oh, "publisher is null");
       a.e(new e(oh)).u(new e(tb, p0), new f(tb, p0));
       k.p("rickon", fT_Post);
       k.s("rickon", 20);
       Dva.instance().getPluginInstallManager().j("rickon");
       p0 = new String[]{"live_effect_drawer_plugin","live_anchor_plugin"};
       p0 = Arrays.asList(p0);
       DownloadTask$DownloadBizExtra$DownloadUpBizFt fT_Live = DownloadTask$DownloadBizExtra$DownloadUpBizFt.FT_Live;
       if (!PatchProxy.applyVoidTwoRefs(p0, fT_Live, k, PluginDownloadExtension.class, "21")) {
          a.p(p0, "pluginNames");
          a.p(fT_Live, "ft");
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          linkedHashSe.addAll(p0);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             linkedHashSe.addAll(PluginDownloadExtension.k.k(iterator.next()));
          }
          k.q(linkedHashSe, fT_Live);
       }
       PluginDownloadExtension.k.t(p0, 30);
       Dva.instance().getPluginInstallManager().k(p0);
       return;
    }
}
