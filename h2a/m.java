package h2a.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;
import android.widget.TextView;
import h2a.m$a;
import io.reactivex.subjects.PublishSubject;
import b2a.e;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.detail.network.feedback.log.a;
import f2a.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableList;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import f2a.b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.View;
import ekd.m1;

public class m extends PresenterV2	// class@002550
{
    public TextView p;
    public RecyclerView q;
    public PublishSubject r;
    public List s;
    public m$a t;
    public int u;
    public static final int v;
    public static final int w;

    static {
       m.v = a1.e(16.00f);
       m.w = a1.e(12.00f);
    }
    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.p.getPaint().setFakeBoldText(true);
       this.t = new m$a(this, this.r);
       c uoc = PatchProxy.apply(null, null, e.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else if(e.b != null){
          a.a("reasons manager use NetworkFeedbackReasons");
          uoc = e.b.mReasons;
       }else {
          String str = a.t().c("networkDetectReason", null);
          if (TextUtils.x(str)) {
             a.a("reasons manager use default reasons");
             uoc = e.a.asList();
          }else {
             a.a("reasons manager config:"+str);
             uoc = a.a.h(str, c.class);
             if (uoc != null && !q.f(uoc.mReasons)) {
                e.b = uoc;
                uoc = uoc.mReasons;
             }else {
                uoc = e.a.asList();
             }
          }
       }
       this.s = uoc;
       Iterator iterator = uoc.iterator();
       while (iterator.hasNext()) {
          iterator.next().a = false;
       }
       this.t.W0(this.s);
       this.q.setAdapter(this.t);
       this.q.setLayoutManager(new GridLayoutManager(this.getContext(), 3, true, false));
       this.q.setItemAnimator(null);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.u = ((n.k(this.getActivity()) - (m.v * 3)) - (m.w * 2)) / 3;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a34da);
       this.p = m1.f(p0, 0x7f0a3f2c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.r = this.r8("REASON_SELECT_STATUS_CHANGE_OBSERVER");
       return;
    }
}
