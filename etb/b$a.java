package etb.b$a;
import com.yxcorp.gifshow.widget.m;
import etb.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import htb.c;
import ctb.f;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import k2b.h;
import k2b.e0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import etb.a;
import com.yxcorp.gifshow.notice.box.detail.widget.a;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.notice.box.detail.widget.a$d;
import com.yxcorp.gifshow.notice.box.detail.widget.a$a;
import w07.l;
import com.kwai.library.widget.popup.bubble.a$c;
import z8c.a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k07.h;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.yxcorp.gifshow.notice.box.detail.widget.a$b;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.library.widget.popup.bubble.a;
import k07.l;
import org.json.JSONObject;
import org.json.JSONArray;
import htb.b;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import k2b.f3;

public class b$a extends m	// class@0027e8
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, b$a.class, "1")) {
          return;
       }
       try{
          b$a c = obj.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(obj1, c, b.class, "4")) {
             b q = c.q;
             f mTabId = c.p.mTabId;
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(q, Long.valueOf(mTabId), null, c.class, "8")) {
                i3 oi3 = i3.f();
                oi3.c("tab_id", Long.valueOf(mTabId));
                h oh = h.m(null, "NOTIFICATION_BOX_LIST_TAB");
                oh.n(oi3.e());
                oh.i(q);
             }
             f uof = null;
             if (c.t != null) {
                Activity activity = c.getActivity();
                f mTabMenus = c.p.mTabMenus;
                a uoa = new a(c);
                a uoa1 = uoa;
                a uoa2 = uoa;
                if (!PatchProxy.applyVoidFourRefs(activity, p0, mTabMenus, uoa1, null, a.class, "1")) {
                   a uoa3 = new a(activity);
                   uoa3.b0(new a$d(null));
                   int i = 1;
                   uoa3.c0(new a(i, uof, uof));
                   uoa3.o0(obj1);
                   uoa3.D0(BubbleInterface$Position.TOP);
                   uoa3.v0(uof);
                   uoa3.x0(new LinearLayoutManager(activity));
                   uoa3.y0(uoa2);
                   uoa3.A0(i);
                   uoa3.z(i);
                   uoa3.A(i);
                   uoa3.B(uof);
                   uoa3.D(PopupInterface$Excluded.NOT_AGAINST);
                   uoa3.m0(new a$b(mTabMenus, uoa3, null));
                   l.c(uoa3, R.layout.arg_RES_7f0d10af);
                }
                q = c.q;
                b p = c.p;
                uof = p.mTabId;
                mTabId = p.mTabMenus;
                if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(q, Long.valueOf(uof), mTabId, null, c.class, "9")) {
                   JSONObject jSONObject = new JSONObject();
                   jSONObject.put("tab_id", uof).put("menu_id_list", new JSONArray(q.g(mTabId, b.a)));
                   f3 uof3 = f3.l(null, "NOTIFICATION_BOX_LIST_TAB_MENU");
                   uof3.m(jSONObject.toString());
                   uof3.h(q);
                }
             }else if(c.p.mTabMenus != null){
                c.P8(uof);
             }
          }
       }catch(org.json.JSONException e0){
       }
       return;
    }
}
