package com.yxcorp.gifshow.fragment.ObservableBox;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.fragment.ObservableBox$b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.ObservableBox$d;
import com.yxcorp.gifshow.fragment.ObservableBox$a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import gka.k;
import android.content.DialogInterface$OnCancelListener;
import nz6.b;
import gka.m;
import erd.g;
import gka.n;
import com.yxcorp.gifshow.fragment.c;
import gka.l;
import erd.a;

public final class ObservableBox	// class@001269
{

    public void ObservableBox(){
       super();
    }
    public static t a(t p0){
       Activity obj = PatchProxy.applyOneRefs(p0, null, ObservableBox.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ActivityContext.g().e();
       if (obj == null || (!obj.isFinishing() && obj instanceof GifshowActivity)) {
          p0 = ObservableBox.b(p0, new ObservableBox$b(obj));
       }
    label_0030 :
       return p0;
    }
    public static t b(t p0,ObservableBox$b p1){
       ProgressFragment obj = null;
       ObservableBox$b obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ObservableBox.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = p1.a;
       if (obj1 != null && !obj1.isFinishing()) {
          ObservableBox$d uod = new ObservableBox$d(obj);
          obj = new ProgressFragment();
          obj.Eh(0, p1.c);
          obj.Ih(p1.d);
          obj.setCancelable(p1.b);
          obj.oh(new k(uod));
          b.a(p1.a, obj);
          p0 = p0.doOnNext(new m(uod)).doOnNext(new n(obj)).doOnError(c.b).doFinally(new l(obj));
       }
       return p0;
    }
}
