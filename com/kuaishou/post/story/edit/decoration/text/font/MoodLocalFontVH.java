package com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH;
import eq4.a;
import android.view.View;
import zuc.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH$background$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH$fontImage$2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import d0c.d;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import java.util.List;
import d0c.a;
import java.util.Collection;
import ekd.q;
import d0c.e;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.post.story.edit.decoration.text.font.MoodLocalFontVH$a;

public final class MoodLocalFontVH extends a	// class@000af0
{
    public final p b;
    public final p c;
    public final c d;

    public void MoodLocalFontVH(View p0,c p1){
       a.p(p0, "itemView");
       super(p0);
       this.d = p1;
       this.b = s.c(new MoodLocalFontVH$background$2(p0));
       this.c = s.c(new MoodLocalFontVH$fontImage$2(p0));
    }
    public View a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MoodLocalFontVH moodLocalFon = MoodLocalFontVH.class;
       Object obj = PatchProxy.apply(null, this, moodLocalFon, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, moodLocalFon, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.b.getValue();
       }
       a.o(obj1, "background");
       return obj1;
    }
    public void b(int p0,d p1){
       MoodLocalFontVH moodLocalFon = MoodLocalFontVH.class;
       if (PatchProxy.isSupport(moodLocalFon) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, moodLocalFon, "3")) {
          return;
       }
       a.p(p1, "item");
       super.b(p0, p1);
       this.e().setOnClickListener(null);
       this.d(p1.l());
       if (!q.f(p1.a())) {
          List list = e.a.a(p1.a());
          if (list.isEmpty() ^ 0x01) {
             this.e().P(list);
          }
       }
       this.e().setOnClickListener(new MoodLocalFontVH$a(this, p1));
       return;
    }
    public final KwaiImageView e(){
       Object obj = PatchProxy.apply(null, this, MoodLocalFontVH.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
