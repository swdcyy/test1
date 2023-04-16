package ngd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.fontscale.FontScaleHelper;
import oe6.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.Button;
import android.text.TextPaint;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import cw9.c;
import ngd.a;
import android.view.View$OnClickListener;
import ngd.b$a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import ngd.b$b;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public final class b extends PresenterV2	// class@001e33
{
    public boolean p;
    public float q;
    public BaseFragment r;
    public PublishSubject s;
    public PublishSubject t;
    public Button u;
    public View v;

    public void b(){
       super();
       this.p = FontScaleHelper.e();
       this.q = e.Q();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          uob = this.v;
          if (uob == null) {
             a.S("titleView");
          }
          ViewGroup$LayoutParams layoutParams = uob.getLayoutParams();
          if (!layoutParams instanceof RelativeLayout$LayoutParams) {
             layoutParams = objArray;
          }
          int i = -1;
          int i1 = 1;
          if (layoutParams != null) {
             layoutParams.addRule(0, 0);
             layoutParams.addRule(i1, i);
          }
          uob = this.u;
          if (uob == null) {
             a.S("finishButton");
          }
          uob.setGravity(17);
          uob.setVisibility(0);
          uob.setBackgroundResource(R.drawable.arg_RES_7f080c82);
          TextPaint paint = uob.getPaint();
          a.o(paint, "paint");
          paint.setFakeBoldText(i1);
          uob.setText(R.string.arg_RES_7f100f6b);
          uob.setTextColor(ContextCompat.getColor(uob.getContext(), R.color.arg_RES_7f061be0));
          Context context = uob.getContext();
          String str = "context";
          a.o(context, str);
          uob.setTextSize(0, context.getResources().getDimension(R.dimen.arg_RES_7f070271));
          context = uob.getContext();
          a.o(context, str);
          Context context1 = uob.getContext();
          a.o(context1, str);
          uob.setPadding(c.b(context.getResources(), R.dimen.arg_RES_7f070271), 0, c.b(context1.getResources(), R.dimen.arg_RES_7f070271), 0);
          ViewGroup$LayoutParams layoutParams1 = uob.getLayoutParams();
          if (layoutParams1 instanceof RelativeLayout$LayoutParams) {
             objArray = layoutParams1;
          }
          if (objArray != null) {
             context = uob.getContext();
             a.o(context, str);
             objArray.height = c.b(context.getResources(), 0x7f0702ef);
             context = uob.getContext();
             a.o(context, str);
             objArray.rightMargin = c.b(context.getResources(), 0x7f070295);
             objArray.addRule(12, 0);
             objArray.addRule(15, i);
          }
          uob.setOnClickListener(new a(this));
       }
       uob = this.s;
       if (uob == null) {
          a.S("followSystemSubject");
       }
       g e = Functions.e;
       this.X7(uob.subscribe(new b$a(this), e));
       uob = this.t;
       if (uob == null) {
          a.S("fontScaleSubject");
       }
       this.X7(uob.subscribe(new b$b(this), e));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.right_btn);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.right_btn\)");
       this.u = view;
       p0 = m1.f(p0, R.id.title_tv);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.title_tv\)");
       this.v = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.r = obj;
       obj = this.r8("FONT_SCALE_SETTINGS_FOLLOW_SYSTEM_SUBJECT");
       a.o(obj, "inject\(FONT_SCALE_SETTINGS_FOLLOW_SYSTEM_SUBJECT\)");
       this.s = obj;
       obj = this.r8("FONT_SCALE_SETTINGS_FONT_SCALE_SUBJECT");
       a.o(obj, "inject\(FONT_SCALE_SETTINGS_FONT_SCALE_SUBJECT\)");
       this.t = obj;
       return;
    }
}
