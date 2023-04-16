package com.yxcorp.gifshow.moment_downloader.lazyfragment.b;
import erd.g;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.ReminderMomentContainerFragment;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.ReminderKrnMomentFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import android.os.Bundle;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import com.yxcorp.gifshow.moment_downloader.startup.MomentConfig;
import java.lang.reflect.Type;
import eob.a;
import wh5.c;
import tkd.b;
import tkd.d;
import gx5.e;
import com.yxcorp.gifshow.moment_downloader.lazyfragment.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.moment_downloader.model.MomentPublishPageConfig;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.kwai.sdk.switchconfig.a;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import fob.a;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class b implements g	// class@001fc3
{
    public final ReminderMomentContainerFragment b;

    public void b(ReminderMomentContainerFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p0 = PatchProxyResult.class;
       Object[] objArray = null;
       ReminderKrnMomentFragment reminderKrnM = PatchProxy.apply(objArray, objArray, ReminderKrnMomentFragment.class, "1");
       if (reminderKrnM != p0) {
       }else {
          reminderKrnM = new ReminderKrnMomentFragment();
          boolean b = true;
          reminderKrnM.mg(b);
          Bundle uBundle = new Bundle();
          LaunchModel launchModel = PatchProxy.apply(objArray, objArray, ReminderKrnMomentFragment.class, "2");
          if (launchModel != p0) {
          }else {
             p0 = new LaunchModel$b();
             MomentConfig momentConfig = a.a(MomentConfig.class);
             p0.i("SocialMomentList");
             p0.j("MomentListPage");
             p0.b("pageStyle", b);
             p0.f("disableCommentFunctionByChildLock", (c.c() ^ b));
             p0.c("moodValidDuration", d.a(0xcb98120).xn());
             p0.f("disableSetVisibility", Suppliers.a(a.b).get().mDisableSetVisibility);
             p0.b("tabBarHeight", 49);
             p0.b("minBundleVersion", b);
             if (momentConfig != null) {
                objArray = a.a.x(momentConfig.mPublishConfig).r().toString();
             }
             p0.e("momentPublishConfig", objArray);
             if (!a.t().a("momentFeedTabRedDotValue", 0)) {
                b = false;
             }
             p0.f("momentFeedTabRedDotEnabled", b);
             p0.e("containerSource", "ReminderMomentRnFragment");
             p0.f("enableBackBtnHandler", 0);
             launchModel = p0.h();
          }
          uBundle.putParcelable("rn_launch_model", launchModel);
          reminderKrnM.setArguments(uBundle);
       }
       tb.t = reminderKrnM;
       tb.s = "MESSAGE_MOMENT_TAB_FRAGMENT";
       p0 = tb.getChildFragmentManager().beginTransaction();
       p0.w(R.id.root_view, tb.t, tb.s);
       p0.m();
       a uoa = new a(tb);
       tb.Vg().i().compose(c.c(tb.m(), FragmentEvent.DESTROY_VIEW)).subscribe(uoa, Functions.d());
       return;
    }
}
