package com.yxcorp.gifshow.comment.utils.c$a;
import com.yxcorp.gifshow.widget.m;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a extends m	// class@001107
{
    public final View$OnClickListener c;

    public void c$a(boolean p0,long p1,View$OnClickListener p2){
       this.c = p2;
       super(p0, p1);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       this.c.onClick(p0);
       return;
    }
}
