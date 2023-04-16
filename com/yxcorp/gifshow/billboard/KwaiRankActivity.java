package com.yxcorp.gifshow.billboard.KwaiRankActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import elc.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import lnc.i3;
import ekd.w0;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import com.yxcorp.gifshow.billboard.KwaiRankActivity$a;
import java.lang.reflect.Type;
import el.a;
import oe6.b;
import android.content.SharedPreferences;
import km8.b;
import java.util.List;
import android.view.View;
import tkd.b;
import tkd.d;
import vw5.a;
import ma9.a;
import uw5.c;
import z1.a;
import elc.h;
import im8.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import ekd.i;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import java.util.Set;
import ekd.x0;
import java.util.Iterator;
import lnc.o5;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.preference.startup.KwaiBoardInfo;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONException;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LaunchModel$b;
import java.util.Map$Entry;
import js6.a;
import com.kwai.kds.krn.api.page.KwaiRnFragment;

public class KwaiRankActivity extends SingleFragmentActivity	// class@001c54
{
    public final a A;
    public Fragment B;
    public List y;
    public final PresenterV2 z;
    public static final int C;

    public void KwaiRankActivity(){
       super();
       this.z = new PresenterV2();
       this.A = new a();
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, KwaiRankActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getIntent() == null || this.getIntent().getData() == null) {
          return "";
       }
       obj = i3.f();
       obj.d("entry_source", w0.a(this.getIntent().getData(), "entry_source"));
       return obj.e();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KwaiRankActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       KwaiRankActivity kwaiRankActi = KwaiRankActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kwaiRankActi, "1")) {
          return;
       }
       Type type = new KwaiRankActivity$a(this).getType();
       String str = "";
       String str1 = b.a.getString("boardInfoList", str);
       Object[] objArray = null;
       List list = (str1 == null || str1 == str)? objArray: b.a(str1, type);
       this.y = list;
       super.onCreate(p0);
       View view = this.findViewById(R.id.content);
       if (this.B != null) {
          KwaiRankActivity tz = this.z;
          str1 = "8";
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, this, kwaiRankActi, str1);
          if (presenterV2 != PatchProxyResult.class) {
          }else {
             PresenterV2 presenterV21 = d.a(-680793205).e6();
             c uoc = new c();
             uoc.e(5);
             uoc.c(1);
             presenterV21.U7(d.a(-680793205).kt(new a(this), uoc));
             presenterV21.U7(new h());
             PatchProxy.onMethodExit(kwaiRankActi, str1);
             presenterV2 = presenterV21;
          }
          tz.U7(presenterV2);
          this.z.f(view);
          Object[] objArray1 = new Object[]{this.A,c.a("FRAGMENT", this.B)};
          this.z.i(objArray1);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KwaiRankActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       if (this.z.R1()) {
          this.z.unbind();
          this.z.destroy();
       }
       return;
    }
    public Fragment u3(){
       Fragment uFragment;
       LaunchModel launchModel;
       LaunchModel$b uob;
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       Object[] objArray1;
       int i;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiRankActivity kwaiRankActi = KwaiRankActivity.class;
       Object[] objArray = null;
       HashMap obj1 = PatchProxy.apply(objArray, obj, kwaiRankActi, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       i.h(obj, 0, 0);
       obj1 = PatchProxy.apply(objArray, obj, kwaiRankActi, "5");
       if (obj1 != patchProxyRe) {
          uFragment = obj1;
       }else {
          obj1 = PatchProxy.apply(objArray, obj, kwaiRankActi, "6");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new HashMap();
             Intent intent = this.getIntent();
             if (intent == null) {
                objArray1 = objArray;
             }else {
                try{
                   Uri data = intent.getData();
                   if (data != null && data.isHierarchical()) {
                      JSONObject jSONObject = new JSONObject();
                      Iterator iterator1 = x0.c(data).iterator();
                      while (iterator1.hasNext()) {
                         String str = iterator1.next();
                         String str1 = x0.a(data, str);
                         i = str.hashCode();
                         int i1 = 2;
                         int i2 = 1;
                         if (i != 3355) {
                            if (i != 0x368f3a) {
                               if (i != 0x2e37e605) {
                                  if (i == 0x7fdbd5a4 && str.equals("selectBoardType")) {
                                     i = 3;
                                  }else {
                                  label_00a9 :
                                     i = -1;
                                  }
                               }else if(str.equals("selectBoardId")){
                                  i = 2;
                               }else {
                                  goto label_00a9 ;
                               }
                            }else if(str.equals("type")){
                               i = 1;
                            }else {
                               goto label_00a9 ;
                            }
                         }else if(str.equals("id")){
                            i = 0;
                         }else {
                            goto label_00a9 ;
                         }
                         if (i && i != i2) {
                            if (i != i1) {
                               if (i != 3) {
                                  jSONObject.put(str, str1);
                               }else {
                                  jSONObject.put("type", o5.b(str1, i2));
                               }
                            }else {
                               jSONObject.put("id", o5.b(str1, i2));
                            }
                         }else if(!jSONObject.has(str)){
                            jSONObject.put(str, o5.b(str1, i2));
                         }
                         i2 = 0;
                      }
                      obj1.put("linkParams", jSONObject.toString());
                      ArrayList uArrayList = new ArrayList();
                      if (!q.f(obj.y)) {
                         Iterator iterator2 = obj.y.iterator();
                         while (iterator2.hasNext()) {
                            KwaiBoardInfo kwaiBoardInf = iterator2.next();
                            jSONObject = new JSONObject(a.a.q(kwaiBoardInf));
                            jSONObject.put("type", kwaiBoardInf.mType);
                            uArrayList.add(jSONObject);
                         }
                      }
                      JSONObject jSONObject1 = new JSONObject();
                      jSONObject1.put("boardInfoList", uArrayList.toString());
                      jSONObject1.put("entrySource", "RANK_PAGE");
                      obj1.put("customParams", jSONObject1.toString());
                   }
                }catch(org.json.JSONException e0){
                   e0.printStackTrace();
                   objArray1 = null;
                }
             }
          }
       }
       obj.B = uFragment;
       return uFragment;
    }
    public boolean y3(){
       return true;
    }
}
