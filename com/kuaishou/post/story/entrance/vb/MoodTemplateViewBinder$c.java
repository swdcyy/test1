package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$c;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.ViewTreeObserver;
import com.kuaishou.post.story.entrance.vb.a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class MoodTemplateViewBinder$c implements Observer	// class@000b5b
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$c(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MoodTemplateViewBinder", "mFirstLoadRemoteTemplate it:"+p0, objArray);
          MoodTemplateViewBinder$c tb = this.b;
          if (tb.H != null) {
             a.o(p0, "it");
             tb.G(p0);
          }else {
             tb.z.invalidate();
             this.b.z.getViewTreeObserver().addOnPreDrawListener(new a(this, p0));
          }
       }
       return;
    }
}
