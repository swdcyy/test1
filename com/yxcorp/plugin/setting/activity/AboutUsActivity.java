package com.yxcorp.plugin.setting.activity.AboutUsActivity;
import android.view.View$OnClickListener;
import tyc.d3$b;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zfd.a;
import android.view.View$OnLongClickListener;
import ekd.m1;
import android.content.Intent;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.lang.Boolean;
import android.view.Window;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.TextView;
import java.lang.StringBuilder;
import o56.a;
import java.lang.CharSequence;
import tyc.d3;
import com.kwai.sdk.switchconfig.a;
import f66.d;
import xf6.j;
import f66.g;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.plugin.setting.activity.a;
import zfd.b;
import com.yxcorp.plugin.setting.activity.b;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import pgd.c;
import yfd.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.setting.fragment.SettingListFragment;
import java.util.ArrayList;
import java.util.List;
import pgd.a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import pgd.b;
import java.util.Iterator;
import com.yxcorp.plugin.setting.config.AboutUsEntryConfig;
import wgc.c;
import kgd.a;
import kgd.d2;
import kgd.b;
import kgd.y1;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.Fragment;
import android.view.ViewTreeObserver;
import com.yxcorp.plugin.setting.activity.AboutUsActivity$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Integer;
import o56.c;
import java.io.File;
import wkd.b;
import j80.c;
import ok.c;
import com.google.common.io.FileWriteMode;
import com.google.common.io.d;
import sk.c;
import com.google.common.io.a$b;
import com.google.common.io.a;
import java.nio.charset.Charset;
import com.google.common.io.a$a;
import fg6.a;
import java.util.HashMap;
import oe6.a;
import com.google.common.io.b;
import yfd.b;
import java.lang.Throwable;
import q87.c;

public class AboutUsActivity extends GifshowActivity implements View$OnClickListener, d3$b, d	// class@0007f9
{
    public f y;
    public static final int z;

