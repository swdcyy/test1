package com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.text.font.adapter.RemoteFontVH;
import d0c.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class RemoteFontVH$b implements View$OnClickListener	// class@00143f
{
    public final RemoteFontVH b;
    public final d c;

    public void RemoteFontVH$b(RemoteFontVH p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontVH$b.class, "1")) {
          return;
       }
       this.b.n(this.c, false);
       return;
    }
}
