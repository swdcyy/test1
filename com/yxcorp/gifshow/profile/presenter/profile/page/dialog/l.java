package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.l;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.o;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b5c.j;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import zsd.u;
import org.json.JSONObject;
import java.lang.Exception;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.user.User;
import brd.t;
import android.text.TextUtils;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.k;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import c5c.q;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.m;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.feed.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.n;
import erd.h;
import c5c.s;
import erd.o;
import c5c.r;

public final class l implements g	// class@001584
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t ot;
       p0 = this.b;
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, o.class, "4")) {
       }else if(p0.q == 6){
          o r = p0.r;
          ProfileParam obj = PatchProxy.applyOneRefs(r, objArray, j.class, "1");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             a.p(r, "param");
             Log.g("UnionPicFeedUtil", r.mAdExtra);
             obj = r.mAdExtra;
             o oo = (obj == null || u.S1(obj))? 1: null;
             if (!oo) {
                try{
                   objArray = j.b(new JSONObject(r.mAdExtra));
                }catch(java.lang.Exception e0){
                   Log.d("UnionPicFeedUtil", e0.getMessage());
                }
             }
          }
       }
       return;
    }
}
