package cha.a;
import vga.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xl8.b;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vga.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import android.app.Activity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;

public final class a implements b	// class@000502
{
    public final b a;
    public BaseFragment b;
    public GifshowActivity c;
    public final b d;
    public final b e;

    public void a(GifshowActivity p0){
       super();
       this.c = p0;
       Integer integer = Integer.valueOf(1);
       this.a = new b(integer);
       this.d = new b(integer);
       this.e = new b(Boolean.FALSE);
    }
    public void a(BaseFragment p0){
       super();
       this.b = p0;
       Integer integer = Integer.valueOf(1);
       this.a = new b(integer);
       this.d = new b(integer);
       this.e = new b(Boolean.FALSE);
    }
    public void a(){
       a.a(this);
    }
    public final boolean b(){
       Integer obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.a();
       boolean b = true;
       if (obj == null || obj.intValue() != b) {
          b = false;
       }
       return b;
    }
    public final t c(){
       t obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.observable();
       a.o(obj, "mFollowViewPagerState.observable\(\)");
       a tc = this.c;
       a tb = this.b;
       if (tb != null && (!tb.isDetached() && tb.getActivity() != null)) {
          obj = obj.compose(tb.Ug(FragmentEvent.DESTROY));
          a.o(obj, "observable.compose\(fragm¡­t\(FragmentEvent.DESTROY\)\)");
       }else if(tc != null && (!tc.isDestroyed() && !tc.isFinishing())){
          obj = obj.compose(tc.E2(ActivityEvent.DESTROY));
          a.o(obj, "observable.compose\(activ¡­  ActivityEvent.DESTROY\)\)");
       }else {
          obj = t.empty();
          a.o(obj, "Observable.empty\(\)");
       }
       return obj;
    }
    public final void d(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.a.d(Integer.valueOf(p0));
       return;
    }
}
