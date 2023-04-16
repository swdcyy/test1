package com.kuaishou.live.core.voiceparty.channel.feed.a$a;
import qvb.q;
import com.kuaishou.live.core.voiceparty.channel.feed.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import qvb.p;
import qvb.a;
import qvb.n0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.Integer;
import lo2.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lb2.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import rb2.g;
import e12.c;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;

public class a$a implements q	// class@001376
{
    public final int b;
    public final a c;

    public void a$a(a p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a$a.class, "2")) {
          return;
       }
       x.E(this.c.v);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       d a;
       a x;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.c.w.f(this);
       x.E(this.c.v);
       if (!this.c.w.isEmpty()) {
          a$a tc = this.c;
          a$a tb = this.b;
          int i = 0;
          Object obj = tc.w.getItem(i);
          Objects.requireNonNull(tc);
          a uoa1 = a.class;
          if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tb), obj, tc, uoa1, "3")) {
             a = tc.x.a;
             if (a != null) {
                a.d(obj.mEntity, tb, i);
                if (e.s(tc.getActivity())) {
                   if (!PatchProxy.applyVoidOneRefs(obj, tc, uoa1, "4")) {
                      tc.y.s();
                      x = tc.x;
                      tc.y.a(x.c, tc.w, obj, false, x.b);
                   }
                }else if(!tc.getActivity() instanceof LivePlayActivity || (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(tb), obj, tc, uoa1, "5"))){
                   e.v(tc.getActivity(), obj.mEntity, tb);
                }
             }
          }
       }
       return;
    }
}
