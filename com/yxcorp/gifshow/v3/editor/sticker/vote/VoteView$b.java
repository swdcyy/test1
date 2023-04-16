package com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class VoteView$b extends m	// class@0012ca
{
    public final View$OnClickListener c;
    public final VoteView d;

    public void VoteView$b(VoteView p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView$b.class, "1")) {
          return;
       }
       this.c.onClick(p0);
       return;
    }
}
