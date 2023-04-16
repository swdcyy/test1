package com.kuaishou.live.audience.component.comments.editor.asr.b$f;
import dy0.e$a;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import l32.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.stentor.AsrProduct.Asr;
import wt7.a;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;

public class b$f implements e$a	// class@000aa6
{
    public final b a;

    public void b$f(b p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       b$f ta = this.a;
       ta.B = false;
       ta.A = "";
    }
    public void b(BaseEditorFragment$g p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
          return;
       }
       b$f ta = this.a;
       if (ta.x != null && (p0.a == null && (p0.k != null && !TextUtils.x(ta.A)))) {
          if ((this.a.A).equals(p0.c)) {
             b x = this.a.x;
             Objects.requireNonNull(x);
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, x, oh, "19")) {
                Asr d = x.e.D;
                d.i = Boolean.TRUE;
                d.a();
             }
          }else {
             b x1 = this.a.x;
             p0 = p0.c;
             Objects.requireNonNull(x1);
             if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Boolean.TRUE, p0, x1, oh, "20")) {
                Asr d1 = x1.e.D;
                d1.h = p0;
                d1.g = Boolean.TRUE;
                JsonObject jsonObject = new JsonObject();
                jsonObject.H("asr_has_edited", d1.g);
                jsonObject.c0("asr_edited_text", d1.h);
                d1.c(d1.a+d1.e, jsonObject);
             }
          }
       }
       return;
    }
}
