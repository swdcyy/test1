package com.kuaishou.post.story.widget.StoryEditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import qq4.e;
import com.kuaishou.post.story.widget.StoryEditText$a;
import android.text.TextPaint;
import qq4.d;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.graphics.Canvas;
import android.widget.TextView;
import com.kuaishou.post.story.widget.StoryEditText$b;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.post.story.widget.StoryEditText$d;
import rp4.m;
import android.view.ViewTreeObserver;
import com.kuaishou.post.story.widget.StoryEditText$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import dq4.f;
import android.text.Editable;

public class StoryEditText extends AppCompatEditText	// class@000b91
{
    public int e;
    public e f;
    public final TextWatcher g;
    public StoryEditText$d h;
    public boolean i;
    public final TextPaint j;
    public d k;
    public int l;

    public void StoryEditText(Context p0){
       super(p0);
       this.e = 0;
       this.f = new e();
       this.g = new StoryEditText$a(this);
       this.j = new TextPaint();
       this.k = new d();
       this.b();
    }
    public void StoryEditText(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 0;
       this.f = new e();
       this.g = new StoryEditText$a(this);
       this.j = new TextPaint();
       this.k = new d();
       this.b();
    }
    public void StoryEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 0;
       this.f = new e();
       this.g = new StoryEditText$a(this);
       this.j = new TextPaint();
       this.k = new d();
       this.b();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, StoryEditText.class, "11")) {
          return;
       }
       StoryEditText tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidOneRefs(this, tf, e.class, "2")) {
          tf.g(null, this);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, StoryEditText.class, "1")) {
          return;
       }
       this.addTextChangedListener(new StoryEditText$b(this));
       this.addTextChangedListener(this.g);
       return;
    }
    public e getBackgroundSpan(){
       return this.f;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryEditText.class, "10")) {
          return;
       }
       StoryEditText tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoidTwoRefs(p0, this, tf, e.class, "4")) {
          tf.g(p0, this);
       }
       super.onDraw(p0);
       return;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(StoryEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryEditText.class, "5")) {
          return;
       }
       this.f.j(p0);
       this.invalidate();
       return;
    }
    public void setBackgroundEnabled(boolean p0){
       if (PatchProxy.isSupport(StoryEditText.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StoryEditText.class, "4")) {
          return;
       }
       this.i = p0;
       this.f.k(p0);
       this.invalidate();
       return;
    }
    public void setBackgroundRadius(int p0){
       if (PatchProxy.isSupport(StoryEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryEditText.class, "6")) {
          return;
       }
       this.f.d = p0;
       this.invalidate();
       return;
    }
    public void setListener(StoryEditText$d p0){
       this.h = p0;
    }
    public void setNeonShadowColor(int p0){
       if (PatchProxy.isSupport(StoryEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryEditText.class, "7")) {
          return;
       }
       this.l = p0;
       this.setShadowLayer((float)m.o, 0, 0, p0);
       return;
    }
    public void setTextMode(int p0){
       if (PatchProxy.isSupport(StoryEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryEditText.class, "2")) {
          return;
       }
       if (!this.getWidth()) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new StoryEditText$c(this, p0));
       }else {
          this.setTextModeInner(p0);
       }
       return;
    }
    public void setTextModeInner(int p0){
       if (PatchProxy.isSupport(StoryEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, StoryEditText.class, "3")) {
          return;
       }
       this.e = p0;
       if (f.d(p0)) {
          this.setGravity(17);
       }
       p0.a = f.d(this.e);
       p0 = (this.getWidth() - (m.m * 2)) - (m.c * 2);
       StoryEditText tk = this.k;
       Editable text = this.getText();
       TextPaint paint = this.getPaint();
       float lineSpacingM = this.getLineSpacingMultiplier();
       float lineSpacingE = this.getLineSpacingExtra();
       int i = (p0 > 0)? p0: Integer.MAX_VALUE;
       tk.a(text, paint, lineSpacingM, lineSpacingE, i);
       this.invalidate();
       return;
    }
}
