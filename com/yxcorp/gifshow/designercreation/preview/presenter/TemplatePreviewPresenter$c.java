package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import qvb.n0;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import java.util.List;
import qvb.a;
import yw6.j;
import yw6.g;
import com.yxcorp.gifshow.designercreation.logger.CreationReporter;
import k2b.e0;
import java.lang.CharSequence;
import android.widget.TextView;

public final class TemplatePreviewPresenter$c implements ViewPager$i	// class@001311
{
    public final TemplatePreviewPresenter b;

    public void TemplatePreviewPresenter$c(TemplatePreviewPresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       CharSequence text;
       TemplatePreviewPresenter$c uoc = TemplatePreviewPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.b;
       uoc.x = uoc.V8().getItem(p0);
       if (p0 < (this.b.V8().getItems().size() - 5) && this.b.R8().hasMore()) {
          this.b.R8().n();
       }
       CreationReporter b = CreationReporter.b;
       e0 uoe0 = this.b.S8();
       TemplatePreviewPresenter r = this.b.r;
       if (r != null) {
          text = r.getText();
          if (text != null) {
          label_0061 :
             b.c(uoe0, text);
             return;
          }
       }
       text = "";
       goto label_0061 ;
    }
}
