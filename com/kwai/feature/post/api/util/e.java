package com.kwai.feature.post.api.util.e;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.feature.post.api.util.d;
import java.lang.Runnable;

public class e extends PopupInterface$g	// class@001461
{
    public final String c;
    public final String d;

    public void e(int p0,String p1,String p2){
       this.c = p1;
       this.d = p2;
       super(p0);
    }
    public void c(c p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       TextView textView = p1.findViewById(R.id.toast_title);
       TextView textView1 = p1.findViewById(R.id.toast_text);
       if (textView != null) {
          textView.setText(this.c);
       }
       if (textView1 != null) {
          textView1.setText(this.d);
       }
       p1.postDelayed(new d(this, p1), 500);
       return;
    }
}
