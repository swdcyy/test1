package b4d.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import b4d.q$a;
import android.view.View$OnLongClickListener;
import android.widget.EditText;
import b4d.p;
import android.widget.TextView$OnEditorActionListener;
import b4d.q$b;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import b4d.q$c;
import android.text.InputFilter;
import java.util.Arrays;
import android.text.InputFilter$LengthFilter;
import android.widget.Scroller;
import android.app.Activity;
import android.content.Context;
import java.lang.CharSequence;
import java.lang.IndexOutOfBoundsException;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.HashSet;
import java.util.Collection;
import tyc.a1;
import android.widget.TextView;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import android.view.View;
import ekd.m1;
import brd.y;

public class q extends PresenterV2	// class@00038b
{
    public BaseEditorFragment$Arguments p;
    public EmotionFloatEditorFragment q;
    public EmotionFloatEditConfig r;
    public y s;
    public EmojiEditText t;
    public View u;
    public TextView v;
    public q$c w;

    public void q(){
       super();
    }
    public void E8(){
       q tp1;
       if (PatchProxy.applyVoid(null, this, q.class, "5")) {
          return;
       }
       KSTextDisplayHandler kSTextDispla = this.t.getKSTextDisplayHandler();
       q tp = this.p;
       boolean b = true;
       int b1 = (tp != null && tp.mShowUserAlias != null)? true: false;
       kSTextDispla.p(b1);
       this.t.getKSTextDisplayHandler().y = b;
       long l = 100;
       this.t.setOnLongClickListener(new q$a(this, l));
       BaseEditorFragment$Arguments mImeOptions = this.p.mImeOptions;
       if (mImeOptions >= null) {
          this.t.setImeOptions((mImeOptions | 0x10000000));
       }
       this.t.setOnEditorActionListener(new p(this));
       this.t.setOnClickListener(new q$b(this, false, l));
       this.t.addTextChangedListener(this.q);
       b1 = 4;
       if (this.r.getStyle() == b1) {
          q$c uoc = new q$c(this);
          this.w = uoc;
          this.t.addTextChangedListener(uoc);
          tp1 = this.p;
          if (tp1.mTextLimit <= null) {
             tp1.mTextLimit = 120;
          }
          this.t.setMaxLines(b1);
       }
       if (this.p.mTextLimit > null && this.r.getStyle() != b1) {
          InputFilter[] inputFilterA = Arrays.copyOf(this.t.getFilters(), (this.t.getFilters().length + b));
          inputFilterA[(inputFilterA.length - b)] = new InputFilter$LengthFilter(this.p.mTextLimit);
          this.t.setFilters(inputFilterA);
       }
       this.t.setSingleLine(this.p.mSingleLine);
       this.t.setInputType(this.p.mKeyboardType);
       if (this.p.mSingleLine == null) {
          if (this.r.getStyle() == b1) {
             this.t.setMaxLines(b1);
             this.t.setVerticalScrollBarEnabled(b);
          }else {
             this.t.setMaxLines(6);
             this.t.setVerticalScrollBarEnabled(false);
          }
          this.t.setScroller(new Scroller(this.getActivity()));
       }
       mImeOptions = this.p.mText;
       if (mImeOptions != null) {
          this.t.setText(mImeOptions);
          tp1 = this.p;
          if (tp1.mShowKeyBoardFirst != null) {
             try{
                this.t.setSelection(tp1.mText.length());
             }catch(java.lang.IndexOutOfBoundsException e0){
                e0.printStackTrace();
             }
          }else {
             this.t.setFocusable(false);
          }
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       this.t.setKSTextDisplayHandler(new a1(this.t));
       this.t.getKSTextDisplayHandler().o(3);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       q tw = this.w;
       if (tw != null) {
          this.t.removeTextChangedListener(tw);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, q.class, "6")) {
          return;
       }
       boolean b = true;
       this.t.setFocusable(b);
       this.t.setFocusableInTouchMode(b);
       q tt = this.t;
       try{
          tt.requestFocus();
          if (this.t.getText() != null) {
             tt = this.t;
             tt.setSelection(tt.getText().length());
          }
       }catch(java.lang.IndexOutOfBoundsException e0){
          e0.printStackTrace();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0ceb);
       this.t = m1.f(p0, 0x7f0a0ca8);
       this.v = m1.f(p0, 0x7f0a0cad);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.r8("args");
       this.q = this.r8("floateditor");
       this.r = this.r8("emotion_edit_float_config");
       this.s = this.r8("EDITOR_CLICK");
       return;
    }
}
