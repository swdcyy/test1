package com.yxcorp.gifshow.music.a;
import com.yxcorp.gifshow.music.SimpleRichTextView;
import java.lang.Object;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kob.a;
import android.view.View$OnClickListener;
import kob.c;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import android.widget.PopupWindow;
import android.view.View;
import android.content.Context;
import i2b.a;
import kob.b;
import kob.d;
import android.view.View$OnTouchListener;
import kob.e;
import android.widget.PopupWindow$OnDismissListener;
import android.view.ViewParent;

public class a	// class@001fd9
{
    public final int a;
    public final int b;
    public final int c;
    public SimpleRichTextView d;
    public int e;
    public PopupWindow f;
    public boolean g;

    public void a(SimpleRichTextView p0){
       super();
       this.a = a1.e(70.00f);
       this.b = a1.e(50.00f);
       this.c = 100;
       this.g = true;
       this.d = p0;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
       }else {
          this.d.setTextContentOnclickListener(new a(this));
          this.d.setTextContentOnLongClickListener(new c(this));
       }
       return;
    }
    public final void a(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (this.d.isSelected()) {
          this.b();
       }else if(PatchProxy.applyVoid(objArray, this, uoa, "3")){
          int b = true;
          this.d.setSelected(b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
             if (!PatchProxy.applyVoid(objArray, this, uoa, "8") && this.f == null) {
                View view = PatchProxy.apply(objArray, this, uoa, "9");
                if (view != patchProxyRe) {
                }else {
                   Context context = this.d.getContext();
                   View view1 = a.c(context, R.layout.arg_RES_7f0d15ac, objArray);
                   view1.setOnClickListener(new b(this, context));
                   view = view1;
                }
                PopupWindow popupWindow = new PopupWindow(view, this.a, this.b);
                this.f = popupWindow;
                popupWindow.setOutsideTouchable(b);
                this.f.setTouchInterceptor(new d(this));
                this.f.setOnDismissListener(new e(this));
             }
             int[] ointArray = new int[2];
             this.d.getLocationOnScreen(ointArray);
             int i = ointArray[0] + ((this.d.getTextWidth() - this.a) / 2);
             b = ointArray[b] - ((this.b * 5) / 6);
             a tf = this.f;
             ViewParent obj = PatchProxy.apply(objArray, this, uoa, "7");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
                for (obj = this.d.getParent(); obj != null && obj.getParent() instanceof ViewGroup; obj = obj.getParent()) {
                }
                if (obj != null) {
                   objArray = obj;
                }
             }
             tf.showAtLocation(objArray, 0, i, b);
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.d.setSelected(false);
       return;
    }
}
