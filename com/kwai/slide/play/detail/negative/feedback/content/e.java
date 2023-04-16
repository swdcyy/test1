package com.kwai.slide.play.detail.negative.feedback.content.e;
import com.kwai.slide.play.detail.negative.feedback.content.h$b;
import com.kwai.slide.play.detail.negative.feedback.content.f;
import android.view.View$OnClickListener;
import com.kwai.slide.play.detail.negative.feedback.content.g$a;
import com.kwai.slide.play.detail.model.MoreOperationItem;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class e extends h$b	// class@001833
{
    public final g$a h;
    public final MoreOperationItem i;
    public final f j;

    public void e(f p0,int p1,int p2,View$OnClickListener p3,g$a p4,MoreOperationItem p5){
       this.j = p0;
       this.h = p4;
       this.i = p5;
       super(p1, p2, p3);
    }
    public String b(){
       MoreOperationItem obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.h.h())? this.i.selectedIcon: this.i.icon;
       return obj;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.h.h())? 0x7f082095: 0x7f0820bc;
       return i;
    }
    public String d(){
       MoreOperationItem obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.h.h())? this.i.selectedName: this.i.name;
       return obj;
    }
}
