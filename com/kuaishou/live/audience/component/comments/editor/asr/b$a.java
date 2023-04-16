package com.kuaishou.live.audience.component.comments.editor.asr.b$a;
import ay0.h;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import t52.d;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;

public class b$a implements h	// class@000aa1
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       this.a.V8();
       return;
    }
    public boolean b(){
       return this.a.B;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "5")) {
          ta.C = true;
          ta.t.setVoiceInputListener(ta.H);
       }
       return;
    }
}
