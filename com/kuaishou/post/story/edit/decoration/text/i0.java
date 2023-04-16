package com.kuaishou.post.story.edit.decoration.text.i0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import rp4.n;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import android.widget.Button;
import android.graphics.Typeface;
import com.kuaishou.post.story.widget.StoryEditText;
import ekd.m1;
import android.widget.ImageView;
import dq4.u;
import android.view.View$OnClickListener;
import java.lang.Integer;

public class i0 extends PresenterV2	// class@000aff
{
    public View p;
    public Button q;
    public StoryEditText r;
    public ImageView s;
    public ImageView t;
    public StoryTextDrawer u;
    public int v;
    public int w;
    public static final int x;
    public static final int y;

    static {
       i0.x = a1.e(8.00f);
       i0.y = a.a().a().getResources().getColor(0x7f060658);
    }
    public void i0(){
       super();
       this.w = 0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "3")) {
          return;
       }
       n.a(this.p);
       i0 tu = this.u;
       if (tu != null) {
          this.w = tu.getTextMode();
          this.P8();
       }
       return;
    }
    public final void P8(){
       i0 oi0 = i0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi0, "5")) {
          return;
       }
       i0 tw = this.w;
       int i = 0;
       if (tw != null) {
          if (tw != 1) {
             if (tw == 2 && !PatchProxy.applyVoid(objArray, this, oi0, "8")) {
                this.q.setText(R.string.arg_RES_7f104af1);
                this.q.setTypeface(Typeface.DEFAULT);
                this.q.setShadowLayer((float)i0.x, 0, 0, i0.y);
                this.r.setTextMode(2);
             }
          }else if(PatchProxy.applyVoid(objArray, this, oi0, "7")){
             this.q.setText(R.string.arg_RES_7f104af2);
             this.q.setTypeface(Typeface.DEFAULT_BOLD);
             this.q.setShadowLayer(0, 0, 0, i);
             this.r.setTextMode(1);
          }
       }else if(PatchProxy.applyVoid(objArray, this, oi0, "6")){
          this.q.setText(R.string.arg_RES_7f104af0);
          this.q.setTypeface(Typeface.DEFAULT);
          this.q.setShadowLayer(0, 0, 0, i);
          this.r.setTextMode(i);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3e27);
       this.p = m1.f(p0, 0x7f0a3fdf);
       this.s = m1.f(p0, 0x7f0a3df7);
       this.t = m1.f(p0, 0x7f0a3dfb);
       this.r = m1.f(p0, 0x7f0a3e20);
       m1.a(p0, new u(this), R.id.text_mode_switch);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       this.u = this.r8("STORY_TEXT_DRAWER");
       this.v = this.r8("LOGGER_ACTION").intValue();
       return;
    }
}
