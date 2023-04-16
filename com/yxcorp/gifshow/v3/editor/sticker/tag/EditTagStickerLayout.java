package com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.EditStickerBackgroundView;
import stc.a;
import itc.t;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout$a;
import qvc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.widget.EditText;
import java.util.Objects;
import java.util.List;
import android.view.MotionEvent;
import java.lang.CharSequence;
import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import android.widget.AbsoluteLayout$LayoutParams;
import android.graphics.RectF;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class EditTagStickerLayout extends RelativeLayout	// class@0012b2
{
    public final String b;
    public EditStickerBackgroundView c;
    public final EditTagStickerEditText d;
    public HashMap e;

    public void EditTagStickerLayout(Context p0,EditTagStickerEditText p1){
       a.p(p0, "context");
       a.p(p1, "mEditText");
       super(p0);
       this.d = p1;
       this.b = "EditTagStickerLayout";
       EditStickerBackgroundView uEditSticker = new EditStickerBackgroundView(new a(0, 0), p0);
       this.c = uEditSticker;
       this.addView(uEditSticker, new RelativeLayout$LayoutParams(-1, -1));
       this.addView(p1, new RelativeLayout$LayoutParams(-1, -1));
       this.g();
       p1.a(new EditTagStickerLayout$a(this));
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerLayout.class, "6")) {
          return;
       }
       a.p(p0, "watcher");
       this.d.a(p0);
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerLayout.class, "5")) {
          return;
       }
       a.p(p0, "canvas");
       this.c.draw(p0);
       this.d.e(0);
       this.d.draw(p0);
       EditTagStickerEditText.f(this.d, 0, 1, null);
       return;
    }
    public final void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerLayout.class, "7")) {
          return;
       }
       String str = "watcher";
       a.p(p0, str);
       EditTagStickerLayout td = this.d;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(p0, td, EditTagStickerEditText.class, "2")) {
          a.p(p0, str);
          td.f.remove(p0);
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerLayout.class, "10")) {
          return;
       }
       this.d.onTouchEvent(MotionEvent.obtain(0, 0, 3, 0, 0, 0));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerLayout.class, "2")) {
          return;
       }
       this.d.setSelection(0);
       return;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerLayout.class, "4")) {
          return;
       }
       a.p(p0, "newString");
       this.d.setText(p0);
       EditTagStickerLayout td = this.d;
       Editable text = td.getText();
       int i = (text != null)? text.length(): 0;
       td.setSelection(i);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerLayout.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new AbsoluteLayout$LayoutParams((int)this.d.getContentRect().width(), (int)this.d.getContentRect().height(), 0, 0);
       }
       layoutParams.width = (int)this.d.getContentRect().width();
       layoutParams.height = (int)this.d.getContentRect().height();
       this.setLayoutParams(layoutParams);
       EditTagStickerLayout tc = this.c;
       float f = this.d.getContentRect().width();
       float f1 = this.d.getContentRect().height();
       Objects.requireNonNull(tc);
       if (!PatchProxy.isSupport(EditStickerBackgroundView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(f1), tc, EditStickerBackgroundView.class, "2")) {
          tc.c.b(f, f1);
       }
       return;
    }
    public final RectF getContentRect(){
       Object obj = PatchProxy.apply(null, this, EditTagStickerLayout.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getContentRect();
    }
    public final EditTagStickerEditText getMEditText(){
       return this.d;
    }
    public void setAcceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(EditTagStickerLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditTagStickerLayout.class, "8")) {
          return;
       }
       if (!p0) {
          this.d.clearFocus();
          this.d.setFocusable(false);
          this.d.setFocusableInTouchMode(false);
       }
       this.d.setEnabled(p0);
       return;
    }
}
