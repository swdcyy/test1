package com.kuaishou.post.story.edit.decoration.text.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.edit.decoration.text.f0$a;
import com.kuaishou.post.story.edit.decoration.text.f0$b;
import com.kuaishou.post.story.edit.decoration.text.f0$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dq4.q;
import com.kuaishou.post.story.edit.decoration.text.d0;
import erd.g;
import crd.b;
import brd.t;
import vp4.b;
import dq4.r;
import com.kuaishou.post.story.edit.decoration.text.e0;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import com.kuaishou.post.story.widget.StoryHollowTextView;
import lnc.a1;
import rp4.b;
import tp4.v;
import rp4.a;
import q87.c;
import android.util.Pair;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment$d;
import com.kuaishou.post.story.edit.decoration.text.StoryEditTextFragment;
import android.view.View;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryEditText;
import android.view.View$OnClickListener;
import java.lang.Integer;

public class f0 extends PresenterV2	// class@000aeb
{
    public String A;
    public int B;
    public View$OnClickListener C;
    public u D;
    public View$OnClickListener E;
    public StoryEditText p;
    public TextView q;
    public StoryTextDrawer r;
    public StoryTextDrawer s;
    public StoryEditTextFragment t;
    public PublishSubject u;
    public StoryEditTextFragment$d v;
    public b w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void f0(){
       super();
       this.x = false;
       this.C = new f0$a(this);
       this.D = new f0$b(this, 2000);
       this.E = new f0$c(this);
    }
    public void E8(){
       f0 uof0 = f0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof0, "3")) {
          return;
       }
       this.X7(this.u.subscribe(new q(this), d0.b));
       this.X7(this.w.b.subscribe(new r(this), e0.b));
       if (this.z == null) {
          this.q.setEnabled((TextUtils.isEmpty(this.s.mText) ^ 0x01));
          f0 tq = this.q;
          if (tq instanceof StoryHollowTextView) {
             if (TextUtils.isEmpty(this.s.mText)) {
                this.q.setHollowBackgroundColor(a1.a(R.color.arg_RES_7f061c3b));
             }else {
                this.q.setHollowBackgroundColor(a1.a(R.color.arg_RES_7f061c32));
             }
          }else if(tq.isEnabled()){
             this.q.setAlpha(0x3f800000);
          }else {
             this.q.setAlpha(0x3f000000);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uof0, "4") && this.B == 2) {
          if (("PRODUCE_MOOD_PHOTO").equals(this.A)) {
             this.q.setText(R.string.arg_RES_7f1036aa);
          }else {
             this.q.setText(R.string.arg_RES_7f100f6b);
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "6")) {
          return;
       }
       if (this.B == 2) {
          b.g("MOOD_TEXT_NEXT", this.A, "");
          if (v.b.b() && (this.s != null && this.x != null)) {
             Object[] objArray = new Object[0];
             a.D().w("StoryTextEditDonePresenter", "onCompleteTextEdit prepare loading", objArray);
             this.w.a.onNext(new Pair(this.s, Boolean.TRUE));
             return;
          }
       }
       this.v.b = 1;
       this.t.cancel();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3e11);
       this.p = m1.f(p0, 0x7f0a3e20);
       m1.a(p0, this.C, R.id.text_edit_complete_button);
       m1.a(p0, this.D, R.id.click_cancel_view);
       m1.a(p0, this.E, R.id.text_edit_cancel_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       this.r = this.r8("BACKUP_STORY_TEXT_DRAWER");
       this.s = this.r8("STORY_TEXT_DRAWER");
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("TEXT_EDIT_COMPLETE_PUBLISHER");
       this.v = this.r8("STORY_TEXT_INPUT_DONE_PARAM");
       this.y = this.r8("STORY_ENABLE_TEXT_SHADOW").booleanValue();
       this.z = this.r8("ENABLE_COMPLETE_BUTTON_IF_EMPTY_TEXT").booleanValue();
       this.A = this.r8("MOOD_CURRENT_PAGE");
       this.B = this.r8("STORY_SOURCE").intValue();
       this.w = this.r8("AI_VIDEO_PAGE_PRESENTER_MODEL");
       this.x = this.r8("MOOD_IS_IN_CAMERA_MOOD_TAB").booleanValue();
       return;
    }
}
