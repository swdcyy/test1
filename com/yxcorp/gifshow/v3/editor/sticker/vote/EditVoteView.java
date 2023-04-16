package com.yxcorp.gifshow.v3.editor.sticker.vote.EditVoteView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.m1;
import android.widget.FrameLayout;
import vtc.a;
import android.view.View$OnClickListener;
import vtc.b;
import vtc.c;
import vtc.d;
import vtc.e;
import vtc.f;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.n;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.sticker.vote.EditVoteView$a;

public class EditVoteView extends RelativeLayout implements d	// class@0012c5
{
    public FrameLayout b;
    public VoteTextView c;
    public VoteTextView d;
    public VoteTextView e;
    public boolean f;
    public boolean g;
    public EditVoteView$a h;
    public View i;
    public static final int j;

    public void EditVoteView(Context p0){
       super(p0, null);
    }
    public void EditVoteView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void EditVoteView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteView.class, "2")) {
       }else {
          this.doBindView(a.d(p0, R.layout.arg_RES_7f0d07a9, this, true));
          this.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       }
       return;
    }
    public void d(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteView.class, "6")) {
          return;
       }
       if (p0.getId() == 0x7f0a33a4) {
          this.e(this.c);
       }else if(p0.getId() == 0x7f0a2ef9){
          this.e(this.d);
       }else if(p0.getId() == 0x7f0a2efc){
          this.e(this.e);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditVoteView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.f != null) {
          return super.dispatchTouchEvent(p0);
       }
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a33ad);
       this.d = m1.f(p0, 0x7f0a2ef8);
       this.e = m1.f(p0, 0x7f0a2efb);
       this.b = m1.f(p0, 0x7f0a33a4);
       m1.a(p0, new a(this), R.id.question_text);
       m1.a(p0, new b(this), R.id.options_left);
       m1.a(p0, new c(this), R.id.options_right);
       m1.a(p0, new d(this), R.id.question_container);
       m1.a(p0, new e(this), R.id.options_left_container);
       m1.a(p0, new f(this), R.id.options_right_container);
       return;
    }
    public void e(VoteTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteView.class, "5")) {
          return;
       }
       if (this.g != null && !PatchProxy.applyVoidOneRefs(p0, this, EditVoteView.class, "8")) {
          p0.setFocusable(true);
          p0.setFocusableInTouchMode(true);
          p0.requestFocus();
          p0.setSelection(p0.getText().length());
          n.b0(p0.getContext(), p0, false);
          this.i = p0;
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(EditVoteView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditVoteView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          EditVoteView th = this.h;
          if (th != null) {
             th.a();
          }
       }
       return;
    }
    public void setAllowDispatchTouchEvent(boolean p0){
       this.f = p0;
    }
    public void setCallback(EditVoteView$a p0){
       this.h = p0;
    }
}
