package com.yxcorp.gifshow.homebottom.presenter.a;
import com.google.android.material.tabs.KCubeTabLayout$f;
import com.yxcorp.gifshow.homebottom.presenter.b;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
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
import fsa.e;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class a implements KCubeTabLayout$f	// class@001691
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final boolean a(TabLayout$f p0){
       boolean b;
       boolean b1;
       int i;
       String str1;
       Object obj = p0;
       a a = this.a;
       Objects.requireNonNull(a);
       h obj1 = PatchProxy.applyOneRefs(obj, a, b.class, "5");
       b = true;
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          obj1 = p0.d();
          TabIdentifier tabIdentifie = obj1.M2();
          b obj2 = PatchProxy.applyOneRefs(tabIdentifie, a, b.class, "8");
          if (obj2 != PatchProxyResult.class) {
             b1 = obj2.booleanValue();
          }else if(!QCurrentUser.me().isLogined() && (!b.n.equals(tabIdentifie) && (b.l.equals(tabIdentifie) || b.h.equals(tabIdentifie)))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
             obj2 = d.a(-1712118428);
             Activity activity = a.getActivity();
             String url = a.getActivity().getUrl();
             tabIdentifie = obj1.M2();
             String str = PatchProxy.applyOneRefs(tabIdentifie, a, b.class, "7");
             if (str != PatchProxyResult.class) {
             }else if(b.n.equals(tabIdentifie)){
                str1 = "NasaMessage";
             }else if(b.l.equals(tabIdentifie)){
                str1 = "NasaProfile";
             }else {
                str1 = "";
             }
             str = str1;
             TabIdentifier tabIdentifie1 = obj1.M2();
             Object obj3 = PatchProxy.applyOneRefs(tabIdentifie1, a, b.class, "6");
             if (obj3 != PatchProxyResult.class) {
                i = obj3.intValue();
             }else if(b.n.equals(tabIdentifie1)){
                i = 80;
             }else if(b.l.equals(tabIdentifie1)){
                i = 81;
             }else {
                i = 0;
             }
             obj2.ne(activity, url, str, i, "", null, null, null, new e(obj)).h();
          }else {
             b = false;
          }
       }
       return b;
    }
}
