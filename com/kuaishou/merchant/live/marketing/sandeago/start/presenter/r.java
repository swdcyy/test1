package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$a;
import p64.c;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.r$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q64.c0;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import q64.e0;
import java.util.Map;
import java.util.HashMap;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;
import io.reactivex.subjects.PublishSubject;

public class r extends PresenterV2 implements g	// class@001a8d
{
    public SandeagoPublish p;
    public LiveAnchorStartSandeagoFragment q;
    public PublishSubject r;
    public r$b s;
    public final c t;

    public void r(){
       super();
       this.s = new r$a(this);
       this.t = new c(this.s);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.X7(this.r.subscribe(new c0(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, r.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       RecyclerView recyclerView = m1.f(p0, R.id.start_sandeago_property_list);
       recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
       recyclerView.setAdapter(this.t);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r.class, new e0());
       }else {
          obj.put(r.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.r8("SANDEABIZ_PUBLISH");
       this.q = this.r8("SANDEABIZ_START_FRAGMENT");
       this.r = this.r8("SANDEAGO_PROP_CHANGED_SUBJECT");
       return;
    }
}
