package com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$f;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import java.io.File;
import gx5.h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import brd.t;
import com.yxcorp.gifshow.profile.util.f;
import com.yxcorp.gifshow.profile.model.UserInfoResponse;
import java.lang.CharSequence;
import e17.i;
import e17.i$b;
import a2c.i;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.Integer;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.profile.kslog.KsLogError;
import java.lang.Enum;
import java.util.Map;
import com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import com.yxcorp.gifshow.profile.kslog.KsLogStatus;
import z5c.x2;
import java.util.Objects;
import a2c.h;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import java.lang.StringBuilder;
import v2c.g;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$d;

public final class ProfileBackgroundPublishManager$f extends d	// class@001232
{
    public final h A;
    public final GifshowActivity B;
    public final ProfileBackgroundPublishManager y;
    public final File z;

    public void ProfileBackgroundPublishManager$f(ProfileBackgroundPublishManager p0,File p1,h p2,GifshowActivity p3,FragmentActivity p4){
       this.y = p0;
       this.z = p1;
       this.A = p2;
       this.B = p3;
       super(p4);
    }
    public Object b(Object[] p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, ProfileBackgroundPublishManager$f.class, "2");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "params");
          UserInfoResponse userInfoResp = f.a(this.z).blockingFirst();
          UserInfoResponse mSuccessMess = userInfoResp.mSuccessMessage;
          i oi = (mSuccessMess == null || !mSuccessMess.length())? 1: null;
          if (!oi) {
             i.d(R.style.arg_RES_7f11066a, userInfoResp.mSuccessMessage);
          }else {
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f100354);
             uob.o(0);
             i.z(uob);
          }
          ProfileBackgroundPublishManager$f tA = this.A;
          if (tA != null) {
             k1.o(new i(tA));
          }
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
    public void j(Object p0){
       boolean b = p0.booleanValue();
       if (!PatchProxy.isSupport(ProfileBackgroundPublishManager$f.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, ProfileBackgroundPublishManager$f.class, "3")) {
          super.j(Boolean.valueOf(b));
          if (b) {
             x2.a(KsLogInfoProductionTag.BG_IMAGE_PUBLISH, KsLogStatus.SUCCESS);
             b = this.y;
             ProfileBackgroundPublishManager$f tz = this.z;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(tz, b, ProfileBackgroundPublishManager.class, "9")) {
                g.e(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundVideoPublishManager"), "image modify success "+tz.getAbsolutePath());
                b.s();
                b.t();
                b = b.g().iterator();
                while (b.hasNext()) {
                   b.next().b(tz);
                }
             }
          }else {
             this.y.r();
             this.y.l();
          }
          b = this.A;
          if (b != null) {
             b.b();
          }
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, ProfileBackgroundPublishManager$f.class, "1")) {
          return;
       }
       x2.a(KsLogInfoProductionTag.BG_IMAGE_PUBLISH, KsLogStatus.START);
       return;
    }
}