    public void AboutUsActivity(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AboutUsActivity.class, "1")) {
          return;
       }
       m1.d(p0, new a(this), R.id.version_tv);
       return;
    }
    public void f3(){
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AboutUsActivity.class, "10")) {
          return;
       }
       super.finish();
       Intent intent = this.getIntent();
       if (intent != null && intent.getBooleanExtra("open_config_dialog", false)) {
          this.overridePendingTransition(false, R.anim.arg_RES_7f01004c);
       }
       return;
    }
    public int getPage(){
       return 266;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AboutUsActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://aboutus";
    }
    public void onClick(View p0){
    }
    public void onCreate(Bundle p0){
       int b;
       d2 uod2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AboutUsActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       Object[] objArray = null;
       String str = "3";
       p0 = PatchProxy.apply(objArray, this, AboutUsActivity.class, str);
       AboutUsActivity uAboutUsActi = null;
       if (p0 != patchProxyRe) {
          b = p0.booleanValue();
       }else {
          Intent intent = this.getIntent();
          if (intent != null) {
             b = intent.getBooleanExtra("open_config_dialog", uAboutUsActi);
             if (b) {
                this.v2(objArray, 8);
             }
          }else {
             b = false;
          }
       }
       if (b) {
          return;
       }else {
          this.setContentView(R.layout.arg_RES_7f0d001c);
          this.doBindView(this.getWindow().getDecorView());
          this.findViewById(R.id.title_root).d(R.drawable.arg_RES_7f08068e, -1, -1);
          b = 0x7f0a43de;
          this.findViewById(b).setText("V"+a.m);
          String str1 = "1";
          if (!PatchProxy.applyVoid(objArray, this, AboutUsActivity.class, "12")) {
             int i = 0x7f0a2991;
             this.findViewById(i).setOnClickListener(new d3(this));
             Object obj = PatchProxy.apply(objArray, this, AboutUsActivity.class, "7");
             boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("obiwanRCPackagePosternForExportLogs", uAboutUsActi);
             if (!b1) {
                obj = PatchProxy.apply(objArray, objArray, d.class, str1);
                if (obj != patchProxyRe) {
                   uAboutUsActi = obj.booleanValue();
                }else if(j.a() || g.a()){
                   uAboutUsActi = true;
                }
                if (uAboutUsActi || (!SystemUtil.I() && !a.d())) {
                label_00ee :
                   if (!PatchProxy.applyVoid(objArray, this, AboutUsActivity.class, "5") && (j.e() || d.e())) {
                      this.findViewById(R.id.copyright).setOnLongClickListener(new b(this));
                   }
                   if (!PatchProxy.applyVoid(objArray, this, AboutUsActivity.class, "14")) {
                      this.findViewById(b).setOnClickListener(new d3(new b(this)));
                   }
                   if (!PatchProxy.applyVoid(objArray, this, AboutUsActivity.class, "6")) {
                      e uoe = this.getSupportFragmentManager().beginTransaction();
                      SettingListFragment settingListF = PatchProxy.applyOneRefs(this, objArray, d.class, str);
                      if (settingListF != patchProxyRe) {
                      }else {
                         settingListF = new SettingListFragment();
                         ArrayList uArrayList = new ArrayList();
                         List list = PatchProxy.apply(objArray, objArray, c.class, str1);
                         if (list != patchProxyRe) {
                         }else if(c.a == null){
                            list = a.t().getValue("aboutusPageSettingItems", new a().getType(), objArray);
                            c.a = list;
                            if (list == null) {
                               c.a = new Gson().i("[\n    {\n\t\t\"type\": 3,\n\t\t\"nameSc\": \"\x68\x02\x6d\x02\x65\x02\x72\x02\x67\x02\",\n\t\t\"nameEn\": \"Check Update\",\n\t\t\"nameTc\": \"\x6a\x02\x6e\x02\x65\x02\x72\x02\x67\x02\"\n\t},\n    {\n\t\t\"type\": 0,\n\t\t\"nameSc\": \"\x6c\x02\x5f\x02\x67\x02\x6b\x02\",\n\t\t\"nameEn\": \"Terms of Use\",\n\t\t\"nameTc\": \"\x67\x02\x52\x02\x68\x02\x6b\x02\x53\x02\x96\x02\x79\x02\x53\x02\x8b\x02\",\n\t\t\"url\": \"kwai://webview?url=https%3A%2F%2Fapp.m.kuaishou.com%2Fpublic%2Findex.html%3FinKwaiWK%3D1%23%2Fprotocol\"\n\t},\n\t{\n\t\t\"type\": 2,\n\t\t\"nameSc\": \"\x5f\x02\x62\x02\x77\x02\x89\x02\x98\x02\x4f\x02\x54\x02\x4e\x02\x62\x02\x70\x02\x7e\x02\",\n\t\t\"nameEn\": \"Kwai short-video tip-off hotline\",\n\t\t\"nameTc\": \"\x5f\x02\x62\x02\x77\x02\x89\x02\x98\x02\x4f\x02\x54\x02\x82\x02\x58\x02\x71\x02\x7d\x02\",\n\t\t\"subtitle\": \"400-006-6666\",\n        \"extParam\":\"4000066666\"\n\t},\n    {\n\t\t\"type\": 2,\n\t\t\"nameSc\": \"\x5f\x02\x62\x02APP\x4f\x02\x75\x02\x54\x02\x8b\x02\x70\x02\x7e\x02\",\n\t\t\"nameEn\": \"Kwai APP helpline\",\n\t\t\"nameTc\": \"\x5f\x02\x62\x02APP\x4f\x02\x75\x02\x54\x02\x8a\x02\x71\x02\x7d\x02\",\n\t\t\"subtitle\": \"400-126-0088\",\n        \"extParam\":\"4001260088\"\n\t},\n\t{\n\t\t\"type\": 0,\n\t\t\"nameSc\": \"\x84\x02\x4e\x02\x62\x02\x71\x02\",\n\t\t\"nameEn\": \"Business license\",\n\t\t\"nameTc\": \"\x71\x02\x69\x02\x57\x02\x71\x02\",\n\t\t\"url\": \"kwai://webview?url=https%3A%2F%2Fppg.m.etoote.com%2Fdoodle%2FtwOxGkXl.html%3FinKwaiWK%3D1%26hyId%3Ddoodle_twOxGkXl\"\n\t},\n\t{\n\t\t\"type\": 0,\n\t\t\"nameSc\": \"\x8b\x02\x53\x02\x8b\x02\",\n\t\t\"nameEn\": \"Licence\",\n\t\t\"nameTc\": \"\x8a\x02\x53\x02\x8b\x02\",\n\t\t\"url\": \"kwai://webview?url=https%3A%2F%2Fppg.m.etoote.com%2Fdoodle%2FbydTYMFZ.html%3FinKwaiWK%3D1%26hyId%3Ddoodle_bydTYMFZ%0A\"\n\t}\n]\x00", new b().getType());
                            }
                         }
                         list = c.a;
                         Iterator iterator = list.iterator();
                         while (iterator.hasNext()) {
                            AboutUsEntryConfig uAboutUsEntr = iterator.next();
                            a uoa = PatchProxy.applyTwoRefsWithListener(this, uAboutUsEntr, objArray, c.class, "2");
                            if (uoa != patchProxyRe) {
                            }else {
                               AboutUsEntryConfig mType = uAboutUsEntr.mType;
                               if (mType != 1) {
                                  if (mType != 2) {
                                     if (mType != 3) {
                                        uoa = new a(this, uAboutUsEntr);
                                     }else {
                                        uod2 = new d2(this);
                                     label_01d9 :
                                        uoa = uod2;
                                     }
                                  }else {
                                     uoa = new b(this, uAboutUsEntr);
                                  }
                               }else {
                                  uod2 = new y1(this);
                                  goto label_01d9 ;
                               }
                               PatchProxy.onMethodExit(c.class, "2");
                            }
                            uArrayList.add(uoa);
                         }
                         settingListF.dh(uArrayList);
                      }
                      uoe.f(R.id.entry_wrapper, settingListF);
                      uoe.m();
                   }
                   View view = this.findViewById(R.id.entry_wrapper);
                   view.getViewTreeObserver().addOnGlobalLayoutListener(new AboutUsActivity$a(this, view));
                   return;
                }
             }
          label_00e2 :
             this.findViewById(i).setOnLongClickListener(new a(this));
             goto label_00ee ;
          }
       }
    }
    public void v2(View p0,int p1){
       if (PatchProxy.isSupport(AboutUsActivity.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AboutUsActivity.class, "9")) {
          return;
       }
       if (p1 >= 8 && a.a().c()) {
          try{
             FileWriteMode[] uFileWriteMo = new FileWriteMode[0];
             new a$b(new d(new File(b.a(-1504323719).o(), "preference.txt"), uFileWriteMo, null), c.c, null).b(a.a.q(a.R()));
          }catch(java.io.IOException e4){
             b.C().e("AboutUsActivity", "Dump preference failed, ", e4);
          }
          Intent intent = new Intent();
          intent.setClassName("com.smile.gifmaker", "com.kwai.framework.testconfig.ui.TestConfigActivity");
          this.startActivity(intent);
       }
       return;
    }
}
