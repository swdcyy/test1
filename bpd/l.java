package bpd.l;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.widget.ImageView;
import cw9.c;
import android.content.Context;
import android.view.View;
import apd.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import bpd.g;
import android.view.View$OnClickListener;
import bpd.i;
import bpd.j;
import bpd.k;
import bpd.h;
import java.lang.Object;
import bpd.m;
import java.util.Map;
import java.util.HashMap;

public class l extends PresenterV2 implements g	// class@0002a6
{
    public KwaiImageView p;
    public TextView q;
    public KwaiImageView r;
    public Button s;
    public TextView t;
    public BigPictureDialogInfo u;
    public i v;

    public void l(){
       super();
    }
    public void E8(){
       this.p.L(this.u.mIconUrl);
       this.p.setPlaceHolderImage(R.drawable.arg_RES_7f08104a);
       this.q.setText(this.u.mTitle);
       int i = 8;
       boolean b = false;
       if (TextUtils.x(this.u.mFooterText)) {
          this.t.setVisibility(i);
          LinearLayout$LayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.bottomMargin = a1.d(0x7f07055a);
          this.s.setLayoutParams(layoutParams);
       }else {
          this.t.setText(this.u.mFooterText);
          this.t.setVisibility(b);
       }
       if (TextUtils.x(this.u.mFooterTargetUrl)) {
          this.t.setClickable(b);
          this.t.setCompoundDrawables(null, null, null, null);
       }
       this.s.setText(this.u.mActionButtonText);
       Activity activity = this.getActivity();
       if (activity != null) {
          int requestedOri = activity.getRequestedOrientation();
          if (requestedOri == -1) {
             if (activity.getResources() != null && activity.getResources().getConfiguration().orientation == 2) {
             label_0098 :
                b = true;
             }
          }else if(requestedOri && (requestedOri == i || requestedOri == 6)){
             goto label_0098 ;
          }
          if (b) {
             this.r.getLayoutParams().height = c.a(this.getActivity().getResources(), 0x7f070553);
          }else if(this.u.mAspectRatio - 0x3f800000 > 0){
             this.r.getLayoutParams().height = (int)((float)c.a(this.getContext().getResources(), 0x7f070554) / this.u.mAspectRatio);
          }
       }
       this.r.L(this.u.mBigPicUrl);
       this.r.setPlaceHolderImage(R.drawable.arg_RES_7f0803c4);
       return;
    }
    public void doBindView(View p0){
       this.p = j.b(p0, 0x7f0a0333);
       this.q = j.b(p0, 0x7f0a3f2c);
       this.r = j.b(p0, 0x7f0a300b);
       this.s = j.b(p0, 0x7f0a007c);
       this.t = j.b(p0, 0x7f0a3a8f);
       j.a(p0, new g(this), R.id.close);
       j.a(p0, new i(this), R.id.action);
       j.a(p0, new j(this), R.id.photo);
       j.a(p0, new k(this), R.id.source);
       j.a(p0, new h(this), R.id.avatar);
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("injector")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("injector")) {
          hashMap.put(l.class, new m());
       }else {
          hashMap.put(l.class, null);
       }
       return hashMap;
    }
}
