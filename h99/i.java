package h99.i;
import b3a.e;
import im8.g;
import vl8.c;
import h99.i$a;
import android.view.View;
import com.kwai.feature.component.entry.view.SearchIconNebulaEntryView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import b3a.h;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import h99.h;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import h99.j;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import b3a.d;
import com.yxcorp.gifshow.detail.nonslide.toolbar.ToolbarAction;
import java.lang.Integer;
import zf6.k;
import android.graphics.drawable.Drawable;
import zf6.j;
import oy5.b;

public class i extends c implements e, g	// class@002576
{
    public BaseFragment c;
    public QPhoto d;
    public final b e;

    public void i(){
       super();
       this.e = new i$a(this);
    }
    public void C(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public h I(View p0){
       h oh = PatchProxy.applyOneRefs(p0, this, i.class, "4");
       if (oh != PatchProxyResult.class) {
       }else {
          Objects.requireNonNull(p0);
          oh = new h(p0);
       }
       return oh;
    }
    public void M(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
       }else {
          p0.setVisibility(0);
          p0.s0();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(i.class, new j());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public View q(ViewGroup p0){
       int i;
       View view = PatchProxy.applyOneRefs(p0, this, i.class, "3");
       if (view != PatchProxyResult.class) {
       }else {
          ViewStub viewStub = p0.findViewById(R.id.detail_search_stub);
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d08a3);
          view = viewStub.inflate();
          View view1 = p0.findViewById(R.id.ll_right_btn_group);
          if (view1 != null) {
             ViewGroup$MarginLayoutParams layoutParams = view1.getLayoutParams();
             layoutParams.rightMargin = a1.d(0x7f070267);
             view1.setLayoutParams(layoutParams);
          }
          view = view.findViewById(0x7f0a2d3e);
          if (!d.a(this.d).contains(ToolbarAction.MORE)) {
             ViewGroup$MarginLayoutParams layoutParams1 = view.getLayoutParams();
             layoutParams1.rightMargin = 0;
             view.setLayoutParams(layoutParams1);
          }
          i = 0x7f080632;
          int i1 = 0x7f080db6;
          Objects.requireNonNull(view);
          if (!PatchProxy.isSupport(SearchIconNebulaEntryView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), view, SearchIconNebulaEntryView.class, "2")) {
             view.setImageResource(i);
             view.setBottomResourceId(i1);
          }
          Drawable uDrawable = (!k.d() || k.e())? j.j(R.drawable.arg_RES_7f080ad4, 1): j.j(R.drawable.arg_RES_7f080ad4, 2);
          view.setImageDrawable(uDrawable);
          view.setBottomDrawable(uDrawable);
          view.setSearchActionCallback(this.e);
       }
       return view;
    }
}
