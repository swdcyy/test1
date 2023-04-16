package dl9.m$b;
import com.yxcorp.gifshow.label.tag.hashtag.a;
import dl9.m;
import java.util.List;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public class m$b extends a	// class@001f7b
{
    public final m t;

    public void m$b(m p0){
       this.t = p0;
       super();
    }
    public void a(List p0,SpannableStringBuilder p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, m$b.class, "4");
    }
    public void c(List p0,int p1,int p2,int p3,boolean p4,String p5){
       m$b uob = m$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
             return;
          }
       }
       super.c(p0, p1, p2, p3, p4, p5);
       return;
    }
    public int g(ActivityInfo p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, m$b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       p0 = p0.mColor;
       if (p0 == null) {
          int i = a1.a(R.color.arg_RES_7f061ffe);
       }
       return p0;
    }
    public int h(ActivityInfo p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, m$b.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1.intValue();
       }
       p0 = p0.mPressedColor;
       if (p0 == null) {
          int i = a1.a(R.color.arg_RES_7f061fff);
       }
       return p0;
    }
}
