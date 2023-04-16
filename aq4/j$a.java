package aq4.j$a;
import com.yxcorp.gifshow.widget.m;
import aq4.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import rp4.a;
import q87.c;
import fq4.a;
import com.kuaishou.post.story.entrance.e;
import java.lang.Integer;
import rp4.b;
import rp4.c;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import androidx.fragment.app.Fragment;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;

public class j$a extends m	// class@0002c8
{
    public final j c;

    public void j$a(j p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       j$a tc = this.c;
       Objects.requireNonNull(tc);
       j oj = j.class;
       if (!PatchProxy.applyVoid(null, tc, oj, "7")) {
          if (tc.I == null) {
             Object[] objArray = new Object[0];
             a.D().A("StoryEditPanelPresenter", "project not loaded yet", objArray);
          }else {
             String str = "click_music";
             if (tc.A.t.c.intValue() == 2) {
                b.h("RECORD_VIDEO_EDIT_OPERATION", str, "EDIT_MOOD_PHOTO", "");
             }else {
                c.b(404, str);
             }
             if (tc.p == null) {
                MusicRootFragment musicRootFra = tc.I.b();
                tc.p = musicRootFra;
                musicRootFra.uh(tc.A.z, "music");
             }
             j p = tc.p;
             if (!PatchProxy.applyVoidTwoRefs(p, "music", tc, oj, "9")) {
                tc.P8(R.id.editor_container, p, "music");
             }
             tc.w.R();
          }
       }
       return;
    }
}
