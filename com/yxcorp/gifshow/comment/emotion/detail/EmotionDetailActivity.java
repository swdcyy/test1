package com.yxcorp.gifshow.comment.emotion.detail.EmotionDetailActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.app.Activity;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import android.content.Context;
import android.os.Parcelable;
import org.parceler.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Boolean;
import lnc.b5;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.n;
import joc.w;
import com.yxcorp.gifshow.comment.emotion.detail.a;
import joc.d;
import joc.c;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.comment.emotion.detail.EmotionDetailFragment;

public class EmotionDetailActivity extends SingleFragmentActivity	// class@0010c0
{
    public n A;
    public SwipeLayout y;
    public d z;
    public static final int B;

    public void EmotionDetailActivity(){
       super();
    }
    public static void A3(Activity p0,EmotionInfo p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, EmotionDetailActivity.class, "3")) {
          return;
       }
       if (p1 != null && !TextUtils.isEmpty(p1.mId)) {
          Intent intent = new Intent(p0, EmotionDetailActivity.class);
          intent.putExtra("emotion_info", b.c(p1));
          intent.putExtra("photo_id", p2);
          intent.putExtra("comment_id", p3);
          p0.startActivity(intent);
          p0.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, EmotionDetailActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, EmotionDetailActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b5.a(this);
    }
    public void onCreate(Bundle p0){
       EmotionDetailActivity uEmotionDeta = EmotionDetailActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uEmotionDeta, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, uEmotionDeta, "2")) {
          SwipeLayout swipeLayout = w9.a(this);
          this.y = swipeLayout;
          n on = w.a(this, swipeLayout);
          this.A = on;
          a a = a.a;
          this.z = a;
          on.k(a);
          this.y.setEnabled(false);
          this.y.setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f061f1e));
       }
       return;
    }
    public Fragment u3(){
       EmotionDetailFragment obj = PatchProxy.apply(null, this, EmotionDetailActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EmotionDetailFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
