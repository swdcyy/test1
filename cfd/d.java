package cfd.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cfd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jfd.d;
import com.yxcorp.plugin.search.entity.SearchItem;
import u99.c;
import yed.d;

public class d extends PresenterV2	// class@00031c
{
    public BaseFragment p;
    public d q;
    public SearchItem r;
    public c s;
    public d t;
    public String u;
    public f v;
    public final g w;

    public void d(){
       super();
       this.w = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.v.set(this.w);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("SEARCH_PLAY_PHOTO_WRAPPER");
       this.r = this.q8(SearchItem.class);
       this.s = this.r8("PLAY_LEAVE_ACTION");
       this.t = this.r8("SEARCH_PLAY_LAZY_DATA");
       this.u = this.r8("SEARCH_PLAY_REFER_PAGE");
       this.v = this.x8("AUTO_PLAY_VIDEO_STAT_REPORTER");
       return;
    }
}
