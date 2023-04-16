package com.yxcorp.gifshow.album.widget.preview.j;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.f;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import o79.p;
import android.view.View;

public class j implements g	// class@001b3d
{
    public final ViewGroup b;
    public final f c;

    public void j(f p0,ViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          Log.d("VideoSdkPlayerPreviewItem", "prepareBubbleBackgroundColor error, index="+this.c.f);
          p.a.a(0, this.b);
       }
       return;
    }
}
