package com.kuaishou.pagedy.container.widget.HotReloadFloatingView;
import com.kuaishou.pagedy.container.widget.FloatingView;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.Toast;
import su.g$a;
import java.util.HashMap;
import java.util.Map;
import su.g;
import com.kuaishou.pagedy.PageDy;
import com.kuaishou.pagedy.container.widget.HotReloadFloatingView$a;
import co4.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import yz7.n;

public class HotReloadFloatingView extends FloatingView	// class@000a7c
{
    public final Fragment f;
    public final String g;
    public boolean h;

    public void HotReloadFloatingView(Context p0,Fragment p1,String p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public String getFloatingText(){
       return "Reload";
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotReloadFloatingView.class, "2")) {
          return;
       }
       if (this.f == null) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.h = true;
       Toast.makeText(p0.getContext(), "Ò³ÃæË¢ÐÂÖÐ...", 0).show();
       g$a uoa = new g$a("", "", "");
       uoa.u(new HashMap());
       uoa.v(this.g);
       uoa.l(true);
       uoa.n(true);
       uoa.j(true);
       PageDy.e().p(this.f, uoa.a(), new HotReloadFloatingView$a(this));
       return;
    }
    public int q(){
       return 0x7f0a0c5d;
    }
    public int r(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotReloadFloatingView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (n.c(p0, 50.00f) / 3);
    }
    public int s(Context p0){
       return 0;
    }
}
