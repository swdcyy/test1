package mj9.a;
import y8c.g;
import xl8.b;
import mj9.a$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import im8.c;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import mj9.b;
import ml8.c;

public final class a extends g	// class@00303c
{
    public final b w;
    public final a$a x;

    public void a(b p0,a$a p1){
       a.p(p0, "mCurrentTagPublisher");
       a.p(p1, "mOnItemClickListener");
       super();
       this.w = p0;
       this.x = p1;
    }
    public ArrayList a1(int p0,f p1){
       ArrayList obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       obj.add(c.a("HOT_CHANNEL_CURRENT_TAG", this.w));
       obj.add(c.a("HOT_CHANNEL_SELECT_TAG_LISTENER", this.x));
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d0602);
       a.o(view, "KwaiLayoutInflater.infla¡­hot_channel_sub_tag_item\)");
       return new f(view, new b());
    }
}
