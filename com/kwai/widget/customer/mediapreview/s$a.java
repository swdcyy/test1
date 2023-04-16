package com.kwai.widget.customer.mediapreview.s$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.widget.customer.mediapreview.s;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import io.reactivex.subjects.PublishSubject;

public class s$a extends RecyclerView$r	// class@001142
{
    public int a;
    public final s b;

    public void s$a(s p0){
       this.b = p0;
       super();
       this.a = -1;
    }
    public void a(RecyclerView p0,int p1){
       s$a uoa = s$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1) {
          int i = this.b.p.getLayoutManager().h();
          if (i < 0) {
             i = this.b.p.getLayoutManager().i0();
          }
          if (i >= 0) {
             s$a ta = this.a;
             if (i != ta) {
                if (ta < i) {
                   this.b.P8((i + 1));
                }else {
                   this.b.P8((i - 1));
                }
                this.a = i;
                this.b.s.onNext(Integer.valueOf(i));
             }
          }
       }
    label_0059 :
       return;
    }
}
