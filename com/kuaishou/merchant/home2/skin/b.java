package com.kuaishou.merchant.home2.skin.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import d04.a;
import androidx.lifecycle.Observer;
import b04.d;
import androidx.lifecycle.MutableLiveData;
import d04.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.SkinDownloader;
import java.util.ArrayList;
import com.kuaishou.merchant.home2.skin.model.ResourceModel;
import com.kuaishou.merchant.home2.skin.f;
import java.lang.System;
import cx3.d;
import cx3.c;
import java.util.List;
import java.lang.reflect.Type;
import yz7.e;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.merchant.home2.skin.a;
import d04.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;

public class b extends PresenterV2	// class@001823
{
    public d p;
    public f q;
    public SkinDownloader r;

    public void b(){
       super();
    }
    public static void P8(b p0,HomePage p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, b.class, "4")) {
       }else if(p1.mIsLocalCache != null){
          p0.R8();
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       this.p.F0(this.getActivity(), new a(this));
       this.p.v0().observe(this.getActivity(), new b(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.p.P0(new a(this));
       b tr = this.r;
       if (tr != null) {
          tr.a();
       }
       return;
    }
    public final void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new ResourceModel("atmosphere"));
       b tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, f.class, "7")) {
          tq.e = System.currentTimeMillis();
          tq.f = 0;
          tq.g = 0;
       }
       this.X7(c.c().f("BUYER_HOME_PAGE", e.d(uArrayList, objArray)).map(new e()).subscribe(new a(this), new c(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = d.J0(this.getActivity());
       this.q = f.p0(this.getActivity());
       return;
    }
}
