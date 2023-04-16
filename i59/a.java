package i59.a;
import java.lang.Object;
import android.text.SpannableStringBuilder;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import lnc.b3;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.text.SpannableString;
import java.lang.Throwable;
import yx.j0;
import java.lang.Integer;
import lnc.a1;
import android.view.View;
import ekd.p1;
import ekd.m1;
import android.widget.TextView;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;

public class a	// class@00262e
{

    public void a(){
       super();
    }
    public static void a(SpannableStringBuilder p0,Drawable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "3")) {
          return;
       }
       boolean b = false;
       try{
          p0.append(" ");
          b3 uob3 = new b3(a.b(), p1);
          uob3.b(b);
          p0.append(uob3.a());
       }catch(java.lang.Exception e3){
          Object[] objArray = new Object[b];
          j0.d("AdEndTagSpanHelper", e3, objArray);
       }
       return;
    }
    public static void b(SpannableStringBuilder p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "2")) {
          return;
       }
       a.a(p0, a1.f(p1));
       return;
    }
    public static void c(SpannableStringBuilder p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       View view = p1.g(a1.c(), R.layout.arg_RES_7f0d0050);
       m1.f(view, R.id.ad_end_tag_tv).setText(p1);
       a.a(p0, new BitmapDrawable(a1.m(), BitmapUtil.f(view)));
       return;
    }
}
