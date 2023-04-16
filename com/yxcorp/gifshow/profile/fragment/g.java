package com.yxcorp.gifshow.profile.fragment.g;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.fragment.MyProfilePhotoFragment;
import fx5.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5c.y1;
import java.lang.Integer;
import k2b.h;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import k3c.f1;
import com.yxcorp.gifshow.profile.fragment.f;
import erd.g;
import crd.b;

public class g extends m	// class@001324
{
    public final h c;
    public final MyProfilePhotoFragment d;

    public void g(MyProfilePhotoFragment p0,h p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       h a = this.c.a;
       int i = 2;
       y1 oy1 = y1.class;
       if (!PatchProxy.isSupport(oy1) || !PatchProxy.applyVoidTwoRefs(a, Integer.valueOf(i), null, oy1, "132")) {
          h oh = h.k("PUBLISH_PHOTO_BUTTON");
          i3 oi3 = i3.f();
          oi3.c("loc", Integer.valueOf(i));
          oh.n(oi3.e());
          oh.i(a);
       }
       a.Y0 = y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).R(new f1(this), f.b);
       return;
    }
}
