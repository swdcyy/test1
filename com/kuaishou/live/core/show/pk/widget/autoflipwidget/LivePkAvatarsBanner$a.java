package com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner$a;
import h3.a;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarsBanner;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ekd.j;
import com.kuaishou.live.core.show.pk.widget.autoflipwidget.LivePkAvatarItemView;
import android.content.Context;
import android.widget.RelativeLayout;
import ge2.c;
import android.view.View$OnClickListener;

public class LivePkAvatarsBanner$a extends a	// class@000db2
{
    public final LivePkAvatarsBanner d;

    public void LivePkAvatarsBanner$a(LivePkAvatarsBanner p0){
       this.d = p0;
       super();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(LivePkAvatarsBanner$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LivePkAvatarsBanner$a.class, "3")) {
          return;
       }
       p0.removeView(p2);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, LivePkAvatarsBanner$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!j.h(this.d.e)) {
          return this.z(this.d.e);
       }
       if (!j.h(this.d.f)) {
          return this.z(this.d.f);
       }
       return 0;
    }
    public int k(Object p0){
       return -2;
    }
    public Object o(ViewGroup p0,int p1){
       LivePkAvatarItemView obj;
       LivePkAvatarsBanner e;
       LivePkAvatarsBanner$a uoa = LivePkAvatarsBanner$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LivePkAvatarItemView(this.d.getContext());
       if (!j.h(this.d.e)) {
          e = this.d.e;
          p1 = p1 % e.length;
          obj.L(e[p1]);
       }else if(!j.h(this.d.f)){
          e = this.d.f;
          p1 = p1 % e.length;
          obj.L(e[p1]);
       }
       if (this.d.g != null) {
          obj.setOnClickListener(new c(this, p1));
       }
       p0.addView(obj);
       return obj;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
    public final int z(Object[] p0){
       int i = (p0.length > 1)? 1000: p0.length;
       return i;
    }
}
