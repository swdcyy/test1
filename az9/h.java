package az9.h;
import erd.g;
import az9.i0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jga.f$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import android.content.Intent;
import android.app.Activity;
import jga.f;
import brd.t;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import k2b.e0;
import fz9.a;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;
import wkd.b;
import l66.a;
import wca.s;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;

public final class h implements g	// class@000329
{
    public final i0 b;

    public void h(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, i0.class, "18")) {
       }else {
          tb.o0();
          p0 = new f$a(tb.u.getUser(), tb.v.Q2());
          p0.c(tb.u.getFullSource());
          p0.o(tb.v.getUrl()+"#unfollow");
          p0.g(tb.v.getIntent().getStringExtra("arg_photo_exp_tag"));
          p0.f(tb.u.getExpTag());
          FollowHelper.k(p0.b()).subscribe(Functions.d(), Functions.d());
          if (FollowConfigUtil.i()) {
             a.a("UN_FOLLOW_BUTTON", "COVER", tb.u, tb.x, 12);
          }
          f.m(tb.u.getUser(), User$FollowStatus.UNFOLLOW);
          b.a(0x6d2a4fdd).b(new s(tb.u.getUser(), tb.u.mEntity));
       }
       return;
    }
}
