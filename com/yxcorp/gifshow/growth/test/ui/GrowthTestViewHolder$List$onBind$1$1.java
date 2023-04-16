package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List$onBind$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List$onBind$1;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import zqa.b$f;
import java.util.Map;
import vqa.k;
import zqa.b;
import pna.k;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$List;
import java.lang.CharSequence;
import android.widget.TextView;

public final class GrowthTestViewHolder$List$onBind$1$1 extends Lambda implements l	// class@001569
{
    public final ArrayList $titles;
    public final GrowthTestViewHolder$List$onBind$1 this$0;

    public void GrowthTestViewHolder$List$onBind$1$1(GrowthTestViewHolder$List$onBind$1 p0,ArrayList p1){
       this.this$0 = p0;
       this.$titles = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Integer p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$List$onBind$1$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          int i = this.$titles.size();
          int i1 = p0.intValue();
          if (i1 >= 0 && i > i1) {
             str = this.$titles.get(p0.intValue());
          label_002b :
             k.b.c(this.this$0.c.b(), this.this$0.c.d().get(str));
             GrowthTestViewHolder$List c = this.this$0.b.c;
             if (c != null) {
                c.setText(str);
             }
             return;
          }
       }
       str = "";
       goto label_002b ;
    }
}
