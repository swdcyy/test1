package com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment$c;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.utility.n;

public class MagicFaceFragment$c extends RecyclerView$n	// class@001bb2
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;

    public void MagicFaceFragment$c(int p0,int p1,boolean p2,boolean p3,boolean p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       Context this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, MagicFaceFragment$c.class, "1")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       MagicFaceFragment$c ta = this.a;
       int i = childAdapter % ta;
       int i1 = p2.getAdapter().getItemCount() - 1;
       int i2 = i1 / ta;
       this = null;
       ta = (i2 == (childAdapter / ta))? 1: 0;
       i1 = (childAdapter == i1)? 1: 0;
       i2 = n.c(p2.getContext(), 7.00f);
       int i3 = (this.d != null)? n.c(p2.getContext(), 5.00f): 0;
       float f = 72.00f;
       if (this.d != null) {
          this = n.c(p2.getContext(), f);
       }
       int i4 = n.c(p2.getContext(), f);
       if (this.c != null) {
          MagicFaceFragment$c tb = this.b;
          MagicFaceFragment$c ta1 = this.a;
          p0.left = (i * tb) / ta1;
          p0.right = tb - (((i + 1) * tb) / ta1);
          if (childAdapter < ta1) {
             p0.top = i3;
          }
          p0.bottom = (ta)? this + i2: i2;
          if (i1 && this.e != null) {
             p0.bottom = i2 + i4;
          }
       }else {
          MagicFaceFragment$c tb1 = this.b;
          MagicFaceFragment$c ta2 = this.a;
          p0.left = (i * tb1) / ta2;
          p0.right = tb1 - (((i + 1) * tb1) / ta2);
          if (childAdapter >= ta2) {
             p0.top = tb1;
          }
          if (ta) {
             p0.bottom = this;
          }
          if (i1 && this.e != null) {
             p0.bottom = i2 + i4;
          }
       }
    label_00ad :
       return;
    }
}
