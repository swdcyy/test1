package com.yxcorp.gifshow.comment.common.c$b;
import com.yxcorp.gifshow.comment.common.c$a;
import android.view.ViewStub;
import com.yxcorp.gifshow.comment.common.c$a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.widget.TextView;

public class c$b extends c$a	// class@0010a3
{
    public final c$a$a e;
    public final c$a$a f;
    public final c$a$a g;
    public final c$a$a h;

    public void c$b(ViewStub p0){
       super(p0);
       this.e = new c$a$a();
       this.f = new c$a$a();
       this.g = new c$a$a();
       this.h = new c$a$a();
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.g.b(p0.findViewById(R.id.empty_img));
       this.f.b(p0.findViewById(R.id.click_to_comment_btn));
       this.e.b(p0.findViewById(R.id.comment_tips_desc));
       this.h.b(p0.findViewById(R.id.comment_tips_sub_desc));
       return;
    }
}
