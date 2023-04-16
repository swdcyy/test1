package hf1.e$a;
import k81.h;
import hf1.e;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import d61.g;
import lnc.a1;
import r81.c;
import o81.g;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.live.gzone.comments.LiveGzoneTagMessage;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.lsjwzh.widget.text.FastTextView;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import java.lang.CharSequence;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import hf1.f;
import java.util.Objects;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import android.text.SpannableStringBuilder;

public class e$a extends h	// class@002684
{
    public final e f;

    public void e$a(e p0,LiveCommentsNormalItemView p1){
       this.f = p0;
       super(p1);
       g.b(p1, e$a.class.getCanonicalName());
       p1.setBackgroundResource(R.drawable.arg_RES_7f080239);
       int i = a1.e(4.00f);
       p1.setPadding((i * 2), i, (i * 2), i);
       p1.setViewStyle(p0.a.d());
    }
    public void a(View p0,QLiveMessage p1,int p2){
       int i;
       if (!PatchProxy.isSupport(e$a.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, e$a.class, "1")) {
          p0.setTextSize(this.f.a.d().h());
          LiveSpannable liveSpannabl = new LiveSpannable();
          LiveSpannable$b uob = f.c(p1.mContent, this.f.a);
          if (this.f.a.p()) {
             i = this.f.a.h();
          }else {
             Objects.requireNonNull(this.f.a);
             i = 0x7f060871;
          }
          uob.d(i);
          liveSpannabl.h(new LiveSpannable$a(R.drawable.arg_RES_7f081292).c(this.f.a.f)).e().j(uob);
          p0.setText(liveSpannabl.k());
       }
       return;
    }
}
