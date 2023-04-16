package com.yxcorp.gifshow.camera.record.album.slideup.list.a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.album.slideup.list.a$b;

public class a$a extends m	// class@001cd1
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (this.c.i != null) {
          int i = 0x7f0a2ac0;
          if (p0.getTag(i) != null) {
             int i1 = 0x7f0a2ac3;
             if (p0.getTag(i1) != null) {
                this.c.i.a(p0.getTag(i), p0.getTag(i1).intValue());
             }
          }
       }
       return;
    }
}
