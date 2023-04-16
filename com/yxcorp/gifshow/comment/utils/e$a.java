package com.yxcorp.gifshow.comment.utils.e$a;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.utils.e$c;
import nk9.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import java.util.HashSet;
import com.kuaishou.android.model.mix.QComment;
import org.greenrobot.eventbus.a;

public class e$a implements b$a	// class@00110e
{
    public final BaseEditorFragment$g a;
    public final e b;

    public void e$a(e p0,BaseEditorFragment$g p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$a.class, "2")) {
          return;
       }
       e m = this.b.m;
       if (m != null) {
          m.c(this.a);
       }
       e$a tb = this.b;
       e$a ta = this.a;
       a uoa = new a(tb.b, ta.c, ta.e, ta.f, null, ta.r, ta.s, tb.c().hashCode());
       if (m.a()) {
          objArray = this.b.l;
       }
       m.b(objArray);
       a.d().k(m);
       this.b.B();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       this.b.n(this.a);
       return;
    }
    public void c(){
    }
}
