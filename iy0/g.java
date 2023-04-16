package iy0.g;
import im8.g;
import k51.c;
import java.util.ArrayList;
import iy0.g$a;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import iy0.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.livestream.message.nano.LiveQuickCommentMessages$SCLiveQuickCommentChanged;
import iy0.b;
import lf3.g;
import hf3.a;
import androidx.lifecycle.LiveData;
import ft5.b;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.core.basic.activity.x;
import iy0.a;
import androidx.lifecycle.Observer;
import java.util.Set;
import java.util.Iterator;
import eq5.a$a;
import java.util.List;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import iy0.j;
import java.util.Map;
import java.util.HashMap;

public class g extends c implements g	// class@0029ba
{
    public final ArrayList p;
    public final ArrayList q;
    public a0 r;
    public b s;
    public a t;
    public Set u;
    public static String sLivePresenterClassName = "LiveAudienceCommentHotWordsPresenter";

    public void g(){
       super();
       this.p = new ArrayList();
       this.q = new ArrayList();
       this.t = new g$a(this);
       this.u = new HashSet();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.X7(this.r.b3.T3().subscribe(new f(this), Functions.e));
       this.r.C.u0(602, LiveQuickCommentMessages$SCLiveQuickCommentChanged.class, new b(this));
       this.s.Ka().observe(this.r.S.u0(), new a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       this.P8();
       this.u.clear();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.p.clear();
       this.q.clear();
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.p);
       }
       return;
    }
    public final void S8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       this.p.addAll(p0);
       this.q.addAll(p0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new j());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.r = this.q8(a0.class);
       this.s = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       return;
    }
}
