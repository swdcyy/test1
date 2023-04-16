package h63.e0;
import bt5.a;
import h63.f0;
import lkd.b;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import v53.a;
import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import i63.b;
import j63.a;
import b63.b;

public class e0 extends a	// class@002c76
{
    public final f0 b;

    public void e0(f0 p0,b p1){
       this.b = p0;
       super(p1);
    }
    public boolean a(MotionEvent p0,boolean p1){
       f0 obj;
       a adapter;
       e0 uoe01;
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoe0, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.r;
       if (obj == null) {
          return false;
       }else if(p1 && !obj.c()){
          return false;
       }else {
          Rect rect = new Rect();
          this.b.q.getGlobalVisibleRect(rect);
          if (!rect.contains((int)p0.getRawX(), (int)p0.getRawY())) {
             return false;
          }else if(this.b.r.l() != null){
             adapter = this.b.r.l().getAdapter();
          }else {
             adapter = null;
          }
          if (adapter == null) {
             return false;
          }else if(this.b.r.c() == (adapter.j() - 1)){
             uoe01 = 1;
          }else {
             uoe01 = null;
          }
          if (uoe01) {
             b uob = this.b.r.d();
             if (p1) {
                return 1;
             }else if(this.b.r.l() instanceof a && !this.b.r.l().getScrollable()){
                return 1;
             }else if(uob instanceof b && uob.d()){
                return false;
             }
          }
          return 1;
       }
    }
}
