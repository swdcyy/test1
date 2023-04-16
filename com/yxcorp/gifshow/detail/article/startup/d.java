package com.yxcorp.gifshow.detail.article.startup.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.article.startup.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.article.startup.ResourceCopyrightStartupConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class d extends ConfigAutoParseJsonConsumer	// class@00136b
{

    public void d(){
       super(c.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
       }else if(p0 != null){
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putString("musicCopyrightToast", p0.mMusicCopyrightToast);
          g.a(uEditor);
       }
       return;
    }
}
