package com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment$b;
import kob.f;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.f;
import java.util.Objects;
import android.widget.TextView;
import lnc.a1;
import jqb.j;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.CharSequence;
import bpb.c;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import yob.a;

public class LocalMusicFragment$b extends f	// class@002025
{
    public final LocalMusicFragment l;

    public void LocalMusicFragment$b(LocalMusicFragment p0,RecyclerFragment p1){
       this.l = p0;
       super(p1);
    }
    public View J0(){
       LocalMusicFragment$b obj = PatchProxy.apply(null, this, LocalMusicFragment$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       View view = super.J0();
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(view, obj, LocalMusicFragment.class, "9") && view != null) {
          View view1 = view.findViewById(R.id.retry_btn);
          if (view1 != null && view1 instanceof TextView) {
             view1.setTextColor(a1.a(R.color.arg_RES_7f0600e0));
             view1.setBackgroundResource(R.drawable.arg_RES_7f080f33);
          }
       }
       return j.b(super.J0());
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, LocalMusicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.f(a1.p(R.string.arg_RES_7f10371a));
       obj.p(new c(this));
       obj.k(R.drawable.arg_RES_7f0805f2);
       obj.i(a1.p(R.string.arg_RES_7f10371b));
       return obj;
    }
    public void d(boolean p0){
       LocalMusicFragment$b uob = LocalMusicFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       super.d(p0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragment$b.class, "3")) {
          return;
       }
       super.f();
       RxBus.f.b(new a(false));
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LocalMusicFragment$b.class, "2")) {
          return;
       }
       super.i();
       RxBus.f.b(new a(true));
       return;
    }
}
