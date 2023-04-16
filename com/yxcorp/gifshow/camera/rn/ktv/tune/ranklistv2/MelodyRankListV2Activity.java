package com.yxcorp.gifshow.camera.rn.ktv.tune.ranklistv2.MelodyRankListV2Activity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.BaseKtvKrnActivity;
import com.yxcorp.gifshow.camera.rn.ktv.tune.ranklistv2.MelodyRankListV2Activity$a;
import nsd.u;
import com.kuaishou.android.model.music.MusicType;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.model.LaunchModel$b;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.kds.krn.api.page.KwaiRnFragment$a;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import ekd.j0;
import java.io.Serializable;
import android.net.Uri;
import ekd.x0;
import lnc.p3;
import java.lang.Throwable;
import w46.b;
import java.lang.CharSequence;
import com.yxcorp.gifshow.activity.BasePostActivity;

public final class MelodyRankListV2Activity extends BaseKtvKrnActivity	// class@000fff
{
    public String P;
    public int Q;
    public static final MelodyRankListV2Activity$a R;

    static {
       MelodyRankListV2Activity.R = new MelodyRankListV2Activity$a(null);
    }
    public void MelodyRankListV2Activity(){
       super();
       this.P = "";
       this.Q = MusicType.UNKNOWN.mValue;
    }
    public Fragment G3(){
       LaunchModel$b obj = PatchProxy.apply(null, this, MelodyRankListV2Activity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LaunchModel$b();
       obj.i("KMusicRefactor");
       obj.j("detail");
       obj.e("musicId", this.P).b("musicType", this.Q).e("bgColor", "#19191E").e("containerSource", "MelodyRankListV2Activity");
       this.K3(obj);
       return KwaiRnFragment.B.a(obj.h());
    }
    public int M(){
       return 1;
    }
    public int P2(){
       return 1;
    }
    public String getPageParams(){
       String obj = PatchProxy.apply(null, this, MelodyRankListV2Activity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.P,Integer.valueOf(this.Q)};
       obj = String.format("music_id=%s&music_type=%d", Arrays.copyOf(objArray, 2));
       a.o(obj, "java.lang.String.format\(format, *args\)");
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MelodyRankListV2Activity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://ktv_melody_rank_v2";
    }
    public String o(){
       return "KARAOKE_LIST";
    }
    public void onCreate(Bundle p0){
       MelodyRankListV2Activity tP;
       MelodyRankListV2Activity melodyRankLi = MelodyRankListV2Activity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, melodyRankLi, "2")) {
          return;
       }
       this.P = j0.f(this.getIntent(), "ktv_music_id");
       MusicType musicType = j0.e(this.getIntent(), "ktv_music_type");
       if (musicType != null) {
          a.o(musicType, "it");
          this.Q = musicType.getValue();
       }
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, melodyRankLi, "3")) {
          melodyRankLi = this.P;
          Intent intent = (melodyRankLi == null || !melodyRankLi.length())? 1: null;
          if (intent) {
             intent = this.getIntent();
             if (intent != null) {
                objArray = intent.getData();
             }
             if (objArray != null) {
                intent = this.getIntent();
                String str = "intent";
                a.o(intent, str);
                String str1 = x0.a(intent.getData(), "ktv_music_id");
                try{
                   this.P = str1;
                   intent = this.getIntent();
                   a.o(intent, str);
                   str1 = x0.a(intent.getData(), "ktv_music_type");
                   a.o(str1, "SafetyUriUtil.getQueryPa¡­eUtils.INTENT_MUSIC_TYPE\)");
                   this.Q = Integer.parseInt(str1);
                }catch(java.lang.Exception e0){
                   p3.D().e("MelodyRankListV2Activity", "parse musicType exception", e0);
                }
             }
          }
       }
    }
}
