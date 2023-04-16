package com.yxcrop.gifshow.v3.editor.text_v3.repo.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$j;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class a implements Runnable	// class@000c37
{
    public final TextTemplateRepoV3$j b;
    public final Throwable c;

    public void a(TextTemplateRepoV3$j p0,Throwable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.c.onError(this.c);
       return;
    }
}
