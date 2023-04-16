package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$b;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$c;
import java.lang.Object;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ag6.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeView;
import md1.e;
import android.view.View$OnClickListener;

public class e$b implements b	// class@00100f
{
    public final LiveSubscribeAnchorNoticeInfo b;
    public final e$c c;
    public LiveSubscribeAnchorNoticeView d;

    public void e$b(LiveSubscribeAnchorNoticeInfo p0,e$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       f.c(this);
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       f.d(this);
    }
    public View getView(){
       return this.d;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$b.class, "1")) {
          return;
       }
       LiveSubscribeAnchorNoticeView liveSubscrib = a.c(p0, R.layout.arg_RES_7f0d0a9a, p1, false);
       this.d = liveSubscrib;
       liveSubscrib.c(this.b);
       if (this.c != null) {
          this.d.setRightButtonOnClickListener(new e(this));
       }
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
