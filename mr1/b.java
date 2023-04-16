package mr1.b;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import msd.p;
import sq1.a;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.view.GestureDetector;
import mr1.b$e;
import android.view.GestureDetector$OnGestureListener;
import android.view.ViewGroup;
import j83.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import mr1.b$a;
import android.view.View$OnTouchListener;
import androidx.lifecycle.LiveData;
import mr1.b$b;
import androidx.lifecycle.Observer;
import mr1.b$c;
import android.view.View$OnClickListener;
import sq1.f$c;
import sq1.f;
import mr1.b$d;

public final class b	// class@0031f3
{
    public final boolean a;
    public b b;
    public final GestureDetector c;
    public b d;
    public final Context e;
    public final LifecycleOwner f;
    public final p g;
    public final a h;
    public final p i;
    public final l j;

    public void b(Context p0,LifecycleOwner p1,p p2,a p3,p p4,l p5){
       a.p(p0, "context");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "updatePositionCallback");
       a.p(p3, "roomDelegate");
       a.p(p4, "addViewController");
       a.p(p5, "removeViewController");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
       this.a = a.t().u("SOURCE_LIVE").d("enableAudienceMultiInteractiveDowngrade", true);
       this.c = new GestureDetector(p0, new b$e(this));
    }
    public static void b(b p0,ViewGroup p1,b p2,int p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = 129;
       }
       p0.a(p1, p2, p3);
       return;
    }
    public final void a(ViewGroup p0,b p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       a.p(p1, "widgetModel");
       View view = p0.findViewById(R.id.multi_line_peer_info_layout);
       a.o(view, "rootView.findViewById\(R.¡­ti_line_peer_info_layout\)");
       this.b = p1;
       p0.setClickable(true);
       p0.setOnTouchListener(new b$a(this));
       p1.d().observe(this.f, new b$b(this, p0));
       view.setOnClickListener(new b$c(p1, p2));
       p1.g(f$c.a);
       p1.f().observe(this.f, new b$d(this, p1, p0));
       return;
    }
}
