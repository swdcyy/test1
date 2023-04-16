package com.kwai.feature.api.feed.tag.plugin.TagPluginHelper$Companion$a;
import jp5.a;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.io.PrintStream;

public final class TagPluginHelper$Companion$a implements a	// class@000f6b
{
    public final a a;

    public void TagPluginHelper$Companion$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void success(){
       if (PatchProxy.applyVoid(null, this, TagPluginHelper$Companion$a.class, "1")) {
          return;
       }
       try{
          this.a.invoke();
       }catch(java.lang.Exception e0){
          System.out.print(e0);
       }
       return;
    }
}
