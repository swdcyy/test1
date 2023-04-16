package com.kuaishou.post.story.edit.decoration.text.h0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.post.story.edit.decoration.text.h0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import java.lang.CharSequence;
import android.widget.EditText;
import android.text.TextWatcher;
import com.kuaishou.post.story.widget.StoryEditText;
import dq4.s;
import com.kuaishou.post.story.widget.StoryEditText$d;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dq4.t;
import com.kuaishou.post.story.edit.decoration.text.g0;
import erd.g;
import crd.b;
import rp4.m;
import android.graphics.Paint;
import android.content.Context;
import android.app.Activity;
import dq4.f;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;
import java.util.Objects;
import qq4.e;
import android.graphics.RectF;
import java.lang.Math;
import android.graphics.Typeface;
import rp4.n;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;

public class h0 extends PresenterV2	// class@000afd
{
    public StoryEditText p;
    public TextView q;
    public StoryTextDrawer r;
    public Fragment s;
    public boolean t;
    public boolean u;
    public int v;
    public final TextWatcher w;

    public void h0(){
       super();
       this.v = 0;
       this.w = new h0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "4")) {
          return;
       }
       this.p.setText(this.r.mText);
       this.p.addTextChangedListener(this.w);
       h0 tp = this.p;
       s os = (tp.h != null)? 1: null;
       if (!os) {
          tp.setListener(new s(this));
       }
       this.P8();
       this.X7(this.r.observable().subscribe(new t(this), g0.b));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       this.p.setBackgroundRadius(m.c);
       this.p.setLayerType(1, null);
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, h0.class, "8");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "7")) {
          return;
       }
       this.p.removeTextChangedListener(this.w);
       return;
    }
    public final void P8(){
       h0 tp;
       float f;
       RectF rectF;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0.class, "6")) {
          return;
       }
       int i = 0;
       if (this.getContext() == null || this.getActivity() == null) {
          Object[] objArray1 = new Object[i];
          a.D().A("StoryTextInputPresenter", "context is "+this.getContext()+"getActivity is"+this.getActivity(), objArray1);
          return;
       }else {
          this.p.setGravity(f.a(this.r.getAlignment(), this.r.getTextMode()));
          int textMode = this.r.getTextMode();
          boolean b = true;
          if (textMode && textMode != b) {
             if (textMode != 2) {
                if (textMode == 3) {
                label_0076 :
                   tp = this.p;
                   Objects.requireNonNull(tp);
                   f = 0;
                   if (!PatchProxy.applyVoid(objArray, tp, StoryEditText.class, "8")) {
                      tp.l = i;
                      tp.setShadowLayer(f, f, f, i);
                   }
                   if (!f.e(this.r.mTextBackgroundStyle)) {
                      this.p.setBackgroundEnabled(b);
                      tp = this.p;
                      StoryTextDataManager$TextColors d = (f.f(this.r.mTextBackgroundStyle))? this.r.mTextColors.d: this.r.mTextColors.e;
                      tp.setBackgroundColor(d);
                      this.p.setTextColor(this.r.mTextColors.c);
                      rectF = new RectF((float)this.p.getPaddingLeft(), (float)this.p.getPaddingTop(), (float)this.p.getPaddingRight(), (float)this.p.getPaddingBottom());
                      this.p.setShadowLayer((float)(int)Math.max(Math.max(rectF.left, rectF.right), Math.max(rectF.top, rectF.bottom)), f, f, i);
                   }else {
                      this.p.setBackgroundEnabled(i);
                      this.p.setTextColor(this.r.mTextColors.b);
                      if (this.t != null) {
                         this.p.setShadowLayer((float)m.d, (float)m.e, (float)m.f, m.g);
                      }else {
                         rectF = new RectF((float)this.p.getPaddingLeft(), (float)this.p.getPaddingTop(), (float)this.p.getPaddingRight(), (float)this.p.getPaddingBottom());
                         this.p.setShadowLayer((float)(int)Math.max(Math.max(rectF.left, rectF.right), Math.max(rectF.top, rectF.bottom)), f, f, i);
                      }
                   }
                }
             }else {
                this.p.setTextColor(-1);
                this.p.setNeonShadowColor(this.r.mTextColors.g);
                tp = this.p;
                Objects.requireNonNull(tp);
                if (!PatchProxy.applyVoid(objArray, tp, StoryEditText.class, "9")) {
                   tp.i = i;
                   tp.f.k(i);
                   tp.f.j(i);
                   tp.invalidate();
                }
             }
          }else {
             goto label_0076 ;
          }
          if (f.g(this.r.getTextMode())) {
             this.p.setTypeface(n.g(this.r.mTextFontName));
          }else {
             this.p.setTypeface(Typeface.DEFAULT_BOLD);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a3e11);
       this.p = m1.f(p0, 0x7f0a3e20);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       this.r = this.r8("STORY_TEXT_DRAWER");
       this.t = this.r8("STORY_ENABLE_TEXT_SHADOW").booleanValue();
       this.u = this.r8("ENABLE_COMPLETE_BUTTON_IF_EMPTY_TEXT").booleanValue();
       this.s = this.r8("FRAGMENT");
       return;
    }
}
