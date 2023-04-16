package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$t;
import ekd.q$b;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import java.lang.Object;
import ezb.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$c;
import kotlin.jvm.internal.a;

public final class RecoCameraIconPresenter$t implements q$b	// class@00106f
{
    public final RecoCameraIconPresenter a;

    public void RecoCameraIconPresenter$t(RecoCameraIconPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoCameraIconPresenter$t.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.g(p0.c(), RecoCameraIconPresenter.P8(this.a).c()) ^ 0x01;
       return b;
    }
}
