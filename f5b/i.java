package f5b.i;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import f5b.i$a;
import android.view.View$OnClickListener;
import xf6.g;
import xf6.l;
import s5b.a;
import android.content.SharedPreferences;
import f5b.i$b;
import java.lang.Runnable;
import ekd.k1;

public final class i extends SmoothPagerSlidingTabStrip$c	// class@0028ae
{
    public final String r;

    public void i(String p0,String p1){
       a.p(p0, "name");
       super(p0, p0);
       this.r = p1;
    }
    public View l(Context p0,int p1,ViewPager p2,SmoothSlidingTabStrip p3,ViewGroup p4){
       int i;
       i oi = i.class;
       i = 1;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, oi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d0ee0, p4, 0);
       a.o(view, "KwaiLayoutInflater.infla¡­       parentView, false\)");
       this.m(p1, p2, p3);
       view.setOnClickListener(new i$a(this, p2, p1));
       if (!g.o1() || !l.c("key_always_show_magic_search_guide_animator", 0)) {
          i = 0;
       }
       if (i || !a.a.getBoolean("is_shown_magic_search_guide", 0)) {
          k1.r(new i$b(this, view), 0);
       }
       return view;
    }
}
