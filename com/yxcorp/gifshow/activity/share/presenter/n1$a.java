package com.yxcorp.gifshow.activity.share.presenter.n1$a;
import r26.e;
import com.yxcorp.gifshow.activity.share.presenter.n1;
import java.lang.Object;
import r26.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import g9c.a;
import xw8.c;
import xw8.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import qkd.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.postwork.PostStatus;

public class n1$a implements e	// class@001415
{
    public final n1 b;

    public void n1$a(n1 p0){
       this.b = p0;
       super();
    }
    public void V4(float p0,a p1){
       n1$a uoa = n1$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       if (this.b.U0 == p1.getId()) {
          n1$a tb = this.b;
          if (tb.c1 != null) {
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, n1.class, "14")) {
                int i = 0;
                while (i < tb.c1.getItemCount()) {
                   c uoc = tb.c1.s1(i);
                   if (uoc.e == null) {
                      if (TextUtils.x(uoc.a())) {
                         Object[] objArray = new Object[0];
                         a.b().w("SharePhotosPreviewPresenter", "index: "+i+" is not photo, continue", objArray);
                      }else if(b.S(new File(uoc.a()))){
                         uoc.e = true;
                         tb.c1.l0(i);
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public void w9(PostStatus p0,a p1){
    }
}
