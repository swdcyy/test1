package b9d.a;
import android.view.View$OnClickListener;
import b9d.i;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.homepage.widget.guide.HomeGuideLayout;
import k2b.e0;
import java.lang.String;
import nfd.m1;

public final class a implements View$OnClickListener	// class@0003bb
{
    public final i b;

    public void a(i p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       tb.q.e();
       m1.e(1, tb.p, "NEW_USER_GUIDE_BUBBLE", -1, "SEARCH_FUNCTION_GUIDE");
    }
}
