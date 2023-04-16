package com.kuaishou.post.story.edit.decoration.text.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dq4.n;
import com.kuaishou.post.story.edit.decoration.text.y;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import dq4.m;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import java.lang.Integer;
import java.lang.Boolean;

public class z extends PresenterV2	// class@000b1f
{
    public ImageView p;
    public StoryTextDataManager q;
    public StoryTextDrawer r;
    public int s;
    public boolean t;

    public void z(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       this.P8();
       this.X7(this.r.observable().subscribe(new n(this), y.b));
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, z.class, "3");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, z.class, "6");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, z.class, "5");
    }
    public final String P8(){
       String str;
       StoryTextDrawer obj = PatchProxy.apply(null, this, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 2;
       if (this.r.getTextMode() == i) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
       }
       obj = this.r.mTextBackgroundStyle;
       if (obj != 1) {
          if (obj != i) {
             this.p.setImageResource(R.drawable.arg_RES_7f082386);
             str = "no_text_padding";
          }else {
             this.p.setImageResource(R.drawable.arg_RES_7f082385);
             str = "full_text_padding";
          }
       }else {
          this.p.setImageResource(R.drawable.arg_RES_7f082387);
          str = "half_text_padding";
       }
       return str;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3dfb);
       m1.a(p0, new m(this), R.id.text_background_switch);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.q = this.r8("STORY_TEXT_DATA_MANAGER");
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.s = this.r8("LOGGER_ACTION").intValue();
       this.t = this.r8("IS_ENABLE_SAVE_TEXT_BACKGROUND_STYLE").booleanValue();
       return;
    }
}
