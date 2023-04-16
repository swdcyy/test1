package a1d.h0$a;
import android.text.style.ClickableSpan;
import android.content.Intent;
import w0d.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import java.lang.Exception;
import android.text.TextPaint;

public class h0$a extends ClickableSpan	// class@000028
{
    public Intent b;
    public int c;
    public g d;

    public void h0$a(Intent p0,int p1,g p2){
       super();
       this.c = -10850155;
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$a.class, "2")) {
          return;
       }
       Context context = p0.getContext();
       if (this.b == null) {
          return;
       }
       try{
          this.d.g2();
          context.startActivity(this.b);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0$a.class, "1")) {
          return;
       }
       super.updateDrawState(p0);
       p0.setUnderlineText(false);
       h0$a tc = this.c;
       if (tc != null) {
          p0.setColor(tc);
       }
       return;
    }
}
