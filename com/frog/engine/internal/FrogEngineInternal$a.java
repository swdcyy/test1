package com.frog.engine.internal.FrogEngineInternal$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.font.SystemFont;

public final class FrogEngineInternal$a implements Runnable	// class@001530
{

    public void FrogEngineInternal$a(){
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogEngineInternal$a.class, "1")) {
          return;
       }
       SystemFont.loadFontInfo();
       return;
    }
}
