package og.q0;
import erd.a;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import f55.g;
import java.lang.Object;
import og.s0;
import java.util.Objects;
import lnc.y6;
import b26.b;
import java.lang.Class;
import lnc.x6;
import java.lang.String;
import lnc.a1;
import android.os.Bundle;
import java.util.List;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.a;
import kotlin.jvm.internal.a;
import og.c;
import w69.b$a;
import w69.b;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams$AlbumLimitParams;
import nsd.r0;
import android.app.Application;
import o56.a;
import java.lang.Integer;
import java.util.Arrays;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k$a;
import w69.k;
import ga9.c;
import java.util.HashMap;
import java.util.ArrayList;
import nsd.u;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import com.feature.post.bridge.view.PayClassAlbumCustomVB;
import w69.i$a;
import w69.i;
import x79.e;
import n3d.a$a;
import n3d.a;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import t45.d;
import brd.z;
import og.o0;
import og.p0;
import erd.g;
import crd.b;

public final class q0 implements a	// class@0027bc
{
    public final Activity b;
    public final JsSelectMixMediasParams c;
    public final g d;

    public void q0(Activity p0,JsSelectMixMediasParams p1,g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       s0 a = s0.a;
       q0 tb = this.b;
       q0 tc = this.c;
       q0 td = this.d;
       Objects.requireNonNull(a);
       b uob = y6.r(b.class);
       if (uob == null) {
          td.a(412, a1.p(R.string.arg_RES_7f1042c6), null);
       }else if(tc.mSourceTypes.contains("album")){
          Objects.requireNonNull(tb, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          Objects.requireNonNull(a.d);
          a.p(uob, "compressPlugin");
          a.p(tb, "activity");
          a.p(tc, "params");
          a.p(td, "callback");
          JsSelectMixMediasParams mAlbumLimitP = tc.mAlbumLimitParams;
          a.o(mAlbumLimitP, "params.mAlbumLimitParams");
          b$a uoa = new b$a();
          uoa.c(true);
          f$a uoa1 = new f$a();
          uoa1.g(a.a);
          uoa1.c(2);
          AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
          uBuilder.g(mAlbumLimitP.count);
          String str = a.b().getString(R.string.arg_RES_7f1008fc);
          a.o(str, "AppEnv.getAppContext\(\).g¡­ing.course_max_count_des\)");
          Object[] objArray = new Object[true];
          objArray[0] = Integer.valueOf(mAlbumLimitP.count);
          str = String.format(str, Arrays.copyOf(objArray, true));
          a.o(str, "java.lang.String.format\(format, *args\)");
          uBuilder.h(str);
          uBuilder.k((int)mAlbumLimitP.mMinDuration);
          uBuilder.i(mAlbumLimitP.mTotalDuration);
          str = a1.r(R.string.arg_RES_7f101626, a.a(mAlbumLimitP.mTotalDuration));
          a.o(str, "CommonUtil.string\(R.stri¡­g\(params.mTotalDuration\)\)");
          uBuilder = uBuilder.j(str);
          String str1 = a1.r(R.string.arg_RES_7f101628, a.a(mAlbumLimitP.mMinDuration));
          a.o(str1, "CommonUtil.string\(R.stri¡­s.mMinDuration\)\n        \)");
          k$a uoa2 = new k$a();
          uoa2.m(true);
          uoa2.f(mAlbumLimitP.mRightButton);
          uoa2.g(true);
          uoa2.p(0);
          uoa2.n(0);
          k ok = uoa2.b();
          c uoc = new c(null, null, false, 7, null);
          e.f().i(tb, new i$a().a(uoa.a()).d(uoa1.a()).n(td.e(AbsAlbumFragmentViewBinder.class, PayClassAlbumCustomVB.class)).f(uBuilder.l(str1).d()).m(ok).b(), 3, new c(td, uob, tb, tc));
       }else if(tc.mSourceTypes.contains("camera")){
          y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).G(d.a).R(new o0(tb, uob, tc, td), new p0(td));
       }
       return;
    }
}
