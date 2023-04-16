package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$o;
import n3d.a;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import zsd.d;
import java.nio.charset.Charset;
import rp4.m;
import android.widget.TextView;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;

public final class MoodTemplateViewBinder$o implements a	// class@000b69
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$o(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MoodTemplateViewBinder$o.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MoodTemplateViewBinder$o.class, "1")) {
          return;
       }
       MoodTemplateViewBinder$o tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(MoodTemplateViewBinder.class) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, tb, MoodTemplateViewBinder.class, "14") && tb.R.isVisible())) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "MoodTemplateViewBinder";
          a.D().w(str, "selectItemToCenter resultCode:"+p1+", data:"+p2, objArray);
          if (p1 == -1 && p2 != null) {
             String stringExtra = p2.getStringExtra("INTENT_STORY_FILEPATH");
             byte[] byteArrayExt = p2.getByteArrayExtra("INTENT_STORY_VIDEO_CONTEXT_JSON");
             if (!TextUtils.x(stringExtra)) {
                a.m(byteArrayExt);
                Object[] objArray1 = new Object[i];
                a.D().w(str, "selectItemToCenter filePath:"+stringExtra+", "+"videoContextBytes:"+new String(byteArrayExt, d.a), objArray1);
                MoodTemplateViewBinder m = tb.m;
                if (m != null) {
                   m.setShadowLayer((float)m.d, (float)m.e, (float)m.f, m.h);
                }
                StoryTextDrawer selectStoryT = tb.o.getSelectStoryTextDrawer();
                if (selectStoryT != null) {
                   selectStoryT.mEnableTextShadow = true;
                   selectStoryT.update();
                }
                a.m(stringExtra);
                tb.S.o0(stringExtra, byteArrayExt);
                tb.S.D0(true);
             }
          }
       }
       return;
    }
}
