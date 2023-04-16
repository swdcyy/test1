package com.yxcorp.gifshow.map.search.a$c;
import ty5.e;
import com.yxcorp.gifshow.map.search.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import java.util.HashSet;
import java.util.Set;
import com.yxcorp.utility.n;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zf6.l;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import kotlin.jvm.internal.a;
import qrd.l1;
import k3d.b;
import java.lang.Boolean;
import com.yxcorp.map.fragment.LocationSuggestionFragment;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.map.search.a$c$a;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.map.search.a$c$b;
import com.yxcorp.gifshow.map.search.a$c$c;
import qvb.i;
import com.yxcorp.map.search.SearchEditorLayout;

public final class a$c extends e	// class@001cd6
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void R(){
       a$c tb1;
       a$c uoc = a$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       a c = this.b.C;
       if (c != null && !c.isAdded()) {
          return;
       }
       c = this.b.C;
       if (c != null) {
          View view = c.getView();
          if (view != null) {
             view.setClickable(true);
          }
       }
       c = this.b.C;
       FragmentActivity activity = (c != null)? c.getActivity(): objArray;
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.F2(this.b.A);
       a$c tb = this.b;
       a y = tb.y;
       if (y == null) {
          tb.y = new HashSet();
       }else if(y != null){
          y.clear();
       }
       View[] viewArray = new View[]{tb1.r,tb1.t};
       tb1 = this.b;
       n.Z(0, viewArray);
       Activity activity1 = this.b.getActivity();
       if (activity1 != null) {
          i.h(activity1, 0, l.r());
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          ViewGroup$LayoutParams layoutParams = a.P8(this.b).getLayoutParams();
          Context context = this.b.getContext();
          a.m(context);
          layoutParams.height = n.A(context);
          a.P8(this.b).setLayoutParams(layoutParams);
          View[] viewArray1 = new View[true];
          viewArray1[0] = a.P8(this.b);
          b.a(0x3f800000, viewArray1);
       }
       return;
    }
    public void ke(String p0,boolean p1){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "5")) {
          return;
       }
       a.p(p0, "keyword");
       a w = this.b.w;
       if (w != null) {
          g og = null;
          LocationSuggestionFragment f = (w != null)? w.F: og;
          if (f != null) {
             LocationSuggestionFragment f1 = (w != null)? w.F: og;
             if (a.g(f1, p0) ^ 0x01) {
                a w1 = this.b.w;
                if (w1 != null) {
                   og = w1.g7();
                }
                if (og != null) {
                   w1 = this.b.w;
                   if (w1 != null) {
                      g og1 = w1.g7();
                      if (og1 != null) {
                         w1 = og1.M0();
                         if (w1 != null) {
                            w1.k0();
                         }
                      }
                   }
                }
             }
          }
       }
    label_0058 :
       return;
    }
    public void qc(String p0,boolean p1,String p2){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a$c.class, "4")) {
          return;
       }
       a.p(p0, "keyword");
       a.p(p2, "ussid");
       a c = this.b.C;
       if (c != null) {
          if (!c.isAdded()) {
             return;
          }else {
             View[] viewArray = new View[]{this.b.t};
             int i = 0;
             n.Z(i, viewArray);
             a$c tb = this.b;
             if (tb.w == null) {
                tb.w = new LocationSuggestionFragment();
                c = this.b.w;
                if (c != null) {
                   c.H = new a$c$a(this);
                }
                Bundle uBundle = new Bundle();
                uBundle.putString("keyWord", p0);
                a w = this.b.w;
                if (w != null) {
                   w.setArguments(uBundle);
                }
                c = this.b.C;
                if (c != null) {
                   c childFragmen = c.getChildFragmentManager();
                   if (childFragmen != null) {
                      e uoe = childFragmen.beginTransaction();
                      if (uoe != null) {
                         a w1 = this.b.w;
                         a.m(w1);
                         uoe.v(R.id.history_content, w1);
                         uoe.m();
                      }
                   }
                }
                c = this.b.w;
                if (c != null) {
                   c.G = new a$c$b(this);
                }
                c = this.b.w;
                if (c != null) {
                   c.I = new a$c$c();
                }
             }
             c = this.b.w;
             if (c != null && !PatchProxy.applyVoidOneRefs(p0, c, LocationSuggestionFragment.class, "8")) {
                if (c.g7() != null) {
                   c.g7().M0().k0();
                }
                c.F = p0;
                if (c.q() != null) {
                   c.q().a();
                }
             }
          }
       }
       return;
    }
    public void s7(boolean p0){
       a$c tb;
       a r;
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       a c = this.b.C;
       if (c != null) {
          if (!c.isAdded()) {
             return;
          }else {
             boolean b = true;
             if (p0) {
                tb = this.b;
                tb.z = b;
                r = tb.r;
                if (r != null) {
                   r.e();
                }
                return;
             }else {
                tb = this.b;
                tb.z = false;
                a w = tb.w;
                if (w != null) {
                   r = tb.C;
                   if (r != null) {
                      c childFragmen = r.getChildFragmentManager();
                      if (childFragmen != null) {
                         e uoe = childFragmen.beginTransaction();
                         if (uoe != null) {
                            uoe = uoe.u(w);
                            if (uoe != null) {
                               uoe.m();
                            }
                         }
                      }
                   }
                }
                View[] viewArray = new View[b];
                viewArray[0] = this.b.r;
                n.Z(4, viewArray);
                viewArray = new View[b];
                viewArray[0] = this.b.t;
                n.Z(8, viewArray);
                this.b.S8(false);
                Activity activity = this.b.getActivity();
                if (activity != null) {
                   i.h(activity, false, b);
                }
                View[] viewArray1 = new View[b];
                viewArray1[0] = a.P8(this.b);
                b.a(0, viewArray1);
                r = this.b.C;
                FragmentActivity activity1 = (r != null)? r.getActivity(): null;
                Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                activity1.l3(this.b.A);
                r = this.b.C;
                if (r != null) {
                   View view = r.getView();
                   if (view != null) {
                      view.setClickable(false);
                   }
                }
             }
          }
       }
       return;
    }
}
