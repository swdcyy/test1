package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$e;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;

public final class MoodTemplateViewBinder$e implements Observer	// class@000b5d
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$e(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$e.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MoodTemplateViewBinder", "mLoading it:"+p0, objArray);
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0.N = new AttrAnimProgressFragment();
             p0 = this.b;
             MoodTemplateViewBinder n = p0.N;
             if (n != null) {
                n.show(p0.E().getChildFragmentManager(), "story mood value");
             }
          }else {
             p0 = this.b.N;
             if (p0 != null) {
                p0.dismiss();
             }
             p0.N = null;
          }
       }
       return;
    }
}
