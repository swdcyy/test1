package gna.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import o56.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.app.Application;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;
import android.text.Spanned;
import android.text.Html;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderEnum;
import gna.b;

public abstract class d extends RecyclerView$ViewHolder	// class@002b33
{
    public b a;
    public final int b;
    public final int c;

    public void d(View p0){
       super(p0);
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       this.b = b.getResources().getColor(0x7f061f7d);
       b = a.B;
       a.o(b, "AppEnv.APP");
       this.c = b.getResources().getColor(0x7f061fe0);
    }
    public final void a(TextView p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, d.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       int i = (p1 == null || u.S1(p1))? 1: 0;
       if (i) {
          if (p1 == null) {
             p1 = "";
          }
          p0.setText(p1);
          return;
       }else {
          p0.setTextColor(p2);
          if (p3) {
             p0.setText(Html.fromHtml(p1));
          }else {
             p0.setText(p1);
          }
          return;
       }
    }
    public final int b(){
       return this.c;
    }
    public abstract GrowthCleanerViewHolderEnum c();
    public final b d(){
       return this.a;
    }
    public final b e(){
       return this.a;
    }
    public final int f(){
       return this.b;
    }
    public void g(b p0){
    }
    public final void h(b p0){
       this.a = p0;
    }
}
