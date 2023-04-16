package com.kuaishou.post.story.edit.decoration.text.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import dq4.f;
import android.widget.EditText;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dq4.l;
import com.kuaishou.post.story.edit.decoration.text.w;
import erd.g;
import crd.b;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryEditText;
import dq4.k;
import android.view.View$OnClickListener;
import java.lang.Integer;

public class x extends PresenterV2	// class@000b1d
{
    public ImageView p;
    public StoryEditText q;
    public StoryTextDrawer r;
    public int s;

    public void x(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       this.P8();
       this.q.setGravity(f.a(this.r.getAlignment(), this.r.getTextMode()));
       this.X7(this.r.observable().subscribe(new l(this), w.b));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, x.class, "5")) {
          return;
       }
       boolean b = true;
       if (this.r.getTextMode() == b) {
          this.p.setEnabled(false);
          this.p.setAlpha(0x3f000000);
       }else {
          this.p.setEnabled(b);
          this.p.setAlpha(0x3f800000);
       }
       int alignment = this.r.getAlignment();
       if (alignment != 5) {
          if (alignment != 17) {
             this.p.setImageResource(R.drawable.arg_RES_7f080ed0);
          }else {
             this.p.setImageResource(R.drawable.arg_RES_7f080ecf);
          }
       }else {
          this.p.setImageResource(R.drawable.arg_RES_7f080ed1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3df7);
       this.q = m1.f(p0, 0x7f0a3e20);
       m1.a(p0, new k(this), R.id.text_alignment_switch);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.s = this.r8("LOGGER_ACTION").intValue();
       return;
    }
}
