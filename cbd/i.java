package cbd.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.util.List;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateLiveFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import yed.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.plugin.search.utils.j0;
import android.widget.TextView;
import com.yxcorp.plugin.search.widget.SearchWeakCardTitleTextView;

public class i extends PresenterV2	// class@00051e
{
    public CommonMeta p;
    public SearchItem q;
    public SearchWeakCardTitleTextView r;
    public String s;
    public TemplateLiveFeed t;

    public void i(){
       super();
    }
    public void E8(){
       int i;
       String str;
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       SearchItem mKBoxBaseIte = this.q.mKBoxBaseItems;
       if (mKBoxBaseIte == null) {
          return;
       }
       KBoxItem kBoxItem = mKBoxBaseIte.get(1);
       if (kBoxItem != null) {
          kBoxItem = kBoxItem.mKBoxFeeds;
          if (kBoxItem != null) {
             i = 0;
             if (kBoxItem.get(i) instanceof TemplateLiveFeed) {
                TemplateLiveFeed templateLive = kBoxItem.get(i);
                this.t = templateLive;
                if (templateLive != null) {
                   templateLive = templateLive.mQphoto;
                   if (templateLive != null) {
                      CommonMeta commonMeta = templateLive.getCommonMeta();
                      this.p = commonMeta;
                      commonMeta = (commonMeta != null)? commonMeta.mCaption: "";
                      this.s = commonMeta;
                   }
                }
                if (TextUtils.x(this.s)) {
                   j0.H(this.r, 8);
                }else {
                   this.r.setText(this.s);
                   j0.H(this.r, i);
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       j0.H(this.r, 8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a37b8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.q8(SearchItem.class);
       return;
    }
}
