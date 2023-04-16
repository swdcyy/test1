package com.kuaishou.live.preview.item.presenter.a0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.g;
import v51.b;
import lp3.h;
import s51.c;
import dl3.l0;
import lp3.f;
import rp5.a;
import dl3.m0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import il3.a;
import xp5.g;
import dl3.n0;
import or5.d;
import o63.a;
import com.kuaishou.live.preview.item.presenter.z;
import lp3.i;
import com.kwai.robust.PatchProxyResult;
import dl3.r0;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vq5.d;

public class a0 extends PresenterV2 implements g	// class@000e00
{
    public BaseFragment p;
    public d q;
    public QPhoto r;
    public i s;

    public void a0(QPhoto p0){
       super();
       this.r = p0;
    }
    public void F8(){
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa0, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa0, "3")) {
          g og = b.a();
          og.a(new h(c.class, new l0(this)));
          og.a(new h(a.class, new m0(this)));
          QPhoto mEntity = this.r.mEntity;
          if (mEntity instanceof LiveStreamFeed) {
             a uoa = new a(mEntity);
             og.a(new h(g.class, new n0(uoa)));
             og.a(new h(d.class, new n0(uoa)));
          }
          og.a(new h(a.class, new z(this)));
          this.s = new i(og);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a0.class, new r0());
       }else {
          obj.put(a0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.r8("ROUTER_SERVICE");
       return;
    }
}
