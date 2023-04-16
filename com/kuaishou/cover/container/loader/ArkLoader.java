package com.kuaishou.cover.container.loader.ArkLoader;
import com.kuaishou.cover.container.loader.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d30.c;

public class ArkLoader extends b	// class@0016d7
{

    public void ArkLoader(){
       super();
    }
    public String h(){
       return "ARK";
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, ArkLoader.class, "1")) {
          return;
       }
       c.d("load by ark");
       return;
    }
}
