package com.kuaishou.live.gzone.widget.LiveGzoneProfileTagsView$b;
import m0d.a;
import java.lang.String;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.text.SpannableStringBuilder;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import java.lang.CharSequence;
import y17.a;
import java.lang.StringBuilder;

public class LiveGzoneProfileTagsView$b extends a	// class@001cf9
{
    public final int b;
    public final int c;
    public final String d;
    public final TextView e;

    public void LiveGzoneProfileTagsView$b(int p0,int p1,String p2,TextView p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneProfileTagsView$b.class, "1")) {
          return;
       }
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       if (p0 == null && this.b != null) {
          p0 = a.a().a().getResources().getDrawable(this.b);
       }
       if (p0 != null) {
          p0.setBounds(0, 0, this.c, this.c);
          String str = "p";
          spannableStr.append(str);
          a uoa = new a(p0, str);
          uoa.c(this.c, this.c);
          spannableStr.setSpan(uoa, 0, spannableStr.length(), 33);
       }
       spannableStr.append(" "+this.d);
       this.e.setText(spannableStr);
       return;
    }
}
