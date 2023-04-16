package dl9.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dl9.u$a;
import nsd.u;
import java.lang.Long;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import dl9.u$b;
import com.kuaishou.android.model.mix.QComment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.CommentConfig;
import nx9.c;
import android.view.View;
import hl9.t;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import t45.d;
import brd.z;
import dl9.u$c;
import erd.g;
import crd.b;
import android.widget.ImageView;
import dl9.u$d;
import android.view.View$OnClickListener;
import dl9.u$e;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.g;
import fk9.b;
import g9c.a;
import usd.q;
import qvb.i;
import al9.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.l1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import dl9.u$f;
import qrd.l1;
import android.view.View$OnLayoutChangeListener;
import dl9.u$g;
import io.reactivex.internal.functions.Functions;
import com.airbnb.lottie.LottieAnimationView;
import k2b.e0;
import yk9.d;
import gk9.c;
import gk9.b;
import cjd.e;
import erd.o;
import dl9.v;
import dl9.w;
import zf6.k;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kuaishou.android.model.mix.CommentMeta;
import ekd.m1;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import wnc.a;
import e17.i;
import android.os.SystemClock;
import java.lang.Number;
import lnc.a1;
import java.lang.CharSequence;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import dl9.x;
import dl9.y;
import dl9.u$h;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;
import dl9.u$i;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import android.view.Window;
import java.util.Objects;
import dl9.u$j;
import dl9.u$k;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import mrd.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class u extends PresenterV2	// class@001fba
{
    public View A;
    public ImageView B;
    public KwaiLottieAnimationView C;
    public LottieAnimationView D;
    public long E;
    public long F;
    public a G;
    public boolean H;
    public View$OnLayoutChangeListener I;
    public u$b J;
    public QComment p;
    public d q;
    public Map r;
    public Map s;
    public QPhoto t;
    public CommentConfig u;
    public c v;
    public c w;
    public CommentsFragment x;
    public BaseFragment y;
    public t z;
    public static final List K;
    public static final u$a L;

    static {
       u.L = new u$a(null);
       Long[] longArray = new Long[]{Long.valueOf(3)};
       u.K = CollectionsKt__CollectionsKt.P(longArray);
    }
    public void u(){
       super();
       this.J = new u$b(this);
    }
    public static final QComment P8(u p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mComment");
       }
       return p0;
    }
    public static final Map R8(u p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mDislikeRequestingMap");
       }
       return p0;
    }
    public void E8(){
       u tx;
       boolean b;
       boolean b1;
       u tt;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "4")) {
          return;
       }
       u tu = this.u;
       if (tu == null) {
          a.S("mCommentConfig");
       }
       if (tu.mEnableNewLikeDislikeUi == null) {
          return;
       }else if(c.f()){
          t.l9(this.m8(), R.id.container_like_dislike);
          this.Z8();
       }
       if (this.x != null) {
          tu = this.p;
          if (tu == null) {
             a.S("mComment");
          }
          tx = this.x;
          a.m(tx);
          tu.startSyncWithFragment(tx.m());
       }else if(this.y != null){
          tu = this.p;
          if (tu == null) {
             a.S("mComment");
          }
          tx = this.y;
          a.m(tx);
          tu.startSyncWithFragment(tx.m());
       }
       tu = this.p;
       if (tu == null) {
          a.S("mComment");
       }
       this.X7(tu.observable().subscribeOn(d.a).subscribe(new u$c(this)));
       int i = 0;
       if (this.W8()) {
          tu = this.B;
          if (tu != null) {
             tu.setVisibility(i);
          }
          tu = this.C;
          if (tu != null) {
             tu.setVisibility(4);
          }
          tu = this.D;
          if (tu != null) {
             tu.setVisibility(4);
          }
       }else {
          tu = this.B;
          int i2 = 8;
          if (tu != null) {
             tu.setVisibility(i2);
          }
          tu = this.C;
          if (tu != null) {
             tu.setVisibility(i2);
          }
          tu = this.D;
          if (tu != null) {
             tu.setVisibility(i2);
          }
       }
       tu = this.A;
       if (tu != null) {
          tu.setOnClickListener(new u$d(this));
       }
       tu = this.v;
       if (tu == null) {
          a.S("mCancelDislikedSubject");
       }
       this.X7(tu.subscribe(new u$e(this)));
       if (this.W8()) {
          Object[] obj = PatchProxy.apply(objArray, this, ou, "24");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             tu = this.p;
             if (tu == null) {
                a.S("mComment");
             }
             if (!tu.isSub()) {
                tu = this.x;
                if (!tu instanceof RecyclerFragment) {
                   obj = objArray;
                }
                g og = (obj != null)? obj.g7(): objArray;
                if (!og instanceof b) {
                   og = objArray;
                }
                int i1 = 0;
                while (true) {
                   a.m(og);
                   if (i1 < q.u(10, og.getItemCount())) {
                      QComment qComment = og.N0(i1);
                      a.m(qComment);
                      if (qComment.mType == 1) {
                         tu = this.p;
                         if (tu == null) {
                            a.S("mComment");
                         }
                         b = a.g(qComment, tu);
                         break ;
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }
             }
             b = false;
          }
          if (b) {
             u$f obj1 = PatchProxy.apply(objArray, this, ou, "25");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                tt = this.x;
                if (!tt instanceof RecyclerFragment) {
                   objArray1 = objArray;
                }
                i oi = (objArray1 != null)? objArray1.q(): objArray;
                if (oi instanceof a) {
                   objArray = oi;
                }
                if (objArray != null && !objArray.w0()) {
                   i = 1;
                }
                b1 = i;
             }
             if (b1) {
                tt = this.t;
                if (tt == null) {
                   a.S("mPhoto");
                }
                User user = tt.getUser();
                if (user == null || (user.isFriend() != true && (this.B != null && !l1.d()))) {
                   tt = this.x;
                   if (tt != null) {
                      RecyclerView recyclerView = tt.h0();
                      if (recyclerView != null) {
                         recyclerView.addOnScrollListener(this.J);
                      }
                   }
                   obj1 = new u$f(this);
                   this.I = obj1;
                   this.m8().addOnLayoutChangeListener(obj1);
                }
             }
          }
       }
    label_01ac :
       this.d9();
       if (this.W8()) {
          tt = this.p;
          if (tt == null) {
             a.S("mComment");
          }
          if (tt.getStatus() != 1) {
             tt = this.p;
             if (tt == null) {
                a.S("mComment");
             }
             if (tt.getStatus() != 2) {
             label_01e5 :
                tt = this.z;
                if (tt != null) {
                   b uob = tt.subscribe(new u$g(this), Functions.d());
                   if (uob != null) {
                      this.X7(uob);
                   }
                }
                return;
             }
          }
          tt = this.B;
          if (tt != null) {
             tt.setVisibility(4);
          }
          tt = this.C;
          if (tt != null) {
             tt.setVisibility(4);
          }
          tt = this.D;
          if (tt != null) {
             tt.setVisibility(4);
             goto label_01e5 ;
          }else {
             goto label_01e5 ;
          }
       }else {
          goto label_01e5 ;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "5")) {
          return;
       }
       this.m8().removeOnLayoutChangeListener(this.I);
       u tC = this.C;
       u ou = 1;
       if (tC == null || tC.p() != ou) {
          tC = this.D;
          if (tC == null || tC.p() != ou) {
          label_004f :
             tC = this.x;
             if (tC != null) {
                RecyclerView recyclerView = tC.h0();
                if (recyclerView != null) {
                   recyclerView.removeOnScrollListener(this.J);
                }
             }
             return;
          }
       }
       tC = this.C;
       if (tC != null && tC.p() == ou) {
          tC = this.C;
          if (tC != null) {
             tC.f();
          }
       }
       tC = this.D;
       if (tC != null && tC.p() == ou) {
          tC = this.D;
          if (tC != null) {
             tC.f();
          }
       }
       this.Y8();
       goto label_004f ;
    }
    public final void S8(){
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "18")) {
          return;
       }
       u tq = this.q;
       if (tq == null) {
          a.S("mCommentLogger");
       }
       u tp = this.p;
       String str = "mComment";
       if (tp == null) {
          a.S(str);
       }
       tq.q(tp, this.x);
       tq = this.p;
       if (tq == null) {
          a.S(str);
       }
       boolean b = false;
       tq.updateDislike(b);
       this.b9(b);
       if (!PatchProxy.applyVoid(objArray, this, ou, "19")) {
          ou = this.t;
          String str1 = "mPhoto";
          if (ou == null) {
             a.S(str1);
          }
          String userId = ou.getUserId();
          tq = this.t;
          if (tq == null) {
             a.S(str1);
          }
          str1 = tq.getPhotoId();
          tq = this.p;
          if (tq == null) {
             a.S(str);
          }
          String id = tq.getId();
          t ot = PatchProxy.applyThreeRefs(userId, str1, id, null, c.class, "15");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = c.f().k(userId, str1, id);
          }
          ot.map(new e()).subscribe(new v(this), new w(this));
       }
       return;
    }
    public final boolean V8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       u ou = u.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ou, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (k.d()) {
          if (k.e()) {
             Object obj1 = PatchProxy.apply(objArray, this, ou, "22");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                u tx = this.x;
                if (tx instanceof CommentsFragment) {
                   objArray = tx;
                }
                if (objArray != null && objArray.Nh() == true) {
                   b1 = true;
                }else {
                   b1 = false;
                }
             }
             if (b1) {
             label_0046 :
                b = true;
             }
          }
       }else {
          goto label_0046 ;
       }
       return b;
    }
    public final boolean W8(){
       boolean b;
       u obj = PatchProxy.apply(null, this, u.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mCommentConfig");
       }
       if (obj.mEnableNewLikeDislikeUi != null) {
          obj = this.t;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (obj.getCommentMeta() != null) {
             obj = this.t;
             if (obj == null) {
                a.S("mPhoto");
             }
             CommentMeta commentMeta = obj.getCommentMeta();
             a.m(commentMeta);
             if (commentMeta.mDisableCommentDislike != null) {
             label_0044 :
                b = false;
             label_0045 :
                return b;
             }
          }
          b = true;
          goto label_0045 ;
       }else {
          goto label_0044 ;
       }
    }
    public final LottieAnimationView X8(boolean p0){
       u tC = (p0)? this.C: this.D;
       return tC;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, u.class, "16")) {
          return;
       }
       u tC = this.C;
       int i = 4;
       if (tC != null) {
          tC.setVisibility(i);
       }
       tC = this.D;
       if (tC != null) {
          tC.setVisibility(i);
       }
       tC = this.B;
       if (tC != null) {
          tC.setVisibility(0);
       }
       return;
    }
    public final void Z8(){
       u tB;
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       if (this.H != null) {
          return;
       }
       this.A = m1.f(this.m8(), 0x7f0a0700);
       this.B = m1.f(this.m8(), 0x7f0a150f);
       this.C = m1.f(this.m8(), 0x7f0a29b8);
       this.D = m1.f(this.m8(), 0x7f0a29b7);
       this.H = true;
       if (c.c()) {
          tB = this.B;
          if (tB != null) {
             tB.setImageResource(R.drawable.arg_RES_7f0804f2);
          }
       }else if(c.d()){
          tB = this.B;
          if (tB != null) {
             tB.setImageResource(R.drawable.arg_RES_7f0804f3);
          }
       }else {
          tB = this.B;
          if (tB != null) {
             tB.setImageResource(R.drawable.arg_RES_7f0804f1);
          }
       }
       return;
    }
    public final void a9(){
       SharedPreferences a;
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "9")) {
          return;
       }
       if (!a.a()) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          return;
       }else if((SystemClock.elapsedRealtime() - this.F) - (long)800 >= 0){
          u tC = this.C;
          boolean b = true;
          if (tC == null || tC.p() != b) {
             this.F = SystemClock.elapsedRealtime();
             tC = this.p;
             String str = "mComment";
             if (tC == null) {
                a.S(str);
             }
             if (tC.getId() != null) {
                tC = this.s;
                String str1 = "mDislikeRequestingMap";
                if (tC == null) {
                   a.S(str1);
                }
                u tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                Boolean tRUE = Boolean.TRUE;
                if (!a.g(tC.get(tp.getId()), tRUE)) {
                   tC = this.r;
                   if (tC == null) {
                      a.S("mLikeRequestingMap");
                   }
                   u tp1 = this.p;
                   if (tp1 == null) {
                      a.S(str);
                   }
                   if (!a.g(tC.get(tp1.getId()), tRUE)) {
                      tC = this.s;
                      if (tC == null) {
                         a.S(str1);
                      }
                      u tp2 = this.p;
                      if (tp2 == null) {
                         a.S(str);
                      }
                      str1 = tp2.getId();
                      a.o(str1, "mComment.id");
                      tC.put(str1, tRUE);
                      tC = this.p;
                      if (tC == null) {
                         a.S(str);
                      }
                      if (tC.mDisliked != null) {
                         this.S8();
                      }else if(PatchProxy.applyVoid(objArray, this, ou, "11")){
                         str1 = 0x7f11066a;
                         tp = 3;
                         if (!PatchProxy.applyVoid(objArray, this, ou, "12")) {
                            long l = SystemClock.elapsedRealtime();
                            List k = u.K;
                            if (k.size() < tp) {
                               k.add(Long.valueOf(l));
                            }else {
                               k.add(Long.valueOf(l));
                               if ((l - k.remove(0).longValue()) - (long)0x2710 <= 0) {
                                  i.d(str1, a1.p(R.string.arg_RES_7f10077e));
                               }
                            }
                         }
                         if (!PatchProxy.applyVoid(objArray, this, ou, "13")) {
                            a = l1.a;
                            String str3 = "commentThumbsDownCount";
                            int intx = a.getInt(str3, 0);
                            if (intx < tp) {
                               i.d(str1, a1.p(R.string.arg_RES_7f10077c));
                               SharedPreferences$Editor uEditor = a.edit();
                               uEditor.putInt(str3, (intx + b));
                               g.a(uEditor);
                            }
                         }
                         tC = this.q;
                         if (tC == null) {
                            a.S("mCommentLogger");
                         }
                         tp2 = this.p;
                         if (tp2 == null) {
                            a.S(str);
                         }
                         tC.q(tp2, this.x);
                         this.b9(b);
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         if (!PatchProxy.applyVoid(objArray, this, ou, "17")) {
                            tp2 = this.t;
                            String str2 = "mPhoto";
                            if (tp2 == null) {
                               a.S(str2);
                            }
                            str1 = tp2.getUserId();
                            u tt = this.t;
                            if (tt == null) {
                               a.S(str2);
                            }
                            str2 = tt.getPhotoId();
                            tt = this.p;
                            if (tt == null) {
                               a.S(str);
                            }
                            str = tt.getId();
                            t obj = PatchProxy.apply(objArray, this, ou, "21");
                            if (obj != patchProxyRe) {
                               b = obj.booleanValue();
                            }else if((SystemClock.elapsedRealtime() - this.E) - (long)500 < 0){
                               b = false;
                            }
                            if (PatchProxy.isSupport(c.class)) {
                               obj = PatchProxy.applyFourRefs(str1, str2, str, Boolean.valueOf(b), null, c.class, "14");
                               if (obj != patchProxyRe) {
                               label_01bc :
                                  obj.map(new e()).subscribe(new x(this), new y(this));
                               }
                            }
                            obj = c.f().d(str1, str2, str, b);
                            goto label_01bc ;
                         }
                      }
                   }
                }
             }
          }
       }
    label_01d2 :
       return;
    }
    public final void b9(boolean p0){
       int i;
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ou, "14")) {
          return;
       }
       u tC = this.C;
       if (tC != null) {
          tC.t();
       }
       tC = this.D;
       if (tC != null) {
          tC.t();
       }
       tC = this.D;
       if (tC != null) {
          tC.f();
       }
       tC = this.C;
       if (tC != null) {
          tC.D(R.string.arg_RES_7f100ee9);
       }
       tC = this.C;
       if (tC != null) {
          tC.setSpeed(0x3fa00000);
       }
       tC = this.D;
       LottieAnimationView obj = PatchProxy.apply(null, this, ou, "23");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(this.V8()){
          i = 0x7f0f0057;
       }else {
          i = 0x7f0f0058;
       }
       f.b(tC, null, i, new u$h(this, p0));
       obj = this.X8(p0);
       if (obj != null) {
          obj.a(new u$i(this, p0));
       }
       return;
    }
    public final void c9(View p0){
       boolean b;
       a uoa;
       View view;
       u ou = u.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ou, "7")) {
          return;
       }
       u tu = this.u;
       if (tu == null) {
          a.S("mCommentConfig");
       }
       if (tu.mDisableAllBubbleGuide != null) {
          return;
       }else {
          a obj = PatchProxy.apply(null, this, ou, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             view = this.m8();
             String str = "rootView";
             a.o(view, str);
             if (view.getTop() > 0) {
                ou = this.x;
                a.m(ou);
                RecyclerView recyclerView = ou.h0();
                a.o(recyclerView, "mFragment!!.recyclerView");
                View view1 = this.m8();
                a.o(view1, str);
                if ((recyclerView.getHeight() - view1.getBottom()) > 0) {
                   b = true;
                }
             }
             b = false;
          }
          if (!b) {
             return;
          }else if(l1.d()){
             return;
          }else if(this.getActivity() != null){
             Activity activity = this.getActivity();
             a.m(activity);
             obj = new a(activity);
             obj.I0(0x271d);
             obj.K0(KwaiBubbleOption.f);
             obj.v0((- a1.d(R.dimen.arg_RES_7f0702e3)));
             obj.o0(p0);
             obj.q0(true);
             obj.F0(a1.p(R.string.arg_RES_7f10077d));
             obj.T(3000);
             Activity activity1 = this.getActivity();
             a.m(activity1);
             a.o(activity1, "activity!!");
             Window window = activity1.getWindow();
             a.o(window, "activity!!.window");
             window = window.getDecorView();
             Objects.requireNonNull(window, "null cannot be cast to non-null type android.view.ViewGroup");
             obj.C(window);
             obj.A(true);
             obj.P(true);
             obj.K(new u$j(this));
             obj.M(new u$k(this));
             if (this.V8()) {
                a.o(obj, "builder");
                uoa = p.m(obj);
             }else {
                a.o(obj, "builder");
                uoa = p.n(obj);
             }
             this.G = uoa;
          }
          return;
       }
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, u.class, "20")) {
          return;
       }
       u tB = this.B;
       if (tB != null) {
          u tp = this.p;
          if (tp == null) {
             a.S("mComment");
          }
          tB.setSelected(tp.mDisliked);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       a.p(p0, "view");
       if (!c.f()) {
          this.Z8();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       Object obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.p = obj;
       obj = this.q8(d.class);
       a.o(obj, "inject\(CommentLogger::class.java\)");
       this.q = obj;
       obj = this.r8("COMMENT_REQUESTING_LIKE_MAP");
       a.o(obj, "inject\(CommentAccessIds.¡­MENT_REQUESTING_LIKE_MAP\)");
       this.r = obj;
       obj = this.r8("COMMENT_REQUESTING_DISLIKE_MAP");
       a.o(obj, "inject\(CommentAccessIds.¡­T_REQUESTING_DISLIKE_MAP\)");
       this.s = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.q8(CommentConfig.class);
       a.o(obj, "inject\(CommentConfig::class.java\)");
       this.u = obj;
       obj = this.r8("COMMENT_CANCEL_DISLIKED_SUBJECT");
       a.o(obj, "inject\(CommentAccessIds.¡­_CANCEL_DISLIKED_SUBJECT\)");
       this.v = obj;
       obj = this.r8("COMMENT_CANCEL_LIKED_SUBJECT");
       a.o(obj, "inject\(CommentAccessIds.¡­ENT_CANCEL_LIKED_SUBJECT\)");
       this.w = obj;
       this.x = this.t8("FRAGMENT");
       this.y = this.t8("DETAIL_FRAGMENT");
       this.z = this.t8("COMMENT_HIDE_PANEL_ANIM_END_OBSERVABLE");
       return;
    }
}
