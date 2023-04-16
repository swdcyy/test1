package ced.r0;
import n3d.a;
import com.yxcorp.plugin.search.result.hashtag.presenters.t;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j0;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kuaishou.android.model.music.Music;
import wm6.a;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import com.yxcorp.plugin.search.widget.AutoMarqueeTextView;
import android.widget.TextView;
import android.widget.LinearLayout;

public final class r0 implements a	// class@000578
{
    public final t b;

    public void r0(t p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       r0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 != -1 || (1 == p0 && !PatchProxy.applyVoidOneRefs(p2, tb, t.class, "6"))) {
          String str = j0.f(p2, "soundtrack_name");
          a.c(tb.v.mMusic, str);
          str = new SpannableStringBuilder(str).toString();
          tb.A.setText(str);
          tb.z.setText(str);
          tb.w.setVisibility(8);
       }
    label_003d :
       return;
    }
}
