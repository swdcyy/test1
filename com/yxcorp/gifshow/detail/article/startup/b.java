package com.yxcorp.gifshow.detail.article.startup.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.article.startup.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.article.startup.ArticleStartupConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001369
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else if(p0 != null){
          SharedPreferences$Editor uEditor = c.a.edit();
          uEditor.putBoolean("enableFeed4ArticlePage", p0.mEnableFeed4ArticlePage);
          g.a(uEditor);
       }
       return;
    }
}
