package com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager;
import androidx.lifecycle.LifecycleOwner;
import hf3.a;
import ny2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.effect.engine.log.LiveEffectLogTag;
import java.util.List;
import pp.c;
import oy2.a;
import com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager$effectAnchorDisableObserver$1;
import com.kuaishou.live.effect.engine.banned.LiveEffectBannedBizManager$lifecycleObserver$1;
import com.kuaishou.android.live.log.b;
import ky2.a$a;
import ky2.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class LiveEffectBannedBizManager	// class@001afa
{
    public final List a;
    public final a b;
    public final LiveEffectBannedBizManager$effectAnchorDisableObserver$1 c;
    public final LiveEffectBannedBizManager$lifecycleObserver$1 d;
    public final a e;

    public void LiveEffectBannedBizManager(LifecycleOwner p0,a p1,a p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "longConnection");
       a.p(p2, "effectEngine");
       super();
       this.e = p2;
       List list = LiveEffectLogTag.LIVE_EFFECT_ENGINE.appendTag("LiveEffectBannedBizManager");
       this.a = list;
       a uoa = new a(p1);
       this.b = uoa;
       LiveEffectBannedBizManager$effectAnchorDisableObserver$1 uoeffectAnch = new LiveEffectBannedBizManager$effectAnchorDisableObserver$1(this);
       this.c = uoeffectAnch;
       LiveEffectBannedBizManager$lifecycleObserver$1 olifecycleOb = new LiveEffectBannedBizManager$lifecycleObserver$1(this, p0);
       this.d = olifecycleOb;
       b.P(list, "init");
       uoa.a(p0, uoeffectAnch);
       p0.getLifecycle().addObserver(olifecycleOb);
    }
}
