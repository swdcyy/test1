package com.kuaishou.live.preview.item.presenter.u;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import jl3.b;
import dl3.y;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.preview.item.presenter.s;
import com.kuaishou.live.preview.item.presenter.t;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import dl3.a0;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import dl3.z;
import android.view.View;
import ekd.m1;
import com.kwai.robust.PatchProxyResult;
import dl3.e0;
import java.util.Map;
import java.util.HashMap;

public class u extends PresenterV2 implements g	// class@000e42
{
    public b p;
    public QPhoto q;
    public LiveCoverIconView r;
    public final PublishSubject s;

    public void u(){
       super();
       this.s = PublishSubject.g();
    }
    public void E8(){
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "3")) {
          return;
       }
       this.X7(this.p.c().distinctUntilChanged().subscribe(new y(this), Functions.e));
       if (!PatchProxy.applyVoid(objArray, this, ou, "5")) {
          this.r.O(k0.b(this.q.getEntity(), s.a, t.a).or(new LiveCoverWidgetModel()), new a0(this));
       }
       this.X7(this.s.subscribe(new z(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, u.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a2587);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, u.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, u.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(u.class, new e0());
       }else {
          obj.put(u.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "2")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.p = this.r8("LIVE_PLAY_STATE");
       return;
    }
}
