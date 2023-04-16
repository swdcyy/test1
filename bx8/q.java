package bx8.q;
import erd.g;
import bx8.p;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.PostStartUpResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq.i;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$PostStartUpData;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$ShopPromotionInfo;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import com.yxcorp.gifshow.util.PostUtils;
import oe6.g;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify;
import rq.a;
import mrd.a;

public final class q implements g	// class@000487
{
    public final p b;

    public void q(p p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Boolean uBoolean2;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
       }else if(i.h()){
          i.m().Q("SHOOT_STARTUP_REQUESTED", Boolean.TRUE);
       }
       boolean b = false;
       this.b.b = b;
       PostStartUpResponse$PostStartUpData postStartUpD = p0.a();
       UploadPostForbidNotify uploadPostFo = null;
       Boolean uBoolean = (postStartUpD != null)? postStartUpD.f(): uploadPostFo;
       PostStartUpResponse$PostStartUpData postStartUpD1 = p0.a();
       Boolean uBoolean1 = (postStartUpD1 != null)? postStartUpD1.a(): uploadPostFo;
       PostStartUpResponse$PostStartUpData postStartUpD2 = p0.a();
       if (postStartUpD2 != null) {
          PostStartUpResponse$ShopPromotionInfo shopPromotio = postStartUpD2.d();
          if (shopPromotio != null) {
             uBoolean2 = Boolean.valueOf(shopPromotio.b());
          label_0053 :
             PostStartUpResponse$PostStartUpData postStartUpD3 = p0.a();
             if (postStartUpD3 != null) {
                PostStartUpResponse$ShopPromotionInfo shopPromotio1 = postStartUpD3.d();
                if (shopPromotio1 != null) {
                   str = shopPromotio1.a();
                label_0065 :
                   Object[] objArray = new Object[b];
                   a.b().w("ShareStartUpRepo", "getStartUpResult success "+"showJudgeAssist="+uBoolean+','+"enableAutoOpenHdExport: "+uBoolean1+','+"showShopPromotion="+uBoolean2+','+"shopPromotionUrl="+str, objArray);
                   if (uBoolean != null) {
                      g.a(n.b().edit().putBoolean(PostUtils.s("show_judge_assist_switch"), uBoolean.booleanValue()));
                   }
                   SharedPreferences$Editor uEditor = n.b().edit();
                   String str1 = PostUtils.s("enableAutoOpenHdExport");
                   boolean b1 = (uBoolean1 != null)? uBoolean1.booleanValue(): false;
                   g.a(uEditor.putBoolean(str1, b1));
                   uEditor = n.b().edit();
                   String str2 = PostUtils.s("show_shop_promotion");
                   if (uBoolean2 != null) {
                      b = uBoolean2.booleanValue();
                   }
                   g.a(uEditor.putBoolean(str2, b));
                   uEditor = n.b().edit();
                   String str3 = PostUtils.s("shop_promotion_url");
                   if (str == null) {
                      str = "";
                   }
                   g.a(uEditor.putString(str3, str));
                   postStartUpD = p0.a();
                   if (postStartUpD != null) {
                      uploadPostFo = postStartUpD.g();
                   }
                   a.Y(uploadPostFo);
                   this.b.a.onNext(p0);
                }
             }
             str = uploadPostFo;
             goto label_0065 ;
          }
       }
       uBoolean2 = uploadPostFo;
       goto label_0053 ;
       return;
    }
}
