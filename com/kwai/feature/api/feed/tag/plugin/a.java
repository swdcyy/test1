package com.kwai.feature.api.feed.tag.plugin.a;
import com.kwai.plugin.dva.work.c$c;
import jp5.a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sj7.d;

public final class a implements c$c	// class@000f72
{
    public final a a;

    public void a(a p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.a();
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.a.success();
       }
       return;
    }
}
