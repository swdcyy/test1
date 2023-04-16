package com.kuaishou.post.story.edit.decoration.text.s0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.decoration.text.s0$a;
import com.kuaishou.post.story.widget.TextColorView;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dq4.c0;
import com.kuaishou.post.story.edit.decoration.text.r0;
import erd.g;
import crd.b;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import java.lang.Integer;
import ekd.m1;
import dq4.b0;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;

public class s0 extends PresenterV2	// class@000b16
{
    public TextColorView p;
    public s0$a q;
    public StoryTextDrawer r;
    public Integer s;
    public Integer t;
    public int u;
    public String v;
    public int w;

    public void s0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s0.class, "3")) {
          return;
       }
       this.p.setTextColor(this.q);
       this.X7(this.r.observable().subscribe(new c0(this), r0.b));
       FrameLayout$LayoutParams layoutParams = this.p.getLayoutParams();
       int i = (!this.t.intValue())? 0: this.s.intValue();
       layoutParams.leftMargin = i;
       layoutParams.rightMargin = this.s.intValue();
       this.p.setLayoutParams(layoutParams);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3e01);
       m1.a(p0, new b0(this), R.id.text_color_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s0.class, "1")) {
          return;
       }
       this.q = this.q8(s0$a.class);
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.s = this.r8("STORY_TEXT_COLOR_ITEM_MARGIN");
       this.t = this.q8(Integer.class);
       this.u = this.r8("LOGGER_ACTION").intValue();
       this.v = this.r8("MOOD_CURRENT_PAGE");
       this.w = this.r8("STORY_SOURCE").intValue();
       return;
    }
}
