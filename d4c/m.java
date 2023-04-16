package d4c.m;
import android.view.View$OnClickListener;
import d4c.v;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import ekd.p0;
import e17.i;
import kob.r;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import ekd.j0;
import a46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import d4c.e;
import d4c.j;
import erd.g;
import crd.b;

public final class m implements View$OnClickListener	// class@0020d6
{
    public final v b;

    public void m(v p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, v.class, "15")) {
       }else if(!p0.C(p0.getContext())){
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }else {
          tb.D.pause();
          Activity activity = tb.getActivity();
          Intent intent = activity.getIntent();
          String str = j0.f(intent, "deliver_video_project");
          String str1 = j0.f(intent, "background");
          boolean b = j0.a(intent, "originPathAndRanges", false);
          e uoe = new e(tb, activity, b, str1, str);
          tb.X7(y6.s(b.class, LoadPolicy.DIALOG).R(v7, j.b));
       }
       return;
    }
}
