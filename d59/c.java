package d59.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d59.c$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import mxb.c;
import o56.c;
import o56.a;
import android.view.ViewGroup;
import i2b.a;
import android.widget.FrameLayout;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import d59.c$c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.widget.TextView;
import java.lang.CharSequence;
import d59.c$b;
import im8.f;

public final class c extends PresenterV2	// class@002046
{
    public FrameLayout p;
    public AdMKPageConfig q;
    public f r;
    public f s;
    public QPhoto t;
    public static final c$a u;

    static {
       c.u = new c$a(null);
    }
    public void c(){
       super();
    }
    public static final AdMKPageConfig P8(c p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mAdMKPageConfig");
       }
       return p0;
    }
    public static View V8(c p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       return p0.S8(p1, p2, p3);
    }
    public void E8(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       c tt = this.t;
       BaseFeed entity = (tt != null)? tt.getEntity(): objArray;
       String obj = PatchProxy.applyOneRefs(entity, this, uoc, "9");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          b = c.f(entity);
          c uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          b = (uoc1.c() || b)? true: false;
       }
       if (!b) {
          return;
       }else {
          tt = this.p;
          obj = "mMkContentView";
          if (tt == null) {
             a.S(obj);
          }
          View view = a.i(tt, R.layout.arg_RES_7f0d0060);
          c tp = this.p;
          if (tp == null) {
             a.S(obj);
          }
          tp.addView(view);
          View obj1 = PatchProxy.apply(objArray, this, uoc, "10");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             c tq = this.q;
             if (tq == null) {
                a.S("mAdMKPageConfig");
             }
             if (tq.d() != 4) {
                i = 0;
             }
             b1 = i;
          }
          if (b1) {
             a.o(view, "mkToolView");
             view.setPadding(0, n.A(view.getContext()), 0, 0);
          }
          View view1 = view.findViewById(R.id.ad_mk_tool_view);
          a.o(view1, "mkToolView.findViewById\(R.id.ad_mk_tool_view\)");
          obj1 = view.findViewById(R.id.ad_mk_tool_content);
          a.o(obj1, "mkToolView.findViewById\(R.id.ad_mk_tool_content\)");
          view.findViewById(R.id.ad_mk_tool_btn).setOnCheckedChangeListener(new c$c(this, view1, obj1));
          return;
       }
    }
    public final View R8(String p0,View$OnClickListener p1){
       View obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m8();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       obj = a.i(obj, R.layout.arg_RES_7f0d005e);
       TextView textView = obj.findViewById(R.id.ad_mk_tool_item_btn);
       a.o(textView, "itemBtnView");
       textView.setText(p0);
       textView.setOnClickListener(p1);
       a.o(obj, "itemView");
       return obj;
    }
    public final View S8(String p0,String p1,boolean p2){
       View obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.m8();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.ViewGroup");
       obj = a.i(obj, R.layout.arg_RES_7f0d005f);
       TextView textView = obj.findViewById(R.id.ad_mk_tool_item_title);
       TextView textView1 = obj.findViewById(R.id.ad_mk_tool_item_content);
       a.o(textView, "itemTitleView");
       textView.setText(p0);
       a.o(textView1, "itemContentView");
       textView1.setText(p1);
       TextView textView2 = obj.findViewById(R.id.ad_mk_tool_item_copy);
       a.o(textView2, "itemCopyView");
       int i = (p2)? 0: 8;
       textView2.setVisibility(i);
       textView2.setOnClickListener(new c$b(this, p1));
       a.o(obj, "itemView");
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.adtk_wrapper_view);
       a.o(p0, "rootView.findViewById\(R.id.adtk_wrapper_view\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       f obj = this.q8(AdMKPageConfig.class);
       a.o(obj, "inject\(AdMKPageConfig::class.java\)");
       this.q = obj;
       this.t = this.s8(QPhoto.class);
       obj = this.x8("MK_PAGE_JSON_INFO");
       a.o(obj, "injectRef\(AccessIds.MK_PAGE_JSON_INFO\)");
       this.r = obj;
       obj = this.x8("MK_PAGE_RENDER_TIME");
       a.o(obj, "injectRef\(AccessIds.MK_PAGE_RENDER_TIME\)");
       this.s = obj;
       return;
    }
}
