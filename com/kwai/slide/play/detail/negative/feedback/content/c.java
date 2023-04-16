package com.kwai.slide.play.detail.negative.feedback.content.c;
import com.kwai.slide.play.detail.negative.feedback.content.h$b;
import com.kwai.slide.play.detail.negative.feedback.content.f;
import android.view.View$OnClickListener;
import com.kwai.slide.play.detail.negative.feedback.content.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c extends h$b	// class@001831
{
    public final g$a h;
    public final f i;

    public void c(f p0,int p1,int p2,View$OnClickListener p3,g$a p4){
       this.i = p0;
       this.h = p4;
       super(p1, p2, p3);
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.h.h())? 0x7f082095: 0x7f0820bc;
       return i;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.h.h())? 0x7f1014be: 0x7f103eb0;
       return i;
    }
}
