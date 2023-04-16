package xld.c;
import xld.a;
import xld.c$a;
import nsd.u;
import java.util.List;
import java.util.Map;
import uvc.a;
import jod.a;
import android.graphics.RectF;
import java.util.ArrayList;
import mod.a;
import java.lang.String;
import xld.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class c extends a	// class@0029a3
{
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final DraftTextStyleInfo E;
    public final List v;
    public final a w;
    public final String x;
    public final b y;
    public final boolean z;
    public static final c$a F;

    static {
       c.F = new c$a(null);
    }
    public void c(){
       a uoa = new a(false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, null, null, false, 0xfffff, null);
       a uoa1 = new a(false, false, false, 0, null, false, null, null, 255, null);
       b uob = new b(null, false, false, false, false, 0, 63, null);
       super(v26, new ArrayList(), v14, null, v15, false, false, true, false, false, null);
    }
    public void c(a p0,List p1,a p2,String p3,b p4,boolean p5,boolean p6,boolean p7,boolean p8,boolean p9,DraftTextStyleInfo p10){
       a.p(p0, "decorationRootState");
       a.p(p1, "elementList");
       a.p(p2, "editingTextState");
       a.p(p4, "ttsState");
       super(p0);
       this.v = p1;
       this.w = p2;
       this.x = p3;
       this.y = p4;
       this.z = p5;
       this.A = p6;
       this.B = p7;
       this.C = p8;
       this.D = p9;
       this.E = p10;
    }
    public final DraftTextStyleInfo A(){
       return this.E;
    }
    public final String B(){
       return this.x;
    }
    public final int C(){
       int i;
       b obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = (this.y.d())? this.y.f: this.o();
       return obj;
    }
    public final boolean D(){
       return this.C;
    }
    public final b E(){
       return this.y;
    }
    public final boolean F(){
       return this.B;
    }
    public final boolean G(){
       return this.A;
    }
    public a h(){
       return this.w;
    }
    public List i(){
       return this.v;
    }
    public boolean w(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.s() && (this.A == null && this.C == null))? true: false;
       return b;
    }
    public final boolean x(){
       return this.z;
    }
    public final a y(){
       return this.w;
    }
    public final boolean z(){
       return this.D;
    }
}
