package gi9.c;
import erd.g;
import gi9.b;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.PostStartUpResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import j8c.a;
import q87.c;
import lq.i;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$PostStartUpData;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.yxcorp.gifshow.model.config.ShowAlbum;
import bn8.a;
import java.lang.StringBuilder;
import com.kwai.feature.post.api.feature.upload.model.UploadPostForbidNotify;
import rq.a;
import oe6.n;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.robust.PatchProxyResult;
import qi9.d1;
import qi9.q1;
import qi9.c1;
import java.lang.reflect.Type;
import java.util.Map;
import qi9.h1;
import com.yxcorp.gifshow.model.response.PostStartUpResponse$ShopPromotionInfo;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import com.kwai.feature.post.api.feature.live.ShareLivePredictionConfig;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import tkd.b;
import tkd.d;
import w26.a;
import w26.c;
import voc.m;
import java.util.List;
import com.yxcorp.gifshow.camera.record.base.d;
import gi9.a;
import com.yxcorp.gifshow.camera.record.base.b;

public final class c implements g	// class@0024a9
{
    public final b b;
    public final String c;

    public void c(b p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       SharedPreferences$Editor uEditor;
       Object[] objArray2;
       Boolean uBoolean2;
       String str2;
       PostStartUpResponse$PostStartUpData showKaraokeE;
       StringBuilder str3;
       boolean b;
       Object[] objArray4;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
       }else {
          a.p(p0, "s");
          c tb = this.b;
          c tc = this.c;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidTwoRefs(p0, tc, tb, b.class, "6") || (tb.h2() && TextUtils.equals(tc, tb.g2()))) {
             int i = 0;
             Object[] objArray = new Object[i];
             String str1 = "VPController";
             a.D().w(str1, "handleResponse", objArray);
             if (i.h()) {
                i.m().Q("SHOOT_STARTUP_REQUESTED", Boolean.TRUE);
             }
             PostStartUpResponse$PostStartUpData postStartUpD = p0.a();
             if (postStartUpD != null) {
                postStartUpD = postStartUpD.assistantStartUpData;
                if (postStartUpD != null) {
                   uEditor = a.a.edit();
                   uEditor.putString("assist_startup_data", b.e(postStartUpD));
                   g.a(uEditor);
                }
             }
             postStartUpD = p0.a();
             if (postStartUpD != null) {
                postStartUpD = postStartUpD.timedVisibleText;
                if (postStartUpD != null) {
                   uEditor = a.a.edit();
                   uEditor.putString("edit_timed_visible_text", b.e(postStartUpD));
                   g.a(uEditor);
                }
             }
             postStartUpD = p0.a();
             if (postStartUpD != null) {
                uEditor = a.a.edit();
                uEditor.putString("show_album", b.e(postStartUpD.e()));
                g.a(uEditor);
             }
             postStartUpD = p0.a();
             if (postStartUpD != null) {
                Object[] objArray1 = new Object[i];
                a.D().w(str1, "enableAlbumMultiImport = "+postStartUpD.enableAlbumMultiImport, objArray1);
             }
             postStartUpD = p0.a();
             if (postStartUpD != null) {
                a.Y(postStartUpD.g());
             }
             postStartUpD = p0.a();
             objArray = null;
             Boolean uBoolean = (postStartUpD != null)? postStartUpD.f(): objArray;
             if (uBoolean != null) {
                uBoolean.booleanValue();
                objArray2 = new Object[i];
                a.D().w(str1, "showJudgeAssist = "+uBoolean, objArray2);
                g.a(n.b().edit().putBoolean(PostUtils.s("show_judge_assist_switch"), uBoolean.booleanValue()));
             }
             postStartUpD = PatchProxy.apply(objArray, p0, PostStartUpResponse.class, str);
             if (postStartUpD != PatchProxyResult.class) {
             }else {
                PostStartUpResponse data = p0.data;
                postStartUpD = (data != null)? data.content: objArray;
             }
             if (!PatchProxy.applyVoidTwoRefs(tc, postStartUpD, objArray, d1.class, str)) {
                q1 oq1 = q1.C();
                str3 = "setVP ";
                boolean b2 = (postStartUpD != null)? true: false;
                Object[] objArray3 = new Object[i];
                oq1.s("CameraSdkSP", str3+b2, objArray3);
                Map map = h1.a(c1.b);
                if (!TextUtils.isEmpty(postStartUpD)) {
                   map.put(tc, postStartUpD);
                   SharedPreferences$Editor uEditor3 = h1.a.edit();
                   uEditor3.putString("uid_and_vision_portrait", b.e(map));
                   g.a(uEditor3);
                }
             }
             PostStartUpResponse$PostStartUpData postStartUpD1 = p0.a();
             Boolean uBoolean1 = (postStartUpD1 != null)? postStartUpD1.a(): objArray;
             PostStartUpResponse$PostStartUpData postStartUpD2 = p0.a();
             if (postStartUpD2 != null) {
                PostStartUpResponse$ShopPromotionInfo shopPromotio = postStartUpD2.d();
                if (shopPromotio != null) {
                   uBoolean2 = Boolean.valueOf(shopPromotio.b());
                label_01a1 :
                   postStartUpD = p0.a();
                   if (postStartUpD != null) {
                      PostStartUpResponse$ShopPromotionInfo shopPromotio1 = postStartUpD.d();
                      if (shopPromotio1 != null) {
                         str2 = shopPromotio1.a();
                      label_01b3 :
                         PostStartUpResponse$PostStartUpData postStartUpD3 = p0.a();
                         if (postStartUpD3 != null) {
                            showKaraokeE = postStartUpD3.showKaraokeEntryGuide;
                         }
                         objArray2 = new Object[i];
                         a.D().w(str1, "enableAutoOpenHdExport = "+uBoolean1+", "+"showShopPromotion="+uBoolean2+", shopPromotionUrl="+str2, objArray2);
                         SharedPreferences$Editor uEditor1 = n.b().edit();
                         str3 = PostUtils.s("enableAutoOpenHdExport");
                         b = (uBoolean1 != null)? uBoolean1.booleanValue(): false;
                         g.a(uEditor1.putBoolean(str3, b));
                         SharedPreferences$Editor uEditor2 = n.b().edit();
                         str1 = PostUtils.s("show_shop_promotion");
                         boolean b1 = (uBoolean2 != null)? uBoolean2.booleanValue(): false;
                         g.a(uEditor2.putBoolean(str1, b1));
                         uEditor2 = n.b().edit();
                         String str4 = PostUtils.s("shop_promotion_url");
                         if (str2 == null) {
                            str2 = "";
                         }
                         g.a(uEditor2.putString(str4, str2));
                         uEditor2 = n.b().edit();
                         str4 = PostUtils.s("showKaraokeEntryGuide");
                         if (showKaraokeE != null) {
                            i = showKaraokeE.booleanValue();
                         }
                         g.a(uEditor2.putBoolean(str4, i));
                         ProducerHelpConfig producerHelp = new ProducerHelpConfig();
                         producerHelp.mShareLivePredictionConfig = p0.d();
                         producerHelp.mShareBusinessLinkInfo = p0.e();
                         d.a(0x27e26f6e).GR(producerHelp);
                         d.a(0x27ab2faf).O1(p0.b());
                         d.a(0x27ab2faf).w1(p0.c());
                         tb.d.m(new a(p0));
                      }
                   }
                   str2 = objArray;
                   goto label_01b3 ;
                }
             }
             uBoolean2 = objArray;
             goto label_01a1 ;
          }
       }
       return;
    }
}
