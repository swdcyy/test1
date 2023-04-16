package m79.b;
import j79.e;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.util.ArrayList;
import q79.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import w69.f;
import r79.a;
import r79.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import m79.c;
import java.lang.Number;
import com.yxcorp.gifshow.album.selected.interact.a;
import com.yxcorp.gifshow.album.selected.interact.a$a;

public final class b implements e	// class@002e21
{
    public final MediaPreviewFragment b;

    public void b(MediaPreviewFragment p0){
       this.b = p0;
       super();
    }
    public void b(ArrayList p0){
       Pair pair;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          FragmentActivity activity = tb.getActivity();
          if (activity != null) {
             ViewModel viewModel = ViewModelProviders.of(activity).get(d.class);
             a.h(viewModel, "ViewModelProviders.of\(it¡­setViewModel::class.java\)");
             Objects.requireNonNull(viewModel);
             if (!PatchProxy.applyVoidOneRefs(p0, viewModel, d.class, "46") && p0 != null) {
                Iterator iterator = p0.iterator();
                while (iterator.hasNext()) {
                   MediaPreviewInfo mediaPreview = iterator.next();
                   if (!viewModel.c.d().b()) {
                      viewModel.l(mediaPreview.getMedia());
                      if (mediaPreview.getSelectIndex() >= 0) {
                         viewModel.h0(mediaPreview.getMedia());
                      }
                   }else if(mediaPreview.getSelectIndex() >= 0){
                      int i = -1;
                      if (PatchProxy.isSupport(d.class)) {
                         pair = PatchProxy.applyOneRefs(Integer.valueOf(i), viewModel, d.class, "57");
                         if (pair != PatchProxyResult.class) {
                         label_008a :
                            if (pair != null) {
                               a$a.a(viewModel, mediaPreview.getMedia(), pair.getFirst().intValue(), false, 4, null);
                            }
                         }
                      }
                      pair = viewModel.G.N(i);
                      goto label_008a ;
                   }
                }
             }
          }
       }
       return;
    }
}
