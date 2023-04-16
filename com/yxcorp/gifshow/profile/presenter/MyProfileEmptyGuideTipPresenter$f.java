package com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter$f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.MyProfileEmptyGuideTipPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z5c.l3;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import android.view.View;
import android.view.ViewParent;
import com.yxcorp.gifshow.profile.util.ProfilePostEmptyCardUtils;
import java.lang.StringBuilder;
import java.lang.ref.WeakReference;
import n3c.l;
import n3c.b;

public final class MyProfileEmptyGuideTipPresenter$f implements g	// class@00140c
{
    public final MyProfileEmptyGuideTipPresenter b;

    public void MyProfileEmptyGuideTipPresenter$f(MyProfileEmptyGuideTipPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MyProfileEmptyGuideTipPresenter$f.class, str)) {
       }else {
          MyProfileEmptyGuideTipPresenter$f uof = null;
          p0 = (p0 != null)? p0.get("MAIN_KEY"): uof;
          if (!p0 instanceof l3) {
             p0 = uof;
          }
          if (p0 != null) {
             MyProfileEmptyGuideTipPresenter$f uof1 = null;
             if (p0.a() == 2 && p0.d == null) {
                if (p0.b() != null) {
                   uof1 = (this.b.W8().getParent() != null)? this.b.k9(p0.b()): this.b.S8();
                }
             }else {
                uof1 = this.b.S8();
             }
             ProfilePostEmptyCardUtils.e.i("MyProfileEmptyGuideTipPresenter", "receive showUserInfoCardEventByPostCard, event: "+p0+", isShowSuccess: "+uof1);
             if (!uof1) {
                this.b.e9(p0);
             }else if(PatchProxy.applyVoid(uof, p0, l3.class, str)){
                p0 = p0.c;
                if (p0 != null) {
                   p0 = p0.get();
                   if (p0 != null) {
                      p0.B4(uof);
                   }
                }
             }
          }
       }
    label_0098 :
       return;
    }
}
