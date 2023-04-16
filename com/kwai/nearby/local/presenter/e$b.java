package com.kwai.nearby.local.presenter.e$b;
import qvb.q;
import com.kwai.nearby.local.presenter.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import mrb.a;
import java.lang.StringBuilder;
import android.util.Log;
import q87.c;
import qvb.p;
import qvb.n0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.List;
import qvb.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import o56.f;
import androidx.fragment.app.FragmentActivity;
import za5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import qd7.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import sc7.b0;
import irb.b;

public class e$b implements q	// class@000faf
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       if (p0) {
          Object[] objArray = new Object[0];
          a.C().t("HomeLocalPageList", "onError first page,error message : "+Log.getStackTraceString(p1), objArray);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "2")) {
          return;
       }
       if (p0) {
          Object[] objArray = new Object[0];
          a.C().t("HomeLocalPageList", "onStartLoading first page", objArray);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       e p;
       e$b uob = e$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       int i = 0;
       if (p0) {
          Object[] objArray = new Object[i];
          String str = "HomeLocalPageList";
          a.C().t(str, "onFinishLoading first page", objArray);
          p = this.b.p;
          if (p != null && (p.L0() != null && this.b.p.L0().mQPhotos != null)) {
             Object[] objArray1 = new Object[i];
             a.C().t(str, "onFinishLoading first page total count = "+this.b.p.L0().mQPhotos.size()+"showCount = "+this.b.p.getCount(), objArray1);
          }
       label_007d :
          e$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, e.class, "2") && f.b(tb.getActivity())) {
             FragmentActivity activity = tb.getActivity();
             if (a.o0(activity).p0() == 3) {
                RxBus.f.b(new a());
             }else {
                a.o0(activity).p0();
             }
          }
       }else {
          this.b.q.h0().stopScroll();
       }
       this.b.R8();
       p = this.b.p;
       if (p instanceof b0) {
          i = p.X0;
       }
       RxBus.f.b(new b(p0, p1, i));
       if (p0) {
          this.b.q.N1();
       }
       return;
    }
}
