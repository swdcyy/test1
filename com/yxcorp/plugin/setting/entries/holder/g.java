package com.yxcorp.plugin.setting.entries.holder.g;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.e0;
import sgd.b;
import wgc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.social.startup.relation.model.SocialRelationConfig;
import java.lang.reflect.Type;
import mw4.a;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import wgc.a;
import wgc.d;
import oe6.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.g$a;
import android.view.View;

public class g implements c	// class@00085a
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public TextView e;

    public void g(GifshowActivity p0){
       g ta;
       super();
       this.a = p0;
       this.b = new b();
       String str = "open";
       if (this.b()) {
          this.b.c = p0.getString(0x7f1049a7);
          ta = this.a;
          if (!QCurrentUser.ME.isRecommendToOthers()) {
             str = "close";
          }
          b.i(ta, "RECOMMENT_TO_PYMK", str);
       }else {
          this.b.c = p0.getString(0x7f1041a3);
          ta = this.a;
          if (QCurrentUser.ME.isNotRecommendToContacts()) {
             str = "close";
          }
          b.i(ta, "RECOMMENT_TO_CONTACT_FRIEND", str);
       }
       ta.b = 0x7f082293;
       return;
    }
    public void a(){
       b.a(this);
    }
    public boolean b(){
       SocialRelationConfig obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.x(SocialRelationConfig.class);
       boolean b = false;
       if (obj != null && (obj.getEnableRecommendedKnowPeople() && !HoldoutConfigUtilKt.a())) {
          b = true;
       }
    label_002a :
       return b;
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.b() || b.a.getBoolean(b.d("user")+"not_recommend_to_contacts_option", b)) {
          b = true;
       }
       return b;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new g$a(this));
       }
       return this.c;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d11ae;
    }
}
