package b9d.b;
import com.yxcorp.plugin.search.homepage.widget.guide.HomeGuideLayout$b;
import b9d.i;
import java.util.List;
import android.view.ViewGroup;
import java.lang.Object;
import k2b.e0;
import java.lang.String;
import nfd.m1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import oe6.g;
import android.view.View;

public final class b implements HomeGuideLayout$b	// class@0003bc
{
    public final i a;
    public final List b;
    public final ViewGroup c;

    public void b(i p0,List p1,ViewGroup p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void a(boolean p0){
       b ta = this.a;
       b tb = this.b;
       b tc = this.c;
       if (p0) {
          m1.e(0, ta.p, "NEW_USER_GUIDE_BUBBLE", -1, "SEARCH_FUNCTION_GUIDE");
          g.a(ta.u.edit().putBoolean(ta.P8(tb)+QCurrentUser.me().getId(), true));
       }else {
          tc.removeView(ta.q);
       }
       return;
    }
}
