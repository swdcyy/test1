package a7a.f;
import erd.g;
import a7a.g;
import java.lang.Object;
import eda.p;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import moc.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Integer;
import de5.a;
import m9a.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public final class f implements g	// class@000053
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       View view;
       int i1;
       View view1;
       f b = this.b;
       p op = p0;
       Objects.requireNonNull(b);
       if ((op.b()).equals(b.r.getPhotoId()) && b.s.Vg().e()) {
          int i = b.p.getCurrentPosition() % b.r.getAtlasSizes().length;
          LinearLayoutManager layoutManage = b.p.getLayoutManager();
          Object[] objArray = null;
          if (layoutManage != null) {
             i = layoutManage.c();
             view = layoutManage.findViewByPosition(i);
             if (view != null) {
                i1 = i;
                view1 = view.findViewById(0x7f0a0330);
             }else {
                i1 = i;
                view1 = objArray;
             }
          }else {
             i1 = i;
             view = objArray;
             view1 = view;
          }
          b.w = b.d(b.v);
          Activity activity = b.getActivity();
          g r = b.r;
          int i2 = b.s.f();
          int i3 = b.s.getParentFragment().f();
          boolean b1 = op.c();
          g t = b.t;
          Object obj = b.u.get();
          Integer integer = Integer.valueOf(b.w);
          int i4 = (view != null)? view.getHeight(): 0;
          v.a(activity, r, i2, i3, i1, 0, 0, b1, t, obj, view1, integer, i4, b.q, b.p, false);
          if (!op.c() && !PatchProxy.applyVoidWithListener(objArray, b, g.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CLICK_TO_VIEW_ALL";
             ClientContent$AtlasPackage uAtlasPackag = new ClientContent$AtlasPackage();
             uAtlasPackag.type = 1;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.atlasPackage = uAtlasPackag;
             uContentPack.photoPackage = w1.f(b.r.mEntity);
             u1.u(1, uElementPack, uContentPack);
             PatchProxy.onMethodExit(g.class, "6");
          }
       }
    label_00e7 :
       return;
    }
}
