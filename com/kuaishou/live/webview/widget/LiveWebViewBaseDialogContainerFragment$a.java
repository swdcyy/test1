package com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment$a;
import gy2.b$a;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class LiveWebViewBaseDialogContainerFragment$a implements b$a	// class@001016
{
    public final c a;
    public final String b;
    public final LiveWebViewBaseDialogContainerFragment c;

    public void LiveWebViewBaseDialogContainerFragment$a(LiveWebViewBaseDialogContainerFragment p0,c p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, LiveWebViewBaseDialogContainerFragment$a.class, "1")) {
          return;
       }
       LiveWebViewBaseDialogContainerFragment.Nh(this.c, this.a, this.b);
       return;
    }
}
