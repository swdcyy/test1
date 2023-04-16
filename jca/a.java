package jca.a;
import ei0.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import rwc.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.prettify.v4.prettify.widget.PrettifySeekBar;
import jca.a$f;
import lca.b;
import lca.a;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import com.kwai.feature.post.api.widget.RecordSeekBar;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.editor.fine.tuning.widget.ScrollSpeedLinearLayoutManger;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import jca.a$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import jca.a$b;
import android.view.View$OnTouchListener;
import jca.a$c;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import jca.a$d;
import jca.a$e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.ArrayList;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.lang.Iterable;
import gca.c;
import gca.a;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import com.kuaishou.edit.draft.FineTuningParam;
import di0.b;
import java.util.List;
import faa.a;
import q87.c;
import uwc.b;
import wba.z;
import com.kuaishou.edit.draft.AssetSegment;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import jca.a$g;
import jca.a$h;
import erd.g;
import crd.b;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;
import lca.c;
import xyc.a;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import k17.b;

public final class a extends a	// class@002a4f
{
    public final RecyclerView c;
    public final PrettifySeekBar d;
    public final View e;
    public boolean f;
    public final a$f g;
    public final b h;
    public final c i;
    public boolean j;
    public b k;
    public final Fragment l;
    public final FineTuningViewModel m;
    public final j n;

    public void a(Fragment p0,View p1,FineTuningViewModel p2,j p3){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "fineTuningViewModel");
       a.p(p3, "mStopScrollListener");
       super(p1);
       this.l = p0;
       this.m = p2;
       this.n = p3;
       int i = 0x7f0a0eab;
       View view = this.A().findViewById(i);
       a.o(view, "mRootView.findViewById\(R¡­ine_tuning_recycler_view\)");
       this.c = view;
       View view1 = this.A().findViewById(R.id.fine_tuning_seek_bar);
       a.o(view1, "mRootView.findViewById\(R.id.fine_tuning_seek_bar\)");
       this.d = view1;
       View view2 = this.A().findViewById(R.id.fine_tuning_origin_photo);
       a.o(view2, "mRootView.findViewById\(R¡­fine_tuning_origin_photo\)");
       this.e = view2;
       a$f uof = new a$f(this);
       this.g = uof;
       b uob = new b(uof);
       this.h = uob;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.i = publishSubje;
       this.j = true;
       Objects.requireNonNull(p2);
       String obj = PatchProxy.apply(null, p2, FineTuningViewModel.class, "10");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p2.h.b();
       this.f = b;
       if (b) {
          View view3 = p1.findViewById(i);
          a.o(view3, "rootView.findViewById<Re¡­ine_tuning_recycler_view\)");
          ViewGroup$LayoutParams layoutParams = view3.getLayoutParams();
          obj = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
          Objects.requireNonNull(layoutParams, obj);
          layoutParams.topMargin = a1.e(16.00f);
          p1 = p1.findViewById(R.id.line);
          a.o(p1, "rootView.findViewById<View>\(R.id.line\)");
          ViewGroup$LayoutParams layoutParams1 = p1.getLayoutParams();
          Objects.requireNonNull(layoutParams1, obj);
          layoutParams1.topMargin = a1.e(12.00f);
       }
       view1.setAdsorptionThreshold(3);
       view.setAdapter(uob);
       view.setLayoutManager(new ScrollSpeedLinearLayoutManger(p0.getContext(), 0, 0));
       view1.setOnSeekBarChangeListener(new a$a(this));
       view2.setOnTouchListener(new a$b(this));
       p2.f.observe(p0, new a$c(this));
       p2.b.observe(p0, new a$d(this));
       p2.o0().observe(p0, new a$e(this));
       return;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       a tm = this.m;
       Objects.requireNonNull(tm);
       FineTuningRepo uFineTuningR = FineTuningRepo.class;
       if (!PatchProxy.applyVoid(objArray, tm, FineTuningViewModel.class, "3")) {
          FineTuningViewModel h = tm.h;
          Objects.requireNonNull(h);
          if (!PatchProxy.applyVoid(objArray, h, uFineTuningR, "2")) {
             a.c(h.c).c0();
             ArrayList uArrayList1 = new ArrayList();
             ImmutableList immutableLis = h.a();
             a.o(immutableLis, "mFineTuningViewDataList");
             Iterator iterator1 = immutableLis.iterator();
             while (iterator1.hasNext()) {
                FineTuningParam defaultInsta = FineTuningParam.getDefaultInstance();
                a.o(defaultInsta, "FineTuningParam.getDefaultInstance\(\)");
                uArrayList1.add(new a(iterator1.next().a(), defaultInsta));
             }
             b.t(h.b, uArrayList1, objArray, 2, objArray);
             Object[] objArray1 = new Object[0];
             a.D().w("FineTuningRepo", "onAttach", objArray1);
          }
          tm.g.F0(0);
          tm.c.clear();
          h = tm.c;
          FineTuningViewModel h1 = tm.h;
          Objects.requireNonNull(h1);
          ArrayList uArrayList = PatchProxy.apply(objArray, h1, uFineTuningR, "6");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             Iterator iterator = z.y(h1.c).iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getFineTuningParam());
             }
          }
          h.addAll(uArrayList);
          objArray = new Object[0];
          a.D().w("FineTuningViewModel", "onAttach", objArray);
       }
       this.k = this.i.throttleLast(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new a$g(this), a$h.b);
       objArray = new Object[0];
       a.D().w("FineTuningPanelViewBinder", "onAttach", objArray);
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       a tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(objArray, tm, FineTuningViewModel.class, "11")) {
          FineTuningViewModel e = tm.e;
          Objects.requireNonNull(e, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.yxcorp.gifshow.editor.fine.tuning.data.FineTuningItemUiData?>");
          e.setValue(objArray);
          e = tm.h;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(objArray, e, FineTuningRepo.class, "9")) {
             Object[] objArray1 = new Object[0];
             a.D().w("FineTuningRepo", "onDetach", objArray1);
          }
          tm.g.F0(true);
          objArray = new Object[0];
          a.D().w("FineTuningViewModel", "onDetach", objArray);
       }
       tm = this.k;
       if (tm != null) {
          tm.dispose();
       }
       objArray = new Object[0];
       a.D().w("FineTuningPanelViewBinder", "onDetach", objArray);
       return;
    }
    public final Fragment D(){
       return this.l;
    }
    public final void E(int p0){
       int a;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          uoa = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "1");
          if (uoa != PatchProxyResult.class) {
          label_005f :
             if (this.c.getItemDecorationCount() > 0) {
                a tc = this.c;
                tc.removeItemDecoration(tc.getItemDecorationAt(0));
             }
             this.c.addItemDecoration(new b(0, uoa.a(), uoa.a(), (uoa.b * 2)));
             return;
          }
       }
       int i = n.z(a1.c());
       int i1 = c.c * p0;
       a = c.a;
       int i2 = ((((p0 + 1) * a) + i1) > i)? 1: 0;
       i = (i2)? c.b: ((i - i1) - ((p0 - 1) * a)) / 2;
       uoa = new a(i, (a / 2), p0);
       goto label_005f ;
    }
}
