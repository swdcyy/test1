package com.yxcorp.gifshow.designermagic.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designermagic.a$a;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import qw9.c;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Number;
import android.app.Activity;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import y8c.g;
import java.util.List;
import g9c.a;
import java.util.ArrayList;
import qw9.a;
import k2b.e0;
import qw9.d;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@001327
{
    public RecyclerFragment p;
    public PublishSubject q;
    public int r;
    public int s;
    public RecyclerView$r t;

    public void a(){
       super();
       this.r = -1;
       this.t = new a$a(this);
    }
    public static boolean R8(View p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p1 <= n.p(p0)[i]) {
          i = false;
       }
       return i;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.P8()) {
          return;
       }
       this.s = 0;
       this.r = -1;
       this.p.h0().addOnScrollListener(this.t);
       this.X7(this.q.subscribe(new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.P8()) {
          return;
       }
       if (this.p.K0()) {
          this.V8();
       }
       this.p.h0().removeOnScrollListener(this.t);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.p.h0().getLayoutManager() instanceof LinearLayoutManager ^ 0x01);
    }
    public void S8(){
       int i1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.p.h0().getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          int i = layoutManage.c();
          if (this.r >= i) {
             return;
          }else if(PatchProxy.isSupport(uoa)){
             Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(i), layoutManage, this, uoa, "7");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else {
             label_0040 :
                Activity obj1 = PatchProxy.apply(objArray, this, uoa, "8");
                if (obj1 != PatchProxyResult.class) {
                   i1 = obj1.intValue();
                }else if(this.s == null){
                   obj1 = this.getActivity();
                   if (obj1 != null) {
                      this.s = n.j(obj1);
                   }
                }
                uoa = this.s;
                if (i1 == null) {
                   i1 = -1;
                }else {
                   while (i >= 0) {
                      View view = layoutManage.findViewByPosition(i);
                      if (view != null && a.R8(view, i1)) {
                         break ;
                      }
                      i = i - 1;
                   }
                   i1 = i;
                }
             }
          }else {
             goto label_0040 ;
          }
          this.r = Math.max(this.r, i1);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.S8();
       a tr = this.r;
       if (tr != -1) {
          if (tr > -1) {
             if (this.p.h0().getAdapter() == null) {
                return;
             }else {
                RecyclerView$Adapter adapter = this.p.h0().getAdapter();
                if (adapter instanceof d) {
                   adapter = adapter.W0();
                }
                if (!adapter instanceof g) {
                   return;
                }else {
                   List list = adapter.Q0();
                   if (list == null) {
                      return;
                   }else {
                      this.r = Math.min((list.size() - 1), this.r);
                      ArrayList uArrayList = new ArrayList();
                      int i = 0;
                      while (i <= this.r) {
                         if (!list.get(i) instanceof a) {
                            uArrayList.add(null);
                         }else {
                            uArrayList.add(list.get(i));
                         }
                         i = i + 1;
                      }
                      d.a(this.p, uArrayList);
                   }
                }
             }
          }
          this.r = -1;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("magic_designer_fragment_hidden_change_subject");
       return;
    }
}
