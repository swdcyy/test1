package com.kuaishou.post.story.edit.decoration.text.v;
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
import dq4.j;
import com.kuaishou.post.story.edit.decoration.text.u;
import erd.g;
import crd.b;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryEditText;
import dq4.i;
import android.view.View$OnClickListener;
import java.lang.Integer;

public class v extends PresenterV2	// class@000b1b
{
    public ImageView p;
    public StoryEditText q;
    public StoryTextDrawer r;
    public int s;

    public void v(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       this.P8();
       this.q.setGravity(f.a(this.r.getAlignment(), this.r.getTextMode()));
       this.X7(this.r.observable().subscribe(new j(this), u.b));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       if (this.r.getTextMode() == 1) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
       }
       int alignment = this.r.getAlignment();
       if (alignment != 5) {
          if (alignment != 17) {
             this.p.setImageResource(R.drawable.arg_RES_7f082381);
          }else {
             this.p.setImageResource(R.drawable.arg_RES_7f082380);
          }
       }else {
          this.p.setImageResource(R.drawable.arg_RES_7f082382);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3df7);
       this.q = m1.f(p0, 0x7f0a3e20);
       m1.a(p0, new i(this), R.id.text_alignment_switch);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.s = this.r8("LOGGER_ACTION").intValue();
       return;
    }
}
