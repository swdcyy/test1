package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$a;
import ypc.a;
import android.util.Pair;
import lnc.p3;
import q87.c;

public class CoverTextGroupFragment$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@000e49
{
    public final CoverTextGroupFragment b;

    public void CoverTextGroupFragment$d(CoverTextGroupFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, CoverTextGroupFragment$d.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.b.j.getLayoutManager();
       if (!layoutManage instanceof LinearLayoutManager) {
          return;
       }
       int i = layoutManage.c();
       int i1 = layoutManage.i0();
       String str = -1;
       if (i1 == str || i == str) {
          Object[] objArray = new Object[0];
          p3.D().A("CoverTextGroupFragment", "not find item view", objArray);
          return;
       }else {
          this.b.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          for (int i2 = i1; i2 <= i; i2 = i2 + 1) {
             this.b.o.add(Pair.create(Integer.valueOf(i2), this.b.m.a().get(i2)));
          }
          CoverTextGroupFragment$d tb = this.b;
          tb.p = i1;
          tb.q = i;
          return;
       }
    }
}
