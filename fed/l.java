package fed.l;
import ucd.n;
import nfd.a0;
import nfd.y0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.yxcorp.plugin.search.entity.SearchItem;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.helper.FollowSource;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import nfd.c1;
import com.kwai.robust.PatchProxyResult;
import jga.f;
import lyb.h;
import fed.j;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import oe6.e;
import android.view.View;
import gbd.e;
import brd.y;
import android.content.Context;
import o56.a;
import android.app.Application;
import fed.k;
import java.lang.Runnable;
import com.yxcorp.plugin.search.utils.x;
import lnc.a1;
import ufd.l;
import com.kwai.framework.model.user.QCurrentUser;
import nfd.m0$a;
import nfd.n0;
import nfd.o3;
import nfd.m0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import fed.l$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e7d.f;
import mrd.c;

public class l extends n	// class@0024b9
{
    public User p;
    public SearchItem q;
    public RecyclerFragment r;
    public f s;
    public c t;
    public f u;
    public a0 v;
    public boolean w;

    public void l(a0 p0){
       super();
       this.w = y0.p();
       this.v = p0;
    }
    public void E8(){
       f uof;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "4")) {
          return;
       }
       l tp = this.p;
       if (tp == null) {
          return;
       }
       tp.startSyncWithFragment(this.r.m());
       this.Y8();
       this.q.mUser = this.p;
       if (!PatchProxy.applyVoid(objArray, this, ol, "6") && this.getActivity() != null) {
          ol = this.p;
          if (ol != null) {
             String sourceString = (this.s != null)? FollowSource.SEARCH.getSourceString(ol): "";
             String str = sourceString;
             Activity activity = this.getActivity();
             l tq = this.q;
             l tp1 = this.p;
             FeedLogCtx uFeedLogCtx = this.W8();
             c1 uoc1 = c1.class;
             if (PatchProxy.isSupport(uoc1)) {
                Object[] objArray1 = new Object[]{activity,tq,tp1,str,uFeedLogCtx};
                uof = PatchProxy.apply(objArray1, objArray, uoc1, "3");
                if (uof != PatchProxyResult.class) {
                label_007c :
                   this.u = uof;
                }
             }
             uof = c1.a(activity, tq, tp1, str, -1, uFeedLogCtx);
             goto label_007c ;
          }
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, l.class, "3");
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, l.class, "10")) {
          return;
       }
       FollowHelper.c(this.u, new j(this));
       e.f0(false);
       return;
    }
    public FeedLogCtx W8(){
       Object obj = PatchProxy.apply(null, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getReportFeedLogCtx();
    }
    public void X8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "7")) {
          return;
       }
       l tt = this.t;
       if (tt != null) {
          e uoe = e.a();
          uoe.b(this.q);
          tt.onNext(uoe);
       }
       x.d(this.getContext(), a.B.getString(R.string.arg_RES_7f103077), new k(this));
       return;
    }
    public void Y8(){
       a0 g;
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       int i = 0x7f100f8f;
       this.v.g.a(a1.p(i));
       l tv = this.v;
       tv.g.b(tv.h);
       tv = this.p;
       if (tv == null) {
          return;
       }
       boolean b = false;
       if (tv.isFollowingOrFollowRequesting()) {
          if (this.v.d != null || ((QCurrentUser.me().getId()).equals(this.p.mId) && this.w != null)) {
             this.v.g.k(4);
          }else {
             this.v.g.d(8);
             i = 0x7f101034;
             if (this.w != null) {
                g = this.v.g;
                if (this.p.mIsFans != null) {
                   i = 0x7f104651;
                }
                g.a(a1.p(i));
             }else {
                this.v.g.a(a1.p(i));
             }
          }
       }else {
          this.v.g.k(b);
          this.v.g.d(b);
          if (this.w != null) {
             g = this.v.g;
             if (this.p.mIsFans != null) {
                i = 0x7f10408e;
             }
             g.a(a1.p(i));
          }else {
             this.v.g.a(a1.p(i));
          }
       }
       m0$a uoa = new m0$a();
       uoa.c(n0.g(this.p));
       uoa.f(R.drawable.arg_RES_7f081e90);
       i = 1;
       uoa.b(i);
       if (this.q.mAtmosphereType == i) {
          b = true;
       }
       uoa.e(b);
       n0.b(this.v.g, uoa.a());
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       FollowHelper.k(this.u).subscribe(Functions.d(), Functions.d());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.v.g.c(this.m8());
       this.v.g.g(new l$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.t8("SEARCH_USER");
       this.q = this.q8(SearchItem.class);
       this.r = this.r8("FRAGMENT");
       this.s = this.t8("SEARCH_RESULT_DELEGATE");
       this.t = this.t8("SEARCH_FEED_BUTTON_SUBJECT");
       return;
    }
}
