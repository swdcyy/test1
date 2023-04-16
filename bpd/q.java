package bpd.q;
import cpd.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.kwaitoken.model.MultiPicsDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.view.View;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import java.util.Objects;
import java.util.List;
import java.lang.Math;
import com.yxcrop.plugin.kwaiui.widget.KwaiTokenGalleryView;
import android.view.ViewGroup;
import ekd.p1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import cpd.b;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import apd.j;
import bpd.n;
import bpd.o;
import bpd.p;
import bpd.r;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import n4d.c;
import apd.i;

public class q extends PresenterV2 implements a, g	// class@0002ab
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public Button t;
    public KwaiTokenGalleryView u;
    public View v;
    public MultiPicsDialogInfo w;
    public i x;

    public void q(){
       super();
    }
    public void E8(){
       q tw = this.w;
       if (tw == null || TextUtils.x(tw.mTitle)) {
          this.v.setVisibility(8);
       }else {
          this.q.setText(this.w.mTitle);
          this.r.setText(this.w.mSubTitle);
       }
       tw = this.w;
       if (tw != null) {
          MultiPicsDialogInfo mCoverUrls = tw.mCoverUrls;
          if (mCoverUrls != null) {
             String[] stringArray = mCoverUrls.split("\\|");
             ArrayList uArrayList = new ArrayList(stringArray.length);
             Collections.addAll(uArrayList, stringArray);
             tw = this.u;
             Objects.requireNonNull(tw);
             int i = Math.min(6, Math.max(1, uArrayList.size()));
             p1.i(tw, KwaiTokenGalleryView.d[(i - 1)], 1);
             tw.b = new ArrayList();
             tw.a(tw);
             if (i >= tw.b.size()) {
                i = 0;
                while (i < tw.b.size()) {
                   KwaiImageView kwaiImageVie = tw.b.get(i);
                   kwaiImageVie.setPlaceHolderImage(R.drawable.arg_RES_7f081898);
                   if (i < uArrayList.size()) {
                      kwaiImageVie.L(uArrayList.get(i));
                      kwaiImageVie.setOnClickListener(new b(tw, i));
                   }
                   i = i + 1;
                }
             }
             this.u.setGalleryImageClickListener(this);
             this.t.setText(this.w.mActionButtonText);
             if (TextUtils.x(this.w.mFooterText)) {
                this.s.setVisibility(4);
             }else {
                this.s.setText(this.w.mFooterText);
                this.s.setVisibility(false);
             }
             if (TextUtils.x(this.w.mFooterTargetUrl)) {
                this.s.setClickable(false);
                this.s.setCompoundDrawables(null, null, null, null);
             }
             this.p.L(this.w.mIconUrl);
          }
       }
       return;
    }
    public void doBindView(View p0){
       this.p = j.b(p0, 0x7f0a3f54);
       this.q = j.b(p0, 0x7f0a3f2c);
       this.r = j.b(p0, 0x7f0a3bf5);
       this.t = j.b(p0, 0x7f0a007c);
       this.s = j.b(p0, 0x7f0a3a8f);
       this.u = j.b(p0, 0x7f0a1046);
       this.v = j.b(p0, 0x7f0a3f4a);
       j.a(p0, new n(this), R.id.close);
       j.a(p0, new o(this), R.id.action);
       j.a(p0, new p(this), R.id.source);
    }
    public Object getObjectByTag(String p0){
       if (p0.equals("injector")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap hashMap = new HashMap();
       if (p0.equals("injector")) {
          hashMap.put(q.class, new r());
       }else {
          hashMap.put(q.class, null);
       }
       return hashMap;
    }
    public void j4(int p0){
       c.c("click", "index: "+p0);
       if (this.x != null) {
          q tw = this.w;
          if (tw != null) {
             MultiPicsDialogInfo mCoverTarget = tw.mCoverTargetUrls;
             if (mCoverTarget != null) {
                String[] stringArray = mCoverTarget.split("\\|");
                if (stringArray != null && (stringArray.length > 0 && (p0 < stringArray.length && !TextUtils.x(stringArray[p0])))) {
                   this.x.i(stringArray[p0]);
                }
             }
          }
       }
       return;
    }
}
