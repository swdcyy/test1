package aad.b;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aad.a;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;

public class b extends n	// class@0000b2
{
    public View p;
    public TextView q;
    public TextView r;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public SelectShapeTextView v;
    public View w;
    public SearchItem x;
    public BottomBar y;
    public SearchResultFragment z;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.P8(this.p, new a(this));
       return;
    }
    public void V8(){
       PatchProxy.applyVoid(null, this, b.class, "5");
    }
    public void W8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0492);
       this.q = m1.f(p0, 0x7f0a08bc);
       this.s = m1.f(p0, 0x7f0a08b6);
       this.t = m1.f(p0, 0x7f0a08b7);
       this.u = m1.f(p0, 0x7f0a08b8);
       this.v = m1.f(p0, 0x7f0a08b3);
       this.r = m1.f(p0, 0x7f0a08cf);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.x = this.q8(SearchItem.class);
       this.z = this.r8("FRAGMENT");
       return;
    }
}
