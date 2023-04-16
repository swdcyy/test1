package com.yxcorp.gifshow.notice.box.detail.NoticeBoxDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e9c.k;
import etb.w;
import etb.z;
import e9c.a;
import etb.n;
import etb.d;
import hfc.b;
import y8c.t;
import zsb.m;
import zsb.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lnc.i3;
import androidx.recyclerview.widget.RecyclerView;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import atb.c;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.RecyclerView$l;
import y8c.g;
import atb.a;
import lcc.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.fragment.app.Fragment;
import qvb.i;

public class NoticeBoxDetailFragment extends RecyclerFragment	// class@002165
{
    public c F;
    public static final int G;

    public void NoticeBoxDetailFragment(){
       super();
    }
    public PresenterV2 B2(){
       k obj = PatchProxy.applyWithListener(null, this, NoticeBoxDetailFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new k();
       obj.U7(new w());
       obj.U7(new z());
       obj.U7(new a());
       obj.U7(new n());
       obj.U7(new d());
       obj.U7(new b());
       PatchProxy.onMethodExit(NoticeBoxDetailFragment.class, "6");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this, this.Gh().j);
    }
    public boolean Dh(){
       return false;
    }
    public boolean Eh(){
       return true;
    }
    public final c Gh(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new c(this);
       }
       return this.F;
    }
    public int M(){
       return 1;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, NoticeBoxDetailFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.Gh());
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d10b1;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeBoxDetailFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(NoticeBoxDetailFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       c obj = PatchProxy.apply(objArray, this, NoticeBoxDetailFragment.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Gh();
       Objects.requireNonNull(obj);
       String str1 = PatchProxy.apply(objArray, obj, c.class, str);
       if (str1 != patchProxyRe) {
       }else {
          i3 oi3 = i3.f();
          oi3.d("box_id", obj.c);
          oi3.d("box_name", obj.d);
          str1 = oi3.e();
       }
       return str1;
    }
    public String getUrl(){
       return "kwai://noticebox";
    }
    public boolean mh(){
       return true;
    }
    public String o(){
       return "NOTIFICATION_BOX_LIST";
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, NoticeBoxDetailFragment.class, "7")) {
          return;
       }
       super.th();
       RecyclerView recyclerView = this.h0();
       if (this.Gh().j != null) {
          recyclerView.addItemDecoration(new e(1, a1.e(16.00f), 1));
       }else {
          recyclerView.addItemDecoration(new c());
       }
       g og = new g();
       og.K(false);
       recyclerView.setItemAnimator(og);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.Gh()};
       return new a(this.Gh().f, objArray);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getContext(), 1, (this.Gh().j ^ 1));
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxDetailFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Gh().e;
    }
}
