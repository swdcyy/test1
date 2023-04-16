package cbd.l;
import ucd.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import kp.r1;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import nfd.o3;
import android.text.TextPaint;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import lu7.f;
import java.lang.CharSequence;
import com.yxcorp.plugin.search.utils.j0;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class l extends n	// class@000521
{
    public SearchItem p;
    public ViewStub q;
    public View r;
    public KwaiImageView s;
    public TextView t;
    public User u;
    public ImageView v;

    public void l(){
       super();
    }
    public void E8(){
       TemplateBaseFeed templateBase;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "3")) {
          return;
       }
       l tp = this.p;
       if (tp != null && (!q.f(tp.mKBoxBaseItems) && this.p.mKBoxBaseItems.size() >= 2)) {
          QPhoto qPhoto = 13;
          if (this.p.mKBoxBaseItems.get(0).mType == qPhoto) {
             templateBase = this.p.mKBoxBaseItems.get(0).mKBoxFeeds.get(0);
          }else if(this.p.mKBoxBaseItems.get(true).mType == qPhoto){
             templateBase = this.p.mKBoxBaseItems.get(true).mKBoxFeeds.get(0);
          }else {
          label_0069 :
             templateBase = objArray;
          }
       }else {
          goto label_0069 ;
       }
       if (templateBase != null && templateBase.getQphoto() != null) {
          this.u = r1.T1(templateBase.getQphoto().mEntity);
       }
       if (this.u != null && !PatchProxy.applyVoidOneRefs(templateBase, this, ol, "4")) {
          if (!PatchProxy.applyVoid(objArray, this, ol, "5") && this.r == null) {
             View view = this.q.inflate();
             this.r = view;
             this.s = view.findViewById(0x7f0a15fe);
             this.t = this.r.findViewById(0x7f0a42f7);
             this.v = this.r.findViewById(0x7f0a0307);
          }
          o3.H(this.r, 0);
          this.t.getPaint().setFakeBoldText(true);
          g.b(this.s, this.u, HeadImageSize.SMALL);
          ol = this.u;
          if (ol != null) {
             this.t.setText(f.e(ol));
             j0.L(this.u, this.v, true);
          }
       }
    label_00f0 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a454d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.p = this.q8(SearchItem.class);
       return;
    }
}
