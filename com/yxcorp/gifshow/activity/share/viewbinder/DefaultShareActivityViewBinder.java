package com.yxcorp.gifshow.activity.share.viewbinder.DefaultShareActivityViewBinder;
import com.yxcorp.gifshow.activity.share.viewbinder.AbsShareActivityViewBinder;
import c35.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.ax2c.PreLoader;
import android.content.Context;
import ag6.a;

public class DefaultShareActivityViewBinder extends AbsShareActivityViewBinder	// class@001496
{

    public void DefaultShareActivityViewBinder(c p0){
       super(p0);
    }
    public int p(){
       return 0x7f0d1505;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View orWait;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultShareActivityViewBinder.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (PostExperimentUtils.H0()) {
          orWait = PreLoader.getInstance().getOrWait(p0.getContext(), R.layout.share_v2, null, false);
          a.m(orWait);
          a.o(orWait, "PreLoader.getInstance\(\).бн.share_v2, null, false\)!!");
       }else {
          orWait = a.c(p0, R.layout.share_v2, p1, false);
          a.m(orWait);
       }
       return orWait;
    }
}
