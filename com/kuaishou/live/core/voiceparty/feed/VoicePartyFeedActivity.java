package com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kuaishou.live.core.voiceparty.feed.VoicePartyFeedFragment;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class VoicePartyFeedActivity extends GifshowActivity	// class@0014ec
{

    public void VoicePartyFeedActivity(){
       super();
    }
    public static void u3(FragmentActivity p0,String p1){
       VoicePartyFeedActivity voicePartyFe = VoicePartyFeedActivity.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, voicePartyFe, "1")) {
          return;
       }
       Intent intent = new Intent(p0, voicePartyFe);
       Bundle uBundle = new Bundle();
       uBundle.putString("voicePartyFeedEnterSourceType", p1);
       intent.putExtras(uBundle);
       p0.startActivity(intent);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, VoicePartyFeedActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://live/voiceparty/feed";
    }
    public void onCreate(Bundle p0){
       VoicePartyFeedActivity voicePartyFe = VoicePartyFeedActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, voicePartyFe, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d04ac);
       VoicePartyFeedFragment voicePartyFe1 = new VoicePartyFeedFragment();
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, voicePartyFe, "3");
       if (objArray1 != PatchProxyResult.class) {
       }else if(this.getIntent() == null){
          objArray1 = objArray;
       }else {
          Uri data = this.getIntent().getData();
       }
       if (objArray1 != null) {
          objArray = x0.a(objArray1, "refer");
       }
       objArray1 = objArray;
       if (!TextUtils.isEmpty(objArray1)) {
          this.getIntent().putExtra("voicePartyFeedEnterSourceType", objArray1);
       }
       voicePartyFe1.setArguments(this.getIntent().getExtras());
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.content_fragment, voicePartyFe1);
       uoe.l();
       return;
    }
}
