package com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a$a;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.d$b;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a$b;

public final class PosRandomChangeLinearLayout$a implements ViewGroup$OnHierarchyChangeListener	// class@000ba1
{
    public final PosRandomChangeLinearLayout b;

    public void PosRandomChangeLinearLayout$a(PosRandomChangeLinearLayout p0){
       this.b = p0;
       super();
    }
    public void onChildViewAdded(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PosRandomChangeLinearLayout$a.class, "1")) {
          return;
       }
       a.p(p0, "parent");
       a.p(p1, "child");
       PosRandomChangeLinearLayout$a tb = this.b;
       tb.c.b(new PosRandomChangeLinearLayout$a$a(this, p1), tb.d);
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PosRandomChangeLinearLayout$a.class, "2")) {
          return;
       }
       a.p(p0, "parent");
       a.p(p1, "child");
       PosRandomChangeLinearLayout$a tb = this.b;
       tb.c.b(new PosRandomChangeLinearLayout$a$b(this, p1), tb.d);
       return;
    }
}
