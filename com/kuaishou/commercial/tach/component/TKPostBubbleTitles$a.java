package com.kuaishou.commercial.tach.component.TKPostBubbleTitles$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.TKPostBubbleTitles;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.l;
import android.view.View;
import com.tachikoma.core.component.e;

public class TKPostBubbleTitles$a implements Runnable	// class@001661
{
    public final TKPostBubbleTitles b;

    public void TKPostBubbleTitles$a(TKPostBubbleTitles p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKPostBubbleTitles$a.class, "1")) {
          return;
       }
       d.a(-1509085419).i(this.b.getView());
       return;
    }
}
