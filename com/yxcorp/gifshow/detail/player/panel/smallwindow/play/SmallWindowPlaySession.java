package com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession$a;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLoggerFieldProvider;
import v5a.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import v5a.a$b;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.play.SmallWindowPlaySession$createPlayBuildDataKpMid$1;
import msd.l;

public final class SmallWindowPlaySession	// class@001640
{
    public final PhotoDetailLoggerFieldProvider a;
    public final BaseFragment b;
    public final QPhoto c;
    public final KwaiPlayerKitView d;
    public final Integer e;
    public final int f;
    public final String g;
    public final boolean h;
    public final int i;
    public static final SmallWindowPlaySession$a j;

    static {
       SmallWindowPlaySession.j = new SmallWindowPlaySession$a(null);
    }
    public void SmallWindowPlaySession(BaseFragment p0,QPhoto p1,KwaiPlayerKitView p2,Integer p3,int p4,String p5,boolean p6,int p7){
       a.p(p0, "fragment");
       a.p(p1, "photo");
       a.p(p2, "playerKitView");
       a.p(p5, "page2");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.a = new PhotoDetailLoggerFieldProvider();
    }
    public final a a(QPhoto p0,long p1,int p2,Integer p3){
       a$b obj;
       if (PatchProxy.isSupport(SmallWindowPlaySession.class)) {
          obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, SmallWindowPlaySession.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a$b(p0);
       SmallWindowPlaySession$createPlayBuildDataKpMid$1 uocreatePlay = new SmallWindowPlaySession$createPlayBuildDataKpMid$1(this, p3, p1, p2, p0);
       obj.b(v8);
       a uoa = obj.a();
       a.o(uoa, "PlayerBuildData.Builder\(¡­it\n      }\n      .build\(\)");
       return uoa;
    }
}
