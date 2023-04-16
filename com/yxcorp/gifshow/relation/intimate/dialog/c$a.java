package com.yxcorp.gifshow.relation.intimate.dialog.c$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.intimate.dialog.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.intimate.dialog.e;
import android.widget.TextView;
import abc.c;
import abc.b;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import erd.g;
import com.yxcorp.gifshow.relation.intimate.helper.i;

public class c$a extends m	// class@0018e7
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.c.f.setEnabled(false);
       i.b(this.c.i, new c(this), new b(this));
       return;
    }
}
