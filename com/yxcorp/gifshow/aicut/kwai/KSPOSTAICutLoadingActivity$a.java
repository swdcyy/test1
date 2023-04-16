package com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.aicut.kwai.KSPOSTAICutLoadingActivity;
import android.app.Activity;
import java.util.List;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import h69.g;
import java.lang.StringBuilder;
import q87.c;
import tkd.b;
import tkd.d;
import r16.e;
import r16.f;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j0;

public final class KSPOSTAICutLoadingActivity$a	// class@00194e
{

    public void KSPOSTAICutLoadingActivity$a(){
       super();
    }
    public void KSPOSTAICutLoadingActivity$a(u p0){
       super();
    }
    public final void a(boolean p0){
       KSPOSTAICutLoadingActivity.U = p0;
    }
    public final void b(Activity p0,List p1,String p2,String p3,int p4,String p5,Integer p6,boolean p7){
       KSPOSTAICutLoadingActivity$a uoa = KSPOSTAICutLoadingActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),p5,p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "medias");
       a.p(p2, "taskId");
       Object[] objArray1 = new Object[0];
       g.D().w("AICutLoadingActivity", "start\(\) called with: activity = ["+p0+"], medias = ["+p1+"], taskId =["+p2+"], "+"themeId = ["+p3+"], musicId = ["+p5+"], musicType = ["+p6+']', objArray1);
       if (!d.a(0x6758ee6d).tJ(1)) {
          Object[] objArray2 = new Object[0];
          g.D().A("AICutLoadingActivity", "startAICut: checkAndSetEnterFlag false", objArray2);
          return;
       }else {
          Intent intent = new Intent(p0, KSPOSTAICutLoadingActivity.class);
          SerializableHook.putExtra(intent, "intent_key_data_list", p1);
          intent.putExtra("photo_task_id", p2);
          if (!TextUtils.x(p3)) {
             intent.putExtra("pre_select_theme_id", p3);
             intent.putExtra("pre_select_template_type", p4);
          }
          if (!TextUtils.x(p5)) {
             intent.putExtra("pre_select_music_id", p5);
          }
          if (p6 != null) {
             intent.putExtra("pre_select_music_type", p6.intValue());
          }
          intent.putExtra("camera_page_from", j0.b(p0.getIntent(), "camera_page_from", 0));
          if (p7) {
             intent.putExtra("discard_current_post_session", 1);
          }
          p0.startActivity(intent);
          return;
       }
    }
}
