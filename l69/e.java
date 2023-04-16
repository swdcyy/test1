package l69.e;
import c16.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.aicut.AICutProjectOption;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import h69.g;
import q87.c;
import com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity;
import java.lang.Integer;
import android.app.Activity;
import java.util.List;
import com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import l69.n;
import java.util.Objects;
import c16.c;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import r16.e;
import r16.f;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import android.text.TextUtils;
import s69.i;

public class e implements a	// class@002c97
{

    public void e(){
       super();
    }
    public void GC(GifshowActivity p0,AICutProjectOption p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, e.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "option");
       Object[] objArray = new Object[0];
       g.D().w("discardCurrentPostSession", "startAICut", objArray);
       AICutProjectOption mMedias = p1.mMedias;
       a.o(mMedias, "option.mMedias");
       AICutProjectOption mTaskId = p1.mTaskId;
       a.o(mTaskId, "option.mTaskId");
       AICutProjectOption uAICutProjec = mMedias;
       mMedias = mTaskId;
       KSPOSTAICutLoadingActivity.V.b(p0, uAICutProjec, mMedias, p1.mThemeId, p1.mTemplateType, p1.mMusicId, Integer.valueOf(p1.mMusicType), 1);
       PatchProxy.onMethodExit(e.class, "2");
       return;
    }
    public boolean GD(String p0,String p1,GifshowActivity p2,List p3,String p4,String p5,String p6,String p7,boolean p8){
       String obj;
       n this;
       String str4;
       String str5;
       Object[] objArray2;
       String str7;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p6;
       object oobject7 = p7;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String str = "1";
       int i = 2;
       int i1 = 9;
       boolean i2 = 1;
       boolean i3 = 0;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[i1];
          objArray[i3] = oobject;
          objArray[i2] = oobject1;
          objArray[i] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = oobject6;
          objArray[7] = oobject7;
          objArray[8] = Boolean.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, uoe, str);
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }else {
          i = this;
       }
       obj = "appPackageName";
       a.p(oobject, obj);
       String str1 = "appId";
       a.p(oobject1, str1);
       String str2 = "activity";
       a.p(oobject2, str2);
       String str3 = "medias";
       a.p(oobject3, str3);
       n f = n.f;
       Objects.requireNonNull(f);
       this = n.class;
       if (PatchProxy.isSupport(this)) {
          str4 = str;
          str5 = str3;
          Object[] objArray1 = new Object[9];
          objArray1[0] = oobject;
          objArray1[1] = oobject1;
          objArray1[2] = oobject2;
          objArray1[3] = oobject3;
          objArray1[4] = oobject4;
          objArray1[5] = oobject5;
          objArray1[6] = oobject6;
          objArray1[7] = oobject7;
          objArray1[8] = Boolean.valueOf(p8);
          KSPOSTAICutLoadingActivity$a obj1 = PatchProxy.apply(objArray1, f, this, "10");
          if (obj1 != patchProxyRe) {
             i3 = obj1.booleanValue();
          }else {
          label_00b0 :
             a.p(oobject, obj);
             a.p(oobject1, str1);
             a.p(oobject2, str2);
             str = str5;
             a.p(oobject3, str);
             str3 = "KwaiAICutModule";
             if (!c.c()) {
                objArray2 = new Object[0];
                g.D().w(str3, "startAICut: can not start", objArray2);
             }else {
                i = 0;
                if (p3.isEmpty()) {
                   objArray2 = new Object[i];
                   g.D().w(str3, "startAICut: wrong args medias is empty", objArray2);
                }else {
                   str5 = str;
                   String str6 = str2;
                   i1 = 0;
                   Object[] objArray3 = new Object[i1];
                   g.D().w(str3, "startAICut: "+oobject+" medias size="+p3.size()+' '+"taskId="+oobject4+" tag="+oobject5+' '+"extraInfo="+oobject6+" appId="+oobject1, objArray3);
                   obj1 = KSPOSTAICutLoadingActivity.V;
                   Objects.requireNonNull(obj1);
                   KSPOSTAICutLoadingActivity$a Object i4 = KSPOSTAICutLoadingActivity$a.class;
                   if (PatchProxy.isSupport(i4)) {
                      objArray1 = new Object[9];
                      objArray1[i1] = oobject;
                      objArray1[1] = oobject1;
                      objArray1[2] = oobject2;
                      objArray1[3] = oobject3;
                      objArray1[4] = oobject4;
                      objArray1[5] = oobject5;
                      objArray1[6] = oobject6;
                      objArray1[7] = oobject7;
                      objArray1[8] = Boolean.valueOf(p8);
                      i4 = PatchProxy.apply(objArray1, obj1, i4, str4);
                      if (i4 != patchProxyRe) {
                         i2 = i4.booleanValue();
                      }else {
                      label_017a :
                         a.p(oobject, obj);
                         a.p(oobject1, str1);
                         a.p(oobject2, str6);
                         a.p(oobject3, str5);
                         obj = "AICutLoadingActivity";
                         if (KSPOSTAICutLoadingActivity.U) {
                            objArray2 = new Object[0];
                            g.D().w(obj, "startFromThirdApp: already has one ", objArray2);
                         }else {
                            int i5 = 0;
                            if (!d.a(0x6758ee6d).tJ(true)) {
                               objArray2 = new Object[i5];
                               g.D().A(obj, "startFromThirdApp: checkAndSetEnterFlag false", objArray2);
                            }else {
                               obj1.a(true);
                               Object[] objArray4 = new Object[0];
                               g.D().s(obj, "startFromThirdApp\(\) called with: appPackageName = ["+oobject+"],"+" activity = ["+oobject2+"], medias size= ["+p3.size()+"], "+"taskId = ["+oobject4+"], tag =["+oobject5+"], extraInfo = ["+oobject6+']', objArray4);
                               Intent intent = new Intent(oobject2, KSPOSTAICutLoadingActivity.class);
                               SerializableHook.putExtra(intent, "intent_key_data_list", oobject3);
                               intent.putExtra("intent_key_share_app", oobject);
                               intent.putExtra("intent_key_share_app_id", oobject1);
                               if (!TextUtils.isEmpty(p5)) {
                                  intent.putExtra("tag", oobject5);
                               }
                               if (!TextUtils.isEmpty(p6)) {
                                  intent.putExtra("intent_key_extra", oobject6);
                               }
                               if (!TextUtils.isEmpty(p7)) {
                                  intent.putExtra("intent_key_share_pub_info", oobject7);
                               }
                               if (p8) {
                                  intent.putExtra("discard_current_post_session", true);
                               }else {
                                  objArray2 = 1;
                               }
                               SerializableHook.putExtra(intent, "intent_key_data_list", oobject3);
                               oobject = (oobject4 != null)? oobject4: i.a.b();
                               intent.putExtra("photo_task_id", oobject);
                               oobject2.startActivity(intent);
                               objArray3 = 1;
                            }
                         }
                         objArray3 = 0;
                      }
                   }else {
                      goto label_017a ;
                   }
                   i3 = i2;
                }
             }
             i3 = false;
          }
       }else {
          str4 = str;
          str5 = str3;
          goto label_00b0 ;
       }
       return i3;
    }
    public boolean isAvailable(){
       return true;
    }
}
