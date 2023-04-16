package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.e$a;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.Runnable;
import ekd.k1;
import crd.b;
import lnc.b9;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import z5c.o2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.model.ProfileDialogInfo;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wxa.a;
import android.net.Uri$Builder;
import android.net.Uri;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import w2c.a;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.c;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;

public class e extends PresenterV2	// class@00157c
{
    public BaseFragment p;
    public User q;
    public RxPageBus r;
    public List s;
    public UserProfileResponse t;
    public ProfileDialogInfo u;
    public b v;
    public Runnable w;
    public final b x;
    public final a y;

    public void e(){
       super();
       this.x = new e$a(this);
       this.y = d.b;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.s.add(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       e tw = this.w;
       if (tw != null) {
          k1.m(tw);
       }
       b9.a(this.v);
       a.b().c("KRNSocialProfileRefreshEvent", this.y);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (o2.c(this.p)) {
          return this.p.K0();
       }
       return true;
    }
    public final void R8(ProfileDialogInfo p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       try{
          if (p0 != null && p0.mDialogStyle == 6) {
             JSONArray jSONArray = new JSONObject(p0.mExtParams).getJSONArray("userEmptyStateList");
             if (!jSONArray.length()) {
                return;
             }else {
                String str = jSONArray.getString(0);
                JSONObject jSONObject = new JSONObject();
                jSONObject.accumulate("list", jSONArray);
                jSONObject.accumulate("current", str);
                if (TextUtils.n(str, "HEAD")) {
                   str1 = "314";
                }else if(TextUtils.n(str, "USER_TEXT")){
                   str1 = "288";
                }else {
                   str1 = "227";
                }
                Uri$Builder uBuilder = a.a.buildUpon().appendQueryParameter("dialog", jSONObject.toString());
                uBuilder.appendQueryParameter("height", str1);
                a.b().a("KRNSocialProfileRefreshEvent", this.y);
                a.b(b.j(this.getContext(), uBuilder.build().toString()), null);
             }
          }
          return;
       }catch(org.json.JSONException e0){
       }
    }
    public void S8(ProfileDialogInfo p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "4")) {
          return;
       }
       c uoc = new c(this, p0, p1);
       this.w = uoc;
       k1.o(uoc);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("PROFILE_FRAGMENT");
       this.q = this.q8(User.class);
       this.s = this.r8("PROFILE_DIALOG_INTERCEPTOR");
       this.r = this.r8("PROFILE_PAGE_RXBUS");
       return;
    }
}
