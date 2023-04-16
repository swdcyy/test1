package com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.library.widget.edittext.SafeEditText;
import android.content.Context;
import com.yxcorp.gifshow.widget.EmojiEditText$b;
import com.yxcorp.gifshow.widget.s;
import android.view.inputmethod.InputConnection;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.EmojiEditText$a;
import android.text.TextWatcher;
import android.widget.EditText;
import android.text.Editable;
import android.view.View$OnKeyListener;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import k2b.u1;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.widget.EmojiEditText$d;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.Boolean;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.widget.AppCompatEditText;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.KeyEvent;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.EmojiEditText$c;
import android.view.View;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.widget.s$a;
import android.widget.TextView$BufferType;
import com.yxcorp.gifshow.widget.m0;

public class EmojiEditText extends SafeEditText	// class@001835
{
    public boolean i;
    public KSTextDisplayHandler j;
    public List k;
    public List l;
    public List m;
    public final EmojiEditText$b n;
    public s o;

    public void EmojiEditText(Context p0){
       super(p0);
       this.n = new EmojiEditText$b();
       this.o = new s(null, true);
       this.g();
    }
    public void EmojiEditText(Context p0,AttributeSet p1){
       super(p0, p1);
       this.n = new EmojiEditText$b();
       this.o = new s(null, true);
       this.g();
    }
    public void EmojiEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.n = new EmojiEditText$b();
       this.o = new s(null, true);
       this.g();
    }
    private void g(){
       if (PatchProxy.applyVoid(null, this, EmojiEditText.class, "1")) {
          return;
       }
       KSTextDisplayHandler kSTextDispla = new KSTextDisplayHandler(this);
       this.j = kSTextDispla;
       kSTextDispla.r = false;
       this.addTextChangedListener(new EmojiEditText$a(this));
       if (this.getText() != null && this.getText().length() > 0) {
          this.j.a(this.getText());
       }
       this.setOnKeyListener(this.n);
       return;
    }
    public void append(CharSequence p0,int p1,int p2){
       if (PatchProxy.isSupport(EmojiEditText.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, EmojiEditText.class, "13")) {
          return;
       }
       super.append(p0, p1, p2);
       return;
    }
    public void d(View$OnKeyListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "24")) {
          return;
       }
       EmojiEditText tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidOneRefs(p0, tn, EmojiEditText$b.class, "1")) {
          tn.b.add(p0);
       }
       return;
    }
    public void e(EmojiEditText$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "18")) {
          return;
       }
       this.getOnPasteListeners().add(p0);
       return;
    }
    public void f(EmojiEditText$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "6")) {
          return;
       }
       this.getOnSelectionChangedListeners().add(p0);
       return;
    }
    public KSTextDisplayHandler getKSTextDisplayHandler(){
       return this.j;
    }
    public final List getOnKeyPreImeListeners(){
       Object obj = PatchProxy.apply(null, this, EmojiEditText.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k == null) {
          this.k = new ArrayList();
       }
       return this.k;
    }
    public final List getOnPasteListeners(){
       Object obj = PatchProxy.apply(null, this, EmojiEditText.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m == null) {
          this.m = new ArrayList();
       }
       return this.m;
    }
    public final List getOnSelectionChangedListeners(){
       Object obj = PatchProxy.apply(null, this, EmojiEditText.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.l == null) {
          this.l = new ArrayList();
       }
       return this.l;
    }
    public void h(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "14")) {
          return;
       }
       this.i(p0, Boolean.FALSE);
       return;
    }
    public void i(CharSequence p0,Boolean p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmojiEditText.class, "15")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       int selectionSta = this.getSelectionStart();
       int selectionEnd = this.getSelectionEnd();
       if (selectionEnd < 0) {
          selectionEnd = selectionSta;
       }else if(selectionEnd < selectionSta){
          selectionEnd = selectionSta;
          selectionSta = selectionEnd;
       }
       if (!this.hasFocus() && (!selectionSta && !selectionEnd)) {
          this.append(p0);
       }else if(p1.booleanValue() && this.getText() != null){
          this.getText().insert(selectionSta, p0);
       }else {
          this.getText().replace(selectionSta, selectionEnd, p0);
       }
       return;
    }
    public boolean j(){
       return this.i;
    }
    public void k(View$OnKeyListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "25")) {
          return;
       }
       EmojiEditText tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoidOneRefs(p0, tn, EmojiEditText$b.class, "2")) {
          tn.b.remove(p0);
       }
       return;
    }
    public void l(EmojiEditText$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "7")) {
          return;
       }
       this.getOnSelectionChangedListeners().remove(p0);
       return;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       EmojiEditText obj = PatchProxy.applyOneRefs(p0, this, EmojiEditText.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null || obj.a == null) {
          return super.onCreateInputConnection(p0);
       }
       obj.setTarget(super.onCreateInputConnection(p0));
       return this.o;
    }
    public boolean onKeyPreIme(int p0,KeyEvent p1){
       Iterator obj;
       if (PatchProxy.isSupport(EmojiEditText.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, EmojiEditText.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getOnKeyPreImeListeners().iterator();
       boolean b = false;
    label_0028 :
       int i = 0;
       while (true) {
          if (obj.hasNext()) {
             if (obj.next().a(this, p0, p1) || i) {
                i = 1;
             }else {
                goto label_0028 ;
             }
          }else if(i || super.onKeyPreIme(p0, p1)){
             b = true;
             break ;
          }
          break ;
       }
       return b;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(EmojiEditText.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EmojiEditText.class, "10")) {
          return;
       }
       try{
          super.onMeasure(p0, p1);
       }catch(java.lang.IndexOutOfBoundsException e0){
          String str = this.getText().toString();
          try{
             this.setText(str);
             super.onMeasure(p0, p1);
          }catch(java.lang.IndexOutOfBoundsException e0){
             this.setText("");
             super.onMeasure(p0, p1);
          }
       }
       return;
    }
    public void onSelectionChanged(int p0,int p1){
       if (PatchProxy.isSupport(EmojiEditText.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EmojiEditText.class, "9")) {
          return;
       }
       EmojiEditText tj = this.j;
       if (tj != null && tj.i != null) {
          return;
       }
       super.onSelectionChanged(p0, p1);
       List onSelectionC = this.getOnSelectionChangedListeners();
       if (!onSelectionC.isEmpty()) {
          Iterator iterator = onSelectionC.iterator();
          while (iterator.hasNext()) {
             EmojiEditText$e uoe = iterator.next();
             if (uoe != null) {
                uoe.a(p0, p1);
             }
          }
       }
       return;
    }
    public boolean onTextContextMenuItem(int p0){
       Iterator obj;
       if (PatchProxy.isSupport(EmojiEditText.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EmojiEditText.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 0x1020022) {
          obj = this.getOnPasteListeners().iterator();
          while (obj.hasNext()) {
             obj.next().a(this);
          }
          this.i = true;
       }
       try{
          return super.onTextContextMenuItem(p0);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public boolean performLongClick(){
       Object obj = PatchProxy.apply(null, this, EmojiEditText.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.performLongClick();
    }
    public void setHintWithEmoji(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "17")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          this.setHint(p0);
          return;
       }else {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(p0);
          this.j.a(spannableStr);
          this.setHint(spannableStr);
          return;
       }
    }
    public void setKSTextDisplayHandler(KSTextDisplayHandler p0){
       this.j = p0;
    }
    public void setOnDeleteKeyListener(s$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText.class, "23")) {
          return;
       }
       this.o.a = p0;
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmojiEditText.class, "12")) {
          return;
       }
       EmojiEditText tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(null, tj, KSTextDisplayHandler.class, "17")) {
             KSTextDisplayHandler t = tj.t;
             Objects.requireNonNull(t);
             if (!PatchProxy.applyVoid(null, t, m0.class, "6")) {
                t.a();
             }
          }
       }
       super.setText(p0, p1);
       return;
    }
}
