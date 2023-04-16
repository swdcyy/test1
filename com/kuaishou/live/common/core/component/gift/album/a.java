package com.kuaishou.live.common.core.component.gift.album.a;
import android.view.ViewGroup;
import android.content.Context;
import com.kuaishou.live.common.core.component.gift.album.c$c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.gift.album.c;
import java.util.Objects;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.util.List;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.album.a$a;
import com.kuaishou.live.common.core.component.gift.album.LiveScrollCenterLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$l;
import wg1.a;
import java.lang.Runnable;
import java.util.Set;

public class a	// class@00113b
{
    public final ViewGroup a;
    public final RecyclerView b;
    public final Context c;
    public c d;
    public final c$c e;
    public LiveScrollCenterLayoutManager f;

    public void a(ViewGroup p0,Context p1,c$c p2,RecyclerView p3){
       super();
       this.a = p0;
       this.c = p1;
       this.e = p2;
       this.b = p3;
    }
    public int a(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj == null) {
          return -1;
       }
       return obj.i;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.a.setVisibility(8);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          Objects.requireNonNull(td);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          View view = tf.findViewByPosition(this.a());
          if (view == null) {
             return;
          }else {
             view = view.findViewById(R.id.live_gift_album_navigation_item_select_icon);
             if (view != null) {
                view.setVisibility(8);
             }
          }
       }
       return;
    }
    public void e(GiftPanelItem p0,List p1,int p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       int i = 0;
       this.a.setVisibility(i);
       if (this.d == null) {
          this.d = new c(new a$a(this));
          LiveScrollCenterLayoutManager liveScrollCe = new LiveScrollCenterLayoutManager(this.c, i, i);
          this.f = liveScrollCe;
          this.b.setLayoutManager(liveScrollCe);
          this.b.addItemDecoration(new b(i, a1.d(R.dimen.arg_RES_7f070253), a1.d(R.dimen.arg_RES_7f07033f)));
          this.b.setAdapter(this.d);
          if (this.b.getItemAnimator() != null) {
             this.b.getItemAnimator().x(0);
          }
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, uoa, "2")) {
          this.b.post(new a(this, p2));
       }
       uoa = this.d;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p2), p1, uoa, c.class, "4")) {
          uoa.j = p0;
          uoa.e = p1;
          uoa.f.clear();
          uoa.h = (uoa.J0(p2))? p2: -1;
          uoa.k0();
       }
       return;
    }
}
