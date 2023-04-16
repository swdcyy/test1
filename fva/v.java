package fva.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fva.v$a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yua.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import k2b.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.rx.RxBus;
import dva.a;
import brd.t;
import t45.d;
import brd.z;
import fva.v$b;
import erd.g;
import crd.b;
import fva.v$c;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Boolean;
import dva.b;
import java.lang.Integer;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import android.widget.LinearLayout;
import jva.k;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.content.res.ColorStateList;
import e2.d;
import fva.v$e;
import android.view.View$OnClickListener;
import fva.q;
import java.util.Locale;
import fva.v$d;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;

public final class v extends PresenterV2	// class@002a34
{
    public HotSpotModel p;
    public k q;
    public a r;
    public e0 s;
    public boolean t;
    public int u;
    public final RecyclerView v;
    public static final v$a w;

    static {
       v.w = new v$a(null);
    }
    public void v(RecyclerView p0){
       a.p(p0, "recyclerView");
       super();
       this.v = p0;
    }
    public static final a P8(v p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("adapter");
       }
       return p0;
    }
    public static final HotSpotModel R8(v p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("data");
       }
       return p0;
    }
    public static final e0 S8(v p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("page");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       v tp = this.p;
       String str = "data";
       if (tp == null) {
          a.S(str);
       }
       HotSpotModel mHotSpotItem = tp.mHotSpotItems;
       tp = (mHotSpotItem == null || mHotSpotItem.isEmpty())? 1: null;
       if (!tp) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          if (tp.mHotSpotItems.size() > 3) {
             tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             if (tp.mHotSpotItems.size() > 3) {
                tp = this.p;
                if (tp == null) {
                   a.S(str);
                }
                if (tp.mState != null) {
                label_0050 :
                   tp = this.p;
                   if (tp == null) {
                      a.S(str);
                   }
                   if (!TextUtils.x(tp.mHotBoardName)) {
                      tp = this.p;
                      if (tp == null) {
                         a.S(str);
                      }
                      if (!TextUtils.x(tp.mHotBoardLinkUrl)) {
                      label_006f :
                         tp = this.p;
                         if (tp == null) {
                            a.S(str);
                         }
                         if (tp.mHotSpotItems.size() > 3) {
                            tp = this.p;
                            if (tp == null) {
                               a.S(str);
                            }
                            if (tp.mHotSpotItems.size() > 3) {
                               tp = this.p;
                               if (tp == null) {
                                  a.S(str);
                               }
                               if (tp.mState != null) {
                               label_0098 :
                                  tp = this.p;
                                  if (tp == null) {
                                     a.S(str);
                                  }
                                  if (!TextUtils.x(tp.mHotBoardName)) {
                                     tp = this.p;
                                     if (tp == null) {
                                        a.S(str);
                                     }
                                     if (!TextUtils.x(tp.mHotBoardLinkUrl)) {
                                        this.W8(3);
                                     label_00c2 :
                                        this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new v$b(this)));
                                        this.v.addOnScrollListener(new v$c(this));
                                        return;
                                     }
                                  }
                               }
                            }
                         }else {
                            goto label_0098 ;
                         }
                      label_00ba :
                         this.W8(2);
                         goto label_00c2 ;
                      }
                   }
                }else {
                   goto label_006f ;
                }
             }else {
                goto label_006f ;
             }
          }else {
             goto label_0050 ;
          }
       }
    label_00bf :
       this.W8(1);
       goto label_00c2 ;
    }
    public final void V8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "4")) {
          return;
       }
       if (this.t != p0) {
          RxBus.f.b(new b(p0));
          this.t = p0;
       }
       return;
    }
    public final void W8(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ov, "2")) {
          return;
       }
       this.u = p0;
       ov = this.p;
       String str = "data";
       if (ov == null) {
          a.S(str);
       }
       ov.mViewState = p0;
       v tu = this.u;
       if (tu != 1) {
          if (tu != 2) {
             if (tu == 3) {
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                tu.l1().setVisibility(0);
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                tu.o1().setVisibility(0);
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                tu.p1().setVisibility(0);
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                TextView textView = tu.q1();
                ov = this.p;
                if (ov == null) {
                   a.S(str);
                }
                textView.setText(ov.mHotBoardName);
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                tu.n1().setImageDrawable(a1.f(R.drawable.arg_RES_7f08054c));
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                d.c(tu.n1(), ColorStateList.valueOf(a1.a(R.color.arg_RES_7f0607e6)));
                tu = this.q;
                if (tu == null) {
                   a.S("binding");
                }
                tu.o1().setOnClickListener(new v$e(this));
             }
          }else {
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             tu.l1().setVisibility(0);
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             tu.o1().setVisibility(0);
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             tu.p1().setVisibility(0);
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             Locale cHINESE = Locale.CHINESE;
             a.o(cHINESE, "Locale.CHINESE");
             tu.q1().setText(q.a.a(cHINESE, R.string.arg_RES_7f1004d1));
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             tu.n1().setImageDrawable(a1.f(R.drawable.arg_RES_7f08054f));
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             d.c(tu.n1(), ColorStateList.valueOf(a1.a(R.color.arg_RES_7f0607e6)));
             this.V8(0);
             tu = this.q;
             if (tu == null) {
                a.S("binding");
             }
             tu.o1().setOnClickListener(new v$d(this));
          }
       }else {
          tu = this.q;
          if (tu == null) {
             a.S("binding");
          }
          tu.l1().setVisibility(8);
          tu = this.q;
          if (tu == null) {
             a.S("binding");
          }
          tu.o1().setVisibility(8);
          tu = this.q;
          if (tu == null) {
             a.S("binding");
          }
          tu.p1().setVisibility(8);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       Object obj = this.q8(HotSpotModel.class);
       a.o(obj, "inject\(HotSpotModel::class.java\)");
       this.p = obj;
       obj = this.q8(k.class);
       a.o(obj, "inject\(HotSpotTodayMoreView::class.java\)");
       this.q = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(TodayListAdapter::class.java\)");
       this.r = obj;
       obj = this.q8(HotSpotFragment.class);
       a.o(obj, "inject\(HotSpotFragment::class.java\)");
       this.s = obj;
       return;
    }
}
