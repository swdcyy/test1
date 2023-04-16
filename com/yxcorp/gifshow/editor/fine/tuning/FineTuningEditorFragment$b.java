package com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import im8.g;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment;
import java.lang.Object;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b$a;
import io.reactivex.subjects.PublishSubject;
import rwc.j;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.editor.fine.tuning.k;
import java.util.Map;
import java.util.HashMap;

public class FineTuningEditorFragment$b implements g	// class@001b9a
{
    public FineTuningEditorFragment b;
    public int c;
    public String d;
    public i e;
    public int f;
    public z g;
    public k h;
    public PublishSubject i;
    public j j;
    public final FineTuningEditorFragment k;

    public void FineTuningEditorFragment$b(FineTuningEditorFragment p0){
       this.k = p0;
       super();
       this.c = 25;
       this.f = 0;
       this.h = new FineTuningEditorFragment$b$a(this);
       this.i = PublishSubject.g();
       this.j = new j(null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FineTuningEditorFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FineTuningEditorFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FineTuningEditorFragment$b.class, new k());
       }else {
          obj.put(FineTuningEditorFragment$b.class, null);
       }
       return obj;
    }
}
