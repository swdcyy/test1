package com.yxcorp.gifshow.bubble.PostBubbleManager$b;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.l3;
import java.lang.StringBuilder;
import ra9.c;
import q87.c;
import java.util.Iterator;
import java.util.Set;
import android.content.SharedPreferences;
import lnc.e7;
import ra9.i;

public class PostBubbleManager$b implements PostBubbleManager$c	// class@001c70
{
    public final a a;
    public final PostBubbleManager b;

    public void PostBubbleManager$b(PostBubbleManager p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(a p0,c p1,int p2){
       if (PatchProxy.isSupport(PostBubbleManager$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PostBubbleManager$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       l3.C().w("PostBubbleManager", this.a.d().name()+" onDismiss", objArray);
       PostBubbleManager$b tb = this.b;
       tb.j = null;
       Iterator iterator = tb.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.a, p1, p2);
       }
       this.b.r(this.a);
       return;
    }
    public void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostBubbleManager$b.class, "1")) {
          return;
       }
       int i = e7.a().getInt(this.a.d().getBubbleKey(), 0) + 1;
       e7.b(this.a.d().getBubbleKey(), i);
       Object[] objArray = new Object[0];
       l3.C().w("PostBubbleManager", this.a.d().name()+" onShow:"+i, objArray);
       Iterator iterator = this.b.i.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.a, p1);
       }
       return;
    }
    public void c(boolean p0){
       i.b(this, p0);
    }
}
