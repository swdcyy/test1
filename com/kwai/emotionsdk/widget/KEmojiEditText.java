package com.kwai.emotionsdk.widget.KEmojiEditText;
import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.text.method.KeyListener;
import android.widget.TextView;
import kl5.a;
import com.kwai.robust.PatchProxyResult;
import android.widget.EditText;
import java.lang.Number;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Objects;
import kl5.a$b;
import jl5.r;

public class KEmojiEditText extends AppCompatEditText	// class@000dc4
{
    public a e;
    public boolean f;

    public void KEmojiEditText(Context p0){
       super(p0);
       this.a(null, 0);
    }
    public void KEmojiEditText(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p1, R.attr.arg_RES_7f04031d);
    }
    public void KEmojiEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p1, p2);
    }
    public final void a(AttributeSet p0,int p1){
       if (PatchProxy.isSupport(KEmojiEditText.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, KEmojiEditText.class, "1")) {
          return;
       }
       if (this.f == null) {
          this.f = true;
          this.setKeyListener(super.getKeyListener());
       }
       return;
    }
    public final a getEmojiEditTextHelper(){
       Object obj = PatchProxy.apply(null, this, KEmojiEditText.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.e = new a(this);
       }
       return this.e;
    }
    public int getMaxEmojiCount(){
       Object obj = PatchProxy.apply(null, this, KEmojiEditText.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getEmojiEditTextHelper().b;
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       InputConnection obj = PatchProxy.applyOneRefs(p0, this, KEmojiEditText.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = super.onCreateInputConnection(p0);
       a emojiEditTex = this.getEmojiEditTextHelper();
       Objects.requireNonNull(emojiEditTex);
       InputConnection inputConnect = PatchProxy.applyTwoRefs(obj, p0, emojiEditTex, a.class, str);
       if (inputConnect != patchProxyRe) {
       }else if(obj == null){
          inputConnect = null;
       }else {
          inputConnect = emojiEditTex.a.b(obj, p0);
       }
       return inputConnect;
    }
    public void setKeyListener(KeyListener p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, KEmojiEditText.class, str)) {
          return;
       }
       if (p0 != null) {
          a emojiEditTex = this.getEmojiEditTextHelper();
          Objects.requireNonNull(emojiEditTex);
          Object obj = PatchProxy.applyOneRefs(p0, emojiEditTex, a.class, str);
          if (obj != PatchProxyResult.class) {
             p0 = obj;
          }else {
             r.c(p0, "keyListener cannot be null");
             p0 = emojiEditTex.a.a(p0);
          }
       }
       super.setKeyListener(p0);
       return;
    }
    public void setMaxEmojiCount(int p0){
       if (PatchProxy.isSupport(KEmojiEditText.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KEmojiEditText.class, "4")) {
          return;
       }
       a emojiEditTex = this.getEmojiEditTextHelper();
       Objects.requireNonNull(emojiEditTex);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), emojiEditTex, uoa, "1")) {
          r.b(p0, "maxEmojiCount should be greater than 0");
          emojiEditTex.b = p0;
          emojiEditTex.a.c(p0);
       }
       return;
    }
}
