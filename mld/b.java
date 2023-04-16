package mld.b;
import g9c.a;
import com.yxcrop.gifshow.v3.editor.crop.data.ratio.CropRatioType;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import mld.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import old.a;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import mld.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public class b extends a	// class@001d2c
{
    public CropRatioType g;
    public int h;
    public c i;

    public void b(){
       super();
       this.g = CropRatioType.FREE;
       this.h = a1.e(3.00f);
    }
    public final int X0(){
       return this.h;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       boolean b;
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "5")) {
          a.p(p0, "holder");
          Object obj = this.e.get(p1);
          a.o(obj, "mList[position]");
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(obj, p0, b$a.class, "1")) {
             a.p(obj, "data");
             ViewGroup$LayoutParams layoutParams = p0.a.getLayoutParams();
             a.o(layoutParams, "mMainLayout.layoutParams");
             layoutParams.width = obj.b + (p0.d.X0() * 2);
             layoutParams.height = obj.c + (p0.d.X0() * 2);
             p0.a.setLayoutParams(layoutParams);
             p0.c.setText(obj.d);
             b$a d = p0.d;
             Objects.requireNonNull(d);
             Object obj1 = PatchProxy.applyOneRefs(obj, d, uob, "4");
             int i = 0;
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(obj.a() == d.g){
                b = true;
             }else {
                b = false;
             }
             p0.b.setSelected(b);
             p0.c.setSelected(b);
             d = p0.b;
             if (!b) {
                i = 4;
             }
             d.setVisibility(i);
             p0.itemView.setOnClickListener(new a(p0, obj));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b$a uoa;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "3");
          if (uoa != PatchProxyResult.class) {
          label_0038 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d0237, p0, false);
       a.o(view, "LayoutInflater.from\(Comm¡­m,\n        parent, false\)");
       uoa = new b$a(this, view);
       goto label_0038 ;
    }
}
