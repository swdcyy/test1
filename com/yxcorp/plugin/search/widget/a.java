package com.yxcorp.plugin.search.widget.a;
import java.util.TimerTask;
import com.yxcorp.plugin.search.widget.SearchDanmakuView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;

public class a extends TimerTask	// class@0007f4
{
    public final SearchDanmakuView b;

    public void a(SearchDanmakuView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.t.sendEmptyMessage(1);
       return;
    }
}
