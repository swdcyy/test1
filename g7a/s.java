package g7a.s;
import n3d.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.CharSequence;
import android.text.TextUtils;
import g7a.s$a;
import uid.e$a;
import uid.e;
import ek9.m1;
import q87.c;
import com.yxcorp.gifshow.comment.utils.e;

public final class s implements a	// class@0023f9
{
    public final NasaCommentExternalEditorPresenter b;

    public void s(NasaCommentExternalEditorPresenter p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Object[] obj;
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, s.class, "1")) {
          return;
       }
       if (p0 == 1 && (p1 == -1 && p2 != null)) {
          Serializable serializable = j0.e(p2, "album_data_list");
          a.m(serializable);
          int i = 0;
          if (!q.f(serializable) && serializable.get(i) != null) {
             obj = serializable.get(i);
             a.m(obj);
             if (!TextUtils.isEmpty(obj.path)) {
                e.b(serializable.get(i), new s$a(this));
                return;
             }
          }
          obj = new Object[i];
          m1.C().w("NasaCommentExternalEditorPresenter", "commentPictures mediaList is null", obj);
          NasaCommentExternalEditorPresenter.P8(this.b).B();
       }
    label_0074 :
       return;
    }
}
