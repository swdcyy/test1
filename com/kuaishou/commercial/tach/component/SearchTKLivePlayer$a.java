package com.kuaishou.commercial.tach.component.SearchTKLivePlayer$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.SearchTKLivePlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.i;
import android.view.View;
import com.tachikoma.core.component.e;

public class SearchTKLivePlayer$a implements Runnable	// class@001653
{
    public final SearchTKLivePlayer b;

    public void SearchTKLivePlayer$a(SearchTKLivePlayer p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, SearchTKLivePlayer$a.class, "1")) {
          return;
       }
       d.a(0x76333103).i(this.b.getView());
       return;
    }
}
