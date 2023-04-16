package com.feature.post.bridge.m;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsSelectAndUploadMediaParams;
import f55.g;
import og.l;
import java.lang.Object;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import pm6.e;
import com.feature.post.bridge.m$a;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import pm6.e$b;
import java.io.File;
import o56.a;
import java.lang.Integer;
import android.app.Application;
import android.os.Bundle;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import mg.b1;
import ojd.f;
import brd.t;
import com.kwai.framework.fileuploader.UploadUtils;
import mg.d1;
import mg.e1;
import erd.g;
import crd.b;

public class m	// class@0014ad
{

    public static void a(Activity p0,JsSelectAndUploadMediaParams p1,g p2){
       Object[] objArray = new Object[0];
       l.D().w("JsSelectAndUploadMediaF", "selectAndUploadMedia: ", objArray);
       if (!p0 instanceof GifshowActivity) {
          return;
       }
       e.c(p0, e.a, new m$a(p0, p1, p2));
       return;
    }
    public static void b(Activity p0,JsSelectAndUploadMediaParams p1,String p2,g p3){
       int i = 0;
       if ((long)p1.mMaxFileSize - new File(p2).length() < 0) {
          Object[] objArray = new Object[]{Integer.valueOf(((p1.mMaxFileSize / 1024) / 1024))};
          p3.a(412, a.B.getString(R.string.arg_RES_7f105063, objArray), new Bundle());
          return;
       }else if(!p0 instanceof FragmentActivity){
          return;
       }else {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Eh(i, 100);
          progressFrag.setCancelable(i);
          progressFrag.show(p0.getSupportFragmentManager(), "runner");
          UploadUtils.upload(p1.mToken, p2, new b1(progressFrag)).subscribe(new d1(progressFrag, p3), new e1(progressFrag, p3));
          return;
       }
    }
}
