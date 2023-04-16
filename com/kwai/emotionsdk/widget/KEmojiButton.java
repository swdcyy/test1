package com.kwai.emotionsdk.widget.KEmojiButton;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kl5.f;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.Boolean;
import android.text.InputFilter;

public class KEmojiButton extends AppCompatButton	// class@000dc3
{
    public f d;
    public boolean e;

    public void KEmojiButton(Context p0){
       super(p0);
       this.a();
    }
    public void KEmojiButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void KEmojiButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, KEmojiButton.class, "1")) {
          return;
       }
       if (this.e == null) {
          this.e = true;
          this.getEmojiTextViewHelper().c();
       }
       return;
    }
    public final f getEmojiTextViewHelper(){
       Object obj = PatchProxy.apply(null, this, KEmojiButton.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new f(this);
       }
       return this.d;
    }
    public void setAllCaps(boolean p0){
       if (PatchProxy.isSupport(KEmojiButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KEmojiButton.class, "3")) {
          return;
       }
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().b(p0);
       return;
    }
    public void setFilters(InputFilter[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KEmojiButton.class, "2")) {
          return;
       }
       super.setFilters(this.getEmojiTextViewHelper().a(p0));
       return;
    }
}
