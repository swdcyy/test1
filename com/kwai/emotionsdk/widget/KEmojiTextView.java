package com.kwai.emotionsdk.widget.KEmojiTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import kl5.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import java.lang.Boolean;
import android.text.InputFilter;

public class KEmojiTextView extends AppCompatTextView	// class@000dc5
{
    public f f;
    public boolean g;

    public void KEmojiTextView(Context p0){
       super(p0);
       this.p();
    }
    public void KEmojiTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.p();
    }
    public void KEmojiTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p();
    }
    public final f getEmojiTextViewHelper(){
       Object obj = PatchProxy.apply(null, this, KEmojiTextView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new f(this);
       }
       return this.f;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, KEmojiTextView.class, "1")) {
          return;
       }
       if (this.g == null) {
          this.g = true;
          this.getEmojiTextViewHelper().c();
       }
       return;
    }
    public void setAllCaps(boolean p0){
       if (PatchProxy.isSupport(KEmojiTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KEmojiTextView.class, "3")) {
          return;
       }
       super.setAllCaps(p0);
       this.getEmojiTextViewHelper().b(p0);
       return;
    }
    public void setFilters(InputFilter[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KEmojiTextView.class, "2")) {
          return;
       }
       super.setFilters(this.getEmojiTextViewHelper().a(p0));
       return;
    }
}
