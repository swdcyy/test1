package fy0.i$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import fy0.i$a$a;
import java.lang.Integer;
import fy0.j;
import fy0.g;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.util.StateSet;
import xl8.b;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import d61.f0;
import brd.t;
import fy0.h;
import erd.g;
import crd.b;
import com.kuaishou.live.core.basic.model.LivePayBulletTag;
import z12.x;
import d61.h;
import android.view.ViewGroup;
import i2b.a;

public class i$a extends RecyclerView$Adapter	// class@0023d6
{
    public final List e;

    public void i$a(List p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       uArrayList.addAll(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       i$a$a e1;
       i$a uoa = i$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          j oj = this.e.get(p1);
          g og = new g(oj);
          boolean b = true;
          if (oj.c() != null && oj.d() != null) {
             p0.a.setVisibility(8);
             p0.e.setVisibility(0);
             p0.e.setOnClickListener(og);
             i$a$a e = p0.e;
             Drawable uDrawable = oj.c();
             Drawable uDrawable1 = oj.d();
             StateListDrawable stateListDra = PatchProxy.applyTwoRefs(uDrawable, uDrawable1, this, uoa, "5");
             if (stateListDra != PatchProxyResult.class) {
             }else {
                stateListDra = new StateListDrawable();
                int[] ointArray = new int[b];
                ointArray[0] = 0x10100a1;
                stateListDra.addState(ointArray, uDrawable);
                if (uDrawable1.getConstantState() != null) {
                   uDrawable = uDrawable1.getConstantState().newDrawable().mutate();
                   uDrawable.setAlpha(128);
                   uDrawable.setFilterBitmap(b);
                   stateListDra.addState(new int[2]{0x10100a7,0xfefeff5f}, uDrawable);
                }
                stateListDra.addState(StateSet.WILD_CARD, uDrawable1);
             }
             e.setImageDrawable(stateListDra);
             e1 = p0.e;
             if (oj.a().a().intValue() != oj.e()) {
                b = false;
             }
             e1.setSelected(b);
          }else {
             p0.e.setVisibility(8);
             p0.a.setVisibility(0);
             p0.a.setOnClickListener(og);
             if (oj.b()) {
                p0.c.setImageDrawable(a1.f(oj.b()));
             }
             e1 = p0.a;
             if (oj.a().a().intValue() != oj.e()) {
                b = false;
             }
             e1.setSelected(b);
             if (!TextUtils.x(oj.f())) {
                p0.b.setText(oj.f());
             }
             f0.f(p0.b, "sans-serif-medium");
          }
          oj.a().b().subscribe(new h(oj, p0));
          oj = oj.h;
          if (oj != null) {
             p0.d.setTextColor(x.z(oj.getTextColor()));
             p0.d.setText(oj.getText());
             p0.d.setBackground(h.a(a1.d(R.dimen.arg_RES_7f0702b8), x.z(oj.getBackgroundColor())));
             p0.d.setVisibility(0);
          }else {
             p0.d.setVisibility(8);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       i$a$a uoa$a;
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa$a = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (uoa$a != PatchProxyResult.class) {
          label_0025 :
             return uoa$a;
          }
       }
       uoa$a = new i$a$a(a.i(p0, 0x7f0d0ab8));
       goto label_0025 ;
    }
}
