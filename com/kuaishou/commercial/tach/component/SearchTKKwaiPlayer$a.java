package com.kuaishou.commercial.tach.component.SearchTKKwaiPlayer$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.SearchTKKwaiPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.h;
import android.view.View;
import com.tachikoma.core.component.e;

public class SearchTKKwaiPlayer$a implements Runnable	// class@001651
{
    public final SearchTKKwaiPlayer b;

    public void SearchTKKwaiPlayer$a(SearchTKKwaiPlayer p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SearchTKKwaiPlayer$a.class, "1")) {
          return;
       }
       d.a(-1317293397).i(this.b.getView());
       return;
    }
}
