package aec.j$c;
import erd.g;
import aec.j;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import sx5.i;
import com.kwai.feature.api.social.reminder.push.SocialPushKt;
import sx5.g;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import sx5.c;
import ekd.k1;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kwai.feature.api.social.reminder.push.SocialPushKt$updatePushPopAsShown$2;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import aec.k;
import xh7.b;
import android.content.Context;
import aec.l;
import qh7.b;
import qh7.a;

public final class j$c implements g	// class@000106
{
    public final j b;
    public final Ref$ObjectRef c;
    public final Ref$BooleanRef d;

    public void j$c(j p0,Ref$ObjectRef p1,Ref$BooleanRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
       }else {
          p0 = this.c.element;
          if (p0 != null) {
             p0.dispose();
          }
          p0.element = false;
          if (SocialPushKt.b(j.P8(this.b))) {
             p0 = this.b;
             if (p0.s == null) {
                p0.s = new g(j.R8(p0));
                p0 = this.b.s;
                if (p0 != null) {
                   p0 = p0.a();
                   if (p0 != null) {
                      this.b.X7(p0);
                   }
                }
             }
             p0 = j.P8(this.b);
             k obj = null;
             String str = "4";
             if (!PatchProxy.applyVoidOneRefs(p0, obj, SocialPushKt.class, str)) {
                a.p(p0, "data");
                i c = p0.c;
                c.a = c.a + 1;
                c.b = k1.i();
                a.f(r1.b, z0.f(), null, new SocialPushKt$updatePushPopAsShown$2(p0, obj), 2, null);
             }
             p0 = this.b;
             FragmentActivity activity = j.R8(p0).getActivity();
             a.m(activity);
             a.o(activity, "tabHost.activity!!");
             obj = k.a;
             if (!PatchProxy.applyVoidTwoRefs(activity, obj, p0, j.class, str)) {
                a.b(new b(activity, "kwai://kds/react/bottom_sheet?bundleId=SocialPushGuideAlert&componentName=FriendsPushBottomAlert&height=1&bgColor=%2300FFFFFF&maskColor=%2300FFFFFF&maskOpacity=0&themeStyle=1&enableAnimation=0"), new l(obj));
             }
          }
       }
       return;
    }
}
