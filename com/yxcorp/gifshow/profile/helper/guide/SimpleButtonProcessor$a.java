package com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.helper.guide.SimpleButtonProcessor;
import fx5.i;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import m3c.a;
import k2b.e0;
import java.util.Map;
import z5c.y1;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;

public final class SimpleButtonProcessor$a extends m	// class@001340
{
    public final SimpleButtonProcessor c;
    public final i d;
    public final ProfilePostEmptyGuide e;

    public void SimpleButtonProcessor$a(SimpleButtonProcessor p0,i p1,ProfilePostEmptyGuide p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SimpleButtonProcessor$a.class, "1")) {
          return;
       }
       a.p(p0, "v");
       y1.Y(this.c.b, 1, 0, this.e.b);
       a b = this.c.b;
       a.o(b, "mBaseFragment");
       FragmentActivity activity = b.getActivity();
       if (activity != null) {
          Intent intent = b.a(0x66dce92a).a(activity, x0.f(this.d.mButtonLinkUri));
          if (intent != null) {
             activity.startActivity(intent);
          }
       }
       PatchProxy.onMethodExit(SimpleButtonProcessor$a.class, "1");
       return;
    }
}
