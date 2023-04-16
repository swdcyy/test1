package com.kuaishou.post.story.edit.decoration.text.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dq4.p;
import com.kuaishou.post.story.edit.decoration.text.a0;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import dq4.o;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager;
import java.lang.Integer;
import java.lang.Boolean;

public class b0 extends PresenterV2	// class@000adf
{
    public ImageView p;
    public StoryTextDataManager q;
    public StoryTextDrawer r;
    public int s;
    public boolean t;

    public void b0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "4")) {
          return;
       }
       this.P8();
       this.X7(this.r.observable().subscribe(new p(this), a0.b));
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, b0.class, "3");
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, b0.class, "6");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, b0.class, "5");
    }
    public final String P8(){
       String str;
       StoryTextDrawer obj = PatchProxy.apply(null, this, b0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       if (this.r.getTextMode() == 2) {
          this.p.setEnabled(false);
          this.p.setAlpha(0x3f000000);
       }else {
          this.p.setEnabled(b);
          this.p.setAlpha(0x3f800000);
       }
       obj = this.r.mTextBackgroundStyle;
       if (obj != b) {
          if (obj != 2) {
             this.p.setImageResource(R.drawable.arg_RES_7f080ed4);
             str = "no_text_padding";
          }else {
             this.p.setImageResource(R.drawable.arg_RES_7f080ed3);
             str = "full_text_padding";
          }
       }else {
          this.p.setImageResource(R.drawable.arg_RES_7f080ed2);
          str = "half_text_padding";
       }
       return str;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3dfb);
       m1.a(p0, new o(this), R.id.text_background_switch);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.q = this.r8("STORY_TEXT_DATA_MANAGER");
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.s = this.r8("LOGGER_ACTION").intValue();
       this.t = this.r8("IS_ENABLE_SAVE_TEXT_BACKGROUND_STYLE").booleanValue();
       return;
    }
}
