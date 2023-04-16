package com.kuaishou.live.gzone.barrage.l$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$d;
import com.kuaishou.live.gzone.barrage.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.bean.EmotionInfo;
import ky5.c;

public class l$b implements BaseEditorFragment$d	// class@001c3e
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "1")) {
          return;
       }
       this.a.R8(false);
       return;
    }
    public void b(EmotionInfo p0){
       c.a(this, p0);
    }
}
