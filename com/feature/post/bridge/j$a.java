package com.feature.post.bridge.j$a;
import pm6.e$b;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import f55.g;
import java.lang.Object;
import pm6.g;
import java.util.List;
import com.feature.post.bridge.i;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Exception;
import og.l;
import java.lang.String;
import q87.c;
import o56.a;
import android.app.Application;
import android.os.Bundle;
import com.kwai.plugin.dva.work.c$c;
import sj7.d;

public class j$a implements e$b	// class@00147f
{
    public final Activity a;
    public final JsUploadVideoFromAlbumParams b;
    public final g c;

    public void j$a(Activity p0,JsUploadVideoFromAlbumParams p1,g p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean c(){
       return g.a(this);
    }
    public void j(List p0){
       k1.r(new i(this.a, this.b, this.c), 0);
    }
    public void onFailed(Exception p0){
       Object[] objArray = new Object[0];
       l.D().w("JsPublishFun", "uploadVideoFromAlbum: asyncLoadWithDialog onClickCancel", objArray);
       this.c.a(412, a.B.getString(R.string.arg_RES_7f1042c6), new Bundle());
    }
    public void onProgress(float p0){
       g.c(this, p0);
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       this.j(p0);
    }
}
