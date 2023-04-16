package com.yxcorp.gifshow.album.widget.preview.c$i;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.c;
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

public class c$i implements g	// class@001b34
{
    public final ViewGroup b;
    public final c c;

    public void c$i(c p0,ViewGroup p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$i.class, "1")) {
       }else {
          Log.d("ImagePreviewItem", "prepareBubbleBackgroundColor error, index="+this.c.b);
          p.a.a(0, this.b);
       }
       return;
    }
}
