package com.kwai.feature.component.searchhistory.SearchHistoryFragment;
import g06.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g06.k;
import z8c.a;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import g06.g;
import z8c.a$a;
import g06.e;
import java.util.Map;
import java.lang.Boolean;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import br8.c;
import y8c.g;
import com.kwai.feature.component.searchhistory.d;
import br8.b;
import android.view.ViewGroup;
import com.kwai.feature.component.searchhistory.SearchHistoryFragment$a;
import qvb.i;
import com.kwai.feature.component.searchhistory.c;

public class SearchHistoryFragment extends RecyclerFragment implements f	// class@00128c
{
    public String F;
    public e G;
    public boolean H;
    public SearchHistoryFragment$a I;
    public static final int J;

    public void SearchHistoryFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, SearchHistoryFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k();
    }
    public a Gh(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, SearchHistoryFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(1, false, 1);
       obj.o(f.c(this.getResources(), R.drawable.arg_RES_7f080685, objArray));
       obj.l(1, new g(this, obj));
       return obj;
    }
    public void Hh(boolean p0){
       this.H = p0;
    }
    public void Ih(e p0){
       this.G = p0;
    }
    public void Jh(String p0){
       this.F = p0;
    }
    public String K(){
       return this.F;
    }
    public boolean S1(){
       return false;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchHistoryFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SearchHistoryFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, SearchHistoryFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.H != null) {
          return true;
       }
       return super.i0();
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchHistoryFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.h0().addItemDecoration(this.Gh());
       this.h0().addItemDecoration(new c(this.g7()));
       this.h0().setVerticalScrollBarEnabled(false);
       SearchHistoryFragment tI = this.I;
       if (tI != null) {
          tI.k(p0);
       }
       return;
    }
    public g vh(){
       d obj = PatchProxy.apply(null, this, SearchHistoryFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d(this.G);
       obj.w1(this.F);
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, SearchHistoryFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this.K());
    }
}
