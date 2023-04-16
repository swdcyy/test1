package com.kuaishou.post.story.entrance.vb.a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$c;
import kotlin.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import android.view.ViewTreeObserver;
import android.view.View;

public final class a implements ViewTreeObserver$OnPreDrawListener	// class@000b6f
{
    public final MoodTemplateViewBinder$c b;
    public final Pair c;

    public void a(MoodTemplateViewBinder$c p0,Pair p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a tc = this.c;
       a.o(tc, "it");
       this.b.b.G(tc);
       this.b.b.z.getViewTreeObserver().removeOnPreDrawListener(this);
       return false;
    }
}
