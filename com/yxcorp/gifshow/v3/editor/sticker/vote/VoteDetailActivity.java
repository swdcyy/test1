package com.yxcorp.gifshow.v3.editor.sticker.vote.VoteDetailActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import java.lang.String;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import n3d.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import faa.a;
import q87.c;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.yxcorp.gifshow.v3.editor.sticker.vote.detail.VoteDetailTabHostFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import java.lang.StringBuilder;

public class VoteDetailActivity extends GifshowActivity	// class@0012c6
{

    public void VoteDetailActivity(){
       super();
    }
    public static void u3(Context p0,String p1,VoteResultResponse p2,int p3,a p4){
       VoteDetailActivity voteDetailAc = VoteDetailActivity.class;
       if (PatchProxy.isSupport(voteDetailAc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, voteDetailAc, "1")) {
             return;
          }
       }
       Intent intent = new Intent(p0, voteDetailAc);
       intent.putExtra("PHOTO_ID", p1);
       SerializableHook.putExtra(intent, "VOTE_RESULT_RESPONSE", p2);
       if (p0 instanceof GifshowActivity) {
          p0.t1(intent, p3, p4);
       }else {
          p0.startActivity(intent);
       }
       return;
    }
    public int f(){
       return 14;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, VoteDetailActivity.class, "3")) {
          return;
       }
       this.setResult(-1);
       super.finish();
       Object[] objArray = new Object[0];
       a.D().s("ks://vote_result_detail", "finish", objArray);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, VoteDetailActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://vote_result_detail";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteDetailActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       VoteDetailTabHostFragment voteDetailTa = new VoteDetailTabHostFragment();
       Bundle uBundle = new Bundle();
       String str = "PHOTO_ID";
       String stringExtra = this.getIntent().getStringExtra(str);
       if (TextUtils.x(stringExtra)) {
          Uri data = this.getIntent().getData();
          if (data != null) {
             stringExtra = data.getLastPathSegment();
          }
       }
       uBundle.putString(str, stringExtra);
       SerializableHook.putSerializable(uBundle, "VOTE_RESULT_RESPONSE", SerializableHook.getSerializableExtra(this.getIntent(), "VOTE_RESULT_RESPONSE"));
       voteDetailTa.setArguments(uBundle);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(0x1020002, voteDetailTa);
       uoe.m();
       Object[] objArray = new Object[]{"bundle:"+uBundle};
       a.D().s("ks://vote_result_detail", "onCreate", objArray);
       return;
    }
}
