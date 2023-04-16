package com.kuaishou.pagedy.container.widget.DynamicTabShadowView;
import jo4.g;
import android.view.View;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import android.content.ContextWrapper;
import jo4.i;

public class DynamicTabShadowView extends View implements g	// class@000a79
{

    public void DynamicTabShadowView(Context p0){
       super(p0);
       this.setBackgroundResource(R.drawable.arg_RES_7f081a50);
       this.setAlpha(0x3f4ccccd);
       this.setVisibility(8);
    }
    public void a(int p0,String p1){
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(DynamicTabShadowView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DynamicTabShadowView.class, "4")) {
          return;
       }
       if (p0) {
          this.setVisibility(0);
       }else {
          this.setVisibility(8);
       }
       return;
    }
    public Activity getActivity(){
       Context obj = PatchProxy.apply(null, this, DynamicTabShadowView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContext();
       while (true) {
          if (!obj instanceof ContextWrapper) {
             return null;
          }
          if (obj instanceof Activity) {
             break ;
          }else {
             obj = obj.getBaseContext();
          }
       }
       return obj;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, DynamicTabShadowView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.getActivity() != null) {
          i.a().b(this.getActivity(), this);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, DynamicTabShadowView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.getActivity() != null) {
          i.a().d(this.getActivity(), this);
       }
       return;
    }
}
