package com.yxcorp.gifshow.designermagic.v2.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import com.yxcorp.gifshow.designermagic.v2.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import tw9.b;
import erd.g;
import crd.b;
import brd.t;
import java.util.Set;
import y8c.g;
import java.util.List;
import g9c.a;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import androidx.recyclerview.widget.LinearLayoutManager;
import qw9.h;
import java.lang.StringBuilder;
import q87.c;
import qw9.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.designermagic.a;
import k2b.e0;
import qw9.d;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@00132d
{
    public int p;
    public RecyclerFragment q;
    public PublishSubject r;
    public final Set s;
    public final RecyclerView$r t;

    public void a(){
       super();
       this.s = new HashSet();
       this.t = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q.h0().addOnScrollListener(this.t);
       this.X7(this.r.subscribe(new b(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.q.h0().removeOnScrollListener(this.t);
       this.s.clear();
       return;
    }
    public void P8(){
       int i2;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "4")) {
          return;
       }
       a tq = this.q;
       if (tq == null) {
          return;
       }
       List list = tq.g7().Q0();
       if (q.f(list)) {
          return;
       }
       if (!this.q.h0().getLayoutManager() instanceof GridLayoutManager) {
          return;
       }
       GridLayoutManager layoutManage = this.q.h0().getLayoutManager();
       if (layoutManage == null) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i = layoutManage.c();
       int i1 = layoutManage.i0();
       Object[] objArray = new Object[0];
       h.D().w("DesignerMagicLogPresenter", "logger item show : "+i1+" , "+i, objArray);
       while (i1 <= i) {
          if (i1 >= 0 && (i1 < list.size() && !this.s.contains(list.get(i1).a.mId))) {
             View view = layoutManage.findViewByPosition(i1);
             if (view != null) {
                Activity obj = PatchProxy.apply(null, this, uoa, "5");
                if (obj != PatchProxyResult.class) {
                   i2 = obj.intValue();
                }else if(this.p == null){
                   obj = this.getActivity();
                   if (obj != null) {
                      this.p = n.j(obj);
                   }
                }
                i2 = this.p;
                if (!a.R8(view, i2)) {
                   objArray = new Object[0];
                   h.D().w("DesignerMagicLogPresenter", i1+"not in screen .", objArray);
                }else {
                   objArray = new Object[0];
                   h.D().w("DesignerMagicLogPresenter", "logger item show : "+i1, objArray);
                   uArrayList.add(list.get(i1));
                   this.s.add(list.get(i1).a.mId);
                }
             }
          }
          i1 = i1 + 1;
       }
       d.a(this.q, uArrayList);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("magic_designer_fragment_hidden_change_subject");
       return;
    }
}
