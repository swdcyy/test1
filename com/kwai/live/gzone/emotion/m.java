package com.kwai.live.gzone.emotion.m;
import al5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.emotion.k;
import yk5.e;
import y47.h;
import y47.i;
import lnc.l1;
import uk5.r;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.live.gzone.emotion.m$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.live.gzone.emotion.m$b;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kwai.live.gzone.emotion.m$c;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$c;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import com.kwai.emotionsdk.widget.CommonEmotionPopupWindow;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import y47.a;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import xk5.c;

public class m extends a	// class@000cee
{
    public e p;
    public ViewGroup q;
    public a r;
    public EmojiEditText s;
    public EmotionPanelConfig t;
    public c u;
    public EmotionLongClickRecyclerView v;
    public GridLayoutManager w;
    public k x;
    public CommonEmotionPopupWindow y;
    public float z;
    public static long A;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       k ok = new k(this.p.e());
       this.x = ok;
       ok.x = new h(this);
       ok.y = new i(this);
       int i = (l1.a())? 8: r.a(0);
       this.w = new GridLayoutManager(this.getContext(), i);
       this.x.W0(this.p.f());
       this.v.setLayoutManager(this.w);
       this.v.setAdapter(this.x);
       this.v.addItemDecoration(new m$a(this));
       this.w.m1(new m$b(this));
       this.v.setOnLongClickPreviewListener(new m$c(this));
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       m ty = this.y;
       if (ty != null) {
          ty.Ug();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a34da);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("EMOTION_PAGE_MODEL");
       this.q = this.r8("container_view");
       this.r = this.r8("emotion_click");
       this.s = this.r8("EMOJI_EDIT_TEXT");
       this.t = this.r8("EMOTION_PANEL_CONFIG");
       this.u = this.r8("EMOTION_INTERACT_CALLBACK");
       return;
    }
}
