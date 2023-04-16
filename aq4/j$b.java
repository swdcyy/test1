package aq4.j$b;
import qrc.s;
import aq4.j;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import com.kuaishou.android.model.music.Music;
import fq4.a;
import gq4.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.post.story.entrance.e;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import oa0.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.b;
import com.kuaishou.post.story.bubble.StoryBubbleItem;
import ra9.c;
import android.view.View;
import aq4.e;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;

public class j$b implements s	// class@0002c9
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void a(MusicClipInfo p0,Music p1){
       p1.a = p0;
    }
    public void b(float p0){
       this.a.A.e.b = p0;
    }
    public void c(Music p0,MusicClipInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$b.class, "1")) {
          return;
       }
       j a = this.a.A;
       if (a == null) {
          return;
       }
       a e = a.e;
       if (e != null) {
          e.c = p0;
          e.a = p1;
       }
       if (a.t.c.intValue() == 2) {
          j$b ta = this.a;
          boolean b = true;
          boolean b1 = (p0 != null)? true: false;
          ta.R8(b1);
          ta = this.a;
          Objects.requireNonNull(ta);
          j oj = j.class;
          if (!PatchProxy.applyVoidOneRefs(p0, ta, oj, "4") && p0 != null) {
             p0 = PatchProxy.apply(null, ta, oj, "8");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             }else if(!ta.D.get().booleanValue() && !a.c0()){
                b = false;
             }
             if (b) {
                j v = ta.v;
                if (v != null && v.isAdded()) {
                   b uob = new b(StoryBubbleItem.MOOD_AUTO_MUSIC);
                   uob.b(ta.q);
                   uob.k(new e(ta));
                   PostBubbleManager.d(ta.v).n(uob);
                }
             }
          }
       }
    label_0094 :
       return;
    }
    public void d(){
    }
}
