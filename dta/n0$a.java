package dta.n0$a;
import com.google.android.material.tabs.BottomActionBarTabLayout$a;
import dta.n0;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import wq6.h;
import com.kwai.kcube.TabIdentifier;
import com.kwai.framework.model.user.QCurrentUser;
import on5.b;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Number;
import dta.n0$a$a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class n0$a implements BottomActionBarTabLayout$a	// class@002541
{
    public final n0 a;

    public void n0$a(n0 p0){
       this.a = p0;
       super();
    }
    public boolean a(TabLayout$f p0){
       n0$a a;
       boolean b;
       int i1;
       Object obj = this;
       Object obj1 = p0;
       n0 on0 = n0.class;
       TabIdentifier obj2 = PatchProxy.applyOneRefs(obj1, obj, n0$a.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2.booleanValue();
       }
       a.p(obj1, "tab");
       obj2 = p0.d();
       Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.kwai.kcube.ITab");
       a = obj.a;
       TabIdentifier tabIdentifie = obj2.M2();
       Objects.requireNonNull(a);
       GifshowActivity obj3 = PatchProxy.applyOneRefs(tabIdentifie, a, on0, "6");
       int i = 0;
       if (obj3 != PatchProxyResult.class) {
          b = obj3.booleanValue();
       }else {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          b = (!qCurrentUser.isLogined() && (!a.g(b.n, tabIdentifie) && (a.g(b.l, tabIdentifie) || a.g(b.h, tabIdentifie))))? true: false;
       }
       if (b) {
          b uob = d.a(-1712118428);
          Activity activity = obj.a.getActivity();
          obj3 = obj.a.getActivity();
          a.m(obj3);
          String url = obj3.getUrl();
          a = obj.a;
          tabIdentifie = obj2.M2();
          Objects.requireNonNull(a);
          String str = PatchProxy.applyOneRefs(tabIdentifie, a, on0, "5");
          if (str != PatchProxyResult.class) {
          }else if(a.g(b.n, tabIdentifie)){
             str = "NasaMessage";
          }else if(a.g(b.l, tabIdentifie)){
             str = "NasaProfile";
          }else {
             str = "";
          }
          Object obj4 = str;
          a = obj.a;
          obj2 = obj2.M2();
          Objects.requireNonNull(a);
          Object obj5 = PatchProxy.applyOneRefs(obj2, a, on0, "4");
          if (obj5 != PatchProxyResult.class) {
             i1 = obj5.intValue();
          }else if(a.g(b.n, obj2)){
             i1 = 80;
          }else if(a.g(b.l, obj2)){
             i1 = 81;
          }else {
             i1 = 0;
          }
          uob.ne(activity, url, obj4, i1, "", null, null, null, new n0$a$a(obj1)).h();
          return true;
       }else {
          return i;
       }
    }
}
