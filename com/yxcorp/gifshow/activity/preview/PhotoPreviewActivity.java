package com.yxcorp.gifshow.activity.preview.PhotoPreviewActivity;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import android.content.Intent;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import android.view.View;
import com.yxcorp.gifshow.activity.preview.PhotoPreviewActivity$b;
import java.lang.Enum;
import com.yxcorp.gifshow.activity.preview.PhotoPreviewActivity$a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Void;
import com.yxcorp.utility.AsyncTask;
import com.yxcorp.gifshow.util.PostUtils;
import android.net.Uri;
import ekd.w0;
import android.os.Parcelable;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageView;

public class PhotoPreviewActivity extends BasePostActivity implements View$OnClickListener	// class@00135e
{
    public File O;
    public boolean P;
    public TakePictureType Q;
    public String R;
    public MagicEmoji$MagicFace S;
    public int T;
    public static final int U;

    public void PhotoPreviewActivity(){
       super();
       this.T = -1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PhotoPreviewActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       String str = (this.Q == TakePictureType.LIVE_AUTHENTICATE)? "ks://live_authenticate_photo_preview": "ks://photobeautify";
       return str;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PhotoPreviewActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PhotoPreviewActivity.class, "5")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1 && p1 == -1) {
          this.setResult(-1);
          this.finish();
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, PhotoPreviewActivity.class, "2")) {
          return;
       }
       super.onBackPressed();
       PhotoPreviewActivity tO = this.O;
       if (tO != null && (tO.exists() && this.P != null)) {
          this.O.delete();
       }
    label_0022 :
       return;
    }
    public void onClick(View p0){
       PhotoPreviewActivity tO;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPreviewActivity.class, "4")) {
          return;
       }
       if (p0.getId() == 0x7f0a1716) {
          tO = this.O;
          if (tO != null && (tO.exists() && this.P != null)) {
             this.O.delete();
          }
       label_0027 :
          this.finish();
       }else if(p0.getId() == 0x7f0a3643){
          int i = PhotoPreviewActivity$b.a[this.Q.ordinal()];
          if (i != 1) {
             if (i == 2) {
                Void[] voidArray = new Void[0];
                new PhotoPreviewActivity$a(this, this).c(voidArray);
             }
          }else {
             PostUtils.x(this.getUrl(), "start_upload_photo");
             tO = this.O;
             if (!PatchProxy.applyVoidOneRefs(tO, this, PhotoPreviewActivity.class, "8")) {
                Intent intent = new Intent();
                if (tO == null) {
                   tO = this.O;
                }
                intent.putExtra("android.intent.extra.STREAM", w0.c(tO));
                this.setResult(-1, intent);
                this.finish();
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPreviewActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       this.P = this.getIntent().getBooleanExtra("AutoDelete", false);
       this.R = this.getIntent().getStringExtra("tag");
       Intent intent = this.getIntent();
       if (intent != null) {
          String str = "magic_emoji";
          if (intent.hasExtra(str)) {
             this.S = SerializableHook.getSerializableExtra(intent, str);
          }
       }
       this.T = this.getIntent().getIntExtra("Camera_id", -1);
       String stringExtra = this.getIntent().getStringExtra("android.intent.extra.STREAM");
       if (TextUtils.isEmpty(stringExtra)) {
          this.finish();
          return;
       }else {
          File uFile = new File(stringExtra);
          this.O = uFile;
          if (!uFile.exists()) {
             this.finish();
             return;
          }else {
             this.setContentView(R.layout.arg_RES_7f0d1115);
             KwaiActionBar kwaiActionBa = this.findViewById(R.id.title_root).e(R.drawable.arg_RES_7f08006b, 0x7f103937, "");
             kwaiActionBa.h(this);
             kwaiActionBa.l(this);
             this.findViewById(R.id.preview_image).setImageURI(w0.c(this.O));
             this.Q = SerializableHook.getSerializableExtra(this.getIntent(), "TakePictureType");
             return;
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PhotoPreviewActivity.class, "3")) {
          return;
       }
       super.onDestroy();
       return;
    }
}
