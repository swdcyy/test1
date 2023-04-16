package com.kuaishou.live.preview.item.feedback.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import sk3.a;
import com.kuaishou.live.preview.item.feedback.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import sk3.b;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.live.feedback.b;
import com.kwai.robust.PatchProxyResult;
import sk3.e;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.autoplay.live.g;

public class a extends PresenterV2 implements g	// class@000de1
{
    public b p;
    public SlidePlayViewModel q;
    public QPhoto r;
    public BaseFragment s;
    public PublishSubject t;
    public g u;
    public final PublishSubject v;
    public final a w;
    public final a x;

    public void a(){
       super();
       this.v = PublishSubject.g();
       this.w = new a(this);
       this.x = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.s.getParentFragment());
       this.q = slidePlayVie;
       slidePlayVie.P(this.s, this.x);
       this.X7(this.t.subscribe(new b(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q.D(this.s, this.x);
       a tp = this.p;
       if (tp != null) {
          tp.c();
          this.p = null;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.t = this.r8("LIVE_SIMPLE_NEGATIVE_FEEDBACK_PUBLISHER");
       this.u = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       return;
    }
}
