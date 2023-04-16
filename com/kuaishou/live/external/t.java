package com.kuaishou.live.external.t;
import dx5.h;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import i33.d;
import com.kwai.feature.api.live.plugin.dva.LoadPolicy;
import android.app.Activity;
import brd.a0;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import g33.r;
import com.kuaishou.live.external.s;
import erd.g;
import crd.b;
import g33.q;
import com.kuaishou.live.external.r;

public class t implements h	// class@001bbe
{

    public void t(){
       super();
    }
    public void d3(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, t.class, "2")) {
          return;
       }
       LivePluginManager.d(d.class, LoadPolicy.DIALOG, p0).R(new r(p0, p1, p2, p3), s.b);
       return;
    }
    public boolean e3(int p0){
       boolean b = (p0 == 7)? true: false;
       return b;
    }
    public void f3(GifshowActivity p0,String p1,ProfileTemplateCard p2,h$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, t.class, "1")) {
          return;
       }
       LivePluginManager.d(d.class, LoadPolicy.DIALOG, p0).R(new q(p0, p1, p2, p3), r.b);
       return;
    }
}
