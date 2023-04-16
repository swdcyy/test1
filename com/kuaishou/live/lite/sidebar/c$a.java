package com.kuaishou.live.lite.sidebar.c$a;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import fd3.j;
import ec3.f;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler;
import msd.a;
import com.kuaishou.live.lite.performance.LiveLiteViewRecycler$a;
import ekd.m1;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;

public class c$a	// class@000b47
{
    public View a;
    public TextView b;
    public KwaiImageView c;
    public KwaiImageView d;
    public RelativeLayout e;
    public View f;
    public LiveLiteViewRecycler$a g;

    public void c$a(Context p0,boolean p1){
       View view;
       super();
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          view = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2");
          if (view != PatchProxyResult.class) {
          }else {
          label_001c :
             j oj = new j(p1, p0);
             String str = (p1)? "SIDEBAR_SIMPLE_ITEM_BOTTOM": "SIDEBAR_SIMPLE_ITEM_NORMAL";
             if (f.h() && f.e()) {
                LiveLiteViewRecycler$a uoa1 = LiveLiteViewRecycler.d.a(str, oj);
                this.g = uoa1;
                view = uoa1.getView();
             }else {
                view = oj.invoke();
             }
          }
       }else {
          goto label_001c ;
       }
       this.a = view;
       if (p1) {
          this.e = m1.f(view, 0x7f0a2583);
          this.c = m1.f(this.a, 0x7f0a2585);
          this.d = m1.f(this.a, 0x7f0a2584);
          this.f = this.e;
       }else {
          this.b = m1.f(view, 0x7f0a257e);
          this.c = m1.f(this.a, 0x7f0a257c);
          this.d = m1.f(this.a, 0x7f0a257a);
          this.f = this.c;
       }
       return;
    }
}
