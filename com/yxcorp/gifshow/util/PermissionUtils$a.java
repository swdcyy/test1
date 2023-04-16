package com.yxcorp.gifshow.util.PermissionUtils$a;
import erd.g;
import android.app.Activity;
import java.lang.String;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import java.lang.Object;
import zq8.a;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.util.PermissionUtils$b;

public class PermissionUtils$a implements g	// class@001f08
{
    public final Activity b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final KwaiDialogOption h;

    public void PermissionUtils$a(Activity p0,boolean p1,boolean p2,boolean p3,String p4,boolean p5,KwaiDialogOption p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void accept(Object p0){
       PermissionUtils.c(this.b, this.c, this.d);
       Iterator iterator = PermissionUtils.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       if (this.e != null && p0.b == null) {
          boolean b = PermissionUtils.l(this.b, this.f);
          if (this.g == null && !b) {
             String[] stringArray = new String[]{p0.a};
             PermissionUtils.m(this.b, this.h, stringArray);
          }
       }
       return;
    }
}
