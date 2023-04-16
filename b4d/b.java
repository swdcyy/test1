package b4d.b;
import android.view.View$OnKeyListener;
import com.yxcorp.gifshow.widget.s$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.EditText;
import com.yxcorp.gifshow.widget.KwaiURLSpan;
import java.lang.Math;
import java.lang.Exception;
import java.lang.Integer;
import android.view.View;
import ekd.m1;
import tyc.l2;
import android.text.SpanWatcher;
import tyc.m2;
import android.text.Editable$Factory;
import android.view.KeyEvent;

public class b extends PresenterV2 implements View$OnKeyListener, s$a	// class@000359
{
    public EmojiEditText p;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.d(this);
          this.p.setOnDeleteKeyListener(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          tp.k(this);
          this.p.setOnDeleteKeyListener(null);
       }
       return;
    }
    public final boolean P8(){
       int spanEnd;
       int i1;
       int i3;
       b obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       if (obj == null) {
          return false;
       }
       Editable text = obj.getText();
       if (text != null && !TextUtils.isEmpty((this.p.getText().toString()).trim())) {
          int selectionEnd = this.p.getSelectionEnd();
          if (this.p.getSelectionStart() == selectionEnd) {
             KwaiURLSpan[] spans = text.getSpans(false, text.length(), KwaiURLSpan.class);
             int len = spans.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject = spans[i];
                   spanEnd = text.getSpanEnd(oobject);
                   i1 = (selectionEnd == spanEnd)? 1: 0;
                   int i2 = selectionEnd - spanEnd;
                   if (Math.abs(i2) == 1) {
                      i1 = selectionEnd - 1;
                      i1 = this.R8(text, i1, selectionEnd);
                   }
                   if (i1 && Math.abs(i2) <= 1) {
                      try{
                         i1 = text.getSpanStart(oobject);
                         KwaiURLSpan n = oobject.n;
                         String str = text.subSequence(i1, spanEnd).toString();
                         if (n != null && (str.trim()).equals(n.trim())) {
                            if (i1 == 1) {
                               i3 = i1 - 1;
                               if (this.R8(text, i3, i1)) {
                                  i1 = i3;
                               }
                            }
                            if (spanEnd < (text.toString()).length()) {
                               i3 = spanEnd + 1;
                               if (this.R8(text, spanEnd, i3)) {
                                  spanEnd = i3;
                                  break ;
                               }
                            }
                            break ;
                         }
                      }catch(java.lang.Exception e6){
                         e6.printStackTrace();
                      }
                   }
                }
             }
             this.p.setSelection(i1, spanEnd);
             return true;
          }
       }
       return false;
    }
    public final boolean R8(Editable p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return (" ").equals((p0.toString()).substring(p1, p2));
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       EmojiEditText uEmojiEditTe = m1.f(p0, R.id.editor);
       this.p = uEmojiEditTe;
       SpanWatcher[] spanWatcherA = new SpanWatcher[]{new m2(KwaiURLSpan.class)};
       uEmojiEditTe.setEditableFactory(new l2(spanWatcherA));
       return;
    }
    public boolean k7(int p0,int p1){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, b.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 1 && !p1) {
          return this.P8();
       }else {
          return false;
       }
    }
    public boolean onKey(View p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 67 && !p2.getAction()) {
          return this.P8();
       }else {
          return false;
       }
    }
}
