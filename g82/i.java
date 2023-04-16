package g82.i;
import erd.g;
import g82.v;
import java.lang.Object;
import i95.b;
import java.util.Objects;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import ad5.a;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Boolean;
import l95.a;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.utils.e;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import kg1.i;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class i implements g	// class@002aa3
{
    public final v b;

    public void i(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (TextUtils.n(p0.a(), tb.Y8())) {
          b.a(0x4c90014d).f();
          LiveFansGroupIntimacyInfo liveFansGrou = p0.b();
          tb.e9(liveFansGrou);
          a obj = PatchProxy.apply(null, p0, b.class, "1");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             b f = p0.f;
             i = (f != null)? f.intValue(): 0;
          }
          tb.d9(i);
          tb.E9(p0.c());
          obj = new a();
          if (liveFansGrou != null) {
             obj.d(liveFansGrou.mStatus);
             obj.b(liveFansGrou.mLevel);
          }
          int i1 = 11;
          try{
             tb.a9(i1, obj);
             i.b(tb.p.R().t0(), tb.p.Z2.a(), 7, 0, "FANS_GROUP_PANEL", tb.p.Z2.d(), e.r(tb.getActivity()), a.a.x(p0.d), tb.p.c0());
          }catch(java.lang.Exception e13){
             ExceptionHandler.handleCaughtException(e13);
          }
       }
    }
}
